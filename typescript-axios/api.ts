/* tslint:disable */
/* eslint-disable */
/**
 * Integration
 *          Here can be some description if that needed     
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { Configuration } from './configuration';
import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from './base';

/**
 * 
 * @export
 * @interface DeliveryAddressDto
 */
export interface DeliveryAddressDto {
    /**
     * Stad
     * @type {string}
     * @memberof DeliveryAddressDto
     */
    'city'?: string | null;
    /**
     * Land
     * @type {string}
     * @memberof DeliveryAddressDto
     */
    'country'?: string | null;
    /**
     * Postnummer
     * @type {string}
     * @memberof DeliveryAddressDto
     */
    'postalCode'?: string | null;
    /**
     * Adressrad #1
     * @type {string}
     * @memberof DeliveryAddressDto
     */
    'addressLine1'?: string | null;
    /**
     * Adressrad #2
     * @type {string}
     * @memberof DeliveryAddressDto
     */
    'addressLine2'?: string | null;
}
/**
 * 
 * @export
 * @interface ErrorDto
 */
export interface ErrorDto {
    /**
     * 
     * @type {string}
     * @memberof ErrorDto
     */
    'message': string;
    /**
     * Returns a date as a string value in ISO format.
     * @type {string}
     * @memberof ErrorDto
     */
    'timestamp': string;
    /**
     * 
     * @type {number}
     * @memberof ErrorDto
     */
    'statusCode': ErrorDtoStatusCodeEnum;
    /**
     * 
     * @type {string}
     * @memberof ErrorDto
     */
    'code': ErrorDtoCodeEnum;
}

export const ErrorDtoStatusCodeEnum = {
    NUMBER_400: 400,
    NUMBER_401: 401,
    NUMBER_404: 404,
    NUMBER_500: 500
} as const;

