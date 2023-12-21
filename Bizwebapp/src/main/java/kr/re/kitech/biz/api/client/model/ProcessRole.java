
package kr.re.kitech.biz.api.client.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "_name",
    "_displayName",
    "roleMapping"
})
@Generated("jsonschema2pojo")
public class ProcessRole implements Serializable
{

    @JsonProperty("_name")
    private String name;
    @JsonProperty("_displayName")
    private Object displayName;
    @JsonProperty("roleMapping")
    private List<RoleMapping> roleMapping = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8259173209795464208L;

    @JsonProperty("_name")
    public String getName() {
        return name;
    }

    @JsonProperty("_name")
    public void setName(String name) {
        this.name = name;
    }

    public ProcessRole withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("_displayName")
    public Object getDisplayName() {
        return displayName;
    }

    @JsonProperty("_displayName")
    public void setDisplayName(Object displayName) {
        this.displayName = displayName;
    }

    public ProcessRole withDisplayName(Object displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("roleMapping")
    public List<RoleMapping> getRoleMapping() {
        return roleMapping;
    }

    @JsonProperty("roleMapping")
    public void setRoleMapping(List<RoleMapping> roleMapping) {
        this.roleMapping = roleMapping;
    }

    public ProcessRole withRoleMapping(List<RoleMapping> roleMapping) {
        this.roleMapping = roleMapping;
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

    public ProcessRole withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessRole.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("roleMapping");
        sb.append('=');
        sb.append(((this.roleMapping == null)?"<null>":this.roleMapping));
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
