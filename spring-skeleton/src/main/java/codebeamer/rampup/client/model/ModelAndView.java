

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;

/**
 * ModelAndView
 */
@JsonPropertyOrder({
  ModelAndView.JSON_PROPERTY_VIEW,
  ModelAndView.JSON_PROPERTY_MODEL,
  ModelAndView.JSON_PROPERTY_STATUS,
  ModelAndView.JSON_PROPERTY_VIEW_NAME,
  ModelAndView.JSON_PROPERTY_REFERENCE,
  ModelAndView.JSON_PROPERTY_MODEL_MAP,
  ModelAndView.JSON_PROPERTY_EMPTY
})
public class ModelAndView {
  public static final String JSON_PROPERTY_VIEW = "view";
  private View view;

  public static final String JSON_PROPERTY_MODEL = "model";
  private Map<String, Object> model = new HashMap<>();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    _100_CONTINUE("100 CONTINUE"),
    
    _101_SWITCHING_PROTOCOLS("101 SWITCHING_PROTOCOLS"),
    
    _102_PROCESSING("102 PROCESSING"),
    
    _103_CHECKPOINT("103 CHECKPOINT"),
    
    _200_OK("200 OK"),
    
    _201_CREATED("201 CREATED"),
    
    _202_ACCEPTED("202 ACCEPTED"),
    
    _203_NON_AUTHORITATIVE_INFORMATION("203 NON_AUTHORITATIVE_INFORMATION"),
    
    _204_NO_CONTENT("204 NO_CONTENT"),
    
    _205_RESET_CONTENT("205 RESET_CONTENT"),
    
    _206_PARTIAL_CONTENT("206 PARTIAL_CONTENT"),
    
    _207_MULTI_STATUS("207 MULTI_STATUS"),
    
    _208_ALREADY_REPORTED("208 ALREADY_REPORTED"),
    
    _226_IM_USED("226 IM_USED"),
    
    _300_MULTIPLE_CHOICES("300 MULTIPLE_CHOICES"),
    
    _301_MOVED_PERMANENTLY("301 MOVED_PERMANENTLY"),
    
    _302_FOUND("302 FOUND"),
    
    _302_MOVED_TEMPORARILY("302 MOVED_TEMPORARILY"),
    
    _303_SEE_OTHER("303 SEE_OTHER"),
    
    _304_NOT_MODIFIED("304 NOT_MODIFIED"),
    
    _305_USE_PROXY("305 USE_PROXY"),
    
    _307_TEMPORARY_REDIRECT("307 TEMPORARY_REDIRECT"),
    
    _308_PERMANENT_REDIRECT("308 PERMANENT_REDIRECT"),
    
    _400_BAD_REQUEST("400 BAD_REQUEST"),
    
    _401_UNAUTHORIZED("401 UNAUTHORIZED"),
    
    _402_PAYMENT_REQUIRED("402 PAYMENT_REQUIRED"),
    
    _403_FORBIDDEN("403 FORBIDDEN"),
    
    _404_NOT_FOUND("404 NOT_FOUND"),
    
    _405_METHOD_NOT_ALLOWED("405 METHOD_NOT_ALLOWED"),
    
    _406_NOT_ACCEPTABLE("406 NOT_ACCEPTABLE"),
    
    _407_PROXY_AUTHENTICATION_REQUIRED("407 PROXY_AUTHENTICATION_REQUIRED"),
    
    _408_REQUEST_TIMEOUT("408 REQUEST_TIMEOUT"),
    
    _409_CONFLICT("409 CONFLICT"),
    
    _410_GONE("410 GONE"),
    
    _411_LENGTH_REQUIRED("411 LENGTH_REQUIRED"),
    
    _412_PRECONDITION_FAILED("412 PRECONDITION_FAILED"),
    
    _413_PAYLOAD_TOO_LARGE("413 PAYLOAD_TOO_LARGE"),
    
    _413_REQUEST_ENTITY_TOO_LARGE("413 REQUEST_ENTITY_TOO_LARGE"),
    
    _414_URI_TOO_LONG("414 URI_TOO_LONG"),
    
    _414_REQUEST_URI_TOO_LONG("414 REQUEST_URI_TOO_LONG"),
    
    _415_UNSUPPORTED_MEDIA_TYPE("415 UNSUPPORTED_MEDIA_TYPE"),
    
    _416_REQUESTED_RANGE_NOT_SATISFIABLE("416 REQUESTED_RANGE_NOT_SATISFIABLE"),
    
    _417_EXPECTATION_FAILED("417 EXPECTATION_FAILED"),
    
    _418_I_AM_A_TEAPOT("418 I_AM_A_TEAPOT"),
    
    _419_INSUFFICIENT_SPACE_ON_RESOURCE("419 INSUFFICIENT_SPACE_ON_RESOURCE"),
    
    _420_METHOD_FAILURE("420 METHOD_FAILURE"),
    
