
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
    "instId",
    "defAlias",
    "taskId",
    "trctag",
    "endpoint"
})
@Generated("jsonschema2pojo")
public class NextWork implements Serializable
{

    @JsonProperty("instId")
    private Integer instId;
    @JsonProperty("defAlias")
    private String defAlias;
    @JsonProperty("taskId")
    private Integer taskId;
    @JsonProperty("trctag")
    private String trctag;
    @JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("taskExt2")
    private String taskExt2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6058093417048133340L;

    @JsonProperty("instId")
    public Integer getInstId() {
        return instId;
    }

    @JsonProperty("instId")
    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public NextWork withInstId(Integer instId) {
        this.instId = instId;
        return this;
    }

    @JsonProperty("defAlias")
    public String getDefAlias() {
        return defAlias;
    }

    @JsonProperty("defAlias")
    public void setDefAlias(String defAlias) {
        this.defAlias = defAlias;
    }

    public NextWork withDefAlias(String defAlias) {
        this.defAlias = defAlias;
        return this;
    }

    @JsonProperty("taskId")
    public Integer getTaskId() {
        return taskId;
    }

    @JsonProperty("taskId")
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public NextWork withTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    @JsonProperty("trctag")
    public String getTrctag() {
        return trctag;
    }

    @JsonProperty("trctag")
    public void setTrctag(String trctag) {
        this.trctag = trctag;
    }

    public NextWork withTrctag(String trctag) {
        this.trctag = trctag;
        return this;
    }
    
    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public NextWork withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    @JsonProperty("taskExt2")
    public String getTaskExt2() {
        return taskExt2;
    }

    @JsonProperty("taskExt2")
    public void setTaskExt2(String taskExt2) {
        this.taskExt2 = taskExt2;
    }

    public NextWork withTaskExt2(String taskExt2) {
        this.taskExt2 = taskExt2;
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

    public NextWork withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NextWork.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instId");
        sb.append('=');
        sb.append(((this.instId == null)?"<null>":this.instId));
        sb.append(',');
        sb.append("defAlias");
        sb.append('=');
        sb.append(((this.defAlias == null)?"<null>":this.defAlias));
        sb.append(',');
        sb.append("taskId");
        sb.append('=');
        sb.append(((this.taskId == null)?"<null>":this.taskId));
        sb.append(',');
        sb.append("trctag");
        sb.append('=');
        sb.append(((this.trctag == null)?"<null>":this.trctag));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("taskExt2");
        sb.append('=');
        sb.append(((this.taskExt2 == null)?"<null>":this.taskExt2));
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
