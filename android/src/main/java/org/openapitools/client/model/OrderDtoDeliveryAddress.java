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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Mottagningsplats
 **/
@ApiModel(description = "Mottagningsplats")
public class OrderDtoDeliveryAddress {
  
  @SerializedName("city")
  private String city = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("postalCode")
  private String postalCode = null;
  @SerializedName("addressLine1")
  private String addressLine1 = null;
  @SerializedName("addressLine2")
  private String addressLine2 = null;

  /**
   * Stad
   **/
  @ApiModelProperty(value = "Stad")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  /**
   * Land
   **/
  @ApiModelProperty(value = "Land")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Postnummer
   **/
  @ApiModelProperty(value = "Postnummer")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Adressrad #1
   **/
  @ApiModelProperty(value = "Adressrad #1")
  public String getAddressLine1() {
    return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /**
   * Adressrad #2
   **/
  @ApiModelProperty(value = "Adressrad #2")
  public String getAddressLine2() {
    return addressLine2;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDtoDeliveryAddress orderDtoDeliveryAddress = (OrderDtoDeliveryAddress) o;
    return (this.city == null ? orderDtoDeliveryAddress.city == null : this.city.equals(orderDtoDeliveryAddress.city)) &&
        (this.country == null ? orderDtoDeliveryAddress.country == null : this.country.equals(orderDtoDeliveryAddress.country)) &&
        (this.postalCode == null ? orderDtoDeliveryAddress.postalCode == null : this.postalCode.equals(orderDtoDeliveryAddress.postalCode)) &&
        (this.addressLine1 == null ? orderDtoDeliveryAddress.addressLine1 == null : this.addressLine1.equals(orderDtoDeliveryAddress.addressLine1)) &&
        (this.addressLine2 == null ? orderDtoDeliveryAddress.addressLine2 == null : this.addressLine2.equals(orderDtoDeliveryAddress.addressLine2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.city == null ? 0: this.city.hashCode());
    result = 31 * result + (this.country == null ? 0: this.country.hashCode());
    result = 31 * result + (this.postalCode == null ? 0: this.postalCode.hashCode());
    result = 31 * result + (this.addressLine1 == null ? 0: this.addressLine1.hashCode());
    result = 31 * result + (this.addressLine2 == null ? 0: this.addressLine2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDtoDeliveryAddress {\n");
    
    sb.append("  city: ").append(city).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  postalCode: ").append(postalCode).append("\n");
    sb.append("  addressLine1: ").append(addressLine1).append("\n");
    sb.append("  addressLine2: ").append(addressLine2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}