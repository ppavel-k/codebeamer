# TrackerApi

All URIs are relative to *http://b245d5c6e384:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTracker**](TrackerApi.md#deleteTracker) | **DELETE** /v3/trackers/{trackerId} | Deletes a tracker |
| [**getChoiceOption**](TrackerApi.md#getChoiceOption) | **GET** /v3/trackers/{trackerId}/fields/{fieldId}/options/{optionId} | Get option of a choice field of tracker |
| [**getItemsByTracker**](TrackerApi.md#getItemsByTracker) | **GET** /v3/trackers/{trackerId}/items | Get items in a specific tracker |
| [**getTracker**](TrackerApi.md#getTracker) | **GET** /v3/trackers/{trackerId} | Get tracker |
| [**getTrackerBaselines**](TrackerApi.md#getTrackerBaselines) | **GET** /v3/trackers/{trackerId}/baselines | Get baselines of a specific tracker |
| [**getTrackerField**](TrackerApi.md#getTrackerField) | **GET** /v3/trackers/{trackerId}/fields/{fieldId} | Get field of tracker |
| [**getTrackerFieldPermissions**](TrackerApi.md#getTrackerFieldPermissions) | **GET** /v3/trackers/{trackerId}/fields/{fieldId}/permissions | Get permissions of tracker field |
| [**getTrackerFields**](TrackerApi.md#getTrackerFields) | **GET** /v3/trackers/{trackerId}/fields | Get fields of tracker |
| [**getTrackerFieldsPermissions**](TrackerApi.md#getTrackerFieldsPermissions) | **GET** /v3/trackers/{trackerId}/fields/permissions | Get permissions of all fields of a tracker |
| [**getTrackerOutline**](TrackerApi.md#getTrackerOutline) | **GET** /v3/trackers/{trackerId}/outline | Get outline of a specific tracker |
| [**getTrackerSchema**](TrackerApi.md#getTrackerSchema) | **GET** /v3/trackers/{trackerId}/schema | Get the schema of a tracker |
| [**getTrackerTransitions**](TrackerApi.md#getTrackerTransitions) | **GET** /v3/trackers/{trackerId}/transitions | Get all transitions of a specific tracker |
| [**getTrackerType**](TrackerApi.md#getTrackerType) | **GET** /v3/trackers/types/{trackerTypeId} | Get the immutable definition of a tracker type |
| [**getTrackerTypes**](TrackerApi.md#getTrackerTypes) | **GET** /v3/trackers/types | Get the list of tracker types |
| [**updateTracker**](TrackerApi.md#updateTracker) | **PUT** /v3/trackers/{trackerId} | Updates a specific tracker |
| [**updateTrackerIcon**](TrackerApi.md#updateTrackerIcon) | **PUT** /v3/trackers/{trackerId}/icon | Upload a tracker icon |



## deleteTracker

> deleteTracker(trackerId)

Deletes a tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        try {
            apiInstance.deleteTracker(trackerId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#deleteTracker");
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
| **trackerId** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Tracker deleted. |  -  |
| **404** | Tracker is not found |  -  |
| **429** | Too many requests |  -  |


## getChoiceOption

> ChoiceOptionReference getChoiceOption(trackerId, fieldId, optionId)

Get option of a choice field of tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer fieldId = 56; // Integer | 
        Integer optionId = 56; // Integer | 
        try {
            ChoiceOptionReference result = apiInstance.getChoiceOption(trackerId, fieldId, optionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getChoiceOption");
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
| **trackerId** | **Integer**|  | |
| **fieldId** | **Integer**|  | |
| **optionId** | **Integer**|  | |

### Return type

[**ChoiceOptionReference**](ChoiceOptionReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |
| **200** | Option by id |  -  |
| **404** | Option not found |  -  |
| **401** | Authentication is required |  -  |


## getItemsByTracker

> TrackerItemReferenceSearchResult getItemsByTracker(trackerId, page, pageSize)

Get items in a specific tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer page = 1; // Integer | Index of the result page starting from 1.
        Integer pageSize = 25; // Integer | Number of items in a result page. Max value: 500
        try {
            TrackerItemReferenceSearchResult result = apiInstance.getItemsByTracker(trackerId, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getItemsByTracker");
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
| **trackerId** | **Integer**|  | |
| **page** | **Integer**| Index of the result page starting from 1. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items in a result page. Max value: 500 | [optional] [default to 25] |

### Return type

[**TrackerItemReferenceSearchResult**](TrackerItemReferenceSearchResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **404** | Tracker is not found |  -  |
| **429** | Too many requests |  -  |
| **400** | Request cannot be processed |  -  |
| **200** | List of tracker items |  -  |


## getTracker

> Tracker getTracker(trackerId)

Get tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        try {
            Tracker result = apiInstance.getTracker(trackerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTracker");
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
| **trackerId** | **Integer**|  | |

### Return type

[**Tracker**](Tracker.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Tracker |  -  |
| **404** | Project / Tracker not found |  -  |
| **429** | Too many requests |  -  |


## getTrackerBaselines

> ReferenceSearchResult getTrackerBaselines(trackerId)

Get baselines of a specific tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        try {
            ReferenceSearchResult result = apiInstance.getTrackerBaselines(trackerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerBaselines");
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
| **trackerId** | **Integer**|  | |

### Return type

[**ReferenceSearchResult**](ReferenceSearchResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **500** | Internal server error |  -  |
| **401** | Not authorized |  -  |
| **404** | Tracker is not found |  -  |
| **429** | Too many requests |  -  |
| **200** | Baselines of the tracker |  -  |


## getTrackerField

> AbstractField getTrackerField(trackerId, fieldId)

Get field of tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer fieldId = 56; // Integer | 
        try {
            AbstractField result = apiInstance.getTrackerField(trackerId, fieldId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerField");
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
| **trackerId** | **Integer**|  | |
| **fieldId** | **Integer**|  | |

### Return type

[**AbstractField**](AbstractField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Field by id |  -  |
| **404** | Field not found |  -  |
| **429** | Too many requests |  -  |
| **401** | Authentication is required |  -  |


## getTrackerFieldPermissions

> List&lt;TrackerFieldStatusPermissions&gt; getTrackerFieldPermissions(trackerId, fieldId, statusId)

Get permissions of tracker field

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer fieldId = 56; // Integer | 
        Integer statusId = 56; // Integer | 
        try {
            List<TrackerFieldStatusPermissions> result = apiInstance.getTrackerFieldPermissions(trackerId, fieldId, statusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerFieldPermissions");
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
| **trackerId** | **Integer**|  | |
| **fieldId** | **Integer**|  | |
| **statusId** | **Integer**|  | [optional] |

### Return type

[**List&lt;TrackerFieldStatusPermissions&gt;**](TrackerFieldStatusPermissions.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Tracker or field not found |  -  |
| **429** | Too many requests |  -  |
| **200** | Permissions by status and role |  -  |
| **403** | Authorization is required |  -  |
| **400** | Status id is invalid |  -  |
| **401** | Authentication is required |  -  |


## getTrackerFields

> List&lt;FieldReference&gt; getTrackerFields(trackerId)

Get fields of tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        try {
            List<FieldReference> result = apiInstance.getTrackerFields(trackerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerFields");
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
| **trackerId** | **Integer**|  | |

### Return type

[**List&lt;FieldReference&gt;**](FieldReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **404** | Field not found |  -  |
| **429** | Too many requests |  -  |
| **200** | Field references |  -  |
| **401** | Authentication is required |  -  |


## getTrackerFieldsPermissions

> TrackerFieldsStatusPermissions getTrackerFieldsPermissions(trackerId, statusId)

Get permissions of all fields of a tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer statusId = 56; // Integer | 
        try {
            TrackerFieldsStatusPermissions result = apiInstance.getTrackerFieldsPermissions(trackerId, statusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerFieldsPermissions");
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
| **trackerId** | **Integer**|  | |
| **statusId** | **Integer**|  | [optional] |

### Return type

[**TrackerFieldsStatusPermissions**](TrackerFieldsStatusPermissions.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Tracker not found |  -  |
| **429** | Too many requests |  -  |
| **200** | Permissions by status and role |  -  |
| **403** | Authorization is required |  -  |
| **400** | Status id is invalid |  -  |
| **401** | Authentication is required |  -  |


## getTrackerOutline

> OutlineItemSearchResult getTrackerOutline(trackerId, parentItemId, resultDepthFilter)

Get outline of a specific tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer parentItemId = 56; // Integer | Show only the children of this item.
        Integer resultDepthFilter = 56; // Integer | The depth level of the result outline.
        try {
            OutlineItemSearchResult result = apiInstance.getTrackerOutline(trackerId, parentItemId, resultDepthFilter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerOutline");
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
| **trackerId** | **Integer**|  | |
| **parentItemId** | **Integer**| Show only the children of this item. | [optional] |
| **resultDepthFilter** | **Integer**| The depth level of the result outline. | [optional] |

### Return type

[**OutlineItemSearchResult**](OutlineItemSearchResult.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **500** | Internal server error |  -  |
| **401** | Not authorized |  -  |
| **404** | Tracker is not found |  -  |
| **429** | Too many requests |  -  |
| **400** | Request cannot be processed |  -  |
| **200** | Outline of the tracker |  -  |


## getTrackerSchema

> List&lt;AbstractField&gt; getTrackerSchema(trackerId)

Get the schema of a tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        try {
            List<AbstractField> result = apiInstance.getTrackerSchema(trackerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerSchema");
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
| **trackerId** | **Integer**|  | |

### Return type

[**List&lt;AbstractField&gt;**](AbstractField.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Field definitions |  -  |
| **404** | Field not found |  -  |
| **429** | Too many requests |  -  |
| **401** | Authentication is required |  -  |


## getTrackerTransitions

> List&lt;WorkflowTransition&gt; getTrackerTransitions(trackerId, fromStatusId)

Get all transitions of a specific tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Integer fromStatusId = 56; // Integer | The from status id filter for transitions.
        try {
            List<WorkflowTransition> result = apiInstance.getTrackerTransitions(trackerId, fromStatusId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerTransitions");
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
| **trackerId** | **Integer**|  | |
| **fromStatusId** | **Integer**| The from status id filter for transitions. | [optional] |

### Return type

[**List&lt;WorkflowTransition&gt;**](WorkflowTransition.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **404** | Tracker not found |  -  |
| **500** | Internal server error |  -  |
| **429** | Too many requests |  -  |
| **200** | Tracker transition list |  -  |


## getTrackerType

> TrackerType getTrackerType(trackerTypeId)

Get the immutable definition of a tracker type

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerTypeId = 56; // Integer | 
        try {
            TrackerType result = apiInstance.getTrackerType(trackerTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerType");
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
| **trackerTypeId** | **Integer**|  | |

### Return type

[**TrackerType**](TrackerType.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Tracker type |  -  |
| **404** | Tracker type is not found |  -  |
| **429** | Too many requests |  -  |


## getTrackerTypes

> List&lt;TrackerTypeReference&gt; getTrackerTypes(outline)

Get the list of tracker types

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        String outline = "ENABLED"; // String | Outline is enabled, disabled or any(no filtering will be applied).
        try {
            List<TrackerTypeReference> result = apiInstance.getTrackerTypes(outline);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#getTrackerTypes");
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
| **outline** | **String**| Outline is enabled, disabled or any(no filtering will be applied). | [optional] [default to ANY] [enum: ENABLED, DISABLED, ANY] |

### Return type

[**List&lt;TrackerTypeReference&gt;**](TrackerTypeReference.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **429** | Too many requests |  -  |
| **200** | Tracker types |  -  |


## updateTracker

> Tracker updateTracker(trackerId, tracker)

Updates a specific tracker

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | 
        Tracker tracker = new Tracker(); // Tracker | 
        try {
            Tracker result = apiInstance.updateTracker(trackerId, tracker);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#updateTracker");
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
| **trackerId** | **Integer**|  | |
| **tracker** | [**Tracker**](Tracker.md)|  | [optional] |

### Return type

[**Tracker**](Tracker.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **403** | Authentication is required |  -  |
| **200** | Tracker settings |  -  |
| **404** | Tracker not found |  -  |
| **429** | Too many requests |  -  |


## updateTrackerIcon

> updateTrackerIcon(trackerId, icon)

Upload a tracker icon

### Example

```java
// Import classes:

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.ApiException;
import codebeamer.rampup.client.invoker.Configuration;
import codebeamer.rampup.client.invoker.auth.*;
import codebeamer.rampup.client.invoker.models.*;
import codebeamer.rampup.api.TrackerApi;

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

        TrackerApi apiInstance = new TrackerApi(defaultClient);
        Integer trackerId = 56; // Integer | Id of the tracker
        File icon = new File("/path/to/file"); // File | 
        try {
            apiInstance.updateTrackerIcon(trackerId, icon);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackerApi#updateTrackerIcon");
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
| **trackerId** | **Integer**| Id of the tracker | |
| **icon** | **File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Could not read image from the request, or it&#39;s the wrong format |  -  |
| **404** | Tracker not found |  -  |
| **429** | Too many requests |  -  |
| **403** | The tracker could not be accessed |  -  |
| **200** | Tracker icon uploaded successfully |  -  |
| **401** | Authentication is required |  -  |

