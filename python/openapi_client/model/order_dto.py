# coding: utf-8

"""
    Integration

             Here can be some description if that needed       # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from openapi_client import schemas  # noqa: F401


class OrderDto(
    schemas.DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """


    class MetaOapg:
        required = {
            "createdAt",
            "deliveredVolume",
            "deliveryAddress",
            "lastSyncAt",
            "customerId",
            "orderStatus",
            "lastSyncStatus",
            "id",
            "updatedAt",
        }
        
        class properties:
            id = schemas.StrSchema
            
            
            class orderStatus(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "CLOSED": "CLOSED",
                        "OPENED": "OPENED",
                    }
                
                @schemas.classproperty
                def CLOSED(cls):
                    return cls("CLOSED")
                
                @schemas.classproperty
                def OPENED(cls):
                    return cls("OPENED")
            customerId = schemas.StrSchema
            
            
            class deliveryAddress(
                schemas.ComposedSchema,
            ):
            
            
                class MetaOapg:
                    
                    @classmethod
                    @functools.lru_cache()
                    def all_of(cls):
                        # we need this here to make our import statements work
                        # we must store _composed_schemas in here so the code is only run
                        # when we invoke this method. If we kept this at the class
                        # level we would get an error because the class level
                        # code would be run when this module is imported, and these composed
                        # classes don't exist yet because their module has not finished
                        # loading
                        return [
                            DeliveryAddressDto,
                        ]
            
            
                def __new__(
                    cls,
                    *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                    **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
                ) -> 'deliveryAddress':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                        **kwargs,
                    )
            
            
            class lastSyncStatus(
                schemas.EnumBase,
                schemas.StrSchema
            ):
            
            
                class MetaOapg:
                    enum_value_to_name = {
                        "ERROR": "ERROR",
                        "SUCCESS": "SUCCESS",
                        "UNKNOWN": "UNKNOWN",
                    }
                
                @schemas.classproperty
                def ERROR(cls):
                    return cls("ERROR")
                
                @schemas.classproperty
                def SUCCESS(cls):
                    return cls("SUCCESS")
                
                @schemas.classproperty
                def UNKNOWN(cls):
                    return cls("UNKNOWN")
            deliveredVolume = schemas.NumberSchema
            createdAt = schemas.DateTimeSchema
            updatedAt = schemas.DateTimeSchema
            
            
            class lastSyncAt(
                schemas.DateTimeBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, datetime, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'lastSyncAt':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class documentNumber(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'documentNumber':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class projectNumber(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'projectNumber':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class salesResponsible(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'salesResponsible':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class orderDate(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'orderDate':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class deliveryDate(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'deliveryDate':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class plannedStartDate(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'plannedStartDate':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class deletedAt(
                schemas.DateTimeBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'date-time'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, datetime, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'deletedAt':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class updatedBy(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'updatedBy':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class deliveryName(
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'deliveryName':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            
            
            class deliveryLineCount(
                schemas.NumberBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneDecimalMixin
            ):
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, decimal.Decimal, int, float, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'deliveryLineCount':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "id": id,
                "orderStatus": orderStatus,
                "customerId": customerId,
                "deliveryAddress": deliveryAddress,
                "lastSyncStatus": lastSyncStatus,
                "deliveredVolume": deliveredVolume,
                "createdAt": createdAt,
                "updatedAt": updatedAt,
                "lastSyncAt": lastSyncAt,
                "documentNumber": documentNumber,
                "projectNumber": projectNumber,
                "salesResponsible": salesResponsible,
                "orderDate": orderDate,
                "deliveryDate": deliveryDate,
                "plannedStartDate": plannedStartDate,
                "deletedAt": deletedAt,
                "updatedBy": updatedBy,
                "deliveryName": deliveryName,
                "deliveryLineCount": deliveryLineCount,
            }
    
    createdAt: MetaOapg.properties.createdAt
    deliveredVolume: MetaOapg.properties.deliveredVolume
    deliveryAddress: MetaOapg.properties.deliveryAddress
    lastSyncAt: MetaOapg.properties.lastSyncAt
    customerId: MetaOapg.properties.customerId
    orderStatus: MetaOapg.properties.orderStatus
    lastSyncStatus: MetaOapg.properties.lastSyncStatus
    id: MetaOapg.properties.id
    updatedAt: MetaOapg.properties.updatedAt
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["orderStatus"]) -> MetaOapg.properties.orderStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["customerId"]) -> MetaOapg.properties.customerId: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deliveryAddress"]) -> MetaOapg.properties.deliveryAddress: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastSyncStatus"]) -> MetaOapg.properties.lastSyncStatus: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deliveredVolume"]) -> MetaOapg.properties.deliveredVolume: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["createdAt"]) -> MetaOapg.properties.createdAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updatedAt"]) -> MetaOapg.properties.updatedAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["lastSyncAt"]) -> MetaOapg.properties.lastSyncAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["documentNumber"]) -> MetaOapg.properties.documentNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["projectNumber"]) -> MetaOapg.properties.projectNumber: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["salesResponsible"]) -> MetaOapg.properties.salesResponsible: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["orderDate"]) -> MetaOapg.properties.orderDate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deliveryDate"]) -> MetaOapg.properties.deliveryDate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["plannedStartDate"]) -> MetaOapg.properties.plannedStartDate: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deletedAt"]) -> MetaOapg.properties.deletedAt: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["updatedBy"]) -> MetaOapg.properties.updatedBy: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deliveryName"]) -> MetaOapg.properties.deliveryName: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["deliveryLineCount"]) -> MetaOapg.properties.deliveryLineCount: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id", "orderStatus", "customerId", "deliveryAddress", "lastSyncStatus", "deliveredVolume", "createdAt", "updatedAt", "lastSyncAt", "documentNumber", "projectNumber", "salesResponsible", "orderDate", "deliveryDate", "plannedStartDate", "deletedAt", "updatedBy", "deliveryName", "deliveryLineCount", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["orderStatus"]) -> MetaOapg.properties.orderStatus: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["customerId"]) -> MetaOapg.properties.customerId: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deliveryAddress"]) -> MetaOapg.properties.deliveryAddress: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lastSyncStatus"]) -> MetaOapg.properties.lastSyncStatus: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deliveredVolume"]) -> MetaOapg.properties.deliveredVolume: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["createdAt"]) -> MetaOapg.properties.createdAt: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updatedAt"]) -> MetaOapg.properties.updatedAt: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["lastSyncAt"]) -> MetaOapg.properties.lastSyncAt: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["documentNumber"]) -> typing.Union[MetaOapg.properties.documentNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["projectNumber"]) -> typing.Union[MetaOapg.properties.projectNumber, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["salesResponsible"]) -> typing.Union[MetaOapg.properties.salesResponsible, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["orderDate"]) -> typing.Union[MetaOapg.properties.orderDate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deliveryDate"]) -> typing.Union[MetaOapg.properties.deliveryDate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["plannedStartDate"]) -> typing.Union[MetaOapg.properties.plannedStartDate, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deletedAt"]) -> typing.Union[MetaOapg.properties.deletedAt, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["updatedBy"]) -> typing.Union[MetaOapg.properties.updatedBy, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deliveryName"]) -> typing.Union[MetaOapg.properties.deliveryName, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["deliveryLineCount"]) -> typing.Union[MetaOapg.properties.deliveryLineCount, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id", "orderStatus", "customerId", "deliveryAddress", "lastSyncStatus", "deliveredVolume", "createdAt", "updatedAt", "lastSyncAt", "documentNumber", "projectNumber", "salesResponsible", "orderDate", "deliveryDate", "plannedStartDate", "deletedAt", "updatedBy", "deliveryName", "deliveryLineCount", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        createdAt: typing.Union[MetaOapg.properties.createdAt, str, datetime, ],
        deliveredVolume: typing.Union[MetaOapg.properties.deliveredVolume, decimal.Decimal, int, float, ],
        deliveryAddress: typing.Union[MetaOapg.properties.deliveryAddress, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        lastSyncAt: typing.Union[MetaOapg.properties.lastSyncAt, None, str, datetime, ],
        customerId: typing.Union[MetaOapg.properties.customerId, str, ],
        orderStatus: typing.Union[MetaOapg.properties.orderStatus, str, ],
        lastSyncStatus: typing.Union[MetaOapg.properties.lastSyncStatus, str, ],
        id: typing.Union[MetaOapg.properties.id, str, ],
        updatedAt: typing.Union[MetaOapg.properties.updatedAt, str, datetime, ],
        documentNumber: typing.Union[MetaOapg.properties.documentNumber, None, str, schemas.Unset] = schemas.unset,
        projectNumber: typing.Union[MetaOapg.properties.projectNumber, None, str, schemas.Unset] = schemas.unset,
        salesResponsible: typing.Union[MetaOapg.properties.salesResponsible, None, str, schemas.Unset] = schemas.unset,
        orderDate: typing.Union[MetaOapg.properties.orderDate, None, str, schemas.Unset] = schemas.unset,
        deliveryDate: typing.Union[MetaOapg.properties.deliveryDate, None, str, schemas.Unset] = schemas.unset,
        plannedStartDate: typing.Union[MetaOapg.properties.plannedStartDate, None, str, schemas.Unset] = schemas.unset,
        deletedAt: typing.Union[MetaOapg.properties.deletedAt, None, str, datetime, schemas.Unset] = schemas.unset,
        updatedBy: typing.Union[MetaOapg.properties.updatedBy, None, str, schemas.Unset] = schemas.unset,
        deliveryName: typing.Union[MetaOapg.properties.deliveryName, None, str, schemas.Unset] = schemas.unset,
        deliveryLineCount: typing.Union[MetaOapg.properties.deliveryLineCount, None, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'OrderDto':
        return super().__new__(
            cls,
            *args,
            createdAt=createdAt,
            deliveredVolume=deliveredVolume,
            deliveryAddress=deliveryAddress,
            lastSyncAt=lastSyncAt,
            customerId=customerId,
            orderStatus=orderStatus,
            lastSyncStatus=lastSyncStatus,
            id=id,
            updatedAt=updatedAt,
            documentNumber=documentNumber,
            projectNumber=projectNumber,
            salesResponsible=salesResponsible,
            orderDate=orderDate,
            deliveryDate=deliveryDate,
            plannedStartDate=plannedStartDate,
            deletedAt=deletedAt,
            updatedBy=updatedBy,
            deliveryName=deliveryName,
            deliveryLineCount=deliveryLineCount,
            _configuration=_configuration,
            **kwargs,
        )

from openapi_client.model.delivery_address_dto import DeliveryAddressDto
