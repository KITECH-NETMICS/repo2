/**
 * 
 */
package kr.re.kitech.biz.api.client.vo;

/**
 * 
 * @author James
 * @since 2022. 5. 16.
 */
public class MbiResult {

	private boolean result;
	private String errMessge;
	private int status;

	public MbiResult() {
	}

	public MbiResult(boolean result, String errMessge) {
		super();
		this.result = result;
		this.errMessge = errMessge;
	}

	@Override
	public String toString() {
		return "ApiResult [result=" + result + ", status=" + status + ", errMessge=" + errMessge + "]";
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public void setErrMessge(String errMessge) {
		this.errMessge = errMessge;
	}

	public void setStatus(int status) {
		this.status = status;
	}
        
    public boolean isResult() {
		return result;
	}
	public String getErrMessge() {
		return errMessge;
	}
	
	public Integer getStatus() {
		return status;
	}
}
