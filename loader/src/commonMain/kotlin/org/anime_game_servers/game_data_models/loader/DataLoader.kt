package org.anime_game_servers.game_data_models.loader

import korlibs.io.file.Vfs
import kotlinx.serialization.KSerializer

abstract class DataLoader() {

    /*abstract fun <T> loadFolderObjectsMap(path: Path, deserializer: KSerializer<T>): Map<String, T>
    abstract fun <T> loadFolderObjectList(path: Path, deserializer: KSerializer<T>): List<T>*/

    /*fun <T> loadFolderObjectsMap(path: String, deserializer: KSerializer<T>): Map<String, T> =
        loadFolderObjectsMap(path.toPath(), deserializer)*/

    //fun <T> loadFolderObjectList(path: String, deserializer: KSerializer<T>): List<T> = loadFolderObjectList(path.toPath(), deserializer)


    /*abstract fun <T> loadFileObject(path: Path, deserializer: KSerializer<T>): T
    abstract fun <T> loadFileList(path: Path, deserializer: KSerializer<T>): List<T>*/

    //fun <T> loadFileObject(path: String, deserializer: KSerializer<T>): T = loadFileObject(path.toPath(), deserializer)
    //fun <T> loadFileList(path: String, deserializer: KSerializer<T>): List<T> = loadFileList(path.toPath(), deserializer)

    companion object {
        /*fun openFS(path: String): Vfs{

        }*/
    }
}