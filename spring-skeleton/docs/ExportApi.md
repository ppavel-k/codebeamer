# ExportApi

All URIs are relative to *http://b245d5c6e384:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchGetTrackerItemReviews**](ExportApi.md#batchGetTrackerItemReviews) | **POST** /v3/export/tracker-item-reviews | Get tracker item reviews by a list of tracker item IDs |
| [**export**](ExportApi.md#export) | **POST** /v3/projects/{projectId}/content | Exports the specified project to a zip file |
| [**getTrackerItems**](ExportApi.md#getTrackerItems) | **POST** /v3/export/items | Get tracker items |



## batchGetTrackerItemReviews

> List&lt;TrackerItemWithTrackerItemReviewsExport&gt; batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest)

Get tracker item reviews by a list of tracker item IDs

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.ExportApi;

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

        ExportApi apiInstance = new ExportApi(defaultClient);
        BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = new BatchGetTrackerItemReviewsRequest(); // BatchGetTrackerItemReviewsRequest | 
        try {
            List<TrackerItemWithTrackerItemReviewsExport> result = apiInstance.batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#batchGetTrackerItemReviews");
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
| **batchGetTrackerItemReviewsRequest** | [**BatchGetTrackerItemReviewsRequest**](BatchGetTrackerItemReviewsRequest.md)|  | [optional] |

### Return type

[**List&lt;TrackerItemWithTrackerItemReviewsExport&gt;**](TrackerItemWithTrackerItemReviewsExport.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | There is no baseline accessible with the supplied ID |  -  |
| **429** | Too many requests |  -  |
| **200** | List of tracker item reviews for each tracker item |  -  |
| **400** | Request cannot be processed |  -  |
| **403** | Tracker item reviews are disabled, or access to them is denied |  -  |
| **401** | Authentication is required |  -  |


## export

> File export(projectId, exportProject)

Exports the specified project to a zip file

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.ExportApi;

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

        ExportApi apiInstance = new ExportApi(defaultClient);
        Integer projectId = 56; // Integer | 
        ExportProject exportProject = new ExportProject(); // ExportProject | 
        try {
            File result = apiInstance.export(projectId, exportProject);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#export");
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
| **projectId** | **Integer**|  | |
| **exportProject** | [**ExportProject**](ExportProject.md)|  | [optional] |

### Return type

[**File**](File.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/zip, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |
| **500** | Error during the project export |  -  |
| **404** | Project not found |  -  |
| **200** | The exported project contents in a zip file. |  -  |
| **400** | Bad request |  -  |


## getTrackerItems

> List&lt;TrackerItem&gt; getTrackerItems(baselineId, trackerItemsRequest)

Get tracker items

API can be used for fetching basic information of tracker items

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.ExportApi;

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

        ExportApi apiInstance = new ExportApi(defaultClient);
        Integer baselineId = 56; // Integer | 
        TrackerItemsRequest trackerItemsRequest = new TrackerItemsRequest(); // TrackerItemsRequest | 
        try {
            List<TrackerItem> result = apiInstance.getTrackerItems(baselineId, trackerItemsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#getTrackerItems");
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
| **baselineId** | **Integer**|  | [optional] |
| **trackerItemsRequest** | [**TrackerItemsRequest**](TrackerItemsRequest.md)|  | [optional] |

### Return type

[**List&lt;TrackerItem&gt;**](TrackerItem.md)

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

