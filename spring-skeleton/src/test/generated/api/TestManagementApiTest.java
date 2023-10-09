

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.AutoApplyTestStepReuses;
import codebeamer.rampup.client.model.TrackerItemReference;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for TestManagementApi
 */
@Disabled
public class TestManagementApiTest {

    private final TestManagementApi api = new TestManagementApi();

    
    /**
     * Find duplicate TestSteps in a set of TestCases and converting duplicates to Reuses
     *
     * 
     */
    @Test
    public void autoApplyStepReusesTest()  {
        AutoApplyTestStepReuses autoApplyTestStepReuses = null;
        List<TrackerItemReference> response = api.autoApplyStepReuses(autoApplyTestStepReuses);

        // TODO: test validations
    }
    
}
