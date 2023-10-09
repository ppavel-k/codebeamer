

package codebeamer.rampup.api;

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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for TrackerItemApi
 */
@Disabled
public class TrackerItemApiTest {

    private final TrackerItemApi api = new TrackerItemApi();

    
    /**
     * Add a child item to a tracker item
     *
     * 
     */
    @Test
    public void addChildToTrackerTest()  {
        Integer trackerId = null;
        TrackerItemRevision trackerItemRevision = null;
        TrackerItemChildReference response = api.addChildToTracker(trackerId, trackerItemRevision);

        // TODO: test validations
    }
    
    /**
     * Add a child item to a tracker item
     *
     * 
     */
    @Test
    public void addChildToTrackerItemTest()  {
        Integer itemId = null;
        TrackerItemRevision trackerItemRevision = null;
        TrackerItemChildReference response = api.addChildToTrackerItem(itemId, trackerItemRevision);

        // TODO: test validations
    }
    
    /**
     * Bulk update fields of a tracker item
     *
     * 
     */
    @Test
    public void bulkUpdateTrackerItemFieldsTest()  {
        Boolean atomic = null;
        List<UpdateTrackerItemFieldWithItemId> updateTrackerItemFieldWithItemId = null;
        BulkOperationResponse response = api.bulkUpdateTrackerItemFields(atomic, updateTrackerItemFieldWithItemId);

        // TODO: test validations
    }
    
    /**
     * Check whether a tracker item is locked, and if it is, retrieve the details of the lock
     *
     * 
     */
    @Test
    public void checkTrackerItemLockTest()  {
        Integer itemId = null;
        LockInfo response = api.checkTrackerItemLock(itemId);

        // TODO: test validations
    }
    
    /**
     * Create a tracker item
     *
     * 
     */
    @Test
    public void createTrackerItemTest()  {
        Integer trackerId = null;
        Integer parentItemId = null;
        Integer referenceItemId = null;
        String position = null;
        TrackerItem trackerItem = null;
        TrackerItem response = api.createTrackerItem(trackerId, parentItemId, referenceItemId, position, trackerItem);

        // TODO: test validations
    }
    
    /**
     * Move tracker item to trash
     *
     * 
     */
    @Test
    public void deleteTrackerItemTest()  {
        Integer itemId = null;
        TrackerItem response = api.deleteTrackerItem(itemId);

        // TODO: test validations
    }
    
