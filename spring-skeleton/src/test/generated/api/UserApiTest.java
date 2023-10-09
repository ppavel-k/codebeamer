

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.User;
import codebeamer.rampup.client.model.UserFilteringRequest;
import codebeamer.rampup.client.model.UserReferenceSearchResult;
import codebeamer.rampup.client.model.UserSearchResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Get user
     *
     * 
     */
    @Test
    public void getUserTest()  {
        Integer userId = null;
        User response = api.getUser(userId);

        // TODO: test validations
    }
    
    /**
     * Get user by email address
     *
     * 
     */
    @Test
    public void getUserByEmailTest()  {
        String email = null;
        User response = api.getUserByEmail(email);

        // TODO: test validations
    }
    
    /**
     * Get user by name
     *
     * 
     */
    @Test
    public void getUserByNameTest()  {
        String name = null;
        User response = api.getUserByName(name);

        // TODO: test validations
    }
    
    /**
     * Get users
     *
     * 
     */
    @Test
    public void getUsersTest()  {
        Integer page = null;
        Integer pageSize = null;
        Integer groupId = null;
        String queryString = null;
        UserReferenceSearchResult response = api.getUsers(page, pageSize, groupId, queryString);

        // TODO: test validations
    }
    
    /**
     * Search users
     *
     * 
     */
    @Test
    public void searchUsersTest()  {
        Integer page = null;
        Integer pageSize = null;
        UserFilteringRequest userFilteringRequest = null;
        UserSearchResult response = api.searchUsers(page, pageSize, userFilteringRequest);

        // TODO: test validations
    }
    
}