export type ErrorDtoStatusCodeEnum = typeof ErrorDtoStatusCodeEnum[keyof typeof ErrorDtoStatusCodeEnum];
export const ErrorDtoCodeEnum = {
    InternalError: 'INTERNAL_ERROR',
    InvalidInput: 'INVALID_INPUT',
    RequestTimeout: 'REQUEST_TIMEOUT',
    InvalidId: 'INVALID_ID',
    AccessViolation: 'ACCESS_VIOLATION',
    NotNullExpected: 'NOT_NULL_EXPECTED',
    EndDateIsBeforeStartDate: 'END_DATE_IS_BEFORE_START_DATE',
    ValueAlreadyChanged: 'VALUE_ALREADY_CHANGED',
    TooManyRequests: 'TOO_MANY_REQUESTS',
    NotAuthorized: 'NOT_AUTHORIZED',
    LandfillNotFound: 'LANDFILL_NOT_FOUND',
    LandfillInvalidReceiverUser: 'LANDFILL_INVALID_RECEIVER_USER',
    LandfillCustomerRequired: 'LANDFILL_CUSTOMER_REQUIRED',
    InvalidLayerTypeForLandfill: 'INVALID_LAYER_TYPE_FOR_LANDFILL',
    InvalidSubareaPriceChange: 'INVALID_SUBAREA_PRICE_CHANGE',
    OrderNotFound: 'ORDER_NOT_FOUND',
    OrderAlreadyAttached: 'ORDER_ALREADY_ATTACHED',
    OrderReceiptsDirectoryExists: 'ORDER_RECEIPTS_DIRECTORY_EXISTS',
    OrderReceiptsDirectoryRenameError: 'ORDER_RECEIPTS_DIRECTORY_RENAME_ERROR',
    OrderReceiptsFileRenameError: 'ORDER_RECEIPTS_FILE_RENAME_ERROR',
    ProjectIsNotAvailable: 'PROJECT_IS_NOT_AVAILABLE',
    DumpLoadNotFound: 'DUMP_LOAD_NOT_FOUND',
    ProjectNameInvalid: 'PROJECT_NAME_INVALID',
    ProjectNotFound: 'PROJECT_NOT_FOUND',
    ProjectHasOrderWithOtherCustomer: 'PROJECT_HAS_ORDER_WITH_OTHER_CUSTOMER',
    ProjectHasCustomer: 'PROJECT_HAS_CUSTOMER',
    ProjectActiveLocationCannotBeChanged: 'PROJECT_ACTIVE_LOCATION_CANNOT_BE_CHANGED',
    ProjectCustomerRequired: 'PROJECT_CUSTOMER_REQUIRED',
    EmailBlocked: 'EMAIL_BLOCKED',
    DumpLoadStatusUnknown: 'DUMP_LOAD_STATUS_UNKNOWN',
    DumpLoadInvalidTargetStatusOrNoPermissions: 'DUMP_LOAD_INVALID_TARGET_STATUS_OR_NO_PERMISSIONS',
    DumpLoadNoPermissions: 'DUMP_LOAD_NO_PERMISSIONS',
    DumpLoadEditForbiddenInCurrentStatus: 'DUMP_LOAD_EDIT_FORBIDDEN_IN_CURRENT_STATUS',
    DumpLoadFieldsHaveInvalidValues: 'DUMP_LOAD_FIELDS_HAVE_INVALID_VALUES',
    DumpLoadFieldsInvalidConditions: 'DUMP_LOAD_FIELDS_INVALID_CONDITIONS',
    DumpLoadNotSpecified: 'DUMP_LOAD_NOT_SPECIFIED',
    DumpLoadNotSigned: 'DUMP_LOAD_NOT_SIGNED',
    DumpLoadNeedToSend: 'DUMP_LOAD_NEED_TO_SEND',
    DumpLoadCustomerNeedForSign: 'DUMP_LOAD_CUSTOMER_NEED_FOR_SIGN',
    DriverEmailExists: 'DRIVER_EMAIL_EXISTS',
    DriverPhoneExists: 'DRIVER_PHONE_EXISTS',
    CannotSetDateInPast: 'CANNOT_SET_DATE_IN_PAST',
    ProjectEditForbiddenInCurrentStatus: 'PROJECT_EDIT_FORBIDDEN_IN_CURRENT_STATUS',
    UserExists: 'USER_EXISTS',
    UserNotFound: 'USER_NOT_FOUND',
    UserEmptyOldPassword: 'USER_EMPTY_OLD_PASSWORD',
    UserInvalidOldPassword: 'USER_INVALID_OLD_PASSWORD',
    UserPasswordNotEqual: 'USER_PASSWORD_NOT_EQUAL',
    UserPasswordSimilarToCurrent: 'USER_PASSWORD_SIMILAR_TO_CURRENT',
    UserHasLinkedProjects: 'USER_HAS_LINKED_PROJECTS',
    UserRequiredCustomer: 'USER_REQUIRED_CUSTOMER',
    UserAlreadyInvited: 'USER_ALREADY_INVITED',
    EmailExists: 'EMAIL_EXISTS',
    DriverEmptyPassword: 'DRIVER_EMPTY_PASSWORD',
    DriverInvalidOldPassword: 'DRIVER_INVALID_OLD_PASSWORD',
    DriverPasswordNotEqual: 'DRIVER_PASSWORD_NOT_EQUAL',
    EmptyOwner: 'EMPTY_OWNER',
    DumpTypeExists: 'DUMP_TYPE_EXISTS',
    DumpTypeNameCannotBeEmpty: 'DUMP_TYPE_NAME_CANNOT_BE_EMPTY',
    DumpTypeVolumeCannotBeEmpty: 'DUMP_TYPE_VOLUME_CANNOT_BE_EMPTY',
    DumpTypeTonsPerM3MustBePositive: 'DUMP_TYPE_TONS_PER_M3_MUST_BE_POSITIVE',
    ToxicLimitsInvalidValue: 'TOXIC_LIMITS_INVALID_VALUE',
    SubstanceIsUsed: 'SUBSTANCE_IS_USED',
    SubstanceContaminationTypeIsUsed: 'SUBSTANCE_CONTAMINATION_TYPE_IS_USED',
    PermissionError: 'PERMISSION_ERROR',
    DeliveryLineNotFound: 'DELIVERY_LINE_NOT_FOUND',
    CompanyNotFound: 'COMPANY_NOT_FOUND',
    NetworkError: 'NETWORK_ERROR',
    LandfillStatusNotFound: 'LANDFILL_STATUS_NOT_FOUND',
    LandfillStatusNameCannotBeEmpty: 'LANDFILL_STATUS_NAME_CANNOT_BE_EMPTY',
    LandfillStatusExists: 'LANDFILL_STATUS_EXISTS',
    LandfillTypeChangeNotAllowed: 'LANDFILL_TYPE_CHANGE_NOT_ALLOWED',
    LandfillIsNotAvailable: 'LANDFILL_IS_NOT_AVAILABLE',
    FortnoxEntityNotFound: 'FORTNOX_ENTITY_NOT_FOUND',
    FortnoxSyncTimeout: 'FORTNOX_SYNC_TIMEOUT',
    FortnoxAnotherSyncInProgress: 'FORTNOX_ANOTHER_SYNC_IN_PROGRESS',
    FortnoxNetworkError: 'FORTNOX_NETWORK_ERROR',
    FortnoxSyncCanceled: 'FORTNOX_SYNC_CANCELED',
    EmptyCompany: 'EMPTY_COMPANY',
    NotImplemented: 'NOT_IMPLEMENTED',
    DeviationNotFound: 'DEVIATION_NOT_FOUND',
    DeviationInvalidFields: 'DEVIATION_INVALID_FIELDS',
    FileNotFound: 'FILE_NOT_FOUND',
    FileExists: 'FILE_EXISTS',
    FileTooLarge: 'FILE_TOO_LARGE',
    InvalidFileName: 'INVALID_FILE_NAME',
    ConversionToPdfError: 'CONVERSION_TO_PDF_ERROR',
    ProjectEndDateBeforeStartDate: 'PROJECT_END_DATE_BEFORE_START_DATE',
    ProjectNoDateChangeOngoingMass: 'PROJECT_NO_DATE_CHANGE_ONGOING_MASS',
    ProjectStartDateAfterMassStartDate: 'PROJECT_START_DATE_AFTER_MASS_START_DATE',
    ProjectEndDateBeforeMassEndDate: 'PROJECT_END_DATE_BEFORE_MASS_END_DATE',
    MassStartDateBeforeProjectStartDate: 'MASS_START_DATE_BEFORE_PROJECT_START_DATE',
    MassStartDateBeforeToday: 'MASS_START_DATE_BEFORE_TODAY',
    MassEndDateBeforeProjectStartDate: 'MASS_END_DATE_BEFORE_PROJECT_START_DATE',
    MassEndDateBeforeMassStartDate: 'MASS_END_DATE_BEFORE_MASS_START_DATE',
    MassEndDateBeforeToday: 'MASS_END_DATE_BEFORE_TODAY',
    ProjectEndDateMustBeUpdated: 'PROJECT_END_DATE_MUST_BE_UPDATED',
    ProjectLocationOnWater: 'PROJECT_LOCATION_ON_WATER',
    LandfillLocationOnWater: 'LANDFILL_LOCATION_ON_WATER',
    OpenFromAfterOpenTo: 'OPEN_FROM_AFTER_OPEN_TO',
    NoOpenWorkDay: 'NO_OPEN_WORK_DAY',
    ApiKeyNotSpecified: 'API_KEY_NOT_SPECIFIED',
    ApiKeyInvalid: 'API_KEY_INVALID',
    InvalidLocation: 'INVALID_LOCATION',
    PhoneNumberExists: 'PHONE_NUMBER_EXISTS',
    PhoneNumberHaveToBeLocalOrInternational: 'PHONE_NUMBER_HAVE_TO_BE_LOCAL_OR_INTERNATIONAL',
    PhoneNumberTooShort: 'PHONE_NUMBER_TOO_SHORT',
    PhoneNumberTooLong: 'PHONE_NUMBER_TOO_LONG'
} as const;