    /**
     * Get child items of a tracker item
     *
     * 
     */
    @Test
    public void findTrackerChildrenTest()  {
        Integer trackerId = null;
        Integer page = null;
        Integer pageSize = null;
        TrackerItemReferenceSearchResult response = api.findTrackerChildren(trackerId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get child items of a tracker item
     *
     * 
     */
    @Test
    public void findTrackerItemChildrenTest()  {
        Integer itemId = null;
        Integer page = null;
        Integer pageSize = null;
        TrackerItemReferenceSearchResult response = api.findTrackerItemChildren(itemId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get tracker items by cbQL query string
     *
     * 
     */
    @Test
    public void findTrackerItemsTest()  {
        String queryString = null;
        Integer baselineId = null;
        Integer page = null;
        Integer pageSize = null;
        TrackerItemSearchResult response = api.findTrackerItems(queryString, baselineId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get tracker items by cbQL query string
     *
     * API can be called with a complex cbQL string to find tracker items
     */
    @Test
    public void findTrackerItemsByCbQLTest()  {
        TrackerItemSearchRequest trackerItemSearchRequest = null;
        TrackerItemSearchResult response = api.findTrackerItemsByCbQL(trackerItemSearchRequest);

        // TODO: test validations
    }
    
    /**
     * Get tracker items for a baseline version
     *
     * API can be used for fetching basic information of tracker items at a specific baseline version
     */
    @Test
    public void getBaselineTrackerItemRelationsTest()  {
        Integer itemId = null;
        Integer baselineId = null;
        TrackerItemRelationsResult response = api.getBaselineTrackerItemRelations(itemId, baselineId);

        // TODO: test validations
    }
    
    /**
     * Get tracker items for a baseline version
     *
     * API can be used for fetching basic information of tracker items at a specific baseline version
     */
    @Test
    public void getBaselineTrackerItemsRelationsTest()  {
        Integer baselineId = null;
        TrackerItemsRequest trackerItemsRequest = null;
        List<TrackerItemRelationsResult> response = api.getBaselineTrackerItemsRelations(baselineId, trackerItemsRequest);

        // TODO: test validations
    }
    
    /**
     * Get the options of a choice field of tracker
     *
     * 
     */
    @Test
    public void getChoiceOptionsTest()  {
        Integer itemId = null;
        Integer fieldId = null;
        Integer page = null;
        Integer pageSize = null;
        ReferenceSearchResult response = api.getChoiceOptions(itemId, fieldId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a tracker item fields accessibility
     *
     * 
     */
    @Test
    public void getItemAccessibilityTest()  {
        Integer itemId = null;
        Integer targetStatusId = null;
        TrackerItemFieldAccessibilityList response = api.getItemAccessibility(itemId, targetStatusId);

        // TODO: test validations
    }
    
    /**
     * Get basic tracker item
     *
     * API can be used for fetching basic information of a tracker item
     */
    @Test
    public void getTrackerItemTest()  {
        Integer itemId = null;
        Integer version = null;
        Integer baselineId = null;
        TrackerItem response = api.getTrackerItem(itemId, version, baselineId);

        // TODO: test validations
    }
    
    /**
     * Get fields of a tracker item
     *
     * 
     */
    @Test
    public void getTrackerItemFieldsTest()  {
        Integer itemId = null;
        TrackerItemField response = api.getTrackerItemFields(itemId);

        // TODO: test validations
    }
    
    /**
     * Get tracker item history
     *
     * API can be used for fetching basic information of a tracker item
     */
    @Test
    public void getTrackerItemHistoryTest()  {
        Integer itemId = null;
        TrackerItemHistory response = api.getTrackerItemHistory(itemId);

        // TODO: test validations
    }
    
    /**
     * Get all Tracker Item Reviews for a particular Tracker Item
     *
     * 
     */
    @Test
    public void getTrackerItemReviewsTest()  {
        Integer itemId = null;
        List<TrackerItemReview> response = api.getTrackerItemReviews(itemId);

        // TODO: test validations
    }
    
    /**
     * Get available transitions for a tracker item
     *
     * API can be used for getting available transitions for a tracker item
     */
    @Test
    public void getTrackerItemTransitionsTest()  {
        Integer itemId = null;
        List<WorkflowTransition> response = api.getTrackerItemTransitions(itemId);

        // TODO: test validations
    }
    
    /**
     * Put a soft lock on a tracker item
     *
     * 
     */
    @Test
    public void lockTrackerItemTest()  {
        Integer itemId = null;
        LockRequest lockRequest = null;
        api.lockTrackerItem(itemId, lockRequest);

        // TODO: test validations
    }
    
    /**
     * Patch the child item list of a tracker item
     *
     * 
     */
    @Test
    public void patchChildrenOfTrackerTest()  {
        Integer trackerId = null;
        String mode = null;
        TrackerItemChildReference trackerItemChildReference = null;
        TrackerItemChildReference response = api.patchChildrenOfTracker(trackerId, mode, trackerItemChildReference);

        // TODO: test validations
    }
    
    /**
     * Patch the child item list of a tracker item
     *
     * 
     */
    @Test
    public void patchChildrenOfTrackerItemTest()  {
        Integer itemId = null;
        String mode = null;
        TrackerItemChildReference trackerItemChildReference = null;
        TrackerItemChildReference response = api.patchChildrenOfTrackerItem(itemId, mode, trackerItemChildReference);

        // TODO: test validations
    }
    
    /**
     * Reorder the child item list of a tracker
     *
     * 
     */
    @Test
    public void replaceChildrenOfTrackerTest()  {
        Integer trackerId = null;
        Integer resultPageSize = null;
        UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = null;
        TrackerItemReferenceSearchResult response = api.replaceChildrenOfTracker(trackerId, resultPageSize, updateTrackerItemChildrenRequest);

        // TODO: test validations
    }
    
    /**
     * Replace the child item list of a tracker item
     *
     * 
     */
    @Test
    public void replaceChildrenOfTrackerItemTest()  {
        Integer itemId = null;
        Integer resultPageSize = null;
        UpdateTrackerItemChildrenRequest updateTrackerItemChildrenRequest = null;
        TrackerItemReferenceSearchResult response = api.replaceChildrenOfTrackerItem(itemId, resultPageSize, updateTrackerItemChildrenRequest);

        // TODO: test validations
    }
    
    /**
     * Unlock a tracker item
     *
     * 
     */
    @Test
    public void unlockTrackerItemTest()  {
        Integer itemId = null;
        api.unlockTrackerItem(itemId);

        // TODO: test validations
    }
    
    /**
     * Update fields of a tracker item
     *
     * 
     */
    @Test
    public void updateCustomFieldTrackerItemTest()  {
        Integer itemId = null;
        Boolean quietMode = null;
        UpdateTrackerItemField updateTrackerItemField = null;
        TrackerItem response = api.updateCustomFieldTrackerItem(itemId, quietMode, updateTrackerItemField);

        // TODO: test validations
    }
    
    /**
     * Update table field of tracker item
     *
     * 
     */
    @Test
    public void updateTableFieldTrackerItemTest()  {
        Integer itemId = null;
        Integer tableFieldId = null;
        UpdateTrackerItemTableField updateTrackerItemTableField = null;
        TrackerItem response = api.updateTableFieldTrackerItem(itemId, tableFieldId, updateTrackerItemTableField);

        // TODO: test validations
    }
    
    /**
     * Update tracker item
     *
     * 
     */
    @Test
    public void updateTrackerItemTest()  {
        Integer itemId = null;
        Integer referenceItemId = null;
        String position = null;
        TrackerItem trackerItem = null;
        TrackerItem response = api.updateTrackerItem(itemId, referenceItemId, position, trackerItem);

        // TODO: test validations
    }
    
}
