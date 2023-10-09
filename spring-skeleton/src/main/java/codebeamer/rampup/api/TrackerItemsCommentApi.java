package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.Comment;
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


public class TrackerItemsCommentApi {
    private ApiClient apiClient;

    @Autowired
    public TrackerItemsCommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return Comment

     */
    private RestClient.ResponseSpec commentOnTrackerItemRequestCreation(Integer itemId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling commentOnTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'comment' is set
        if (comment == null) {
            throw new RestClientResponseException("Missing the required parameter 'comment' when calling commentOnTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (comment != null)
            formParams.add("comment", comment);
        if (commentFormat != null)
            formParams.add("commentFormat", commentFormat);
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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/comments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return Comment

     */
    public Comment commentOnTrackerItem(Integer itemId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return commentOnTrackerItemRequestCreation(itemId, comment, commentFormat, attachments).body(localVarReturnType);
    }

    /**
     * Comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return ResponseEntity&lt;Comment&gt;

     */
    public ResponseEntity<Comment> commentOnTrackerItemWithHttpInfo(Integer itemId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return commentOnTrackerItemRequestCreation(itemId, comment, commentFormat, attachments).toEntity(localVarReturnType);
    }

    /**
     * Comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment

     */
    public RestClient.ResponseSpec commentOnTrackerItemWithResponseSpec(Integer itemId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        return commentOnTrackerItemRequestCreation(itemId, comment, commentFormat, attachments);
    }
    /**
     * Delete comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @return Comment

     */
    private RestClient.ResponseSpec deleteTrackerItemCommentRequestCreation(Integer itemId, Integer commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling deleteTrackerItemComment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling deleteTrackerItemComment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("commentId", commentId);

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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/comments/{commentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Delete comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @return Comment

     */
    public Comment deleteTrackerItemComment(Integer itemId, Integer commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return deleteTrackerItemCommentRequestCreation(itemId, commentId).body(localVarReturnType);
    }

    /**
     * Delete comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @return ResponseEntity&lt;Comment&gt;

     */
    public ResponseEntity<Comment> deleteTrackerItemCommentWithHttpInfo(Integer itemId, Integer commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemCommentRequestCreation(itemId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Delete comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter

     */
    public RestClient.ResponseSpec deleteTrackerItemCommentWithResponseSpec(Integer itemId, Integer commentId) throws RestClientResponseException {
        return deleteTrackerItemCommentRequestCreation(itemId, commentId);
    }
    /**
     * Delete comments of tracker item by item id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments deleted
     * @param itemId The itemId parameter

     */
    private RestClient.ResponseSpec deleteTrackerItemCommentsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling deleteTrackerItemComments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v3/items/{itemId}/comments", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Delete comments of tracker item by item id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments deleted
     * @param itemId The itemId parameter

     */
    public Void deleteTrackerItemComments(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemCommentsRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Delete comments of tracker item by item id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments deleted
     * @param itemId The itemId parameter

     */
    public ResponseEntity<Void> deleteTrackerItemCommentsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemCommentsRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Delete comments of tracker item by item id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments deleted
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec deleteTrackerItemCommentsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return deleteTrackerItemCommentsRequestCreation(itemId);
    }
    /**
     * Edit comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Edited comment
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return Comment

     */
    private RestClient.ResponseSpec editCommentOnTrackerItemRequestCreation(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling editCommentOnTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling editCommentOnTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'comment' is set
        if (comment == null) {
            throw new RestClientResponseException("Missing the required parameter 'comment' when calling editCommentOnTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("commentId", commentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (comment != null)
            formParams.add("comment", comment);
        if (commentFormat != null)
            formParams.add("commentFormat", commentFormat);
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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/comments/{commentId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Edit comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Edited comment
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return Comment

     */
    public Comment editCommentOnTrackerItem(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return editCommentOnTrackerItemRequestCreation(itemId, commentId, comment, commentFormat, attachments).body(localVarReturnType);
    }

    /**
     * Edit comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Edited comment
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return ResponseEntity&lt;Comment&gt;

     */
    public ResponseEntity<Comment> editCommentOnTrackerItemWithHttpInfo(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return editCommentOnTrackerItemRequestCreation(itemId, commentId, comment, commentFormat, attachments).toEntity(localVarReturnType);
    }

    /**
     * Edit comment on a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Edited comment
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment

     */
    public RestClient.ResponseSpec editCommentOnTrackerItemWithResponseSpec(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        return editCommentOnTrackerItemRequestCreation(itemId, commentId, comment, commentFormat, attachments);
    }
    /**
     * Get comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @return Comment

     */
    private RestClient.ResponseSpec getTrackerItemCommentRequestCreation(Integer itemId, Integer commentId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemComment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling getTrackerItemComment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("commentId", commentId);

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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/comments/{commentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @return Comment

     */
    public Comment getTrackerItemComment(Integer itemId, Integer commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return getTrackerItemCommentRequestCreation(itemId, commentId).body(localVarReturnType);
    }

    /**
     * Get comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @return ResponseEntity&lt;Comment&gt;

     */
    public ResponseEntity<Comment> getTrackerItemCommentWithHttpInfo(Integer itemId, Integer commentId) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemCommentRequestCreation(itemId, commentId).toEntity(localVarReturnType);
    }

    /**
     * Get comment of tracker item by id
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter

     */
    public RestClient.ResponseSpec getTrackerItemCommentWithResponseSpec(Integer itemId, Integer commentId) throws RestClientResponseException {
        return getTrackerItemCommentRequestCreation(itemId, commentId);
    }
    /**
     * Get comments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments of tracker item by id
     * @param itemId Id of a tracker item
     * @return List&lt;Comment&gt;

     */
    private RestClient.ResponseSpec getTrackerItemCommentsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemComments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/comments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get comments of tracker item
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments of tracker item by id
     *
     * @param itemId Id of a tracker item
     * @return List&lt;Comment&gt;
     */
    public List<Comment> getTrackerItemComments(Integer itemId) throws RestClientResponseException {
        return getTrackerItemCommentsRequestCreation(itemId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get comments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments of tracker item by id
     * @param itemId Id of a tracker item
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;

     */
    public ResponseEntity<List<Comment>> getTrackerItemCommentsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        return getTrackerItemCommentsRequestCreation(itemId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get comments of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comments of tracker item by id
     * @param itemId Id of a tracker item

     */
    public RestClient.ResponseSpec getTrackerItemCommentsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return getTrackerItemCommentsRequestCreation(itemId);
    }
    /**
     * Reply on a comment of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return Comment

     */
    private RestClient.ResponseSpec replyOnCommentOfTrackerItemRequestCreation(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling replyOnCommentOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new RestClientResponseException("Missing the required parameter 'commentId' when calling replyOnCommentOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'comment' is set
        if (comment == null) {
            throw new RestClientResponseException("Missing the required parameter 'comment' when calling replyOnCommentOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("commentId", commentId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (comment != null)
            formParams.add("comment", comment);
        if (commentFormat != null)
            formParams.add("commentFormat", commentFormat);
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

        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/comments/{commentId}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Reply on a comment of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return Comment

     */
    public Comment replyOnCommentOfTrackerItem(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return replyOnCommentOfTrackerItemRequestCreation(itemId, commentId, comment, commentFormat, attachments).body(localVarReturnType);
    }

    /**
     * Reply on a comment of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return ResponseEntity&lt;Comment&gt;

     */
    public ResponseEntity<Comment> replyOnCommentOfTrackerItemWithHttpInfo(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        ParameterizedTypeReference<Comment> localVarReturnType = new ParameterizedTypeReference<Comment>() {};
        return replyOnCommentOfTrackerItemRequestCreation(itemId, commentId, comment, commentFormat, attachments).toEntity(localVarReturnType);
    }

    /**
     * Reply on a comment of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Comment of tracker item by id
     * @param itemId The itemId parameter
     * @param commentId The commentId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment

     */
    public RestClient.ResponseSpec replyOnCommentOfTrackerItemWithResponseSpec(Integer itemId, Integer commentId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        return replyOnCommentOfTrackerItemRequestCreation(itemId, commentId, comment, commentFormat, attachments);
    }
}
