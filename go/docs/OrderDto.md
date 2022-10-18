# OrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Ordernummer | 
**OrderStatus** | **string** | Orderstatus | 
**CustomerId** | **string** | Kund | 
**DeliveryAddress** | [**OrderDtoDeliveryAddress**](OrderDtoDeliveryAddress.md) |  | 
**LastSyncStatus** | **string** | Synkronisering status | 
**DeliveredVolume** | **float32** | Levererad volym | 
**CreatedAt** | **time.Time** | Skapades | 
**UpdatedAt** | **time.Time** | Senast ändrad | 
**LastSyncAt** | **NullableTime** | Synkronisera | 
**DocumentNumber** | Pointer to **NullableString** | Dokumentnummer | [optional] 
**ProjectNumber** | Pointer to **NullableString** | Projektnummer | [optional] 
**SalesResponsible** | Pointer to **NullableString** | Ansvarig säljare | [optional] 
**OrderDate** | Pointer to **NullableString** | Orderdatum | [optional] 
**DeliveryDate** | Pointer to **NullableString** | Leveransdatum | [optional] 
**PlannedStartDate** | Pointer to **NullableString** | Planerat Startdatum | [optional] 
**DeletedAt** | Pointer to **NullableTime** |  | [optional] 
**UpdatedBy** | Pointer to **NullableString** |  | [optional] 
**DeliveryName** | Pointer to **NullableString** | Mottagarnamn | [optional] 
**DeliveryLineCount** | Pointer to **NullableFloat32** | Leveranser | [optional] 

## Methods

### NewOrderDto

`func NewOrderDto(id string, orderStatus string, customerId string, deliveryAddress OrderDtoDeliveryAddress, lastSyncStatus string, deliveredVolume float32, createdAt time.Time, updatedAt time.Time, lastSyncAt NullableTime, ) *OrderDto`

NewOrderDto instantiates a new OrderDto object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrderDtoWithDefaults

`func NewOrderDtoWithDefaults() *OrderDto`

NewOrderDtoWithDefaults instantiates a new OrderDto object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *OrderDto) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *OrderDto) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *OrderDto) SetId(v string)`

SetId sets Id field to given value.


### GetOrderStatus

`func (o *OrderDto) GetOrderStatus() string`

GetOrderStatus returns the OrderStatus field if non-nil, zero value otherwise.

### GetOrderStatusOk

`func (o *OrderDto) GetOrderStatusOk() (*string, bool)`

GetOrderStatusOk returns a tuple with the OrderStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderStatus

`func (o *OrderDto) SetOrderStatus(v string)`

SetOrderStatus sets OrderStatus field to given value.


### GetCustomerId

`func (o *OrderDto) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *OrderDto) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *OrderDto) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.


### GetDeliveryAddress

`func (o *OrderDto) GetDeliveryAddress() OrderDtoDeliveryAddress`

GetDeliveryAddress returns the DeliveryAddress field if non-nil, zero value otherwise.

### GetDeliveryAddressOk

`func (o *OrderDto) GetDeliveryAddressOk() (*OrderDtoDeliveryAddress, bool)`

GetDeliveryAddressOk returns a tuple with the DeliveryAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryAddress

`func (o *OrderDto) SetDeliveryAddress(v OrderDtoDeliveryAddress)`

SetDeliveryAddress sets DeliveryAddress field to given value.


### GetLastSyncStatus

`func (o *OrderDto) GetLastSyncStatus() string`

GetLastSyncStatus returns the LastSyncStatus field if non-nil, zero value otherwise.

### GetLastSyncStatusOk

`func (o *OrderDto) GetLastSyncStatusOk() (*string, bool)`

GetLastSyncStatusOk returns a tuple with the LastSyncStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastSyncStatus

`func (o *OrderDto) SetLastSyncStatus(v string)`

SetLastSyncStatus sets LastSyncStatus field to given value.


### GetDeliveredVolume

