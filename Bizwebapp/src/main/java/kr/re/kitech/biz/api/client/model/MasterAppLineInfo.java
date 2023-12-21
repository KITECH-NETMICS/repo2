
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
    "_trcTag",
    "_status",
    "_apprEditable",
    "name",
    "_linetype",
    "extApprId1",
    "approvalLineInfos",
    "_worklineinfos",
    "workInfos"
})
@Generated("jsonschema2pojo")
public class MasterAppLineInfo implements Serializable
{

    @JsonProperty("_trcTag")
    private String trcTag;
    @JsonProperty("_status")
    private String status;
    @JsonProperty("_apprEditable")
    private Boolean apprEditable;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("_linetype")
    private String linetype;
    @JsonProperty("extApprId1")
    private Object extApprId1;
    @JsonProperty("approvalLineInfos")
    private List<ApprovalLineInfo> approvalLineInfos = null;
    @JsonProperty("_worklineinfos")
    private List<Worklineinfo> worklineinfos = null;
    @JsonProperty("workInfos")
    private List<WorkInfo> workInfos = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -83648059595534969L;

    @JsonProperty("_trcTag")
    public String getTrcTag() {
        return trcTag;
    }

    @JsonProperty("_trcTag")
    public void setTrcTag(String trcTag) {
        this.trcTag = trcTag;
    }

    public MasterAppLineInfo withTrcTag(String trcTag) {
        this.trcTag = trcTag;
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

    public MasterAppLineInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("_apprEditable")
    public Boolean getApprEditable() {
        return apprEditable;
    }

    @JsonProperty("_apprEditable")
    public void setApprEditable(Boolean apprEditable) {
        this.apprEditable = apprEditable;
    }

    public MasterAppLineInfo withApprEditable(Boolean apprEditable) {
        this.apprEditable = apprEditable;
        return this;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    public MasterAppLineInfo withName(Object name) {
        this.name = name;
        return this;
    }

    @JsonProperty("_linetype")
    public String getLinetype() {
        return linetype;
    }

    @JsonProperty("_linetype")
    public void setLinetype(String linetype) {
        this.linetype = linetype;
    }

    public MasterAppLineInfo withLinetype(String linetype) {
        this.linetype = linetype;
        return this;
    }

    @JsonProperty("extApprId1")
    public Object getExtApprId1() {
        return extApprId1;
    }

    @JsonProperty("extApprId1")
    public void setExtApprId1(Object extApprId1) {
        this.extApprId1 = extApprId1;
    }

    public MasterAppLineInfo withExtApprId1(Object extApprId1) {
        this.extApprId1 = extApprId1;
        return this;
    }

    @JsonProperty("approvalLineInfos")
    public List<ApprovalLineInfo> getApprovalLineInfos() {
        return approvalLineInfos;
    }

    @JsonProperty("approvalLineInfos")
    public void setApprovalLineInfos(List<ApprovalLineInfo> approvalLineInfos) {
        this.approvalLineInfos = approvalLineInfos;
    }

    public MasterAppLineInfo withApprovalLineInfos(List<ApprovalLineInfo> approvalLineInfos) {
        this.approvalLineInfos = approvalLineInfos;
        return this;
    }
    
    @JsonProperty("_worklineinfos")
    public List<Worklineinfo> getWorklineinfos() {
        return worklineinfos;
    }

    @JsonProperty("_worklineinfos")
    public void setWorklineinfos(List<Worklineinfo> worklineinfos) {
        this.worklineinfos = worklineinfos;
    }

    public MasterAppLineInfo withWorklineinfos(List<Worklineinfo> worklineinfos) {
        this.worklineinfos = worklineinfos;
        return this;
    }

    @JsonProperty("workInfos")
    public List<WorkInfo> getWorkInfos() {
        return workInfos;
    }

    @JsonProperty("workInfos")
    public void setWorkInfos(List<WorkInfo> workInfos) {
        this.workInfos = workInfos;
    }

    public MasterAppLineInfo withWorkInfos(List<WorkInfo> workInfos) {
        this.workInfos = workInfos;
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

    public MasterAppLineInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MasterAppLineInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trcTag");
        sb.append('=');
        sb.append(((this.trcTag == null)?"<null>":this.trcTag));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("apprEditable");
        sb.append('=');
        sb.append(((this.apprEditable == null)?"<null>":this.apprEditable));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("linetype");
        sb.append('=');
        sb.append(((this.linetype == null)?"<null>":this.linetype));
        sb.append(',');
        sb.append("extApprId1");
        sb.append('=');
        sb.append(((this.extApprId1 == null)?"<null>":this.extApprId1));
        sb.append(',');
        sb.append("approvalLineInfos");
        sb.append('=');
        sb.append(((this.approvalLineInfos == null)?"<null>":this.approvalLineInfos));
        sb.append(',');
        sb.append("worklineinfos");
        sb.append('=');
        sb.append(((this.worklineinfos == null)?"<null>":this.worklineinfos));
        sb.append(',');
        sb.append("workInfos");
        sb.append('=');
        sb.append(((this.workInfos == null)?"<null>":this.workInfos));
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
