<a name="__pageTop"></a>
# openapi_client.apis.tags.orders_api.OrdersApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**list_orders**](#list_orders) | **get** /api-ext/v1.0/orders | 
[**read_order**](#read_order) | **get** /api-ext/v1.0/orders/{orderNumber} | 

# **list_orders**
<a name="list_orders"></a>
> [OrderDto] list_orders()



### Example

* Bearer (JWT) Authentication (bearer):
```python
import openapi_client
from openapi_client.apis.tags import orders_api
from openapi_client.model.order_dto import OrderDto
from openapi_client.model.validation_error_dto import ValidationErrorDto
from openapi_client.model.unauthorized_error_dto import UnauthorizedErrorDto
from openapi_client.model.error_dto import ErrorDto
from openapi_client.model.server_error_dto import ServerErrorDto
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:3000
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost:3000"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): bearer
configuration = openapi_client.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = orders_api.OrdersApi(api_client)

    # example passing only optional values
    query_params = {
        'deliveryCity': "deliveryCity_example",
        'deliveryLineCountFrom': 3.14,
        'deliveryLineCountTo': 3.14,
        'deliveryName': "deliveryName_example",
        'documentNumber': "documentNumber_example",
        'dvolumeFrom': 3.14,
        'dvolumeTo': 3.14,
        'endDate': "endDate_example",
        'excludeAttached': True,
        'isCloseFilter': True,
        'isOpenFilter': True,
        'startDate': "startDate_example",
    }
    try:
        api_response = api_instance.list_orders(
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling OrdersApi->list_orders: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
deliveryCity | DeliveryCitySchema | | optional
deliveryLineCountFrom | DeliveryLineCountFromSchema | | optional
deliveryLineCountTo | DeliveryLineCountToSchema | | optional
deliveryName | DeliveryNameSchema | | optional
documentNumber | DocumentNumberSchema | | optional
dvolumeFrom | DvolumeFromSchema | | optional
dvolumeTo | DvolumeToSchema | | optional
endDate | EndDateSchema | | optional
excludeAttached | ExcludeAttachedSchema | | optional
isCloseFilter | IsCloseFilterSchema | | optional
isOpenFilter | IsOpenFilterSchema | | optional
startDate | StartDateSchema | | optional


# DeliveryCitySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# DeliveryLineCountFromSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  |  | 

# DeliveryLineCountToSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  |  | 

# DeliveryNameSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# DocumentNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# DvolumeFromSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  |  | 

# DvolumeToSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  |  | 

# EndDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

# ExcludeAttachedSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, bool,  | NoneClass, BoolClass,  |  | 

# IsCloseFilterSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, bool,  | NoneClass, BoolClass,  |  | 

# IsOpenFilterSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, bool,  | NoneClass, BoolClass,  |  | 

# StartDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
None, str,  | NoneClass, str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#list_orders.ApiResponseFor200) | 
400 | [ApiResponseFor400](#list_orders.ApiResponseFor400) | 
401 | [ApiResponseFor401](#list_orders.ApiResponseFor401) | 
500 | [ApiResponseFor500](#list_orders.ApiResponseFor500) | 

#### list_orders.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OrderDto**]({{complexTypePrefix}}OrderDto.md) | [**OrderDto**]({{complexTypePrefix}}OrderDto.md) | [**OrderDto**]({{complexTypePrefix}}OrderDto.md) |  | 

#### list_orders.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ErrorDto]({{complexTypePrefix}}ErrorDto.md) | [**ErrorDto**]({{complexTypePrefix}}ErrorDto.md) | [**ErrorDto**]({{complexTypePrefix}}ErrorDto.md) |  | 
[ValidationErrorDto]({{complexTypePrefix}}ValidationErrorDto.md) | [**ValidationErrorDto**]({{complexTypePrefix}}ValidationErrorDto.md) | [**ValidationErrorDto**]({{complexTypePrefix}}ValidationErrorDto.md) |  | 

#### list_orders.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**UnauthorizedErrorDto**](../../models/UnauthorizedErrorDto.md) |  | 


#### list_orders.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ServerErrorDto**](../../models/ServerErrorDto.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **read_order**
<a name="read_order"></a>
> OrderDto read_order(order_number)



### Example

* Bearer (JWT) Authentication (bearer):
```python
import openapi_client
from openapi_client.apis.tags import orders_api
from openapi_client.model.order_dto import OrderDto
from openapi_client.model.validation_error_dto import ValidationErrorDto
from openapi_client.model.unauthorized_error_dto import UnauthorizedErrorDto
from openapi_client.model.error_dto import ErrorDto
from openapi_client.model.server_error_dto import ServerErrorDto
from pprint import pprint
# Defining the host is optional and defaults to http://localhost:3000
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost:3000"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): bearer
configuration = openapi_client.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = orders_api.OrdersApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'orderNumber': "orderNumber_example",
    }
    try:
        api_response = api_instance.read_order(
            path_params=path_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling OrdersApi->read_order: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
orderNumber | OrderNumberSchema | | 

# OrderNumberSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#read_order.ApiResponseFor200) | 
400 | [ApiResponseFor400](#read_order.ApiResponseFor400) | 
401 | [ApiResponseFor401](#read_order.ApiResponseFor401) | 
500 | [ApiResponseFor500](#read_order.ApiResponseFor500) | 

#### read_order.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**OrderDto**](../../models/OrderDto.md) |  | 


#### read_order.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ErrorDto]({{complexTypePrefix}}ErrorDto.md) | [**ErrorDto**]({{complexTypePrefix}}ErrorDto.md) | [**ErrorDto**]({{complexTypePrefix}}ErrorDto.md) |  | 
[ValidationErrorDto]({{complexTypePrefix}}ValidationErrorDto.md) | [**ValidationErrorDto**]({{complexTypePrefix}}ValidationErrorDto.md) | [**ValidationErrorDto**]({{complexTypePrefix}}ValidationErrorDto.md) |  | 

#### read_order.ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor401ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**UnauthorizedErrorDto**](../../models/UnauthorizedErrorDto.md) |  | 


#### read_order.ApiResponseFor500
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor500ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor500ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ServerErrorDto**](../../models/ServerErrorDto.md) |  | 


### Authorization

[bearer](../../../README.md#bearer)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

