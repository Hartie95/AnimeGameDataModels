package org.anime_game_servers.game_data_models.loader

import kotlinx.serialization.Contextual
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.StructureKind
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonNames
import kotlinx.serialization.json.JsonNamingStrategy
import kotlinx.serialization.modules.SerializersModule

@OptIn(ExperimentalSerializationApi::class)
class JsonBuilder
@JvmOverloads constructor( json: Json = Json.Default){
    /**
     * Specifies whether default values of Kotlin properties should be encoded.
     * `false` by default.
     */
    fun encodeDefaults(encodeDefaults: Boolean) = apply {
        this.encodeDefaults = encodeDefaults
    }
    private var encodeDefaults: Boolean

    /**
     * Specifies whether `null` values should be encoded for nullable properties and must be present in JSON object
     * during decoding.
     *
     * When this flag is disabled properties with `null` values without default are not encoded;
     * during decoding, the absence of a field value is treated as `null` for nullable properties without a default value.
     *
     * `true` by default.
     */
    fun explicitNulls(explicitNulls: Boolean) = apply {
        this.explicitNulls = explicitNulls
    }
    @ExperimentalSerializationApi
    private var explicitNulls: Boolean

    /**
     * Specifies whether encounters of unknown properties in the input JSON
     * should be ignored instead of throwing [SerializationException].
     * `false` by default.
     */
    fun ignoreUnknownKeys(ignoreUnknownKeys: Boolean) = apply {
        this.ignoreUnknownKeys = ignoreUnknownKeys
    }
    private var ignoreUnknownKeys: Boolean

    /**
     * Removes JSON specification restriction (RFC-4627) and makes parser
     * more liberal to the malformed input. In lenient mode quoted boolean literals,
     * and unquoted string literals are allowed.
     *
     * Its relaxations can be expanded in the future, so that lenient parser becomes even more
     * permissive to invalid value in the input, replacing them with defaults.
     *
     * `false` by default.
     */
    fun isLenient(isLenient: Boolean) = apply {
        this.isLenient = isLenient
    }
    private var isLenient: Boolean

    /**
     * Enables structured objects to be serialized as map keys by
     * changing serialized form of the map from JSON object (key-value pairs) to flat array like `[k1, v1, k2, v2]`.
     * `false` by default.
     */
    fun allowStructuredMapKeys(allowStructuredMapKeys: Boolean) = apply {
        this.allowStructuredMapKeys = allowStructuredMapKeys
    }
    private var allowStructuredMapKeys: Boolean

    /**
     * Specifies whether resulting JSON should be pretty-printed.
     *  `false` by default.
     */
    fun prettyPrint(prettyPrint: Boolean) = apply {
        this.prettyPrint = prettyPrint
    }
    private var prettyPrint: Boolean

    /**
     * Specifies indent string to use with [prettyPrint] mode
     * 4 spaces by default.
     * Experimentality note: this API is experimental because
     * it is not clear whether this option has compelling use-cases.
     */
    fun prettyPrintIndent(prettyPrintIndent: String) = apply {
        this.prettyPrintIndent = prettyPrintIndent
    }
    @ExperimentalSerializationApi
    private var prettyPrintIndent: String

    /**
     * Enables coercing incorrect JSON values to the default property value in the following cases:
     *   1. JSON value is `null` but property type is non-nullable.
     *   2. Property type is an enum type, but JSON value contains unknown enum member.
     *
     * `false` by default.
     */
    fun coerceInputValues(coerceInputValues: Boolean) = apply {
        this.coerceInputValues = coerceInputValues
    }
    private var coerceInputValues: Boolean

    /**
     * Switches polymorphic serialization to the default array format.
     * This is an option for legacy JSON format and should not be generally used.
     * `false` by default.
     */
    fun useArrayPolymorphism(useArrayPolymorphism: Boolean) = apply {
        this.useArrayPolymorphism = useArrayPolymorphism
    }
    private var useArrayPolymorphism: Boolean

    /**
     * Name of the class descriptor property for polymorphic serialization.
     * "type" by default.
     */
    fun classDiscriminator(classDiscriminator: String) = apply {
        this.classDiscriminator = classDiscriminator
    }
    private var classDiscriminator: String

    /**
     * Removes JSON specification restriction on
     * special floating-point values such as `NaN` and `Infinity` and enables their serialization and deserialization.
     * When enabling it, please ensure that the receiving party will be able to encode and decode these special values.
     * `false` by default.
     */
    fun allowSpecialFloatingPointValues(allowSpecialFloatingPointValues: Boolean) = apply {
        this.allowSpecialFloatingPointValues = allowSpecialFloatingPointValues
    }
    private var allowSpecialFloatingPointValues: Boolean

    /**
     * Specifies whether Json instance makes use of [JsonNames] annotation.
     *
     * Disabling this flag when one does not use [JsonNames] at all may sometimes result in better performance,
     * particularly when a large count of fields is skipped with [ignoreUnknownKeys].
     * `true` by default.
     */
    fun useAlternativeNames(useAlternativeNames: Boolean) = apply {
        this.useAlternativeNames = useAlternativeNames
    }
    private var useAlternativeNames: Boolean

    /**
     * Specifies [JsonNamingStrategy] that should be used for all properties in classes for serialization and deserialization.
     *
     * `null` by default.
     *
     * This strategy is applied for all entities that have [StructureKind.CLASS].
     */
    fun namingStrategy(namingStrategy: JsonNamingStrategy?) = apply {
        this.namingStrategy = namingStrategy
    }
    @ExperimentalSerializationApi
    private var namingStrategy: JsonNamingStrategy?

    /**
     * Module with contextual and polymorphic serializers to be used in the resulting [Json] instance.
     *
     * @see SerializersModule
     * @see Contextual
     * @see Polymorphic
     */
    fun serializersModule(serializersModule: SerializersModule) = apply {
        this.serializersModule = serializersModule
    }
    private var serializersModule: SerializersModule

    init {
        encodeDefaults = json.configuration.encodeDefaults
        explicitNulls = json.configuration.explicitNulls
        ignoreUnknownKeys = json.configuration.ignoreUnknownKeys
        isLenient = json.configuration.isLenient
        allowStructuredMapKeys = json.configuration.allowStructuredMapKeys
        prettyPrint = json.configuration.prettyPrint
        prettyPrintIndent = json.configuration.prettyPrintIndent
        coerceInputValues = json.configuration.coerceInputValues
        useArrayPolymorphism = json.configuration.useArrayPolymorphism
        classDiscriminator = json.configuration.classDiscriminator
        allowSpecialFloatingPointValues = json.configuration.allowSpecialFloatingPointValues
        useAlternativeNames = json.configuration.useAlternativeNames
        namingStrategy = json.configuration.namingStrategy
        serializersModule = json.serializersModule
    }

    fun build(): Json {
        return Json {
            encodeDefaults = this@JsonBuilder.encodeDefaults
            explicitNulls = this@JsonBuilder.explicitNulls
            ignoreUnknownKeys = this@JsonBuilder.ignoreUnknownKeys
            isLenient = this@JsonBuilder.isLenient
            allowStructuredMapKeys = this@JsonBuilder.allowStructuredMapKeys
            prettyPrint = this@JsonBuilder.prettyPrint
            prettyPrintIndent = this@JsonBuilder.prettyPrintIndent
            coerceInputValues = this@JsonBuilder.coerceInputValues
            useArrayPolymorphism = this@JsonBuilder.useArrayPolymorphism
            classDiscriminator = this@JsonBuilder.classDiscriminator
            allowSpecialFloatingPointValues = this@JsonBuilder.allowSpecialFloatingPointValues
            useAlternativeNames = this@JsonBuilder.useAlternativeNames
            namingStrategy = this@JsonBuilder.namingStrategy
            serializersModule = this@JsonBuilder.serializersModule
        }
    }
}