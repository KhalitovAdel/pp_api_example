
# OrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Ordernummer | 
**orderStatus** | [**inline**](#OrderStatus) | Orderstatus | 
**customerId** | **kotlin.String** | Kund | 
**deliveryAddress** | [**OrderDtoDeliveryAddress**](OrderDtoDeliveryAddress.md) |  | 
**lastSyncStatus** | [**inline**](#LastSyncStatus) | Synkronisering status | 
**deliveredVolume** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Levererad volym | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Skapades | 
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Senast ändrad | 
**lastSyncAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Synkronisera | 
**documentNumber** | **kotlin.String** | Dokumentnummer |  [optional]
**projectNumber** | **kotlin.String** | Projektnummer |  [optional]
**salesResponsible** | **kotlin.String** | Ansvarig säljare |  [optional]
**orderDate** | **kotlin.String** | Orderdatum |  [optional]
**deliveryDate** | **kotlin.String** | Leveransdatum |  [optional]
**plannedStartDate** | **kotlin.String** | Planerat Startdatum |  [optional]
**deletedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**updatedBy** | **kotlin.String** |  |  [optional]
**deliveryName** | **kotlin.String** | Mottagarnamn |  [optional]
**deliveryLineCount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Leveranser |  [optional]


<a name="OrderStatus"></a>
## Enum: orderStatus
Name | Value
---- | -----
orderStatus | CLOSED, OPENED


<a name="LastSyncStatus"></a>
## Enum: lastSyncStatus
Name | Value
---- | -----
lastSyncStatus | ERROR, SUCCESS, UNKNOWN



