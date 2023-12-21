/**
 * 
 */
package kr.re.kitech.biz.xom.core.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Messages;
import kr.re.kitech.biz.xom.base.enums.MsgKeys;
import kr.re.kitech.biz.xom.core.vo.MsgTemplateVo;
import kr.re.kitech.biz.xom.core.vo.MsgVo;

/**
 * 업무 메시지 도메인 객체
 *
 * @author James
 * @since 2022. 3. 28.
 */
public class BizMsg {

	// 기본 속성
	private final Integer msgType;
	private final String requestTime;
	private final String sendTime;
	private final String msgBody;	// 다건
	private final String businessYn;
	private final Map<String,String> reciever;	// 수신자 (다건)
	private final Map<String,String> sender;	// 송신자 (단건)
	
	// 옵션 속성
	private final String subject;	// 다건
	private final String attachedFile;
	private final String templateCode;
	private final String reType;
	private final String reBody;	// 다건
	private final List<MsgTemplateVo> templateVars;
	
	// 시스템 속성
	private final String syspayno;
	private final Business business;
	private final Messages messages;
	private final boolean logging;	// 히스토리 저장 여부
	
	private BizMsg(Builder builder){
        this.msgType = builder.msgType;                
        this.requestTime = builder.requestTime;
        this.sendTime = builder.sendTime;
        this.msgBody = builder.msgBody;                
        this.businessYn = builder.businessYn;             

        this.reciever = builder.reciever;           
        this.sender = builder.sender;    

        this.subject = builder.subject;                
        this.attachedFile = builder.attachedFile;    
        this.templateCode = builder.templateCode;           
        this.reType = builder.reType;                 
        this.reBody = builder.reBody;                 
    
        this.logging = builder.logging;
        this.syspayno = builder.syspayno;   
        this.business = builder.business;               
        this.messages = builder.messages;               
        this.templateVars = builder.templateVars;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n===================== ] BizMessage START [ ==============================\n");
		builder.append("msgType		 : [").append(this.getMsgType()).append("]\n");
		builder.append("requestTime	 : [").append(this.getRequestTime()).append("]\n");
		builder.append("sendTime	 : [").append(this.getSendTime()).append("]\n");
		builder.append("msgBody		 : [").append(this.getMsgBody()).append("]\n");
		builder.append("businessYn 	 : [").append(this.getBusinessYn()).append("]\n");
		
		Map<String,String> receiver = this.getReceiver();
		if (null != receiver) {
			builder.append("destPhone	 : [").append(receiver.get(MsgKeys.DEST_NAME.getCode())).append("]\n");
			builder.append("destName	 : [").append(receiver.get(MsgKeys.DEST_PHONE.getCode())).append("]\n");
			builder.append("destSyspayno : [").append(receiver.get(MsgKeys.DEST_SYSPAYNO.getCode())).append("]\n");		
		}
		Map<String,String> sender = this.getSender();
		if (null != sender) {
			builder.append("sendPhone	 : [").append(sender.get(MsgKeys.SEND_NAME.getCode())).append("]\n");
			builder.append("sendName	 : [").append(sender.get(MsgKeys.SEND_PHONE.getCode())).append("]\n");
			builder.append("sendSyspayno : [").append(sender.get(MsgKeys.SEND_SYSPAYNO.getCode())).append("]\n");		
		}
		
		builder.append("subject 	 : [").append(this.getSubject()).append("]\n");
		builder.append("attachedFile : [").append(this.getAttachedFile()).append("]\n");
		builder.append("templateCode : [").append(this.getTemplateCode()).append("]\n");
		builder.append("reType		 : [").append(this.getReType()).append("]\n");
		builder.append("reBody		 : [").append(this.getReBody()).append("]\n");
		builder.append("syspayno	 : [").append(this.getSyspayno()).append("]\n");
		builder.append("business	 : [").append(this.getBusiness()).append("]\n");
		builder.append("templateVars : [").append(this.getTemplateVars()).append("]\n");
				
		builder.append("========================= ] BizMessage END [ ==============================\n");
		return builder.toString();
	}
	
	

