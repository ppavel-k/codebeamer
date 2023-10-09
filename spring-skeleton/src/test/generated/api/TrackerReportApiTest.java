

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.ReportItemResult;
import codebeamer.rampup.client.model.ReportReference;
import codebeamer.rampup.client.model.ReportResult;
import codebeamer.rampup.client.model.TrackerReportSettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for TrackerReportApi
 */
@Disabled
public class TrackerReportApiTest {

    private final TrackerReportApi api = new TrackerReportApi();

    
    /**
     * Creates a report of a specific tracker
     *
     * 
     */
    @Test
    public void createTrackerReportTest()  {
        Integer trackerId = null;
        TrackerReportSettings trackerReportSettings = null;
        TrackerReportSettings response = api.createTrackerReport(trackerId, trackerReportSettings);

        // TODO: test validations
    }
    
    /**
     * Deletes a report of a specific tracker
     *
     * 
     */
    @Test
    public void deleteTrackerReportTest()  {
        Integer trackerId = null;
        Integer reportId = null;
        api.deleteTrackerReport(trackerId, reportId);

        // TODO: test validations
    }
    
    /**
     * Get a report of a specific tracker
     *
     * 
     */
    @Test
    public void getTrackerReportTest()  {
        Integer trackerId = null;
        Integer reportId = null;
        Integer page = null;
        Integer pageSize = null;
        ReportResult response = api.getTrackerReport(trackerId, reportId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get report items of a specific tracker view
     *
     * 
     */
    @Test
    public void getTrackerReportItemsTest()  {
        Integer trackerId = null;
        Integer reportId = null;
        Integer page = null;
        Integer pageSize = null;
        ReportItemResult response = api.getTrackerReportItems(trackerId, reportId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get all reports of a specific tracker
     *
     * 
     */
    @Test
    public void getTrackerReportsTest()  {
        Integer trackerId = null;
        List<ReportReference> response = api.getTrackerReports(trackerId);

        // TODO: test validations
    }
    
    /**
     * Updates a report of a specific tracker
     *
     * 
     */
    @Test
    public void updateTrackerReportTest()  {
        Integer trackerId = null;
        Integer reportId = null;
        TrackerReportSettings trackerReportSettings = null;
        TrackerReportSettings response = api.updateTrackerReport(trackerId, reportId, trackerReportSettings);

        // TODO: test validations
    }
    
}
