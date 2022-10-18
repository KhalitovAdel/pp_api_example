# ReadOrder400Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Message** | **string** |  | 
**Timestamp** | **string** | Returns a date as a string value in ISO format. | 
**StatusCode** | **float32** |  | 
**Code** | **string** |  | 
**Meta** | [**ErrorMetaDto**](ErrorMetaDto.md) |  | 

## Methods

### NewReadOrder400Response

`func NewReadOrder400Response(message string, timestamp string, statusCode float32, code string, meta ErrorMetaDto, ) *ReadOrder400Response`

NewReadOrder400Response instantiates a new ReadOrder400Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReadOrder400ResponseWithDefaults

`func NewReadOrder400ResponseWithDefaults() *ReadOrder400Response`

NewReadOrder400ResponseWithDefaults instantiates a new ReadOrder400Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMessage

`func (o *ReadOrder400Response) GetMessage() string`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *ReadOrder400Response) GetMessageOk() (*string, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *ReadOrder400Response) SetMessage(v string)`

SetMessage sets Message field to given value.


### GetTimestamp

`func (o *ReadOrder400Response) GetTimestamp() string`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *ReadOrder400Response) GetTimestampOk() (*string, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *ReadOrder400Response) SetTimestamp(v string)`

SetTimestamp sets Timestamp field to given value.


### GetStatusCode

`func (o *ReadOrder400Response) GetStatusCode() float32`

GetStatusCode returns the StatusCode field if non-nil, zero value otherwise.

### GetStatusCodeOk

`func (o *ReadOrder400Response) GetStatusCodeOk() (*float32, bool)`

GetStatusCodeOk returns a tuple with the StatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusCode

`func (o *ReadOrder400Response) SetStatusCode(v float32)`

SetStatusCode sets StatusCode field to given value.


### GetCode

`func (o *ReadOrder400Response) GetCode() string`

GetCode returns the Code field if non-nil, zero value otherwise.

### GetCodeOk

`func (o *ReadOrder400Response) GetCodeOk() (*string, bool)`

GetCodeOk returns a tuple with the Code field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCode

`func (o *ReadOrder400Response) SetCode(v string)`

SetCode sets Code field to given value.


### GetMeta

`func (o *ReadOrder400Response) GetMeta() ErrorMetaDto`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *ReadOrder400Response) GetMetaOk() (*ErrorMetaDto, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *ReadOrder400Response) SetMeta(v ErrorMetaDto)`

SetMeta sets Meta field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


