package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.Baseline;
import codebeamer.rampup.client.model.CreateBaselineRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BaselineApi {
    private ApiClient apiClient;

    @Autowired
    public BaselineApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a project or tracker baseline
     *
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baseline created successfully
     * <p><b>403</b> - Authentication is required or user has no permission
     * <p><b>404</b> - Project or tracker not found
     *
     * @param createBaselineRequest The createBaselineRequest parameter
     * @return Baseline
     */
    private RestClient.ResponseSpec createBaselineRequestCreation(CreateBaselineRequest createBaselineRequest) throws RestClientResponseException {
        Object postBody = createBaselineRequest;
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

        ParameterizedTypeReference<Baseline> localVarReturnType = new ParameterizedTypeReference<Baseline>() {};
        return apiClient.invokeAPI("/v3/baselines", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a project or tracker baseline
     * 
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baseline created successfully
     * <p><b>403</b> - Authentication is required or user has no permission
     * <p><b>404</b> - Project or tracker not found
     * @param createBaselineRequest The createBaselineRequest parameter
     * @return Baseline

     */
    public Baseline createBaseline(CreateBaselineRequest createBaselineRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Baseline> localVarReturnType = new ParameterizedTypeReference<Baseline>() {};
        return createBaselineRequestCreation(createBaselineRequest).body(localVarReturnType);
    }

    /**
     * Create a project or tracker baseline
     *
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baseline created successfully
     * <p><b>403</b> - Authentication is required or user has no permission
     * <p><b>404</b> - Project or tracker not found
     *
     * @param createBaselineRequest The createBaselineRequest parameter
     * @return ResponseEntity&lt;Baseline&gt;
     */
    public RestClient.ResponseSpec createBaselineWithHttpInfo(CreateBaselineRequest createBaselineRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Baseline> localVarReturnType = new ParameterizedTypeReference<Baseline>() {};
        return createBaselineRequestCreation(createBaselineRequest);
    }

    /**
     * Create a project or tracker baseline
     * 
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baseline created successfully
     * <p><b>403</b> - Authentication is required or user has no permission
     * <p><b>404</b> - Project or tracker not found
     * @param createBaselineRequest The createBaselineRequest parameter

     */
    public RestClient.ResponseSpec createBaselineWithResponseSpec(CreateBaselineRequest createBaselineRequest) throws RestClientResponseException {
        return createBaselineRequestCreation(createBaselineRequest);
    }
}
