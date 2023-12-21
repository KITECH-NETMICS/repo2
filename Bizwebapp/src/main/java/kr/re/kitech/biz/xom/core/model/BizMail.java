/**
 * 
 */
package kr.re.kitech.biz.xom.core.model;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.regex.Pattern;

import javax.mail.internet.InternetAddress;

import org.apache.commons.lang3.StringUtils;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * 메일 도메인 객체
 *  - 빌더 패턴을 이용하여 안정성 및 가독성을 향상 시킨다.
 * @author James
 * @since 2022. 3. 28.
 */
public class BizMail {
    
    private static final Pattern PATTERN = Pattern.compile("<([^>]*)>");
    
    // 메일 관련 속성
	private final String senderName;	
	private final String senderEmail;
	private final String[] toAddr;
	private final String[] ccAddr;
	private final String[] bccAddr;
	private final String subject;	
	private final String content;
	private final String attachFileNo;
	private final boolean savesent;
	private final boolean onesend;	// 일괄 발송
	private final boolean logging;	// 히스토리 저장 여부
	
	// 업무 관련 속성
	private final Business business;		// 공통코드값(XAA)
	private final String syspayno;			// 사번
	private final String templatePath;		// 템플릿 모듈명.
	private final List<MailTemplateVo> templateVars;		// 템플릿 모듈명.
	

