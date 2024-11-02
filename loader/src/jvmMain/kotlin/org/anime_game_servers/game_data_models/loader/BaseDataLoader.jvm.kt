package org.anime_game_servers.game_data_models.loader

import kotlinx.coroutines.runBlocking


actual class DefaultDataLoader : BaseDataLoader() {
    var classInfoMapping: MutableMap<Class<*>, DataClassInfo<*>> = mutableMapOf()
    actual override fun onRegisterDataClassSources(dataClasses: List<DataClassInfo<*>>) {
        dataClasses.forEach {
            classInfoMapping[it.kClass.java] = it
        }
    }

    actual override fun onUnregisterDataClassSources(dataClasses: List<DataClassInfo<*>>) {
        dataClasses.forEach {
            classInfoMapping.remove(it.kClass::class.java)
        }
    }


    fun <T> loadListBlocking(dataClassInfo: DataClassInfo<T>): List<T>? {
        return runBlocking {
            loadList(dataClassInfo)
        }
    }
    fun <T> loadListBlocking(classTarget: Class<T>): List<T>? {
        return runBlocking {
            loadList(classTarget)
        }
    }

    fun <T, K> loadMapBlocking(dataClassInfo: DataClassInfo<T>): Map<K, T>? {
        return runBlocking {
            loadMap(dataClassInfo)
        }
    }
    fun <T, K> loadMapBlocking(classTarget: Class<T>): Map<K, T>? {
        return runBlocking {
            loadMap(classTarget)
        }
    }

    fun <T> loadModelBlocking(dataClassInfo: DataClassInfo<T>): T? {
        return runBlocking {
            loadModel(dataClassInfo)
        }
    }
    fun <T> loadModelBlocking(classTarget: Class<T>): T? {
        return runBlocking {
            loadModel(classTarget)
        }
    }


    suspend fun <T> loadList(classTarget: Class<T>): List<T>? {
        val dataClassInfo = classInfoMapping[classTarget] as? DataClassInfo<T> ?: return null
        return loadList(dataClassInfo)
    }
    suspend fun <T, K> loadMap(classTarget: Class<T>): Map<K, T>? {
        val dataClassInfo = classInfoMapping[classTarget] as? DataClassInfo<T> ?: return null
        return loadMap(dataClassInfo)
    }
    suspend fun <T> loadModel(classTarget: Class<T>): T? {
        val dataClassInfo = classInfoMapping[classTarget] as? DataClassInfo<T> ?: return null
        return loadModel(dataClassInfo)
    }
}