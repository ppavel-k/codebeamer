

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.TraceabilityInitialLevelFilter;
import codebeamer.rampup.client.model.TraceabilityItem;
import codebeamer.rampup.client.model.TraceabilityLevelFilter;
import codebeamer.rampup.client.model.TraceabilityResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for TraceabilityApi
 */
@Disabled
public class TraceabilityApiTest {

    private final TraceabilityApi api = new TraceabilityApi();

    
    /**
     * Get initial ids
     *
     * Get traceability initial ids!
     */
    @Test
    public void getTraceabilityInitialItemIdsTest()  {
        Integer pageSize = null;
        Integer pageNo = null;
        TraceabilityInitialLevelFilter traceabilityInitialLevelFilter = null;
        List<TraceabilityItem> response = api.getTraceabilityInitialItemIds(pageSize, pageNo, traceabilityInitialLevelFilter);

        // TODO: test validations
    }
    
    /**
     * Get traceability level item ids
     *
     * Get traceability item ids!
     */
    @Test
    public void getTraceabilityLevelItemIdsTest()  {
        Integer itemsOnLevel = null;
        Integer itemsFromPreviousItem = null;
        TraceabilityLevelFilter traceabilityLevelFilter = null;
        TraceabilityResult response = api.getTraceabilityLevelItemIds(itemsOnLevel, itemsFromPreviousItem, traceabilityLevelFilter);

        // TODO: test validations
    }
    
}
