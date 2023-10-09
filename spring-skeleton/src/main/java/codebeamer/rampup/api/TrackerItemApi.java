package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.model.BulkOperationResponse;
import codebeamer.rampup.client.model.LockInfo;
import codebeamer.rampup.client.model.LockRequest;
import codebeamer.rampup.client.model.ReferenceSearchResult;
import codebeamer.rampup.client.model.TrackerItem;
import codebeamer.rampup.client.model.TrackerItemChildReference;
import codebeamer.rampup.client.model.TrackerItemField;
import codebeamer.rampup.client.model.TrackerItemFieldAccessibilityList;
import codebeamer.rampup.client.model.TrackerItemHistory;
import codebeamer.rampup.client.model.TrackerItemReferenceSearchResult;
import codebeamer.rampup.client.model.TrackerItemRelationsResult;
import codebeamer.rampup.client.model.TrackerItemReview;
import codebeamer.rampup.client.model.TrackerItemRevision;
import codebeamer.rampup.client.model.TrackerItemSearchRequest;
import codebeamer.rampup.client.model.TrackerItemSearchResult;
import codebeamer.rampup.client.model.TrackerItemsRequest;
import codebeamer.rampup.client.model.UpdateTrackerItemChildrenRequest;
import codebeamer.rampup.client.model.UpdateTrackerItemField;
import codebeamer.rampup.client.model.UpdateTrackerItemFieldWithItemId;
import codebeamer.rampup.client.model.UpdateTrackerItemTableField;
import codebeamer.rampup.client.model.WorkflowTransition;
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
public class TrackerItemApi {
    private ApiClient apiClient;

    @Autowired
    public TrackerItemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param trackerItemRevision The trackerItemRevision parameter
     * @return TrackerItemChildReference

