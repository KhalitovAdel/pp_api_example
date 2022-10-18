# OpenapiClient::OrdersApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**list_orders**](OrdersApi.md#list_orders) | **GET** /api-ext/v1.0/orders |  |
| [**read_order**](OrdersApi.md#read_order) | **GET** /api-ext/v1.0/orders/{orderNumber} |  |


## list_orders

> <Array<OrderDto>> list_orders(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure Bearer authorization (JWT): bearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenapiClient::OrdersApi.new
opts = {
  delivery_city: 'delivery_city_example', # String | Stad
  delivery_line_count_from: 8.14, # Float | 
  delivery_line_count_to: 8.14, # Float | 
  delivery_name: 'delivery_name_example', # String | Mottagarnamn
  document_number: 'document_number_example', # String | Dokumentnummer
  dvolume_from: 8.14, # Float | Levererad volym från
  dvolume_to: 8.14, # Float | Levererad volym till
  end_date: 'end_date_example', # String | Slutdatum
  exclude_attached: true, # Boolean | 
  is_close_filter: true, # Boolean | 
  is_open_filter: true, # Boolean | 
  start_date: 'start_date_example' # String | Startdatum
}

begin
  # 
  result = api_instance.list_orders(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrdersApi->list_orders: #{e}"
end
```

#### Using the list_orders_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<OrderDto>>, Integer, Hash)> list_orders_with_http_info(opts)

```ruby
begin
  # 
  data, status_code, headers = api_instance.list_orders_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<OrderDto>>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrdersApi->list_orders_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **delivery_city** | **String** | Stad | [optional] |
| **delivery_line_count_from** | **Float** |  | [optional] |
| **delivery_line_count_to** | **Float** |  | [optional] |
| **delivery_name** | **String** | Mottagarnamn | [optional] |
| **document_number** | **String** | Dokumentnummer | [optional] |
| **dvolume_from** | **Float** | Levererad volym från | [optional] |
| **dvolume_to** | **Float** | Levererad volym till | [optional] |
| **end_date** | **String** | Slutdatum | [optional] |
| **exclude_attached** | **Boolean** |  | [optional] |
| **is_close_filter** | **Boolean** |  | [optional] |
| **is_open_filter** | **Boolean** |  | [optional] |
| **start_date** | **String** | Startdatum | [optional] |

### Return type

[**Array&lt;OrderDto&gt;**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## read_order

> <OrderDto> read_order(order_number)



### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure Bearer authorization (JWT): bearer
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = OpenapiClient::OrdersApi.new
order_number = 'order_number_example' # String | 

begin
  # 
  result = api_instance.read_order(order_number)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrdersApi->read_order: #{e}"
end
```

#### Using the read_order_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<OrderDto>, Integer, Hash)> read_order_with_http_info(order_number)

```ruby
begin
  # 
  data, status_code, headers = api_instance.read_order_with_http_info(order_number)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <OrderDto>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrdersApi->read_order_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_number** | **String** |  |  |

### Return type

[**OrderDto**](OrderDto.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

