# OrdersApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOrders**](OrdersApi.md#listOrders) | **GET** /api-ext/v1.0/orders | 
[**readOrder**](OrdersApi.md#readOrder) | **GET** /api-ext/v1.0/orders/{orderNumber} | 



## listOrders

> List&lt;OrderDto&gt; listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate)



### Example

```java
// Import classes:
//import org.openapitools.client.api.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String deliveryCity = null; // String | Stad
BigDecimal deliveryLineCountFrom = null; // BigDecimal | 
BigDecimal deliveryLineCountTo = null; // BigDecimal | 
String deliveryName = null; // String | Mottagarnamn
String documentNumber = null; // String | Dokumentnummer
BigDecimal dvolumeFrom = null; // BigDecimal | Levererad volym från
BigDecimal dvolumeTo = null; // BigDecimal | Levererad volym till
String endDate = null; // String | Slutdatum
Boolean excludeAttached = null; // Boolean | 
Boolean isCloseFilter = null; // Boolean | 
Boolean isOpenFilter = null; // Boolean | 
String startDate = null; // String | Startdatum
try {
    List<OrderDto> result = apiInstance.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#listOrders");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryCity** | **String**| Stad | [optional] [default to null]
 **deliveryLineCountFrom** | **BigDecimal**|  | [optional] [default to null]
 **deliveryLineCountTo** | **BigDecimal**|  | [optional] [default to null]
 **deliveryName** | **String**| Mottagarnamn | [optional] [default to null]
 **documentNumber** | **String**| Dokumentnummer | [optional] [default to null]
 **dvolumeFrom** | **BigDecimal**| Levererad volym från | [optional] [default to null]
 **dvolumeTo** | **BigDecimal**| Levererad volym till | [optional] [default to null]
 **endDate** | **String**| Slutdatum | [optional] [default to null]
 **excludeAttached** | **Boolean**|  | [optional] [default to null]
 **isCloseFilter** | **Boolean**|  | [optional] [default to null]
 **isOpenFilter** | **Boolean**|  | [optional] [default to null]
 **startDate** | **String**| Startdatum | [optional] [default to null]

### Return type

[**List&lt;OrderDto&gt;**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## readOrder

> OrderDto readOrder(orderNumber)



### Example

```java
// Import classes:
//import org.openapitools.client.api.OrdersApi;

OrdersApi apiInstance = new OrdersApi();
String orderNumber = null; // String | 
try {
    OrderDto result = apiInstance.readOrder(orderNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersApi#readOrder");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderNumber** | **String**|  | [default to null]

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

