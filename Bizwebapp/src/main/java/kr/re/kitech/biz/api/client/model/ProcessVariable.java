
package kr.re.kitech.biz.api.client.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_readOnly",
    "_displayName",
    "_name",
    "_direction",
    "_type",
    "values"
})
@Generated("jsonschema2pojo")
public class ProcessVariable implements Serializable
{

    @JsonProperty("_readOnly")
    private Boolean readOnly;
    @JsonProperty("_displayName")
    private String displayName;
    @JsonProperty("_name")
    private String name;
    @JsonProperty("_direction")
    private String direction;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("values")
    private Object values;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4818303034132298642L;

    @JsonProperty("_readOnly")
    public Boolean getReadOnly() {
        return readOnly;
    }

    @JsonProperty("_readOnly")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ProcessVariable withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @JsonProperty("_displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("_displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ProcessVariable withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("_name")
    public String getName() {
        return name;
    }

    @JsonProperty("_name")
    public void setName(String name) {
        this.name = name;
    }

    public ProcessVariable withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("_direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("_direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ProcessVariable withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    @JsonProperty("_type")
    public String getType() {
        return type;
    }

    @JsonProperty("_type")
    public void setType(String type) {
        this.type = type;
    }

    public ProcessVariable withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("values")
    public Object getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(Object values) {
        this.values = values;
    }

    public ProcessVariable withValues(Object values) {
        this.values = values;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ProcessVariable withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessVariable.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("readOnly");
        sb.append('=');
        sb.append(((this.readOnly == null)?"<null>":this.readOnly));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("direction");
        sb.append('=');
        sb.append(((this.direction == null)?"<null>":this.direction));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null)?"<null>":this.values));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
