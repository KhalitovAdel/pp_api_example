# Org.OpenAPITools.Api.OrdersApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ListOrders**](OrdersApi.md#listorders) | **GET** /api-ext/v1.0/orders |  |
| [**ReadOrder**](OrdersApi.md#readorder) | **GET** /api-ext/v1.0/orders/{orderNumber} |  |

<a name="listorders"></a>
# **ListOrders**
> List&lt;OrderDto&gt; ListOrders (string deliveryCity = null, decimal? deliveryLineCountFrom = null, decimal? deliveryLineCountTo = null, string deliveryName = null, string documentNumber = null, decimal? dvolumeFrom = null, decimal? dvolumeTo = null, string endDate = null, bool? excludeAttached = null, bool? isCloseFilter = null, bool? isOpenFilter = null, string startDate = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ListOrdersExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:3000";
            // Configure Bearer token for authorization: bearer
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new OrdersApi(config);
            var deliveryCity = "deliveryCity_example";  // string | Stad (optional) 
            var deliveryLineCountFrom = 8.14D;  // decimal? |  (optional) 
            var deliveryLineCountTo = 8.14D;  // decimal? |  (optional) 
            var deliveryName = "deliveryName_example";  // string | Mottagarnamn (optional) 
            var documentNumber = "documentNumber_example";  // string | Dokumentnummer (optional) 
            var dvolumeFrom = 8.14D;  // decimal? | Levererad volym från (optional) 
            var dvolumeTo = 8.14D;  // decimal? | Levererad volym till (optional) 
            var endDate = "endDate_example";  // string | Slutdatum (optional) 
            var excludeAttached = true;  // bool? |  (optional) 
            var isCloseFilter = true;  // bool? |  (optional) 
            var isOpenFilter = true;  // bool? |  (optional) 
            var startDate = "startDate_example";  // string | Startdatum (optional) 

            try
            {
                List<OrderDto> result = apiInstance.ListOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OrdersApi.ListOrders: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListOrdersWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<List<OrderDto>> response = apiInstance.ListOrdersWithHttpInfo(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OrdersApi.ListOrdersWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **deliveryCity** | **string** | Stad | [optional]  |
| **deliveryLineCountFrom** | **decimal?** |  | [optional]  |
| **deliveryLineCountTo** | **decimal?** |  | [optional]  |
| **deliveryName** | **string** | Mottagarnamn | [optional]  |
| **documentNumber** | **string** | Dokumentnummer | [optional]  |
| **dvolumeFrom** | **decimal?** | Levererad volym från | [optional]  |
| **dvolumeTo** | **decimal?** | Levererad volym till | [optional]  |
| **endDate** | **string** | Slutdatum | [optional]  |
| **excludeAttached** | **bool?** |  | [optional]  |
| **isCloseFilter** | **bool?** |  | [optional]  |
| **isOpenFilter** | **bool?** |  | [optional]  |
| **startDate** | **string** | Startdatum | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="readorder"></a>
# **ReadOrder**
> OrderDto ReadOrder (string orderNumber)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ReadOrderExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:3000";
            // Configure Bearer token for authorization: bearer
            config.AccessToken = "YOUR_BEARER_TOKEN";

            var apiInstance = new OrdersApi(config);
            var orderNumber = "orderNumber_example";  // string | 

            try
            {
                OrderDto result = apiInstance.ReadOrder(orderNumber);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling OrdersApi.ReadOrder: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReadOrderWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    ApiResponse<OrderDto> response = apiInstance.ReadOrderWithHttpInfo(orderNumber);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling OrdersApi.ReadOrderWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **orderNumber** | **string** |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

