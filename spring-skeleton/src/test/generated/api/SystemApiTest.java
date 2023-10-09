

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.MaintenanceMode;
import codebeamer.rampup.client.model.SystemStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for SystemApi
 */
@Disabled
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    
    /**
     * Get system maintenance status
     *
     * 
     */
    @Test
    public void getSystemStatusTest()  {
        SystemStatus response = api.getSystemStatus();

        // TODO: test validations
    }
    
    /**
     * Set system maintenance status
     *
     * 
     */
    @Test
    public void setSystemStatusTest()  {
        MaintenanceMode maintenanceMode = null;
        SystemStatus response = api.setSystemStatus(maintenanceMode);

        // TODO: test validations
    }
    
}
