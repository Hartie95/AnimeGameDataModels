package org.anime_game_servers.game_data_models.loader

@Repeatable
annotation class DataFile(val filePath: String, val fileType: FileType, val folderType : FolderType)
