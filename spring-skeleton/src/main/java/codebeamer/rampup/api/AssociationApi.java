package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.ArtifactRevisionSearchResult;
import codebeamer.rampup.client.model.Association;
import codebeamer.rampup.client.model.AssociationType;
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


public class AssociationApi {
    private ApiClient apiClient;

    @Autowired
    public AssociationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Created association
     * <p><b>403</b> - Authentication is required
     * @param association The association parameter
     * @return Association

     */
    private RestClient.ResponseSpec createAssociationRequestCreation(Association association) throws RestClientResponseException {
        Object postBody = association;
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

        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/associations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a new association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Created association
     * <p><b>403</b> - Authentication is required
     * @param association The association parameter
     * @return Association

     */
    public Association createAssociation(Association association) {
        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createAssociationRequestCreation(association).body(localVarReturnType);
    }

    /**
     * Create a new association
     *
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Created association
     * <p><b>403</b> - Authentication is required
     *
     * @param association The association parameter
     * @return ResponseEntity&lt;Association&gt;
     */
    public RestClient.ResponseSpec createAssociationWithHttpInfo(Association association) throws RestClientResponseException {
        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return createAssociationRequestCreation(association);
    }

    /**
     * Create a new association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Created association
     * <p><b>403</b> - Authentication is required
     * @param association The association parameter

     */
    public RestClient.ResponseSpec createAssociationWithResponseSpec(Association association) throws RestClientResponseException {
        return createAssociationRequestCreation(association);
    }
    /**
     * Delete association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Delete association by id
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter

     */
    private RestClient.ResponseSpec deleteAssociationRequestCreation(Integer associationId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'associationId' is set
        if (associationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'associationId' when calling deleteAssociation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("associationId", associationId);

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
        return apiClient.invokeAPI("/v3/associations/{associationId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Delete association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Delete association by id
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter

     */
    public void deleteAssociation(Integer associationId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteAssociationRequestCreation(associationId).body(localVarReturnType);
    }

    /**
     * Delete association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Delete association by id
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter

     */
    public void deleteAssociationWithHttpInfo(Integer associationId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteAssociationRequestCreation(associationId);
    }

    /**
     * Delete association
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Delete association by id
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter

     */
    public RestClient.ResponseSpec deleteAssociationWithResponseSpec(Integer associationId) throws RestClientResponseException {
        return deleteAssociationRequestCreation(associationId);
    }
    /**
     * Get an association by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Found association
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter
     * @return Association

     */
    private RestClient.ResponseSpec getAssociationRequestCreation(Integer associationId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'associationId' is set
        if (associationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'associationId' when calling getAssociation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("associationId", associationId);

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

        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return apiClient.invokeAPI("/v3/associations/{associationId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get an association by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Found association
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter
     * @return Association

     */
    public Association getAssociation(Integer associationId) throws RestClientResponseException {
        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return getAssociationRequestCreation(associationId).body(localVarReturnType);
    }

    /**
     * Get an association by id
     *
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Found association
     * <p><b>403</b> - Authentication is required
     *
     * @param associationId The associationId parameter
     * @return ResponseEntity&lt;Association&gt;
     */
    public RestClient.ResponseSpec getAssociationWithHttpInfo(Integer associationId) throws RestClientResponseException {
        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return getAssociationRequestCreation(associationId);
    }

    /**
     * Get an association by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>200</b> - Found association
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter

     */
    public RestClient.ResponseSpec getAssociationWithResponseSpec(Integer associationId) throws RestClientResponseException {
        return getAssociationRequestCreation(associationId);
    }
    /**
     * Returns the change history of the specified association
     * 
     * <p><b>404</b> - Association not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Association history
     * <p><b>401</b> - Authentication is required
     * @param associationId The associationId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ArtifactRevisionSearchResult

     */
    private RestClient.ResponseSpec getAssociationHistoryRequestCreation(Integer associationId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'associationId' is set
        if (associationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'associationId' when calling getAssociationHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("associationId", associationId);

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
        return apiClient.invokeAPI("/v3/associations/{associationId}/history", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Returns the change history of the specified association
     * 
     * <p><b>404</b> - Association not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Association history
     * <p><b>401</b> - Authentication is required
     * @param associationId The associationId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ArtifactRevisionSearchResult

     */
    public ArtifactRevisionSearchResult getAssociationHistory(Integer associationId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return getAssociationHistoryRequestCreation(associationId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Returns the change history of the specified association
     *
     * <p><b>404</b> - Association not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Association history
     * <p><b>401</b> - Authentication is required
     *
     * @param associationId The associationId parameter
     * @param page          Index of the result page starting from 1.
     * @param pageSize      Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;ArtifactRevisionSearchResult&gt;
     */
    public RestClient.ResponseSpec getAssociationHistoryWithHttpInfo(Integer associationId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return getAssociationHistoryRequestCreation(associationId, page, pageSize);
    }

    /**
     * Returns the change history of the specified association
     * 
     * <p><b>404</b> - Association not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Association history
     * <p><b>401</b> - Authentication is required
     * @param associationId The associationId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getAssociationHistoryWithResponseSpec(Integer associationId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getAssociationHistoryRequestCreation(associationId, page, pageSize);
    }
    /**
     * Get association type by id
     * 
     * <p><b>200</b> - Association type
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     * @param associationTypeId The associationTypeId parameter
     * @return AssociationType

     */
    private RestClient.ResponseSpec getAssociationTypeRequestCreation(Integer associationTypeId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'associationTypeId' is set
        if (associationTypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'associationTypeId' when calling getAssociationType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("associationTypeId", associationTypeId);

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

        ParameterizedTypeReference<AssociationType> localVarReturnType = new ParameterizedTypeReference<AssociationType>() {};
        return apiClient.invokeAPI("/v3/associations/types/{associationTypeId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get association type by id
     * 
     * <p><b>200</b> - Association type
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     * @param associationTypeId The associationTypeId parameter
     * @return AssociationType

     */
    public AssociationType getAssociationType(Integer associationTypeId) throws RestClientResponseException {
        ParameterizedTypeReference<AssociationType> localVarReturnType = new ParameterizedTypeReference<AssociationType>() {};
        return getAssociationTypeRequestCreation(associationTypeId).body(localVarReturnType);
    }

    /**
     * Get association type by id
     *
     * <p><b>200</b> - Association type
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     *
     * @param associationTypeId The associationTypeId parameter
     * @return ResponseEntity&lt;AssociationType&gt;
     */
    public RestClient.ResponseSpec getAssociationTypeWithHttpInfo(Integer associationTypeId) throws RestClientResponseException {
        ParameterizedTypeReference<AssociationType> localVarReturnType = new ParameterizedTypeReference<AssociationType>() {};
        return getAssociationTypeRequestCreation(associationTypeId);
    }

    /**
     * Get association type by id
     * 
     * <p><b>200</b> - Association type
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     * @param associationTypeId The associationTypeId parameter

     */
    public RestClient.ResponseSpec getAssociationTypeWithResponseSpec(Integer associationTypeId) throws RestClientResponseException {
        return getAssociationTypeRequestCreation(associationTypeId);
    }
    /**
     * Get available association types
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of association types
     * <p><b>403</b> - Authentication is required
     * @return List&lt;AssociationType&gt;

     */
    private RestClient.ResponseSpec getAvailableAssociationTypesRequestCreation() throws RestClientResponseException {
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

        ParameterizedTypeReference<AssociationType> localVarReturnType = new ParameterizedTypeReference<AssociationType>() {};
        return apiClient.invokeAPI("/v3/associations/types", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get available association types
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of association types
     * <p><b>403</b> - Authentication is required
     * @return List&lt;AssociationType&gt;

     */
    public List<AssociationType> getAvailableAssociationTypes() throws RestClientResponseException {
        return getAvailableAssociationTypesRequestCreation().body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get available association types
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of association types
     * <p><b>403</b> - Authentication is required
     * @return ResponseEntity&lt;List&lt;AssociationType&gt;&gt;

     */
    public ResponseEntity<List<AssociationType>> getAvailableAssociationTypesWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<AssociationType>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getAvailableAssociationTypesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get available association types
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List of association types
     * <p><b>403</b> - Authentication is required

     */
    public RestClient.ResponseSpec getAvailableAssociationTypesWithResponseSpec() throws RestClientResponseException {
        return getAvailableAssociationTypesRequestCreation();
    }
    /**
     * Update association settings
     * 
     * <p><b>200</b> - Updated association
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter
     * @param association The association parameter
     * @return Association

     */
    private RestClient.ResponseSpec updateAssociationRequestCreation(Integer associationId, Association association) throws RestClientResponseException {
        Object postBody = association;
        // verify the required parameter 'associationId' is set
        if (associationId == null) {
            throw new RestClientResponseException("Missing the required parameter 'associationId' when calling updateAssociation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("associationId", associationId);

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

        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return apiClient.invokeAPI("/v3/associations/{associationId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update association settings
     * 
     * <p><b>200</b> - Updated association
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter
     * @param association The association parameter
     * @return Association

     */
    public Association updateAssociation(Integer associationId, Association association) throws RestClientResponseException {
        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return updateAssociationRequestCreation(associationId, association).body(localVarReturnType);
    }

    /**
     * Update association settings
     *
     * <p><b>200</b> - Updated association
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     *
     * @param associationId The associationId parameter
     * @param association   The association parameter
     * @return ResponseEntity&lt;Association&gt;
     */
    public RestClient.ResponseSpec updateAssociationWithHttpInfo(Integer associationId, Association association) throws RestClientResponseException {
        ParameterizedTypeReference<Association> localVarReturnType = new ParameterizedTypeReference<Association>() {};
        return updateAssociationRequestCreation(associationId, association);
    }

    /**
     * Update association settings
     * 
     * <p><b>200</b> - Updated association
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Association not found
     * <p><b>403</b> - Authentication is required
     * @param associationId The associationId parameter
     * @param association The association parameter

     */
    public RestClient.ResponseSpec updateAssociationWithResponseSpec(Integer associationId, Association association) throws RestClientResponseException {
        return updateAssociationRequestCreation(associationId, association);
    }
}
