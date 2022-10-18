/*
Integration

         Here can be some description if that needed     

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// DeliveryAddressDto struct for DeliveryAddressDto
type DeliveryAddressDto struct {
	// Stad
	City NullableString `json:"city,omitempty"`
	// Land
	Country NullableString `json:"country,omitempty"`
	// Postnummer
	PostalCode NullableString `json:"postalCode,omitempty"`
	// Adressrad #1
	AddressLine1 NullableString `json:"addressLine1,omitempty"`
	// Adressrad #2
	AddressLine2 NullableString `json:"addressLine2,omitempty"`
}

// NewDeliveryAddressDto instantiates a new DeliveryAddressDto object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDeliveryAddressDto() *DeliveryAddressDto {
	this := DeliveryAddressDto{}
	return &this
}

// NewDeliveryAddressDtoWithDefaults instantiates a new DeliveryAddressDto object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDeliveryAddressDtoWithDefaults() *DeliveryAddressDto {
	this := DeliveryAddressDto{}
	return &this
}

// GetCity returns the City field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DeliveryAddressDto) GetCity() string {
	if o == nil || o.City.Get() == nil {
		var ret string
		return ret
	}
	return *o.City.Get()
}

// GetCityOk returns a tuple with the City field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DeliveryAddressDto) GetCityOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.City.Get(), o.City.IsSet()
}

// HasCity returns a boolean if a field has been set.
func (o *DeliveryAddressDto) HasCity() bool {
	if o != nil && o.City.IsSet() {
		return true
	}

	return false
}

// SetCity gets a reference to the given NullableString and assigns it to the City field.
func (o *DeliveryAddressDto) SetCity(v string) {
	o.City.Set(&v)
}
// SetCityNil sets the value for City to be an explicit nil
func (o *DeliveryAddressDto) SetCityNil() {
	o.City.Set(nil)
}

// UnsetCity ensures that no value is present for City, not even an explicit nil
func (o *DeliveryAddressDto) UnsetCity() {
	o.City.Unset()
}

// GetCountry returns the Country field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DeliveryAddressDto) GetCountry() string {
	if o == nil || o.Country.Get() == nil {
		var ret string
		return ret
	}
	return *o.Country.Get()
}

// GetCountryOk returns a tuple with the Country field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DeliveryAddressDto) GetCountryOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Country.Get(), o.Country.IsSet()
}

// HasCountry returns a boolean if a field has been set.
func (o *DeliveryAddressDto) HasCountry() bool {
	if o != nil && o.Country.IsSet() {
		return true
	}

	return false
}

// SetCountry gets a reference to the given NullableString and assigns it to the Country field.
func (o *DeliveryAddressDto) SetCountry(v string) {
	o.Country.Set(&v)
}
// SetCountryNil sets the value for Country to be an explicit nil
func (o *DeliveryAddressDto) SetCountryNil() {
	o.Country.Set(nil)
}

// UnsetCountry ensures that no value is present for Country, not even an explicit nil
func (o *DeliveryAddressDto) UnsetCountry() {
	o.Country.Unset()
}

// GetPostalCode returns the PostalCode field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DeliveryAddressDto) GetPostalCode() string {
	if o == nil || o.PostalCode.Get() == nil {
		var ret string
		return ret
	}
	return *o.PostalCode.Get()
}

// GetPostalCodeOk returns a tuple with the PostalCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DeliveryAddressDto) GetPostalCodeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.PostalCode.Get(), o.PostalCode.IsSet()
}

// HasPostalCode returns a boolean if a field has been set.
func (o *DeliveryAddressDto) HasPostalCode() bool {
	if o != nil && o.PostalCode.IsSet() {
		return true
	}

	return false
}

// SetPostalCode gets a reference to the given NullableString and assigns it to the PostalCode field.
func (o *DeliveryAddressDto) SetPostalCode(v string) {
	o.PostalCode.Set(&v)
}
// SetPostalCodeNil sets the value for PostalCode to be an explicit nil
func (o *DeliveryAddressDto) SetPostalCodeNil() {
	o.PostalCode.Set(nil)
}

// UnsetPostalCode ensures that no value is present for PostalCode, not even an explicit nil
func (o *DeliveryAddressDto) UnsetPostalCode() {
	o.PostalCode.Unset()
}

// GetAddressLine1 returns the AddressLine1 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DeliveryAddressDto) GetAddressLine1() string {
	if o == nil || o.AddressLine1.Get() == nil {
		var ret string
		return ret
	}
	return *o.AddressLine1.Get()
}

// GetAddressLine1Ok returns a tuple with the AddressLine1 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DeliveryAddressDto) GetAddressLine1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AddressLine1.Get(), o.AddressLine1.IsSet()
}

// HasAddressLine1 returns a boolean if a field has been set.
func (o *DeliveryAddressDto) HasAddressLine1() bool {
	if o != nil && o.AddressLine1.IsSet() {
		return true
	}

	return false
}

// SetAddressLine1 gets a reference to the given NullableString and assigns it to the AddressLine1 field.
func (o *DeliveryAddressDto) SetAddressLine1(v string) {
	o.AddressLine1.Set(&v)
}
// SetAddressLine1Nil sets the value for AddressLine1 to be an explicit nil
func (o *DeliveryAddressDto) SetAddressLine1Nil() {
	o.AddressLine1.Set(nil)
}

// UnsetAddressLine1 ensures that no value is present for AddressLine1, not even an explicit nil
func (o *DeliveryAddressDto) UnsetAddressLine1() {
	o.AddressLine1.Unset()
}

// GetAddressLine2 returns the AddressLine2 field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *DeliveryAddressDto) GetAddressLine2() string {
	if o == nil || o.AddressLine2.Get() == nil {
		var ret string
		return ret
	}
	return *o.AddressLine2.Get()
}

// GetAddressLine2Ok returns a tuple with the AddressLine2 field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *DeliveryAddressDto) GetAddressLine2Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.AddressLine2.Get(), o.AddressLine2.IsSet()
}

// HasAddressLine2 returns a boolean if a field has been set.
func (o *DeliveryAddressDto) HasAddressLine2() bool {
	if o != nil && o.AddressLine2.IsSet() {
		return true
	}

	return false
}

// SetAddressLine2 gets a reference to the given NullableString and assigns it to the AddressLine2 field.
func (o *DeliveryAddressDto) SetAddressLine2(v string) {
	o.AddressLine2.Set(&v)
}
// SetAddressLine2Nil sets the value for AddressLine2 to be an explicit nil
func (o *DeliveryAddressDto) SetAddressLine2Nil() {
	o.AddressLine2.Set(nil)
}

// UnsetAddressLine2 ensures that no value is present for AddressLine2, not even an explicit nil
func (o *DeliveryAddressDto) UnsetAddressLine2() {
	o.AddressLine2.Unset()
}

func (o DeliveryAddressDto) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.City.IsSet() {
		toSerialize["city"] = o.City.Get()
	}
	if o.Country.IsSet() {
		toSerialize["country"] = o.Country.Get()
	}
	if o.PostalCode.IsSet() {
		toSerialize["postalCode"] = o.PostalCode.Get()
	}
	if o.AddressLine1.IsSet() {
		toSerialize["addressLine1"] = o.AddressLine1.Get()
	}
	if o.AddressLine2.IsSet() {
		toSerialize["addressLine2"] = o.AddressLine2.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableDeliveryAddressDto struct {
	value *DeliveryAddressDto
	isSet bool
}

func (v NullableDeliveryAddressDto) Get() *DeliveryAddressDto {
	return v.value
}

func (v *NullableDeliveryAddressDto) Set(val *DeliveryAddressDto) {
	v.value = val
	v.isSet = true
}

func (v NullableDeliveryAddressDto) IsSet() bool {
	return v.isSet
}

func (v *NullableDeliveryAddressDto) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDeliveryAddressDto(val *DeliveryAddressDto) *NullableDeliveryAddressDto {
	return &NullableDeliveryAddressDto{value: val, isSet: true}
}

func (v NullableDeliveryAddressDto) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDeliveryAddressDto) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


