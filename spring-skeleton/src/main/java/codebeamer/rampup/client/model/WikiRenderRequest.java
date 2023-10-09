

package codebeamer.rampup.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Request model to render a wiki page in a specific context
 */
@JsonPropertyOrder({
  WikiRenderRequest.JSON_PROPERTY_CONTEXT_ID,
  WikiRenderRequest.JSON_PROPERTY_CONTEXT_VERSION,
  WikiRenderRequest.JSON_PROPERTY_RENDERING_CONTEXT_TYPE,
  WikiRenderRequest.JSON_PROPERTY_MARKUP
})
public class WikiRenderRequest {
  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private Integer contextId;

  public static final String JSON_PROPERTY_CONTEXT_VERSION = "contextVersion";
  private Integer contextVersion;

  /**
   * Type of the entity used as rendering context
   */
  public enum RenderingContextTypeEnum {
    TRACKER_ITEM("TRACKER_ITEM"),
    
    WIKI("WIKI");

    private String value;

    RenderingContextTypeEnum(String value) {
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
    public static RenderingContextTypeEnum fromValue(String value) {
      for (RenderingContextTypeEnum b : RenderingContextTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RENDERING_CONTEXT_TYPE = "renderingContextType";
  private RenderingContextTypeEnum renderingContextType;

  public static final String JSON_PROPERTY_MARKUP = "markup";
  private String markup;

  public WikiRenderRequest() {
  }

  public WikiRenderRequest contextId(Integer contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * Id of the entity used as rendering context
   * @return contextId
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(Integer contextId) {
    this.contextId = contextId;
  }


  public WikiRenderRequest contextVersion(Integer contextVersion) {
    
    this.contextVersion = contextVersion;
    return this;
  }

   /**
   * Version of the entity used as rendering context
   * @return contextVersion
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_CONTEXT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getContextVersion() {
    return contextVersion;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextVersion(Integer contextVersion) {
    this.contextVersion = contextVersion;
  }


  public WikiRenderRequest renderingContextType(RenderingContextTypeEnum renderingContextType) {
    
    this.renderingContextType = renderingContextType;
    return this;
  }

   /**
   * Type of the entity used as rendering context
   * @return renderingContextType
  **/
  @Nullable
  @JsonProperty(JSON_PROPERTY_RENDERING_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RenderingContextTypeEnum getRenderingContextType() {
    return renderingContextType;
  }


  @JsonProperty(JSON_PROPERTY_RENDERING_CONTEXT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRenderingContextType(RenderingContextTypeEnum renderingContextType) {
    this.renderingContextType = renderingContextType;
  }


  public WikiRenderRequest markup(String markup) {
    
    this.markup = markup;
    return this;
  }

   /**
   * Wiki markup to render as HTML
   * @return markup
  **/
  @NonNull
  @JsonProperty(JSON_PROPERTY_MARKUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMarkup() {
    return markup;
  }


  @JsonProperty(JSON_PROPERTY_MARKUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarkup(String markup) {
    this.markup = markup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiRenderRequest wikiRenderRequest = (WikiRenderRequest) o;
    return Objects.equals(this.contextId, wikiRenderRequest.contextId) &&
        Objects.equals(this.contextVersion, wikiRenderRequest.contextVersion) &&
        Objects.equals(this.renderingContextType, wikiRenderRequest.renderingContextType) &&
        Objects.equals(this.markup, wikiRenderRequest.markup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, contextVersion, renderingContextType, markup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiRenderRequest {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextVersion: ").append(toIndentedString(contextVersion)).append("\n");
    sb.append("    renderingContextType: ").append(toIndentedString(renderingContextType)).append("\n");
    sb.append("    markup: ").append(toIndentedString(markup)).append("\n");
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