`func (o *OrderDto) GetDeliveredVolume() float32`

GetDeliveredVolume returns the DeliveredVolume field if non-nil, zero value otherwise.

### GetDeliveredVolumeOk

`func (o *OrderDto) GetDeliveredVolumeOk() (*float32, bool)`

GetDeliveredVolumeOk returns a tuple with the DeliveredVolume field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveredVolume

`func (o *OrderDto) SetDeliveredVolume(v float32)`

SetDeliveredVolume sets DeliveredVolume field to given value.


### GetCreatedAt

`func (o *OrderDto) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *OrderDto) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *OrderDto) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetUpdatedAt

`func (o *OrderDto) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *OrderDto) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *OrderDto) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.


### GetLastSyncAt

`func (o *OrderDto) GetLastSyncAt() time.Time`

GetLastSyncAt returns the LastSyncAt field if non-nil, zero value otherwise.

### GetLastSyncAtOk

`func (o *OrderDto) GetLastSyncAtOk() (*time.Time, bool)`

GetLastSyncAtOk returns a tuple with the LastSyncAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastSyncAt

`func (o *OrderDto) SetLastSyncAt(v time.Time)`

SetLastSyncAt sets LastSyncAt field to given value.


### SetLastSyncAtNil

`func (o *OrderDto) SetLastSyncAtNil(b bool)`

 SetLastSyncAtNil sets the value for LastSyncAt to be an explicit nil

### UnsetLastSyncAt
`func (o *OrderDto) UnsetLastSyncAt()`

UnsetLastSyncAt ensures that no value is present for LastSyncAt, not even an explicit nil
### GetDocumentNumber

`func (o *OrderDto) GetDocumentNumber() string`

GetDocumentNumber returns the DocumentNumber field if non-nil, zero value otherwise.

### GetDocumentNumberOk

`func (o *OrderDto) GetDocumentNumberOk() (*string, bool)`

GetDocumentNumberOk returns a tuple with the DocumentNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentNumber

`func (o *OrderDto) SetDocumentNumber(v string)`

SetDocumentNumber sets DocumentNumber field to given value.

### HasDocumentNumber

`func (o *OrderDto) HasDocumentNumber() bool`

HasDocumentNumber returns a boolean if a field has been set.

### SetDocumentNumberNil

`func (o *OrderDto) SetDocumentNumberNil(b bool)`

 SetDocumentNumberNil sets the value for DocumentNumber to be an explicit nil

### UnsetDocumentNumber
`func (o *OrderDto) UnsetDocumentNumber()`

UnsetDocumentNumber ensures that no value is present for DocumentNumber, not even an explicit nil
### GetProjectNumber

`func (o *OrderDto) GetProjectNumber() string`

GetProjectNumber returns the ProjectNumber field if non-nil, zero value otherwise.

### GetProjectNumberOk

`func (o *OrderDto) GetProjectNumberOk() (*string, bool)`

GetProjectNumberOk returns a tuple with the ProjectNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProjectNumber

`func (o *OrderDto) SetProjectNumber(v string)`

SetProjectNumber sets ProjectNumber field to given value.

### HasProjectNumber

`func (o *OrderDto) HasProjectNumber() bool`

HasProjectNumber returns a boolean if a field has been set.

### SetProjectNumberNil

`func (o *OrderDto) SetProjectNumberNil(b bool)`

 SetProjectNumberNil sets the value for ProjectNumber to be an explicit nil

### UnsetProjectNumber
`func (o *OrderDto) UnsetProjectNumber()`

UnsetProjectNumber ensures that no value is present for ProjectNumber, not even an explicit nil
### GetSalesResponsible

`func (o *OrderDto) GetSalesResponsible() string`

GetSalesResponsible returns the SalesResponsible field if non-nil, zero value otherwise.

### GetSalesResponsibleOk

`func (o *OrderDto) GetSalesResponsibleOk() (*string, bool)`