export type ErrorDtoCodeEnum = typeof ErrorDtoCodeEnum[keyof typeof ErrorDtoCodeEnum];

/**
 * 
 * @export
 * @interface ErrorMetaDto
 */
export interface ErrorMetaDto {
    /**
     * 
     * @type {string}
     * @memberof ErrorMetaDto
     */
    'key': string;
    /**
     * 
     * @type {object}
     * @memberof ErrorMetaDto
     */
    'value': object;
    /**
     * 
     * @type {string}
     * @memberof ErrorMetaDto
     */
    'msg': string;
}
/**
 * 
 * @export
 * @interface OrderDto
 */
export interface OrderDto {
    /**
     * Ordernummer
     * @type {string}
     * @memberof OrderDto
     */
    'id': string;
    /**
     * Orderstatus
     * @type {string}
     * @memberof OrderDto
     */
    'orderStatus': OrderDtoOrderStatusEnum;
    /**
     * Kund
     * @type {string}
     * @memberof OrderDto
     */
    'customerId': string;
    /**
     * 
     * @type {OrderDtoDeliveryAddress}
     * @memberof OrderDto
     */
    'deliveryAddress': OrderDtoDeliveryAddress;
    /**
     * Synkronisering status
     * @type {string}
     * @memberof OrderDto
     */
    'lastSyncStatus': OrderDtoLastSyncStatusEnum;
    /**
     * Levererad volym
     * @type {number}
     * @memberof OrderDto
     */
    'deliveredVolume': number;
    /**
     * Skapades
     * @type {string}
     * @memberof OrderDto
     */
    'createdAt': string;
    /**
     * Senast ändrad
     * @type {string}
     * @memberof OrderDto
     */
    'updatedAt': string;
    /**
     * Synkronisera
     * @type {string}
     * @memberof OrderDto
     */
    'lastSyncAt': string | null;
    /**
     * Dokumentnummer
     * @type {string}
     * @memberof OrderDto
     */
    'documentNumber'?: string | null;
    /**
     * Projektnummer
     * @type {string}
     * @memberof OrderDto
     */
    'projectNumber'?: string | null;
    /**
     * Ansvarig säljare
     * @type {string}
     * @memberof OrderDto
     */
    'salesResponsible'?: string | null;
    /**
     * Orderdatum
     * @type {string}
     * @memberof OrderDto
     */
    'orderDate'?: string | null;
    /**
     * Leveransdatum
     * @type {string}
     * @memberof OrderDto
     */
    'deliveryDate'?: string | null;
    /**
     * Planerat Startdatum
     * @type {string}
     * @memberof OrderDto
     */
    'plannedStartDate'?: string | null;
    /**
     * 
     * @type {string}
     * @memberof OrderDto
     */
    'deletedAt'?: string | null;
    /**
     * 
     * @type {string}
     * @memberof OrderDto
     */
    'updatedBy'?: string | null;
    /**
     * Mottagarnamn
     * @type {string}
     * @memberof OrderDto
     */
    'deliveryName'?: string | null;
    /**
     * Leveranser
     * @type {number}
     * @memberof OrderDto
     */
    'deliveryLineCount'?: number | null;
}

