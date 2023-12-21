
package kr.re.kitech.biz.api.client.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import kr.re.kitech.biz.api.client.vo.ApiResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "executeUserId",
    "_templatePattern",
    "_isViewMode",
    "removeInstanceId",
    "_status",
    "_alias",
    "_defVerId",
    "_defName",
    "_initiateByFirstWorkitem",
    "info",
    "name",
    "instExt1",
    "instExt2",
    "instExt3",
    "instExt4",
    "instExt5",
    "processRoles",
    "processVariables",
    "appLineInfo",
    "_masterAppLineInfo",
    "currentActivity",
    "instanceId",
    "instName",
    "cancelKey"
})
@Generated("jsonschema2pojo")
public class ApiGetResult implements Serializable , ApiResult {
    @JsonProperty("executeUserId")
    private String executeUserId;
    @JsonProperty("_templatePattern")
    private String templatePattern;
    @JsonProperty("_isViewMode")
    private Boolean isViewMode;
    @JsonProperty("removeInstanceId")
    private String removeInstanceId;
    @JsonProperty("_status")
    private String status;
    @JsonProperty("_alias")
    private String alias;
    @JsonProperty("_defVerId")
    private String defVerId;
    @JsonProperty("_defName")
    private String defName;
    @JsonProperty("_initiateByFirstWorkitem")
    private Boolean initiateByFirstWorkitem;
    @JsonProperty("info")
    private String info;
    @JsonProperty("name")
    private String name;
    @JsonProperty("instExt1")
    private String instExt1;
    @JsonProperty("instExt2")
    private String instExt2;
    @JsonProperty("instExt3")
    private String instExt3;
    @JsonProperty("instExt4")
    private String instExt4;
    @JsonProperty("instExt5")
    private String instExt5;
    @JsonProperty("processRoles")
    private List<ProcessRole> processRoles = null;
    @JsonProperty("processVariables")
    private List<ProcessVariable> processVariables = null;
    @JsonProperty("appLineInfo")
    private AppLineInfo appLineInfo;
    @JsonProperty("_masterAppLineInfo")
    private MasterAppLineInfo masterAppLineInfo;
    @JsonProperty("currentActivity")
    private CurrentActivity currentActivity;
    @JsonProperty("_rootInstanceId")
    private String hiddenRootInstanceId;
    @JsonProperty("_instanceId")
    private String hiddenInstanceId;
    @JsonProperty("instanceId")
    private String instanceId;
    @JsonProperty("instName")
    private String instName;
    @JsonProperty("cancelKey")
    private String cancelKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1640283951355288060L;

    @JsonProperty("executeUserId")
    public String getExecuteUserId() {
        return executeUserId;
    }

    @JsonProperty("executeUserId")
    public void setExecuteUserId(String executeUserId) {
        this.executeUserId = executeUserId;
    }

    public ApiGetResult withExecuteUserId(String executeUserId) {
        this.executeUserId = executeUserId;
        return this;
    }

    @JsonProperty("_templatePattern")
    public String getTemplatePattern() {
        return templatePattern;
    }

    @JsonProperty("_templatePattern")
    public void setTemplatePattern(String templatePattern) {
        this.templatePattern = templatePattern;
    }

    public ApiGetResult withTemplatePattern(String templatePattern) {
        this.templatePattern = templatePattern;
        return this;
    }

    @JsonProperty("_isViewMode")
    public Boolean getIsViewMode() {
        return isViewMode;
    }

    @JsonProperty("_isViewMode")
    public void setIsViewMode(Boolean isViewMode) {
        this.isViewMode = isViewMode;
    }

    public ApiGetResult withIsViewMode(Boolean isViewMode) {
        this.isViewMode = isViewMode;
        return this;
    }

    @JsonProperty("removeInstanceId")
    public String getRemoveInstanceId() {
        return removeInstanceId;
    }

    @JsonProperty("removeInstanceId")
    public void setRemoveInstanceId(String removeInstanceId) {
        this.removeInstanceId = removeInstanceId;
    }

