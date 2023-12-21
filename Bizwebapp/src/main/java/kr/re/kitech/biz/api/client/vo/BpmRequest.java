/**
 * 
 */
package kr.re.kitech.biz.api.client.vo;
import kr.re.kitech.biz.api.client.enums.BpmServiceType;
import kr.re.kitech.biz.api.client.model.NextWork;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * 
 * @author James
 * @since 2022. 5. 16.
 */
public class BpmRequest {
	private final String token;
	private final String alias;
	private final String endpoint;

	private String instName;
	private String instStatus;
	private String taskStatus;
	private String proc;
	private String procClsf;
	private String tool;
	private String status;
	private String taskExt1;
	private String taskExt3;
	private String instanceId;
	private String taskId;
	private String trcTag;
	private String defName;
	private String instInfo;
	private String initepName;
	private String instExt1;
	private String instStartDateFrom;
	private String instStartDateTo;
	private String instFinishedDateFrom;
	private String instFinishedDateTo;
	private String prevEndpoint;
	private String orderBy;
	private String totalSearch;
	private String taskName;
	private String budgetControl;
	private Long pageNum;
    private Integer pageSize;
    private ApiResult apiResult;
    private NextWork nextWork;
	private BpmServiceType serviceType;
	
	private BpmRequest(Builder builder){	
    	this.token = "Bearer " + KitechContextUtil.getBpmToken();
        this.alias = builder.alias;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.instanceId = builder.instanceId;
        this.taskId = builder.taskId;
        this.trcTag = builder.trcTag;
        this.defName = builder.defName;
        this.instInfo = builder.instInfo;
        this.initepName = builder.initepName;
        this.instExt1 = builder.instExt1;
        this.instStartDateFrom = builder.instStartDateFrom;
        this.instStartDateTo = builder.instStartDateTo;
        this.instFinishedDateFrom = builder.instFinishedDateFrom;
        this.instFinishedDateTo = builder.instFinishedDateTo;
        this.prevEndpoint = builder.prevEndpoint;
        this.orderBy = builder.orderBy;
        this.endpoint = builder.endpoint;
        this.instName = builder.instName;
        this.instStatus = builder.instStatus;
        this.taskExt1 = builder.taskExt1;
        this.taskExt3 = builder.taskExt3;
        this.taskStatus = builder.taskStatus;
        this.serviceType = builder.serviceType;
        this.apiResult = builder.apiResult;
        this.nextWork = builder.nextWork;
        this.proc = builder.proc;
        this.procClsf = builder.procClsf;
        this.tool = builder.tool;
        this.status = builder.status;
        this.totalSearch = builder.totalSearch;
        this.taskName = builder.taskName;
        this.budgetControl = builder.budgetControl;
	}

	@Override
	public String toString() {
		return "ApiResult [alias=" + alias + ", endpoint=" + endpoint + ", instanceId=" + instanceId + ", taskId=" + taskId + ", trcTag=" + trcTag + ", serviceType=" + serviceType + ", apiResult=" + apiResult + "]";
	}
	
    public String getAlias() {
		return alias;
	}
	
    public String getEndpoint() {
		return endpoint;
	}
	
    public String getInstName() {
		return instName;
	}
	
	public void setInstName(String instName) {
		this.instName = instName;
	}
	
	public String getInstSatus() {
		return instStatus;
	}
	
