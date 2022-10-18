# OpenapiClient::ReadOrder400Response

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_client'

OpenapiClient::ReadOrder400Response.openapi_one_of
# =>
# [
#   :'ErrorDto',
#   :'ValidationErrorDto'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_client'

OpenapiClient::ReadOrder400Response.build(data)
# => #<ErrorDto:0x00007fdd4aab02a0>

OpenapiClient::ReadOrder400Response.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `ErrorDto`
- `ValidationErrorDto`
- `nil` (if no type matches)

