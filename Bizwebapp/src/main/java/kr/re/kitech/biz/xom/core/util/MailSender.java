package kr.re.kitech.biz.xom.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.enums.Attaches;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.enums.Progress;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.model.BizMail;
import kr.re.kitech.biz.xom.core.service.AttachService;
import kr.re.kitech.biz.xom.core.service.LoggingService;
import kr.re.kitech.biz.xom.core.vo.AttachVo;
import kr.re.kitech.biz.xom.core.vo.MailTemplateVo;

/**
 * 메일 발송 지원 클래스
 *
 * @author James
 * @since 2022. 3. 28.
 */
@Component("mailSender")
//@PropertySource("classpath:inswave/properties/elfw.properties")
public class MailSender {

    @Value("${mail.isExecute}")
    private Boolean exceute;
    
    @Value("${mail.template.base}")
    private String templateBase;
    
    @Value("${mail.template.ext}")
    private String templateExt;
    
    @Value("${mail.template.buffer.size}")
    private int bufferSize;
    
    @Value("${mail.saved.folder.name}")
    private String savedFolder;
    
    @Value("${mail.default.sender.name}")
    private String senderName;
    
    @Value("${mail.default.sender.email}")
    private String senderEmail;
    
    /** AttachService */
    @Resource(name = "attachServiceImpl")
    private AttachService attachService;    
    
	@Resource(name = "loggingServiceImpl")
	private LoggingService loggingService;

	@Autowired
	private JavaMailSender javaMailSender;
	
	
	public Boolean isExecute() {
		return this.exceute;
	}
	
	public String getSenderEmail(){
		return this.senderEmail;
	}
	
	/**
	 * [내부 메소드]
	 * 실제 경로를 가져온다.
	 * 
	 * @param module
	 * @return
	 */
	private String getTemplateFullPath(String module) {
		return String.format("%s%s.%s", this.templateBase, module, this.templateExt);
	}
	
    /**
	 * [내부 메소드]
	 * 호출시 발신자를 설정하지 않으면 디폴트 발신자를 반환하여 처리한다.
	 *
     * @return
     * @throws UnsupportedEncodingException
     */
    private InternetAddress getSender() throws UnsupportedEncodingException{
    	return new InternetAddress(this.senderEmail, this.senderName);
    }
    	
	/**
	 * [내부 메소드]
	 * 템플릿 Html 파일을 읽어 String으로 반환한다.
	 * 
	 * Minimize I/O operations by reading an array at a time, not a byte at a time. An 8Kbyte array is a good size. 
	 * Minimize method calls by getting data an array at a time, not a byte at a time. Use array indexing to get at bytes in the array. 
	 * Minimize thread synchronization locks if you don't need thread safety.
 	 * Either make fewer method calls to a thread-safe class, or use a non-thread-safe class like FileChannel and MappedByteBuffer. 
	 * Minimize data copying between the JVM/OS, internal buffers, and application arrays.
	 * Use FileChannel with memory mapping, or a direct or wrapped array ByteBuffer.
	 * 
	 * @param templatePath
	 *            템플릿 모듈명 ( 업무폴더/모듈명 )
	 * @return content 결과 문자열.
	 * @throws FileNotFoundException
	 *             FileInputStream을 얻지 못했을 때
	 * @throws UnsupportedEncodingException
	 *             결과값 UTF8 인코딩 실패시
	 * @throws IOException
	 *             그 외의 파일 IO 관련 오류시
	 * @throws Exception
	 */
	private String getTemplateContent(String templatePath) throws FileNotFoundException, UnsupportedEncodingException, IOException {

		StringBuilder result = new StringBuilder();
		FileInputStream is = null;
		FileChannel ch = null;
		try {
			is = new FileInputStream(this.getTemplateFullPath(templatePath));
			ch = is.getChannel();
			MappedByteBuffer mb = ch.map(FileChannel.MapMode.READ_ONLY, 0L, ch.size());

			byte[] barray = new byte[this.bufferSize];
			int nGet;
			while (mb.hasRemaining()) {
				nGet = Math.min(mb.remaining(), this.bufferSize);
				mb.get(barray, 0, nGet);
				result.append(new String(barray, 0, nGet, "UTF-8"));
			}
		} finally {
			try {
				if (null != ch) ch.close();
				if (null != is) is.close();
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}
		}
		return result.toString();
	}
	
