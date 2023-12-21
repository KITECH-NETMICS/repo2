/**
 * 
 */
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

import kr.re.kitech.biz.api.client.vo.ApiResult;
import kr.re.kitech.biz.apr.vo.AprWorkVo;


/**
 * 
 * @author James
 * @since 2022. 5. 20.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"instName",
	"instId",
	"rootInstId",
	"instStarteddate",
	"instFinisheddate",
	"isSubprocess",
	"instStatus",
	"instExt1",
    "instExt2",
    "instExt3",
    "instExt4",
    "instExt5",
	"defId",
	"defName",
	"defAlias",
	"taskName",
	"taskId",
	"trctag",
	"endpoint",
	"taskStatus",
	"taskStartdate",
	"taskEnddate",
	"taskDuedate",
	"asistype",
	"currep",
	"initep",
	"currepName",
	"initepName",
	"taskExt1",
	"taskExt2",
	"taskExt3",
	"instAlias",
	"instInfo"
})
@Generated("jsonschema2pojo")
public class ApiWorkResult implements Serializable, ApiResult {

	@JsonProperty("instName")
	private String instName;
	@JsonProperty("instId")
	private Integer instId;
	@JsonProperty("rootInstId")
	private Integer rootInstId;
	@JsonProperty("instStarteddate")
	private String instStarteddate;
	@JsonProperty("instFinisheddate")
	private String instFinisheddate;
	@JsonProperty("isSubprocess")
	private Boolean isSubprocess;
	@JsonProperty("instStatus")
	private String instStatus;
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
	@JsonProperty("defId")
	private Integer defId;
	@JsonProperty("defName")
	private String defName;
	@JsonProperty("defAlias")
	private String defAlias;
	@JsonProperty("taskName")
	private String taskName;
	@JsonProperty("taskId")
	private Integer taskId;
	@JsonProperty("trctag")
	private String trctag;
	@JsonProperty("endpoint")
	private String endpoint;
	@JsonProperty("taskStatus")
	private String taskStatus;
	@JsonProperty("taskStartdate")
	private String taskStartdate;
	@JsonProperty("taskEnddate")
	private String taskEnddate;
	@JsonProperty("taskDuedate")
	private String taskDuedate;
	@JsonProperty("asistype")
	private String asistype;
	@JsonProperty("currep")
	private String currep;
	@JsonProperty("initep")
	private String initep;
	@JsonProperty("currepName")
	private String currepName;
	@JsonProperty("initepName")
	private String initepName;
	@JsonProperty("taskExt1")
	private String taskExt1;
	@JsonProperty("taskExt2")
	private String taskExt2;
	@JsonProperty("taskExt3")
	private String taskExt3;
	@JsonProperty("instAlias")
	private String instAlias;
	@JsonProperty("instInfo")
	private String instInfo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -8284314836034675471L;

	@JsonProperty("instName")
	public String getInstName() {
		return instName;
	}

	@JsonProperty("instName")
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public ApiWorkResult withInstName(String instName) {
		this.instName = instName;
		return this;
	}

	@JsonProperty("instId")
	public Integer getInstId() {
		return instId;
	}

	@JsonProperty("instId")
	public void setInstId(Integer instId) {
		this.instId = instId;
	}

	public ApiWorkResult withInstId(Integer instId) {
		this.instId = instId;
		return this;
	}

	@JsonProperty("rootInstId")
	public Integer getRootInstId() {
		return rootInstId;
	}

	@JsonProperty("rootInstId")
	public void setRootInstId(Integer rootInstId) {
		this.rootInstId = rootInstId;
	}

	public ApiWorkResult withRootInstId(Integer rootInstId) {
		this.rootInstId = rootInstId;
		return this;
	}

	@JsonProperty("instStarteddate")
	public String getInstStarteddate() {
		return instStarteddate;
	}

	@JsonProperty("instStarteddate")
	public void setInstStarteddate(String instStarteddate) {
		this.instStarteddate = instStarteddate;
	}

	public ApiWorkResult withInstStarteddate(String instStarteddate) {
		this.instStarteddate = instStarteddate;
		return this;
	}
	
	@JsonProperty("instFinisheddate")
	public String getInstFinisheddate() {
		return instFinisheddate;
	}

	@JsonProperty("instFinisheddate")
	public void setInstFinisheddate(String instFinisheddate) {
		this.instFinisheddate = instFinisheddate;
	}

	public ApiWorkResult withInstFinisheddate(String instFinisheddate) {
		this.instFinisheddate = instFinisheddate;
		return this;
	}

	@JsonProperty("isSubprocess")
	public Boolean getIsSubprocess() {
		return isSubprocess;
	}

	@JsonProperty("isSubprocess")
	public void setIsSubprocess(Boolean isSubprocess) {
		this.isSubprocess = isSubprocess;
	}

	public ApiWorkResult withIsSubprocess(Boolean isSubprocess) {
		this.isSubprocess = isSubprocess;
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

	public ApiWorkResult withInstStatus(String instStatus) {
		this.instStatus = instStatus;
		return this;
	}
	
	@JsonProperty("instExt1")
    public Object getInstExt1() {
        return instExt1;
    }

    @JsonProperty("instExt1")
    public void setInstExt1(String instExt1) {
        this.instExt1 = instExt1;
    }

    public ApiWorkResult withInstExt1(String instExt1) {
        this.instExt1 = instExt1;
        return this;
    }

    @JsonProperty("instExt2")
    public Object getInstExt2() {
        return instExt2;
    }

    @JsonProperty("instExt2")
    public void setInstExt2(String instExt2) {
        this.instExt2 = instExt2;
    }

    public ApiWorkResult withInstExt2(String instExt2) {
        this.instExt2 = instExt2;
        return this;
    }

    @JsonProperty("instExt3")
    public Object getInstExt3() {
        return instExt3;
    }

    @JsonProperty("instExt3")
    public void setInstExt3(String instExt3) {
        this.instExt3 = instExt3;
    }

    public ApiWorkResult withInstExt3(String instExt3) {
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

    public ApiWorkResult withInstExt4(String instExt4) {
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
    
    public ApiWorkResult withInstExt5(String instExt5) {
        this.instExt5 = instExt5;
        return this;
    }

	@JsonProperty("defId")
	public Integer getDefId() {
		return defId;
	}

	@JsonProperty("defId")
	public void setDefId(Integer defId) {
		this.defId = defId;
	}

	public ApiWorkResult withDefId(Integer defId) {
		this.defId = defId;
		return this;
	}

	@JsonProperty("defName")
	public String getDefName() {
		return defName;
	}

	@JsonProperty("defName")
	public void setDefName(String defName) {
		this.defName = defName;
	}

	public ApiWorkResult withDefName(String defName) {
		this.defName = defName;
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

	public ApiWorkResult withDefAlias(String defAlias) {
		this.defAlias = defAlias;
		return this;
	}

	@JsonProperty("taskName")
	public String getTaskName() {
		return taskName;
	}

	@JsonProperty("taskName")
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public ApiWorkResult withTaskName(String taskName) {
		this.taskName = taskName;
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

	public ApiWorkResult withTaskId(Integer taskId) {
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

	public ApiWorkResult withTrctag(String trctag) {
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

	public ApiWorkResult withEndpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	@JsonProperty("taskStatus")
	public String getTaskStatus() {
		return taskStatus;
	}

	@JsonProperty("taskStatus")
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public ApiWorkResult withTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
		return this;
	}

	@JsonProperty("taskEnddate")
	public String getTaskEnddate() {
		return taskEnddate;
	}

	@JsonProperty("taskEnddate")
	public void setTaskEnddate(String taskEnddate) {
		this.taskEnddate = taskEnddate;
	}
	
	public ApiWorkResult withTaskEnddate(String taskEnddate) {
		this.taskEnddate = taskEnddate;
		return this;
	}

	@JsonProperty("taskStartdate")
	public String getTaskStartdate() {
		return taskStartdate;
	}

	@JsonProperty("taskStartdate")
	public void setTaskStartdate(String taskStartdate) {
		this.taskStartdate = taskStartdate;
	}

	public ApiWorkResult withTaskStartdate(String taskStartdate) {
		this.taskStartdate = taskStartdate;
		return this;
	}

	@JsonProperty("taskDuedate")
	public String getTaskDuedate() {
		return taskDuedate;
	}

	@JsonProperty("taskDuedate")
	public void setTaskDuedate(String taskDuedate) {
		this.taskDuedate = taskDuedate;
	}
	
	public ApiWorkResult withTaskDuedate(String taskDuedate) {
		this.taskDuedate = taskDuedate;
		return this;
	}
	
	@JsonProperty("asistype")
	public String getAsistype() {
		return asistype;
	}

	@JsonProperty("asistype")
	public void setAsistype(String asistype) {
		this.asistype = asistype;
	}
	
	public ApiWorkResult withAsistype(String asistype) {
		this.asistype = asistype;
		return this;
	}
	
	@JsonProperty("currep")
	public String getCurrep() {
		return currep;
	}

	@JsonProperty("currep")
	public void setCurrep(String currep) {
		this.currep = currep;
	}
	
	public ApiWorkResult withCurrep(String currep) {
		this.currep = currep;
		return this;
	}
	
	@JsonProperty("initep")
	public String getInitep() {
		return initep;
	}

	@JsonProperty("initep")
	public void setInitep(String initep) {
		this.initep = initep;
	}

	public ApiWorkResult withInitep(String initep) {
		this.initep = initep;
		return this;
	}
	
	@JsonProperty("currepName")
	public String getCurrepName() {
		return currep;
	}

	@JsonProperty("currepName")
	public void setCurrepName(String currepName) {
		this.currepName = currepName;
	}
	
	public ApiWorkResult withCurrepName(String currepName) {
		this.currepName = currepName;
		return this;
	}
	
	@JsonProperty("initepName")
	public String getInitepName() {
		return initep;
	}

	@JsonProperty("initepName")
	public void setInitepName(String initepName) {
		this.initepName = initepName;
	}

	public ApiWorkResult withInitepName(String initepName) {
		this.initepName = initepName;
		return this;
	}
	
	@JsonProperty("taskExt1")
	public String getTaskExt1() {
		return taskExt1;
	}

	@JsonProperty("taskExt1")
	public void setTaskExt1(String taskExt1) {
		this.taskExt1 = taskExt1;
	}

	public ApiWorkResult withTaskExt1(String taskExt1) {
		this.taskExt1 = taskExt1;
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

	public ApiWorkResult withTaskExt2(String taskExt2) {
		this.taskExt2 = taskExt2;
		return this;
	}
	
	@JsonProperty("taskExt3")
	public String getTaskExt3() {
		return taskExt3;
	}

	@JsonProperty("taskExt3")
	public void setTaskExt3(String taskExt3) {
		this.taskExt3 = taskExt3;
	}

	public ApiWorkResult withTaskExt3(String taskExt3) {
		this.taskExt3 = taskExt3;
		return this;
	}

	@JsonProperty("instInfo")
	public String getInstInfo() {
		return instInfo;
	}

	@JsonProperty("instInfo")
	public void setInstInfo(String instInfo) {
		this.instInfo = instInfo;
	}

	public ApiWorkResult withInstInfo(String instInfo) {
		this.instInfo = instInfo;
		return this;
	}
	
	@JsonProperty("instAlias")
	public String getInstAlias() {
		return instAlias;
	}

	@JsonProperty("instAlias")
	public void setInstAlias(String instAlias) {
		this.instAlias = instAlias;
	}

	public ApiWorkResult withInstAlias(String instAlias) {
		this.instAlias = instAlias;
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

	public ApiWorkResult withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ApiWorkResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("instName");
		sb.append('=');
		sb.append(((this.instName == null) ? "<null>" : this.instName));
		sb.append(',');
		sb.append("instId");
		sb.append('=');
		sb.append(((this.instId == null) ? "<null>" : this.instId));
		sb.append(',');
		sb.append("rootInstId");
		sb.append('=');
		sb.append(((this.rootInstId == null) ? "<null>" : this.rootInstId));
		sb.append(',');
		sb.append("instStarteddate");
		sb.append('=');
		sb.append(((this.instStarteddate == null) ? "<null>" : this.instStarteddate));
		sb.append(',');
		sb.append("instFinisheddate");
		sb.append('=');
		sb.append(((this.instFinisheddate == null) ? "<null>" : this.instFinisheddate));
		sb.append(',');
		sb.append("isSubprocess");
		sb.append('=');
		sb.append(((this.isSubprocess == null) ? "<null>" : this.isSubprocess));
		sb.append(',');
		sb.append("instStatus");
		sb.append('=');
		sb.append(((this.instStatus == null) ? "<null>" : this.instStatus));
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
		sb.append("defId");
		sb.append('=');
		sb.append(((this.defId == null) ? "0" : this.defId));
		sb.append(',');
		sb.append("defName");
		sb.append('=');
		sb.append(((this.defName == null) ? "<null>" : this.defName));
		sb.append(',');
		sb.append("defAlias");
		sb.append('=');
		sb.append(((this.defAlias == null) ? "<null>" : this.defAlias));
		sb.append(',');
		sb.append("taskName");
		sb.append('=');
		sb.append(((this.taskName == null) ? "<null>" : this.taskName));
		sb.append(',');
		sb.append("taskId");
		sb.append('=');
		sb.append(((this.taskId == null) ? "0" : this.taskId));
		sb.append(',');
		sb.append("trctag");
		sb.append('=');
		sb.append(((this.trctag == null) ? "<null>" : this.trctag));
		sb.append(',');
		sb.append("endpoint");
		sb.append('=');
		sb.append(((this.endpoint == null) ? "<null>" : this.endpoint));
		sb.append(',');
		sb.append("taskStatus");
		sb.append('=');
		sb.append(((this.taskStatus == null) ? "<null>" : this.taskStatus));
		sb.append(',');
		sb.append("taskStartdate");
		sb.append('=');
		sb.append(((this.taskStartdate == null) ? "<null>" : this.taskStartdate));
		sb.append("taskEnddate");
		sb.append('=');
		sb.append(((this.taskEnddate == null) ? "<null>" : this.taskEnddate));
		sb.append(',');
		sb.append("taskDuedate");
		sb.append('=');
		sb.append(((this.taskDuedate == null) ? "<null>" : this.taskDuedate));
		sb.append(',');
		sb.append("asistype");
		sb.append('=');
		sb.append(((this.asistype == null) ? "<null>" : this.asistype));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		sb.append("currep");
		sb.append('=');
		sb.append(((this.currep == null) ? "<null>" : this.currep));
		sb.append(',');
		sb.append("initep");
		sb.append('=');
		sb.append(((this.initep == null) ? "<null>" : this.initep));
		sb.append(',');
		sb.append("currepName");
		sb.append('=');
		sb.append(((this.currepName == null) ? "<null>" : this.currepName));
		sb.append(',');
		sb.append("initepName");
		sb.append('=');
		sb.append(((this.initepName == null) ? "<null>" : this.initepName));
		sb.append(',');
		sb.append("taskExt1");
		sb.append('=');
		sb.append(((this.taskExt1 == null) ? "<null>" : this.taskExt1));
		sb.append(',');
		sb.append("taskExt2");
		sb.append('=');
		sb.append(((this.taskExt2 == null) ? "<null>" : this.taskExt2));
		sb.append("taskExt3");
		sb.append('=');
		sb.append(((this.taskExt3 == null) ? "<null>" : this.taskExt3));
		sb.append(',');
		sb.append("instInfo");
		sb.append('=');
		sb.append(((this.instInfo == null) ? "<null>" : this.instInfo));
		sb.append(',');
		sb.append("instAlias");
		sb.append('=');
		sb.append(((this.instAlias == null) ? "<null>" : this.instAlias));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}
	
	public AprWorkVo toModel(){
		
		AprWorkVo work = new AprWorkVo();
		work.setInstName(instName);
		work.setInstId(instId);
		work.setRootInstId(rootInstId);
		work.setInstStarteddate(instStarteddate);
		work.setInstFinisheddate(instFinisheddate);
		work.setTaskStartdate(taskStartdate);
		work.setTaskEnddate(taskEnddate);
		if (null!=instExt1) work.setInstExt1(instExt1);
		work.setIsSubprocess(isSubprocess);
		work.setInstStatus(instStatus);
		if (null!=instExt1) work.setInstExt1(instExt1);
		if (null!=instExt2) work.setInstExt2(instExt2);
		if (null!=defId) work.setDefId(defId);
		work.setDefName(defName);
		work.setDefAlias(defAlias);
		work.setTaskName(taskName);
		if (null!=taskId) work.setTaskId(taskId);
		if (null!=asistype) work.setAsistype(asistype);
		if (null!=instAlias) work.setInstAlias(instAlias);
		work.setTrctag(trctag);
		work.setEndpoint(endpoint);
		work.setTaskStatus(taskStatus);
		work.setCurrep(currep);
		work.setInitep(initep);
		work.setCurrepName(currepName);
		work.setInitepName(initepName);
		work.setTaskExt1(taskExt1);
		work.setTaskExt2(taskExt2);
		work.setTaskExt3(taskExt3);
		work.setInstInfo(instInfo);
		return work;
	}
}