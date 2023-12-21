/**
 * 
 */
package kr.re.kitech.biz.api.client.vo;

import java.util.Collections;
import java.util.List;

import kr.re.kitech.biz.api.client.model.ApiPostResult;
import kr.re.kitech.biz.api.client.model.NextWork;

/**
 * 
 * @author James
 * @since 2022. 5. 16.
 */
public class BpmResult {
	private final boolean result;
	private final String errMessge;
    private final ApiResult apiResult;
    private final List<ApiResult> apiResults;
    private String removeInstId;
        
    public boolean isResult() {
		return result;
	}
	public String getErrMessge() {
		return errMessge;
	}
	public String getRemoveInstId() {
		return removeInstId;
	}
	public void setRemoveInstId(String removeInstId) {
		this.removeInstId = removeInstId;
	}
	public ApiResult getApiResult() {
		return apiResult;
	}
	public List<ApiResult> getApiResults() {
		return null != this.apiResults ? this.apiResults : Collections.emptyList();
	}
	public NextWork getNextWork(){
		if (!(this.getApiResult() instanceof ApiPostResult)) return null;

		ApiPostResult apiPostRes = (ApiPostResult)this.getApiResult();
		List<NextWork> nextWorks = apiPostRes.getNextWorks();
		return nextWorks.get(0);
	}
	
	private BpmResult(Builder builder){
        this.result = builder.result;
        this.errMessge = builder.errMessge;
        this.removeInstId = builder.removeInstId;
        this.apiResult = builder.apiResult;
        this.apiResults = builder.apiResults;
	}
	@Override
	public String toString() {
		return "ApiResult [result=" + result + ", apiResult=" + apiResult + "]";
	}
	
	public static class Builder {
		private final boolean result;
		private String errMessge;
		private String removeInstId;
	    private ApiResult apiResult;
	    private List<ApiResult> apiResults;
	    
        public Builder(boolean result) {
        	this.result = result;
        }
        public Builder errMessge(String errMessge) {
			if (null != errMessge) {
				this.errMessge = errMessge;
			}
            return this;
        }
        public Builder removeInstId(String removeInstId) {
			if (null != removeInstId) {
				this.removeInstId = removeInstId;
			}
            return this;
        }
        public Builder apiResult(ApiResult apiResult) {
			if (null != apiResult) {
				this.apiResult = apiResult;
			}
            return this;
        }
        
        public Builder apiResults(List<ApiResult> apiResults) {
    		this.apiResults = apiResults;
        	return this;
        }
        
        public BpmResult build() {
            return new BpmResult(this);
        }        
	}
}
