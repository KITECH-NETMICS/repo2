/**
 * 
 */
package kr.re.kitech.biz.api.client.vo;

/**
 * 
 * @author James
 * @since 2022. 12. 2.
 */
public class NoticeResult {
	private String notice;
	private String subject;
	private String startDate;
	private String closeDate;
	private String blockServices;
	private Boolean block;
	
	public String getNotice() {
		return notice;
	}
	public String getSubject() {
		return subject;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getCloseDate() {
		return closeDate;
	}
	public String getBlockServices() {
		return blockServices;
	}
	public Boolean isBlock() {
		return block;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
	public void setBlockServices(String blockServices) {
		this.blockServices = blockServices;
	}
	public void setBlock(Boolean block) {
		this.block = block;
	}
	@Override
	public String toString() {
		return "NoticeResult [notice=" + notice + ", subject=" + subject + ", startDate=" + startDate + ", closeDate=" + closeDate + ", blockServices=" + blockServices + ", block="
				+ block + "]";
	}
}
