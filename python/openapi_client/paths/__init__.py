# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from openapi_client.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    APIEXT_V1_0_ORDERS_ORDER_NUMBER = "/api-ext/v1.0/orders/{orderNumber}"
    APIEXT_V1_0_ORDERS = "/api-ext/v1.0/orders"