    _421_DESTINATION_LOCKED("421 DESTINATION_LOCKED"),
    
    _422_UNPROCESSABLE_ENTITY("422 UNPROCESSABLE_ENTITY"),
    
    _423_LOCKED("423 LOCKED"),
    
    _424_FAILED_DEPENDENCY("424 FAILED_DEPENDENCY"),
    
    _425_TOO_EARLY("425 TOO_EARLY"),
    
    _426_UPGRADE_REQUIRED("426 UPGRADE_REQUIRED"),
    
    _428_PRECONDITION_REQUIRED("428 PRECONDITION_REQUIRED"),
    
    _429_TOO_MANY_REQUESTS("429 TOO_MANY_REQUESTS"),
    
    _431_REQUEST_HEADER_FIELDS_TOO_LARGE("431 REQUEST_HEADER_FIELDS_TOO_LARGE"),
    
    _451_UNAVAILABLE_FOR_LEGAL_REASONS("451 UNAVAILABLE_FOR_LEGAL_REASONS"),
    
    _500_INTERNAL_SERVER_ERROR("500 INTERNAL_SERVER_ERROR"),
    
    _501_NOT_IMPLEMENTED("501 NOT_IMPLEMENTED"),
    
    _502_BAD_GATEWAY("502 BAD_GATEWAY"),
    
    _503_SERVICE_UNAVAILABLE("503 SERVICE_UNAVAILABLE"),
    
    _504_GATEWAY_TIMEOUT("504 GATEWAY_TIMEOUT"),
    
    _505_HTTP_VERSION_NOT_SUPPORTED("505 HTTP_VERSION_NOT_SUPPORTED"),
    
    _506_VARIANT_ALSO_NEGOTIATES("506 VARIANT_ALSO_NEGOTIATES"),
    
    _507_INSUFFICIENT_STORAGE("507 INSUFFICIENT_STORAGE"),
    
    _508_LOOP_DETECTED("508 LOOP_DETECTED"),
    
    _509_BANDWIDTH_LIMIT_EXCEEDED("509 BANDWIDTH_LIMIT_EXCEEDED"),
    
    _510_NOT_EXTENDED("510 NOT_EXTENDED"),
    
    _511_NETWORK_AUTHENTICATION_REQUIRED("511 NETWORK_AUTHENTICATION_REQUIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_VIEW_NAME = "viewName";
  private String viewName;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private Boolean reference;

  public static final String JSON_PROPERTY_MODEL_MAP = "modelMap";
  private ModelAndViewModelMap modelMap;

  public static final String JSON_PROPERTY_EMPTY = "empty";
  private Boolean empty;

  public ModelAndView() {
  }

  public ModelAndView view(View view) {
    
    this.view = view;
    return this;
  }

   /**
   * Get view
   * @return view
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public View getView() {
    return view;
  }


  @JsonProperty(JSON_PROPERTY_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setView(View view) {
    this.view = view;
  }


  public ModelAndView model(Map<String, Object> model) {
    
    this.model = model;
    return this;
  }

  public ModelAndView putModelItem(String key, Object modelItem) {
    if (this.model == null) {
      this.model = new HashMap<>();
    }
    this.model.put(key, modelItem);
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getModel() {
    return model;
  }


  @JsonProperty(JSON_PROPERTY_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModel(Map<String, Object> model) {
    this.model = model;
  }


  public ModelAndView status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ModelAndView viewName(String viewName) {
    
    this.viewName = viewName;
    return this;
  }

   /**
   * Get viewName
   * @return viewName
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getViewName() {
    return viewName;
  }


  @JsonProperty(JSON_PROPERTY_VIEW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }


  public ModelAndView reference(Boolean reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(Boolean reference) {
    this.reference = reference;
  }


  public ModelAndView modelMap(ModelAndViewModelMap modelMap) {
    
    this.modelMap = modelMap;
    return this;
  }

   /**
   * Get modelMap
   * @return modelMap
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ModelAndViewModelMap getModelMap() {
    return modelMap;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelMap(ModelAndViewModelMap modelMap) {
    this.modelMap = modelMap;
  }


  public ModelAndView empty(Boolean empty) {
    
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmpty() {
    return empty;
  }


  @JsonProperty(JSON_PROPERTY_EMPTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelAndView modelAndView = (ModelAndView) o;
    return Objects.equals(this.view, modelAndView.view) &&
        Objects.equals(this.model, modelAndView.model) &&
        Objects.equals(this.status, modelAndView.status) &&
        Objects.equals(this.viewName, modelAndView.viewName) &&
        Objects.equals(this.reference, modelAndView.reference) &&
        Objects.equals(this.modelMap, modelAndView.modelMap) &&
        Objects.equals(this.empty, modelAndView.empty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, model, status, viewName, reference, modelMap, empty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelAndView {\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    viewName: ").append(toIndentedString(viewName)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    modelMap: ").append(toIndentedString(modelMap)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

