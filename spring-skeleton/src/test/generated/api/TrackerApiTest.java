

package codebeamer.rampup.api;

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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for TrackerApi
 */
@Disabled
public class TrackerApiTest {

    private final TrackerApi api = new TrackerApi();

    
    /**
     * Deletes a tracker
     *
     * 
     */
    @Test
    public void deleteTrackerTest()  {
        Integer trackerId = null;
        api.deleteTracker(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get option of a choice field of tracker
     *
     * 
     */
    @Test
    public void getChoiceOptionTest()  {
        Integer trackerId = null;
        Integer fieldId = null;
        Integer optionId = null;
        ChoiceOptionReference response = api.getChoiceOption(trackerId, fieldId, optionId);

        // TODO: test validations
    }
    
    /**
     * Get items in a specific tracker
     *
     * 
     */
    @Test
    public void getItemsByTrackerTest()  {
        Integer trackerId = null;
        Integer page = null;
        Integer pageSize = null;
        TrackerItemReferenceSearchResult response = api.getItemsByTracker(trackerId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get tracker
     *
     * 
     */
    @Test
    public void getTrackerTest()  {
        Integer trackerId = null;
        Tracker response = api.getTracker(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get baselines of a specific tracker
     *
     * 
     */
    @Test
    public void getTrackerBaselinesTest()  {
        Integer trackerId = null;
        ReferenceSearchResult response = api.getTrackerBaselines(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get field of tracker
     *
     * 
     */
    @Test
    public void getTrackerFieldTest()  {
        Integer trackerId = null;
        Integer fieldId = null;
        AbstractField response = api.getTrackerField(trackerId, fieldId);

        // TODO: test validations
    }
    
    /**
     * Get permissions of tracker field
     *
     * 
     */
    @Test
    public void getTrackerFieldPermissionsTest()  {
        Integer trackerId = null;
        Integer fieldId = null;
        Integer statusId = null;
        List<TrackerFieldStatusPermissions> response = api.getTrackerFieldPermissions(trackerId, fieldId, statusId);

        // TODO: test validations
    }
    
    /**
     * Get fields of tracker
     *
     * 
     */
    @Test
    public void getTrackerFieldsTest()  {
        Integer trackerId = null;
        List<FieldReference> response = api.getTrackerFields(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get permissions of all fields of a tracker
     *
     * 
     */
    @Test
    public void getTrackerFieldsPermissionsTest()  {
        Integer trackerId = null;
        Integer statusId = null;
        TrackerFieldsStatusPermissions response = api.getTrackerFieldsPermissions(trackerId, statusId);

        // TODO: test validations
    }
    
    /**
     * Get outline of a specific tracker
     *
     * 
     */
    @Test
    public void getTrackerOutlineTest()  {
        Integer trackerId = null;
        Integer parentItemId = null;
        Integer resultDepthFilter = null;
        OutlineItemSearchResult response = api.getTrackerOutline(trackerId, parentItemId, resultDepthFilter);

        // TODO: test validations
    }
    
    /**
     * Get the schema of a tracker
     *
     * 
     */
    @Test
    public void getTrackerSchemaTest()  {
        Integer trackerId = null;
        List<AbstractField> response = api.getTrackerSchema(trackerId);

        // TODO: test validations
    }
    
    /**
     * Get all transitions of a specific tracker
     *
     * 
     */
    @Test
    public void getTrackerTransitionsTest()  {
        Integer trackerId = null;
        Integer fromStatusId = null;
        List<WorkflowTransition> response = api.getTrackerTransitions(trackerId, fromStatusId);

        // TODO: test validations
    }
    
    /**
     * Get the immutable definition of a tracker type
     *
     * 
     */
    @Test
    public void getTrackerTypeTest()  {
        Integer trackerTypeId = null;
        TrackerType response = api.getTrackerType(trackerTypeId);

        // TODO: test validations
    }
    
    /**
     * Get the list of tracker types
     *
     * 
     */
    @Test
    public void getTrackerTypesTest()  {
        String outline = null;
        List<TrackerTypeReference> response = api.getTrackerTypes(outline);

        // TODO: test validations
    }
    
    /**
     * Updates a specific tracker
     *
     * 
     */
    @Test
    public void updateTrackerTest()  {
        Integer trackerId = null;
        Tracker tracker = null;
        Tracker response = api.updateTracker(trackerId, tracker);

        // TODO: test validations
    }
    
    /**
     * Upload a tracker icon
     *
     * 
     */
    @Test
    public void updateTrackerIconTest()  {
        Integer trackerId = null;
        File icon = null;
        api.updateTrackerIcon(trackerId, icon);

        // TODO: test validations
    }
    
}
