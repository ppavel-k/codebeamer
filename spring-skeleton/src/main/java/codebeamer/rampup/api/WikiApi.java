package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.AccessPermission;
import codebeamer.rampup.client.model.AccessPermissionsRequest;
import codebeamer.rampup.client.model.ArtifactRevisionSearchResult;
import codebeamer.rampup.client.model.LockInfo;
import codebeamer.rampup.client.model.LockRequest;
import codebeamer.rampup.client.model.WikiPage;
import codebeamer.rampup.client.model.WikiRenderRequest;
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


public class WikiApi {
    private ApiClient apiClient;

    @Autowired
    public WikiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check whether a wiki page is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @return LockInfo

     */
    private RestClient.ResponseSpec checkWikiPageLockRequestCreation(Integer wikiId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling checkWikiPageLock", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<LockInfo> localVarReturnType = new ParameterizedTypeReference<LockInfo>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/lock", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Check whether a wiki page is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @return LockInfo

     */
    public LockInfo checkWikiPageLock(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<LockInfo> localVarReturnType = new ParameterizedTypeReference<LockInfo>() {};
        return checkWikiPageLockRequestCreation(wikiId).body(localVarReturnType);
    }

    /**
     * Check whether a wiki page is locked, and if it is, retrieve the details of the lock
     *
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiId Wiki page id
     * @return ResponseEntity&lt;LockInfo&gt;
     */
    public RestClient.ResponseSpec checkWikiPageLockWithHttpInfo(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<LockInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return checkWikiPageLockRequestCreation(wikiId);
    }

    /**
     * Check whether a wiki page is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id

     */
    public RestClient.ResponseSpec checkWikiPageLockWithResponseSpec(Integer wikiId) throws RestClientResponseException {
        return checkWikiPageLockRequestCreation(wikiId);
    }
    /**
     * Create a new wiki page
     * 
     * <p><b>200</b> - Properties of the created wikipage
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param wikiPage Wiki page details
     * @return WikiPage

     */
    private RestClient.ResponseSpec createWikiPageRequestCreation(WikiPage wikiPage) throws RestClientResponseException {
        Object postBody = wikiPage;
        // verify the required parameter 'wikiPage' is set
        if (wikiPage == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiPage' when calling createWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
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

        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return apiClient.invokeAPI("/v3/wikipages", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a new wiki page
     * 
     * <p><b>200</b> - Properties of the created wikipage
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param wikiPage Wiki page details
     * @return WikiPage

     */
    public WikiPage createWikiPage(WikiPage wikiPage) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return createWikiPageRequestCreation(wikiPage).body(localVarReturnType);
    }

    /**
     * Create a new wiki page
     *
     * <p><b>200</b> - Properties of the created wikipage
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiPage Wiki page details
     * @return ResponseEntity&lt;WikiPage&gt;
     */
    public RestClient.ResponseSpec createWikiPageWithHttpInfo(WikiPage wikiPage) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return createWikiPageRequestCreation(wikiPage);
    }

    /**
     * Create a new wiki page
     * 
     * <p><b>200</b> - Properties of the created wikipage
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param wikiPage Wiki page details

     */
    public RestClient.ResponseSpec createWikiPageWithResponseSpec(WikiPage wikiPage) throws RestClientResponseException {
        return createWikiPageRequestCreation(wikiPage);
    }
    /**
     * Delete a wiki page by its ID
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki page has been deleted successfully
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page

     */
    private RestClient.ResponseSpec deleteWikiPageRequestCreation(Integer wikiId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling deleteWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Delete a wiki page by its ID
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki page has been deleted successfully
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page

     */
    public Void deleteWikiPage(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteWikiPageRequestCreation(wikiId).body(localVarReturnType);
    }

    /**
     * Delete a wiki page by its ID
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki page has been deleted successfully
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page

     */
    public ResponseEntity<Void> deleteWikiPageWithHttpInfo(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteWikiPageRequestCreation(wikiId).toBodilessEntity();
    }

    /**
     * Delete a wiki page by its ID
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki page has been deleted successfully
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page

     */
    public RestClient.ResponseSpec deleteWikiPageWithResponseSpec(Integer wikiId) throws RestClientResponseException {
        return deleteWikiPageRequestCreation(wikiId);
    }
    /**
     * Get wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The wiki page
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page
     * @param version Version of the wiki page
     * @return WikiPage

     */
    private RestClient.ResponseSpec getWikiPageRequestCreation(Integer wikiId, Integer version) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling getWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The wiki page
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page
     * @param version Version of the wiki page
     * @return WikiPage

     */
    public WikiPage getWikiPage(Integer wikiId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return getWikiPageRequestCreation(wikiId, version).body(localVarReturnType);
    }

    /**
     * Get wiki page
     *
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The wiki page
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     *
     * @param wikiId  ID of the wiki page
     * @param version Version of the wiki page
     * @return ResponseEntity&lt;WikiPage&gt;
     */
    public RestClient.ResponseSpec getWikiPageWithHttpInfo(Integer wikiId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return getWikiPageRequestCreation(wikiId, version);
    }

    /**
     * Get wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The wiki page
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page
     * @param version Version of the wiki page

     */
    public RestClient.ResponseSpec getWikiPageWithResponseSpec(Integer wikiId, Integer version) throws RestClientResponseException {
        return getWikiPageRequestCreation(wikiId, version);
    }
    /**
     * Returns the change history of the specified wiki page
     * 
     * <p><b>200</b> - Wiki page history
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ArtifactRevisionSearchResult

     */
    private RestClient.ResponseSpec getWikiPageHistoryRequestCreation(Integer wikiId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling getWikiPageHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/history", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Returns the change history of the specified wiki page
     * 
     * <p><b>200</b> - Wiki page history
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ArtifactRevisionSearchResult

     */
    public ArtifactRevisionSearchResult getWikiPageHistory(Integer wikiId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return getWikiPageHistoryRequestCreation(wikiId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Returns the change history of the specified wiki page
     *
     * <p><b>200</b> - Wiki page history
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiId   The wikiId parameter
     * @param page     Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;ArtifactRevisionSearchResult&gt;
     */
    public RestClient.ResponseSpec getWikiPageHistoryWithHttpInfo(Integer wikiId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return getWikiPageHistoryRequestCreation(wikiId, page, pageSize);
    }

    /**
     * Returns the change history of the specified wiki page
     * 
     * <p><b>200</b> - Wiki page history
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getWikiPageHistoryWithResponseSpec(Integer wikiId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getWikiPageHistoryRequestCreation(wikiId, page, pageSize);
    }
    /**
     * Get permissions of a wiki page
     * 
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @return List&lt;AccessPermission&gt;

     */
    private RestClient.ResponseSpec getWikiPermissionsRequestCreation(Integer wikiId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling getWikiPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<AccessPermission> localVarReturnType = new ParameterizedTypeReference<AccessPermission>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get permissions of a wiki page
     *
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiId Wiki page id
     * @return List&lt;AccessPermission&gt;
     */
    public List<AccessPermission> getWikiPermissions(Integer wikiId) throws RestClientResponseException {
        return getWikiPermissionsRequestCreation(wikiId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get permissions of a wiki page
     * 
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @return ResponseEntity&lt;List&lt;AccessPermission&gt;&gt;

     */
    public ResponseEntity<List<AccessPermission>> getWikiPermissionsWithHttpInfo(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<List<AccessPermission>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getWikiPermissionsRequestCreation(wikiId).toEntity(localVarReturnType);
    }

    /**
     * Get permissions of a wiki page
     * 
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id

     */
    public RestClient.ResponseSpec getWikiPermissionsWithResponseSpec(Integer wikiId) throws RestClientResponseException {
        return getWikiPermissionsRequestCreation(wikiId);
    }
    /**
     * Lock a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param lockRequest Requested lock configuration

     */
    private RestClient.ResponseSpec lockWikiPageRequestCreation(Integer wikiId, LockRequest lockRequest) throws RestClientResponseException {
        Object postBody = lockRequest;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling lockWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/lock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Lock a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param lockRequest Requested lock configuration

     */
    public Void lockWikiPage(Integer wikiId, LockRequest lockRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return lockWikiPageRequestCreation(wikiId, lockRequest).body(localVarReturnType);
    }

    /**
     * Lock a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param lockRequest Requested lock configuration

     */
    public ResponseEntity<Void> lockWikiPageWithHttpInfo(Integer wikiId, LockRequest lockRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return lockWikiPageRequestCreation(wikiId, lockRequest).toBodilessEntity();
    }

    /**
     * Lock a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param lockRequest Requested lock configuration

     */
    public RestClient.ResponseSpec lockWikiPageWithResponseSpec(Integer wikiId, LockRequest lockRequest) throws RestClientResponseException {
        return lockWikiPageRequestCreation(wikiId, lockRequest);
    }
    /**
     * Render a wiki page as HTML in a specific context
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param projectId The projectId parameter
     * @param wikiRenderRequest The wikiRenderRequest parameter
     * @return String

     */
    private RestClient.ResponseSpec renderWikiMarkupRequestCreation(Integer projectId, WikiRenderRequest wikiRenderRequest) throws RestClientResponseException {
        Object postBody = wikiRenderRequest;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling renderWikiMarkup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "text/html", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/wiki2html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Render a wiki page as HTML in a specific context
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param projectId The projectId parameter
     * @param wikiRenderRequest The wikiRenderRequest parameter
     * @return String

     */
    public String renderWikiMarkup(Integer projectId, WikiRenderRequest wikiRenderRequest) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return renderWikiMarkupRequestCreation(projectId, wikiRenderRequest).body(localVarReturnType);
    }

    /**
     * Render a wiki page as HTML in a specific context
     *
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     *
     * @param projectId         The projectId parameter
     * @param wikiRenderRequest The wikiRenderRequest parameter
     * @return ResponseEntity&lt;String&gt;
     */
    public RestClient.ResponseSpec renderWikiMarkupWithHttpInfo(Integer projectId, WikiRenderRequest wikiRenderRequest) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return renderWikiMarkupRequestCreation(projectId, wikiRenderRequest);
    }

    /**
     * Render a wiki page as HTML in a specific context
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param projectId The projectId parameter
     * @param wikiRenderRequest The wikiRenderRequest parameter

     */
    public RestClient.ResponseSpec renderWikiMarkupWithResponseSpec(Integer projectId, WikiRenderRequest wikiRenderRequest) throws RestClientResponseException {
        return renderWikiMarkupRequestCreation(projectId, wikiRenderRequest);
    }
    /**
     * Render a wiki page as HTML
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page
     * @param version version of the wiki page
     * @return String

     */
    private RestClient.ResponseSpec renderWikiPageRequestCreation(Integer wikiId, Integer version) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling renderWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] localVarAccepts = { 
            "text/html", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/html", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Render a wiki page as HTML
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page
     * @param version version of the wiki page
     * @return String

     */
    public String renderWikiPage(Integer wikiId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return renderWikiPageRequestCreation(wikiId, version).body(localVarReturnType);
    }

    /**
     * Render a wiki page as HTML
     *
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     *
     * @param wikiId  ID of the wiki page
     * @param version version of the wiki page
     * @return ResponseEntity&lt;String&gt;
     */
    public RestClient.ResponseSpec renderWikiPageWithHttpInfo(Integer wikiId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return renderWikiPageRequestCreation(wikiId, version);
    }

    /**
     * Render a wiki page as HTML
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - The wiki content rendered as HTML
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The wiki page does not exist, or the artifact is not a wiki page
     * @param wikiId ID of the wiki page
     * @param version version of the wiki page

     */
    public RestClient.ResponseSpec renderWikiPageWithResponseSpec(Integer wikiId, Integer version) throws RestClientResponseException {
        return renderWikiPageRequestCreation(wikiId, version);
    }
    /**
     * Restores the content from a previous version of a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page or version not found
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - Wiki page has been restored
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param version The version to be restored
     * @return WikiPage

     */
    private RestClient.ResponseSpec restoreWikiPageContentRequestCreation(Integer wikiId, Integer version) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling restoreWikiPageContent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new RestClientResponseException("Missing the required parameter 'version' when calling restoreWikiPageContent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/restorecontent", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Restores the content from a previous version of a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page or version not found
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - Wiki page has been restored
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param version The version to be restored
     * @return WikiPage

     */
    public WikiPage restoreWikiPageContent(Integer wikiId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return restoreWikiPageContentRequestCreation(wikiId, version).body(localVarReturnType);
    }

    /**
     * Restores the content from a previous version of a wiki page
     *
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page or version not found
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - Wiki page has been restored
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiId  Wiki page id
     * @param version The version to be restored
     * @return ResponseEntity&lt;WikiPage&gt;
     */
    public RestClient.ResponseSpec restoreWikiPageContentWithHttpInfo(Integer wikiId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return restoreWikiPageContentRequestCreation(wikiId, version);
    }

    /**
     * Restores the content from a previous version of a wiki page
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page or version not found
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - Wiki page has been restored
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param version The version to be restored

     */
    public RestClient.ResponseSpec restoreWikiPageContentWithResponseSpec(Integer wikiId, Integer version) throws RestClientResponseException {
        return restoreWikiPageContentRequestCreation(wikiId, version);
    }
    /**
     * Set permissions of a wiki page
     * 
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param recursive Set permissions of children recursively
     * @param accessPermissionsRequest The accessPermissionsRequest parameter
     * @return List&lt;AccessPermission&gt;

     */
    private RestClient.ResponseSpec setWikiPermissionsRequestCreation(Integer wikiId, Boolean recursive, AccessPermissionsRequest accessPermissionsRequest) throws RestClientResponseException {
        Object postBody = accessPermissionsRequest;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling setWikiPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "recursive", recursive));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<AccessPermission> localVarReturnType = new ParameterizedTypeReference<AccessPermission>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/permissions", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Set permissions of a wiki page
     *
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiId                   Wiki page id
     * @param recursive                Set permissions of children recursively
     * @param accessPermissionsRequest The accessPermissionsRequest parameter
     * @return List&lt;AccessPermission&gt;
     */
    public List<AccessPermission> setWikiPermissions(Integer wikiId, Boolean recursive, AccessPermissionsRequest accessPermissionsRequest) throws RestClientResponseException {
        return setWikiPermissionsRequestCreation(wikiId, recursive, accessPermissionsRequest).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Set permissions of a wiki page
     * 
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param recursive Set permissions of children recursively
     * @param accessPermissionsRequest The accessPermissionsRequest parameter
     * @return ResponseEntity&lt;List&lt;AccessPermission&gt;&gt;

     */
    public ResponseEntity<List<AccessPermission>> setWikiPermissionsWithHttpInfo(Integer wikiId, Boolean recursive, AccessPermissionsRequest accessPermissionsRequest) throws RestClientResponseException {
        return setWikiPermissionsRequestCreation(wikiId, recursive, accessPermissionsRequest).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Set permissions of a wiki page
     * 
     * <p><b>200</b> - Permissions of the wiki page
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param wikiId Wiki page id
     * @param recursive Set permissions of children recursively
     * @param accessPermissionsRequest The accessPermissionsRequest parameter

     */
    public RestClient.ResponseSpec setWikiPermissionsWithResponseSpec(Integer wikiId, Boolean recursive, AccessPermissionsRequest accessPermissionsRequest) throws RestClientResponseException {
        return setWikiPermissionsRequestCreation(wikiId, recursive, accessPermissionsRequest);
    }
    /**
     * Unlock a wiki page
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param wikiId Wiki page id

     */
    private RestClient.ResponseSpec unlockWikiPageRequestCreation(Integer wikiId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling unlockWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/lock", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Unlock a wiki page
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param wikiId Wiki page id

     */
    public Void unlockWikiPage(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return unlockWikiPageRequestCreation(wikiId).body(localVarReturnType);
    }

    /**
     * Unlock a wiki page
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param wikiId Wiki page id

     */
    public ResponseEntity<Void> unlockWikiPageWithHttpInfo(Integer wikiId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return unlockWikiPageRequestCreation(wikiId).toBodilessEntity();
    }

    /**
     * Unlock a wiki page
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param wikiId Wiki page id

     */
    public RestClient.ResponseSpec unlockWikiPageWithResponseSpec(Integer wikiId) throws RestClientResponseException {
        return unlockWikiPageRequestCreation(wikiId);
    }
    /**
     * Update and/or move a wiki page
     * 
     * <p><b>404</b> - Wikipage not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Properties of the updated wikipage
     * <p><b>401</b> - Authentication is required
     * @param itemId Id of the wiki page to update
     * @param wikiPage Wiki page details
     * @return WikiPage

     */
    private RestClient.ResponseSpec updateWikiPageRequestCreation(Integer itemId, WikiPage wikiPage) throws RestClientResponseException {
        Object postBody = wikiPage;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling updateWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'wikiPage' is set
        if (wikiPage == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiPage' when calling updateWikiPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

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

        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return apiClient.invokeAPI("/v3/wikipages/{itemId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update and/or move a wiki page
     * 
     * <p><b>404</b> - Wikipage not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Properties of the updated wikipage
     * <p><b>401</b> - Authentication is required
     * @param itemId Id of the wiki page to update
     * @param wikiPage Wiki page details
     * @return WikiPage

     */
    public WikiPage updateWikiPage(Integer itemId, WikiPage wikiPage) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return updateWikiPageRequestCreation(itemId, wikiPage).body(localVarReturnType);
    }

    /**
     * Update and/or move a wiki page
     *
     * <p><b>404</b> - Wikipage not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Properties of the updated wikipage
     * <p><b>401</b> - Authentication is required
     *
     * @param itemId   Id of the wiki page to update
     * @param wikiPage Wiki page details
     * @return ResponseEntity&lt;WikiPage&gt;
     */
    public RestClient.ResponseSpec updateWikiPageWithHttpInfo(Integer itemId, WikiPage wikiPage) throws RestClientResponseException {
        ParameterizedTypeReference<WikiPage> localVarReturnType = new ParameterizedTypeReference<WikiPage>() {};
        return updateWikiPageRequestCreation(itemId, wikiPage);
    }

    /**
     * Update and/or move a wiki page
     * 
     * <p><b>404</b> - Wikipage not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Properties of the updated wikipage
     * <p><b>401</b> - Authentication is required
     * @param itemId Id of the wiki page to update
     * @param wikiPage Wiki page details

     */
    public RestClient.ResponseSpec updateWikiPageWithResponseSpec(Integer itemId, WikiPage wikiPage) throws RestClientResponseException {
        return updateWikiPageRequestCreation(itemId, wikiPage);
    }
}
