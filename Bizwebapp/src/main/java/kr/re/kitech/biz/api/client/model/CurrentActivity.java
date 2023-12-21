
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
	"_taskId",
    "_trcTag",
    "_name",
    "_status",
    "_scrUrl",
    "_ext2",
    "_isRacing",
    "_arbitraryApprovable",
    "apprType",
    "role",
    "_rolee",
    "autoApproval"
})
@Generated("jsonschema2pojo")
public class CurrentActivity implements Serializable
{

	@JsonProperty("_taskId")
    private String taskId;
    @JsonProperty("_trcTag")
    private String trcTag;
    @JsonProperty("_name")
    private String name;
    @JsonProperty("_status")
    private String status;
    @JsonProperty("_scrUrl")
    private String scrUrl;
    @JsonProperty("_ext2")
    private String ext2;
    @JsonProperty("_isRacing")
    private Boolean isRacing;
    @JsonProperty("_arbitraryApprovable")
    private Boolean arbitraryApprovable;
    @JsonProperty("apprType")
    private String apprType;
    @JsonProperty("role")
    private Role role;
    @JsonProperty("_role")
    private Role rolee;
    @JsonProperty("autoApproval")
    private String autoApproval;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6913584083726978604L;
    
    @JsonProperty("_taskId")
    public String getTaskId() {
        return taskId;
    }

    @JsonProperty("_taskId")
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CurrentActivity withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    @JsonProperty("_trcTag")
    public String getTrcTag() {
        return trcTag;
    }

    @JsonProperty("_trcTag")
    public void setTrcTag(String trcTag) {
        this.trcTag = trcTag;
    }

    public CurrentActivity withTrcTag(String trcTag) {
        this.trcTag = trcTag;
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

    public CurrentActivity withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("_status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("_status")
    public void setStatus(String status) {
        this.status = status;
    }

    public CurrentActivity withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("_scrUrl")
    public String getScrUrl() {
        return scrUrl;
    }

    @JsonProperty("_scrUrl")
    public void setScrUrl(String scrUrl) {
        this.scrUrl = scrUrl;
    }

    public CurrentActivity withScrUrl(String scrUrl) {
        this.scrUrl = scrUrl;
        return this;
    }

    @JsonProperty("_ext2")
    public String getExt2() {
        return ext2;
    }

    @JsonProperty("_ext2")
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public CurrentActivity withExt2(String ext2) {
        this.ext2 = ext2;
        return this;
    }

    @JsonProperty("_isRacing")
    public Boolean getIsRacing() {
        return isRacing;
    }

    @JsonProperty("_isRacing")
    public void setIsRacing(Boolean isRacing) {
        this.isRacing = isRacing;
    }

    public CurrentActivity withIsRacing(Boolean isRacing) {
        this.isRacing = isRacing;
        return this;
    }

    @JsonProperty("_arbitraryApprovable")
    public Boolean getArbitraryApprovable() {
        return arbitraryApprovable;
    }

    @JsonProperty("_arbitraryApprovable")
    public void setArbitraryApprovable(Boolean arbitraryApprovable) {
        this.arbitraryApprovable = arbitraryApprovable;
    }

    public CurrentActivity withArbitraryApprovable(Boolean arbitraryApprovable) {
        this.arbitraryApprovable = arbitraryApprovable;
        return this;
    }

    @JsonProperty("apprType")
    public String getApprType() {
        return apprType;
    }

    @JsonProperty("apprType")
    public void setApprType(String apprType) {
        this.apprType = apprType;
    }

    public CurrentActivity withApprType(String apprType) {
        this.apprType = apprType;
        return this;
    }

    @JsonProperty("role")
    public Role getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(Role role) {
        this.role = role;
    }

    public CurrentActivity withRole(Role role) {
        this.role = role;
        return this;
    }

    @JsonProperty("_rolee")
    public Role getRolee() {
        return rolee;
    }

    @JsonProperty("_rolee")
    public void setRolee(Role rolee) {
        this.rolee = rolee;
    }

    public CurrentActivity withRolee(Role rolee) {
        this.rolee = rolee;
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

    public CurrentActivity withAutoApproval(String autoApproval) {
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

    public CurrentActivity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrentActivity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("taskId");
        sb.append('=');
        sb.append(((this.taskId == null)?"<null>":this.taskId));
        sb.append(',');
        sb.append("trcTag");
        sb.append('=');
        sb.append(((this.trcTag == null)?"<null>":this.trcTag));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("scrUrl");
        sb.append('=');
        sb.append(((this.scrUrl == null)?"<null>":this.scrUrl));
        sb.append(',');
        sb.append("ext2");
        sb.append('=');
        sb.append(((this.ext2 == null)?"<null>":this.ext2));
        sb.append(',');
        sb.append("isRacing");
        sb.append('=');
        sb.append(((this.isRacing == null)?"<null>":this.isRacing));
        sb.append(',');
        sb.append("arbitraryApprovable");
        sb.append('=');
        sb.append(((this.arbitraryApprovable == null)?"<null>":this.arbitraryApprovable));
        sb.append(',');
        sb.append("apprType");
        sb.append('=');
        sb.append(((this.apprType == null)?"<null>":this.apprType));
        sb.append(',');
        sb.append("role");
        sb.append('=');
        sb.append(((this.role == null)?"<null>":this.role));
        sb.append(',');
        sb.append("rolee");
        sb.append('=');
        sb.append(((this.rolee == null)?"<null>":this.rolee));
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
