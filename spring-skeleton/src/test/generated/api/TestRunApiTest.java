

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.CreateTestRunFromTestSetsRequest;
import codebeamer.rampup.client.model.CreateTestRunRequest;
import codebeamer.rampup.client.model.TestRunResult;
import codebeamer.rampup.client.model.TrackerItem;
import codebeamer.rampup.client.model.UpdateTestRunRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for TestRunApi
 */
@Disabled
public class TestRunApiTest {

    private final TestRunApi api = new TestRunApi();

    
    /**
     * Create a new test run for test cases or test sets
     *
     * For multiple test sets please use trackers/{testRunTrackerId}/testruns/generatefromtestset endpoint.
     */
    @Test
    public void createTestRunForTestCaseTest()  {
        Integer testRunTrackerId = null;
        CreateTestRunRequest createTestRunRequest = null;
        TrackerItem response = api.createTestRunForTestCase(testRunTrackerId, createTestRunRequest);

        // TODO: test validations
    }
    
    /**
     * Create a new test run for test cases or test sets
     *
     * 
     */
    @Test
    public void createTestRunForTestSetsTest()  {
        Integer testRunTrackerId = null;
        CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest = null;
        TestRunResult response = api.createTestRunForTestSets(testRunTrackerId, createTestRunFromTestSetsRequest);

        // TODO: test validations
    }
    
    /**
     * Update result of a Test Run
     *
     * 
     */
    @Test
    public void updateTestRunResultTest()  {
        Integer testRunId = null;
        UpdateTestRunRequest updateTestRunRequest = null;
        TrackerItem response = api.updateTestRunResult(testRunId, updateTestRunRequest);

        // TODO: test validations
    }
    
}
