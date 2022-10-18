import typing_extensions

from openapi_client.paths import PathValues
from openapi_client.apis.paths.api_ext_v1_0_orders_order_number import ApiExtV10OrdersOrderNumber
from openapi_client.apis.paths.api_ext_v1_0_orders import ApiExtV10Orders

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.APIEXT_V1_0_ORDERS_ORDER_NUMBER: ApiExtV10OrdersOrderNumber,
        PathValues.APIEXT_V1_0_ORDERS: ApiExtV10Orders,
    }
)

path_to_api = PathToApi(
    {
        PathValues.APIEXT_V1_0_ORDERS_ORDER_NUMBER: ApiExtV10OrdersOrderNumber,
        PathValues.APIEXT_V1_0_ORDERS: ApiExtV10Orders,
    }
)