	/**
	 * [내부 메소드]
	 * 메일 템플릿 콘텐츠 내용중 템플릿 변수의 값을 치환한 후 반환한다. 
	 * 템플릿 변수가 맵 형태이므로 반환되는 탬플릿도 단건(스트링)이다.
	 * 
	 * @param content
	 * @param templateVar
	 * @return
	 * @throws Exception
	 */
	private String mappingContentToTemplateVar(String content, Map<String, String> templateVar) throws Exception {
		if (null != content && null != templateVar) {
			for (Iterator<String> it = templateVar.keySet().iterator(); it.hasNext();) {
				String key = it.next();
				System.out.println(">>>>>>>>>>>>>>>>>> key : " + key + ", value : " + templateVar.get(key));
				String value = templateVar.get(key);
				if (null == value) {
					value = "";
				}
				// IllegalArgumentException 방지
				value = value.replaceAll("%(?![0-9a-fA-F]{2})", "%25");
				// @@ html tag 변수인 경우 디코딩 그외의 경우는 라인과 공백을 html 태그 처리한다.
				value = (0 == key.indexOf("@@")) ? URLDecoder.decode(value, StandardCharsets.UTF_8.toString()) : StringEscapeUtils.escapeHtml3(value);
				// IllegalGroupReference 방지
				value = java.util.regex.Matcher.quoteReplacement(value);
				// % -> %25로 표현되는 부분 방지
				value = value.replace("%25", "%");
				content = content.replaceAll(key, value);
			}
		}
		return content;
	}

	/**
	 * [내부메소드]
	 * 플랜 텍스트, 정적 탬플릿, 동적 템플릿을 구분하여 제목과 본문을 구성한다.
	 *
	 * @param mail BizMail 객체
	 * @return 제목 리스트와 본문 리스트로 구성된 맵 객체
	 * @throws Exception 모든 예외 위힘
	 */
	private Map<String,List<String>> getSubjectAndContents(BizMail mail) throws Exception {

		// 플랜택스트 및 템플릿 구분햐여 content 및 subject 파싱 필요.
		List<String> subjects = new ArrayList<>();
		List<String> contents = new ArrayList<>();

		if (null == mail.getTemplatePath()){
			// 정적 택스트
			subjects.add( mail.getSubject());
			contents.add( mail.getContent());				
		} else {
			// 템플릿
			List<MailTemplateVo> templateVars = mail.getTemplateVars();
			if (null == templateVars || 1 > templateVars.size()) {
				// 정적 템플릿: 탬플릿 변수가 없으므로 템플릿만 읽어옴
				subjects.add( mail.getSubject());
				contents.add( this.getTemplateContent(mail.getTemplatePath()));
				
			} else {
				// 동적 템플릿: 탬플릿 변수가 있으므로 변수의 사이즈 만큼 파싱
				for (MailTemplateVo templateVar : templateVars){
		    		@SuppressWarnings("unchecked")
		    		Map<String,String> subjectMap = templateVar.getSubjectVar();				
					subjects.add( this.buildSubject( mail.getSubject(), subjectMap));
		    		
		    		@SuppressWarnings("unchecked")
		    		Map<String,String> contentMap = templateVar.getContentVar();							
					contents.add( this.buildContent( mail.getTemplatePath(), contentMap));
				}
			}
		}
		Map<String,List<String>> result = new HashMap<>();
		result.put("subjects", subjects);
		result.put("contents", contents);

		return result;	
	}
	
	
	
