# openapi-java-client

Integration
- API version: 1.0.0
  - Build date: 2022-10-18T22:23:53.783034Z[Etc/UTC]


        Here can be some description if that needed
    


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:3000");
    
    // Configure HTTP bearer authorization: bearer
    HttpBearerAuth bearer = (HttpBearerAuth) defaultClient.getAuthentication("bearer");
    bearer.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String deliveryCity = "deliveryCity_example"; // String | Stad
    BigDecimal deliveryLineCountFrom = new BigDecimal(78); // BigDecimal | 
    BigDecimal deliveryLineCountTo = new BigDecimal(78); // BigDecimal | 
    String deliveryName = "deliveryName_example"; // String | Mottagarnamn
    String documentNumber = "documentNumber_example"; // String | Dokumentnummer
    BigDecimal dvolumeFrom = new BigDecimal(78); // BigDecimal | Levererad volym fr??n
    BigDecimal dvolumeTo = new BigDecimal(78); // BigDecimal | Levererad volym till
    String endDate = "endDate_example"; // String | Slutdatum
    Boolean excludeAttached = true; // Boolean | 
    Boolean isCloseFilter = true; // Boolean | 
    Boolean isOpenFilter = true; // Boolean | 
    String startDate = "startDate_example"; // String | Startdatum
    try {
      List<OrderDto> result = apiInstance.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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