export const OrderDtoOrderStatusEnum = {
    Closed: 'CLOSED',
    Opened: 'OPENED'
} as const;

export type OrderDtoOrderStatusEnum = typeof OrderDtoOrderStatusEnum[keyof typeof OrderDtoOrderStatusEnum];
export const OrderDtoLastSyncStatusEnum = {
    Error: 'ERROR',
    Success: 'SUCCESS',
    Unknown: 'UNKNOWN'
} as const;

export type OrderDtoLastSyncStatusEnum = typeof OrderDtoLastSyncStatusEnum[keyof typeof OrderDtoLastSyncStatusEnum];

/**
 * Mottagningsplats
 * @export
 * @interface OrderDtoDeliveryAddress
 */
export interface OrderDtoDeliveryAddress {
    /**
     * Stad
     * @type {string}
     * @memberof OrderDtoDeliveryAddress
     */
    'city'?: string | null;
    /**
     * Land
     * @type {string}
     * @memberof OrderDtoDeliveryAddress
     */
    'country'?: string | null;
    /**
     * Postnummer
     * @type {string}
     * @memberof OrderDtoDeliveryAddress
     */
    'postalCode'?: string | null;
    /**
     * Adressrad #1
     * @type {string}
     * @memberof OrderDtoDeliveryAddress
     */
    'addressLine1'?: string | null;
    /**
     * Adressrad #2
     * @type {string}
     * @memberof OrderDtoDeliveryAddress
     */
    'addressLine2'?: string | null;
}
/**
 * @type ReadOrder400Response
 * @export
 */