	private BizMail(Builder builder){
        this.senderName = builder.senderName;
        this.senderEmail = builder.senderEmail;
        this.toAddr = builder.toAddr;
        this.ccAddr = builder.ccAddr;
        this.bccAddr = builder.bccAddr;
        this.subject = builder.subject;		
        this.content = builder.content;		
        this.attachFileNo = builder.attachFileNo;
        this.savesent = builder.savesent;	
        this.onesend = builder.onesend;	
        this.logging = builder.logging;
        	
        this.business = builder.business;		
        this.syspayno = builder.syspayno;		
        this.templatePath = builder.templatePath;
        this.templateVars = builder.templateVars;
	}
    
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n===================== ] BizMail START [ ==============================\n");
		builder.append("subject 	: [").append(this.getSubject()).append("]\n");
		builder.append("fromAddress	: [").append(this.getFromAddress()).append("]\n");
		builder.append("fromName	: [").append(this.getFromName()).append("]\n");
		builder.append("toAddress	: [").append(this.getToAddress()).append("]\n");
		builder.append("ccAddress	: [").append(this.getCcAddress()).append("]\n");
		builder.append("bccAddress	: [").append(this.getBccAddress()).append("]\n");
		builder.append("attachFileNo: [").append(this.getAttachFileNo()).append("]\n");
		builder.append("bizCode 	: [").append(this.getBusiness()).append("]\n");
		builder.append("isSavesent	: [").append(this.isSavesent()).append("]\n");
		builder.append("isLogging	: [").append(this.isLogging()).append("]\n");
		builder.append("isOnesend	: [").append(this.isOnesend()).append("]\n");
		builder.append("syspayhno	: [").append(this.getSyspayno()).append("]\n");
		builder.append("business	: [").append(this.getBusiness()).append("]\n");
		builder.append("========================= ] BizMail END [ ==============================");
		return builder.toString();
	}
	
	/**
	 * 형식에 맞게 발신자를 가져옴
	 */
    public InternetAddress getSender() throws UnsupportedEncodingException{
    	if(null == this.senderEmail) return null;
    	
    	String[] senders = this.senderEmail.split("\\s+<");
    	if (1 == senders.length){
    		senders = this.senderEmail.split("<");
    	}
    	String name = "";
    	String address = "";
    	if (1 == senders.length){
    		address = senders[0];
    	} else if (2 == senders.length){
        	name = StringUtils.isNotEmpty(senderName) ? senderName : senders[0].replaceAll("'|\"", "").trim();
        	address = senders[1].replaceAll(">", "").trim();    		
    	} else {
    		throw new RuntimeException("발신자 형식이 올바르지 않음!!");
    	}
    	return new InternetAddress(address, name);
    }
    
    public String[] getToAddr(){
    	if (null == this.toAddr || 1 > this.toAddr.length){
    		throw new RuntimeException("수신자가 세팅되지 않음 !!");
    	}
    	return this.toAddr;
    }
    
    public String[] getCcAddr(){
    	if (null == this.ccAddr || 1 > this.ccAddr.length){
    		return null;
    	} 
    	return this.ccAddr;
    }
    
    public String[] getBccAddr(){
    	if (null == this.bccAddr || 1 > this.bccAddr.length){
    		return null;
    	} 
    	return this.bccAddr;
    }

	public String getToAddress() {
		String[] toAddress = this.toAddr;
		if (null != toAddress && 0 < toAddress.length) {
			StringBuilder builder = new StringBuilder();
			int index = 0;
			for (String address : toAddress) {
				builder.append((0 == index++) ? "" : ",").append(address);
			}
			return builder.toString();

		}
		return null;
	}

	public String getCcAddress() {
		String[] ccAddress = this.ccAddr;
		if (null != ccAddress && 0 < ccAddress.length) {
			StringBuilder builder = new StringBuilder();
			int index = 0;
			for (String address : ccAddress) {
				builder.append((0 == index++) ? "" : ",").append(address);
			}
			return builder.toString();

		}
		return null;
	}

	public String getBccAddress() {
		String[] bccAddress = this.bccAddr;
		if (null != bccAddress && 0 < bccAddress.length) {
			StringBuilder builder = new StringBuilder();
			int index = 0;
			for (String address : bccAddress) {
				builder.append((0 == index++) ? "" : ",").append(address);
			}
			return builder.toString();

		}
		return null;
	}

	public String getSubject() {
		return this.subject;
	}
	
	public String getContent() {
		return this.content;
	}

	public String getFromAddress() {
		return this.senderEmail;
	}
	public String getFromName() {
		return this.senderName;
	}
	public String getAttachFileNo() {
		return this.attachFileNo;
	}
	public boolean isSavesent() {
		return this.savesent;
	}
	public boolean isOnesend() {
		return this.onesend;
	}	
	public boolean isLogging() {
		return this.logging;
	}	
	public Business getBusiness() {
		return this.business;
	}
	public String getSyspayno() {
		return this.syspayno;
	}
	public String getTemplatePath() {
		return this.templatePath;
	}
	public List<MailTemplateVo> getTemplateVars() {
		return this.templateVars;
	}	
	
	public static class Builder {
		// 기본 필수 속성 
		private final String syspayno;
		private final Business business;
		private final boolean onesend;		// 일괄 발송		
	
	    // 메일 관련 속성
		private String senderEmail;
		private String senderName;	
		private String[] toAddr;
		private String[] ccAddr;
		private String[] bccAddr;
		private String subject;	
		private String content;
		private String attachFileNo;
		private boolean savesent = false;
		private boolean logging = true;
		
		// 템플릿 관련 속성
		private String templatePath;
		private List<MailTemplateVo> templateVars;

        public Builder(String syspayno, Business business, boolean onesend) {
        	this.syspayno = syspayno;
        	this.business = business;
        	this.onesend = onesend;
        }
        
        public Builder senderName(String fromName) {
			if (null != fromName && !("").equals(fromName.trim())) {
				this.senderName = fromName;
			}
            return this;
        }
        public Builder senderEmail(String fromAddress) {
			if (null != fromAddress && !("").equals(fromAddress.trim()) && -1 < fromAddress.indexOf("@")) {
				this.senderEmail = fromAddress;
			}
            return this;
        }
        public Builder toAddr(String toAddress) throws NullPointerException {
			if (null != toAddress && !("").equals(toAddress.trim())) {
				this.toAddr = toAddress.replaceAll("\\s", "").split(",");
			}
            return this;
        }
        public Builder toAddr(List<String> toAddress) throws NullPointerException {
			if (null != toAddress && 0 < toAddress.size()) {
				this.toAddr = toAddress.toArray(new String[0]);
			}
            return this;
        }
        public Builder ccAddr(String ccAddress) {
			if (null != ccAddress && !("").equals(ccAddress.trim())) {
				if (-1 < ccAddress.indexOf("@")) {
					this.ccAddr = new String[] { ccAddress };
				}
			}
            return this;
        }
        public Builder ccAddr(List<String> ccAddress) {
			if (null != ccAddress && 0 < ccAddress.size()) {
				this.ccAddr = ccAddress.toArray(new String[0]);
			}
			return this;  
        }
        public Builder bccAddr(String bccAddress) {
			if (null != bccAddress && !("").equals(bccAddress.trim())) {
				if (-1 < bccAddress.indexOf("@")) {
					this.bccAddr = new String[] { bccAddress };
				}
			}
            return this;
        }
        public Builder bccAddr(List<String> bccAddress) {
			if (null != bccAddress && 0 < bccAddress.size()) {
				this.bccAddr = bccAddress.toArray(new String[0]);
			}
            return this;
        }
        public Builder subject(String subject) throws NullPointerException {
			if (null == subject || ("").equals(subject.trim())) {
				throw new NullPointerException("메일 제목이 누락되었습니다.");
			}
			this.subject = subject;
            return this;
        }
        public Builder content(String content) throws NullPointerException {
			if (null == content || ("").equals(content.trim())) {
				throw new NullPointerException("메일 본문이 누락되었습니다.");
			}
			this.content = content;
            return this;
        }
        public Builder attachFileNo(String attachFileNo) {
            this.attachFileNo = attachFileNo;
            return this;
        }
        public Builder savesent(boolean savesent) {
            this.savesent = savesent;
            return this;
        }
        public Builder logging(boolean logging) {
            this.logging = logging;
            return this;
        }        
        public Builder templatePath(String templatePath) {
            this.templatePath = templatePath;
            return this;
        }
        public Builder templateVars(List<MailTemplateVo> templateVars) {
            this.templateVars = templateVars;
            return this;
        }        
         
        public BizMail build() {
            return new BizMail(this);
        }
    }
}
