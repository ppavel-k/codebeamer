

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.Role;
import codebeamer.rampup.client.model.RoleReference;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for RoleApi
 */
@Disabled
public class RoleApiTest {

    private final RoleApi api = new RoleApi();

    
    /**
     * Get role
     *
     * 
     */
    @Test
    public void getRoleTest()  {
        Integer roleId = null;
        Role response = api.getRole(roleId);

        // TODO: test validations
    }
    
    /**
     * Get roles
     *
     * 
     */
    @Test
    public void getRolesTest()  {
        List<RoleReference> response = api.getRoles();

        // TODO: test validations
    }
    
}