	public MsgVo toMsgVo(String defaultSendTime, Map<String,String> defaultSender, String senderKey, String nationCode){
		MsgVo msgVo = new MsgVo();
		msgVo.setRegst_syspayno(this.getSyspayno());
		msgVo.setUpdt_syspayno(this.getSyspayno());
        msgVo.setMsgType( this.messages.getValue());                
        msgVo.setRequestTime( this.getRequestTime());            
        msgVo.setCmid( System.nanoTime());                   
        msgVo.setSendTime( null != this.getSendTime() ? this.getSendTime() : defaultSendTime);               
        msgVo.setMsgBody( this.getMsgBody());
        msgVo.setBusinessYn( this.getBusinessYn());
        msgVo.setSubject( this.getSubject());                
        msgVo.setAttachedFile( this.getAttachedFile());
        msgVo.setSenderKey( senderKey);
        msgVo.setNationCode( nationCode);
        msgVo.setTemplateCode( this.getTemplateCode());           
        msgVo.setReType( this.getReType());
        msgVo.setReBody( this.getReBody());

        Map<String,String> receiver = this.getReceiver();
        if (null != receiver && null != receiver.get(MsgKeys.DEST_PHONE.getCode())) {
	        msgVo.setDestName( receiver.get(MsgKeys.DEST_NAME.getCode()));
	        msgVo.setDestPhone( receiver.get(MsgKeys.DEST_PHONE.getCode()));              
	        msgVo.setDestSyspayno( receiver.get(MsgKeys.DEST_SYSPAYNO.getCode()));         
        }

        Map<String,String> sender = this.getSender();
        if (null != sender && null != sender.get(MsgKeys.SEND_PHONE.getCode())) {
        	System.out.println(">>>>>>>>>>>>>>> sender >>>>>>>>>>>>>>>>\n" + sender);
	        msgVo.setSendName( sender.get(MsgKeys.SEND_NAME.getCode()));
	        msgVo.setSendPhone( sender.get(MsgKeys.SEND_PHONE.getCode()));              
	        msgVo.setSendSyspayno( sender.get(MsgKeys.SEND_SYSPAYNO.getCode()));         
        } else {
        	System.out.println(">>>>>>>>>>>>>>> default >>>>>>>>>>>>>>>\n" + defaultSender);
	        msgVo.setSendName( defaultSender.get(MsgKeys.SEND_NAME.getCode()));
	        msgVo.setSendPhone( defaultSender.get(MsgKeys.SEND_PHONE.getCode()));              
	        msgVo.setSendSyspayno( defaultSender.get(MsgKeys.SEND_SYSPAYNO.getCode()));              	
        }
		System.out.println(">>>>>>>>>>>>>>> default >>>>>>>>>>>>>>>\n" + msgVo);
		return msgVo;
	}
	
	public List<Map<String,String>> getReceivers(){
		List<MsgTemplateVo> templateVars = this.getTemplateVars();
		if (null == templateVars) return null;
		
		List<Map<String,String>> list = new ArrayList<>();
		for (MsgTemplateVo template :  templateVars){
			Map<String,String> receiver = new HashMap<>();
			receiver.put( MsgKeys.DEST_NAME.getCode(), template.getDestName());
			receiver.put( MsgKeys.DEST_PHONE.getCode(), template.getDestPhone());
			receiver.put( MsgKeys.DEST_SYSPAYNO.getCode(), template.getDestSyspayno());
			list.add(receiver);
		}
		return list;
	}
	public Map<String,String> getReceiver() {
		return this.reciever;
	}
	public Map<String,String> getSender() {
		return this.sender;
	}

	public Integer getMsgType() {
		return msgType;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public String getSendTime() {
		return sendTime;
	}

	public String getMsgBody() {
		return msgBody;
	}

	public String getBusinessYn() {
		return businessYn;
	}

	public String getSubject() {
		return subject;
	}

	public String getAttachedFile() {
		return attachedFile;
	}

	public String getTemplateCode() {
		return templateCode;
	}

	public String getReType() {
		return reType;
	}

	public String getReBody() {
		return reBody;
	}
	public String getSyspayno() {
		return syspayno;
	}
	public Business getBusiness() {
		return business;
	}
	public List<MsgTemplateVo> getTemplateVars() {
		return this.templateVars;
	}		
	public boolean isLogging() {
		return this.logging;
	}	
		
	public static class Builder {
			
		private final String   syspayno;
		private final Business business;
		private final Messages messages;
		
		private boolean logging = true;
		private int msgType;
		private String requestTime;
		private String sendTime;
		private String msgBody;
		private String businessYn;
		private Map<String,String> reciever;
		private Map<String,String> sender;
		private String subject;
		private String attachedFile;
		private String templateCode;
		private String reType;
		private String reBody;
		private List<MsgTemplateVo> templateVars;
		
        public Builder(String syspayno, Business business, Messages  messages) {
        	this.syspayno = syspayno;
        	this.business = business;
        	this.messages = messages;
        	this.msgType = messages.getValue();
        }
          
        public Builder requestTime 	(String requestTime ) { this.requestTime  = requestTime ; return this; }  
        public Builder sendTime    	(String sendTime    ) { this.sendTime     = sendTime    ; return this; }        
        public Builder msgBody     	(String msgBody     ) { this.msgBody      = msgBody     ; return this; }        
        public Builder businessYn  	(String businessYn  ) { this.businessYn   = businessYn  ; return this; }
        public Builder reciever   	(Map<String,String> reciever ) { this.reciever  = reciever ; return this; }
        public Builder sender   	(Map<String,String> sender   ) { this.sender    = sender   ; return this; }       
        public Builder subject     	(String subject     ) { this.subject      = subject     ; return this; }        
        public Builder attachedFile	(String attachedFile) { this.attachedFile = attachedFile; return this; }   
        public Builder templateCode	(String templateCode) { this.templateCode = templateCode; return this; }        
        public Builder reType      	(String reType      ) { this.reType       = reType      ; return this; }        
        public Builder reBody      	(String reBody      ) { this.reBody       = reBody      ; return this; }
        public Builder templateVars (List<MsgTemplateVo> templateVars) { this.templateVars = templateVars; return this; }
        public Builder logging(boolean logging) {
            this.logging = logging;
            return this;
        }        
        public BizMsg build() {
            return new BizMsg(this);
        }        
	}
}                