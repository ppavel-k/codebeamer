package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.ArtifactRevisionSearchResult;
import codebeamer.rampup.client.model.Attachment;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
public class AttachmentApi {
    private ApiClient apiClient;

    @Autowired
    public AttachmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes an attachment
     * 
     * <p><b>200</b> - Attachment deleted
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter

     */
    private RestClient.ResponseSpec deleteAttachmentRequestCreation(Integer attachmentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling deleteAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("attachmentId", attachmentId);

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
        return apiClient.invokeAPI("/v3/attachments/{attachmentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Deletes an attachment
     * 
     * <p><b>200</b> - Attachment deleted
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter

     */
    public void deleteAttachment(Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        deleteAttachmentRequestCreation(attachmentId).body(localVarReturnType);
    }

    /**
     * Deletes an attachment
     * 
     * <p><b>200</b> - Attachment deleted
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter

     */
    public ResponseEntity<Void> deleteAttachmentWithHttpInfo(Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteAttachmentRequestCreation(attachmentId).toBodilessEntity();
    }

    /**
     * Deletes an attachment
     * 
     * <p><b>200</b> - Attachment deleted
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter

     */
    public RestClient.ResponseSpec deleteAttachmentWithResponseSpec(Integer attachmentId) throws RestClientResponseException {
        return deleteAttachmentRequestCreation(attachmentId);
    }
    /**
     * Get attachment by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment by id
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter
     * @return Attachment

     */
    private RestClient.ResponseSpec getAttachmentRequestCreation(Integer attachmentId, Integer version) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling getAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("attachmentId", attachmentId);

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

        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return apiClient.invokeAPI("/v3/attachments/{attachmentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get attachment by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment by id
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter
     * @return Attachment

     */
    public Attachment getAttachment(Integer attachmentId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return getAttachmentRequestCreation(attachmentId, version).body(localVarReturnType);
    }

    /**
     * Get attachment by id
     *
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment by id
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     *
     * @param attachmentId The attachmentId parameter
     * @param version      The version parameter
     * @return ResponseEntity&lt;Attachment&gt;
     */
    public RestClient.ResponseSpec getAttachmentWithHttpInfo(Integer attachmentId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return getAttachmentRequestCreation(attachmentId, version);
    }

    /**
     * Get attachment by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment by id
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter

     */
    public RestClient.ResponseSpec getAttachmentWithResponseSpec(Integer attachmentId, Integer version) throws RestClientResponseException {
        return getAttachmentRequestCreation(attachmentId, version);
    }
    /**
     * Get content of an attachment by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Attachment by id
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter
     * @return File

     */
    private RestClient.ResponseSpec getAttachmentContentRequestCreation(Integer attachmentId, Integer version) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling getAttachmentContent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("attachmentId", attachmentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/v3/attachments/{attachmentId}/content", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get content of an attachment by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Attachment by id
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter
     * @return File

     */
    public File getAttachmentContent(Integer attachmentId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getAttachmentContentRequestCreation(attachmentId, version).body(localVarReturnType);
    }

    /**
     * Get content of an attachment by id
     *
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Attachment by id
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     *
     * @param attachmentId The attachmentId parameter
     * @param version      The version parameter
     * @return ResponseEntity&lt;File&gt;
     */
    public RestClient.ResponseSpec getAttachmentContentWithHttpInfo(Integer attachmentId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getAttachmentContentRequestCreation(attachmentId, version);
    }

    /**
     * Get content of an attachment by id
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Attachment by id
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Tracker / Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter

     */
    public RestClient.ResponseSpec getAttachmentContentWithResponseSpec(Integer attachmentId, Integer version) throws RestClientResponseException {
        return getAttachmentContentRequestCreation(attachmentId, version);
    }
    /**
     * Returns the change history of the specified attachment
     * 
     * <p><b>400</b> - Bad request
     * <p><b>200</b> - Attachment history
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ArtifactRevisionSearchResult

     */
    private RestClient.ResponseSpec getAttachmentHistoryRequestCreation(Integer attachmentId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling getAttachmentHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("attachmentId", attachmentId);

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
        return apiClient.invokeAPI("/v3/attachments/{attachmentId}/history", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Returns the change history of the specified attachment
     * 
     * <p><b>400</b> - Bad request
     * <p><b>200</b> - Attachment history
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ArtifactRevisionSearchResult

     */
    public ArtifactRevisionSearchResult getAttachmentHistory(Integer attachmentId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return getAttachmentHistoryRequestCreation(attachmentId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Returns the change history of the specified attachment
     *
     * <p><b>400</b> - Bad request
     * <p><b>200</b> - Attachment history
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     *
     * @param attachmentId The attachmentId parameter
     * @param page         Index of the result page starting from 1.
     * @param pageSize     Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;ArtifactRevisionSearchResult&gt;
     */
    public RestClient.ResponseSpec getAttachmentHistoryWithHttpInfo(Integer attachmentId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ArtifactRevisionSearchResult> localVarReturnType = new ParameterizedTypeReference<ArtifactRevisionSearchResult>() {};
        return getAttachmentHistoryRequestCreation(attachmentId, page, pageSize);
    }

    /**
     * Returns the change history of the specified attachment
     * 
     * <p><b>400</b> - Bad request
     * <p><b>200</b> - Attachment history
     * <p><b>401</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Attachment not found
     * <p><b>403</b> - Access denied
     * @param attachmentId The attachmentId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getAttachmentHistoryWithResponseSpec(Integer attachmentId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getAttachmentHistoryRequestCreation(attachmentId, page, pageSize);
    }
    /**
     * Restore attachment to previous version
     * 
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Restored attachment
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter
     * @return Attachment

     */
    private RestClient.ResponseSpec restoreAttachmentRequestCreation(Integer attachmentId, Integer version) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling restoreAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new RestClientResponseException("Missing the required parameter 'version' when calling restoreAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("attachmentId", attachmentId);

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

        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return apiClient.invokeAPI("/v3/attachments/{attachmentId}/restore", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Restore attachment to previous version
     * 
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Restored attachment
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter
     * @return Attachment

     */
    public Attachment restoreAttachment(Integer attachmentId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return restoreAttachmentRequestCreation(attachmentId, version).body(localVarReturnType);
    }

    /**
     * Restore attachment to previous version
     *
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Restored attachment
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     *
     * @param attachmentId The attachmentId parameter
     * @param version      The version parameter
     * @return ResponseEntity&lt;Attachment&gt;
     */
    public RestClient.ResponseSpec restoreAttachmentWithHttpInfo(Integer attachmentId, Integer version) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return restoreAttachmentRequestCreation(attachmentId, version);
    }

    /**
     * Restore attachment to previous version
     * 
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>200</b> - Restored attachment
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param version The version parameter

     */
    public RestClient.ResponseSpec restoreAttachmentWithResponseSpec(Integer attachmentId, Integer version) throws RestClientResponseException {
        return restoreAttachmentRequestCreation(attachmentId, version);
    }
    /**
     * Update attachment
     * 
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment
     * @return Attachment

     */
    private RestClient.ResponseSpec updateAttachmentRequestCreation(Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling updateAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("attachmentId", attachmentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (description != null)
            formParams.add("description", description);
        if (descriptionFormat != null)
            formParams.add("descriptionFormat", descriptionFormat);
        if (content != null)
            formParams.add("content", new FileSystemResource(content));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return apiClient.invokeAPI("/v3/attachments/{attachmentId}/content", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update attachment
     * 
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment
     * @return Attachment

     */
    public Attachment updateAttachment(Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return updateAttachmentRequestCreation(attachmentId, description, descriptionFormat, content).body(localVarReturnType);
    }

    /**
     * Update attachment
     *
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     *
     * @param attachmentId      The attachmentId parameter
     * @param description       Description
     * @param descriptionFormat Format of description
     * @param content           Content of attachment
     * @return ResponseEntity&lt;Attachment&gt;
     */
    public RestClient.ResponseSpec updateAttachmentWithHttpInfo(Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return updateAttachmentRequestCreation(attachmentId, description, descriptionFormat, content);
    }

    /**
     * Update attachment
     * 
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - Attachment not found
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment

     */
    public RestClient.ResponseSpec updateAttachmentWithResponseSpec(Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        return updateAttachmentRequestCreation(attachmentId, description, descriptionFormat, content);
    }
}
