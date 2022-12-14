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
 * @param city Stad
 * @param country Land
 * @param postalCode Postnummer
 * @param addressLine1 Adressrad #1
 * @param addressLine2 Adressrad #2
 */

data class DeliveryAddressDto (

    /* Stad */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* Land */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* Postnummer */
    @Json(name = "postalCode")
    val postalCode: kotlin.String? = null,

    /* Adressrad #1 */
    @Json(name = "addressLine1")
    val addressLine1: kotlin.String? = null,

    /* Adressrad #2 */
    @Json(name = "addressLine2")
    val addressLine2: kotlin.String? = null

)

