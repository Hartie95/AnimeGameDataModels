package org.anime_game_servers.game_data_models.processor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.ksp.kspDependencies
import com.squareup.kotlinpoet.ksp.toClassName
import kotlinx.serialization.KSerializer
import org.anime_game_servers.game_data_models.loader.*
import org.anime_game_servers.game_data_models.processor.DataProcessor.DataClassInfoMetadata

object MetaDataRegistryGenerator {
    val handleModules = mutableSetOf<String>()
    fun createFileForMetaDataRegistry(metaDataList: List<DataClassInfoMetadata>, basePacket: String, module:String, codeGenerator: CodeGenerator){
        // Only generate the file once per module
        if(handleModules.contains(basePacket+module)){
            return
        }
        val fileSpec = generateClassForMetaData(metaDataList, basePacket, module)
        fileSpec.kspDependencies(false)
        val dependendFiles = metaDataList.map { it.ksClass.containingFile }.filterNotNull().toTypedArray()
        codeGenerator.createNewFile(
            // Make sure to associate the generated file with sources to keep/maintain it across incremental builds.
            // Learn more about incremental processing in KSP from the official docs:
            // https://kotlinlang.org/docs/ksp-incremental.html
            dependencies = Dependencies(true, *dependendFiles),
            packageName = basePacket,
            fileName = fileSpec.name
        )
            .writer()
            .use {
                fileSpec.writeTo(it)
            }
        handleModules.add(basePacket+module)
    }

    fun generateClassForMetaData(metaDataList: List<DataClassInfoMetadata>, basePacket: String, module:String) : FileSpec {
        val className = ClassName(basePacket, "${module}ModelRegistry")

        val type = TypeSpec.objectBuilder(className)
            .addSuperinterface(DataClassSource::class.asClassName())
            .addProperty(
                PropertySpec.builder("knownModels", List::class.asClassName()
                    .parameterizedBy(DataClassInfo::class.asClassName()
                        .parameterizedBy(STAR)),
                    KModifier.PRIVATE)
                .build())
            .addFunction(FunSpec.builder("getDataClassInfo")
                .addModifiers(KModifier.OVERRIDE)
                .returns(List::class.asClassName()
                    .parameterizedBy(DataClassInfo::class.asClassName()
                        .parameterizedBy(STAR)))
                .addStatement("return knownModels")
                .build())
            .addInitializerBlock(CodeBlock.builder().apply {
                addStatement("val modelList = mutableListOf(")
                indent()
                metaDataList.forEach {
                    addStatement(
                        "%T,",
                        ClassName(it.packageName, it.getLoaderName()),
                    )
                }
                unindent()
                addStatement(")")
                addStatement("knownModels = modelList")
            }.build())
            .build()

        val file = FileSpec.builder(className).apply {
            indent("    ")
            addImport(DataFile::class, "")
            addImport(FileType::class, "")
            addImport(FolderType::class, "")
            addType(type)
        }.build()

        return file
    }
}