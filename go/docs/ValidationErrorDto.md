# ValidationErrorDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** |  | 
**Timestamp** | **string** | Returns a date as a string value in ISO format. | 
**StatusCode** | **float32** |  | 
**Code** | **string** |  | 
**Meta** | [**ErrorMetaDto**](ErrorMetaDto.md) |  | 

## Methods

### NewValidationErrorDto

`func NewValidationErrorDto(message string, timestamp string, statusCode float32, code string, meta ErrorMetaDto, ) *ValidationErrorDto`

NewValidationErrorDto instantiates a new ValidationErrorDto object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValidationErrorDtoWithDefaults

`func NewValidationErrorDtoWithDefaults() *ValidationErrorDto`

NewValidationErrorDtoWithDefaults instantiates a new ValidationErrorDto object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *ValidationErrorDto) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ValidationErrorDto) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ValidationErrorDto) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetTimestamp

`func (o *ValidationErrorDto) GetTimestamp() string`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *ValidationErrorDto) GetTimestampOk() (*string, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *ValidationErrorDto) SetTimestamp(v string)`

SetTimestamp sets Timestamp field to given value.


### GetStatusCode

`func (o *ValidationErrorDto) GetStatusCode() float32`

GetStatusCode returns the StatusCode field if non-nil, zero value otherwise.

### GetStatusCodeOk

`func (o *ValidationErrorDto) GetStatusCodeOk() (*float32, bool)`

GetStatusCodeOk returns a tuple with the StatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusCode

`func (o *ValidationErrorDto) SetStatusCode(v float32)`

SetStatusCode sets StatusCode field to given value.


### GetCode

`func (o *ValidationErrorDto) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ValidationErrorDto) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ValidationErrorDto) SetCode(v string)`

SetCode sets Code field to given value.


### GetMeta

`func (o *ValidationErrorDto) GetMeta() ErrorMetaDto`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *ValidationErrorDto) GetMetaOk() (*ErrorMetaDto, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *ValidationErrorDto) SetMeta(v ErrorMetaDto)`

SetMeta sets Meta field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


