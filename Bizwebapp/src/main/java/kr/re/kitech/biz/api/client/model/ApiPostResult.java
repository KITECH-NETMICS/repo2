
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

import kr.re.kitech.biz.api.client.vo.ApiResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instance_id",
    "cancel_key",
    "msg",
    "nextWorks",
    "instStatus"
})
@Generated("jsonschema2pojo")
public class ApiPostResult implements Serializable, ApiResult {

    @JsonProperty("instance_id")
    private String instanceId;
    @JsonProperty("cancel_key")
    private String cancelKey;
    @JsonProperty("msg")
    private Object msg;
    @JsonProperty("nextWorks")
    private List<NextWork> nextWorks = null;
    @JsonProperty("instStatus")
    private String instStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6032362842396280844L;

    @JsonProperty("instance_id")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instance_id")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ApiPostResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @JsonProperty("cancel_key")
    public String getCancelKey() {
        return cancelKey;
    }

    @JsonProperty("cancel_key")
    public void setCancelKey(String cancelKey) {
        this.cancelKey = cancelKey;
    }

    public ApiPostResult withCancelKey(String cancelKey) {
        this.cancelKey = cancelKey;
        return this;
    }

    @JsonProperty("msg")
    public Object getMsg() {
        return msg;
    }

    @JsonProperty("msg")
    public void setMsg(Object msg) {
        this.msg = msg;
    }

    public ApiPostResult withMsg(Object msg) {
        this.msg = msg;
        return this;
    }

    @JsonProperty("nextWorks")
    public List<NextWork> getNextWorks() {
        return nextWorks;
    }

    @JsonProperty("nextWorks")
    public void setNextWorks(List<NextWork> nextWorks) {
        this.nextWorks = nextWorks;
    }

    public ApiPostResult withNextWorks(List<NextWork> nextWorks) {
        this.nextWorks = nextWorks;
        return this;
    }
    
    @JsonProperty("instStatus")
    public String getInstStatus() {
        return instStatus;
    }

    @JsonProperty("instStatus")
    public void setInstStatus(String instStatus) {
        this.instStatus = instStatus;
    }

    public ApiPostResult withInstStatus(String instStatus) {
        this.instStatus = instStatus;
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

    public ApiPostResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiPostResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("instanceId");
        sb.append('=');
        sb.append(((this.instanceId == null)?"<null>":this.instanceId));
        sb.append(',');
        sb.append("cancelKey");
        sb.append('=');
        sb.append(((this.cancelKey == null)?"<null>":this.cancelKey));
        sb.append(',');
        sb.append("msg");
        sb.append('=');
        sb.append(((this.msg == null)?"<null>":this.msg));
        sb.append(',');
        sb.append("nextWorks");
        sb.append('=');
        sb.append(((this.nextWorks == null)?"<null>":this.nextWorks));
        sb.append(',');
        sb.append("instStatus");
        sb.append('=');
        sb.append(((this.instStatus == null)?"<null>":this.instStatus));
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
