package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.AutoApplyTestStepReuses;
import codebeamer.rampup.client.model.TrackerItemReference;
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


public class TestManagementApi {
    private ApiClient apiClient;

    @Autowired
    public TestManagementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - The item-references of the modified tracker-items where duplicate Test Steps was found and converted to Reuses
     * @param autoApplyTestStepReuses The autoApplyTestStepReuses parameter
     * @return List&lt;TrackerItemReference&gt;

     * Detecting and automatically converting Test Step duplicates to Step-reuses
     * @see <a href="https://codebeamer.com/cb/wiki/792788#section-Detecting+and+automatically+converting+Test+Step+duplicates+to+Step-reuses">Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses Documentation</a>
     */
    private RestClient.ResponseSpec autoApplyStepReusesRequestCreation(AutoApplyTestStepReuses autoApplyTestStepReuses) throws RestClientResponseException {
        Object postBody = autoApplyTestStepReuses;
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

        ParameterizedTypeReference<TrackerItemReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemReference>() {};
        return apiClient.invokeAPI("/v3/testcases/autoApplyStepReuses", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - The item-references of the modified tracker-items where duplicate Test Steps was found and converted to Reuses
     *
     * @param autoApplyTestStepReuses The autoApplyTestStepReuses parameter
     * @return List&lt;TrackerItemReference&gt;
     * <p>
     * Detecting and automatically converting Test Step duplicates to Step-reuses
     * @see <a href="https://codebeamer.com/cb/wiki/792788#section-Detecting+and+automatically+converting+Test+Step+duplicates+to+Step-reuses">Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses Documentation</a>
     */
    public List<TrackerItemReference> autoApplyStepReuses(AutoApplyTestStepReuses autoApplyTestStepReuses) throws RestClientResponseException {
        return autoApplyStepReusesRequestCreation(autoApplyTestStepReuses).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - The item-references of the modified tracker-items where duplicate Test Steps was found and converted to Reuses
     * @param autoApplyTestStepReuses The autoApplyTestStepReuses parameter
     * @return ResponseEntity&lt;List&lt;TrackerItemReference&gt;&gt;

     * Detecting and automatically converting Test Step duplicates to Step-reuses
     * @see <a href="https://codebeamer.com/cb/wiki/792788#section-Detecting+and+automatically+converting+Test+Step+duplicates+to+Step-reuses">Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses Documentation</a>
     */
    public ResponseEntity<List<TrackerItemReference>> autoApplyStepReusesWithHttpInfo(AutoApplyTestStepReuses autoApplyTestStepReuses) throws RestClientResponseException {
        return autoApplyStepReusesRequestCreation(autoApplyTestStepReuses).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - The item-references of the modified tracker-items where duplicate Test Steps was found and converted to Reuses
     * @param autoApplyTestStepReuses The autoApplyTestStepReuses parameter

     * Detecting and automatically converting Test Step duplicates to Step-reuses
     * @see <a href="https://codebeamer.com/cb/wiki/792788#section-Detecting+and+automatically+converting+Test+Step+duplicates+to+Step-reuses">Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses Documentation</a>
     */
    public RestClient.ResponseSpec autoApplyStepReusesWithResponseSpec(AutoApplyTestStepReuses autoApplyTestStepReuses) throws RestClientResponseException {
        return autoApplyStepReusesRequestCreation(autoApplyTestStepReuses);
    }
}
