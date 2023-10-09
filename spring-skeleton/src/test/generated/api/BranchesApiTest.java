

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.TrackerItem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for BranchesApi
 */
@Disabled
public class BranchesApiTest {

    private final BranchesApi api = new BranchesApi();

    
    /**
     * Get tracker item on branch
     *
     * API can be used for finding a tracker item by a branch id
     */
    @Test
    public void getTrackerItemOnBranchTest()  {
        Integer sourceItemId = null;
        Integer branchId = null;
        TrackerItem response = api.getTrackerItemOnBranch(sourceItemId, branchId);

        // TODO: test validations
    }
    
}
