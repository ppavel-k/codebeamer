package codebeamer.rampup.api;

import codebeamer.rampup.client.model.UserGroup;
import codebeamer.rampup.client.model.UserGroupReference;
import codebeamer.rampup.client.model.UserReferenceSearchResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for GroupApi
 */
@Disabled
public class GroupApiTest {

    private final GroupApi api = new GroupApi();

    
    /**
     * Get user group
     *
     * 
     */
    @Test
    public void getGroupTest()  {
        Integer groupId = null;
        UserGroup response = api.getGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Get all members of a user group
     *
     * 
     */
    @Test
    public void getGroupMembersTest()  {
        Integer groupId = null;
        Integer page = null;
        Integer pageSize = null;
        UserReferenceSearchResult response = api.getGroupMembers(groupId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get user groups
     *
     * 
     */
    @Test
    public void getGroupsTest()  {
        List<UserGroupReference> response = api.getGroups();

        // TODO: test validations
    }
    
}
