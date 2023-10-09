package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.CreateTestRunFromTestSetsRequest;
import codebeamer.rampup.client.model.CreateTestRunRequest;
import codebeamer.rampup.client.model.TestRunResult;
import codebeamer.rampup.client.model.TrackerItem;
import codebeamer.rampup.client.model.UpdateTestRunRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestRunApi {
    private ApiClient apiClient;

    @Autowired
    public TestRunApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new test run for test cases or test sets
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunRequest The createTestRunRequest parameter
     * @return TrackerItem

     */
    private RestClient.ResponseSpec createTestRunForTestCaseRequestCreation(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest) throws RestClientResponseException {
        Object postBody = createTestRunRequest;
        // verify the required parameter 'testRunTrackerId' is set
        if (testRunTrackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'testRunTrackerId' when calling createTestRunForTestCase", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("testRunTrackerId", testRunTrackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/trackers/{testRunTrackerId}/testruns", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a new test run for test cases or test sets
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunRequest The createTestRunRequest parameter
     * @return TrackerItem

     */
    public TrackerItem createTestRunForTestCase(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return createTestRunForTestCaseRequestCreation(testRunTrackerId, createTestRunRequest).body(localVarReturnType);
    }

    /**
     * Create a new test run for test cases or test sets
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunRequest The createTestRunRequest parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     */
    public ResponseEntity<TrackerItem> createTestRunForTestCaseWithHttpInfo(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createTestRunForTestCaseRequestCreation(testRunTrackerId, createTestRunRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a new test run for test cases or test sets
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunRequest The createTestRunRequest parameter

     */
    public RestClient.ResponseSpec createTestRunForTestCaseWithResponseSpec(Integer testRunTrackerId, CreateTestRunRequest createTestRunRequest) throws RestClientResponseException {
        return createTestRunForTestCaseRequestCreation(testRunTrackerId, createTestRunRequest);
    }
    /**
     * Create a new test run for test cases or test sets
     * 
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunFromTestSetsRequest The createTestRunFromTestSetsRequest parameter
     * @return TestRunResult

     */
    private RestClient.ResponseSpec createTestRunForTestSetsRequestCreation(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest) throws RestClientResponseException {
        Object postBody = createTestRunFromTestSetsRequest;
        // verify the required parameter 'testRunTrackerId' is set
        if (testRunTrackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'testRunTrackerId' when calling createTestRunForTestSets", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("testRunTrackerId", testRunTrackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TestRunResult> localVarReturnType = new ParameterizedTypeReference<TestRunResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{testRunTrackerId}/testruns/generatefromtestset", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a new test run for test cases or test sets
     * 
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunFromTestSetsRequest The createTestRunFromTestSetsRequest parameter
     * @return TestRunResult

     */
    public TestRunResult createTestRunForTestSets(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TestRunResult> localVarReturnType = new ParameterizedTypeReference<TestRunResult>() {};
        return createTestRunForTestSetsRequestCreation(testRunTrackerId, createTestRunFromTestSetsRequest).body(localVarReturnType);
    }

    /**
     * Create a new test run for test cases or test sets
     * 
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunFromTestSetsRequest The createTestRunFromTestSetsRequest parameter
     * @return ResponseEntity&lt;TestRunResult&gt;

     */
    public ResponseEntity<TestRunResult> createTestRunForTestSetsWithHttpInfo(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TestRunResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createTestRunForTestSetsRequestCreation(testRunTrackerId, createTestRunFromTestSetsRequest).toEntity(localVarReturnType);
    }

    /**
     * Create a new test run for test cases or test sets
     * 
     * <p><b>200</b> - The newly created test run
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Authorization is required
     * @param testRunTrackerId The testRunTrackerId parameter
     * @param createTestRunFromTestSetsRequest The createTestRunFromTestSetsRequest parameter

     */
    public RestClient.ResponseSpec createTestRunForTestSetsWithResponseSpec(Integer testRunTrackerId, CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest) throws RestClientResponseException {
        return createTestRunForTestSetsRequestCreation(testRunTrackerId, createTestRunFromTestSetsRequest);
    }
    /**
     * Update result of a Test Run
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated Test Run item
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Test run not found
     * @param testRunId The testRunId parameter
     * @param updateTestRunRequest The updateTestRunRequest parameter
     * @return TrackerItem

     */
    private RestClient.ResponseSpec updateTestRunResultRequestCreation(Integer testRunId, UpdateTestRunRequest updateTestRunRequest) throws RestClientResponseException {
        Object postBody = updateTestRunRequest;
        // verify the required parameter 'testRunId' is set
        if (testRunId == null) {
            throw new RestClientResponseException("Missing the required parameter 'testRunId' when calling updateTestRunResult", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("testRunId", testRunId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/testruns/{testRunId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update result of a Test Run
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated Test Run item
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Test run not found
     * @param testRunId The testRunId parameter
     * @param updateTestRunRequest The updateTestRunRequest parameter
     * @return TrackerItem

     */
    public TrackerItem updateTestRunResult(Integer testRunId, UpdateTestRunRequest updateTestRunRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return updateTestRunResultRequestCreation(testRunId, updateTestRunRequest).body(localVarReturnType);
    }

    /**
     * Update result of a Test Run
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated Test Run item
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Test run not found
     * @param testRunId The testRunId parameter
     * @param updateTestRunRequest The updateTestRunRequest parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     */
    public ResponseEntity<TrackerItem> updateTestRunResultWithHttpInfo(Integer testRunId, UpdateTestRunRequest updateTestRunRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateTestRunResultRequestCreation(testRunId, updateTestRunRequest).toEntity(localVarReturnType);
    }

    /**
     * Update result of a Test Run
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated Test Run item
     * <p><b>403</b> - Access denied
     * <p><b>404</b> - Test run not found
     * @param testRunId The testRunId parameter
     * @param updateTestRunRequest The updateTestRunRequest parameter

     */
    public RestClient.ResponseSpec updateTestRunResultWithResponseSpec(Integer testRunId, UpdateTestRunRequest updateTestRunRequest) throws RestClientResponseException {
        return updateTestRunResultRequestCreation(testRunId, updateTestRunRequest);
    }
}
