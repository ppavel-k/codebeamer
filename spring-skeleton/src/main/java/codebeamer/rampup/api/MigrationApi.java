package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.AttachmentMigrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MigrationApi {
    private ApiClient apiClient;

    @Autowired
    public MigrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Migrate attachments
     * An endpoint for migrating attachments from a preconfigured source directory.
     * <p><b>200</b> - Attachments are migrated
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param attachmentMigrationRequest The attachmentMigrationRequest parameter

     */
    private RestClient.ResponseSpec migrateAttachmentsRequestCreation(AttachmentMigrationRequest attachmentMigrationRequest) throws RestClientResponseException {
        Object postBody = attachmentMigrationRequest;
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/migration/attachment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Migrate attachments
     * An endpoint for migrating attachments from a preconfigured source directory.
     * <p><b>200</b> - Attachments are migrated
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param attachmentMigrationRequest The attachmentMigrationRequest parameter

     */
    public Void migrateAttachments(AttachmentMigrationRequest attachmentMigrationRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return migrateAttachmentsRequestCreation(attachmentMigrationRequest).body(localVarReturnType);
    }

    /**
     * Migrate attachments
     * An endpoint for migrating attachments from a preconfigured source directory.
     * <p><b>200</b> - Attachments are migrated
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param attachmentMigrationRequest The attachmentMigrationRequest parameter

     */
    public ResponseEntity<Void> migrateAttachmentsWithHttpInfo(AttachmentMigrationRequest attachmentMigrationRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return migrateAttachmentsRequestCreation(attachmentMigrationRequest).toBodilessEntity();
    }

    /**
     * Migrate attachments
     * An endpoint for migrating attachments from a preconfigured source directory.
     * <p><b>200</b> - Attachments are migrated
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param attachmentMigrationRequest The attachmentMigrationRequest parameter

     */
    public RestClient.ResponseSpec migrateAttachmentsWithResponseSpec(AttachmentMigrationRequest attachmentMigrationRequest) throws RestClientResponseException {
        return migrateAttachmentsRequestCreation(attachmentMigrationRequest);
    }
}
