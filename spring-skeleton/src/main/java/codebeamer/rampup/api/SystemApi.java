package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.MaintenanceMode;
import codebeamer.rampup.client.model.SystemStatus;
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


public class SystemApi {
    private ApiClient apiClient;

    @Autowired
    public SystemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @return SystemStatus

     */
    private RestClient.ResponseSpec getSystemStatusRequestCreation() throws RestClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<SystemStatus> localVarReturnType = new ParameterizedTypeReference<SystemStatus>() {};
        return apiClient.invokeAPI("/v3/system/maintenance", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @return SystemStatus

     */
    public SystemStatus getSystemStatus() throws RestClientResponseException {
        ParameterizedTypeReference<SystemStatus> localVarReturnType = new ParameterizedTypeReference<SystemStatus>() {};
        return getSystemStatusRequestCreation().body(localVarReturnType);
    }

    /**
     * Get system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @return ResponseEntity&lt;SystemStatus&gt;

     */
    public ResponseEntity<SystemStatus> getSystemStatusWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<SystemStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSystemStatusRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status

     */
    public RestClient.ResponseSpec getSystemStatusWithResponseSpec() throws RestClientResponseException {
        return getSystemStatusRequestCreation();
    }
    /**
     * Set system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @param maintenanceMode The maintenanceMode parameter
     * @return SystemStatus

     */
    private RestClient.ResponseSpec setSystemStatusRequestCreation(MaintenanceMode maintenanceMode) throws RestClientResponseException {
        Object postBody = maintenanceMode;
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

        ParameterizedTypeReference<SystemStatus> localVarReturnType = new ParameterizedTypeReference<SystemStatus>() {};
        return apiClient.invokeAPI("/v3/system/maintenance", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Set system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @param maintenanceMode The maintenanceMode parameter
     * @return SystemStatus

     */
    public SystemStatus setSystemStatus(MaintenanceMode maintenanceMode) throws RestClientResponseException {
        ParameterizedTypeReference<SystemStatus> localVarReturnType = new ParameterizedTypeReference<SystemStatus>() {};
        return setSystemStatusRequestCreation(maintenanceMode).body(localVarReturnType);
    }

    /**
     * Set system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @param maintenanceMode The maintenanceMode parameter
     * @return ResponseEntity&lt;SystemStatus&gt;

     */
    public ResponseEntity<SystemStatus> setSystemStatusWithHttpInfo(MaintenanceMode maintenanceMode) throws RestClientResponseException {
        ParameterizedTypeReference<SystemStatus> localVarReturnType = new ParameterizedTypeReference<>() {};
        return setSystemStatusRequestCreation(maintenanceMode).toEntity(localVarReturnType);
    }

    /**
     * Set system maintenance status
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>400</b> - Request cannot be processed
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - System maintenance status
     * @param maintenanceMode The maintenanceMode parameter

     */
    public RestClient.ResponseSpec setSystemStatusWithResponseSpec(MaintenanceMode maintenanceMode) throws RestClientResponseException {
        return setSystemStatusRequestCreation(maintenanceMode);
    }
}
