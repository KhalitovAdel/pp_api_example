

# OrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Ordernummer | 
**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | Orderstatus | 
**customerId** | **String** | Kund | 
**deliveryAddress** | [**OrderDtoDeliveryAddress**](OrderDtoDeliveryAddress.md) |  | 
**lastSyncStatus** | [**LastSyncStatusEnum**](#LastSyncStatusEnum) | Synkronisering status | 
**deliveredVolume** | [**BigDecimal**](BigDecimal.md) | Levererad volym | 
**createdAt** | [**Date**](Date.md) | Skapades | 
**updatedAt** | [**Date**](Date.md) | Senast ändrad | 
**lastSyncAt** | [**Date**](Date.md) | Synkronisera | 
**documentNumber** | **String** | Dokumentnummer |  [optional]
**projectNumber** | **String** | Projektnummer |  [optional]
**salesResponsible** | **String** | Ansvarig säljare |  [optional]
**orderDate** | **String** | Orderdatum |  [optional]
**deliveryDate** | **String** | Leveransdatum |  [optional]
**plannedStartDate** | **String** | Planerat Startdatum |  [optional]
**deletedAt** | [**Date**](Date.md) |  |  [optional]
**updatedBy** | **String** |  |  [optional]
**deliveryName** | **String** | Mottagarnamn |  [optional]
**deliveryLineCount** | [**BigDecimal**](BigDecimal.md) | Leveranser |  [optional]


## Enum: OrderStatusEnum

Name | Value
---- | -----


## Enum: LastSyncStatusEnum

Name | Value
---- | -----




