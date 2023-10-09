# TestRunApi

All URIs are relative to *http://b245d5c6e384:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTestRunForTestCase**](TestRunApi.md#createTestRunForTestCase) | **POST** /v3/trackers/{testRunTrackerId}/testruns | Create a new test run for test cases or test sets |
| [**createTestRunForTestSets**](TestRunApi.md#createTestRunForTestSets) | **POST** /v3/trackers/{testRunTrackerId}/testruns/generatefromtestset | Create a new test run for test cases or test sets |
| [**updateTestRunResult**](TestRunApi.md#updateTestRunResult) | **PUT** /v3/testruns/{testRunId} | Update result of a Test Run |



## createTestRunForTestCase

> TrackerItem createTestRunForTestCase(testRunTrackerId, createTestRunRequest)

Create a new test run for test cases or test sets

For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TestRunApi;

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

        TestRunApi apiInstance = new TestRunApi(defaultClient);
        Integer testRunTrackerId = 56; // Integer | 
        CreateTestRunRequest createTestRunRequest = new CreateTestRunRequest(); // CreateTestRunRequest | 
        try {
            TrackerItem result = apiInstance.createTestRunForTestCase(testRunTrackerId, createTestRunRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRunApi#createTestRunForTestCase");
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
| **testRunTrackerId** | **Integer**|  | |
| **createTestRunRequest** | [**CreateTestRunRequest**](CreateTestRunRequest.md)|  | [optional] |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly created test run |  -  |
| **404** | Tracker is not found |  -  |
| **429** | Too many requests |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authorization is required |  -  |


## createTestRunForTestSets

> TestRunResult createTestRunForTestSets(testRunTrackerId, createTestRunFromTestSetsRequest)

Create a new test run for test cases or test sets

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TestRunApi;

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

        TestRunApi apiInstance = new TestRunApi(defaultClient);
        Integer testRunTrackerId = 56; // Integer | 
        CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest = new CreateTestRunFromTestSetsRequest(); // CreateTestRunFromTestSetsRequest | 
        try {
            TestRunResult result = apiInstance.createTestRunForTestSets(testRunTrackerId, createTestRunFromTestSetsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRunApi#createTestRunForTestSets");
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
| **testRunTrackerId** | **Integer**|  | |
| **createTestRunFromTestSetsRequest** | [**CreateTestRunFromTestSetsRequest**](CreateTestRunFromTestSetsRequest.md)|  | [optional] |

### Return type

[**TestRunResult**](TestRunResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The newly created test run |  -  |
| **404** | Tracker is not found |  -  |
| **429** | Too many requests |  -  |
| **400** | Bad request |  -  |
| **500** | Internal server error |  -  |
| **401** | Authentication is required |  -  |
| **403** | Authorization is required |  -  |


## updateTestRunResult

> TrackerItem updateTestRunResult(testRunId, updateTestRunRequest)

Update result of a Test Run

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TestRunApi;

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

        TestRunApi apiInstance = new TestRunApi(defaultClient);
        Integer testRunId = 56; // Integer | 
        UpdateTestRunRequest updateTestRunRequest = new UpdateTestRunRequest(); // UpdateTestRunRequest | 
        try {
            TrackerItem result = apiInstance.updateTestRunResult(testRunId, updateTestRunRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestRunApi#updateTestRunResult");
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
| **testRunId** | **Integer**|  | |
| **updateTestRunRequest** | [**UpdateTestRunRequest**](UpdateTestRunRequest.md)|  | [optional] |

### Return type

[**TrackerItem**](TrackerItem.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Authentication is required |  -  |
| **400** | Request cannot be processed |  -  |
| **429** | Too many requests |  -  |
| **200** | Updated Test Run item |  -  |
| **403** | Access denied |  -  |
| **404** | Test run not found |  -  |

