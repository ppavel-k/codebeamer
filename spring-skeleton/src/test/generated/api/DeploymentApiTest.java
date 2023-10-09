

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.BackgroundJobReference;
import codebeamer.rampup.client.model.ExportForDeploymentRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;




/**
 * API tests for DeploymentApi
 */
@Disabled
public class DeploymentApiTest {

    private final DeploymentApi api = new DeploymentApi();

    
    /**
     * Export projects for deployment
     *
     * 
     */
    @Test
    public void exportForDeploymentTest()  {
        ExportForDeploymentRequest exportForDeploymentRequest = null;
        BackgroundJobReference response = api.exportForDeployment(exportForDeploymentRequest);

        // TODO: test validations
    }
    
    /**
     * Start a deployment process
     *
     * 
     */
    @Test
    public void uploadDeploymentTest()  {
        File imports = null;
        api.uploadDeployment(imports);

        // TODO: test validations
    }
    
}
