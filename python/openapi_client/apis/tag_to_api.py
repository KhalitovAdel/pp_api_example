import typing_extensions

from openapi_client.apis.tags import TagValues
from openapi_client.apis.tags.orders_api import OrdersApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.ORDERS: OrdersApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.ORDERS: OrdersApi,
    }
)
