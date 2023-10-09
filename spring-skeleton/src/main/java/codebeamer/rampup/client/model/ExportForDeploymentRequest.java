

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * Request export for deployment
 */
@JsonPropertyOrder({
  ExportForDeploymentRequest.JSON_PROPERTY_PROJECT_SETTINGS,
  ExportForDeploymentRequest.JSON_PROPERTY_PASSWORD,
  ExportForDeploymentRequest.JSON_PROPERTY_EXPORT_FILE_NAME
})
public class ExportForDeploymentRequest {
  public static final String JSON_PROPERTY_PROJECT_SETTINGS = "projectSettings";
  private List<DeploymentProjectExportSettings> projectSettings;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_EXPORT_FILE_NAME = "exportFileName";
  private String exportFileName;

  public ExportForDeploymentRequest() {
  }

  public ExportForDeploymentRequest projectSettings(List<DeploymentProjectExportSettings> projectSettings) {
    
    this.projectSettings = projectSettings;
    return this;
  }

  public ExportForDeploymentRequest addProjectSettingsItem(DeploymentProjectExportSettings projectSettingsItem) {
    if (this.projectSettings == null) {
      this.projectSettings = new ArrayList<>();
    }
    this.projectSettings.add(projectSettingsItem);
    return this;
  }

   /**
   * Project settings
   * @return projectSettings
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PROJECT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeploymentProjectExportSettings> getProjectSettings() {
    return projectSettings;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectSettings(List<DeploymentProjectExportSettings> projectSettings) {
    this.projectSettings = projectSettings;
  }


  public ExportForDeploymentRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * A password that is used during the project encryption.
   * @return password
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public ExportForDeploymentRequest exportFileName(String exportFileName) {
    
    this.exportFileName = exportFileName;
    return this;
  }

   /**
   * Name of the resulting export file (without extension).
   * @return exportFileName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EXPORT_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExportFileName() {
    return exportFileName;
  }


  @JsonProperty(JSON_PROPERTY_EXPORT_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExportFileName(String exportFileName) {
    this.exportFileName = exportFileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportForDeploymentRequest exportForDeploymentRequest = (ExportForDeploymentRequest) o;
    return Objects.equals(this.projectSettings, exportForDeploymentRequest.projectSettings) &&
        Objects.equals(this.password, exportForDeploymentRequest.password) &&
        Objects.equals(this.exportFileName, exportForDeploymentRequest.exportFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectSettings, password, exportFileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportForDeploymentRequest {\n");
    sb.append("    projectSettings: ").append(toIndentedString(projectSettings)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    exportFileName: ").append(toIndentedString(exportFileName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

