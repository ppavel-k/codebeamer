

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.Baseline;
import codebeamer.rampup.client.model.CreateBaselineRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for BaselineApi
 */
@Disabled
public class BaselineApiTest {

    private final BaselineApi api = new BaselineApi();

    
    /**
     * Create a project or tracker baseline
     *
     * 
     */
    @Test
    public void createBaselineTest()  {
        CreateBaselineRequest createBaselineRequest = null;
        Baseline response = api.createBaseline(createBaselineRequest);

        // TODO: test validations
    }
    
}
