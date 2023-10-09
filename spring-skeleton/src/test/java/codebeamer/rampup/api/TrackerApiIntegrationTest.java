package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
import codebeamer.rampup.client.invoker.AppConfiguration;
import codebeamer.rampup.client.invoker.DatetimeDeserializeConfiguration;
import codebeamer.rampup.client.invoker.auth.HttpBasicAuth;
import codebeamer.rampup.client.model.AbstractField;
import codebeamer.rampup.client.model.FieldReference;
import codebeamer.rampup.client.model.Project;
import codebeamer.rampup.client.model.ProjectReference;
import codebeamer.rampup.client.model.Tracker;
import codebeamer.rampup.client.model.TrackerFilteringRequest;
import codebeamer.rampup.client.model.TrackerReference;
import codebeamer.rampup.client.model.TrackerSearchResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {DatetimeDeserializeConfiguration.class,
        /* ApiClient.class, */AppConfiguration.class,
        ProjectApi.class, TrackerApi.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class TrackerApiIntegrationTest {

    @Autowired
    ApiClient apiClient;

    @Autowired
    private ProjectApi projectApi;
    @Autowired
    private TrackerApi trackerApi;

    @BeforeAll
    public void setup() {

//        String baseUrl = "http://localhost:8070/api";
        // ApiClient apiClient = new ApiClient(baseUrl);
//        apiClient.setBasePath(baseUrl);

        HttpBasicAuth BasicAuth = (HttpBasicAuth) apiClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("bond");
        BasicAuth.setPassword("007");

//        projectApi = new ProjectApi(apiClient);
//        trackerApi = new TrackerApi(apiClient);
    }

    @Test
    public void trackerLifecycleTest() {

        List<ProjectReference> projects = projectApi.getProjects();
        Integer projectId = projects.get(0).getId();

        Project projectById = projectApi.getProjectById(projectId);

        Tracker newTracker = createTracker(projectId);

        // Assert that tracker was created
        List<TrackerReference> trackers = getTrackers(projectId);
        trackers.stream().filter(t -> t.getId().equals(newTracker.getId())).findFirst().orElseThrow();

        // Assert that tracker values are stored correctly
        Tracker retreivedTracker = getTracker(newTracker.getId());
        assertEquals(newTracker, retreivedTracker);

        deleteTracker(newTracker.getId());
        trackers = getTrackers(projectId);
        boolean isDeleted = trackers.stream().noneMatch(t -> t.getId().equals(newTracker.getId()));
        assertTrue(isDeleted);

    }

    public Tracker createTracker(Integer projectId) {
        Integer templateId = null;

        Tracker tracker = new Tracker();
        tracker.setAvailableAsTemplate(true);
        tracker.setDescription("Tracker description");
        tracker.setId(1);
        tracker.setName("Tracker name");
        tracker.setUsingWorkflow(false);
        tracker.setKeyName("trackey");
        tracker.setDeleted(false);
        Tracker createdTracker = projectApi.createTracker(projectId, templateId, tracker);
        return createdTracker;
    }

    public Tracker getTracker(Integer trackerId) {
        Tracker tracker = trackerApi.getTracker(trackerId);
        return tracker;
    }

    public List<TrackerReference> getTrackers(Integer projectId) {
        List<TrackerReference> trackerReferences = projectApi.getTrackers(projectId);
        return trackerReferences;
    }

    //    @Test
    public void searchAllTrackersInProjectTest() {
        Integer projectId = 1;
        TrackerFilteringRequest trackerFilteringRequest = null;
        TrackerSearchResult response = projectApi.searchAllTrackersInProject(projectId, trackerFilteringRequest);

        // TODO: test validations
    }


    public void deleteTracker(Integer trackerId) {
        trackerApi.deleteTracker(trackerId);
    }


    @Test
    public void getTrackerFieldTest() {
        Integer trackerId = null;
        Integer fieldId = null;
        AbstractField response = trackerApi.getTrackerField(trackerId, fieldId);

        // TODO: test validations
    }

    @Test
    public void getTrackerFieldsTest() {
        Integer trackerId = null;
        List<FieldReference> response = trackerApi.getTrackerFields(trackerId);

        // TODO: test validations
    }

}
