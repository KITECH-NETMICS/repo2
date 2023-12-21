
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
    "endpoint",
    "endpointName",
    "assignType",
    "autoApproval"
})
@Generated("jsonschema2pojo")
public class RoleMapping implements Serializable {
	private static final long serialVersionUID = 4629577636397574320L;
	@JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("endpointName")
    private String endpointName;
    @JsonProperty("assignType")
    private Integer assignType;
    @JsonProperty("autoApproval")
    private String autoApproval;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public RoleMapping withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @JsonProperty("endpointName")
    public String getEndpointName() {
        return endpointName;
    }

    @JsonProperty("endpointName")
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public RoleMapping withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    @JsonProperty("assignType")
    public Integer getAssignType() {
        return assignType;
    }

    @JsonProperty("assignType")
    public void setAssignType(Integer assignType) {
        this.assignType = assignType;
    }

    public RoleMapping withAssignType(Integer assignType) {
        this.assignType = assignType;
        return this;
    }
    
    @JsonProperty("autoApproval")
    public String getAutoApproval() {
        return autoApproval;
    }

    @JsonProperty("autoApproval")
    public void setAutoApproval(String autoApproval) {
        this.autoApproval = autoApproval;
    }

    public RoleMapping withAutoApproval(String autoApproval) {
        this.autoApproval = autoApproval;
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

    public RoleMapping withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoleMapping.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("endpointName");
        sb.append('=');
        sb.append(((this.endpointName == null)?"<null>":this.endpointName));
        sb.append(',');
        sb.append("assignType");
        sb.append('=');
        sb.append(((this.assignType == null)?"<null>":this.assignType));
        sb.append(',');
        sb.append("autoApproval");
        sb.append('=');
        sb.append(((this.autoApproval == null)?"<null>":this.autoApproval));
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
