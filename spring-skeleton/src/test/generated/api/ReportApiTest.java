

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.ReportItemResult;
import codebeamer.rampup.client.model.ReportResult;
import codebeamer.rampup.client.model.SimpleReportSettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for ReportApi
 */
@Disabled
public class ReportApiTest {

    private final ReportApi api = new ReportApi();

    
    /**
     * Create a report
     *
     * 
     */
    @Test
    public void createReportTest()  {
        SimpleReportSettings simpleReportSettings = null;
        SimpleReportSettings response = api.createReport(simpleReportSettings);

        // TODO: test validations
    }
    
    /**
     * Get a report results by id of the report
     *
     * 
     */
    @Test
    public void getReportByIdTest()  {
        Integer reportId = null;
        Integer page = null;
        Integer pageSize = null;
        ReportResult response = api.getReportById(reportId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get a report items by id of the report
     *
     * 
     */
    @Test
    public void getReportItemsByIdTest()  {
        Integer reportId = null;
        Integer page = null;
        Integer pageSize = null;
        ReportItemResult response = api.getReportItemsById(reportId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Update report settings
     *
     * 
     */
    @Test
    public void updateReportTest()  {
        Integer reportId = null;
        SimpleReportSettings simpleReportSettings = null;
        SimpleReportSettings response = api.updateReport(reportId, simpleReportSettings);

        // TODO: test validations
    }
    
}
