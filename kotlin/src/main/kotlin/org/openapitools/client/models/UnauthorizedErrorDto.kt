/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param message 
 * @param timestamp Returns a date as a string value in ISO format.
 * @param statusCode 
 * @param code 
 */

data class UnauthorizedErrorDto (

    @Json(name = "message")
    val message: kotlin.String,

    /* Returns a date as a string value in ISO format. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String,

    @Json(name = "statusCode")
    val statusCode: UnauthorizedErrorDto.StatusCode,

    @Json(name = "code")
    val code: UnauthorizedErrorDto.Code

) {

    /**
     * 
     *
     * Values: _401
     */
    enum class StatusCode(val value: java.math.BigDecimal) {
        @Json(name = ""401"") _401("401");
    }
    /**
     * 
     *
     * Values: nOTAUTHORIZED
     */
    enum class Code(val value: kotlin.String) {
        @Json(name = "NOT_AUTHORIZED") nOTAUTHORIZED("NOT_AUTHORIZED");
    }
}

