# UnauthorizedErrorDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** |  | 
**Timestamp** | **string** | Returns a date as a string value in ISO format. | 
**StatusCode** | **float32** |  | 
**Code** | **string** |  | 

## Methods

### NewUnauthorizedErrorDto

`func NewUnauthorizedErrorDto(message string, timestamp string, statusCode float32, code string, ) *UnauthorizedErrorDto`

NewUnauthorizedErrorDto instantiates a new UnauthorizedErrorDto object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUnauthorizedErrorDtoWithDefaults

`func NewUnauthorizedErrorDtoWithDefaults() *UnauthorizedErrorDto`

NewUnauthorizedErrorDtoWithDefaults instantiates a new UnauthorizedErrorDto object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *UnauthorizedErrorDto) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *UnauthorizedErrorDto) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *UnauthorizedErrorDto) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetTimestamp

`func (o *UnauthorizedErrorDto) GetTimestamp() string`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *UnauthorizedErrorDto) GetTimestampOk() (*string, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *UnauthorizedErrorDto) SetTimestamp(v string)`

SetTimestamp sets Timestamp field to given value.


### GetStatusCode

`func (o *UnauthorizedErrorDto) GetStatusCode() float32`

GetStatusCode returns the StatusCode field if non-nil, zero value otherwise.

### GetStatusCodeOk

`func (o *UnauthorizedErrorDto) GetStatusCodeOk() (*float32, bool)`

GetStatusCodeOk returns a tuple with the StatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusCode

`func (o *UnauthorizedErrorDto) SetStatusCode(v float32)`

SetStatusCode sets StatusCode field to given value.


### GetCode

`func (o *UnauthorizedErrorDto) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *UnauthorizedErrorDto) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *UnauthorizedErrorDto) SetCode(v string)`

SetCode sets Code field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


