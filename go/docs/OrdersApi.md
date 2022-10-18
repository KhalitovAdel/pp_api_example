# \OrdersApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListOrders**](OrdersApi.md#ListOrders) | **Get** /api-ext/v1.0/orders | 
[**ReadOrder**](OrdersApi.md#ReadOrder) | **Get** /api-ext/v1.0/orders/{orderNumber} | 



## ListOrders

> []OrderDto ListOrders(ctx).DeliveryCity(deliveryCity).DeliveryLineCountFrom(deliveryLineCountFrom).DeliveryLineCountTo(deliveryLineCountTo).DeliveryName(deliveryName).DocumentNumber(documentNumber).DvolumeFrom(dvolumeFrom).DvolumeTo(dvolumeTo).EndDate(endDate).ExcludeAttached(excludeAttached).IsCloseFilter(isCloseFilter).IsOpenFilter(isOpenFilter).StartDate(startDate).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    deliveryCity := "deliveryCity_example" // string | Stad (optional)
    deliveryLineCountFrom := float32(8.14) // float32 |  (optional)
    deliveryLineCountTo := float32(8.14) // float32 |  (optional)
    deliveryName := "deliveryName_example" // string | Mottagarnamn (optional)
    documentNumber := "documentNumber_example" // string | Dokumentnummer (optional)
    dvolumeFrom := float32(8.14) // float32 | Levererad volym från (optional)
    dvolumeTo := float32(8.14) // float32 | Levererad volym till (optional)
    endDate := "endDate_example" // string | Slutdatum (optional)
    excludeAttached := true // bool |  (optional)
    isCloseFilter := true // bool |  (optional)
    isOpenFilter := true // bool |  (optional)
    startDate := "startDate_example" // string | Startdatum (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.OrdersApi.ListOrders(context.Background()).DeliveryCity(deliveryCity).DeliveryLineCountFrom(deliveryLineCountFrom).DeliveryLineCountTo(deliveryLineCountTo).DeliveryName(deliveryName).DocumentNumber(documentNumber).DvolumeFrom(dvolumeFrom).DvolumeTo(dvolumeTo).EndDate(endDate).ExcludeAttached(excludeAttached).IsCloseFilter(isCloseFilter).IsOpenFilter(isOpenFilter).StartDate(startDate).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `OrdersApi.ListOrders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListOrders`: []OrderDto
    fmt.Fprintf(os.Stdout, "Response from `OrdersApi.ListOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiListOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryCity** | **string** | Stad | 
 **deliveryLineCountFrom** | **float32** |  | 
 **deliveryLineCountTo** | **float32** |  | 
 **deliveryName** | **string** | Mottagarnamn | 
 **documentNumber** | **string** | Dokumentnummer | 
 **dvolumeFrom** | **float32** | Levererad volym från | 
 **dvolumeTo** | **float32** | Levererad volym till | 
 **endDate** | **string** | Slutdatum | 
 **excludeAttached** | **bool** |  | 
 **isCloseFilter** | **bool** |  | 
 **isOpenFilter** | **bool** |  | 
 **startDate** | **string** | Startdatum | 

### Return type

[**[]OrderDto**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ReadOrder

> OrderDto ReadOrder(ctx, orderNumber).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderNumber := "orderNumber_example" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.OrdersApi.ReadOrder(context.Background(), orderNumber).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `OrdersApi.ReadOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ReadOrder`: OrderDto
    fmt.Fprintf(os.Stdout, "Response from `OrdersApi.ReadOrder`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderNumber** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiReadOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