GetSalesResponsibleOk returns a tuple with the SalesResponsible field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSalesResponsible

`func (o *OrderDto) SetSalesResponsible(v string)`

SetSalesResponsible sets SalesResponsible field to given value.

### HasSalesResponsible

`func (o *OrderDto) HasSalesResponsible() bool`

HasSalesResponsible returns a boolean if a field has been set.

### SetSalesResponsibleNil

`func (o *OrderDto) SetSalesResponsibleNil(b bool)`

 SetSalesResponsibleNil sets the value for SalesResponsible to be an explicit nil

### UnsetSalesResponsible
`func (o *OrderDto) UnsetSalesResponsible()`

UnsetSalesResponsible ensures that no value is present for SalesResponsible, not even an explicit nil
### GetOrderDate

`func (o *OrderDto) GetOrderDate() string`

GetOrderDate returns the OrderDate field if non-nil, zero value otherwise.

### GetOrderDateOk

`func (o *OrderDto) GetOrderDateOk() (*string, bool)`

GetOrderDateOk returns a tuple with the OrderDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderDate

`func (o *OrderDto) SetOrderDate(v string)`

SetOrderDate sets OrderDate field to given value.

### HasOrderDate

`func (o *OrderDto) HasOrderDate() bool`

HasOrderDate returns a boolean if a field has been set.

### SetOrderDateNil

`func (o *OrderDto) SetOrderDateNil(b bool)`

 SetOrderDateNil sets the value for OrderDate to be an explicit nil

### UnsetOrderDate
`func (o *OrderDto) UnsetOrderDate()`

UnsetOrderDate ensures that no value is present for OrderDate, not even an explicit nil
### GetDeliveryDate

`func (o *OrderDto) GetDeliveryDate() string`

GetDeliveryDate returns the DeliveryDate field if non-nil, zero value otherwise.

### GetDeliveryDateOk

`func (o *OrderDto) GetDeliveryDateOk() (*string, bool)`

GetDeliveryDateOk returns a tuple with the DeliveryDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryDate

`func (o *OrderDto) SetDeliveryDate(v string)`

SetDeliveryDate sets DeliveryDate field to given value.

### HasDeliveryDate

`func (o *OrderDto) HasDeliveryDate() bool`

HasDeliveryDate returns a boolean if a field has been set.

### SetDeliveryDateNil

`func (o *OrderDto) SetDeliveryDateNil(b bool)`

 SetDeliveryDateNil sets the value for DeliveryDate to be an explicit nil

### UnsetDeliveryDate
`func (o *OrderDto) UnsetDeliveryDate()`

UnsetDeliveryDate ensures that no value is present for DeliveryDate, not even an explicit nil
### GetPlannedStartDate

`func (o *OrderDto) GetPlannedStartDate() string`

GetPlannedStartDate returns the PlannedStartDate field if non-nil, zero value otherwise.

### GetPlannedStartDateOk

`func (o *OrderDto) GetPlannedStartDateOk() (*string, bool)`

GetPlannedStartDateOk returns a tuple with the PlannedStartDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlannedStartDate

`func (o *OrderDto) SetPlannedStartDate(v string)`

SetPlannedStartDate sets PlannedStartDate field to given value.

### HasPlannedStartDate

`func (o *OrderDto) HasPlannedStartDate() bool`

HasPlannedStartDate returns a boolean if a field has been set.

### SetPlannedStartDateNil

`func (o *OrderDto) SetPlannedStartDateNil(b bool)`

 SetPlannedStartDateNil sets the value for PlannedStartDate to be an explicit nil

### UnsetPlannedStartDate
`func (o *OrderDto) UnsetPlannedStartDate()`

UnsetPlannedStartDate ensures that no value is present for PlannedStartDate, not even an explicit nil
### GetDeletedAt

`func (o *OrderDto) GetDeletedAt() time.Time`

GetDeletedAt returns the DeletedAt field if non-nil, zero value otherwise.

