# ErrorMetaDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** |  | 
**Value** | **map[string]interface{}** |  | 
**Msg** | **string** |  | 

## Methods

### NewErrorMetaDto

`func NewErrorMetaDto(key string, value map[string]interface{}, msg string, ) *ErrorMetaDto`

NewErrorMetaDto instantiates a new ErrorMetaDto object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewErrorMetaDtoWithDefaults

`func NewErrorMetaDtoWithDefaults() *ErrorMetaDto`

NewErrorMetaDtoWithDefaults instantiates a new ErrorMetaDto object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *ErrorMetaDto) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *ErrorMetaDto) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *ErrorMetaDto) SetKey(v string)`

SetKey sets Key field to given value.


### GetValue

`func (o *ErrorMetaDto) GetValue() map[string]interface{}`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ErrorMetaDto) GetValueOk() (*map[string]interface{}, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ErrorMetaDto) SetValue(v map[string]interface{})`

SetValue sets Value field to given value.


### GetMsg

`func (o *ErrorMetaDto) GetMsg() string`

GetMsg returns the Msg field if non-nil, zero value otherwise.

### GetMsgOk

`func (o *ErrorMetaDto) GetMsgOk() (*string, bool)`

GetMsgOk returns a tuple with the Msg field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsg

`func (o *ErrorMetaDto) SetMsg(v string)`

SetMsg sets Msg field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


