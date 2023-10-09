package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.Role;
import codebeamer.rampup.client.model.RoleReference;
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


public class RoleApi {
    private ApiClient apiClient;

    @Autowired
    public RoleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * @param roleId The roleId parameter
     * @return Role

     */
    private RestClient.ResponseSpec getRoleRequestCreation(Integer roleId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new RestClientResponseException("Missing the required parameter 'roleId' when calling getRole", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("roleId", roleId);

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

        ParameterizedTypeReference<Role> localVarReturnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI("/v3/roles/{roleId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * @param roleId The roleId parameter
     * @return Role

     */
    public Role getRole(Integer roleId) throws RestClientResponseException {
        ParameterizedTypeReference<Role> localVarReturnType = new ParameterizedTypeReference<Role>() {};
        return getRoleRequestCreation(roleId).body(localVarReturnType);
    }

    /**
     * Get role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * @param roleId The roleId parameter
     * @return ResponseEntity&lt;Role&gt;

     */
    public ResponseEntity<Role> getRoleWithHttpInfo(Integer roleId) throws RestClientResponseException {
        ParameterizedTypeReference<Role> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getRoleRequestCreation(roleId).toEntity(localVarReturnType);
    }

    /**
     * Get role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * @param roleId The roleId parameter

     */
    public RestClient.ResponseSpec getRoleWithResponseSpec(Integer roleId) throws RestClientResponseException {
        return getRoleRequestCreation(roleId);
    }
    /**
     * Get roles
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * @return List&lt;RoleReference&gt;

     */
    private RestClient.ResponseSpec getRolesRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<RoleReference> localVarReturnType = new ParameterizedTypeReference<RoleReference>() {};
        return apiClient.invokeAPI("/v3/roles", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get roles
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     *
     * @return List&lt;RoleReference&gt;
     */
    public List<RoleReference> getRoles() throws RestClientResponseException {
        return getRolesRequestCreation().body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get roles
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * @return ResponseEntity&lt;List&lt;RoleReference&gt;&gt;

     */
    public ResponseEntity<List<RoleReference>> getRolesWithHttpInfo() throws RestClientResponseException {
        return getRolesRequestCreation().toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get roles
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Role not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles

     */
    public RestClient.ResponseSpec getRolesWithResponseSpec() throws RestClientResponseException {
        return getRolesRequestCreation();
    }
}
