/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param message 
 * @param timestamp Returns a date as a string value in ISO format.
 * @param statusCode 
 * @param code 
 */

data class ErrorDto (

    @Json(name = "message")
    val message: kotlin.String,

    /* Returns a date as a string value in ISO format. */
    @Json(name = "timestamp")
    val timestamp: kotlin.String,

    @Json(name = "statusCode")
    val statusCode: ErrorDto.StatusCode,

    @Json(name = "code")
    val code: ErrorDto.Code

) {

    /**
     * 
     *
     * Values: _400,_401,_404,_500
     */
    enum class StatusCode(val value: java.math.BigDecimal) {
        @Json(name = ""400"") _400("400"),
        @Json(name = ""401"") _401("401"),
        @Json(name = ""404"") _404("404"),
        @Json(name = ""500"") _500("500");
    }
    /**
     * 
     *
     * Values: iNTERNALERROR,iNVALIDINPUT,rEQUESTTIMEOUT,iNVALIDID,aCCESSVIOLATION,nOTNULLEXPECTED,eNDDATEISBEFORESTARTDATE,vALUEALREADYCHANGED,tOOMANYREQUESTS,nOTAUTHORIZED,lANDFILLNOTFOUND,lANDFILLINVALIDRECEIVERUSER,lANDFILLCUSTOMERREQUIRED,iNVALIDLAYERTYPEFORLANDFILL,iNVALIDSUBAREAPRICECHANGE,oRDERNOTFOUND,oRDERALREADYATTACHED,oRDERRECEIPTSDIRECTORYEXISTS,oRDERRECEIPTSDIRECTORYRENAMEERROR,oRDERRECEIPTSFILERENAMEERROR,pROJECTISNOTAVAILABLE,dUMPLOADNOTFOUND,pROJECTNAMEINVALID,pROJECTNOTFOUND,pROJECTHASORDERWITHOTHERCUSTOMER,pROJECTHASCUSTOMER,pROJECTACTIVELOCATIONCANNOTBECHANGED,pROJECTCUSTOMERREQUIRED,eMAILBLOCKED,dUMPLOADSTATUSUNKNOWN,dUMPLOADINVALIDTARGETSTATUSORNOPERMISSIONS,dUMPLOADNOPERMISSIONS,dUMPLOADEDITFORBIDDENINCURRENTSTATUS,dUMPLOADFIELDSHAVEINVALIDVALUES,dUMPLOADFIELDSINVALIDCONDITIONS,dUMPLOADNOTSPECIFIED,dUMPLOADNOTSIGNED,dUMPLOADNEEDTOSEND,dUMPLOADCUSTOMERNEEDFORSIGN,dRIVEREMAILEXISTS,dRIVERPHONEEXISTS,cANNOTSETDATEINPAST,pROJECTEDITFORBIDDENINCURRENTSTATUS,uSEREXISTS,uSERNOTFOUND,uSEREMPTYOLDPASSWORD,uSERINVALIDOLDPASSWORD,uSERPASSWORDNOTEQUAL,uSERPASSWORDSIMILARTOCURRENT,uSERHASLINKEDPROJECTS,uSERREQUIREDCUSTOMER,uSERALREADYINVITED,eMAILEXISTS,dRIVEREMPTYPASSWORD,dRIVERINVALIDOLDPASSWORD,dRIVERPASSWORDNOTEQUAL,eMPTYOWNER,dUMPTYPEEXISTS,dUMPTYPENAMECANNOTBEEMPTY,dUMPTYPEVOLUMECANNOTBEEMPTY,dUMPTYPETONSPERM3MUSTBEPOSITIVE,tOXICLIMITSINVALIDVALUE,sUBSTANCEISUSED,sUBSTANCECONTAMINATIONTYPEISUSED,pERMISSIONERROR,dELIVERYLINENOTFOUND,cOMPANYNOTFOUND,nETWORKERROR,lANDFILLSTATUSNOTFOUND,lANDFILLSTATUSNAMECANNOTBEEMPTY,lANDFILLSTATUSEXISTS,lANDFILLTYPECHANGENOTALLOWED,lANDFILLISNOTAVAILABLE,fORTNOXENTITYNOTFOUND,fORTNOXSYNCTIMEOUT,fORTNOXANOTHERSYNCINPROGRESS,fORTNOXNETWORKERROR,fORTNOXSYNCCANCELED,eMPTYCOMPANY,nOTIMPLEMENTED,dEVIATIONNOTFOUND,dEVIATIONINVALIDFIELDS,fILENOTFOUND,fILEEXISTS,fILETOOLARGE,iNVALIDFILENAME,cONVERSIONTOPDFERROR,pROJECTENDDATEBEFORESTARTDATE,pROJECTNODATECHANGEONGOINGMASS,pROJECTSTARTDATEAFTERMASSSTARTDATE,pROJECTENDDATEBEFOREMASSENDDATE,mASSSTARTDATEBEFOREPROJECTSTARTDATE,mASSSTARTDATEBEFORETODAY,mASSENDDATEBEFOREPROJECTSTARTDATE,mASSENDDATEBEFOREMASSSTARTDATE,mASSENDDATEBEFORETODAY,pROJECTENDDATEMUSTBEUPDATED,pROJECTLOCATIONONWATER,lANDFILLLOCATIONONWATER,oPENFROMAFTEROPENTO,nOOPENWORKDAY,aPIKEYNOTSPECIFIED,aPIKEYINVALID,iNVALIDLOCATION,pHONENUMBEREXISTS,pHONENUMBERHAVETOBELOCALORINTERNATIONAL,pHONENUMBERTOOSHORT,pHONENUMBERTOOLONG
     */
    enum class Code(val value: kotlin.String) {
        @Json(name = "INTERNAL_ERROR") iNTERNALERROR("INTERNAL_ERROR"),
        @Json(name = "INVALID_INPUT") iNVALIDINPUT("INVALID_INPUT"),
        @Json(name = "REQUEST_TIMEOUT") rEQUESTTIMEOUT("REQUEST_TIMEOUT"),
        @Json(name = "INVALID_ID") iNVALIDID("INVALID_ID"),
        @Json(name = "ACCESS_VIOLATION") aCCESSVIOLATION("ACCESS_VIOLATION"),
        @Json(name = "NOT_NULL_EXPECTED") nOTNULLEXPECTED("NOT_NULL_EXPECTED"),
        @Json(name = "END_DATE_IS_BEFORE_START_DATE") eNDDATEISBEFORESTARTDATE("END_DATE_IS_BEFORE_START_DATE"),
        @Json(name = "VALUE_ALREADY_CHANGED") vALUEALREADYCHANGED("VALUE_ALREADY_CHANGED"),
        @Json(name = "TOO_MANY_REQUESTS") tOOMANYREQUESTS("TOO_MANY_REQUESTS"),
        @Json(name = "NOT_AUTHORIZED") nOTAUTHORIZED("NOT_AUTHORIZED"),
        @Json(name = "LANDFILL_NOT_FOUND") lANDFILLNOTFOUND("LANDFILL_NOT_FOUND"),
        @Json(name = "LANDFILL_INVALID_RECEIVER_USER") lANDFILLINVALIDRECEIVERUSER("LANDFILL_INVALID_RECEIVER_USER"),
        @Json(name = "LANDFILL_CUSTOMER_REQUIRED") lANDFILLCUSTOMERREQUIRED("LANDFILL_CUSTOMER_REQUIRED"),
        @Json(name = "INVALID_LAYER_TYPE_FOR_LANDFILL") iNVALIDLAYERTYPEFORLANDFILL("INVALID_LAYER_TYPE_FOR_LANDFILL"),
        @Json(name = "INVALID_SUBAREA_PRICE_CHANGE") iNVALIDSUBAREAPRICECHANGE("INVALID_SUBAREA_PRICE_CHANGE"),
        @Json(name = "ORDER_NOT_FOUND") oRDERNOTFOUND("ORDER_NOT_FOUND"),
        @Json(name = "ORDER_ALREADY_ATTACHED") oRDERALREADYATTACHED("ORDER_ALREADY_ATTACHED"),
        @Json(name = "ORDER_RECEIPTS_DIRECTORY_EXISTS") oRDERRECEIPTSDIRECTORYEXISTS("ORDER_RECEIPTS_DIRECTORY_EXISTS"),
        @Json(name = "ORDER_RECEIPTS_DIRECTORY_RENAME_ERROR") oRDERRECEIPTSDIRECTORYRENAMEERROR("ORDER_RECEIPTS_DIRECTORY_RENAME_ERROR"),
        @Json(name = "ORDER_RECEIPTS_FILE_RENAME_ERROR") oRDERRECEIPTSFILERENAMEERROR("ORDER_RECEIPTS_FILE_RENAME_ERROR"),
        @Json(name = "PROJECT_IS_NOT_AVAILABLE") pROJECTISNOTAVAILABLE("PROJECT_IS_NOT_AVAILABLE"),
        @Json(name = "DUMP_LOAD_NOT_FOUND") dUMPLOADNOTFOUND("DUMP_LOAD_NOT_FOUND"),
        @Json(name = "PROJECT_NAME_INVALID") pROJECTNAMEINVALID("PROJECT_NAME_INVALID"),
        @Json(name = "PROJECT_NOT_FOUND") pROJECTNOTFOUND("PROJECT_NOT_FOUND"),
        @Json(name = "PROJECT_HAS_ORDER_WITH_OTHER_CUSTOMER") pROJECTHASORDERWITHOTHERCUSTOMER("PROJECT_HAS_ORDER_WITH_OTHER_CUSTOMER"),
        @Json(name = "PROJECT_HAS_CUSTOMER") pROJECTHASCUSTOMER("PROJECT_HAS_CUSTOMER"),
        @Json(name = "PROJECT_ACTIVE_LOCATION_CANNOT_BE_CHANGED") pROJECTACTIVELOCATIONCANNOTBECHANGED("PROJECT_ACTIVE_LOCATION_CANNOT_BE_CHANGED"),
        @Json(name = "PROJECT_CUSTOMER_REQUIRED") pROJECTCUSTOMERREQUIRED("PROJECT_CUSTOMER_REQUIRED"),
        @Json(name = "EMAIL_BLOCKED") eMAILBLOCKED("EMAIL_BLOCKED"),
        @Json(name = "DUMP_LOAD_STATUS_UNKNOWN") dUMPLOADSTATUSUNKNOWN("DUMP_LOAD_STATUS_UNKNOWN"),
        @Json(name = "DUMP_LOAD_INVALID_TARGET_STATUS_OR_NO_PERMISSIONS") dUMPLOADINVALIDTARGETSTATUSORNOPERMISSIONS("DUMP_LOAD_INVALID_TARGET_STATUS_OR_NO_PERMISSIONS"),
        @Json(name = "DUMP_LOAD_NO_PERMISSIONS") dUMPLOADNOPERMISSIONS("DUMP_LOAD_NO_PERMISSIONS"),
        @Json(name = "DUMP_LOAD_EDIT_FORBIDDEN_IN_CURRENT_STATUS") dUMPLOADEDITFORBIDDENINCURRENTSTATUS("DUMP_LOAD_EDIT_FORBIDDEN_IN_CURRENT_STATUS"),
        @Json(name = "DUMP_LOAD_FIELDS_HAVE_INVALID_VALUES") dUMPLOADFIELDSHAVEINVALIDVALUES("DUMP_LOAD_FIELDS_HAVE_INVALID_VALUES"),
        @Json(name = "DUMP_LOAD_FIELDS_INVALID_CONDITIONS") dUMPLOADFIELDSINVALIDCONDITIONS("DUMP_LOAD_FIELDS_INVALID_CONDITIONS"),
        @Json(name = "DUMP_LOAD_NOT_SPECIFIED") dUMPLOADNOTSPECIFIED("DUMP_LOAD_NOT_SPECIFIED"),
        @Json(name = "DUMP_LOAD_NOT_SIGNED") dUMPLOADNOTSIGNED("DUMP_LOAD_NOT_SIGNED"),
        @Json(name = "DUMP_LOAD_NEED_TO_SEND") dUMPLOADNEEDTOSEND("DUMP_LOAD_NEED_TO_SEND"),
        @Json(name = "DUMP_LOAD_CUSTOMER_NEED_FOR_SIGN") dUMPLOADCUSTOMERNEEDFORSIGN("DUMP_LOAD_CUSTOMER_NEED_FOR_SIGN"),
        @Json(name = "DRIVER_EMAIL_EXISTS") dRIVEREMAILEXISTS("DRIVER_EMAIL_EXISTS"),
        @Json(name = "DRIVER_PHONE_EXISTS") dRIVERPHONEEXISTS("DRIVER_PHONE_EXISTS"),
        @Json(name = "CANNOT_SET_DATE_IN_PAST") cANNOTSETDATEINPAST("CANNOT_SET_DATE_IN_PAST"),
        @Json(name = "PROJECT_EDIT_FORBIDDEN_IN_CURRENT_STATUS") pROJECTEDITFORBIDDENINCURRENTSTATUS("PROJECT_EDIT_FORBIDDEN_IN_CURRENT_STATUS"),
        @Json(name = "USER_EXISTS") uSEREXISTS("USER_EXISTS"),
        @Json(name = "USER_NOT_FOUND") uSERNOTFOUND("USER_NOT_FOUND"),
        @Json(name = "USER_EMPTY_OLD_PASSWORD") uSEREMPTYOLDPASSWORD("USER_EMPTY_OLD_PASSWORD"),
        @Json(name = "USER_INVALID_OLD_PASSWORD") uSERINVALIDOLDPASSWORD("USER_INVALID_OLD_PASSWORD"),
        @Json(name = "USER_PASSWORD_NOT_EQUAL") uSERPASSWORDNOTEQUAL("USER_PASSWORD_NOT_EQUAL"),
        @Json(name = "USER_PASSWORD_SIMILAR_TO_CURRENT") uSERPASSWORDSIMILARTOCURRENT("USER_PASSWORD_SIMILAR_TO_CURRENT"),
        @Json(name = "USER_HAS_LINKED_PROJECTS") uSERHASLINKEDPROJECTS("USER_HAS_LINKED_PROJECTS"),
        @Json(name = "USER_REQUIRED_CUSTOMER") uSERREQUIREDCUSTOMER("USER_REQUIRED_CUSTOMER"),
        @Json(name = "USER_ALREADY_INVITED") uSERALREADYINVITED("USER_ALREADY_INVITED"),
        @Json(name = "EMAIL_EXISTS") eMAILEXISTS("EMAIL_EXISTS"),
        @Json(name = "DRIVER_EMPTY_PASSWORD") dRIVEREMPTYPASSWORD("DRIVER_EMPTY_PASSWORD"),
        @Json(name = "DRIVER_INVALID_OLD_PASSWORD") dRIVERINVALIDOLDPASSWORD("DRIVER_INVALID_OLD_PASSWORD"),
        @Json(name = "DRIVER_PASSWORD_NOT_EQUAL") dRIVERPASSWORDNOTEQUAL("DRIVER_PASSWORD_NOT_EQUAL"),
        @Json(name = "EMPTY_OWNER") eMPTYOWNER("EMPTY_OWNER"),
        @Json(name = "DUMP_TYPE_EXISTS") dUMPTYPEEXISTS("DUMP_TYPE_EXISTS"),
        @Json(name = "DUMP_TYPE_NAME_CANNOT_BE_EMPTY") dUMPTYPENAMECANNOTBEEMPTY("DUMP_TYPE_NAME_CANNOT_BE_EMPTY"),
        @Json(name = "DUMP_TYPE_VOLUME_CANNOT_BE_EMPTY") dUMPTYPEVOLUMECANNOTBEEMPTY("DUMP_TYPE_VOLUME_CANNOT_BE_EMPTY"),
        @Json(name = "DUMP_TYPE_TONS_PER_M3_MUST_BE_POSITIVE") dUMPTYPETONSPERM3MUSTBEPOSITIVE("DUMP_TYPE_TONS_PER_M3_MUST_BE_POSITIVE"),
        @Json(name = "TOXIC_LIMITS_INVALID_VALUE") tOXICLIMITSINVALIDVALUE("TOXIC_LIMITS_INVALID_VALUE"),
        @Json(name = "SUBSTANCE_IS_USED") sUBSTANCEISUSED("SUBSTANCE_IS_USED"),
        @Json(name = "SUBSTANCE_CONTAMINATION_TYPE_IS_USED") sUBSTANCECONTAMINATIONTYPEISUSED("SUBSTANCE_CONTAMINATION_TYPE_IS_USED"),
        @Json(name = "PERMISSION_ERROR") pERMISSIONERROR("PERMISSION_ERROR"),
        @Json(name = "DELIVERY_LINE_NOT_FOUND") dELIVERYLINENOTFOUND("DELIVERY_LINE_NOT_FOUND"),
        @Json(name = "COMPANY_NOT_FOUND") cOMPANYNOTFOUND("COMPANY_NOT_FOUND"),
        @Json(name = "NETWORK_ERROR") nETWORKERROR("NETWORK_ERROR"),
        @Json(name = "LANDFILL_STATUS_NOT_FOUND") lANDFILLSTATUSNOTFOUND("LANDFILL_STATUS_NOT_FOUND"),
        @Json(name = "LANDFILL_STATUS_NAME_CANNOT_BE_EMPTY") lANDFILLSTATUSNAMECANNOTBEEMPTY("LANDFILL_STATUS_NAME_CANNOT_BE_EMPTY"),
        @Json(name = "LANDFILL_STATUS_EXISTS") lANDFILLSTATUSEXISTS("LANDFILL_STATUS_EXISTS"),
        @Json(name = "LANDFILL_TYPE_CHANGE_NOT_ALLOWED") lANDFILLTYPECHANGENOTALLOWED("LANDFILL_TYPE_CHANGE_NOT_ALLOWED"),
        @Json(name = "LANDFILL_IS_NOT_AVAILABLE") lANDFILLISNOTAVAILABLE("LANDFILL_IS_NOT_AVAILABLE"),
        @Json(name = "FORTNOX_ENTITY_NOT_FOUND") fORTNOXENTITYNOTFOUND("FORTNOX_ENTITY_NOT_FOUND"),
        @Json(name = "FORTNOX_SYNC_TIMEOUT") fORTNOXSYNCTIMEOUT("FORTNOX_SYNC_TIMEOUT"),
        @Json(name = "FORTNOX_ANOTHER_SYNC_IN_PROGRESS") fORTNOXANOTHERSYNCINPROGRESS("FORTNOX_ANOTHER_SYNC_IN_PROGRESS"),
        @Json(name = "FORTNOX_NETWORK_ERROR") fORTNOXNETWORKERROR("FORTNOX_NETWORK_ERROR"),
        @Json(name = "FORTNOX_SYNC_CANCELED") fORTNOXSYNCCANCELED("FORTNOX_SYNC_CANCELED"),
        @Json(name = "EMPTY_COMPANY") eMPTYCOMPANY("EMPTY_COMPANY"),
        @Json(name = "NOT_IMPLEMENTED") nOTIMPLEMENTED("NOT_IMPLEMENTED"),
        @Json(name = "DEVIATION_NOT_FOUND") dEVIATIONNOTFOUND("DEVIATION_NOT_FOUND"),
        @Json(name = "DEVIATION_INVALID_FIELDS") dEVIATIONINVALIDFIELDS("DEVIATION_INVALID_FIELDS"),
        @Json(name = "FILE_NOT_FOUND") fILENOTFOUND("FILE_NOT_FOUND"),
        @Json(name = "FILE_EXISTS") fILEEXISTS("FILE_EXISTS"),
        @Json(name = "FILE_TOO_LARGE") fILETOOLARGE("FILE_TOO_LARGE"),
        @Json(name = "INVALID_FILE_NAME") iNVALIDFILENAME("INVALID_FILE_NAME"),
        @Json(name = "CONVERSION_TO_PDF_ERROR") cONVERSIONTOPDFERROR("CONVERSION_TO_PDF_ERROR"),
        @Json(name = "PROJECT_END_DATE_BEFORE_START_DATE") pROJECTENDDATEBEFORESTARTDATE("PROJECT_END_DATE_BEFORE_START_DATE"),
        @Json(name = "PROJECT_NO_DATE_CHANGE_ONGOING_MASS") pROJECTNODATECHANGEONGOINGMASS("PROJECT_NO_DATE_CHANGE_ONGOING_MASS"),
        @Json(name = "PROJECT_START_DATE_AFTER_MASS_START_DATE") pROJECTSTARTDATEAFTERMASSSTARTDATE("PROJECT_START_DATE_AFTER_MASS_START_DATE"),
        @Json(name = "PROJECT_END_DATE_BEFORE_MASS_END_DATE") pROJECTENDDATEBEFOREMASSENDDATE("PROJECT_END_DATE_BEFORE_MASS_END_DATE"),
        @Json(name = "MASS_START_DATE_BEFORE_PROJECT_START_DATE") mASSSTARTDATEBEFOREPROJECTSTARTDATE("MASS_START_DATE_BEFORE_PROJECT_START_DATE"),
        @Json(name = "MASS_START_DATE_BEFORE_TODAY") mASSSTARTDATEBEFORETODAY("MASS_START_DATE_BEFORE_TODAY"),
        @Json(name = "MASS_END_DATE_BEFORE_PROJECT_START_DATE") mASSENDDATEBEFOREPROJECTSTARTDATE("MASS_END_DATE_BEFORE_PROJECT_START_DATE"),
        @Json(name = "MASS_END_DATE_BEFORE_MASS_START_DATE") mASSENDDATEBEFOREMASSSTARTDATE("MASS_END_DATE_BEFORE_MASS_START_DATE"),
        @Json(name = "MASS_END_DATE_BEFORE_TODAY") mASSENDDATEBEFORETODAY("MASS_END_DATE_BEFORE_TODAY"),
        @Json(name = "PROJECT_END_DATE_MUST_BE_UPDATED") pROJECTENDDATEMUSTBEUPDATED("PROJECT_END_DATE_MUST_BE_UPDATED"),
        @Json(name = "PROJECT_LOCATION_ON_WATER") pROJECTLOCATIONONWATER("PROJECT_LOCATION_ON_WATER"),
        @Json(name = "LANDFILL_LOCATION_ON_WATER") lANDFILLLOCATIONONWATER("LANDFILL_LOCATION_ON_WATER"),
        @Json(name = "OPEN_FROM_AFTER_OPEN_TO") oPENFROMAFTEROPENTO("OPEN_FROM_AFTER_OPEN_TO"),
        @Json(name = "NO_OPEN_WORK_DAY") nOOPENWORKDAY("NO_OPEN_WORK_DAY"),
        @Json(name = "API_KEY_NOT_SPECIFIED") aPIKEYNOTSPECIFIED("API_KEY_NOT_SPECIFIED"),
        @Json(name = "API_KEY_INVALID") aPIKEYINVALID("API_KEY_INVALID"),
        @Json(name = "INVALID_LOCATION") iNVALIDLOCATION("INVALID_LOCATION"),
        @Json(name = "PHONE_NUMBER_EXISTS") pHONENUMBEREXISTS("PHONE_NUMBER_EXISTS"),
        @Json(name = "PHONE_NUMBER_HAVE_TO_BE_LOCAL_OR_INTERNATIONAL") pHONENUMBERHAVETOBELOCALORINTERNATIONAL("PHONE_NUMBER_HAVE_TO_BE_LOCAL_OR_INTERNATIONAL"),
        @Json(name = "PHONE_NUMBER_TOO_SHORT") pHONENUMBERTOOSHORT("PHONE_NUMBER_TOO_SHORT"),
        @Json(name = "PHONE_NUMBER_TOO_LONG") pHONENUMBERTOOLONG("PHONE_NUMBER_TOO_LONG");
    }
}