     */
    private RestClient.ResponseSpec addChildToTrackerRequestCreation(Integer trackerId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling addChildToTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/children", HttpMethod.POST, pathParams, queryParams, trackerItemRevision, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param trackerItemRevision The trackerItemRevision parameter
     * @return TrackerItemChildReference

     */
    public TrackerItemChildReference addChildToTracker(Integer trackerId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return addChildToTrackerRequestCreation(trackerId, trackerItemRevision).body(localVarReturnType);
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param trackerItemRevision The trackerItemRevision parameter
     * @return ResponseEntity&lt;TrackerItemChildReference&gt;

     */
    public ResponseEntity<TrackerItemChildReference> addChildToTrackerWithHttpInfo(Integer trackerId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return addChildToTrackerRequestCreation(trackerId, trackerItemRevision).toEntity(localVarReturnType);
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param trackerItemRevision The trackerItemRevision parameter

     */
    public RestClient.ResponseSpec addChildToTrackerWithResponseSpec(Integer trackerId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        return addChildToTrackerRequestCreation(trackerId, trackerItemRevision);
    }
    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param trackerItemRevision The trackerItemRevision parameter
     * @return TrackerItemChildReference

     */
    private RestClient.ResponseSpec addChildToTrackerItemRequestCreation(Integer itemId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling addChildToTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/children", HttpMethod.POST, pathParams, queryParams, trackerItemRevision, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param trackerItemRevision The trackerItemRevision parameter
     * @return TrackerItemChildReference

     */
    public TrackerItemChildReference addChildToTrackerItem(Integer itemId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return addChildToTrackerItemRequestCreation(itemId, trackerItemRevision).body(localVarReturnType);
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param trackerItemRevision The trackerItemRevision parameter
     * @return ResponseEntity&lt;TrackerItemChildReference&gt;

     */
    public ResponseEntity<TrackerItemChildReference> addChildToTrackerItemWithHttpInfo(Integer itemId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return addChildToTrackerItemRequestCreation(itemId, trackerItemRevision).toEntity(localVarReturnType);
    }

    /**
     * Add a child item to a tracker item
     * 
     * <p><b>200</b> - Child item reference with index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param trackerItemRevision The trackerItemRevision parameter

     */
    public RestClient.ResponseSpec addChildToTrackerItemWithResponseSpec(Integer itemId, TrackerItemRevision trackerItemRevision) throws RestClientResponseException {
        return addChildToTrackerItemRequestCreation(itemId, trackerItemRevision);
    }
    /**
     * Bulk update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Bulk update response
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param atomic If it&#39;s turned on the whole update will run in a single transaction.
     * @param updateTrackerItemFieldWithItemId The updateTrackerItemFieldWithItemId parameter
     * @return BulkOperationResponse

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Bulk update fields of a tracker item Documentation</a>
     */
    private RestClient.ResponseSpec bulkUpdateTrackerItemFieldsRequestCreation(Boolean atomic, List<UpdateTrackerItemFieldWithItemId> updateTrackerItemFieldWithItemId) throws RestClientResponseException {
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "atomic", atomic));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<BulkOperationResponse> localVarReturnType = new ParameterizedTypeReference<>() {
        };
        return apiClient.invokeAPI("/v3/items/fields", HttpMethod.PUT, pathParams, queryParams, updateTrackerItemFieldWithItemId, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Bulk update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Bulk update response
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param atomic If it&#39;s turned on the whole update will run in a single transaction.
     * @param updateTrackerItemFieldWithItemId The updateTrackerItemFieldWithItemId parameter
     * @return BulkOperationResponse

    * Tracker item operations
    * @see <a href="https://codebeamer.com/cb/wiki/11375769">Bulk update fields of a tracker item Documentation</a>
     */
    public BulkOperationResponse bulkUpdateTrackerItemFields(Boolean atomic, List<UpdateTrackerItemFieldWithItemId> updateTrackerItemFieldWithItemId) throws RestClientResponseException {
        ParameterizedTypeReference<BulkOperationResponse> localVarReturnType = new ParameterizedTypeReference<BulkOperationResponse>() {};
        return bulkUpdateTrackerItemFieldsRequestCreation(atomic, updateTrackerItemFieldWithItemId).body(localVarReturnType);
    }

    /**
     * Bulk update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Bulk update response
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param atomic If it&#39;s turned on the whole update will run in a single transaction.
     * @param updateTrackerItemFieldWithItemId The updateTrackerItemFieldWithItemId parameter
     * @return ResponseEntity&lt;BulkOperationResponse&gt;

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Bulk update fields of a tracker item Documentation</a>
     */
    public ResponseEntity<BulkOperationResponse> bulkUpdateTrackerItemFieldsWithHttpInfo(Boolean atomic, List<UpdateTrackerItemFieldWithItemId> updateTrackerItemFieldWithItemId) throws RestClientResponseException {
        ParameterizedTypeReference<BulkOperationResponse> localVarReturnType = new ParameterizedTypeReference<BulkOperationResponse>() {};
        return bulkUpdateTrackerItemFieldsRequestCreation(atomic, updateTrackerItemFieldWithItemId).toEntity(localVarReturnType);
    }

    /**
     * Bulk update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Bulk update response
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param atomic If it&#39;s turned on the whole update will run in a single transaction.
     * @param updateTrackerItemFieldWithItemId The updateTrackerItemFieldWithItemId parameter

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Bulk update fields of a tracker item Documentation</a>
     */
    public RestClient.ResponseSpec bulkUpdateTrackerItemFieldsWithResponseSpec(Boolean atomic, List<UpdateTrackerItemFieldWithItemId> updateTrackerItemFieldWithItemId) throws RestClientResponseException {
        return bulkUpdateTrackerItemFieldsRequestCreation(atomic, updateTrackerItemFieldWithItemId);
    }
    /**
     * Check whether a tracker item is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @return LockInfo

     */
    private RestClient.ResponseSpec checkTrackerItemLockRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling checkTrackerItemLock", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LockInfo> localVarReturnType = new ParameterizedTypeReference<LockInfo>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/lock", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Check whether a tracker item is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @return LockInfo

     */
    public LockInfo checkTrackerItemLock(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<LockInfo> localVarReturnType = new ParameterizedTypeReference<LockInfo>() {};
        return checkTrackerItemLockRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Check whether a tracker item is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @return ResponseEntity&lt;LockInfo&gt;

     */
    public ResponseEntity<LockInfo> checkTrackerItemLockWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<LockInfo> localVarReturnType = new ParameterizedTypeReference<>() {};
        return checkTrackerItemLockRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Check whether a tracker item is locked, and if it is, retrieve the details of the lock
     * 
     * <p><b>200</b> - Details of the lock, or an empty response
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id

     */
    public RestClient.ResponseSpec checkTrackerItemLockWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return checkTrackerItemLockRequestCreation(itemId);
    }
    /**
     * Create a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerId The trackerId parameter
     * @param parentItemId The parentItemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter
     * @return TrackerItem

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Create a tracker item Documentation</a>
     */
    private RestClient.ResponseSpec createTrackerItemRequestCreation(Integer trackerId, Integer parentItemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling createTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentItemId", parentItemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "referenceItemId", referenceItemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "position", position));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/items", HttpMethod.POST, pathParams, queryParams, trackerItem, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerId The trackerId parameter
     * @param parentItemId The parentItemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter
     * @return TrackerItem

    * Tracker item operations
    * @see <a href="https://codebeamer.com/cb/wiki/11375769">Create a tracker item Documentation</a>
     */
    public TrackerItem createTrackerItem(Integer trackerId, Integer parentItemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return createTrackerItemRequestCreation(trackerId, parentItemId, referenceItemId, position, trackerItem).body(localVarReturnType);
    }

    /**
     * Create a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerId The trackerId parameter
     * @param parentItemId The parentItemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Create a tracker item Documentation</a>
     */
    public ResponseEntity<TrackerItem> createTrackerItemWithHttpInfo(Integer trackerId, Integer parentItemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return createTrackerItemRequestCreation(trackerId, parentItemId, referenceItemId, position, trackerItem).toEntity(localVarReturnType);
    }

    /**
     * Create a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerId The trackerId parameter
     * @param parentItemId The parentItemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Create a tracker item Documentation</a>
     */
    public RestClient.ResponseSpec createTrackerItemWithResponseSpec(Integer trackerId, Integer parentItemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        return createTrackerItemRequestCreation(trackerId, parentItemId, referenceItemId, position, trackerItem);
    }
    /**
     * Move tracker item to trash
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @return TrackerItem

     */
    private RestClient.ResponseSpec deleteTrackerItemRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling deleteTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Move tracker item to trash
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @return TrackerItem

     */
    public TrackerItem deleteTrackerItem(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return deleteTrackerItemRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Move tracker item to trash
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     */
    public ResponseEntity<TrackerItem> deleteTrackerItemWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return deleteTrackerItemRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Move tracker item to trash
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec deleteTrackerItemWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return deleteTrackerItemRequestCreation(itemId);
    }
    /**
     * Get child items of a tracker item
     * 
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemReferenceSearchResult

     */
    private RestClient.ResponseSpec findTrackerChildrenRequestCreation(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling findTrackerChildren", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/children", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get child items of a tracker item
     * 
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemReferenceSearchResult

     */
    public TrackerItemReferenceSearchResult findTrackerChildren(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return findTrackerChildrenRequestCreation(trackerId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get child items of a tracker item
     * 
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;TrackerItemReferenceSearchResult&gt;

     */
    public ResponseEntity<TrackerItemReferenceSearchResult> findTrackerChildrenWithHttpInfo(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findTrackerChildrenRequestCreation(trackerId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get child items of a tracker item
     * 
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec findTrackerChildrenWithResponseSpec(Integer trackerId, Integer page, Integer pageSize) throws RestClientResponseException {
        return findTrackerChildrenRequestCreation(trackerId, page, pageSize);
    }
    /**
     * Get child items of a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemReferenceSearchResult

     */
    private RestClient.ResponseSpec findTrackerItemChildrenRequestCreation(Integer itemId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling findTrackerItemChildren", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

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
        return apiClient.invokeAPI("/v3/items/{itemId}/children", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get child items of a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemReferenceSearchResult

     */
    public TrackerItemReferenceSearchResult findTrackerItemChildren(Integer itemId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return findTrackerItemChildrenRequestCreation(itemId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get child items of a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;TrackerItemReferenceSearchResult&gt;

     */
    public ResponseEntity<TrackerItemReferenceSearchResult> findTrackerItemChildrenWithHttpInfo(Integer itemId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findTrackerItemChildrenRequestCreation(itemId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get child items of a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - List child items of a tracker item ordered by ordinal
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec findTrackerItemChildrenWithResponseSpec(Integer itemId, Integer page, Integer pageSize) throws RestClientResponseException {
        return findTrackerItemChildrenRequestCreation(itemId, page, pageSize);
    }
    /**
     * Get tracker items by cbQL query string
     * 
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param queryString The queryString parameter
     * @param baselineId Baseline on which the queery is applied.
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemSearchResult

     * Documentation of cbQL
     * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    private RestClient.ResponseSpec findTrackerItemsRequestCreation(String queryString, Integer baselineId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'queryString' is set
        if (queryString == null) {
            throw new RestClientResponseException("Missing the required parameter 'queryString' when calling findTrackerItems", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "baselineId", baselineId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "queryString", queryString));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemSearchResult>() {};
        return apiClient.invokeAPI("/v3/items/query", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker items by cbQL query string
     * 
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param queryString The queryString parameter
     * @param baselineId Baseline on which the queery is applied.
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return TrackerItemSearchResult

    * Documentation of cbQL
    * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    public TrackerItemSearchResult findTrackerItems(String queryString, Integer baselineId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemSearchResult>() {};
        return findTrackerItemsRequestCreation(queryString, baselineId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get tracker items by cbQL query string
     * 
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param queryString The queryString parameter
     * @param baselineId Baseline on which the queery is applied.
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;TrackerItemSearchResult&gt;

     * Documentation of cbQL
     * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    public ResponseEntity<TrackerItemSearchResult> findTrackerItemsWithHttpInfo(String queryString, Integer baselineId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findTrackerItemsRequestCreation(queryString, baselineId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get tracker items by cbQL query string
     * 
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param queryString The queryString parameter
     * @param baselineId Baseline on which the queery is applied.
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     * Documentation of cbQL
     * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    public RestClient.ResponseSpec findTrackerItemsWithResponseSpec(String queryString, Integer baselineId, Integer page, Integer pageSize) throws RestClientResponseException {
        return findTrackerItemsRequestCreation(queryString, baselineId, page, pageSize);
    }
    /**
     * Get tracker items by cbQL query string
     * API can be called with a complex cbQL string to find tracker items
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerItemSearchRequest The trackerItemSearchRequest parameter
     * @return TrackerItemSearchResult

     * Documentation of cbQL
     * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    private RestClient.ResponseSpec findTrackerItemsByCbQLRequestCreation(TrackerItemSearchRequest trackerItemSearchRequest) throws RestClientResponseException {
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

        ParameterizedTypeReference<TrackerItemSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemSearchResult>() {};
        return apiClient.invokeAPI("/v3/items/query", HttpMethod.POST, pathParams, queryParams, trackerItemSearchRequest, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker items by cbQL query string
     * API can be called with a complex cbQL string to find tracker items
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerItemSearchRequest The trackerItemSearchRequest parameter
     * @return TrackerItemSearchResult

    * Documentation of cbQL
    * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    public TrackerItemSearchResult findTrackerItemsByCbQL(TrackerItemSearchRequest trackerItemSearchRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemSearchResult>() {};
        return findTrackerItemsByCbQLRequestCreation(trackerItemSearchRequest).body(localVarReturnType);
    }

    /**
     * Get tracker items by cbQL query string
     * API can be called with a complex cbQL string to find tracker items
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerItemSearchRequest The trackerItemSearchRequest parameter
     * @return ResponseEntity&lt;TrackerItemSearchResult&gt;

     * Documentation of cbQL
     * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    public ResponseEntity<TrackerItemSearchResult> findTrackerItemsByCbQLWithHttpInfo(TrackerItemSearchRequest trackerItemSearchRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findTrackerItemsByCbQLRequestCreation(trackerItemSearchRequest).toEntity(localVarReturnType);
    }

    /**
     * Get tracker items by cbQL query string
     * API can be called with a complex cbQL string to find tracker items
     * <p><b>200</b> - List tracker items by cbQL
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param trackerItemSearchRequest The trackerItemSearchRequest parameter

     * Documentation of cbQL
     * @see <a href="https://codebeamer.com/cb/wiki/871101">Get tracker items by cbQL query string Documentation</a>
     */
    public RestClient.ResponseSpec findTrackerItemsByCbQLWithResponseSpec(TrackerItemSearchRequest trackerItemSearchRequest) throws RestClientResponseException {
        return findTrackerItemsByCbQLRequestCreation(trackerItemSearchRequest);
    }
    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param baselineId The baselineId parameter
     * @return TrackerItemRelationsResult

     */
    private RestClient.ResponseSpec getBaselineTrackerItemRelationsRequestCreation(Integer itemId, Integer baselineId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getBaselineTrackerItemRelations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "baselineId", baselineId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemRelationsResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemRelationsResult>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/relations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param baselineId The baselineId parameter
     * @return TrackerItemRelationsResult

     */
    public TrackerItemRelationsResult getBaselineTrackerItemRelations(Integer itemId, Integer baselineId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemRelationsResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemRelationsResult>() {};
        return getBaselineTrackerItemRelationsRequestCreation(itemId, baselineId).body(localVarReturnType);
    }

    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param baselineId The baselineId parameter
     * @return ResponseEntity&lt;TrackerItemRelationsResult&gt;

     */
    public ResponseEntity<TrackerItemRelationsResult> getBaselineTrackerItemRelationsWithHttpInfo(Integer itemId, Integer baselineId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemRelationsResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getBaselineTrackerItemRelationsRequestCreation(itemId, baselineId).toEntity(localVarReturnType);
    }

    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param baselineId The baselineId parameter

     */
    public RestClient.ResponseSpec getBaselineTrackerItemRelationsWithResponseSpec(Integer itemId, Integer baselineId) throws RestClientResponseException {
        return getBaselineTrackerItemRelationsRequestCreation(itemId, baselineId);
    }
    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter
     * @return List&lt;TrackerItemRelationsResult&gt;

     */
    private RestClient.ResponseSpec getBaselineTrackerItemsRelationsRequestCreation(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        Object postBody = trackerItemsRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "baselineId", baselineId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemRelationsResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemRelationsResult>() {};
        return apiClient.invokeAPI("/v3/items/relations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     *
     * @param baselineId          The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter
     * @return List&lt;TrackerItemRelationsResult&gt;
     */
    public List<TrackerItemRelationsResult> getBaselineTrackerItemsRelations(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        return getBaselineTrackerItemsRelationsRequestCreation(baselineId, trackerItemsRequest).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter
     * @return ResponseEntity&lt;List&lt;TrackerItemRelationsResult&gt;&gt;

     */
    public ResponseEntity<List<TrackerItemRelationsResult>> getBaselineTrackerItemsRelationsWithHttpInfo(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        return getBaselineTrackerItemsRelationsRequestCreation(baselineId, trackerItemsRequest).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get tracker items for a baseline version
     * API can be used for fetching basic information of tracker items at a specific baseline version
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Tracker item list
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param baselineId The baselineId parameter
     * @param trackerItemsRequest The trackerItemsRequest parameter

     */
    public RestClient.ResponseSpec getBaselineTrackerItemsRelationsWithResponseSpec(Integer baselineId, TrackerItemsRequest trackerItemsRequest) throws RestClientResponseException {
        return getBaselineTrackerItemsRelationsRequestCreation(baselineId, trackerItemsRequest);
    }
    /**
     * Get the options of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Options
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - No option found
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param fieldId The fieldId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ReferenceSearchResult

     */
    private RestClient.ResponseSpec getChoiceOptionsRequestCreation(Integer itemId, Integer fieldId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getChoiceOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new RestClientResponseException("Missing the required parameter 'fieldId' when calling getChoiceOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("fieldId", fieldId);

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

        ParameterizedTypeReference<ReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<ReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/fields/{fieldId}/options", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get the options of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Options
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - No option found
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param fieldId The fieldId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ReferenceSearchResult

     */
    public ReferenceSearchResult getChoiceOptions(Integer itemId, Integer fieldId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<ReferenceSearchResult>() {};
        return getChoiceOptionsRequestCreation(itemId, fieldId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get the options of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Options
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - No option found
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param fieldId The fieldId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;ReferenceSearchResult&gt;

     */
    public ResponseEntity<ReferenceSearchResult> getChoiceOptionsWithHttpInfo(Integer itemId, Integer fieldId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<ReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getChoiceOptionsRequestCreation(itemId, fieldId, page, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get the options of a choice field of tracker
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Options
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - No option found
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param fieldId The fieldId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getChoiceOptionsWithResponseSpec(Integer itemId, Integer fieldId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getChoiceOptionsRequestCreation(itemId, fieldId, page, pageSize);
    }
    /**
     * Get a tracker item fields accessibility
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Accessibility returned
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param targetStatusId The targetStatusId parameter
     * @return TrackerItemFieldAccessibilityList

     */
    private RestClient.ResponseSpec getItemAccessibilityRequestCreation(Integer itemId, Integer targetStatusId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getItemAccessibility", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "targetStatusId", targetStatusId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemFieldAccessibilityList> localVarReturnType = new ParameterizedTypeReference<TrackerItemFieldAccessibilityList>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/fields/accessibility", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get a tracker item fields accessibility
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Accessibility returned
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param targetStatusId The targetStatusId parameter
     * @return TrackerItemFieldAccessibilityList

     */
    public TrackerItemFieldAccessibilityList getItemAccessibility(Integer itemId, Integer targetStatusId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemFieldAccessibilityList> localVarReturnType = new ParameterizedTypeReference<TrackerItemFieldAccessibilityList>() {};
        return getItemAccessibilityRequestCreation(itemId, targetStatusId).body(localVarReturnType);
    }

    /**
     * Get a tracker item fields accessibility
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Accessibility returned
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param targetStatusId The targetStatusId parameter
     * @return ResponseEntity&lt;TrackerItemFieldAccessibilityList&gt;

     */
    public ResponseEntity<TrackerItemFieldAccessibilityList> getItemAccessibilityWithHttpInfo(Integer itemId, Integer targetStatusId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemFieldAccessibilityList> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getItemAccessibilityRequestCreation(itemId, targetStatusId).toEntity(localVarReturnType);
    }

    /**
     * Get a tracker item fields accessibility
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Accessibility returned
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param targetStatusId The targetStatusId parameter

     */
    public RestClient.ResponseSpec getItemAccessibilityWithResponseSpec(Integer itemId, Integer targetStatusId) throws RestClientResponseException {
        return getItemAccessibilityRequestCreation(itemId, targetStatusId);
    }
    /**
     * Get basic tracker item
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param version The version parameter
     * @param baselineId The baselineId parameter
     * @return TrackerItem

     */
    private RestClient.ResponseSpec getTrackerItemRequestCreation(Integer itemId, Integer version, Integer baselineId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "baselineId", baselineId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get basic tracker item
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param version The version parameter
     * @param baselineId The baselineId parameter
     * @return TrackerItem

     */
    public TrackerItem getTrackerItem(Integer itemId, Integer version, Integer baselineId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return getTrackerItemRequestCreation(itemId, version, baselineId).body(localVarReturnType);
    }

    /**
     * Get basic tracker item
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param version The version parameter
     * @param baselineId The baselineId parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     */
    public ResponseEntity<TrackerItem> getTrackerItemWithHttpInfo(Integer itemId, Integer version, Integer baselineId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemRequestCreation(itemId, version, baselineId).toEntity(localVarReturnType);
    }

    /**
     * Get basic tracker item
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker item not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @param version The version parameter
     * @param baselineId The baselineId parameter

     */
    public RestClient.ResponseSpec getTrackerItemWithResponseSpec(Integer itemId, Integer version, Integer baselineId) throws RestClientResponseException {
        return getTrackerItemRequestCreation(itemId, version, baselineId);
    }
    /**
     * Get fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Fields of tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Item not found
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @return TrackerItemField

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Get fields of a tracker item Documentation</a>
     */
    private RestClient.ResponseSpec getTrackerItemFieldsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemFields", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TrackerItemField> localVarReturnType = new ParameterizedTypeReference<TrackerItemField>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/fields", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Fields of tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Item not found
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @return TrackerItemField

    * Tracker item operations
    * @see <a href="https://codebeamer.com/cb/wiki/11375769">Get fields of a tracker item Documentation</a>
     */
    public TrackerItemField getTrackerItemFields(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemField> localVarReturnType = new ParameterizedTypeReference<TrackerItemField>() {};
        return getTrackerItemFieldsRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Get fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Fields of tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Item not found
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;TrackerItemField&gt;

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Get fields of a tracker item Documentation</a>
     */
    public ResponseEntity<TrackerItemField> getTrackerItemFieldsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemField> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemFieldsRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Get fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Fields of tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Tracker / Item not found
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Get fields of a tracker item Documentation</a>
     */
    public RestClient.ResponseSpec getTrackerItemFieldsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return getTrackerItemFieldsRequestCreation(itemId);
    }
    /**
     * Get tracker item history
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @return TrackerItemHistory

     */
    private RestClient.ResponseSpec getTrackerItemHistoryRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TrackerItemHistory> localVarReturnType = new ParameterizedTypeReference<TrackerItemHistory>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/history", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get tracker item history
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @return TrackerItemHistory

     */
    public TrackerItemHistory getTrackerItemHistory(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemHistory> localVarReturnType = new ParameterizedTypeReference<TrackerItemHistory>() {};
        return getTrackerItemHistoryRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Get tracker item history
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;TrackerItemHistory&gt;

     */
    public ResponseEntity<TrackerItemHistory> getTrackerItemHistoryWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemHistory> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackerItemHistoryRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Get tracker item history
     * API can be used for fetching basic information of a tracker item
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker not found
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec getTrackerItemHistoryWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return getTrackerItemHistoryRequestCreation(itemId);
    }
    /**
     * Get all Tracker Item Reviews for a particular Tracker Item
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>200</b> - List of tracker item reviews for the particular item
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @return List&lt;TrackerItemReview&gt;

     */
    private RestClient.ResponseSpec getTrackerItemReviewsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemReviews", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TrackerItemReview> localVarReturnType = new ParameterizedTypeReference<TrackerItemReview>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/reviews", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get all Tracker Item Reviews for a particular Tracker Item
     *
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>200</b> - List of tracker item reviews for the particular item
     * <p><b>401</b> - Authentication is required
     *
     * @param itemId The itemId parameter
     * @return List&lt;TrackerItemReview&gt;
     */
    public List<TrackerItemReview> getTrackerItemReviews(Integer itemId) throws RestClientResponseException {
        return getTrackerItemReviewsRequestCreation(itemId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get all Tracker Item Reviews for a particular Tracker Item
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>200</b> - List of tracker item reviews for the particular item
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;List&lt;TrackerItemReview&gt;&gt;

     */
    public ResponseEntity<List<TrackerItemReview>> getTrackerItemReviewsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        return getTrackerItemReviewsRequestCreation(itemId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get all Tracker Item Reviews for a particular Tracker Item
     * 
     * <p><b>404</b> - Tracker item not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>403</b> - Tracker item reviews are disabled, or access to them is denied
     * <p><b>200</b> - List of tracker item reviews for the particular item
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec getTrackerItemReviewsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return getTrackerItemReviewsRequestCreation(itemId);
    }
    /**
     * Get available transitions for a tracker item
     * API can be used for getting available transitions for a tracker item
     * <p><b>404</b> - Tracker item not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Available transitions
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Missing user permissions
     * @param itemId The itemId parameter
     * @return List&lt;WorkflowTransition&gt;

     */
    private RestClient.ResponseSpec getTrackerItemTransitionsRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling getTrackerItemTransitions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<WorkflowTransition> localVarReturnType = new ParameterizedTypeReference<WorkflowTransition>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/transitions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get available transitions for a tracker item
     * API can be used for getting available transitions for a tracker item
     * <p><b>404</b> - Tracker item not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Available transitions
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Missing user permissions
     *
     * @param itemId The itemId parameter
     * @return List&lt;WorkflowTransition&gt;
     */
    public List<WorkflowTransition> getTrackerItemTransitions(Integer itemId) throws RestClientResponseException {
        return getTrackerItemTransitionsRequestCreation(itemId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get available transitions for a tracker item
     * API can be used for getting available transitions for a tracker item
     * <p><b>404</b> - Tracker item not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Available transitions
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Missing user permissions
     * @param itemId The itemId parameter
     * @return ResponseEntity&lt;List&lt;WorkflowTransition&gt;&gt;

     */
    public ResponseEntity<List<WorkflowTransition>> getTrackerItemTransitionsWithHttpInfo(Integer itemId) throws RestClientResponseException {
        return getTrackerItemTransitionsRequestCreation(itemId).toEntity(new ParameterizedTypeReference<>() {});
    }

    /**
     * Get available transitions for a tracker item
     * API can be used for getting available transitions for a tracker item
     * <p><b>404</b> - Tracker item not found
     * <p><b>500</b> - Internal server error
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Available transitions
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Missing user permissions
     * @param itemId The itemId parameter

     */
    public RestClient.ResponseSpec getTrackerItemTransitionsWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return getTrackerItemTransitionsRequestCreation(itemId);
    }
    /**
     * Put a soft lock on a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param lockRequest Requested lock configuration

     */
    private RestClient.ResponseSpec lockTrackerItemRequestCreation(Integer itemId, LockRequest lockRequest) throws RestClientResponseException {
        Object postBody = lockRequest;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling lockTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/lock", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Put a soft lock on a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param lockRequest Requested lock configuration

     */
    public Void lockTrackerItem(Integer itemId, LockRequest lockRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return lockTrackerItemRequestCreation(itemId, lockRequest).body(localVarReturnType);
    }

    /**
     * Put a soft lock on a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param lockRequest Requested lock configuration

     */
    public ResponseEntity<Void> lockTrackerItemWithHttpInfo(Integer itemId, LockRequest lockRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return lockTrackerItemRequestCreation(itemId, lockRequest).toEntity(localVarReturnType);
    }

    /**
     * Put a soft lock on a tracker item
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>403</b> - Could not acquire lock
     * <p><b>200</b> - Lock acquired successfully
     * <p><b>400</b> - Bad request, request validation error
     * <p><b>401</b> - Authentication is required
     * @param itemId Tracker item id
     * @param lockRequest Requested lock configuration

     */
    public RestClient.ResponseSpec lockTrackerItemWithResponseSpec(Integer itemId, LockRequest lockRequest) throws RestClientResponseException {
        return lockTrackerItemRequestCreation(itemId, lockRequest);
    }
    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter
     * @return TrackerItemChildReference

     */
    private RestClient.ResponseSpec patchChildrenOfTrackerRequestCreation(Integer trackerId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        Object postBody = trackerItemChildReference;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling patchChildrenOfTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/children", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter
     * @return TrackerItemChildReference

     */
    public TrackerItemChildReference patchChildrenOfTracker(Integer trackerId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return patchChildrenOfTrackerRequestCreation(trackerId, mode, trackerItemChildReference).body(localVarReturnType);
    }

    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter
     * @return ResponseEntity&lt;TrackerItemChildReference&gt;

     */
    public ResponseEntity<TrackerItemChildReference> patchChildrenOfTrackerWithHttpInfo(Integer trackerId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return patchChildrenOfTrackerRequestCreation(trackerId, mode, trackerItemChildReference).toEntity(localVarReturnType);
    }

    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter

     */
    public RestClient.ResponseSpec patchChildrenOfTrackerWithResponseSpec(Integer trackerId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        return patchChildrenOfTrackerRequestCreation(trackerId, mode, trackerItemChildReference);
    }
    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter
     * @return TrackerItemChildReference

     */
    private RestClient.ResponseSpec patchChildrenOfTrackerItemRequestCreation(Integer itemId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        Object postBody = trackerItemChildReference;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling patchChildrenOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mode' is set
        if (mode == null) {
            throw new RestClientResponseException("Missing the required parameter 'mode' when calling patchChildrenOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/children", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter
     * @return TrackerItemChildReference

     */
    public TrackerItemChildReference patchChildrenOfTrackerItem(Integer itemId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return patchChildrenOfTrackerItemRequestCreation(itemId, mode, trackerItemChildReference).body(localVarReturnType);
    }

    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter
     * @return ResponseEntity&lt;TrackerItemChildReference&gt;

     */
    public ResponseEntity<TrackerItemChildReference> patchChildrenOfTrackerItemWithHttpInfo(Integer itemId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemChildReference> localVarReturnType = new ParameterizedTypeReference<TrackerItemChildReference>() {};
        return patchChildrenOfTrackerItemRequestCreation(itemId, mode, trackerItemChildReference).toEntity(localVarReturnType);
    }

    /**
     * Patch the child item list of a tracker item
     * 
     * <p><b>200</b> - New child item reference on the requested index
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param mode The mode parameter
     * @param trackerItemChildReference The trackerItemChildReference parameter

     */
    public RestClient.ResponseSpec patchChildrenOfTrackerItemWithResponseSpec(Integer itemId, String mode, TrackerItemChildReference trackerItemChildReference) throws RestClientResponseException {
        return patchChildrenOfTrackerItemRequestCreation(itemId, mode, trackerItemChildReference);
    }
    /**
     * Reorder the child item list of a tracker
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter
     * @return TrackerItemReferenceSearchResult

     */
    private RestClient.ResponseSpec replaceChildrenOfTrackerRequestCreation(Integer trackerId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        Object postBody = updateTrackerItemChildrenRequest;
        // verify the required parameter 'trackerId' is set
        if (trackerId == null) {
            throw new RestClientResponseException("Missing the required parameter 'trackerId' when calling replaceChildrenOfTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("trackerId", trackerId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resultPageSize", resultPageSize));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/trackers/{trackerId}/children", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Reorder the child item list of a tracker
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter
     * @return TrackerItemReferenceSearchResult

     */
    public TrackerItemReferenceSearchResult replaceChildrenOfTracker(Integer trackerId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return replaceChildrenOfTrackerRequestCreation(trackerId, resultPageSize, updateTrackerItemChildrenRequest).body(localVarReturnType);
    }

    /**
     * Reorder the child item list of a tracker
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter
     * @return ResponseEntity&lt;TrackerItemReferenceSearchResult&gt;

     */
    public ResponseEntity<TrackerItemReferenceSearchResult> replaceChildrenOfTrackerWithHttpInfo(Integer trackerId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return replaceChildrenOfTrackerRequestCreation(trackerId, resultPageSize, updateTrackerItemChildrenRequest).toEntity(localVarReturnType);
    }

    /**
     * Reorder the child item list of a tracker
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>404</b> - Tracker is not found
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>403</b> - Authentication is required
     * @param trackerId The trackerId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter

     */
    public RestClient.ResponseSpec replaceChildrenOfTrackerWithResponseSpec(Integer trackerId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        return replaceChildrenOfTrackerRequestCreation(trackerId, resultPageSize, updateTrackerItemChildrenRequest);
    }
    /**
     * Replace the child item list of a tracker item
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter
     * @return TrackerItemReferenceSearchResult

     */
    private RestClient.ResponseSpec replaceChildrenOfTrackerItemRequestCreation(Integer itemId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        Object postBody = updateTrackerItemChildrenRequest;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling replaceChildrenOfTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resultPageSize", resultPageSize));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/children", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Replace the child item list of a tracker item
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter
     * @return TrackerItemReferenceSearchResult

     */
    public TrackerItemReferenceSearchResult replaceChildrenOfTrackerItem(Integer itemId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerItemReferenceSearchResult>() {};
        return replaceChildrenOfTrackerItemRequestCreation(itemId, resultPageSize, updateTrackerItemChildrenRequest).body(localVarReturnType);
    }

    /**
     * Replace the child item list of a tracker item
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter
     * @return ResponseEntity&lt;TrackerItemReferenceSearchResult&gt;

     */
    public ResponseEntity<TrackerItemReferenceSearchResult> replaceChildrenOfTrackerItemWithHttpInfo(Integer itemId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItemReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return replaceChildrenOfTrackerItemRequestCreation(itemId, resultPageSize, updateTrackerItemChildrenRequest).toEntity(localVarReturnType);
    }

    /**
     * Replace the child item list of a tracker item
     * 
     * <p><b>200</b> - First page of the new child list
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Invalid request
     * <p><b>401</b> - Permission is required
     * <p><b>404</b> - Tracker item is not found
     * <p><b>403</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param resultPageSize Number of items in the result page. Max value: 500
     * @param updateTrackerItemChildrenRequest The updateTrackerItemChildrenRequest parameter

     */
    public RestClient.ResponseSpec replaceChildrenOfTrackerItemWithResponseSpec(Integer itemId, Integer resultPageSize, UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest) throws RestClientResponseException {
        return replaceChildrenOfTrackerItemRequestCreation(itemId, resultPageSize, updateTrackerItemChildrenRequest);
    }
    /**
     * Unlock a tracker item
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param itemId Tracker item id

     */
    private RestClient.ResponseSpec unlockTrackerItemRequestCreation(Integer itemId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling unlockTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/lock", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Unlock a tracker item
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param itemId Tracker item id

     */
    public Void unlockTrackerItem(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return unlockTrackerItemRequestCreation(itemId).body(localVarReturnType);
    }

    /**
     * Unlock a tracker item
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param itemId Tracker item id

     */
    public ResponseEntity<Void> unlockTrackerItemWithHttpInfo(Integer itemId) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return unlockTrackerItemRequestCreation(itemId).toEntity(localVarReturnType);
    }

    /**
     * Unlock a tracker item
     * 
     * <p><b>200</b> - Unlock successful
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Wiki page not found
     * <p><b>401</b> - Authentication is required
     * <p><b>403</b> - Could not unlock
     * @param itemId Tracker item id

     */
    public RestClient.ResponseSpec unlockTrackerItemWithResponseSpec(Integer itemId) throws RestClientResponseException {
        return unlockTrackerItemRequestCreation(itemId);
    }
    /**
     * Update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param quietMode If it&#39;s turned on HTTP 200 with empty response indicates that the update was successful.
     * @param updateTrackerItemField The updateTrackerItemField parameter
     * @return TrackerItem

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update fields of a tracker item Documentation</a>
     */
    private RestClient.ResponseSpec updateCustomFieldTrackerItemRequestCreation(Integer itemId, Boolean quietMode, UpdateTrackerItemField updateTrackerItemField) throws RestClientResponseException {
        Object postBody = updateTrackerItemField;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling updateCustomFieldTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "quietMode", quietMode));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/fields", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param quietMode If it&#39;s turned on HTTP 200 with empty response indicates that the update was successful.
     * @param updateTrackerItemField The updateTrackerItemField parameter
     * @return TrackerItem

    * Tracker item operations
    * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update fields of a tracker item Documentation</a>
     */
    public TrackerItem updateCustomFieldTrackerItem(Integer itemId, Boolean quietMode, UpdateTrackerItemField updateTrackerItemField) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return updateCustomFieldTrackerItemRequestCreation(itemId, quietMode, updateTrackerItemField).body(localVarReturnType);
    }

    /**
     * Update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param quietMode If it&#39;s turned on HTTP 200 with empty response indicates that the update was successful.
     * @param updateTrackerItemField The updateTrackerItemField parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update fields of a tracker item Documentation</a>
     */
    public ResponseEntity<TrackerItem> updateCustomFieldTrackerItemWithHttpInfo(Integer itemId, Boolean quietMode, UpdateTrackerItemField updateTrackerItemField) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateCustomFieldTrackerItemRequestCreation(itemId, quietMode, updateTrackerItemField).toEntity(localVarReturnType);
    }

    /**
     * Update fields of a tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * <p><b>401</b> - Authentication is required
     * @param itemId The itemId parameter
     * @param quietMode If it&#39;s turned on HTTP 200 with empty response indicates that the update was successful.
     * @param updateTrackerItemField The updateTrackerItemField parameter

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update fields of a tracker item Documentation</a>
     */
    public RestClient.ResponseSpec updateCustomFieldTrackerItemWithResponseSpec(Integer itemId, Boolean quietMode, UpdateTrackerItemField updateTrackerItemField) throws RestClientResponseException {
        return updateCustomFieldTrackerItemRequestCreation(itemId, quietMode, updateTrackerItemField);
    }
    /**
     * Update table field of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param tableFieldId The tableFieldId parameter
     * @param updateTrackerItemTableField The updateTrackerItemTableField parameter
     * @return TrackerItem

     */
    private RestClient.ResponseSpec updateTableFieldTrackerItemRequestCreation(Integer itemId, Integer tableFieldId, UpdateTrackerItemTableField updateTrackerItemTableField) throws RestClientResponseException {
        Object postBody = updateTrackerItemTableField;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling updateTableFieldTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'tableFieldId' is set
        if (tableFieldId == null) {
            throw new RestClientResponseException("Missing the required parameter 'tableFieldId' when calling updateTableFieldTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);
        pathParams.put("tableFieldId", tableFieldId);

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

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}/fields/tables/{tableFieldId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update table field of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param tableFieldId The tableFieldId parameter
     * @param updateTrackerItemTableField The updateTrackerItemTableField parameter
     * @return TrackerItem

     */
    public TrackerItem updateTableFieldTrackerItem(Integer itemId, Integer tableFieldId, UpdateTrackerItemTableField updateTrackerItemTableField) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return updateTableFieldTrackerItemRequestCreation(itemId, tableFieldId, updateTrackerItemTableField).body(localVarReturnType);
    }

    /**
     * Update table field of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param tableFieldId The tableFieldId parameter
     * @param updateTrackerItemTableField The updateTrackerItemTableField parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     */
    public ResponseEntity<TrackerItem> updateTableFieldTrackerItemWithHttpInfo(Integer itemId, Integer tableFieldId, UpdateTrackerItemTableField updateTrackerItemTableField) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<>() {};
        return updateTableFieldTrackerItemRequestCreation(itemId, tableFieldId, updateTrackerItemTableField).toEntity(localVarReturnType);
    }

    /**
     * Update table field of tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param tableFieldId The tableFieldId parameter
     * @param updateTrackerItemTableField The updateTrackerItemTableField parameter

     */
    public RestClient.ResponseSpec updateTableFieldTrackerItemWithResponseSpec(Integer itemId, Integer tableFieldId, UpdateTrackerItemTableField updateTrackerItemTableField) throws RestClientResponseException {
        return updateTableFieldTrackerItemRequestCreation(itemId, tableFieldId, updateTrackerItemTableField);
    }
    /**
     * Update tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter
     * @return TrackerItem

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update tracker item Documentation</a>
     */
    private RestClient.ResponseSpec updateTrackerItemRequestCreation(Integer itemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        Object postBody = trackerItem;
        // verify the required parameter 'itemId' is set
        if (itemId == null) {
            throw new RestClientResponseException("Missing the required parameter 'itemId' when calling updateTrackerItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("itemId", itemId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "referenceItemId", referenceItemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "position", position));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return apiClient.invokeAPI("/v3/items/{itemId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Update tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter
     * @return TrackerItem

    * Tracker item operations
    * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update tracker item Documentation</a>
     */
    public TrackerItem updateTrackerItem(Integer itemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return updateTrackerItemRequestCreation(itemId, referenceItemId, position, trackerItem).body(localVarReturnType);
    }

    /**
     * Update tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter
     * @return ResponseEntity&lt;TrackerItem&gt;

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update tracker item Documentation</a>
     */
    public ResponseEntity<TrackerItem> updateTrackerItemWithHttpInfo(Integer itemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerItem> localVarReturnType = new ParameterizedTypeReference<TrackerItem>() {};
        return updateTrackerItemRequestCreation(itemId, referenceItemId, position, trackerItem).toEntity(localVarReturnType);
    }

    /**
     * Update tracker item
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Tracker / Field not found
     * <p><b>500</b> - Unexpected error
     * <p><b>200</b> - Basic tracker item by id
     * <p><b>429</b> - Too many requests
     * <p><b>400</b> - Request cannot be processed
     * @param itemId The itemId parameter
     * @param referenceItemId The referenceItemId parameter
     * @param position The position parameter
     * @param trackerItem The trackerItem parameter

     * Tracker item operations
     * @see <a href="https://codebeamer.com/cb/wiki/11375769">Update tracker item Documentation</a>
     */
    public RestClient.ResponseSpec updateTrackerItemWithResponseSpec(Integer itemId, Integer referenceItemId, String position, TrackerItem trackerItem) throws RestClientResponseException {
        return updateTrackerItemRequestCreation(itemId, referenceItemId, position, trackerItem);
    }
}
