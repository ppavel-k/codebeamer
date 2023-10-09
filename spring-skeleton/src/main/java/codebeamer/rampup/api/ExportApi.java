package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.BatchGetTrackerItemReviewsRequest;
import codebeamer.rampup.client.model.ExportProject;
import codebeamer.rampup.client.model.TrackerItem;
import codebeamer.rampup.client.model.TrackerItemWithTrackerItemReviewsExport;
import codebeamer.rampup.client.model.TrackerItemsRequest;
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

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExportApi {
    private ApiClient apiClient;

    @Autowired
    public ExportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get tracker item reviews by a list of tracker item IDs
     *
     * <p><b>404</b> - There is no baseline accessible with the supplied ID
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of tracker item reviews for each tracker item
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>401</b> - Authentication is required
     *
     * @param batchGetTrackerItemReviewsRequest The batchGetTrackerItemReviewsRequest parameter
     * @return List&lt;TrackerItemWithTrackerItemReviewsExport&gt;
     */
    private RestClient.ResponseSpec batchGetTrackerItemReviewsRequestCreation(BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest) throws RestClientResponseException {
        Object postBody = batchGetTrackerItemReviewsRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<TrackerItemWithTrackerItemReviewsExport> localVarReturnType = new ParameterizedTypeReference<TrackerItemWithTrackerItemReviewsExport>() {};
        return apiClient.invokeAPI("/v3/export/tracker-item-reviews", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker item reviews by a list of tracker item IDs
     *
     * <p><b>404</b> - There is no baseline accessible with the supplied ID
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of tracker item reviews for each tracker item
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>401</b> - Authentication is required
     *
     * @param batchGetTrackerItemReviewsRequest The batchGetTrackerItemReviewsRequest parameter
     * @return List&lt;TrackerItemWithTrackerItemReviewsExport&gt;
     */
    public List<TrackerItemWithTrackerItemReviewsExport> batchGetTrackerItemReviews(BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest) throws RestClientResponseException {
        return batchGetTrackerItemReviewsRequestCreation(batchGetTrackerItemReviewsRequest).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get tracker item reviews by a list of tracker item IDs
     * 
     * <p><b>404</b> - There is no baseline accessible with the supplied ID
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of tracker item reviews for each tracker item
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>401</b> - Authentication is required
     * @param batchGetTrackerItemReviewsRequest The batchGetTrackerItemReviewsRequest parameter
     * @return ResponseEntity&lt;List&lt;TrackerItemWithTrackerItemReviewsExport&gt;&gt;

     */
    public ResponseEntity<List<TrackerItemWithTrackerItemReviewsExport>> batchGetTrackerItemReviewsWithHttpInfo(BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest) throws RestClientResponseException {
        ParameterizedTypeReference<List<TrackerItemWithTrackerItemReviewsExport>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return batchGetTrackerItemReviewsRequestCreation(batchGetTrackerItemReviewsRequest).toEntity(localVarReturnType);
    }

    /**
     * Get tracker item reviews by a list of tracker item IDs
     * 
     * <p><b>404</b> - There is no baseline accessible with the supplied ID
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of tracker item reviews for each tracker item
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>401</b> - Authentication is required
     * @param batchGetTrackerItemReviewsRequest The batchGetTrackerItemReviewsRequest parameter

     */
    public RestClient.ResponseSpec batchGetTrackerItemReviewsWithResponseSpec(BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest) throws RestClientResponseException {
        return batchGetTrackerItemReviewsRequestCreation(batchGetTrackerItemReviewsRequest);
    }
    /**
     * Exports the specified project to a zip file
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Error during the project export
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - The exported project contents in a zip file.
     * <p><b>400</b> - Bad request
     * @param projectId The projectId parameter
     * @param exportProject The exportProject parameter
     * @return File

     */
    private RestClient.ResponseSpec exportRequestCreation(Integer projectId, ExportProject exportProject) throws RestClientResponseException {
        Object postBody = exportProject;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling export", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/zip", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/content", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Exports the specified project to a zip file
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Error during the project export
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - The exported project contents in a zip file.
     * <p><b>400</b> - Bad request
     * @param projectId The projectId parameter
     * @param exportProject The exportProject parameter
     * @return File

     */
    public File export(Integer projectId, ExportProject exportProject) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return exportRequestCreation(projectId, exportProject).body(localVarReturnType);
    }

    /**
     * Exports the specified project to a zip file
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Error during the project export
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - The exported project contents in a zip file.
     * <p><b>400</b> - Bad request
     *
     * @param projectId     The projectId parameter
     * @param exportProject The exportProject parameter
     * @return ResponseEntity&lt;File&gt;
     */
    public RestClient.ResponseSpec exportWithHttpInfo(Integer projectId, ExportProject exportProject) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return exportRequestCreation(projectId, exportProject);
    }

    /**
     * Exports the specified project to a zip file
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Error during the project export
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - The exported project contents in a zip file.
     * <p><b>400</b> - Bad request
     * @param projectId The projectId parameter
     * @param exportProject The exportProject parameter

     */
    public RestClient.ResponseSpec exportWithResponseSpec(Integer projectId, ExportProject exportProject) throws RestClientResponseException {
        return exportRequestCreation(projectId, exportProject);
    }
    /**
     * Get tracker items
     * API can be used for fetching basic information of tracker items
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter
     * @return List&lt;TrackerItem&gt;

     */
    private RestClient.ResponseSpec getTrackerItemsRequestCreation(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        Object postBody = trackerItemsRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "baselineId", baselineId));

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
        return apiClient.invokeAPI("/v3/export/items", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker items
     * API can be used for fetching basic information of tracker items
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter
     * @return List&lt;TrackerItem&gt;

     */
    public List<TrackerItem> getTrackerItems(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        return getTrackerItemsRequestCreation(baselineId, trackerItemsRequest).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get tracker items
     * API can be used for fetching basic information of tracker items
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter
     * @return ResponseEntity&lt;List&lt;TrackerItem&gt;&gt;

     */
    public ResponseEntity<List<TrackerItem>> getTrackerItemsWithHttpInfo(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        ParameterizedTypeReference<List<TrackerItem>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemsRequestCreation(baselineId, trackerItemsRequest).toEntity(localVarReturnType);
    }

    /**
     * Get tracker items
     * API can be used for fetching basic information of tracker items
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter

     */
    public RestClient.ResponseSpec getTrackerItemsWithResponseSpec(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        return getTrackerItemsRequestCreation(baselineId, trackerItemsRequest);
    }
}
