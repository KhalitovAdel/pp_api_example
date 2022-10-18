# OpenapiClient::OrderDto

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Ordernummer |  |
| **order_status** | **String** | Orderstatus |  |
| **customer_id** | **String** | Kund |  |
| **delivery_address** | [**OrderDtoDeliveryAddress**](OrderDtoDeliveryAddress.md) |  |  |
| **last_sync_status** | **String** | Synkronisering status |  |
| **delivered_volume** | **Float** | Levererad volym |  |
| **created_at** | **Time** | Skapades |  |
| **updated_at** | **Time** | Senast ändrad |  |
| **last_sync_at** | **Time** | Synkronisera |  |
| **document_number** | **String** | Dokumentnummer | [optional] |
| **project_number** | **String** | Projektnummer | [optional] |
| **sales_responsible** | **String** | Ansvarig säljare | [optional] |
| **order_date** | **String** | Orderdatum | [optional] |
| **delivery_date** | **String** | Leveransdatum | [optional] |
| **planned_start_date** | **String** | Planerat Startdatum | [optional] |
| **deleted_at** | **Time** |  | [optional] |
| **updated_by** | **String** |  | [optional] |
| **delivery_name** | **String** | Mottagarnamn | [optional] |
| **delivery_line_count** | **Float** | Leveranser | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderDto.new(
  id: null,
  order_status: null,
  customer_id: null,
  delivery_address: null,
  last_sync_status: null,
  delivered_volume: null,
  created_at: null,
  updated_at: null,
  last_sync_at: null,
  document_number: null,
  project_number: null,
  sales_responsible: null,
  order_date: null,
  delivery_date: null,
  planned_start_date: null,
  deleted_at: null,
  updated_by: null,
  delivery_name: null,
  delivery_line_count: null
)
```

