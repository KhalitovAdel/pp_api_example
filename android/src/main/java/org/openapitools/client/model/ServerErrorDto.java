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
public class ServerErrorDto {
  
  @SerializedName("message")
  private String message = null;
  @SerializedName("timestamp")
  private String timestamp = null;
  public enum StatusCodeEnum {
     500, 
  };
  @SerializedName("statusCode")
  private StatusCodeEnum statusCode = null;
  public enum CodeEnum {
     INTERNAL_ERROR, 
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
    ServerErrorDto serverErrorDto = (ServerErrorDto) o;
    return (this.message == null ? serverErrorDto.message == null : this.message.equals(serverErrorDto.message)) &&
        (this.timestamp == null ? serverErrorDto.timestamp == null : this.timestamp.equals(serverErrorDto.timestamp)) &&
        (this.statusCode == null ? serverErrorDto.statusCode == null : this.statusCode.equals(serverErrorDto.statusCode)) &&
        (this.code == null ? serverErrorDto.code == null : this.code.equals(serverErrorDto.code));
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
    sb.append("class ServerErrorDto {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("  code: ").append(code).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
