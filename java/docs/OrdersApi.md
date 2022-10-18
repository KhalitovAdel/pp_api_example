# OrdersApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listOrders**](OrdersApi.md#listOrders) | **GET** /api-ext/v1.0/orders |  |
| [**readOrder**](OrdersApi.md#readOrder) | **GET** /api-ext/v1.0/orders/{orderNumber} |  |


<a name="listOrders"></a>
# **listOrders**
> List&lt;OrderDto&gt; listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String deliveryCity = "deliveryCity_example"; // String | Stad
    BigDecimal deliveryLineCountFrom = new BigDecimal(78); // BigDecimal | 
    BigDecimal deliveryLineCountTo = new BigDecimal(78); // BigDecimal | 
    String deliveryName = "deliveryName_example"; // String | Mottagarnamn
    String documentNumber = "documentNumber_example"; // String | Dokumentnummer
    BigDecimal dvolumeFrom = new BigDecimal(78); // BigDecimal | Levererad volym från
    BigDecimal dvolumeTo = new BigDecimal(78); // BigDecimal | Levererad volym till
    String endDate = "endDate_example"; // String | Slutdatum
    Boolean excludeAttached = true; // Boolean | 
    Boolean isCloseFilter = true; // Boolean | 
    Boolean isOpenFilter = true; // Boolean | 
    String startDate = "startDate_example"; // String | Startdatum
    try {
      List<OrderDto> result = apiInstance.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deliveryCity** | **String**| Stad | [optional] |
| **deliveryLineCountFrom** | **BigDecimal**|  | [optional] |
| **deliveryLineCountTo** | **BigDecimal**|  | [optional] |
| **deliveryName** | **String**| Mottagarnamn | [optional] |
| **documentNumber** | **String**| Dokumentnummer | [optional] |
| **dvolumeFrom** | **BigDecimal**| Levererad volym från | [optional] |
| **dvolumeTo** | **BigDecimal**| Levererad volym till | [optional] |
| **endDate** | **String**| Slutdatum | [optional] |
| **excludeAttached** | **Boolean**|  | [optional] |
| **isCloseFilter** | **Boolean**|  | [optional] |
| **isOpenFilter** | **Boolean**|  | [optional] |
| **startDate** | **String**| Startdatum | [optional] |

### Return type

[**List&lt;OrderDto&gt;**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

<a name="readOrder"></a>
# **readOrder**
> OrderDto readOrder(orderNumber)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderNumber = "orderNumber_example"; // String | 
    try {
      OrderDto result = apiInstance.readOrder(orderNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#readOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderNumber** | **String**|  | |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **500** |  |  -  |

