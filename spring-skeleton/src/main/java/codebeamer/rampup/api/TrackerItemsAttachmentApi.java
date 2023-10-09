package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.Attachment;
import codebeamer.rampup.client.model.AttachmentSearchResult;
import codebeamer.rampup.client.model.TrackerItemAttachmentRequest;
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


public class TrackerItemsAttachmentApi {
    private ApiClient apiClient;

    @Autowired
    public TrackerItemsAttachmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return Attachment

     */
    private RestClient.ResponseSpec deleteTrackerItemAttachmentRequestCreation(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling deleteTrackerItemAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling deleteTrackerItemAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("attachmentId", attachmentId);

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

        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments/{attachmentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Delete attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return Attachment

     */
    public Attachment deleteTrackerItemAttachment(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return deleteTrackerItemAttachmentRequestCreation(itemId, attachmentId).body(localVarReturnType);
    }

    /**
     * Delete attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return ResponseEntity&lt;Attachment&gt;

     */
    public ResponseEntity<Attachment> deleteTrackerItemAttachmentWithHttpInfo(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemAttachmentRequestCreation(itemId, attachmentId).toEntity(localVarReturnType);
    }

    /**
     * Delete attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter

     */
    public RestClient.ResponseSpec deleteTrackerItemAttachmentWithResponseSpec(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        return deleteTrackerItemAttachmentRequestCreation(itemId, attachmentId);
    }
    /**
     * Delete attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Attachments of tracker item removed
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter

     */
    private RestClient.ResponseSpec deleteTrackerItemAttachmentsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling deleteTrackerItemAttachments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

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
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Delete attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Attachments of tracker item removed
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter

     */
    public Void deleteTrackerItemAttachments(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemAttachmentsRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Delete attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Attachments of tracker item removed
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter

     */
    public ResponseEntity<Void> deleteTrackerItemAttachmentsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemAttachmentsRequestCreation(itemId).toBodilessEntity();
    }

    /**
     * Delete attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Attachments of tracker item removed
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec deleteTrackerItemAttachmentsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return deleteTrackerItemAttachmentsRequestCreation(itemId);
    }
    /**
     * Get attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return Attachment

     */
    private RestClient.ResponseSpec getTrackerItemAttachmentRequestCreation(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling getTrackerItemAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("attachmentId", attachmentId);

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

        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments/{attachmentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return Attachment

     */
    public Attachment getTrackerItemAttachment(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return getTrackerItemAttachmentRequestCreation(itemId, attachmentId).body(localVarReturnType);
    }

    /**
     * Get attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return ResponseEntity&lt;Attachment&gt;

     */
    public ResponseEntity<Attachment> getTrackerItemAttachmentWithHttpInfo(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemAttachmentRequestCreation(itemId, attachmentId).toEntity(localVarReturnType);
    }

    /**
     * Get attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter

     */
    public RestClient.ResponseSpec getTrackerItemAttachmentWithResponseSpec(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        return getTrackerItemAttachmentRequestCreation(itemId, attachmentId);
    }
    /**
     * Get content of an attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return File

     */
    private RestClient.ResponseSpec getTrackerItemAttachmentContentRequestCreation(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemAttachmentContent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling getTrackerItemAttachmentContent", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("attachmentId", attachmentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments/{attachmentId}/content", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get content of an attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return File

     */
    public File getTrackerItemAttachmentContent(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getTrackerItemAttachmentContentRequestCreation(itemId, attachmentId).body(localVarReturnType);
    }

    /**
     * Get content of an attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @return ResponseEntity&lt;File&gt;

     */
    public ResponseEntity<File> getTrackerItemAttachmentContentWithHttpInfo(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemAttachmentContentRequestCreation(itemId, attachmentId).toEntity(localVarReturnType);
    }

    /**
     * Get content of an attachment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * <p><b>404</b> - Tracker / Attachment not found
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter

     */
    public RestClient.ResponseSpec getTrackerItemAttachmentContentWithResponseSpec(Integer itemId, Integer attachmentId) throws RestClientResponseException {
        return getTrackerItemAttachmentContentRequestCreation(itemId, attachmentId);
    }
    /**
     * Get attachments of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of a tracker item: contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * <p><b>400</b> - Bad request
     * @param itemId The itemId parameter
     * @return File

     */
    private RestClient.ResponseSpec getTrackerItemAttachmentContentsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemAttachmentContents", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/zip", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments/content", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get attachments of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of a tracker item: contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * <p><b>400</b> - Bad request
     * @param itemId The itemId parameter
     * @return File

     */
    public File getTrackerItemAttachmentContents(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getTrackerItemAttachmentContentsRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Get attachments of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of a tracker item: contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * <p><b>400</b> - Bad request
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;File&gt;

     */
    public ResponseEntity<File> getTrackerItemAttachmentContentsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemAttachmentContentsRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Get attachments of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of a tracker item: contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * <p><b>400</b> - Bad request
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec getTrackerItemAttachmentContentsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return getTrackerItemAttachmentContentsRequestCreation(itemId);
    }
    /**
     * Get attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of tracker item
     * <p><b>401</b> - Access denied
     * @param itemId Id of the tracker item
     * @param fileName Filter by part of the filename of the attachments
     * @return AttachmentSearchResult

     */
    private RestClient.ResponseSpec getTrackerItemAttachmentsRequestCreation(Integer itemId, String fileName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemAttachments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<AttachmentSearchResult> localVarReturnType = new ParameterizedTypeReference<AttachmentSearchResult>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of tracker item
     * <p><b>401</b> - Access denied
     * @param itemId Id of the tracker item
     * @param fileName Filter by part of the filename of the attachments
     * @return AttachmentSearchResult

     */
    public AttachmentSearchResult getTrackerItemAttachments(Integer itemId, String fileName) throws RestClientResponseException {
        ParameterizedTypeReference<AttachmentSearchResult> localVarReturnType = new ParameterizedTypeReference<AttachmentSearchResult>() {};
        return getTrackerItemAttachmentsRequestCreation(itemId, fileName).body(localVarReturnType);
    }

    /**
     * Get attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of tracker item
     * <p><b>401</b> - Access denied
     * @param itemId Id of the tracker item
     * @param fileName Filter by part of the filename of the attachments
     * @return ResponseEntity&lt;AttachmentSearchResult&gt;

     */
    public ResponseEntity<AttachmentSearchResult> getTrackerItemAttachmentsWithHttpInfo(Integer itemId, String fileName) throws RestClientResponseException {
        ParameterizedTypeReference<AttachmentSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemAttachmentsRequestCreation(itemId, fileName).toEntity(localVarReturnType);
    }

    /**
     * Get attachments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachments of tracker item
     * <p><b>401</b> - Access denied
     * @param itemId Id of the tracker item
     * @param fileName Filter by part of the filename of the attachments

     */
    public RestClient.ResponseSpec getTrackerItemAttachmentsWithResponseSpec(Integer itemId, String fileName) throws RestClientResponseException {
        return getTrackerItemAttachmentsRequestCreation(itemId, fileName);
    }
    /**
     * Get attachments of tracker items matching the extension or mime type filters
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Tracker items not found
     * <p><b>200</b> - Attachments of tracker items: each tracker item goes to a subdirectory named as item-id and this directory contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * @param trackerItemAttachmentRequest The trackerItemAttachmentRequest parameter
     * @return File

     */
    private RestClient.ResponseSpec getTrackerItemsAttachmentContentsRequestCreation(TrackerItemAttachmentRequest trackerItemAttachmentRequest) throws RestClientResponseException {
        Object postBody = trackerItemAttachmentRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/zip", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/v3/items/attachments/content", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get attachments of tracker items matching the extension or mime type filters
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Tracker items not found
     * <p><b>200</b> - Attachments of tracker items: each tracker item goes to a subdirectory named as item-id and this directory contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * @param trackerItemAttachmentRequest The trackerItemAttachmentRequest parameter
     * @return File

     */
    public File getTrackerItemsAttachmentContents(TrackerItemAttachmentRequest trackerItemAttachmentRequest) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getTrackerItemsAttachmentContentsRequestCreation(trackerItemAttachmentRequest).body(localVarReturnType);
    }

    /**
     * Get attachments of tracker items matching the extension or mime type filters
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Tracker items not found
     * <p><b>200</b> - Attachments of tracker items: each tracker item goes to a subdirectory named as item-id and this directory contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * @param trackerItemAttachmentRequest The trackerItemAttachmentRequest parameter
     * @return ResponseEntity&lt;File&gt;

     */
    public ResponseEntity<File> getTrackerItemsAttachmentContentsWithHttpInfo(TrackerItemAttachmentRequest trackerItemAttachmentRequest) throws RestClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemsAttachmentContentsRequestCreation(trackerItemAttachmentRequest).toEntity(localVarReturnType);
    }

    /**
     * Get attachments of tracker items matching the extension or mime type filters
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Tracker items not found
     * <p><b>200</b> - Attachments of tracker items: each tracker item goes to a subdirectory named as item-id and this directory contains the attachment files prefixed with the attachment id like [attachment-id]_[filename].
     * @param trackerItemAttachmentRequest The trackerItemAttachmentRequest parameter

     */
    public RestClient.ResponseSpec getTrackerItemsAttachmentContentsWithResponseSpec(TrackerItemAttachmentRequest trackerItemAttachmentRequest) throws RestClientResponseException {
        return getTrackerItemsAttachmentContentsRequestCreation(trackerItemAttachmentRequest);
    }
    /**
     * Update content of attachment of tracker item
     * 
     * <p><b>404</b> - Tracker item or attachment not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment
     * @return Attachment

     */
    private RestClient.ResponseSpec updateAttachmentOfTrackerItemRequestCreation(Integer itemId, Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling updateAttachmentOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'attachmentId' when calling updateAttachmentOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
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
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments/{attachmentId}/content", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update content of attachment of tracker item
     * 
     * <p><b>404</b> - Tracker item or attachment not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment
     * @return Attachment

     */
    public Attachment updateAttachmentOfTrackerItem(Integer itemId, Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return updateAttachmentOfTrackerItemRequestCreation(itemId, attachmentId, description, descriptionFormat, content).body(localVarReturnType);
    }

    /**
     * Update content of attachment of tracker item
     * 
     * <p><b>404</b> - Tracker item or attachment not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment
     * @return ResponseEntity&lt;Attachment&gt;

     */
    public ResponseEntity<Attachment> updateAttachmentOfTrackerItemWithHttpInfo(Integer itemId, Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return updateAttachmentOfTrackerItemRequestCreation(itemId, attachmentId, description, descriptionFormat, content).toEntity(localVarReturnType);
    }

    /**
     * Update content of attachment of tracker item
     * 
     * <p><b>404</b> - Tracker item or attachment not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Updated attachment
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param attachmentId The attachmentId parameter
     * @param description Description
     * @param descriptionFormat Format of description
     * @param content Content of attachment

     */
    public RestClient.ResponseSpec updateAttachmentOfTrackerItemWithResponseSpec(Integer itemId, Integer attachmentId, String description, String descriptionFormat, File content) throws RestClientResponseException {
        return updateAttachmentOfTrackerItemRequestCreation(itemId, attachmentId, description, descriptionFormat, content);
    }
    /**
     * Upload an attachment to a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachments Attachments of a comment
     * @return List&lt;Attachment&gt;

     */
    private RestClient.ResponseSpec updloadTrackerItemAttachmentRequestCreation(Integer itemId, File attachments) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling updloadTrackerItemAttachment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (attachments != null)
            formParams.add("attachments", new FileSystemResource(attachments));

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
        return apiClient.invokeAPI("/v3/items/{itemId}/attachments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Upload an attachment to a tracker item
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     *
     * @param itemId      The itemId parameter
     * @param attachments Attachments of a comment
     * @return List&lt;Attachment&gt;
     */
    public List<Attachment> updloadTrackerItemAttachment(Integer itemId, File attachments) throws RestClientResponseException {
        return updloadTrackerItemAttachmentRequestCreation(itemId, attachments).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Upload an attachment to a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachments Attachments of a comment
     * @return ResponseEntity&lt;List&lt;Attachment&gt;&gt;

     */
    public ResponseEntity<List<Attachment>> updloadTrackerItemAttachmentWithHttpInfo(Integer itemId, File attachments) throws RestClientResponseException {
        return updloadTrackerItemAttachmentRequestCreation(itemId, attachments).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Upload an attachment to a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Attachment of tracker item by id
     * @param itemId The itemId parameter
     * @param attachments Attachments of a comment

     */
    public RestClient.ResponseSpec updloadTrackerItemAttachmentWithResponseSpec(Integer itemId, File attachments) throws RestClientResponseException {
        return updloadTrackerItemAttachmentRequestCreation(itemId, attachments);
    }
}
