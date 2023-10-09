package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.Attachment;
import codebeamer.rampup.client.model.AttachmentReference;
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


public class WikisCommentApi {
    private ApiClient apiClient;

    @Autowired
    public WikisCommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Comment on a wiki page
     * 
     * <p><b>200</b> - Comment created successfully
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return List&lt;AttachmentReference&gt;

     */
    private RestClient.ResponseSpec commentOnWikiRequestCreation(Integer wikiId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling commentOnWiki", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'comment' is set
        if (comment == null) {
            throw new RestClientResponseException("Missing the required parameter 'comment' when calling commentOnWiki", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<AttachmentReference> localVarReturnType = new ParameterizedTypeReference<AttachmentReference>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/comments", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Comment on a wiki page
     *
     * <p><b>200</b> - Comment created successfully
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     *
     * @param wikiId        The wikiId parameter
     * @param comment       Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments   Attachments of a comment
     * @return List&lt;AttachmentReference&gt;
     */
    public List<AttachmentReference> commentOnWiki(Integer wikiId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        return commentOnWikiRequestCreation(wikiId, comment, commentFormat, attachments).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Comment on a wiki page
     * 
     * <p><b>200</b> - Comment created successfully
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment
     * @return ResponseEntity&lt;List&lt;AttachmentReference&gt;&gt;

     */
    public ResponseEntity<List<AttachmentReference>> commentOnWikiWithHttpInfo(Integer wikiId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        return commentOnWikiRequestCreation(wikiId, comment, commentFormat, attachments).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Comment on a wiki page
     * 
     * <p><b>200</b> - Comment created successfully
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param comment Text of a comment
     * @param commentFormat Format of a comment
     * @param attachments Attachments of a comment

     */
    public RestClient.ResponseSpec commentOnWikiWithResponseSpec(Integer wikiId, String comment, String commentFormat, File attachments) throws RestClientResponseException {
        return commentOnWikiRequestCreation(wikiId, comment, commentFormat, attachments);
    }
    /**
     * Get attachment of wiki page by file name
     * 
     * <p><b>200</b> - Attachment of wiki page
     * <p><b>404</b> - Wiki page / Attachment not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param fileName The fileName parameter
     * @return Attachment

     */
    private RestClient.ResponseSpec getAttachmentByNameRequestCreation(Integer wikiId, String fileName) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'wikiId' is set
        if (wikiId == null) {
            throw new RestClientResponseException("Missing the required parameter 'wikiId' when calling getAttachmentByName", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new RestClientResponseException("Missing the required parameter 'fileName' when calling getAttachmentByName", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("wikiId", wikiId);

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

        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return apiClient.invokeAPI("/v3/wikipages/{wikiId}/attachments", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get attachment of wiki page by file name
     * 
     * <p><b>200</b> - Attachment of wiki page
     * <p><b>404</b> - Wiki page / Attachment not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param fileName The fileName parameter
     * @return Attachment

     */
    public Attachment getAttachmentByName(Integer wikiId, String fileName) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return getAttachmentByNameRequestCreation(wikiId, fileName).body(localVarReturnType);
    }

    /**
     * Get attachment of wiki page by file name
     * 
     * <p><b>200</b> - Attachment of wiki page
     * <p><b>404</b> - Wiki page / Attachment not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param fileName The fileName parameter
     * @return ResponseEntity&lt;Attachment&gt;

     */
    public ResponseEntity<Attachment> getAttachmentByNameWithHttpInfo(Integer wikiId, String fileName) throws RestClientResponseException {
        ParameterizedTypeReference<Attachment> localVarReturnType = new ParameterizedTypeReference<Attachment>() {};
        return getAttachmentByNameRequestCreation(wikiId, fileName).toEntity(localVarReturnType);
    }

    /**
     * Get attachment of wiki page by file name
     * 
     * <p><b>200</b> - Attachment of wiki page
     * <p><b>404</b> - Wiki page / Attachment not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Authorization is required
     * <p><b>401</b> - Authentication is required
     * @param wikiId The wikiId parameter
     * @param fileName The fileName parameter

     */
    public RestClient.ResponseSpec getAttachmentByNameWithResponseSpec(Integer wikiId, String fileName) throws RestClientResponseException {
        return getAttachmentByNameRequestCreation(wikiId, fileName);
    }
}
