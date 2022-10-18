# OpenAPI\Client\OrdersApi

All URIs are relative to http://localhost:3000, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**listOrders()**](OrdersApi.md#listOrders) | **GET** /api-ext/v1.0/orders |  |
| [**readOrder()**](OrdersApi.md#readOrder) | **GET** /api-ext/v1.0/orders/{orderNumber} |  |


## `listOrders()`

```php
listOrders($delivery_city, $delivery_line_count_from, $delivery_line_count_to, $delivery_name, $document_number, $dvolume_from, $dvolume_to, $end_date, $exclude_attached, $is_close_filter, $is_open_filter, $start_date): \OpenAPI\Client\Model\OrderDto[]
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer (JWT) authorization: bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OrdersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$delivery_city = 'delivery_city_example'; // string | Stad
$delivery_line_count_from = 3.4; // float
$delivery_line_count_to = 3.4; // float
$delivery_name = 'delivery_name_example'; // string | Mottagarnamn
$document_number = 'document_number_example'; // string | Dokumentnummer
$dvolume_from = 3.4; // float | Levererad volym från
$dvolume_to = 3.4; // float | Levererad volym till
$end_date = 'end_date_example'; // string | Slutdatum
$exclude_attached = True; // bool
$is_close_filter = True; // bool
$is_open_filter = True; // bool
$start_date = 'start_date_example'; // string | Startdatum

try {
    $result = $apiInstance->listOrders($delivery_city, $delivery_line_count_from, $delivery_line_count_to, $delivery_name, $document_number, $dvolume_from, $dvolume_to, $end_date, $exclude_attached, $is_close_filter, $is_open_filter, $start_date);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrdersApi->listOrders: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delivery_city** | **string**| Stad | [optional] |
| **delivery_line_count_from** | **float**|  | [optional] |
| **delivery_line_count_to** | **float**|  | [optional] |
| **delivery_name** | **string**| Mottagarnamn | [optional] |
| **document_number** | **string**| Dokumentnummer | [optional] |
| **dvolume_from** | **float**| Levererad volym från | [optional] |
| **dvolume_to** | **float**| Levererad volym till | [optional] |
| **end_date** | **string**| Slutdatum | [optional] |
| **exclude_attached** | **bool**|  | [optional] |
| **is_close_filter** | **bool**|  | [optional] |
| **is_open_filter** | **bool**|  | [optional] |
| **start_date** | **string**| Startdatum | [optional] |

### Return type

[**\OpenAPI\Client\Model\OrderDto[]**](../Model/OrderDto.md)

### Authorization

[bearer](../../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `readOrder()`

```php
readOrder($order_number): \OpenAPI\Client\Model\OrderDto
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer (JWT) authorization: bearer
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\OrdersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_number = 'order_number_example'; // string

try {
    $result = $apiInstance->readOrder($order_number);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling OrdersApi->readOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **order_number** | **string**|  | |

### Return type

[**\OpenAPI\Client\Model\OrderDto**](../Model/OrderDto.md)

### Authorization

[bearer](../../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
