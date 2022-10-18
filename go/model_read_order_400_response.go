/*
Integration

         Here can be some description if that needed     

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// ReadOrder400Response - struct for ReadOrder400Response
type ReadOrder400Response struct {
	ErrorDto *ErrorDto
	ValidationErrorDto *ValidationErrorDto
}

// ErrorDtoAsReadOrder400Response is a convenience function that returns ErrorDto wrapped in ReadOrder400Response
func ErrorDtoAsReadOrder400Response(v *ErrorDto) ReadOrder400Response {
	return ReadOrder400Response{
		ErrorDto: v,
	}
}

// ValidationErrorDtoAsReadOrder400Response is a convenience function that returns ValidationErrorDto wrapped in ReadOrder400Response
func ValidationErrorDtoAsReadOrder400Response(v *ValidationErrorDto) ReadOrder400Response {
	return ReadOrder400Response{
		ValidationErrorDto: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *ReadOrder400Response) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into ErrorDto
	err = newStrictDecoder(data).Decode(&dst.ErrorDto)
	if err == nil {
		jsonErrorDto, _ := json.Marshal(dst.ErrorDto)
		if string(jsonErrorDto) == "{}" { // empty struct
			dst.ErrorDto = nil
		} else {
			match++
		}
	} else {
		dst.ErrorDto = nil
	}

	// try to unmarshal data into ValidationErrorDto
	err = newStrictDecoder(data).Decode(&dst.ValidationErrorDto)
	if err == nil {
		jsonValidationErrorDto, _ := json.Marshal(dst.ValidationErrorDto)
		if string(jsonValidationErrorDto) == "{}" { // empty struct
			dst.ValidationErrorDto = nil
		} else {
			match++
		}
	} else {
		dst.ValidationErrorDto = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.ErrorDto = nil
		dst.ValidationErrorDto = nil

		return fmt.Errorf("data matches more than one schema in oneOf(ReadOrder400Response)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(ReadOrder400Response)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src ReadOrder400Response) MarshalJSON() ([]byte, error) {
	if src.ErrorDto != nil {
		return json.Marshal(&src.ErrorDto)
	}

	if src.ValidationErrorDto != nil {
		return json.Marshal(&src.ValidationErrorDto)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *ReadOrder400Response) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.ErrorDto != nil {
		return obj.ErrorDto
	}

	if obj.ValidationErrorDto != nil {
		return obj.ValidationErrorDto
	}

	// all schemas are nil
	return nil
}

type NullableReadOrder400Response struct {
	value *ReadOrder400Response
	isSet bool
}

func (v NullableReadOrder400Response) Get() *ReadOrder400Response {
	return v.value
}

func (v *NullableReadOrder400Response) Set(val *ReadOrder400Response) {
	v.value = val
	v.isSet = true
}

func (v NullableReadOrder400Response) IsSet() bool {
	return v.isSet
}

func (v *NullableReadOrder400Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReadOrder400Response(val *ReadOrder400Response) *NullableReadOrder400Response {
	return &NullableReadOrder400Response{value: val, isSet: true}
}

func (v NullableReadOrder400Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReadOrder400Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

