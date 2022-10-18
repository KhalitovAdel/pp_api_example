# openapi_client.model.validation_error_dto.ValidationErrorDto

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  |  | must be one of ["INVALID_INPUT", ] 
**meta** | [**ErrorMetaDto**](ErrorMetaDto.md) | [**ErrorMetaDto**](ErrorMetaDto.md) |  | 
**message** | str,  | str,  |  | 
**statusCode** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | must be one of [400, ] 
**timestamp** | str,  | str,  | Returns a date as a string value in ISO format. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

