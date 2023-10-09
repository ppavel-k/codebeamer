# TestManagementApi

All URIs are relative to *http://b245d5c6e384:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoApplyStepReuses**](TestManagementApi.md#autoApplyStepReuses) | **POST** /v3/testcases/autoApplyStepReuses | Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses |



## autoApplyStepReuses

> List&lt;TrackerItemReference&gt; autoApplyStepReuses(autoApplyTestStepReuses)

Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TestManagementApi;

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

        TestManagementApi apiInstance = new TestManagementApi(defaultClient);
        AutoApplyTestStepReuses autoApplyTestStepReuses = new AutoApplyTestStepReuses(); // AutoApplyTestStepReuses | 
        try {
            List<TrackerItemReference> result = apiInstance.autoApplyStepReuses(autoApplyTestStepReuses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestManagementApi#autoApplyStepReuses");
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
| **autoApplyTestStepReuses** | [**AutoApplyTestStepReuses**](AutoApplyTestStepReuses.md)|  | [optional] |

### Return type

[**List&lt;TrackerItemReference&gt;**](TrackerItemReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **401** | Authentication is required |  -  |
| **429** | Too many requests |  -  |
| **200** | The item-references of the modified tracker-items where duplicate Test Steps was found and converted to Reuses |  -  |

