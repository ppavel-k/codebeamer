# TraceabilityApi

All URIs are relative to *http://b245d5c6e384:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTraceabilityInitialItemIds**](TraceabilityApi.md#getTraceabilityInitialItemIds) | **POST** /v3/traceability/items | Get initial ids |
| [**getTraceabilityLevelItemIds**](TraceabilityApi.md#getTraceabilityLevelItemIds) | **POST** /v3/traceability/relations | Get traceability level item ids |



## getTraceabilityInitialItemIds

> List&lt;TraceabilityItem&gt; getTraceabilityInitialItemIds(pageSize, pageNo, traceabilityInitialLevelFilter)

Get initial ids

Get traceability initial ids!

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TraceabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://b245d5c6e384:8080/api");

        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TraceabilityApi apiInstance = new TraceabilityApi(defaultClient);
        Integer pageSize = 56; // Integer | Number of items in a result page.
        Integer pageNo = 56; // Integer | Index of the result page.
        TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = new TraceabilityInitialLevelFilter(); // TraceabilityInitialLevelFilter | 
        try {
            List<TraceabilityItem> result = apiInstance.getTraceabilityInitialItemIds(pageSize, pageNo, traceabilityInitialLevelFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TraceabilityApi#getTraceabilityInitialItemIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | **Integer**| Number of items in a result page. | [optional] |
| **pageNo** | **Integer**| Index of the result page. | [optional] |
| **traceabilityInitialLevelFilter** | [**TraceabilityInitialLevelFilter**](TraceabilityInitialLevelFilter.md)|  | [optional] |

### Return type

[**List&lt;TraceabilityItem&gt;**](TraceabilityItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Tracker item list |  -  |
| **404** | Tracker not found |  -  |
| **429** | Too many requests |  -  |


## getTraceabilityLevelItemIds

> TraceabilityResult getTraceabilityLevelItemIds(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter)

Get traceability level item ids

Get traceability item ids!

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TraceabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://b245d5c6e384:8080/api");

        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        TraceabilityApi apiInstance = new TraceabilityApi(defaultClient);
        Integer itemsOnLevel = 56; // Integer | Number of items per level.
        Integer itemsFromPreviousItem = 56; // Integer | Number of items per item.
        TraceabilityLevelFilter traceabilityLevelFilter = new TraceabilityLevelFilter(); // TraceabilityLevelFilter | 
        try {
            TraceabilityResult result = apiInstance.getTraceabilityLevelItemIds(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TraceabilityApi#getTraceabilityLevelItemIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemsOnLevel** | **Integer**| Number of items per level. | [optional] |
| **itemsFromPreviousItem** | **Integer**| Number of items per item. | [optional] |
| **traceabilityLevelFilter** | [**TraceabilityLevelFilter**](TraceabilityLevelFilter.md)|  | [optional] |

### Return type

[**TraceabilityResult**](TraceabilityResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |
| **200** | Traceability items list |  -  |

