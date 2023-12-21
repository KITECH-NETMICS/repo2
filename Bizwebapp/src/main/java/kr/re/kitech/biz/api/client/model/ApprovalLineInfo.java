
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
    "_trcTag",
    "_name",
    "_status",
    "_scrUrl",
    "_ext2",
    "_arbitraryApprovable",
    "apprType",
    "role",
    "autoApproval"
})
@Generated("jsonschema2pojo")
public class ApprovalLineInfo implements Serializable
{

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
    @JsonProperty("_arbitraryApprovable")
    private Boolean arbitraryApprovable;
    @JsonProperty("apprType")
    private String apprType;
    @JsonProperty("role")
    private Role role;
    @JsonProperty("autoApproval")
    private String autoApproval;
    @JsonProperty("_endTime")
    private String endTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4541826496085375645L;

    @JsonProperty("_trcTag")
    public String getTrcTag() {
        return trcTag;
    }

    @JsonProperty("_trcTag")
    public void setTrcTag(String trcTag) {
        this.trcTag = trcTag;
    }

    public ApprovalLineInfo withTrcTag(String trcTag) {
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

    public ApprovalLineInfo withName(String name) {
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

    public ApprovalLineInfo withStatus(String status) {
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

    public ApprovalLineInfo withScrUrl(String scrUrl) {
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

    public ApprovalLineInfo withExt2(String ext2) {
        this.ext2 = ext2;
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

    public ApprovalLineInfo withArbitraryApprovable(Boolean arbitraryApprovable) {
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

    public ApprovalLineInfo withApprType(String apprType) {
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

    public ApprovalLineInfo withRole(Role role) {
        this.role = role;
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

    public ApprovalLineInfo withAutoApproval(String autoApproval) {
        this.autoApproval = autoApproval;
        return this;
    }
    
    @JsonProperty("_endTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("_endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ApprovalLineInfo withEndTime(String endTime) {
        this.endTime = endTime;
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

    public ApprovalLineInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApprovalLineInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("autoApproval");
        sb.append('=');
        sb.append(((this.autoApproval == null)?"<null>":this.autoApproval));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
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
