

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.BatchGetTrackerItemReviewsRequest;
import codebeamer.rampup.client.model.ExportProject;
import codebeamer.rampup.client.model.TrackerItem;
import codebeamer.rampup.client.model.TrackerItemWithTrackerItemReviewsExport;
import codebeamer.rampup.client.model.TrackerItemsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for ExportApi
 */
@Disabled
public class ExportApiTest {

    private final ExportApi api = new ExportApi();

    
    /**
     * Get tracker item reviews by a list of tracker item IDs
     *
     * 
     */
    @Test
    public void batchGetTrackerItemReviewsTest()  {
        BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = null;
        List<TrackerItemWithTrackerItemReviewsExport> response = api.batchGetTrackerItemReviews(batchGetTrackerItemReviewsRequest);

        // TODO: test validations
    }
    
    /**
     * Exports the specified project to a zip file
     *
     * 
     */
    @Test
    public void exportTest()  {
        Integer projectId = null;
        ExportProject exportProject = null;
        File response = api.export(projectId, exportProject);

        // TODO: test validations
    }
    
    /**
     * Get tracker items
     *
     * API can be used for fetching basic information of tracker items
     */
    @Test
    public void getTrackerItemsTest()  {
        Integer baselineId = null;
        TrackerItemsRequest trackerItemsRequest = null;
        List<TrackerItem> response = api.getTrackerItems(baselineId, trackerItemsRequest);

        // TODO: test validations
    }
    
}