export type ReadOrder400Response = ErrorDto | ValidationErrorDto;

/**
 * 
 * @export
 * @interface ServerErrorDto
 */
export interface ServerErrorDto {
    /**
     * 
     * @type {string}
     * @memberof ServerErrorDto
     */
    'message': string;
    /**
     * Returns a date as a string value in ISO format.
     * @type {string}
     * @memberof ServerErrorDto
     */
    'timestamp': string;
    /**
     * 
     * @type {number}
     * @memberof ServerErrorDto
     */
    'statusCode': ServerErrorDtoStatusCodeEnum;
    /**
     * 
     * @type {string}
     * @memberof ServerErrorDto
     */
    'code': ServerErrorDtoCodeEnum;
}

export const ServerErrorDtoStatusCodeEnum = {
    NUMBER_500: 500
} as const;

export type ServerErrorDtoStatusCodeEnum = typeof ServerErrorDtoStatusCodeEnum[keyof typeof ServerErrorDtoStatusCodeEnum];
export const ServerErrorDtoCodeEnum = {
    InternalError: 'INTERNAL_ERROR'
} as const;

export type ServerErrorDtoCodeEnum = typeof ServerErrorDtoCodeEnum[keyof typeof ServerErrorDtoCodeEnum];

/**
 * 
 * @export
 * @interface UnauthorizedErrorDto
 */
export interface UnauthorizedErrorDto {
    /**
     * 
     * @type {string}
     * @memberof UnauthorizedErrorDto
     */
    'message': string;
    /**
     * Returns a date as a string value in ISO format.
     * @type {string}
     * @memberof UnauthorizedErrorDto
     */
    'timestamp': string;
    /**
     * 
     * @type {number}
     * @memberof UnauthorizedErrorDto
     */
    'statusCode': UnauthorizedErrorDtoStatusCodeEnum;
    /**
     * 
     * @type {string}
     * @memberof UnauthorizedErrorDto
     */
    'code': UnauthorizedErrorDtoCodeEnum;
}

export const UnauthorizedErrorDtoStatusCodeEnum = {
    NUMBER_401: 401
} as const;

export type UnauthorizedErrorDtoStatusCodeEnum = typeof UnauthorizedErrorDtoStatusCodeEnum[keyof typeof UnauthorizedErrorDtoStatusCodeEnum];
export const UnauthorizedErrorDtoCodeEnum = {
    NotAuthorized: 'NOT_AUTHORIZED'
} as const;

export type UnauthorizedErrorDtoCodeEnum = typeof UnauthorizedErrorDtoCodeEnum[keyof typeof UnauthorizedErrorDtoCodeEnum];

/**
 * 
 * @export
 * @interface ValidationErrorDto
 */
export interface ValidationErrorDto {
    /**
     * 
     * @type {string}
     * @memberof ValidationErrorDto
     */
    'message': string;
    /**
     * Returns a date as a string value in ISO format.
     * @type {string}
     * @memberof ValidationErrorDto
     */
    'timestamp': string;
    /**
     * 
     * @type {number}
     * @memberof ValidationErrorDto
     */
    'statusCode': ValidationErrorDtoStatusCodeEnum;
    /**
     * 
     * @type {string}
     * @memberof ValidationErrorDto
     */
    'code': ValidationErrorDtoCodeEnum;
    /**
     * 
     * @type {ErrorMetaDto}
     * @memberof ValidationErrorDto
     */
    'meta': ErrorMetaDto;
}