### GetDeletedAtOk

`func (o *OrderDto) GetDeletedAtOk() (*time.Time, bool)`

GetDeletedAtOk returns a tuple with the DeletedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletedAt

`func (o *OrderDto) SetDeletedAt(v time.Time)`

SetDeletedAt sets DeletedAt field to given value.

### HasDeletedAt

`func (o *OrderDto) HasDeletedAt() bool`

HasDeletedAt returns a boolean if a field has been set.

### SetDeletedAtNil

`func (o *OrderDto) SetDeletedAtNil(b bool)`

 SetDeletedAtNil sets the value for DeletedAt to be an explicit nil

### UnsetDeletedAt
`func (o *OrderDto) UnsetDeletedAt()`

UnsetDeletedAt ensures that no value is present for DeletedAt, not even an explicit nil
### GetUpdatedBy

`func (o *OrderDto) GetUpdatedBy() string`

GetUpdatedBy returns the UpdatedBy field if non-nil, zero value otherwise.

### GetUpdatedByOk

`func (o *OrderDto) GetUpdatedByOk() (*string, bool)`

GetUpdatedByOk returns a tuple with the UpdatedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedBy

`func (o *OrderDto) SetUpdatedBy(v string)`

SetUpdatedBy sets UpdatedBy field to given value.

### HasUpdatedBy

`func (o *OrderDto) HasUpdatedBy() bool`

HasUpdatedBy returns a boolean if a field has been set.

### SetUpdatedByNil

`func (o *OrderDto) SetUpdatedByNil(b bool)`

 SetUpdatedByNil sets the value for UpdatedBy to be an explicit nil

### UnsetUpdatedBy
`func (o *OrderDto) UnsetUpdatedBy()`

UnsetUpdatedBy ensures that no value is present for UpdatedBy, not even an explicit nil
### GetDeliveryName

`func (o *OrderDto) GetDeliveryName() string`

GetDeliveryName returns the DeliveryName field if non-nil, zero value otherwise.

### GetDeliveryNameOk

`func (o *OrderDto) GetDeliveryNameOk() (*string, bool)`

GetDeliveryNameOk returns a tuple with the DeliveryName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryName

`func (o *OrderDto) SetDeliveryName(v string)`

SetDeliveryName sets DeliveryName field to given value.

### HasDeliveryName

`func (o *OrderDto) HasDeliveryName() bool`

HasDeliveryName returns a boolean if a field has been set.

### SetDeliveryNameNil

`func (o *OrderDto) SetDeliveryNameNil(b bool)`

 SetDeliveryNameNil sets the value for DeliveryName to be an explicit nil

### UnsetDeliveryName
`func (o *OrderDto) UnsetDeliveryName()`

UnsetDeliveryName ensures that no value is present for DeliveryName, not even an explicit nil
### GetDeliveryLineCount

`func (o *OrderDto) GetDeliveryLineCount() float32`

GetDeliveryLineCount returns the DeliveryLineCount field if non-nil, zero value otherwise.

### GetDeliveryLineCountOk

`func (o *OrderDto) GetDeliveryLineCountOk() (*float32, bool)`

GetDeliveryLineCountOk returns a tuple with the DeliveryLineCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeliveryLineCount

`func (o *OrderDto) SetDeliveryLineCount(v float32)`

SetDeliveryLineCount sets DeliveryLineCount field to given value.

### HasDeliveryLineCount

`func (o *OrderDto) HasDeliveryLineCount() bool`

HasDeliveryLineCount returns a boolean if a field has been set.

### SetDeliveryLineCountNil

`func (o *OrderDto) SetDeliveryLineCountNil(b bool)`

 SetDeliveryLineCountNil sets the value for DeliveryLineCount to be an explicit nil

### UnsetDeliveryLineCount
`func (o *OrderDto) UnsetDeliveryLineCount()`

UnsetDeliveryLineCount ensures that no value is present for DeliveryLineCount, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


