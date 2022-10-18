# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.OrdersApi;

public class OrdersApiExample {

    public static void main(String[] args) {
        OrdersApi apiInstance = new OrdersApi();
        String deliveryCity = null; // String | Stad
        BigDecimal deliveryLineCountFrom = null; // BigDecimal | 
        BigDecimal deliveryLineCountTo = null; // BigDecimal | 
        String deliveryName = null; // String | Mottagarnamn
        String documentNumber = null; // String | Dokumentnummer
        BigDecimal dvolumeFrom = null; // BigDecimal | Levererad volym från
        BigDecimal dvolumeTo = null; // BigDecimal | Levererad volym till
        String endDate = null; // String | Slutdatum
        Boolean excludeAttached = null; // Boolean | 
        Boolean isCloseFilter = null; // Boolean | 
        Boolean isOpenFilter = null; // Boolean | 
        String startDate = null; // String | Startdatum
        try {
            List<OrderDto> result = apiInstance.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#listOrders");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrdersApi* | [**listOrders**](docs/OrdersApi.md#listOrders) | **GET** /api-ext/v1.0/orders | 
*OrdersApi* | [**readOrder**](docs/OrdersApi.md#readOrder) | **GET** /api-ext/v1.0/orders/{orderNumber} | 


## Documentation for Models

 - [DeliveryAddressDto](docs/DeliveryAddressDto.md)
 - [ErrorDto](docs/ErrorDto.md)
 - [ErrorMetaDto](docs/ErrorMetaDto.md)
 - [OrderDto](docs/OrderDto.md)
 - [OrderDtoDeliveryAddress](docs/OrderDtoDeliveryAddress.md)
 - [ReadOrder400Response](docs/ReadOrder400Response.md)
 - [ServerErrorDto](docs/ServerErrorDto.md)
 - [UnauthorizedErrorDto](docs/UnauthorizedErrorDto.md)
 - [ValidationErrorDto](docs/ValidationErrorDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### bearer

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



