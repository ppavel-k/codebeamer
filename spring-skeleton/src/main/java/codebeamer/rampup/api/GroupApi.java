package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.UserGroup;
import codebeamer.rampup.client.model.UserGroupReference;
import codebeamer.rampup.client.model.UserReferenceSearchResult;
import lombok.Getter;
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



@Getter
public class GroupApi {
    private ApiClient apiClient;

    @Autowired
    public GroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get user group
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - User Group not found
     * <p><b>200</b> - User Group
     * @param groupId The groupId parameter
     * @return UserGroup

     */
    private RestClient.ResponseSpec getGroupRequestCreation(Integer groupId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new RestClientResponseException("Missing the required parameter 'groupId' when calling getGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("groupId", groupId);

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

        return apiClient.invokeAPI("/v3/users/groups/{groupId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get user group
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - User Group not found
     * <p><b>200</b> - User Group
     * @param groupId The groupId parameter
     * @return UserGroup

     */
    public UserGroup getGroup(Integer groupId) {
        ParameterizedTypeReference<UserGroup> localVarReturnType = new ParameterizedTypeReference<UserGroup>() {};
        return getGroupRequestCreation(groupId).body(localVarReturnType);
    }

    /**
     * Get user group
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - User Group not found
     * <p><b>200</b> - User Group
     *
     * @param groupId The groupId parameter
     * @return ResponseEntity&lt;UserGroup&gt;
     */
    public RestClient.ResponseSpec getGroupWithHttpInfo(Integer groupId) throws RestClientResponseException {
        return getGroupRequestCreation(groupId);
    }

    /**
     * Get user group
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - User Group not found
     * <p><b>200</b> - User Group
     * @param groupId The groupId parameter

     */
    public RestClient.ResponseSpec getGroupWithResponseSpec(Integer groupId) throws RestClientResponseException {
        return getGroupRequestCreation(groupId);
    }
    /**
     * Get all members of a user group
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - User group is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     *
     * @param groupId  The groupId parameter
     * @param page     Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return UserReferenceSearchResult
     */
    private RestClient.ResponseSpec getGroupMembersRequestCreation(Integer groupId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new RestClientResponseException("Missing the required parameter 'groupId' when calling getGroupMembers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("groupId", groupId);

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

        ParameterizedTypeReference<UserReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {
        };
        return apiClient.invokeAPI("/v3/users/groups/{groupId}/members", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get all members of a user group
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - User group is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     * @param groupId The groupId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return UserReferenceSearchResult

     */
    public UserReferenceSearchResult getGroupMembers(Integer groupId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<UserReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGroupMembersRequestCreation(groupId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get all members of a user group
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - User group is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     *
     * @param groupId  The groupId parameter
     * @param page     Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;UserReferenceSearchResult&gt;
     */
    public RestClient.ResponseSpec getGroupMembersWithHttpInfo(Integer groupId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getGroupMembersRequestCreation(groupId, page, pageSize);
    }

    /**
     * Get all members of a user group
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - User group is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     * @param groupId The groupId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getGroupMembersWithResponseSpec(Integer groupId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getGroupMembersRequestCreation(groupId, page, pageSize);
    }
    /**
     * Get user groups
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User Group references
     * @return List&lt;UserGroupReference&gt;

     */
    private RestClient.ResponseSpec getGroupsRequestCreation() throws RestClientResponseException {
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

        return apiClient.invokeAPI("/v3/users/groups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get user groups
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User Group references
     * @return List&lt;UserGroupReference&gt;

     */
    public List<UserGroupReference> getGroups() throws RestClientResponseException {
        return getGroupsRequestCreation().body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get user groups
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User Group references
     * @return ResponseEntity&lt;List&lt;UserGroupReference&gt;&gt;

     */
    public ResponseEntity<List<UserGroupReference>> getGroupsWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<UserGroupReference>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getGroupsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get user groups
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User Group references

     */
    public RestClient.ResponseSpec getGroupsWithResponseSpec() throws RestClientResponseException {
        return getGroupsRequestCreation();
    }
}