    public ApiGetResult withRemoveInstanceId(String removeInstanceId) {
        this.removeInstanceId = removeInstanceId;
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

    public ApiGetResult withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("_alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("_alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ApiGetResult withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("_defVerId")
    public String getDefVerId() {
        return defVerId;
    }

    @JsonProperty("_defVerId")
    public void setDefVerId(String defVerId) {
        this.defVerId = defVerId;
    }

    public ApiGetResult withDefVerId(String defVerId) {
        this.defVerId = defVerId;
        return this;
    }
    
    @JsonProperty("_defName")
    public String getDefName() {
        return defName;
    }

    @JsonProperty("_defName")
    public void setDefName(String defName) {
        this.defName = defName;
    }

    public ApiGetResult withDefName(String defName) {
        this.defName = defName;
        return this;
    }

    @JsonProperty("_initiateByFirstWorkitem")
    public Boolean getInitiateByFirstWorkitem() {
        return initiateByFirstWorkitem;
    }

    @JsonProperty("_initiateByFirstWorkitem")
    public void setInitiateByFirstWorkitem(Boolean initiateByFirstWorkitem) {
        this.initiateByFirstWorkitem = initiateByFirstWorkitem;
    }

    public ApiGetResult withInitiateByFirstWorkitem(Boolean initiateByFirstWorkitem) {
        this.initiateByFirstWorkitem = initiateByFirstWorkitem;
        return this;
    }
    
    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    public ApiGetResult withInfo(String info) {
        this.info = info;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ApiGetResult withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("instExt1")
    public String getInstExt1() {
        return instExt1;
    }

    @JsonProperty("instExt1")
    public void setInstExt1(String instExt1) {
        this.instExt1 = instExt1;
    }

    public ApiGetResult withInstExt1(String instExt1) {
        this.instExt1 = instExt1;
        return this;
    }

    @JsonProperty("instExt2")
    public String getInstExt2() {
        return instExt2;
    }

    @JsonProperty("instExt2")
    public void setInstExt2(String instExt2) {
        this.instExt2 = instExt2;
    }

    public ApiGetResult withInstExt2(String instExt2) {
        this.instExt2 = instExt2;
        return this;
    }

    @JsonProperty("instExt3")
    public String getInstExt3() {
        return instExt3;
    }

    @JsonProperty("instExt3")
    public void setInstExt3(String instExt3) {
        this.instExt3 = instExt3;
    }

    public ApiGetResult withInstExt3(String instExt3) {
        this.instExt3 = instExt3;
        return this;
    }

    @JsonProperty("instExt4")
    public String getInstExt4() {
        return instExt4;
    }

    @JsonProperty("instExt4")
    public void setInstExt4(String instExt4) {
        this.instExt4 = instExt4;
    }

    public ApiGetResult withInstExt4(String instExt4) {
        this.instExt4 = instExt4;
        return this;
    }

    @JsonProperty("instExt5")
    public String getInstExt5() {
        return instExt5;
    }

    @JsonProperty("instExt5")
    public void setInstExt5(String instExt5) {
        this.instExt5 = instExt5;
    }

    public ApiGetResult withInstExt5(String instExt5) {
        this.instExt5 = instExt5;
        return this;
    }

    @JsonProperty("processRoles")
    public List<ProcessRole> getProcessRoles() {
        return processRoles;
    }

    @JsonProperty("processRoles")
    public void setProcessRoles(List<ProcessRole> processRoles) {
        this.processRoles = processRoles;
    }

    public ApiGetResult withProcessRoles(List<ProcessRole> processRoles) {
        this.processRoles = processRoles;
        return this;
    }

    @JsonProperty("processVariables")
    public List<ProcessVariable> getProcessVariables() {
        return processVariables;
    }

    @JsonProperty("processVariables")
    public void setProcessVariables(List<ProcessVariable> processVariables) {
        this.processVariables = processVariables;
    }

    public ApiGetResult withProcessVariables(List<ProcessVariable> processVariables) {
        this.processVariables = processVariables;
        return this;
    }

    @JsonProperty("appLineInfo")
    public AppLineInfo getAppLineInfo() {
        return appLineInfo;
    }

    @JsonProperty("appLineInfo")
    public void setAppLineInfo(AppLineInfo appLineInfo) {
        this.appLineInfo = appLineInfo;
    }

    public ApiGetResult withAppLineInfo(AppLineInfo appLineInfo) {
        this.appLineInfo = appLineInfo;
        return this;
    }
    
    @JsonProperty("_masterAppLineInfo")
    public MasterAppLineInfo getMasterAppLineInfo() {
        return masterAppLineInfo;
    }

    @JsonProperty("_masterAppLineInfo")
    public void setMasterAppLineInfo(MasterAppLineInfo masterAppLineInfo) {
        this.masterAppLineInfo = masterAppLineInfo;
    }

    public ApiGetResult withgetMasterAppLineInfo(MasterAppLineInfo masterAppLineInfo) {
        this.masterAppLineInfo = masterAppLineInfo;
        return this;
    }

    @JsonProperty("currentActivity")
    public CurrentActivity getCurrentActivity() {
        return currentActivity;
    }

    @JsonProperty("currentActivity")
    public void setCurrentActivity(CurrentActivity currentActivity) {
        this.currentActivity = currentActivity;
    }

    public ApiGetResult withCurrentActivity(CurrentActivity currentActivity) {
        this.currentActivity = currentActivity;
        return this;
    }
    
    /**
	 * 서브 프로세스 여부를 반환한다.
	 * instanceId 와 rootInstanceId 가 같으면 메인 프로세스
     * @return
     */
    public boolean isMainProcess() {
    	return StringUtils.equals( this.getHiddenRootInstanceId(), this.getHiddenInstanceId());
    }
    
    @JsonProperty("_rootInstanceId")
    public void setHiddenRootInstanceId(String hiddenRootInstanceId) {
        this.hiddenRootInstanceId = hiddenRootInstanceId;
    }
    
    @JsonProperty("_rootInstanceId")
    public String getHiddenRootInstanceId() {
        return hiddenRootInstanceId;
    }
    
    @JsonProperty("_instanceId")
    public void setHiddenInstanceId(String hiddenInstanceId) {
        this.hiddenInstanceId = hiddenInstanceId;
    }
    
    @JsonProperty("_instanceId")
    public String getHiddenInstanceId() {
        return hiddenInstanceId;
    }
    
    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }
    
    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ApiGetResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @JsonProperty("instName")
    public String getInstName() {
        return instName;
    }

    @JsonProperty("instName")
    public void setInstName(String instName) {
        this.instName = instName;
    }
    
    public ApiGetResult withInstName(String instName) {
        this.instName = instName;
        return this;
    }

    @JsonProperty("cancelKey")
    public String getCancelKey() {
        return cancelKey;
    }

    @JsonProperty("cancelKey")
    public void setCancelKey(String cancelKey) {
        this.cancelKey = cancelKey;
    }

    public ApiGetResult withCancelKey(String cancelKey) {
        this.cancelKey = cancelKey;
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

    public ApiGetResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiGetResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("executeUserId");
        sb.append('=');
        sb.append(((this.executeUserId == null)?"<null>":this.executeUserId));
        sb.append(',');
        sb.append("templatePattern");
        sb.append('=');
        sb.append(((this.templatePattern == null)?"<null>":this.templatePattern));
        sb.append(',');
        sb.append("isViewMode");
        sb.append('=');
        sb.append(((this.isViewMode == null)?"<null>":this.isViewMode));
        sb.append(',');
        sb.append("removeInstanceId");
        sb.append('=');
        sb.append(((this.removeInstanceId == null)?"<null>":this.removeInstanceId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("alias");
        sb.append('=');
        sb.append(((this.alias == null)?"<null>":this.alias));
        sb.append(',');
        sb.append("defVerId");
        sb.append('=');
        sb.append(((this.defVerId == null)?"<null>":this.defVerId));
        sb.append(',');
        sb.append("defName");
        sb.append('=');
        sb.append(((this.defName == null)?"<null>":this.defName));
        sb.append(',');
        sb.append("initiateByFirstWorkitem");
        sb.append('=');
        sb.append(((this.initiateByFirstWorkitem == null)?"<null>":this.initiateByFirstWorkitem));
        sb.append(',');
        sb.append("info");
        sb.append('=');
        sb.append(((this.info == null)?"<null>":this.info));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("instExt1");
        sb.append('=');
        sb.append(((this.instExt1 == null)?"<null>":this.instExt1));
        sb.append(',');
        sb.append("instExt2");
        sb.append('=');
        sb.append(((this.instExt2 == null)?"<null>":this.instExt2));
        sb.append(',');
        sb.append("instExt3");
        sb.append('=');
        sb.append(((this.instExt3 == null)?"<null>":this.instExt3));
        sb.append(',');
        sb.append("instExt4");
        sb.append('=');
        sb.append(((this.instExt4 == null)?"<null>":this.instExt4));
        sb.append(',');
        sb.append("instExt5");
        sb.append('=');
        sb.append(((this.instExt5 == null)?"<null>":this.instExt5));
        sb.append(',');
        sb.append("processRoles");
        sb.append('=');
        sb.append(((this.processRoles == null)?"<null>":this.processRoles));
        sb.append(',');
        sb.append("processVariables");
        sb.append('=');
        sb.append(((this.processVariables == null)?"<null>":this.processVariables));
        sb.append(',');
        sb.append("appLineInfo");
        sb.append('=');
        sb.append(((this.appLineInfo == null)?"<null>":this.appLineInfo));
        sb.append(',');
        sb.append("masterAppLineInfo");
        sb.append('=');
        sb.append(((this.masterAppLineInfo == null)?"<null>":this.masterAppLineInfo));
        sb.append(',');
        sb.append("currentActivity");
        sb.append('=');
        sb.append(((this.currentActivity == null)?"<null>":this.currentActivity));
        sb.append(',');
        sb.append("instName");
        sb.append('=');
        sb.append(((this.instName == null)?"<null>":this.instName));
        sb.append(',');
        sb.append("instanceId");
        sb.append('=');
        sb.append(((this.instanceId == null)?"<null>":this.instanceId));
        sb.append(',');
        sb.append("cancelKey");
        sb.append('=');
        sb.append(((this.cancelKey == null)?"<null>":this.cancelKey));
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
