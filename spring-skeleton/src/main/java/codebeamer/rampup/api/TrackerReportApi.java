package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.ReportItemResult;
import codebeamer.rampup.client.model.ReportReference;
import codebeamer.rampup.client.model.ReportResult;
import codebeamer.rampup.client.model.TrackerReportSettings;
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


public class TrackerReportApi {
    private ApiClient apiClient;

    @Autowired
    public TrackerReportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param trackerReportSettings The trackerReportSettings parameter
     * @return TrackerReportSettings

     */
    private RestClient.ResponseSpec createTrackerReportRequestCreation(Integer trackerId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        Object postBody = trackerReportSettings;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling createTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<TrackerReportSettings> localVarReturnType = new ParameterizedTypeReference<TrackerReportSettings>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/reports", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Creates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param trackerReportSettings The trackerReportSettings parameter
     * @return TrackerReportSettings

     */
    public TrackerReportSettings createTrackerReport(Integer trackerId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerReportSettings> localVarReturnType = new ParameterizedTypeReference<TrackerReportSettings>() {};
        return createTrackerReportRequestCreation(trackerId, trackerReportSettings).body(localVarReturnType);
    }

    /**
     * Creates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param trackerReportSettings The trackerReportSettings parameter
     * @return ResponseEntity&lt;TrackerReportSettings&gt;

     */
    public ResponseEntity<TrackerReportSettings> createTrackerReportWithHttpInfo(Integer trackerId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerReportSettings> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createTrackerReportRequestCreation(trackerId, trackerReportSettings).toEntity(localVarReturnType);
    }

    /**
     * Creates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param trackerReportSettings The trackerReportSettings parameter

     */
    public RestClient.ResponseSpec createTrackerReportWithResponseSpec(Integer trackerId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        return createTrackerReportRequestCreation(trackerId, trackerReportSettings);
    }
    /**
     * Deletes a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report deleted.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter

     */
    private RestClient.ResponseSpec deleteTrackerReportRequestCreation(Integer trackerId, Integer reportId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling deleteTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling deleteTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("reportId", reportId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/reports/{reportId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Deletes a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report deleted.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter

     */
    public Void deleteTrackerReport(Integer trackerId, Integer reportId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerReportRequestCreation(trackerId, reportId).body(localVarReturnType);
    }

    /**
     * Deletes a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report deleted.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter

     */
    public ResponseEntity<Void> deleteTrackerReportWithHttpInfo(Integer trackerId, Integer reportId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerReportRequestCreation(trackerId, reportId).toEntity(localVarReturnType);
    }

    /**
     * Deletes a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report deleted.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter

     */
    public RestClient.ResponseSpec deleteTrackerReportWithResponseSpec(Integer trackerId, Integer reportId) throws RestClientResponseException {
        return deleteTrackerReportRequestCreation(trackerId, reportId);
    }
    /**
     * Get a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportResult

     */
    private RestClient.ResponseSpec getTrackerReportRequestCreation(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling getTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("reportId", reportId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<ReportResult> localVarReturnType = new ParameterizedTypeReference<ReportResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/reports/{reportId}/results", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportResult

     */
    public ReportResult getTrackerReport(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportResult> localVarReturnType = new ParameterizedTypeReference<ReportResult>() {};
        return getTrackerReportRequestCreation(trackerId, reportId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ResponseEntity&lt;ReportResult&gt;

     */
    public ResponseEntity<ReportResult> getTrackerReportWithHttpInfo(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerReportRequestCreation(trackerId, reportId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500

     */
    public RestClient.ResponseSpec getTrackerReportWithResponseSpec(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getTrackerReportRequestCreation(trackerId, reportId, page, pageSize);
    }
    /**
     * Get report items of a specific tracker view
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report items
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportItemResult

     */
    private RestClient.ResponseSpec getTrackerReportItemsRequestCreation(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerReportItems", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling getTrackerReportItems", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("reportId", reportId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<ReportItemResult> localVarReturnType = new ParameterizedTypeReference<ReportItemResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/reports/{reportId}/items", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get report items of a specific tracker view
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report items
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportItemResult

     */
    public ReportItemResult getTrackerReportItems(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportItemResult> localVarReturnType = new ParameterizedTypeReference<ReportItemResult>() {};
        return getTrackerReportItemsRequestCreation(trackerId, reportId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get report items of a specific tracker view
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report items
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ResponseEntity&lt;ReportItemResult&gt;

     */
    public ResponseEntity<ReportItemResult> getTrackerReportItemsWithHttpInfo(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportItemResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerReportItemsRequestCreation(trackerId, reportId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get report items of a specific tracker view
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker report items
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500

     */
    public RestClient.ResponseSpec getTrackerReportItemsWithResponseSpec(Integer trackerId, Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getTrackerReportItemsRequestCreation(trackerId, reportId, page, pageSize);
    }
    /**
     * Get all reports of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Tracker report reference list
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @return List&lt;ReportReference&gt;

     */
    private RestClient.ResponseSpec getTrackerReportsRequestCreation(Integer trackerId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerReports", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<ReportReference> localVarReturnType = new ParameterizedTypeReference<ReportReference>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/reports", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get all reports of a specific tracker
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Tracker report reference list
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     *
     * @param trackerId The trackerId parameter
     * @return List&lt;ReportReference&gt;
     */
    public List<ReportReference> getTrackerReports(Integer trackerId) throws RestClientResponseException {
        return getTrackerReportsRequestCreation(trackerId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get all reports of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Tracker report reference list
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @return ResponseEntity&lt;List&lt;ReportReference&gt;&gt;

     */
    public ResponseEntity<List<ReportReference>> getTrackerReportsWithHttpInfo(Integer trackerId) throws RestClientResponseException {
        return getTrackerReportsRequestCreation(trackerId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get all reports of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Tracker report reference list
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter

     */
    public RestClient.ResponseSpec getTrackerReportsWithResponseSpec(Integer trackerId) throws RestClientResponseException {
        return getTrackerReportsRequestCreation(trackerId);
    }
    /**
     * Updates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param trackerReportSettings The trackerReportSettings parameter
     * @return TrackerReportSettings

     */
    private RestClient.ResponseSpec updateTrackerReportRequestCreation(Integer trackerId, Integer reportId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        Object postBody = trackerReportSettings;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling updateTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling updateTrackerReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("reportId", reportId);

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

        ParameterizedTypeReference<TrackerReportSettings> localVarReturnType = new ParameterizedTypeReference<TrackerReportSettings>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/reports/{reportId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Updates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param trackerReportSettings The trackerReportSettings parameter
     * @return TrackerReportSettings

     */
    public TrackerReportSettings updateTrackerReport(Integer trackerId, Integer reportId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerReportSettings> localVarReturnType = new ParameterizedTypeReference<TrackerReportSettings>() {};
        return updateTrackerReportRequestCreation(trackerId, reportId, trackerReportSettings).body(localVarReturnType);
    }

    /**
     * Updates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param trackerReportSettings The trackerReportSettings parameter
     * @return ResponseEntity&lt;TrackerReportSettings&gt;

     */
    public ResponseEntity<TrackerReportSettings> updateTrackerReportWithHttpInfo(Integer trackerId, Integer reportId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerReportSettings> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateTrackerReportRequestCreation(trackerId, reportId, trackerReportSettings).toEntity(localVarReturnType);
    }

    /**
     * Updates a report of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker report settings
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Report not found
     * @param trackerId The trackerId parameter
     * @param reportId The reportId parameter
     * @param trackerReportSettings The trackerReportSettings parameter

     */
    public RestClient.ResponseSpec updateTrackerReportWithResponseSpec(Integer trackerId, Integer reportId, TrackerReportSettings trackerReportSettings) throws RestClientResponseException {
        return updateTrackerReportRequestCreation(trackerId, reportId, trackerReportSettings);
    }
}
