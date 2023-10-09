

package codebeamer.rampup.api;

import codebeamer.rampup.client.model.DeployProject;
import codebeamer.rampup.client.model.MemberReferenceSearchResult;
import codebeamer.rampup.client.model.Project;
import codebeamer.rampup.client.model.ProjectFilteringRequest;
import codebeamer.rampup.client.model.ProjectMemberPermissions;
import codebeamer.rampup.client.model.ProjectReference;
import codebeamer.rampup.client.model.ProjectSearchResult;
import codebeamer.rampup.client.model.Tracker;
import codebeamer.rampup.client.model.TrackerFilteringRequest;
import codebeamer.rampup.client.model.TrackerReference;
import codebeamer.rampup.client.model.TrackerSearchResult;
import codebeamer.rampup.client.model.WikiOutlineSearchResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for ProjectApi
 */
@Disabled
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    
    /**
     * Create a tracker
     *
     * 
     */
    @Test
    public void createTrackerTest()  {
        Integer projectId = null;
        Integer templateId = null;
        Tracker tracker = null;
        Tracker response = api.createTracker(projectId, templateId, tracker);

        // TODO: test validations
    }
    
    /**
     * Deploy a project configuration to a Project
     *
     * The configuration file needs to be uploaded to codebeamer Documents
     */
    @Test
    public void deployConfigurationTest()  {
        DeployProject deployProject = null;
        Project response = api.deployConfiguration(deployProject);

        // TODO: test validations
    }
    
    /**
     * Get all members of a project
     *
     * 
     */
    @Test
    public void getMembersOfProjectTest()  {
        Integer projectId = null;
        Integer page = null;
        Integer pageSize = null;
        MemberReferenceSearchResult response = api.getMembersOfProject(projectId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get project
     *
     * 
     */
    @Test
    public void getProjectByIdTest()  {
        Integer projectId = null;
        Project response = api.getProjectById(projectId);

        // TODO: test validations
    }
    
    /**
     * Get all roles the user has on a project
     *
     * 
     */
    @Test
    public void getProjectRolesOfMemberTest()  {
        Integer projectId = null;
        Integer userId = null;
        ProjectMemberPermissions response = api.getProjectRolesOfMember(projectId, userId);

        // TODO: test validations
    }
    
    /**
     * Get projects
     *
     * 
     */
    @Test
    public void getProjectsTest()  {
        List<ProjectReference> response = api.getProjects();

        // TODO: test validations
    }
    
    /**
     * Get wiki pages of a project
     *
     * 
     */
    @Test
    public void getTopLevelWikiPagesTest()  {
        Integer projectId = null;
        WikiOutlineSearchResult response = api.getTopLevelWikiPages(projectId);

        // TODO: test validations
    }
    
    /**
     * Get trackers
     *
     * 
     */
    @Test
    public void getTrackersTest()  {
        Integer projectId = null;
        List<TrackerReference> response = api.getTrackers(projectId);

        // TODO: test validations
    }
    
    /**
     * Get the list of all trackers in a project
     *
     * 
     */
    @Test
    public void searchAllTrackersInProjectTest()  {
        Integer projectId = null;
        TrackerFilteringRequest trackerFilteringRequest = null;
        TrackerSearchResult response = api.searchAllTrackersInProject(projectId, trackerFilteringRequest);

        // TODO: test validations
    }
    
    /**
     * Search projects by given criteria
     *
     * 
     */
    @Test
    public void searchProjectsTest()  {
        ProjectFilteringRequest projectFilteringRequest = null;
        ProjectSearchResult response = api.searchProjects(projectFilteringRequest);

        // TODO: test validations
    }
    
}
