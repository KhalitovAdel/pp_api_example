/*
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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.OrderDto;
import org.openapitools.client.model.ReadOrder400Response;
import org.openapitools.client.model.ServerErrorDto;
import org.openapitools.client.model.UnauthorizedErrorDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Disabled
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listOrdersTest() throws ApiException {
        String deliveryCity = null;
        BigDecimal deliveryLineCountFrom = null;
        BigDecimal deliveryLineCountTo = null;
        String deliveryName = null;
        String documentNumber = null;
        BigDecimal dvolumeFrom = null;
        BigDecimal dvolumeTo = null;
        String endDate = null;
        Boolean excludeAttached = null;
        Boolean isCloseFilter = null;
        Boolean isOpenFilter = null;
        String startDate = null;
        List<OrderDto> response = api.listOrders(deliveryCity, deliveryLineCountFrom, deliveryLineCountTo, deliveryName, documentNumber, dvolumeFrom, dvolumeTo, endDate, excludeAttached, isCloseFilter, isOpenFilter, startDate);
        // TODO: test validations
    }

    /**
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readOrderTest() throws ApiException {
        String orderNumber = null;
        OrderDto response = api.readOrder(orderNumber);
        // TODO: test validations
    }

}