	public void setInstSatus(String instStatus) {
		this.instStatus = instStatus;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getToken() {
		return token;
	}
	
		
	public String getProc() {
		return proc;
	}
	
	public String getTool() {
		return tool;
	}
	
	public void setTool(String tool) {
		this.tool = tool;
	}
	
	public String getProcClsf() {
		return procClsf;
	}
	
	public String getTotalSearch() {
		return totalSearch;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getBudgetControl() {
		return budgetControl;
	}
		
	public void setProc(String proc) {
		this.proc = proc;
	}
	
	public void setProcClsf(String procClsf) {
		this.procClsf = procClsf;
	}
	
	public String getTaskStatus() {
		return taskStatus;
	}
	
	public String getTaskExt1() {
		return taskExt1;
	}
	
	public void setTaskExt1(String taskExt1) {
		this.taskExt1 = taskExt1;
	}
	
	public String getTaskExt3() {
		return taskExt3;
	}
	
	public void setTaskExt3(String taskExt3) {
		this.taskExt3 = taskExt3;
	}
	
	public String getInstanceId() {
		return instanceId;
	}
	
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getTaskId() {
		return taskId;
	}
	
	public String getTrcTag() {
		return trcTag;
	}
	
	public String getDefName() {
		return defName;
	}
	
	public void setDefName(String defName) {
		this.defName = defName;
	}
	
	public String getInstInfo() {
		return instInfo;
	}
	
	public void setInstInfo(String instInfo) {
		this.instInfo = instInfo;
	}
	
	public String getInitepName() {
		return initepName;
	}
	
	public void setInitepName(String initepName) {
		this.initepName = initepName;
	}
	
	public String getInstExt1() {
		return instExt1;
	}
	
	public void setInstExt1(String instExt1) {
		this.instExt1 = instExt1;
	}
	
	public String getInstStartDateFrom() {
		return instStartDateFrom;
	}
	
	public void setInstStartDateFrom(String instStartDateFrom) {
		this.instStartDateFrom = instStartDateFrom;
	}
	
	public String getInstStartDateTo() {
		return instStartDateTo;
	}
	
	public void setInstStartDateTo(String instStartDateTo) {
		this.instStartDateTo = instStartDateTo;
	}
	
	public String getInstFinishedDateFrom() {
		return instFinishedDateFrom;
	}
	
	public void setInstFinishedDateFrom(String instFinishedDateFrom) {
		this.instFinishedDateFrom = instFinishedDateFrom;
	}
	
	public String getInstFinishedDateTo() {
		return instFinishedDateTo;
	}
	
	public void setInstFinishedDateTo(String instFinishedDateTo) {
		this.instFinishedDateTo = instFinishedDateTo;
	}
	
	public String getPrevEndpoint() {
		return prevEndpoint;
	}
	
	public void setPrevEndpoint(String prevEndpoint) {
		this.prevEndpoint = prevEndpoint;
	}
	
	public String getOrderBy() {
		return orderBy;
	}
	
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	public void setTotalSearch(String totalSearch) {
		this.totalSearch = totalSearch;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public void setBudgetControl(String budgetControl) {
		this.budgetControl = budgetControl;
	}
	
    public Long getPageNum() {
		return pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setApiResult(ApiResult apiResult) {
		this.apiResult = apiResult;
	}
	
	public ApiResult getApiResult() {
		return apiResult;
	}
	
	public void setNextWork(NextWork nextWork) {
		this.nextWork = nextWork;
	}
	
	public NextWork getNextWork() {
		return this.nextWork;
	}
	
	public void setServiceType(BpmServiceType serviceType) {
		this.serviceType = serviceType;
	}
		
	public BpmServiceType getServiceType() {
		return serviceType;
	}
	
	public static class Builder {
		private final String alias;
		private String endpoint;
		private String instName;
		private String instStatus;
		private String taskStatus;
		private String proc;
		private String status;
		private String taskExt1;
		private String taskExt3;
		private String instanceId;
		private String taskId;
		private String trcTag;
		private String defName;
		private String instInfo;
		private String initepName;
		private String instExt1;
		private String instStartDateFrom;
		private String instStartDateTo;
		private String instFinishedDateFrom;
		private String instFinishedDateTo;
		private String prevEndpoint;
		private String orderBy;
		private Long pageNum;
	    private Integer pageSize;
	    private String procClsf;
	    private String tool;				
	    private ApiResult apiResult;
	    private NextWork nextWork;
		private BpmServiceType serviceType;
		private String totalSearch;
		private String taskName;
		private String budgetControl;
	    
        public Builder(String alias) {
        	this.alias = alias;
        	this.pageNum = 1L;
        	this.pageSize = 20;
        }
        public Builder endpoint(String endpoint) {
			this.endpoint = endpoint;
            return this;
        }
        public Builder instName(String instName) {
			this.instName = instName;
            return this;
        }
        public Builder instStatus(String instStatus) {
			this.instStatus = instStatus;
            return this;
        }
        public Builder taskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
            return this;
        }
        public Builder proc(String proc) {
			this.proc = proc;
            return this;
        }
        public Builder tool(String tool) {
			this.tool = tool;
            return this;
        }
        public Builder status(String status) {
			this.status = status;
            return this;
        }
        public Builder taskExt1(String taskExt1) {
			this.taskExt1 = taskExt1;
            return this;
        }
        public Builder taskExt3(String taskExt3) {
			this.taskExt3 = taskExt3;
            return this;
        }
        public Builder instanceId(String instanceId) {
        	this.instanceId = instanceId;
        	return this;
        }
        public Builder taskId(String taskId) {
        	this.taskId = taskId;
        	return this;
        }
        public Builder trcTag(String trcTag) {
        	this.trcTag = trcTag;
        	return this;
        }
        public Builder defName(String defName) {
        	this.defName = defName;
        	return this;
        }
        public Builder instInfo(String instInfo) {
        	this.instInfo = instInfo;
        	return this;
        }
        public Builder initepName(String initepName) {
        	this.initepName = initepName;
        	return this;
        }
        public Builder instExt1(String instExt1) {
        	this.instExt1 = instExt1;
        	return this;
        }
        public Builder instStartDateFrom(String instStartDateFrom) {
        	this.instStartDateFrom = instStartDateFrom;
        	return this;
        }
        public Builder instStartDateTo(String instStartDateTo) {
        	this.instStartDateTo = instStartDateTo;
        	return this;
        }
        public Builder instFinishedDateFrom(String instFinishedDateFrom) {
        	this.instFinishedDateFrom = instFinishedDateFrom;
        	return this;
        }
        public Builder instFinishedDateTo(String instFinishedDateTo) {
        	this.instFinishedDateTo = instFinishedDateTo;
        	return this;
        }
        public Builder prevEndpoint(String prevEndpoint) {
        	this.prevEndpoint = prevEndpoint;
        	return this;
        }
        public Builder pageNum(Long pageNum) {
        	this.pageNum = pageNum;
        	return this;
        }
        public Builder pageSize(Integer pageSize) {
        	this.pageSize = pageSize;
        	return this;
        }
        public Builder orderBy(String orderBy) {
			this.orderBy = orderBy;
            return this;
        }
        public Builder serviceType(BpmServiceType serviceType) {
			this.serviceType = serviceType;
            return this;
        }
        
        public Builder procClsf(String procClsf) {
        	this.procClsf = procClsf;
        	return this;
        }
        	    
        public Builder apiResult(ApiResult apiResult) {
        	this.apiResult = apiResult;
        	return this;
        }
        
        public Builder nextWork(NextWork nextWork) {
        	this.nextWork = nextWork;
        	return this;
        }
        
        public Builder totalSearch(String totalSearch) {
        	this.totalSearch = totalSearch;
        	return this;
        }
        
        public Builder taskName(String taskName) {
        	this.taskName = taskName;
        	return this;
        }
        
        public Builder budgetControl(String budgetControl) {
        	this.budgetControl = budgetControl;
        	return this;
        }
        
        public BpmRequest build() {
            return new BpmRequest(this);
        }        
	}
}
