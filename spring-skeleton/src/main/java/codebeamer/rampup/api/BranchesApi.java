package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.TrackerItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BranchesApi {
    private ApiClient apiClient;

    @Autowired
    public BranchesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get tracker item on branch
     * API can be used for finding a tracker item by a branch id
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Basic tracker item by id and branch id
     * @param sourceItemId The sourceItemId parameter
     * @param branchId The branchId parameter
     * @return TrackerItem

     */
    private RestClient.ResponseSpec getTrackerItemOnBranchRequestCreation(Integer sourceItemId, Integer branchId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'sourceItemId' is set
        if (sourceItemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'sourceItemId' when calling getTrackerItemOnBranch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new RestClientResponseException("Missing the required parameter 'branchId' when calling getTrackerItemOnBranch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("branchId", branchId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sourceItemId", sourceItemId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/branches/{branchId}/item", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker item on branch
     * API can be used for finding a tracker item by a branch id
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Basic tracker item by id and branch id
     * @param sourceItemId The sourceItemId parameter
     * @param branchId The branchId parameter
     * @return TrackerItem

     */
    public TrackerItem getTrackerItemOnBranch(Integer sourceItemId, Integer branchId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return getTrackerItemOnBranchRequestCreation(sourceItemId, branchId).body(localVarReturnType);
    }

    /**
     * Get tracker item on branch
     * API can be used for finding a tracker item by a branch id
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Basic tracker item by id and branch id
     *
     * @param sourceItemId The sourceItemId parameter
     * @param branchId     The branchId parameter
     * @return ResponseEntity&lt;TrackerItem&gt;
     */
    public RestClient.ResponseSpec getTrackerItemOnBranchWithHttpInfo(Integer sourceItemId, Integer branchId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemOnBranchRequestCreation(sourceItemId, branchId);
    }

    /**
     * Get tracker item on branch
     * API can be used for finding a tracker item by a branch id
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Basic tracker item by id and branch id
     * @param sourceItemId The sourceItemId parameter
     * @param branchId The branchId parameter

     */
    public RestClient.ResponseSpec getTrackerItemOnBranchWithResponseSpec(Integer sourceItemId, Integer branchId) throws RestClientResponseException {
        return getTrackerItemOnBranchRequestCreation(sourceItemId, branchId);
    }
}