	/**
	 * History 를 저장한다.
	 *
	 * @param mail
	 * @param isSuccess
	 * @return
	 * @throws InterruptedException
	 */
	private boolean saveHistory(BizMail mail, String toAddress, Progress progress, String messageId, String subject) throws Exception {

		Map<String,String> mailSendLog = new HashMap<>();
		mailSendLog.put( "from_address", (null != mail.getFromAddress()) ? mail.getFromAddress() : this.getSender().getAddress());
		mailSendLog.put( "cc_address", mail.getCcAddress());
		mailSendLog.put( "bcc_address", mail.getBccAddress());
		mailSendLog.put( "template_path", mail.getTemplatePath());
		
		mailSendLog.put( "regst_syspayno", mail.getSyspayno());
		mailSendLog.put( "sysclsf_cd", mail.getBusiness().getCode());
		mailSendLog.put( "log_type", progress.getCode());

		mailSendLog.put( "subject", subject);
		mailSendLog.put( "to_address", toAddress);
		mailSendLog.put( "mimemessageid", messageId);
		mailSendLog.put( "is_success", (null!=messageId ? "t" : "f"));
		AppLog.debug( "mime message id: [" + messageId + "]");
		
		return (0 < loggingService.insertMailSendLog(mailSendLog));
	}
	

	/**
	 * 제목을 파싱한다.
	 * 
	 * @param templatePath
	 * @return
	 * @throws Exception
	 */	
	public String buildSubject(String subject, Map<String, String> templateVar) throws Exception {
		return this.mappingContentToTemplateVar(subject, templateVar);
	}	
	
	/**
	 * 메일 템플릿 콘텐츠 내용만 가져온다. 
	 * 
	 * @param templatePath
	 * @return
	 * @throws Exception
	 */
	public String buildContent(String templatePath) throws Exception {
		return this.buildContent(templatePath, null);
	}
	
	/**
	 * 메일 템플릿 콘텐츠 내용을 가져온다. 
	 * 템플릿 변수가 파라미터에 없는 경우이므로 치환없이 템플릿 내용을 그대로 단건으로 가져온다.
	 * 
	 * @param templatePath
	 * @return
	 * @throws Exception
	 */	
	public String buildContent(String templatePath, Map<String, String> templateVar) throws Exception {
		String content = this.getTemplateContent(templatePath);
		return this.mappingContentToTemplateVar(content, templateVar);
	}
	
