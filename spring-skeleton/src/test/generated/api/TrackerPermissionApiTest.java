

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.PermissionIdsRequest;
import codebeamer.rampup.client.model.RoleWithPermissions;
import codebeamer.rampup.client.model.TrackerPermission;
import codebeamer.rampup.client.model.TrackerPermissionReference;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for TrackerPermissionApi
 */
@Disabled
public class TrackerPermissionApiTest {

    private final TrackerPermissionApi api = new TrackerPermissionApi();

    
    /**
     * Get the immutable definition of a tracker permission
     *
     * 
     */
    @Test
    public void getTrackerPermissionTest()  {
        Integer trackerPermissionId = null;
        TrackerPermission response = api.getTrackerPermission(trackerPermissionId);

        // TODO: test validations
    }
    
    /**
     * Get available tracker permissions
     *
     * 
     */
    @Test
    public void getTrackerPermissionsTest()  {
        List<TrackerPermissionReference> response = api.getTrackerPermissions();

        // TODO: test validations
    }
    
    /**
     * List tracker permissions per role
     *
     * API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role
     */
    @Test
    public void getTrackerPermissionsWithRolesTest()  {
        Integer trackerId = null;
        Integer userId = null;
        Integer roleId = null;
        List<RoleWithPermissions> response = api.getTrackerPermissionsWithRoles(trackerId, userId, roleId);

        // TODO: test validations
    }
    
    /**
     * Removes all tracker permissions from a specific role
     *
     * 
     */
    @Test
    public void removePermissionsTest()  {
        Integer trackerId = null;
        Integer roleId = null;
        api.removePermissions(trackerId, roleId);

        // TODO: test validations
    }
    
    /**
     * Set the tracker permissions for a specific role
     *
     * 
     */
    @Test
    public void updatePermissionTest()  {
        Integer trackerId = null;
        Integer roleId = null;
        PermissionIdsRequest permissionIdsRequest = null;
        List<RoleWithPermissions> response = api.updatePermission(trackerId, roleId, permissionIdsRequest);

        // TODO: test validations
    }
    
}
