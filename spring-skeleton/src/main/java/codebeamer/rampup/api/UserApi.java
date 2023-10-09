package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.User;
import codebeamer.rampup.client.model.UserFilteringRequest;
import codebeamer.rampup.client.model.UserReferenceSearchResult;
import codebeamer.rampup.client.model.UserSearchResult;
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


public class UserApi {
    private ApiClient apiClient;

    @Autowired
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get user
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param userId The userId parameter
     * @return User

     */
    private RestClient.ResponseSpec getUserRequestCreation(Integer userId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling getUser", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/v3/users/{userId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get user
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param userId The userId parameter
     * @return User

     */
    public User getUser(Integer userId) throws RestClientResponseException {
        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<User>() {};
        return getUserRequestCreation(userId).body(localVarReturnType);
    }

    /**
     * Get user
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param userId The userId parameter
     * @return ResponseEntity&lt;User&gt;

     */
    public ResponseEntity<User> getUserWithHttpInfo(Integer userId) throws RestClientResponseException {
        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserRequestCreation(userId).toEntity(localVarReturnType);
    }

    /**
     * Get user
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param userId The userId parameter

     */
    public RestClient.ResponseSpec getUserWithResponseSpec(Integer userId) throws RestClientResponseException {
        return getUserRequestCreation(userId);
    }
    /**
     * Get user by email address
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param email The email parameter
     * @return User

     */
    private RestClient.ResponseSpec getUserByEmailRequestCreation(String email) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new RestClientResponseException("Missing the required parameter 'email' when calling getUserByEmail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/v3/users/findByEmail", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get user by email address
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param email The email parameter
     * @return User

     */
    public User getUserByEmail(String email) throws RestClientResponseException {
        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<User>() {};
        return getUserByEmailRequestCreation(email).body(localVarReturnType);
    }

    /**
     * Get user by email address
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param email The email parameter
     * @return ResponseEntity&lt;User&gt;

     */
    public ResponseEntity<User> getUserByEmailWithHttpInfo(String email) throws RestClientResponseException {
        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserByEmailRequestCreation(email).toEntity(localVarReturnType);
    }

    /**
     * Get user by email address
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param email The email parameter

     */
    public RestClient.ResponseSpec getUserByEmailWithResponseSpec(String email) throws RestClientResponseException {
        return getUserByEmailRequestCreation(email);
    }
    /**
     * Get user by name
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param name The name parameter
     * @return User

     */
    private RestClient.ResponseSpec getUserByNameRequestCreation(String name) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new RestClientResponseException("Missing the required parameter 'name' when calling getUserByName", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/v3/users/findByName", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get user by name
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param name The name parameter
     * @return User

     */
    public User getUserByName(String name) throws RestClientResponseException {
        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<User>() {};
        return getUserByNameRequestCreation(name).body(localVarReturnType);
    }

    /**
     * Get user by name
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param name The name parameter
     * @return ResponseEntity&lt;User&gt;

     */
    public ResponseEntity<User> getUserByNameWithHttpInfo(String name) throws RestClientResponseException {
        ParameterizedTypeReference<User> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUserByNameRequestCreation(name).toEntity(localVarReturnType);
    }

    /**
     * Get user by name
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - User
     * <p><b>404</b> - User not found
     * @param name The name parameter

     */
    public RestClient.ResponseSpec getUserByNameWithResponseSpec(String name) throws RestClientResponseException {
        return getUserByNameRequestCreation(name);
    }
    /**
     * Get users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Users
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param groupId The groupId parameter
     * @param queryString The queryString parameter
     * @return UserReferenceSearchResult

     */
    private RestClient.ResponseSpec getUsersRequestCreation(Integer page, Integer pageSize, Integer groupId, String queryString) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "queryString", queryString));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<UserReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<UserReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/users", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Users
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param groupId The groupId parameter
     * @param queryString The queryString parameter
     * @return UserReferenceSearchResult

     */
    public UserReferenceSearchResult getUsers(Integer page, Integer pageSize, Integer groupId, String queryString) throws RestClientResponseException {
        ParameterizedTypeReference<UserReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<UserReferenceSearchResult>() {};
        return getUsersRequestCreation(page, pageSize, groupId, queryString).body(localVarReturnType);
    }

    /**
     * Get users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Users
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param groupId The groupId parameter
     * @param queryString The queryString parameter
     * @return ResponseEntity&lt;UserReferenceSearchResult&gt;

     */
    public ResponseEntity<UserReferenceSearchResult> getUsersWithHttpInfo(Integer page, Integer pageSize, Integer groupId, String queryString) throws RestClientResponseException {
        ParameterizedTypeReference<UserReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getUsersRequestCreation(page, pageSize, groupId, queryString).toEntity(localVarReturnType);
    }

    /**
     * Get users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Users
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param groupId The groupId parameter
     * @param queryString The queryString parameter

     */
    public RestClient.ResponseSpec getUsersWithResponseSpec(Integer page, Integer pageSize, Integer groupId, String queryString) throws RestClientResponseException {
        return getUsersRequestCreation(page, pageSize, groupId, queryString);
    }
    /**
     * Search users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Users
     * <p><b>400</b> - Bad request
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param userFilteringRequest The userFilteringRequest parameter
     * @return UserSearchResult

     */
    private RestClient.ResponseSpec searchUsersRequestCreation(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest) throws RestClientResponseException {
        Object postBody = userFilteringRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<UserSearchResult> localVarReturnType = new ParameterizedTypeReference<UserSearchResult>() {};
        return apiClient.invokeAPI("/v3/users/search", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Search users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Users
     * <p><b>400</b> - Bad request
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param userFilteringRequest The userFilteringRequest parameter
     * @return UserSearchResult

     */
    public UserSearchResult searchUsers(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest) throws RestClientResponseException {
        ParameterizedTypeReference<UserSearchResult> localVarReturnType = new ParameterizedTypeReference<UserSearchResult>() {};
        return searchUsersRequestCreation(page, pageSize, userFilteringRequest).body(localVarReturnType);
    }

    /**
     * Search users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Users
     * <p><b>400</b> - Bad request
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param userFilteringRequest The userFilteringRequest parameter
     * @return ResponseEntity&lt;UserSearchResult&gt;

     */
    public ResponseEntity<UserSearchResult> searchUsersWithHttpInfo(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest) throws RestClientResponseException {
        ParameterizedTypeReference<UserSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return searchUsersRequestCreation(page, pageSize, userFilteringRequest).toEntity(localVarReturnType);
    }

    /**
     * Search users
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Users
     * <p><b>400</b> - Bad request
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @param userFilteringRequest The userFilteringRequest parameter

     */
    public RestClient.ResponseSpec searchUsersWithResponseSpec(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest) throws RestClientResponseException {
        return searchUsersRequestCreation(page, pageSize, userFilteringRequest);
    }
}
