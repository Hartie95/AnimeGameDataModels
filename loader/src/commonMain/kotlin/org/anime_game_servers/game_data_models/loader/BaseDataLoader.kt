package org.anime_game_servers.game_data_models.loader

expect class DefaultDataLoader : BaseDataLoader{
    override fun onRegisterDataClassSources(dataClasses: List<DataClassInfo<*>>)
    override fun onUnregisterDataClassSources(dataClasses: List<DataClassInfo<*>>)
}

abstract class BaseDataLoader : DataLoader {
    private val parsers: MutableMap<FileType, DataParser> = mutableMapOf()
    private val paths: MutableMap<FolderType, MutableList<AGDMFile>> = mutableMapOf()
    private val knownDataClasses: MutableSet<DataClassInfo<*>> = mutableSetOf()

    override fun setParser(type: FileType, parser: DataParser) {
        require(parser.supportedTypes.contains(type)){
            "Parser does not support the given file type"
        }
        parsers[type] = parser
    }

    override fun addFolderTypeSource(folderType: FolderType, source: AGDMFile) {
        paths.getOrPut(folderType) { mutableListOf() }.add(source)
    }

    override fun registerDataClassSource(source: DataClassSource) {
        val sources = source.getDataClassInfo()
        knownDataClasses.addAll(sources)
        onRegisterDataClassSources(sources)
    }

    protected abstract fun onRegisterDataClassSources(dataClasses: List<DataClassInfo<*>>)

    override fun unregisterDataClassSource(source: DataClassSource) {
        val sources = source.getDataClassInfo()
        onUnregisterDataClassSources(sources)
        knownDataClasses.removeAll(sources.toSet())
    }

    protected abstract fun onUnregisterDataClassSources(dataClasses: List<DataClassInfo<*>>)

    override suspend fun <T> loadList(dataClassInfo: DataClassInfo<T>): List<T>? {
        return handlePath(dataClassInfo) { dataClassInfo, parser, path ->
            return@handlePath parser.parseList(dataClassInfo, path)
        }
    }

    override suspend fun <T, K> loadMap(dataClassInfo: DataClassInfo<T>): Map<K, T>? {
        return handlePath(dataClassInfo) { dataClassInfo, parser, path ->
            return@handlePath parser.parseMap(dataClassInfo, path)
        }
    }

    override suspend fun <T> loadModel(dataClassInfo: DataClassInfo<T>): T? {
        return handlePath(dataClassInfo) { dataClassInfo, parser, path ->
            return@handlePath parser.parseModel(dataClassInfo, path)
        }
    }

    suspend fun <X,T> handlePath(dataClassInfo: DataClassInfo<X>, parsingHandler: suspend (DataClassInfo<X>, DataParser, AGDMFile)-> T?) :T?{
        dataClassInfo.fileInfos.forEach { fileInfo ->
            val parser = parsers[fileInfo.fileType] ?: return@forEach
            val paths = paths[fileInfo.folderType] ?: return@forEach
            paths.forEach paths@{ path ->
                val file = path.getFile(fileInfo.filePath)
                //TODO add handling for wildcards in file paths and folders
                if(!file.exists() || !file.isFile()) return@paths
                return parsingHandler(dataClassInfo, parser, file)
            }
        }
        return null
    }
}