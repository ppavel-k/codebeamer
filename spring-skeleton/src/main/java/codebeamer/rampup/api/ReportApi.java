package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.ReportItemResult;
import codebeamer.rampup.client.model.ReportResult;
import codebeamer.rampup.client.model.SimpleReportSettings;
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


public class ReportApi {
    private ApiClient apiClient;

    @Autowired
    public ReportApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Report settings
     * <p><b>400</b> - Bad request
     * @param simpleReportSettings The simpleReportSettings parameter
     * @return SimpleReportSettings

     */
    private RestClient.ResponseSpec createReportRequestCreation(SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        Object postBody = simpleReportSettings;
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

        ParameterizedTypeReference<SimpleReportSettings> localVarReturnType = new ParameterizedTypeReference<SimpleReportSettings>() {};
        return apiClient.invokeAPI("/v3/reports", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Report settings
     * <p><b>400</b> - Bad request
     * @param simpleReportSettings The simpleReportSettings parameter
     * @return SimpleReportSettings

     */
    public SimpleReportSettings createReport(SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<SimpleReportSettings> localVarReturnType = new ParameterizedTypeReference<SimpleReportSettings>() {};
        return createReportRequestCreation(simpleReportSettings).body(localVarReturnType);
    }

    /**
     * Create a report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Report settings
     * <p><b>400</b> - Bad request
     * @param simpleReportSettings The simpleReportSettings parameter
     * @return ResponseEntity&lt;SimpleReportSettings&gt;

     */
    public ResponseEntity<SimpleReportSettings> createReportWithHttpInfo(SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<SimpleReportSettings> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createReportRequestCreation(simpleReportSettings).toEntity(localVarReturnType);
    }

    /**
     * Create a report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Report settings
     * <p><b>400</b> - Bad request
     * @param simpleReportSettings The simpleReportSettings parameter

     */
    public RestClient.ResponseSpec createReportWithResponseSpec(SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        return createReportRequestCreation(simpleReportSettings);
    }
    /**
     * Get a report results by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report content by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportResult

     */
    private RestClient.ResponseSpec getReportByIdRequestCreation(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling getReportById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        return apiClient.invokeAPI("/v3/reports/{reportId}/results", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get a report results by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report content by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportResult

     */
    public ReportResult getReportById(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportResult> localVarReturnType = new ParameterizedTypeReference<ReportResult>() {};
        return getReportByIdRequestCreation(reportId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get a report results by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report content by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ResponseEntity&lt;ReportResult&gt;

     */
    public ResponseEntity<ReportResult> getReportByIdWithHttpInfo(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReportByIdRequestCreation(reportId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get a report results by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report content by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500

     */
    public RestClient.ResponseSpec getReportByIdWithResponseSpec(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getReportByIdRequestCreation(reportId, page, pageSize);
    }
    /**
     * Get a report items by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report items by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportItemResult

     */
    private RestClient.ResponseSpec getReportItemsByIdRequestCreation(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling getReportItemsById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        return apiClient.invokeAPI("/v3/reports/{reportId}/items", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get a report items by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report items by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ReportItemResult

     */
    public ReportItemResult getReportItemsById(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportItemResult> localVarReturnType = new ParameterizedTypeReference<ReportItemResult>() {};
        return getReportItemsByIdRequestCreation(reportId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get a report items by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report items by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500
     * @return ResponseEntity&lt;ReportItemResult&gt;

     */
    public ResponseEntity<ReportItemResult> getReportItemsByIdWithHttpInfo(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReportItemResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getReportItemsByIdRequestCreation(reportId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get a report items by id of the report
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Report not found
     * <p><b>200</b> - Report items by id
     * @param reportId Id of a report
     * @param page Index of a report page starting from 1.
     * @param pageSize Number of items a report page. Max value: 500

     */
    public RestClient.ResponseSpec getReportItemsByIdWithResponseSpec(Integer reportId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getReportItemsByIdRequestCreation(reportId, page, pageSize);
    }
    /**
     * Update report settings
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated report settings
     * <p><b>400</b> - Bad request
     * @param reportId Id of a report
     * @param simpleReportSettings The simpleReportSettings parameter
     * @return SimpleReportSettings

     */
    private RestClient.ResponseSpec updateReportRequestCreation(Integer reportId, SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        Object postBody = simpleReportSettings;
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new RestClientResponseException("Missing the required parameter 'reportId' when calling updateReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<SimpleReportSettings> localVarReturnType = new ParameterizedTypeReference<SimpleReportSettings>() {};
        return apiClient.invokeAPI("/v3/reports/{reportId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update report settings
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated report settings
     * <p><b>400</b> - Bad request
     * @param reportId Id of a report
     * @param simpleReportSettings The simpleReportSettings parameter
     * @return SimpleReportSettings

     */
    public SimpleReportSettings updateReport(Integer reportId, SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<SimpleReportSettings> localVarReturnType = new ParameterizedTypeReference<SimpleReportSettings>() {};
        return updateReportRequestCreation(reportId, simpleReportSettings).body(localVarReturnType);
    }

    /**
     * Update report settings
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated report settings
     * <p><b>400</b> - Bad request
     * @param reportId Id of a report
     * @param simpleReportSettings The simpleReportSettings parameter
     * @return ResponseEntity&lt;SimpleReportSettings&gt;

     */
    public ResponseEntity<SimpleReportSettings> updateReportWithHttpInfo(Integer reportId, SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        ParameterizedTypeReference<SimpleReportSettings> localVarReturnType = new ParameterizedTypeReference<SimpleReportSettings>() {};
        return updateReportRequestCreation(reportId, simpleReportSettings).toEntity(localVarReturnType);
    }

    /**
     * Update report settings
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated report settings
     * <p><b>400</b> - Bad request
     * @param reportId Id of a report
     * @param simpleReportSettings The simpleReportSettings parameter

     */
    public RestClient.ResponseSpec updateReportWithResponseSpec(Integer reportId, SimpleReportSettings simpleReportSettings) throws RestClientResponseException {
        return updateReportRequestCreation(reportId, simpleReportSettings);
    }
}
