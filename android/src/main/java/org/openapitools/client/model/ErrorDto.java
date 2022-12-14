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

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ErrorDto {
  
  @SerializedName("message")
  private String message = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  public enum StatusCodeEnum {
     400,  401,  404,  500, 
  };
  @SerializedName("statusCode")
  private StatusCodeEnum statusCode = null;
  public enum CodeEnum {
     INTERNAL_ERROR,  INVALID_INPUT,  REQUEST_TIMEOUT,  INVALID_ID,  ACCESS_VIOLATION,  NOT_NULL_EXPECTED,  END_DATE_IS_BEFORE_START_DATE,  VALUE_ALREADY_CHANGED,  TOO_MANY_REQUESTS,  NOT_AUTHORIZED,  LANDFILL_NOT_FOUND,  LANDFILL_INVALID_RECEIVER_USER,  LANDFILL_CUSTOMER_REQUIRED,  INVALID_LAYER_TYPE_FOR_LANDFILL,  INVALID_SUBAREA_PRICE_CHANGE,  ORDER_NOT_FOUND,  ORDER_ALREADY_ATTACHED,  ORDER_RECEIPTS_DIRECTORY_EXISTS,  ORDER_RECEIPTS_DIRECTORY_RENAME_ERROR,  ORDER_RECEIPTS_FILE_RENAME_ERROR,  PROJECT_IS_NOT_AVAILABLE,  DUMP_LOAD_NOT_FOUND,  PROJECT_NAME_INVALID,  PROJECT_NOT_FOUND,  PROJECT_HAS_ORDER_WITH_OTHER_CUSTOMER,  PROJECT_HAS_CUSTOMER,  PROJECT_ACTIVE_LOCATION_CANNOT_BE_CHANGED,  PROJECT_CUSTOMER_REQUIRED,  EMAIL_BLOCKED,  DUMP_LOAD_STATUS_UNKNOWN,  DUMP_LOAD_INVALID_TARGET_STATUS_OR_NO_PERMISSIONS,  DUMP_LOAD_NO_PERMISSIONS,  DUMP_LOAD_EDIT_FORBIDDEN_IN_CURRENT_STATUS,  DUMP_LOAD_FIELDS_HAVE_INVALID_VALUES,  DUMP_LOAD_FIELDS_INVALID_CONDITIONS,  DUMP_LOAD_NOT_SPECIFIED,  DUMP_LOAD_NOT_SIGNED,  DUMP_LOAD_NEED_TO_SEND,  DUMP_LOAD_CUSTOMER_NEED_FOR_SIGN,  DRIVER_EMAIL_EXISTS,  DRIVER_PHONE_EXISTS,  CANNOT_SET_DATE_IN_PAST,  PROJECT_EDIT_FORBIDDEN_IN_CURRENT_STATUS,  USER_EXISTS,  USER_NOT_FOUND,  USER_EMPTY_OLD_PASSWORD,  USER_INVALID_OLD_PASSWORD,  USER_PASSWORD_NOT_EQUAL,  USER_PASSWORD_SIMILAR_TO_CURRENT,  USER_HAS_LINKED_PROJECTS,  USER_REQUIRED_CUSTOMER,  USER_ALREADY_INVITED,  EMAIL_EXISTS,  DRIVER_EMPTY_PASSWORD,  DRIVER_INVALID_OLD_PASSWORD,  DRIVER_PASSWORD_NOT_EQUAL,  EMPTY_OWNER,  DUMP_TYPE_EXISTS,  DUMP_TYPE_NAME_CANNOT_BE_EMPTY,  DUMP_TYPE_VOLUME_CANNOT_BE_EMPTY,  DUMP_TYPE_TONS_PER_M3_MUST_BE_POSITIVE,  TOXIC_LIMITS_INVALID_VALUE,  SUBSTANCE_IS_USED,  SUBSTANCE_CONTAMINATION_TYPE_IS_USED,  PERMISSION_ERROR,  DELIVERY_LINE_NOT_FOUND,  COMPANY_NOT_FOUND,  NETWORK_ERROR,  LANDFILL_STATUS_NOT_FOUND,  LANDFILL_STATUS_NAME_CANNOT_BE_EMPTY,  LANDFILL_STATUS_EXISTS,  LANDFILL_TYPE_CHANGE_NOT_ALLOWED,  LANDFILL_IS_NOT_AVAILABLE,  FORTNOX_ENTITY_NOT_FOUND,  FORTNOX_SYNC_TIMEOUT,  FORTNOX_ANOTHER_SYNC_IN_PROGRESS,  FORTNOX_NETWORK_ERROR,  FORTNOX_SYNC_CANCELED,  EMPTY_COMPANY,  NOT_IMPLEMENTED,  DEVIATION_NOT_FOUND,  DEVIATION_INVALID_FIELDS,  FILE_NOT_FOUND,  FILE_EXISTS,  FILE_TOO_LARGE,  INVALID_FILE_NAME,  CONVERSION_TO_PDF_ERROR,  PROJECT_END_DATE_BEFORE_START_DATE,  PROJECT_NO_DATE_CHANGE_ONGOING_MASS,  PROJECT_START_DATE_AFTER_MASS_START_DATE,  PROJECT_END_DATE_BEFORE_MASS_END_DATE,  MASS_START_DATE_BEFORE_PROJECT_START_DATE,  MASS_START_DATE_BEFORE_TODAY,  MASS_END_DATE_BEFORE_PROJECT_START_DATE,  MASS_END_DATE_BEFORE_MASS_START_DATE,  MASS_END_DATE_BEFORE_TODAY,  PROJECT_END_DATE_MUST_BE_UPDATED,  PROJECT_LOCATION_ON_WATER,  LANDFILL_LOCATION_ON_WATER,  OPEN_FROM_AFTER_OPEN_TO,  NO_OPEN_WORK_DAY,  API_KEY_NOT_SPECIFIED,  API_KEY_INVALID,  INVALID_LOCATION,  PHONE_NUMBER_EXISTS,  PHONE_NUMBER_HAVE_TO_BE_LOCAL_OR_INTERNATIONAL,  PHONE_NUMBER_TOO_SHORT,  PHONE_NUMBER_TOO_LONG, 
  };
  @SerializedName("code")
  private CodeEnum code = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Returns a date as a string value in ISO format.
   **/
  @ApiModelProperty(required = true, value = "Returns a date as a string value in ISO format.")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return (this.message == null ? errorDto.message == null : this.message.equals(errorDto.message)) &&
        (this.timestamp == null ? errorDto.timestamp == null : this.timestamp.equals(errorDto.timestamp)) &&
        (this.statusCode == null ? errorDto.statusCode == null : this.statusCode.equals(errorDto.statusCode)) &&
        (this.code == null ? errorDto.code == null : this.code.equals(errorDto.code));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    result = 31 * result + (this.statusCode == null ? 0: this.statusCode.hashCode());
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
