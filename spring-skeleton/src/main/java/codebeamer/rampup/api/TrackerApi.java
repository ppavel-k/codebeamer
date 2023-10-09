package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.AbstractField;
import codebeamer.rampup.client.model.ChoiceOptionReference;
import codebeamer.rampup.client.model.FieldReference;
import codebeamer.rampup.client.model.OutlineItemSearchResult;
import codebeamer.rampup.client.model.ReferenceSearchResult;
import codebeamer.rampup.client.model.Tracker;
import codebeamer.rampup.client.model.TrackerFieldStatusPermissions;
import codebeamer.rampup.client.model.TrackerFieldsStatusPermissions;
import codebeamer.rampup.client.model.TrackerItemReferenceSearchResult;
import codebeamer.rampup.client.model.TrackerType;
import codebeamer.rampup.client.model.TrackerTypeReference;
import codebeamer.rampup.client.model.WorkflowTransition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class TrackerApi {
    private ApiClient apiClient;

    @Autowired
    public TrackerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker deleted.
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter

     */
    private RestClient.ResponseSpec deleteTrackerRequestCreation(Integer trackerId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling deleteTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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
        return apiClient.invokeAPI("/v3/trackers/{trackerId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Deletes a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker deleted.
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter

     */
    public Void deleteTracker(Integer trackerId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerRequestCreation(trackerId).body(localVarReturnType);
    }

    /**
     * Deletes a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker deleted.
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter

     */
    public ResponseEntity<Void> deleteTrackerWithHttpInfo(Integer trackerId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerRequestCreation(trackerId).toBodilessEntity();
    }

    /**
     * Deletes a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker deleted.
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter

     */
    public RestClient.ResponseSpec deleteTrackerWithResponseSpec(Integer trackerId) throws RestClientResponseException {
        return deleteTrackerRequestCreation(trackerId);
    }
    /**
     * Get option of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Option by id
     * <p><b>404</b> - Option not found
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param optionId The optionId parameter
     * @return ChoiceOptionReference

     */
    private RestClient.ResponseSpec getChoiceOptionRequestCreation(Integer trackerId, Integer fieldId, Integer optionId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getChoiceOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new RestClientResponseException("Missing the required parameter 'fieldId' when calling getChoiceOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'optionId' is set
        if (optionId == null) {
            throw new RestClientResponseException("Missing the required parameter 'optionId' when calling getChoiceOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("fieldId", fieldId);
        pathParams.put("optionId", optionId);

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

        ParameterizedTypeReference<ChoiceOptionReference> localVarReturnType = new ParameterizedTypeReference<ChoiceOptionReference>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/fields/{fieldId}/options/{optionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get option of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Option by id
     * <p><b>404</b> - Option not found
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param optionId The optionId parameter
     * @return ChoiceOptionReference

     */
    public ChoiceOptionReference getChoiceOption(Integer trackerId, Integer fieldId, Integer optionId) throws RestClientResponseException {
        ParameterizedTypeReference<ChoiceOptionReference> localVarReturnType = new ParameterizedTypeReference<ChoiceOptionReference>() {};
        return getChoiceOptionRequestCreation(trackerId, fieldId, optionId).body(localVarReturnType);
    }

    /**
     * Get option of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Option by id
     * <p><b>404</b> - Option not found
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param optionId The optionId parameter
     * @return ResponseEntity&lt;ChoiceOptionReference&gt;

     */
    public ResponseEntity<ChoiceOptionReference> getChoiceOptionWithHttpInfo(Integer trackerId, Integer fieldId, Integer optionId) throws RestClientResponseException {
        ParameterizedTypeReference<ChoiceOptionReference> localVarReturnType = new ParameterizedTypeReference<ChoiceOptionReference>() {};
        return getChoiceOptionRequestCreation(trackerId, fieldId, optionId).toEntity(localVarReturnType);
    }

    /**
     * Get option of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Option by id
     * <p><b>404</b> - Option not found
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param optionId The optionId parameter

     */
    public RestClient.ResponseSpec getChoiceOptionWithResponseSpec(Integer trackerId, Integer fieldId, Integer optionId) throws RestClientResponseException {
        return getChoiceOptionRequestCreation(trackerId, fieldId, optionId);
    }
    /**
     * Get items in a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - List of tracker items
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemReferenceSearchResult

     */
    private RestClient.ResponseSpec getItemsByTrackerRequestCreation(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getItemsByTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/items", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get items in a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - List of tracker items
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemReferenceSearchResult

     */
    public TrackerItemReferenceSearchResult getItemsByTracker(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return getItemsByTrackerRequestCreation(trackerId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get items in a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - List of tracker items
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;TrackerItemReferenceSearchResult&gt;

     */
    public ResponseEntity<TrackerItemReferenceSearchResult> getItemsByTrackerWithHttpInfo(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return getItemsByTrackerRequestCreation(trackerId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get items in a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - List of tracker items
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getItemsByTrackerWithResponseSpec(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getItemsByTrackerRequestCreation(trackerId, page, pageSize);
    }
    /**
     * Get tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @return Tracker

     */
    private RestClient.ResponseSpec getTrackerRequestCreation(Integer trackerId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @return Tracker

     */
    public Tracker getTracker(Integer trackerId) throws RestClientResponseException {
        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return getTrackerRequestCreation(trackerId).body(localVarReturnType);
    }

    /**
     * Get tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @return ResponseEntity&lt;Tracker&gt;

     */
    public ResponseEntity<Tracker> getTrackerWithHttpInfo(Integer trackerId) throws RestClientResponseException {
        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return getTrackerRequestCreation(trackerId).toEntity(localVarReturnType);
    }

    /**
     * Get tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter

     */
    public RestClient.ResponseSpec getTrackerWithResponseSpec(Integer trackerId) throws RestClientResponseException {
        return getTrackerRequestCreation(trackerId);
    }
    /**
     * Get baselines of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baselines of the tracker
     * @param trackerId The trackerId parameter
     * @return ReferenceSearchResult

     */
    private RestClient.ResponseSpec getTrackerBaselinesRequestCreation(Integer trackerId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerBaselines", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<ReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<ReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/baselines", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get baselines of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baselines of the tracker
     * @param trackerId The trackerId parameter
     * @return ReferenceSearchResult

     */
    public ReferenceSearchResult getTrackerBaselines(Integer trackerId) throws RestClientResponseException {
        ParameterizedTypeReference<ReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<ReferenceSearchResult>() {};
        return getTrackerBaselinesRequestCreation(trackerId).body(localVarReturnType);
    }

    /**
     * Get baselines of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baselines of the tracker
     * @param trackerId The trackerId parameter
     * @return ResponseEntity&lt;ReferenceSearchResult&gt;

     */
    public ResponseEntity<ReferenceSearchResult> getTrackerBaselinesWithHttpInfo(Integer trackerId) throws RestClientResponseException {
        ParameterizedTypeReference<ReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<ReferenceSearchResult>() {};
        return getTrackerBaselinesRequestCreation(trackerId).toEntity(localVarReturnType);
    }

    /**
     * Get baselines of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Baselines of the tracker
     * @param trackerId The trackerId parameter

     */
    public RestClient.ResponseSpec getTrackerBaselinesWithResponseSpec(Integer trackerId) throws RestClientResponseException {
        return getTrackerBaselinesRequestCreation(trackerId);
    }
    /**
     * Get field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field by id
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @return AbstractField

     */
    private RestClient.ResponseSpec getTrackerFieldRequestCreation(Integer trackerId, Integer fieldId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new RestClientResponseException("Missing the required parameter 'fieldId' when calling getTrackerField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("fieldId", fieldId);

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

        ParameterizedTypeReference<AbstractField> localVarReturnType = new ParameterizedTypeReference<AbstractField>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/fields/{fieldId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field by id
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @return AbstractField

     */
    public AbstractField getTrackerField(Integer trackerId, Integer fieldId) throws RestClientResponseException {
        ParameterizedTypeReference<AbstractField> localVarReturnType = new ParameterizedTypeReference<AbstractField>() {};
        return getTrackerFieldRequestCreation(trackerId, fieldId).body(localVarReturnType);
    }

    /**
     * Get field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field by id
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @return ResponseEntity&lt;AbstractField&gt;

     */
    public ResponseEntity<AbstractField> getTrackerFieldWithHttpInfo(Integer trackerId, Integer fieldId) throws RestClientResponseException {
        ParameterizedTypeReference<AbstractField> localVarReturnType = new ParameterizedTypeReference<AbstractField>() {};
        return getTrackerFieldRequestCreation(trackerId, fieldId).toEntity(localVarReturnType);
    }

    /**
     * Get field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field by id
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter

     */
    public RestClient.ResponseSpec getTrackerFieldWithResponseSpec(Integer trackerId, Integer fieldId) throws RestClientResponseException {
        return getTrackerFieldRequestCreation(trackerId, fieldId);
    }
    /**
     * Get permissions of tracker field
     * 
     * <p><b>404</b> - Tracker or field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param statusId The statusId parameter
     * @return List&lt;TrackerFieldStatusPermissions&gt;

     */
    private RestClient.ResponseSpec getTrackerFieldPermissionsRequestCreation(Integer trackerId, Integer fieldId, Integer statusId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerFieldPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new RestClientResponseException("Missing the required parameter 'fieldId' when calling getTrackerFieldPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);
        pathParams.put("fieldId", fieldId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "statusId", statusId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerFieldStatusPermissions> localVarReturnType = new ParameterizedTypeReference<TrackerFieldStatusPermissions>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/fields/{fieldId}/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get permissions of tracker field
     *
     * <p><b>404</b> - Tracker or field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     *
     * @param trackerId The trackerId parameter
     * @param fieldId   The fieldId parameter
     * @param statusId  The statusId parameter
     * @return List&lt;TrackerFieldStatusPermissions&gt;
     */
    public List<TrackerFieldStatusPermissions> getTrackerFieldPermissions(Integer trackerId, Integer fieldId, Integer statusId) throws RestClientResponseException {
        return getTrackerFieldPermissionsRequestCreation(trackerId, fieldId, statusId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get permissions of tracker field
     * 
     * <p><b>404</b> - Tracker or field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param statusId The statusId parameter
     * @return ResponseEntity&lt;List&lt;TrackerFieldStatusPermissions&gt;&gt;

     */
    public ResponseEntity<List<TrackerFieldStatusPermissions>> getTrackerFieldPermissionsWithHttpInfo(Integer trackerId, Integer fieldId, Integer statusId) throws RestClientResponseException {
        ParameterizedTypeReference<List<TrackerFieldStatusPermissions>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerFieldPermissionsRequestCreation(trackerId, fieldId, statusId).toEntity(localVarReturnType);
    }

    /**
     * Get permissions of tracker field
     * 
     * <p><b>404</b> - Tracker or field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param fieldId The fieldId parameter
     * @param statusId The statusId parameter

     */
    public RestClient.ResponseSpec getTrackerFieldPermissionsWithResponseSpec(Integer trackerId, Integer fieldId, Integer statusId) throws RestClientResponseException {
        return getTrackerFieldPermissionsRequestCreation(trackerId, fieldId, statusId);
    }
    /**
     * Get fields of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Field references
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @return List&lt;FieldReference&gt;

     */
    private RestClient.ResponseSpec getTrackerFieldsRequestCreation(Integer trackerId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerFields", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<FieldReference> localVarReturnType = new ParameterizedTypeReference<FieldReference>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/fields", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get fields of tracker
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Field references
     * <p><b>401</b> - Authentication is required
     *
     * @param trackerId The trackerId parameter
     * @return List&lt;FieldReference&gt;
     */
    public List<FieldReference> getTrackerFields(Integer trackerId) throws RestClientResponseException {
        return getTrackerFieldsRequestCreation(trackerId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get fields of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Field references
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @return ResponseEntity&lt;List&lt;FieldReference&gt;&gt;

     */
    public ResponseEntity<List<FieldReference>> getTrackerFieldsWithHttpInfo(Integer trackerId) throws RestClientResponseException {
        return getTrackerFieldsRequestCreation(trackerId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get fields of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Field references
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter

     */
    public RestClient.ResponseSpec getTrackerFieldsWithResponseSpec(Integer trackerId) throws RestClientResponseException {
        return getTrackerFieldsRequestCreation(trackerId);
    }
    /**
     * Get permissions of all fields of a tracker
     * 
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param statusId The statusId parameter
     * @return TrackerFieldsStatusPermissions

     */
    private RestClient.ResponseSpec getTrackerFieldsPermissionsRequestCreation(Integer trackerId, Integer statusId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerFieldsPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "statusId", statusId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerFieldsStatusPermissions> localVarReturnType = new ParameterizedTypeReference<TrackerFieldsStatusPermissions>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/fields/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get permissions of all fields of a tracker
     * 
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param statusId The statusId parameter
     * @return TrackerFieldsStatusPermissions

     */
    public TrackerFieldsStatusPermissions getTrackerFieldsPermissions(Integer trackerId, Integer statusId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerFieldsStatusPermissions> localVarReturnType = new ParameterizedTypeReference<TrackerFieldsStatusPermissions>() {};
        return getTrackerFieldsPermissionsRequestCreation(trackerId, statusId).body(localVarReturnType);
    }

    /**
     * Get permissions of all fields of a tracker
     * 
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param statusId The statusId parameter
     * @return ResponseEntity&lt;TrackerFieldsStatusPermissions&gt;

     */
    public ResponseEntity<TrackerFieldsStatusPermissions> getTrackerFieldsPermissionsWithHttpInfo(Integer trackerId, Integer statusId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerFieldsStatusPermissions> localVarReturnType = new ParameterizedTypeReference<TrackerFieldsStatusPermissions>() {};
        return getTrackerFieldsPermissionsRequestCreation(trackerId, statusId).toEntity(localVarReturnType);
    }

    /**
     * Get permissions of all fields of a tracker
     * 
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Permissions by status and role
     * <p><b>403</b> - Authorization is required
     * <p><b>400</b> - Status id is invalid
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param statusId The statusId parameter

     */
    public RestClient.ResponseSpec getTrackerFieldsPermissionsWithResponseSpec(Integer trackerId, Integer statusId) throws RestClientResponseException {
        return getTrackerFieldsPermissionsRequestCreation(trackerId, statusId);
    }
    /**
     * Get outline of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Outline of the tracker
     * @param trackerId The trackerId parameter
     * @param parentItemId Show only the children of this item.
     * @param resultDepthFilter The depth level of the result outline.
     * @return OutlineItemSearchResult

     */
    private RestClient.ResponseSpec getTrackerOutlineRequestCreation(Integer trackerId, Integer parentItemId, Integer resultDepthFilter) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerOutline", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentItemId", parentItemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resultDepthFilter", resultDepthFilter));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<OutlineItemSearchResult> localVarReturnType = new ParameterizedTypeReference<OutlineItemSearchResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/outline", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get outline of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Outline of the tracker
     * @param trackerId The trackerId parameter
     * @param parentItemId Show only the children of this item.
     * @param resultDepthFilter The depth level of the result outline.
     * @return OutlineItemSearchResult

     */
    public OutlineItemSearchResult getTrackerOutline(Integer trackerId, Integer parentItemId, Integer resultDepthFilter) throws RestClientResponseException {
        ParameterizedTypeReference<OutlineItemSearchResult> localVarReturnType = new ParameterizedTypeReference<OutlineItemSearchResult>() {};
        return getTrackerOutlineRequestCreation(trackerId, parentItemId, resultDepthFilter).body(localVarReturnType);
    }

    /**
     * Get outline of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Outline of the tracker
     * @param trackerId The trackerId parameter
     * @param parentItemId Show only the children of this item.
     * @param resultDepthFilter The depth level of the result outline.
     * @return ResponseEntity&lt;OutlineItemSearchResult&gt;

     */
    public ResponseEntity<OutlineItemSearchResult> getTrackerOutlineWithHttpInfo(Integer trackerId, Integer parentItemId, Integer resultDepthFilter) throws RestClientResponseException {
        ParameterizedTypeReference<OutlineItemSearchResult> localVarReturnType = new ParameterizedTypeReference<OutlineItemSearchResult>() {};
        return getTrackerOutlineRequestCreation(trackerId, parentItemId, resultDepthFilter).toEntity(localVarReturnType);
    }

    /**
     * Get outline of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Internal server error
     * <p><b>401</b> - Not authorized
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Outline of the tracker
     * @param trackerId The trackerId parameter
     * @param parentItemId Show only the children of this item.
     * @param resultDepthFilter The depth level of the result outline.

     */
    public RestClient.ResponseSpec getTrackerOutlineWithResponseSpec(Integer trackerId, Integer parentItemId, Integer resultDepthFilter) throws RestClientResponseException {
        return getTrackerOutlineRequestCreation(trackerId, parentItemId, resultDepthFilter);
    }
    /**
     * Get the schema of a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field definitions
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @return List&lt;AbstractField&gt;

     */
    private RestClient.ResponseSpec getTrackerSchemaRequestCreation(Integer trackerId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerSchema", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<AbstractField> localVarReturnType = new ParameterizedTypeReference<AbstractField>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/schema", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get the schema of a tracker
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field definitions
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     *
     * @param trackerId The trackerId parameter
     * @return List&lt;AbstractField&gt;
     */
    public List<AbstractField> getTrackerSchema(Integer trackerId) throws RestClientResponseException {
        return getTrackerSchemaRequestCreation(trackerId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get the schema of a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field definitions
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @return ResponseEntity&lt;List&lt;AbstractField&gt;&gt;

     */
    public ResponseEntity<List<AbstractField>> getTrackerSchemaWithHttpInfo(Integer trackerId) throws RestClientResponseException {
        return getTrackerSchemaRequestCreation(trackerId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get the schema of a tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Field definitions
     * <p><b>404</b> - Field not found
     * <p><b>429</b> - Too many requests
     * <p><b>401</b> - Authentication is required
     * @param trackerId The trackerId parameter

     */
    public RestClient.ResponseSpec getTrackerSchemaWithResponseSpec(Integer trackerId) throws RestClientResponseException {
        return getTrackerSchemaRequestCreation(trackerId);
    }
    /**
     * Get all transitions of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker transition list
     * @param trackerId The trackerId parameter
     * @param fromStatusId The from status id filter for transitions.
     * @return List&lt;WorkflowTransition&gt;

     */
    private RestClient.ResponseSpec getTrackerTransitionsRequestCreation(Integer trackerId, Integer fromStatusId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling getTrackerTransitions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromStatusId", fromStatusId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<WorkflowTransition> localVarReturnType = new ParameterizedTypeReference<WorkflowTransition>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/transitions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get all transitions of a specific tracker
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker transition list
     *
     * @param trackerId    The trackerId parameter
     * @param fromStatusId The from status id filter for transitions.
     * @return List&lt;WorkflowTransition&gt;
     */
    public List<WorkflowTransition> getTrackerTransitions(Integer trackerId, Integer fromStatusId) throws RestClientResponseException {
        return getTrackerTransitionsRequestCreation(trackerId, fromStatusId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get all transitions of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker transition list
     * @param trackerId The trackerId parameter
     * @param fromStatusId The from status id filter for transitions.
     * @return ResponseEntity&lt;List&lt;WorkflowTransition&gt;&gt;

     */
    public ResponseEntity<List<WorkflowTransition>> getTrackerTransitionsWithHttpInfo(Integer trackerId, Integer fromStatusId) throws RestClientResponseException {
        return getTrackerTransitionsRequestCreation(trackerId, fromStatusId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get all transitions of a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker transition list
     * @param trackerId The trackerId parameter
     * @param fromStatusId The from status id filter for transitions.

     */
    public RestClient.ResponseSpec getTrackerTransitionsWithResponseSpec(Integer trackerId, Integer fromStatusId) throws RestClientResponseException {
        return getTrackerTransitionsRequestCreation(trackerId, fromStatusId);
    }
    /**
     * Get the immutable definition of a tracker type
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker type
     * <p><b>404</b> - Tracker type is not found
     * <p><b>429</b> - Too many requests
     * @param trackerTypeId The trackerTypeId parameter
     * @return TrackerType

     */
    private RestClient.ResponseSpec getTrackerTypeRequestCreation(Integer trackerTypeId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerTypeId' is set
        if (trackerTypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerTypeId' when calling getTrackerType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerTypeId", trackerTypeId);

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

        ParameterizedTypeReference<TrackerType> localVarReturnType = new ParameterizedTypeReference<TrackerType>() {};
        return apiClient.invokeAPI("/v3/trackers/types/{trackerTypeId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get the immutable definition of a tracker type
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker type
     * <p><b>404</b> - Tracker type is not found
     * <p><b>429</b> - Too many requests
     * @param trackerTypeId The trackerTypeId parameter
     * @return TrackerType

     */
    public TrackerType getTrackerType(Integer trackerTypeId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerType> localVarReturnType = new ParameterizedTypeReference<TrackerType>() {};
        return getTrackerTypeRequestCreation(trackerTypeId).body(localVarReturnType);
    }

    /**
     * Get the immutable definition of a tracker type
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker type
     * <p><b>404</b> - Tracker type is not found
     * <p><b>429</b> - Too many requests
     * @param trackerTypeId The trackerTypeId parameter
     * @return ResponseEntity&lt;TrackerType&gt;

     */
    public ResponseEntity<TrackerType> getTrackerTypeWithHttpInfo(Integer trackerTypeId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerType> localVarReturnType = new ParameterizedTypeReference<TrackerType>() {};
        return getTrackerTypeRequestCreation(trackerTypeId).toEntity(localVarReturnType);
    }

    /**
     * Get the immutable definition of a tracker type
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker type
     * <p><b>404</b> - Tracker type is not found
     * <p><b>429</b> - Too many requests
     * @param trackerTypeId The trackerTypeId parameter

     */
    public RestClient.ResponseSpec getTrackerTypeWithResponseSpec(Integer trackerTypeId) throws RestClientResponseException {
        return getTrackerTypeRequestCreation(trackerTypeId);
    }
    /**
     * Get the list of tracker types
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker types
     * @param outline Outline is enabled, disabled or any(no filtering will be applied).
     * @return List&lt;TrackerTypeReference&gt;

     */
    private RestClient.ResponseSpec getTrackerTypesRequestCreation(String outline) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "outline", outline));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerTypeReference> localVarReturnType = new ParameterizedTypeReference<TrackerTypeReference>() {};
        return apiClient.invokeAPI("/v3/trackers/types", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get the list of tracker types
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker types
     *
     * @param outline Outline is enabled, disabled or any(no filtering will be applied).
     * @return List&lt;TrackerTypeReference&gt;
     */
    public List<TrackerTypeReference> getTrackerTypes(String outline) throws RestClientResponseException {
        return getTrackerTypesRequestCreation(outline).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get the list of tracker types
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker types
     * @param outline Outline is enabled, disabled or any(no filtering will be applied).
     * @return ResponseEntity&lt;List&lt;TrackerTypeReference&gt;&gt;

     */
    public ResponseEntity<List<TrackerTypeReference>> getTrackerTypesWithHttpInfo(String outline) throws RestClientResponseException {
        return getTrackerTypesRequestCreation(outline).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get the list of tracker types
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Tracker types
     * @param outline Outline is enabled, disabled or any(no filtering will be applied).

     */
    public RestClient.ResponseSpec getTrackerTypesWithResponseSpec(String outline) throws RestClientResponseException {
        return getTrackerTypesRequestCreation(outline);
    }
    /**
     * Updates a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param tracker The tracker parameter
     * @return Tracker

     */
    private RestClient.ResponseSpec updateTrackerRequestCreation(Integer trackerId, Tracker tracker) throws RestClientResponseException {
        Object postBody = tracker;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling updateTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

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

        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Updates a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param tracker The tracker parameter
     * @return Tracker

     */
    public Tracker updateTracker(Integer trackerId, Tracker tracker) throws RestClientResponseException {
        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return updateTrackerRequestCreation(trackerId, tracker).body(localVarReturnType);
    }

    /**
     * Updates a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param tracker The tracker parameter
     * @return ResponseEntity&lt;Tracker&gt;

     */
    public ResponseEntity<Tracker> updateTrackerWithHttpInfo(Integer trackerId, Tracker tracker) throws RestClientResponseException {
        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return updateTrackerRequestCreation(trackerId, tracker).toEntity(localVarReturnType);
    }

    /**
     * Updates a specific tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param trackerId The trackerId parameter
     * @param tracker The tracker parameter

     */
    public RestClient.ResponseSpec updateTrackerWithResponseSpec(Integer trackerId, Tracker tracker) throws RestClientResponseException {
        return updateTrackerRequestCreation(trackerId, tracker);
    }
    /**
     * Upload a tracker icon
     * 
     * <p><b>400</b> - Could not read image from the request, or it&#39;s the wrong format
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - The tracker could not be accessed
     * <p><b>200</b> - Tracker icon uploaded successfully
     * <p><b>401</b> - Authentication is required
     * @param trackerId Id of the tracker
     * @param icon The icon parameter

     */
    private RestClient.ResponseSpec updateTrackerIconRequestCreation(Integer trackerId, File icon) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling updateTrackerIcon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (icon != null)
            formParams.add("icon", new FileSystemResource(icon));

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/icon", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Upload a tracker icon
     * 
     * <p><b>400</b> - Could not read image from the request, or it&#39;s the wrong format
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - The tracker could not be accessed
     * <p><b>200</b> - Tracker icon uploaded successfully
     * <p><b>401</b> - Authentication is required
     * @param trackerId Id of the tracker
     * @param icon The icon parameter

     */
    public Void updateTrackerIcon(Integer trackerId, File icon) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateTrackerIconRequestCreation(trackerId, icon).body(localVarReturnType);
    }

    /**
     * Upload a tracker icon
     * 
     * <p><b>400</b> - Could not read image from the request, or it&#39;s the wrong format
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - The tracker could not be accessed
     * <p><b>200</b> - Tracker icon uploaded successfully
     * <p><b>401</b> - Authentication is required
     * @param trackerId Id of the tracker
     * @param icon The icon parameter

     */
    public ResponseEntity<Void> updateTrackerIconWithHttpInfo(Integer trackerId, File icon) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateTrackerIconRequestCreation(trackerId, icon).toBodilessEntity();
    }

    /**
     * Upload a tracker icon
     * 
     * <p><b>400</b> - Could not read image from the request, or it&#39;s the wrong format
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - The tracker could not be accessed
     * <p><b>200</b> - Tracker icon uploaded successfully
     * <p><b>401</b> - Authentication is required
     * @param trackerId Id of the tracker
     * @param icon The icon parameter

     */
    public RestClient.ResponseSpec updateTrackerIconWithResponseSpec(Integer trackerId, File icon) throws RestClientResponseException {
        return updateTrackerIconRequestCreation(trackerId, icon);
    }
}
