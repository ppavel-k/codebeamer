package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.PermissionIdsRequest;
import codebeamer.rampup.client.model.RoleWithPermissions;
import codebeamer.rampup.client.model.TrackerPermission;
import codebeamer.rampup.client.model.TrackerPermissionReference;
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


public class TrackerPermissionApi {
    private ApiClient apiClient;

    @Autowired
    public TrackerPermissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the immutable definition of a tracker permission
     * 
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permission.
     * @param trackerPermissionId The trackerPermissionId parameter
     * @return TrackerPermission

     */
    private RestClient.ResponseSpec getTrackerPermissionRequestCreation(Integer trackerPermissionId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerPermissionId' is set
        if (trackerPermissionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerPermissionId' when calling getTrackerPermission", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerPermissionId", trackerPermissionId);

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

        ParameterizedTypeReference<TrackerPermission> localVarReturnType = new ParameterizedTypeReference<TrackerPermission>() {};
        return apiClient.invokeAPI("/v3/trackers/permissions/{trackerPermissionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get the immutable definition of a tracker permission
     * 
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permission.
     * @param trackerPermissionId The trackerPermissionId parameter
     * @return TrackerPermission

     */
    public TrackerPermission getTrackerPermission(Integer trackerPermissionId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerPermission> localVarReturnType = new ParameterizedTypeReference<TrackerPermission>() {};
        return getTrackerPermissionRequestCreation(trackerPermissionId).body(localVarReturnType);
    }

    /**
     * Get the immutable definition of a tracker permission
     *
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permission.
     *
     * @param trackerPermissionId The trackerPermissionId parameter
     * @return ResponseEntity&lt;TrackerPermission&gt;
     */
    public RestClient.ResponseSpec getTrackerPermissionWithHttpInfo(Integer trackerPermissionId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerPermission> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerPermissionRequestCreation(trackerPermissionId);
    }

    /**
     * Get the immutable definition of a tracker permission
     * 
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permission.
     * @param trackerPermissionId The trackerPermissionId parameter

     */
    public RestClient.ResponseSpec getTrackerPermissionWithResponseSpec(Integer trackerPermissionId) throws RestClientResponseException {
        return getTrackerPermissionRequestCreation(trackerPermissionId);
    }
    /**
     * Get available tracker permissions
     * 
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions.
     * <p><b>404</b> - Tracker permission is not found.
     * @return List&lt;TrackerPermissionReference&gt;

     */
    private RestClient.ResponseSpec getTrackerPermissionsRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<TrackerPermissionReference> localVarReturnType = new ParameterizedTypeReference<TrackerPermissionReference>() {};
        return apiClient.invokeAPI("/v3/trackers/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get available tracker permissions
     *
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions.
     * <p><b>404</b> - Tracker permission is not found.
     *
     * @return List&lt;TrackerPermissionReference&gt;
     */
    public List<TrackerPermissionReference> getTrackerPermissions() throws RestClientResponseException {
        return getTrackerPermissionsRequestCreation().body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get available tracker permissions
     * 
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions.
     * <p><b>404</b> - Tracker permission is not found.
     * @return ResponseEntity&lt;List&lt;TrackerPermissionReference&gt;&gt;

     */
    public ResponseEntity<List<TrackerPermissionReference>> getTrackerPermissionsWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<TrackerPermissionReference>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerPermissionsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get available tracker permissions
     * 
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions.
     * <p><b>404</b> - Tracker permission is not found.

     */
    public RestClient.ResponseSpec getTrackerPermissionsWithResponseSpec() throws RestClientResponseException {
        return getTrackerPermissionsRequestCreation();
    }
    /**
     * List tracker permissions per role
     * API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker is not found.
     * <p><b>200</b> - Tracker permissions by role.
     * <p><b>400</b> - No access permission for this resource
     * @param trackerId The trackerId parameter
     * @param userId The userId parameter
     * @param roleId The roleId parameter
     * @return List&lt;RoleWithPermissions&gt;

     */
    private RestClient.ResponseSpec getTrackerPermissionsWithRolesRequestCreation(Integer trackerId, Integer userId, Integer roleId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerPermissionsWithRoles", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "roleId", roleId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<RoleWithPermissions> localVarReturnType = new ParameterizedTypeReference<RoleWithPermissions>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * List tracker permissions per role
     * API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker is not found.
     * <p><b>200</b> - Tracker permissions by role.
     * <p><b>400</b> - No access permission for this resource
     *
     * @param trackerId The trackerId parameter
     * @param userId    The userId parameter
     * @param roleId    The roleId parameter
     * @return List&lt;RoleWithPermissions&gt;
     */
    public List<RoleWithPermissions> getTrackerPermissionsWithRoles(Integer trackerId, Integer userId, Integer roleId) throws RestClientResponseException {
        return getTrackerPermissionsWithRolesRequestCreation(trackerId, userId, roleId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * List tracker permissions per role
     * API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker is not found.
     * <p><b>200</b> - Tracker permissions by role.
     * <p><b>400</b> - No access permission for this resource
     * @param trackerId The trackerId parameter
     * @param userId The userId parameter
     * @param roleId The roleId parameter
     * @return ResponseEntity&lt;List&lt;RoleWithPermissions&gt;&gt;

     */
    public ResponseEntity<List<RoleWithPermissions>> getTrackerPermissionsWithRolesWithHttpInfo(Integer trackerId, Integer userId, Integer roleId) throws RestClientResponseException {
        ParameterizedTypeReference<List<RoleWithPermissions>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerPermissionsWithRolesRequestCreation(trackerId, userId, roleId).toEntity(localVarReturnType);
    }

    /**
     * List tracker permissions per role
     * API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role
     * <p><b>403</b> - Authentication is required.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker is not found.
     * <p><b>200</b> - Tracker permissions by role.
     * <p><b>400</b> - No access permission for this resource
     * @param trackerId The trackerId parameter
     * @param userId The userId parameter
     * @param roleId The roleId parameter

     */
    public RestClient.ResponseSpec getTrackerPermissionsWithRolesWithResponseSpec(Integer trackerId, Integer userId, Integer roleId) throws RestClientResponseException {
        return getTrackerPermissionsWithRolesRequestCreation(trackerId, userId, roleId);
    }
    /**
     * Removes all tracker permissions from a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker/role is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions were removed.
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter

     */
    private RestClient.ResponseSpec removePermissionsRequestCreation(Integer trackerId, Integer roleId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling removePermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new RestClientResponseException("Missing the required parameter 'roleId' when calling removePermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("roleId", roleId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/roles/{roleId}/permissions", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Removes all tracker permissions from a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker/role is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions were removed.
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter

     */
    public Void removePermissions(Integer trackerId, Integer roleId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return removePermissionsRequestCreation(trackerId, roleId).body(localVarReturnType);
    }

    /**
     * Removes all tracker permissions from a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker/role is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions were removed.
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter

     */
    public ResponseEntity<Void> removePermissionsWithHttpInfo(Integer trackerId, Integer roleId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return removePermissionsRequestCreation(trackerId, roleId).toBodilessEntity();
    }

    /**
     * Removes all tracker permissions from a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker/role is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker permissions were removed.
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter

     */
    public RestClient.ResponseSpec removePermissionsWithResponseSpec(Integer trackerId, Integer roleId) throws RestClientResponseException {
        return removePermissionsRequestCreation(trackerId, roleId);
    }
    /**
     * Set the tracker permissions for a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker permissions are set
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / permission / roles not found
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter
     * @param permissionIdsRequest The permissionIdsRequest parameter
     * @return List&lt;RoleWithPermissions&gt;

     */
    private RestClient.ResponseSpec updatePermissionRequestCreation(Integer trackerId, Integer roleId, PermissionIdsRequest permissionIdsRequest) throws RestClientResponseException {
        Object postBody = permissionIdsRequest;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling updatePermission", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new RestClientResponseException("Missing the required parameter 'roleId' when calling updatePermission", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("roleId", roleId);

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

        ParameterizedTypeReference<RoleWithPermissions> localVarReturnType = new ParameterizedTypeReference<RoleWithPermissions>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/roles/{roleId}/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Set the tracker permissions for a specific role
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker permissions are set
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / permission / roles not found
     *
     * @param trackerId            The trackerId parameter
     * @param roleId               The roleId parameter
     * @param permissionIdsRequest The permissionIdsRequest parameter
     * @return List&lt;RoleWithPermissions&gt;
     */
    public List<RoleWithPermissions> updatePermission(Integer trackerId, Integer roleId, PermissionIdsRequest permissionIdsRequest) throws RestClientResponseException {
        return updatePermissionRequestCreation(trackerId, roleId, permissionIdsRequest).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Set the tracker permissions for a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker permissions are set
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / permission / roles not found
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter
     * @param permissionIdsRequest The permissionIdsRequest parameter
     * @return ResponseEntity&lt;List&lt;RoleWithPermissions&gt;&gt;

     */
    public ResponseEntity<List<RoleWithPermissions>> updatePermissionWithHttpInfo(Integer trackerId, Integer roleId, PermissionIdsRequest permissionIdsRequest) throws RestClientResponseException {
        return updatePermissionRequestCreation(trackerId, roleId, permissionIdsRequest).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Set the tracker permissions for a specific role
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker permissions are set
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / permission / roles not found
     * @param trackerId The trackerId parameter
     * @param roleId The roleId parameter
     * @param permissionIdsRequest The permissionIdsRequest parameter

     */
    public RestClient.ResponseSpec updatePermissionWithResponseSpec(Integer trackerId, Integer roleId, PermissionIdsRequest permissionIdsRequest) throws RestClientResponseException {
        return updatePermissionRequestCreation(trackerId, roleId, permissionIdsRequest);
    }
}