export const ValidationErrorDtoStatusCodeEnum = {
    NUMBER_400: 400
} as const;

export type ValidationErrorDtoStatusCodeEnum = typeof ValidationErrorDtoStatusCodeEnum[keyof typeof ValidationErrorDtoStatusCodeEnum];
export const ValidationErrorDtoCodeEnum = {
    InvalidInput: 'INVALID_INPUT'
} as const;

export type ValidationErrorDtoCodeEnum = typeof ValidationErrorDtoCodeEnum[keyof typeof ValidationErrorDtoCodeEnum];


/**
 * OrdersApi - axios parameter creator
 * @export
 */
export const OrdersApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary 
         * @param {string} [deliveryCity] Stad
         * @param {number} [deliveryLineCountFrom] 
         * @param {number} [deliveryLineCountTo] 
         * @param {string} [deliveryName] Mottagarnamn
         * @param {string} [documentNumber] Dokumentnummer
         * @param {number} [dvolumeFrom] Levererad volym från
         * @param {number} [dvolumeTo] Levererad volym till
         * @param {string} [endDate] Slutdatum
         * @param {boolean} [excludeAttached] 
         * @param {boolean} [isCloseFilter] 
         * @param {boolean} [isOpenFilter] 
         * @param {string} [startDate] Startdatum
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listOrders: async (deliveryCity?: string, deliveryLineCountFrom?: number, deliveryLineCountTo?: number, deliveryName?: string, documentNumber?: string, dvolumeFrom?: number, dvolumeTo?: number, endDate?: string, excludeAttached?: boolean, isCloseFilter?: boolean, isOpenFilter?: boolean, startDate?: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            const localVarPath = `/api-ext/v1.0/orders`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)

            if (deliveryCity !== undefined) {
                localVarQueryParameter['deliveryCity'] = deliveryCity;
            }

            if (deliveryLineCountFrom !== undefined) {
                localVarQueryParameter['deliveryLineCountFrom'] = deliveryLineCountFrom;
            }

            if (deliveryLineCountTo !== undefined) {
                localVarQueryParameter['deliveryLineCountTo'] = deliveryLineCountTo;
            }

            if (deliveryName !== undefined) {
                localVarQueryParameter['deliveryName'] = deliveryName;
            }

            if (documentNumber !== undefined) {
                localVarQueryParameter['documentNumber'] = documentNumber;
            }

            if (dvolumeFrom !== undefined) {
                localVarQueryParameter['dvolumeFrom'] = dvolumeFrom;
            }

            if (dvolumeTo !== undefined) {
                localVarQueryParameter['dvolumeTo'] = dvolumeTo;
            }

            if (endDate !== undefined) {
                localVarQueryParameter['endDate'] = endDate;
            }

            if (excludeAttached !== undefined) {
                localVarQueryParameter['excludeAttached'] = excludeAttached;
            }

            if (isCloseFilter !== undefined) {
                localVarQueryParameter['isCloseFilter'] = isCloseFilter;
            }

            if (isOpenFilter !== undefined) {
                localVarQueryParameter['isOpenFilter'] = isOpenFilter;
            }

            if (startDate !== undefined) {
                localVarQueryParameter['startDate'] = startDate;
            }


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary 
         * @param {string} orderNumber 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        readOrder: async (orderNumber: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'orderNumber' is not null or undefined
            assertParamExists('readOrder', 'orderNumber', orderNumber)
            const localVarPath = `/api-ext/v1.0/orders/{orderNumber}`
                .replace(`{${"orderNumber"}}`, encodeURIComponent(String(orderNumber)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication bearer required
            // http bearer authentication required
            await setBearerAuthToObject(localVarHeaderParameter, configuration)


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * OrdersApi - functional programming interface
 * @export
 */
export const OrdersApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = OrdersApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary 
         * @param {string} [deliveryCity] Stad
         * @param {number} [deliveryLineCountFrom] 
         * @param {number} [deliveryLineCountTo] 
         * @param {string} [deliveryName] Mottagarnamn
         * @param {string} [documentNumber] Dokumentnummer
         * @param {number} [dvolumeFrom] Levererad volym från
         * @param {number} [dvolumeTo] Levererad volym till
         * @param {string} [endDate] Slutdatum
         * @param {boolean} [excludeAttached] 
         * @param {boolean} [isCloseFilter] 
         * @param {boolean} [isOpenFilter] 
         * @param {string} [startDate] Startdatum
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listOrders(deliveryCity?: string, deliveryLineCountFrom?: number, deliveryLineCountTo?: number, deliveryName?: string, documentNumber?: string, dvolumeFrom?: number, dvolumeTo?: number, endDate?: string, excludeAttached?: boolean, isCloseFilter?: boolean, isOpenFilter?: boolean, startDate?: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<OrderDto>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary 
         * @param {string} orderNumber 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async readOrder(orderNumber: string, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<OrderDto>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.readOrder(orderNumber, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * OrdersApi - factory interface
 * @export
 */
export const OrdersApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = OrdersApiFp(configuration)
    return {
        /**
         * 
         * @summary 
         * @param {string} [deliveryCity] Stad
         * @param {number} [deliveryLineCountFrom] 
         * @param {number} [deliveryLineCountTo] 
         * @param {string} [deliveryName] Mottagarnamn
         * @param {string} [documentNumber] Dokumentnummer
         * @param {number} [dvolumeFrom] Levererad volym från
         * @param {number} [dvolumeTo] Levererad volym till
         * @param {string} [endDate] Slutdatum
         * @param {boolean} [excludeAttached] 
         * @param {boolean} [isCloseFilter] 
         * @param {boolean} [isOpenFilter] 
         * @param {string} [startDate] Startdatum
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listOrders(deliveryCity?: string, deliveryLineCountFrom?: number, deliveryLineCountTo?: number, deliveryName?: string, documentNumber?: string, dvolumeFrom?: number, dvolumeTo?: number, endDate?: string, excludeAttached?: boolean, isCloseFilter?: boolean, isOpenFilter?: boolean, startDate?: string, options?: any): AxiosPromise<Array<OrderDto>> {
            return localVarFp.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary 
         * @param {string} orderNumber 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        readOrder(orderNumber: string, options?: any): AxiosPromise<OrderDto> {
            return localVarFp.readOrder(orderNumber, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * OrdersApi - object-oriented interface
 * @export
 * @class OrdersApi
 * @extends {BaseAPI}
 */
export class OrdersApi extends BaseAPI {
    /**
     * 
     * @summary 
     * @param {string} [deliveryCity] Stad
     * @param {number} [deliveryLineCountFrom] 
     * @param {number} [deliveryLineCountTo] 
     * @param {string} [deliveryName] Mottagarnamn
     * @param {string} [documentNumber] Dokumentnummer
     * @param {number} [dvolumeFrom] Levererad volym från
     * @param {number} [dvolumeTo] Levererad volym till
     * @param {string} [endDate] Slutdatum
     * @param {boolean} [excludeAttached] 
     * @param {boolean} [isCloseFilter] 
     * @param {boolean} [isOpenFilter] 
     * @param {string} [startDate] Startdatum
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrdersApi
     */
    public listOrders(deliveryCity?: string, deliveryLineCountFrom?: number, deliveryLineCountTo?: number, deliveryName?: string, documentNumber?: string, dvolumeFrom?: number, dvolumeTo?: number, endDate?: string, excludeAttached?: boolean, isCloseFilter?: boolean, isOpenFilter?: boolean, startDate?: string, options?: AxiosRequestConfig) {
        return OrdersApiFp(this.configuration).listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary 
     * @param {string} orderNumber 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof OrdersApi
     */
    public readOrder(orderNumber: string, options?: AxiosRequestConfig) {
        return OrdersApiFp(this.configuration).readOrder(orderNumber, options).then((request) => request(this.axios, this.basePath));
    }
}

