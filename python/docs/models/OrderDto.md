# openapi_client.model.order_dto.OrderDto

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**createdAt** | str, datetime,  | str,  | Skapades | value must conform to RFC-3339 date-time
**deliveredVolume** | decimal.Decimal, int, float,  | decimal.Decimal,  | Levererad volym | 
**[deliveryAddress](#deliveryAddress)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Mottagningsplats | 
**lastSyncAt** | None, str, datetime,  | NoneClass, str,  | Synkronisera | value must conform to RFC-3339 date-time
**customerId** | str,  | str,  | Kund | 
**orderStatus** | str,  | str,  | Orderstatus | must be one of ["CLOSED", "OPENED", ] 
**lastSyncStatus** | str,  | str,  | Synkronisering status | must be one of ["ERROR", "SUCCESS", "UNKNOWN", ] 
**id** | str,  | str,  | Ordernummer | 
**updatedAt** | str, datetime,  | str,  | Senast ändrad | value must conform to RFC-3339 date-time
**documentNumber** | None, str,  | NoneClass, str,  | Dokumentnummer | [optional] 
**projectNumber** | None, str,  | NoneClass, str,  | Projektnummer | [optional] 
**salesResponsible** | None, str,  | NoneClass, str,  | Ansvarig säljare | [optional] 
**orderDate** | None, str,  | NoneClass, str,  | Orderdatum | [optional] 
**deliveryDate** | None, str,  | NoneClass, str,  | Leveransdatum | [optional] 
**plannedStartDate** | None, str,  | NoneClass, str,  | Planerat Startdatum | [optional] 
**deletedAt** | None, str, datetime,  | NoneClass, str,  |  | [optional] value must conform to RFC-3339 date-time
**updatedBy** | None, str,  | NoneClass, str,  |  | [optional] 
**deliveryName** | None, str,  | NoneClass, str,  | Mottagarnamn | [optional] 
**deliveryLineCount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Leveranser | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# deliveryAddress

Mottagningsplats

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Mottagningsplats | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[DeliveryAddressDto](DeliveryAddressDto.md) | [**DeliveryAddressDto**](DeliveryAddressDto.md) | [**DeliveryAddressDto**](DeliveryAddressDto.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

