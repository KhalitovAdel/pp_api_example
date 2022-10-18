

# OrderDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Ordernummer |  |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | Orderstatus |  |
|**customerId** | **String** | Kund |  |
|**deliveryAddress** | [**OrderDtoDeliveryAddress**](OrderDtoDeliveryAddress.md) |  |  |
|**lastSyncStatus** | [**LastSyncStatusEnum**](#LastSyncStatusEnum) | Synkronisering status |  |
|**deliveredVolume** | **BigDecimal** | Levererad volym |  |
|**createdAt** | **OffsetDateTime** | Skapades |  |
|**updatedAt** | **OffsetDateTime** | Senast ändrad |  |
|**lastSyncAt** | **OffsetDateTime** | Synkronisera |  |
|**documentNumber** | **String** | Dokumentnummer |  [optional] |
|**projectNumber** | **String** | Projektnummer |  [optional] |
|**salesResponsible** | **String** | Ansvarig säljare |  [optional] |
|**orderDate** | **String** | Orderdatum |  [optional] |
|**deliveryDate** | **String** | Leveransdatum |  [optional] |
|**plannedStartDate** | **String** | Planerat Startdatum |  [optional] |
|**deletedAt** | **OffsetDateTime** |  |  [optional] |
|**updatedBy** | **String** |  |  [optional] |
|**deliveryName** | **String** | Mottagarnamn |  [optional] |
|**deliveryLineCount** | **BigDecimal** | Leveranser |  [optional] |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;CLOSED&quot; |
| OPENED | &quot;OPENED&quot; |



## Enum: LastSyncStatusEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;ERROR&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



