# OrdersApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOrders**](OrdersApi.md#listOrders) | **GET** /api-ext/v1.0/orders | 
[**readOrder**](OrdersApi.md#readOrder) | **GET** /api-ext/v1.0/orders/{orderNumber} | 


<a name="listOrders"></a>
# **listOrders**
> kotlin.collections.List&lt;OrderDto&gt; listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val deliveryCity : kotlin.String = deliveryCity_example // kotlin.String | Stad
val deliveryLineCountFrom : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val deliveryLineCountTo : java.math.BigDecimal = 8.14 // java.math.BigDecimal | 
val deliveryName : kotlin.String = deliveryName_example // kotlin.String | Mottagarnamn
val documentNumber : kotlin.String = documentNumber_example // kotlin.String | Dokumentnummer
val dvolumeFrom : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Levererad volym från
val dvolumeTo : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Levererad volym till
val endDate : kotlin.String = endDate_example // kotlin.String | Slutdatum
val excludeAttached : kotlin.Boolean = true // kotlin.Boolean | 
val isCloseFilter : kotlin.Boolean = true // kotlin.Boolean | 
val isOpenFilter : kotlin.Boolean = true // kotlin.Boolean | 
val startDate : kotlin.String = startDate_example // kotlin.String | Startdatum
try {
    val result : kotlin.collections.List<OrderDto> = apiInstance.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#listOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#listOrders")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryCity** | **kotlin.String**| Stad | [optional]
 **deliveryLineCountFrom** | **java.math.BigDecimal**|  | [optional]
 **deliveryLineCountTo** | **java.math.BigDecimal**|  | [optional]
 **deliveryName** | **kotlin.String**| Mottagarnamn | [optional]
 **documentNumber** | **kotlin.String**| Dokumentnummer | [optional]
 **dvolumeFrom** | **java.math.BigDecimal**| Levererad volym från | [optional]
 **dvolumeTo** | **java.math.BigDecimal**| Levererad volym till | [optional]
 **endDate** | **kotlin.String**| Slutdatum | [optional]
 **excludeAttached** | **kotlin.Boolean**|  | [optional]
 **isCloseFilter** | **kotlin.Boolean**|  | [optional]
 **isOpenFilter** | **kotlin.Boolean**|  | [optional]
 **startDate** | **kotlin.String**| Startdatum | [optional]

### Return type

[**kotlin.collections.List&lt;OrderDto&gt;**](OrderDto.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readOrder"></a>
# **readOrder**
> OrderDto readOrder(orderNumber)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderNumber : kotlin.String = orderNumber_example // kotlin.String | 
try {
    val result : OrderDto = apiInstance.readOrder(orderNumber)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#readOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#readOrder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **kotlin.String**|  |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization


Configure bearer:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