	/**
	 * 첨부파일 추가
	 *
	 * @param messageHelper
	 * @param attachFileNo
	 */
	public void buildAttach(MimeMessageHelper messageHelper, String attachFileNo){
		if (!StringUtils.isEmpty(attachFileNo)){
			// 첨부파일 파라미터 구성	
			List<AttachVo> attaches = attachService.selectListAttach(attachFileNo);
			attaches.forEach(attach -> {
				try {
					String realPath = StringUtils.cleanPath( Attaches.BIZ_STORAGE_ROOT.getCode() + File.separator + attach.getAttachFullPath());
					messageHelper.addAttachment( attach.getOrgFile(), new File(realPath));
				} catch (Exception ex) {
					AppLog.error("첨부파일 추가시 오류 발생", ex);
					throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.send.mail.attach.error", ex);	
				}
	        });
        }
    }

	
	/**
	 * 아래 케이스에 대한 메일을 발송한다.
	 *
	 * 1. 단일 메시지 일괄 발송
	 * 2. 단일 메시지 개별 발송
	 * 3. 단일 템플릿을 일괄 발송
	 * 4. 단일 템플릿을 개별 발송
	 * 5. 다중 템플릿을 개별 발송
	 * @param mail BizMail 객체
	 * @throws Exception 모든 예외를 던진다.
	 */
	public void sendMessage(BizMail mail){
		try {
			if (this.isExecute()) {
				MimeMessage mimeMessage = javaMailSender.createMimeMessage();
			    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
			    
			    // 1. 단일 속성 설정: 발신자, 참조자, 숨은 참조자
			    System.out.println("\n >>>>>>>>>>>>>>>>>> sender : " + mail.getSender());
			    messageHelper.setFrom((null != mail.getSender()) ? mail.getSender() : this.getSender());
			    if (null != mail.getCcAddr()) messageHelper.setCc(mail.getCcAddr());
			    if (null != mail.getBccAddr()) messageHelper.setBcc(mail.getBccAddr());
				    
				    
				// 플랜택스트 및 템플릿 구분햐여 content 및 subject 파싱 필요.
			    Map<String,List<String>> data = this.getSubjectAndContents(mail);
			    
				// 일괄 발송 여부 구분 필요
				if (mail.isOnesend()) {
					if (1 != data.get("contents").size()){
						// 논리 오류: 일괄발송에서 한개의 본문이 구성되어야 한다.
						throw new KitechException(Exceptions.ERROR, Business.XOM, "");
					}
	
					// 일괄 발송인 경우 메일 객체의 수신자를 이용하여 한번에 발송한다.
					System.out.println("\n >>>>>>>>>>>> toAddr : " + mail.getToAddr()[0]);
					messageHelper.setTo( mail.getToAddr());
					messageHelper.setSubject( data.get("subjects").get(0));		// 제목
					messageHelper.setText( data.get("contents").get(0), true);	// 본문
					this.buildAttach( messageHelper, mail.getAttachFileNo());	// 첨부파일
					this.javaMailSender.send(mimeMessage);
					if (mail.isLogging()){
						this.saveHistory( mail, mail.getToAddress(), Progress.ING, mimeMessage.getMessageID(), data.get("subjects").get(0));
					}
				} else {
					// 개별 발송인 경우 정적 텍스트/템플릿 OR 동적 템플릿 
				    List<MailTemplateVo> templateVars = mail.getTemplateVars();		// 수신자, 제목 변수, 내용 변수		
					if (null == mail.getTemplatePath() || (null != templateVars && 1 == templateVars.size())) {
						// 정적 텍스트 및 정적 템플릿의 개별 발송은 본문 수가 1개여야 한다.
						for (String address : mail.getToAddr()){
							messageHelper.setTo( address);
							messageHelper.setSubject( data.get("subjects").get(0));		// 제목
							messageHelper.setText( data.get("contents").get(0), true);	// 본문		
							this.buildAttach( messageHelper, mail.getAttachFileNo());	// 첨부파일
							this.javaMailSender.send(mimeMessage);
							if (mail.isLogging()){
								this.saveHistory( mail, address, Progress.ING, mimeMessage.getMessageID(), data.get("subjects").get(0));
							}						
						}
					} else {
						// 동적 템플릿의 개별 발송은 수신자 수와 본문 수가 일치하여야 한다.
						if (null != templateVars && templateVars.size() != data.get("contents").size()){
							// 논리 오류: 일괄발송에서 한개의 본문이 구성되어야 한다.
							throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.send.mail.error.template");
						}
						
						for (int index = 0; index < templateVars.size(); index++){
				    		// 받는 사람 설정
				    		MailTemplateVo templateVar = templateVars.get(index);
							messageHelper.setTo( templateVar.getToAddr());
							messageHelper.setSubject( data.get("subjects").get(index));		// 제목
							messageHelper.setText( data.get("contents").get(index), true);	// 본문	
							this.buildAttach( messageHelper, mail.getAttachFileNo());	// 첨부파일
							this.javaMailSender.send( mimeMessage);
							if (mail.isLogging()){
								this.saveHistory( mail, templateVar.getToAddr(), Progress.ING, mimeMessage.getMessageID(), data.get("subjects").get(index));
							}
				    	}
					}
				}
			}
		} catch (MessagingException me) {
			AppLog.error("메일 받는사람/제목/내용 설정 오류", me);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.send.mail.error.name", me);	
		} catch (KitechException ke) {
			AppLog.error("메일 사용자 정의 오류", ke);
			throw ke;    
		} catch (Exception ex) {
			AppLog.error("메일 기타 시스템 오류", ex);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.send.mail.error", ex);	
		} 
	}
}
