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

package org.openapitools.client.api;

import org.openapitools.client.ApiInvoker;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.math.BigDecimal;
import org.openapitools.client.model.OrderDto;
import org.openapitools.client.model.ReadOrder400Response;
import org.openapitools.client.model.ServerErrorDto;
import org.openapitools.client.model.UnauthorizedErrorDto;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OrdersApi {
  String basePath = "http://localhost:3000";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 
  * 
   * @param deliveryCity Stad
   * @param deliveryLineCountFrom 
   * @param deliveryLineCountTo 
   * @param deliveryName Mottagarnamn
   * @param documentNumber Dokumentnummer
   * @param dvolumeFrom Levererad volym från
   * @param dvolumeTo Levererad volym till
   * @param endDate Slutdatum
   * @param excludeAttached 
   * @param isCloseFilter 
   * @param isOpenFilter 
   * @param startDate Startdatum
   * @return List<OrderDto>
  */
  public List<OrderDto> listOrders (String deliveryCity, BigDecimal deliveryLineCountFrom, BigDecimal deliveryLineCountTo, String deliveryName, String documentNumber, BigDecimal dvolumeFrom, BigDecimal dvolumeTo, String endDate, Boolean excludeAttached, Boolean isCloseFilter, Boolean isOpenFilter, String startDate) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/api-ext/v1.0/orders";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryCity", deliveryCity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryLineCountFrom", deliveryLineCountFrom));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryLineCountTo", deliveryLineCountTo));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryName", deliveryName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "documentNumber", documentNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dvolumeFrom", dvolumeFrom));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dvolumeTo", dvolumeTo));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "excludeAttached", excludeAttached));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "isCloseFilter", isCloseFilter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "isOpenFilter", isOpenFilter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (List<OrderDto>) ApiInvoker.deserialize(localVarResponse, "array", OrderDto.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 
   * @param deliveryCity Stad   * @param deliveryLineCountFrom    * @param deliveryLineCountTo    * @param deliveryName Mottagarnamn   * @param documentNumber Dokumentnummer   * @param dvolumeFrom Levererad volym från   * @param dvolumeTo Levererad volym till   * @param endDate Slutdatum   * @param excludeAttached    * @param isCloseFilter    * @param isOpenFilter    * @param startDate Startdatum
  */
  public void listOrders (String deliveryCity, BigDecimal deliveryLineCountFrom, BigDecimal deliveryLineCountTo, String deliveryName, String documentNumber, BigDecimal dvolumeFrom, BigDecimal dvolumeTo, String endDate, Boolean excludeAttached, Boolean isCloseFilter, Boolean isOpenFilter, String startDate, final Response.Listener<List<OrderDto>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/api-ext/v1.0/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryCity", deliveryCity));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryLineCountFrom", deliveryLineCountFrom));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryLineCountTo", deliveryLineCountTo));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deliveryName", deliveryName));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "documentNumber", documentNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dvolumeFrom", dvolumeFrom));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dvolumeTo", dvolumeTo));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "endDate", endDate));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "excludeAttached", excludeAttached));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "isCloseFilter", isCloseFilter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "isOpenFilter", isOpenFilter));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "startDate", startDate));


    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<OrderDto>) ApiInvoker.deserialize(localVarResponse,  "array", OrderDto.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 
  * 
   * @param orderNumber 
   * @return OrderDto
  */
  public OrderDto readOrder (String orderNumber) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'orderNumber' is set
    if (orderNumber == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderNumber' when calling readOrder",
        new ApiException(400, "Missing the required parameter 'orderNumber' when calling readOrder"));
    }

    // create path and map variables
    String path = "/api-ext/v1.0/orders/{orderNumber}".replaceAll("\\{" + "orderNumber" + "\\}", apiInvoker.escapeString(orderNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "bearer" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OrderDto) ApiInvoker.deserialize(localVarResponse, "", OrderDto.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * 
   * 
   * @param orderNumber 
  */
  public void readOrder (String orderNumber, final Response.Listener<OrderDto> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'orderNumber' is set
    if (orderNumber == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'orderNumber' when calling readOrder",
        new ApiException(400, "Missing the required parameter 'orderNumber' when calling readOrder"));
    }

    // create path and map variables
    String path = "/api-ext/v1.0/orders/{orderNumber}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "orderNumber" + "\\}", apiInvoker.escapeString(orderNumber.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "bearer" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OrderDto) ApiInvoker.deserialize(localVarResponse,  "", OrderDto.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
