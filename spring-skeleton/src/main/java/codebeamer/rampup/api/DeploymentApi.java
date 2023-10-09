package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.BackgroundJobReference;
import codebeamer.rampup.client.model.ExportForDeploymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DeploymentApi {
    private ApiClient apiClient;

    @Autowired
    public DeploymentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Export projects for deployment
     * 
     * <p><b>200</b> - Export job has been scheduled successfully
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param exportForDeploymentRequest The exportForDeploymentRequest parameter
     * @return BackgroundJobReference

     */
    private RestClient.ResponseSpec exportForDeploymentRequestCreation(ExportForDeploymentRequest exportForDeploymentRequest) throws RestClientResponseException {
        Object postBody = exportForDeploymentRequest;
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

        ParameterizedTypeReference<BackgroundJobReference> localVarReturnType = new ParameterizedTypeReference<BackgroundJobReference>() {};
        return apiClient.invokeAPI("/v3/deployment/export", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Export projects for deployment
     * 
     * <p><b>200</b> - Export job has been scheduled successfully
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param exportForDeploymentRequest The exportForDeploymentRequest parameter
     * @return BackgroundJobReference

     */
    public BackgroundJobReference exportForDeployment(ExportForDeploymentRequest exportForDeploymentRequest) throws RestClientResponseException {
        ParameterizedTypeReference<BackgroundJobReference> localVarReturnType = new ParameterizedTypeReference<BackgroundJobReference>() {};
        return exportForDeploymentRequestCreation(exportForDeploymentRequest).body(localVarReturnType);
    }

    /**
     * Export projects for deployment
     *
     * <p><b>200</b> - Export job has been scheduled successfully
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     *
     * @param exportForDeploymentRequest The exportForDeploymentRequest parameter
     * @return ResponseEntity&lt;BackgroundJobReference&gt;
     */
    public RestClient.ResponseSpec exportForDeploymentWithHttpInfo(ExportForDeploymentRequest exportForDeploymentRequest) throws RestClientResponseException {
        ParameterizedTypeReference<BackgroundJobReference> localVarReturnType = new ParameterizedTypeReference<BackgroundJobReference>() {};
        return exportForDeploymentRequestCreation(exportForDeploymentRequest);
    }

    /**
     * Export projects for deployment
     * 
     * <p><b>200</b> - Export job has been scheduled successfully
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param exportForDeploymentRequest The exportForDeploymentRequest parameter

     */
    public RestClient.ResponseSpec exportForDeploymentWithResponseSpec(ExportForDeploymentRequest exportForDeploymentRequest) throws RestClientResponseException {
        return exportForDeploymentRequestCreation(exportForDeploymentRequest);
    }
    /**
     * Start a deployment process
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>200</b> - Deployment is executed
     * @param imports Deployment files

     */
    private RestClient.ResponseSpec uploadDeploymentRequestCreation(File imports) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imports' is set
        if (imports == null) {
            throw new RestClientResponseException("Missing the required parameter 'imports' when calling uploadDeployment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imports != null)
            formParams.add("imports", new FileSystemResource(imports));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/deployment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Start a deployment process
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>200</b> - Deployment is executed
     * @param imports Deployment files

     */
    public void uploadDeployment(File imports) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        uploadDeploymentRequestCreation(imports).body(localVarReturnType);
    }

    /**
     * Start a deployment process
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>200</b> - Deployment is executed
     * @param imports Deployment files

     */
    public void uploadDeploymentWithHttpInfo(File imports) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        uploadDeploymentRequestCreation(imports);
    }

    /**
     * Start a deployment process
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * <p><b>200</b> - Deployment is executed
     * @param imports Deployment files

     */
    public RestClient.ResponseSpec uploadDeploymentWithResponseSpec(File imports) throws RestClientResponseException {
        return uploadDeploymentRequestCreation(imports);
    }
}
