package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.TraceabilityInitialLevelFilter;
import codebeamer.rampup.client.model.TraceabilityItem;
import codebeamer.rampup.client.model.TraceabilityLevelFilter;
import codebeamer.rampup.client.model.TraceabilityResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TraceabilityApi {
    private ApiClient apiClient;

    @Autowired
    public TraceabilityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get initial ids
     * Get traceability initial ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param pageSize Number of items in a result page.
     * @param pageNo Index of the result page.
     * @param traceabilityInitialLevelFilter The traceabilityInitialLevelFilter parameter
     * @return List&lt;TraceabilityItem&gt;

     */
    private RestClient.ResponseSpec getTraceabilityInitialItemIdsRequestCreation(Integer pageSize, Integer pageNo, TraceabilityInitialLevelFilter traceabilityInitialLevelFilter) throws RestClientResponseException {
        Object postBody = traceabilityInitialLevelFilter;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNo", pageNo));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TraceabilityItem> localVarReturnType = new ParameterizedTypeReference<TraceabilityItem>() {};
        return apiClient.invokeAPI("/v3/traceability/items", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get initial ids
     * Get traceability initial ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     *
     * @param pageSize                       Number of items in a result page.
     * @param pageNo                         Index of the result page.
     * @param traceabilityInitialLevelFilter The traceabilityInitialLevelFilter parameter
     * @return List&lt;TraceabilityItem&gt;
     */
    public List<TraceabilityItem> getTraceabilityInitialItemIds(Integer pageSize, Integer pageNo, TraceabilityInitialLevelFilter traceabilityInitialLevelFilter) throws RestClientResponseException {
        return getTraceabilityInitialItemIdsRequestCreation(pageSize, pageNo, traceabilityInitialLevelFilter).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get initial ids
     * Get traceability initial ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param pageSize Number of items in a result page.
     * @param pageNo Index of the result page.
     * @param traceabilityInitialLevelFilter The traceabilityInitialLevelFilter parameter
     * @return ResponseEntity&lt;List&lt;TraceabilityItem&gt;&gt;

     */
    public ResponseEntity<List<TraceabilityItem>> getTraceabilityInitialItemIdsWithHttpInfo(Integer pageSize, Integer pageNo, TraceabilityInitialLevelFilter traceabilityInitialLevelFilter) throws RestClientResponseException {
        return getTraceabilityInitialItemIdsRequestCreation(pageSize, pageNo, traceabilityInitialLevelFilter).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get initial ids
     * Get traceability initial ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param pageSize Number of items in a result page.
     * @param pageNo Index of the result page.
     * @param traceabilityInitialLevelFilter The traceabilityInitialLevelFilter parameter

     */
    public RestClient.ResponseSpec getTraceabilityInitialItemIdsWithResponseSpec(Integer pageSize, Integer pageNo, TraceabilityInitialLevelFilter traceabilityInitialLevelFilter) throws RestClientResponseException {
        return getTraceabilityInitialItemIdsRequestCreation(pageSize, pageNo, traceabilityInitialLevelFilter);
    }
    /**
     * Get traceability level item ids
     * Get traceability item ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Traceability items list
     * @param itemsOnLevel Number of items per level.
     * @param itemsFromPreviousItem Number of items per item.
     * @param traceabilityLevelFilter The traceabilityLevelFilter parameter
     * @return TraceabilityResult

     */
    private RestClient.ResponseSpec getTraceabilityLevelItemIdsRequestCreation(Integer itemsOnLevel, Integer itemsFromPreviousItem, TraceabilityLevelFilter traceabilityLevelFilter) throws RestClientResponseException {
        Object postBody = traceabilityLevelFilter;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "itemsOnLevel", itemsOnLevel));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "itemsFromPreviousItem", itemsFromPreviousItem));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TraceabilityResult> localVarReturnType = new ParameterizedTypeReference<TraceabilityResult>() {};
        return apiClient.invokeAPI("/v3/traceability/relations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get traceability level item ids
     * Get traceability item ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Traceability items list
     * @param itemsOnLevel Number of items per level.
     * @param itemsFromPreviousItem Number of items per item.
     * @param traceabilityLevelFilter The traceabilityLevelFilter parameter
     * @return TraceabilityResult

     */
    public TraceabilityResult getTraceabilityLevelItemIds(Integer itemsOnLevel, Integer itemsFromPreviousItem, TraceabilityLevelFilter traceabilityLevelFilter) throws RestClientResponseException {
        ParameterizedTypeReference<TraceabilityResult> localVarReturnType = new ParameterizedTypeReference<TraceabilityResult>() {};
        return getTraceabilityLevelItemIdsRequestCreation(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter).body(localVarReturnType);
    }

    /**
     * Get traceability level item ids
     * Get traceability item ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Traceability items list
     * @param itemsOnLevel Number of items per level.
     * @param itemsFromPreviousItem Number of items per item.
     * @param traceabilityLevelFilter The traceabilityLevelFilter parameter
     * @return ResponseEntity&lt;TraceabilityResult&gt;

     */
    public ResponseEntity<TraceabilityResult> getTraceabilityLevelItemIdsWithHttpInfo(Integer itemsOnLevel, Integer itemsFromPreviousItem, TraceabilityLevelFilter traceabilityLevelFilter) throws RestClientResponseException {
        ParameterizedTypeReference<TraceabilityResult> localVarReturnType = new ParameterizedTypeReference<TraceabilityResult>() {};
        return getTraceabilityLevelItemIdsRequestCreation(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter).toEntity(localVarReturnType);
    }

    /**
     * Get traceability level item ids
     * Get traceability item ids!
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Traceability items list
     * @param itemsOnLevel Number of items per level.
     * @param itemsFromPreviousItem Number of items per item.
     * @param traceabilityLevelFilter The traceabilityLevelFilter parameter

     */
    public RestClient.ResponseSpec getTraceabilityLevelItemIdsWithResponseSpec(Integer itemsOnLevel, Integer itemsFromPreviousItem, TraceabilityLevelFilter traceabilityLevelFilter) throws RestClientResponseException {
        return getTraceabilityLevelItemIdsRequestCreation(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter);
    }
}
