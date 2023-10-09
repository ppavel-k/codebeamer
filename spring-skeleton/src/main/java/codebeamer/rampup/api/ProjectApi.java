package codebeamer.rampup.api;

import codebeamer.rampup.client.invoker.ApiClient;
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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientResponseException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class ProjectApi {
    private ApiClient apiClient;

    @Autowired
    public ProjectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a tracker
     * 
     * <p><b>403</b> - Bad request: Tracker settings validation failed.
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param projectId The projectId parameter
     * @param templateId Identifier of the template tracker.
     * @param tracker The tracker parameter
     * @return Tracker

     */
    private RestClient.ResponseSpec createTrackerRequestCreation(Integer projectId, Integer templateId, Tracker tracker) throws RestClientResponseException {
        Object postBody = tracker;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling createTracker", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "templateId", templateId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/trackers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Create a tracker
     * 
     * <p><b>403</b> - Bad request: Tracker settings validation failed.
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param projectId The projectId parameter
     * @param templateId Identifier of the template tracker.
     * @param tracker The tracker parameter
     * @return Tracker

     */
    public Tracker createTracker(Integer projectId, Integer templateId, Tracker tracker) throws RestClientResponseException {
        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<>() {
        };
        return createTrackerRequestCreation(projectId, templateId, tracker).body(localVarReturnType);
    }

    /**
     * Create a tracker
     *
     * <p><b>403</b> - Bad request: Tracker settings validation failed.
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     *
     * @param projectId  The projectId parameter
     * @param templateId Identifier of the template tracker.
     * @param tracker    The tracker parameter
     * @return ResponseEntity&lt;Tracker&gt;
     */
    public RestClient.ResponseSpec createTrackerWithHttpInfo(Integer projectId, Integer templateId, Tracker tracker) throws RestClientResponseException {
        ParameterizedTypeReference<Tracker> localVarReturnType = new ParameterizedTypeReference<Tracker>() {};
        return createTrackerRequestCreation(projectId, templateId, tracker);
    }

    /**
     * Create a tracker
     * 
     * <p><b>403</b> - Bad request: Tracker settings validation failed.
     * <p><b>200</b> - Tracker settings
     * <p><b>404</b> - Tracker not found
     * <p><b>429</b> - Too many requests
     * @param projectId The projectId parameter
     * @param templateId Identifier of the template tracker.
     * @param tracker The tracker parameter

     */
    public RestClient.ResponseSpec createTrackerWithResponseSpec(Integer projectId, Integer templateId, Tracker tracker) throws RestClientResponseException {
        return createTrackerRequestCreation(projectId, templateId, tracker);
    }
    /**
     * Deploy a project configuration to a Project
     * The configuration file needs to be uploaded to codebeamer Documents
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Error when deploying the project configuration.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project or configuration file not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Project configuration deployed
     * @param deployProject The deployProject parameter
     * @return Project

     */
    private RestClient.ResponseSpec deployConfigurationRequestCreation(DeployProject deployProject) throws RestClientResponseException {
        Object postBody = deployProject;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI("/v3/projects/deploy", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Deploy a project configuration to a Project
     * The configuration file needs to be uploaded to codebeamer Documents
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Error when deploying the project configuration.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project or configuration file not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Project configuration deployed
     * @param deployProject The deployProject parameter
     * @return Project

     */
    public Project deployConfiguration(DeployProject deployProject) throws RestClientResponseException {
        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<Project>() {};
        return deployConfigurationRequestCreation(deployProject).body(localVarReturnType);
    }

    /**
     * Deploy a project configuration to a Project
     * The configuration file needs to be uploaded to codebeamer Documents
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Error when deploying the project configuration.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project or configuration file not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Project configuration deployed
     *
     * @param deployProject The deployProject parameter
     * @return ResponseEntity&lt;Project&gt;
     */
    public RestClient.ResponseSpec deployConfigurationWithHttpInfo(DeployProject deployProject) throws RestClientResponseException {
        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<Project>() {};
        return deployConfigurationRequestCreation(deployProject);
    }

    /**
     * Deploy a project configuration to a Project
     * The configuration file needs to be uploaded to codebeamer Documents
     * <p><b>403</b> - Authentication is required
     * <p><b>500</b> - Error when deploying the project configuration.
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project or configuration file not found
     * <p><b>400</b> - Request cannot be processed
     * <p><b>200</b> - Project configuration deployed
     * @param deployProject The deployProject parameter

     */
    public RestClient.ResponseSpec deployConfigurationWithResponseSpec(DeployProject deployProject) throws RestClientResponseException {
        return deployConfigurationRequestCreation(deployProject);
    }
    /**
     * Get all members of a project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return MemberReferenceSearchResult

     */
    private RestClient.ResponseSpec getMembersOfProjectRequestCreation(Integer projectId, Integer page, Integer pageSize) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling getMembersOfProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<MemberReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<MemberReferenceSearchResult>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/members", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get all members of a project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500
     * @return MemberReferenceSearchResult

     */
    public MemberReferenceSearchResult getMembersOfProject(Integer projectId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<MemberReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<MemberReferenceSearchResult>() {};
        return getMembersOfProjectRequestCreation(projectId, page, pageSize).body(localVarReturnType);
    }

    /**
     * Get all members of a project
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     *
     * @param projectId The projectId parameter
     * @param page      Index of the result page starting from 1.
     * @param pageSize  Number of items in a result page. Max value: 500
     * @return ResponseEntity&lt;MemberReferenceSearchResult&gt;
     */
    public RestClient.ResponseSpec getMembersOfProjectWithHttpInfo(Integer projectId, Integer page, Integer pageSize) throws RestClientResponseException {
        ParameterizedTypeReference<MemberReferenceSearchResult> localVarReturnType = new ParameterizedTypeReference<MemberReferenceSearchResult>() {};
        return getMembersOfProjectRequestCreation(projectId, page, pageSize);
    }

    /**
     * Get all members of a project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project is not found
     * <p><b>200</b> - Member by id
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @param page Index of the result page starting from 1.
     * @param pageSize Number of items in a result page. Max value: 500

     */
    public RestClient.ResponseSpec getMembersOfProjectWithResponseSpec(Integer projectId, Integer page, Integer pageSize) throws RestClientResponseException {
        return getMembersOfProjectRequestCreation(projectId, page, pageSize);
    }
    /**
     * Get project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Project
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @return Project

     */
    private RestClient.ResponseSpec getProjectByIdRequestCreation(Integer projectId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling getProjectById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Project
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @return Project

     */
    public Project getProjectById(Integer projectId) throws RestClientResponseException {
        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<Project>() {};
        RestClient.ResponseSpec project = getProjectByIdRequestCreation(projectId);
//        return project.body(localVarReturnType);
        String body = project.body(String.class);
        try {
            ObjectMapper objectMapper = apiClient.getObjectMapper();
            //objectMapper.canDeserialize(JavaType OffsetDateTime);
            Project project1 = objectMapper.readValue(body, Project.class);
            return project1;
        } catch (JsonProcessingException e) {
            return new Project();
        }
    }

    /**
     * Get project
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Project
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>401</b> - Authentication is required
     *
     * @param projectId The projectId parameter
     * @return ResponseEntity&lt;Project&gt;
     */
    public RestClient.ResponseSpec getProjectByIdWithHttpInfo(Integer projectId) throws RestClientResponseException {
        ParameterizedTypeReference<Project> localVarReturnType = new ParameterizedTypeReference<Project>() {};
        return getProjectByIdRequestCreation(projectId);
    }

    /**
     * Get project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>200</b> - Project
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter

     */
    public RestClient.ResponseSpec getProjectByIdWithResponseSpec(Integer projectId) throws RestClientResponseException {
        return getProjectByIdRequestCreation(projectId);
    }
    /**
     * Get all roles the user has on a project
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * <p><b>404</b> - User is not a member of the project
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @param userId The userId parameter
     * @return ProjectMemberPermissions

     */
    private RestClient.ResponseSpec getProjectRolesOfMemberRequestCreation(Integer projectId, Integer userId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling getProjectRolesOfMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new RestClientResponseException("Missing the required parameter 'userId' when calling getProjectRolesOfMember", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);
        pathParams.put("userId", userId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<ProjectMemberPermissions> localVarReturnType = new ParameterizedTypeReference<ProjectMemberPermissions>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/members/{userId}/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get all roles the user has on a project
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * <p><b>404</b> - User is not a member of the project
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @param userId The userId parameter
     * @return ProjectMemberPermissions

     */
    public ProjectMemberPermissions getProjectRolesOfMember(Integer projectId, Integer userId) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectMemberPermissions> localVarReturnType = new ParameterizedTypeReference<ProjectMemberPermissions>() {};
        return getProjectRolesOfMemberRequestCreation(projectId, userId).body(localVarReturnType);
    }

    /**
     * Get all roles the user has on a project
     *
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * <p><b>404</b> - User is not a member of the project
     * <p><b>401</b> - Authentication is required
     *
     * @param projectId The projectId parameter
     * @param userId    The userId parameter
     * @return ResponseEntity&lt;ProjectMemberPermissions&gt;
     */
    public RestClient.ResponseSpec getProjectRolesOfMemberWithHttpInfo(Integer projectId, Integer userId) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectMemberPermissions> localVarReturnType = new ParameterizedTypeReference<ProjectMemberPermissions>() {};
        return getProjectRolesOfMemberRequestCreation(projectId, userId);
    }

    /**
     * Get all roles the user has on a project
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Roles
     * <p><b>404</b> - User is not a member of the project
     * <p><b>401</b> - Authentication is required
     * @param projectId The projectId parameter
     * @param userId The userId parameter

     */
    public RestClient.ResponseSpec getProjectRolesOfMemberWithResponseSpec(Integer projectId, Integer userId) throws RestClientResponseException {
        return getProjectRolesOfMemberRequestCreation(projectId, userId);
    }
    /**
     * Get projects
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - Projects
     * <p><b>401</b> - Authentication is required
     * @return List&lt;ProjectReference&gt;

     */
    private RestClient.ResponseSpec getProjectsRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<ProjectReference> localVarReturnType = new ParameterizedTypeReference<ProjectReference>() {};
        return apiClient.invokeAPI("/v3/projects", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get projects
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - Projects
     * <p><b>401</b> - Authentication is required
     *
     * @return List&lt;ProjectReference&gt;
     */
    public List<ProjectReference> getProjects() throws RestClientResponseException {
        return getProjectsRequestCreation().body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get projects
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - Projects
     * <p><b>401</b> - Authentication is required
     * @return ResponseEntity&lt;List&lt;ProjectReference&gt;&gt;

     */
    public ResponseEntity<List<ProjectReference>> getProjectsWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<ProjectReference>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProjectsRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get projects
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>429</b> - Too many requests
     * <p><b>404</b> - Project not found
     * <p><b>200</b> - Projects
     * <p><b>401</b> - Authentication is required

     */
    public RestClient.ResponseSpec getProjectsWithResponseSpec() throws RestClientResponseException {
        return getProjectsRequestCreation();
    }
    /**
     * Get wiki pages of a project
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The project does not exists
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The list of wiki pages
     * @param projectId ID of the project
     * @return WikiOutlineSearchResult

     */
    private RestClient.ResponseSpec getTopLevelWikiPagesRequestCreation(Integer projectId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling getTopLevelWikiPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<WikiOutlineSearchResult> localVarReturnType = new ParameterizedTypeReference<WikiOutlineSearchResult>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/wikipages", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get wiki pages of a project
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The project does not exists
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The list of wiki pages
     * @param projectId ID of the project
     * @return WikiOutlineSearchResult

     */
    public WikiOutlineSearchResult getTopLevelWikiPages(Integer projectId) throws RestClientResponseException {
        ParameterizedTypeReference<WikiOutlineSearchResult> localVarReturnType = new ParameterizedTypeReference<WikiOutlineSearchResult>() {};
        return getTopLevelWikiPagesRequestCreation(projectId).body(localVarReturnType);
    }

    /**
     * Get wiki pages of a project
     *
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The project does not exists
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The list of wiki pages
     *
     * @param projectId ID of the project
     * @return ResponseEntity&lt;WikiOutlineSearchResult&gt;
     */
    public RestClient.ResponseSpec getTopLevelWikiPagesWithHttpInfo(Integer projectId) throws RestClientResponseException {
        ParameterizedTypeReference<WikiOutlineSearchResult> localVarReturnType = new ParameterizedTypeReference<WikiOutlineSearchResult>() {};
        return getTopLevelWikiPagesRequestCreation(projectId);
    }

    /**
     * Get wiki pages of a project
     * 
     * <p><b>401</b> - Authentication is required
     * <p><b>404</b> - The project does not exists
     * <p><b>429</b> - Too many requests
     * <p><b>403</b> - Access denied
     * <p><b>200</b> - The list of wiki pages
     * @param projectId ID of the project

     */
    public RestClient.ResponseSpec getTopLevelWikiPagesWithResponseSpec(Integer projectId) throws RestClientResponseException {
        return getTopLevelWikiPagesRequestCreation(projectId);
    }
    /**
     * Get trackers
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     * @param projectId The projectId parameter
     * @return List&lt;TrackerReference&gt;

     */
    private RestClient.ResponseSpec getTrackersRequestCreation(Integer projectId) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling getTrackers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerReference> localVarReturnType = new ParameterizedTypeReference<TrackerReference>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/trackers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get trackers
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     *
     * @param projectId The projectId parameter
     * @return List&lt;TrackerReference&gt;
     */
    public List<TrackerReference> getTrackers(Integer projectId) throws RestClientResponseException {
        return getTrackersRequestCreation(projectId).body(new ParameterizedTypeReference<>() {
        });
    }

    /**
     * Get trackers
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     * @param projectId The projectId parameter
     * @return ResponseEntity&lt;List&lt;TrackerReference&gt;&gt;

     */
    public ResponseEntity<List<TrackerReference>> getTrackersWithHttpInfo(Integer projectId) throws RestClientResponseException {
        ParameterizedTypeReference<List<TrackerReference>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getTrackersRequestCreation(projectId).toEntity(localVarReturnType);
    }

    /**
     * Get trackers
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     * @param projectId The projectId parameter

     */
    public RestClient.ResponseSpec getTrackersWithResponseSpec(Integer projectId) throws RestClientResponseException {
        return getTrackersRequestCreation(projectId);
    }
    /**
     * Get the list of all trackers in a project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     * @param projectId The projectId parameter
     * @param trackerFilteringRequest The trackerFilteringRequest parameter
     * @return TrackerSearchResult

     */
    private RestClient.ResponseSpec searchAllTrackersInProjectRequestCreation(Integer projectId, TrackerFilteringRequest trackerFilteringRequest) throws RestClientResponseException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new RestClientResponseException("Missing the required parameter 'projectId' when calling searchAllTrackersInProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectId", projectId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<TrackerSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerSearchResult>() {};
        return apiClient.invokeAPI("/v3/projects/{projectId}/trackers/search", HttpMethod.POST, pathParams, queryParams, trackerFilteringRequest, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Get the list of all trackers in a project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     * @param projectId The projectId parameter
     * @param trackerFilteringRequest The trackerFilteringRequest parameter
     * @return TrackerSearchResult

     */
    public TrackerSearchResult searchAllTrackersInProject(Integer projectId, TrackerFilteringRequest trackerFilteringRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerSearchResult> localVarReturnType = new ParameterizedTypeReference<>() {
        };
        return searchAllTrackersInProjectRequestCreation(projectId, trackerFilteringRequest).body(localVarReturnType);
    }

    /**
     * Get the list of all trackers in a project
     *
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     *
     * @param projectId               The projectId parameter
     * @param trackerFilteringRequest The trackerFilteringRequest parameter
     * @return ResponseEntity&lt;TrackerSearchResult&gt;
     */
    public RestClient.ResponseSpec searchAllTrackersInProjectWithHttpInfo(Integer projectId, TrackerFilteringRequest trackerFilteringRequest) throws RestClientResponseException {
        ParameterizedTypeReference<TrackerSearchResult> localVarReturnType = new ParameterizedTypeReference<TrackerSearchResult>() {};
        return searchAllTrackersInProjectRequestCreation(projectId, trackerFilteringRequest);
    }

    /**
     * Get the list of all trackers in a project
     * 
     * <p><b>403</b> - Authentication is required
     * <p><b>404</b> - Project / Tracker not found
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - Trackers
     * @param projectId The projectId parameter
     * @param trackerFilteringRequest The trackerFilteringRequest parameter

     */
    public RestClient.ResponseSpec searchAllTrackersInProjectWithResponseSpec(Integer projectId, TrackerFilteringRequest trackerFilteringRequest) throws RestClientResponseException {
        return searchAllTrackersInProjectRequestCreation(projectId, trackerFilteringRequest);
    }
    /**
     * Search projects by given criteria
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - One page of projects
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param projectFilteringRequest The projectFilteringRequest parameter
     * @return ProjectSearchResult

     */
    private RestClient.ResponseSpec searchProjectsRequestCreation(ProjectFilteringRequest projectFilteringRequest) throws RestClientResponseException {
        Object postBody = projectFilteringRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth", "BearerAuth" };

        ParameterizedTypeReference<ProjectSearchResult> localVarReturnType = new ParameterizedTypeReference<ProjectSearchResult>() {};
        return apiClient.invokeAPI("/v3/projects/search", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames);
    }

    /**
     * Search projects by given criteria
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - One page of projects
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param projectFilteringRequest The projectFilteringRequest parameter
     * @return ProjectSearchResult

     */
    public ProjectSearchResult searchProjects(ProjectFilteringRequest projectFilteringRequest) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectSearchResult> localVarReturnType = new ParameterizedTypeReference<ProjectSearchResult>() {};
        return searchProjectsRequestCreation(projectFilteringRequest).body(localVarReturnType);
    }

    /**
     * Search projects by given criteria
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - One page of projects
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param projectFilteringRequest The projectFilteringRequest parameter
     * @return ResponseEntity&lt;ProjectSearchResult&gt;

     */
    public ResponseEntity<ProjectSearchResult> searchProjectsWithHttpInfo(ProjectFilteringRequest projectFilteringRequest) throws RestClientResponseException {
        ParameterizedTypeReference<ProjectSearchResult> localVarReturnType = new ParameterizedTypeReference<ProjectSearchResult>() {};
        return searchProjectsRequestCreation(projectFilteringRequest).toEntity(localVarReturnType);
    }

    /**
     * Search projects by given criteria
     * 
     * <p><b>429</b> - Too many requests
     * <p><b>200</b> - One page of projects
     * <p><b>403</b> - Access denied
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Authentication is required
     * @param projectFilteringRequest The projectFilteringRequest parameter

     */
    public RestClient.ResponseSpec searchProjectsWithResponseSpec(ProjectFilteringRequest projectFilteringRequest) throws RestClientResponseException {
        return searchProjectsRequestCreation(projectFilteringRequest);
    }
}
