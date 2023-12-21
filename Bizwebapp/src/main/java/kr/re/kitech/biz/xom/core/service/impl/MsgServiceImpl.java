package kr.re.kitech.biz.xom.core.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.core.dao.MsgDAO;
import kr.re.kitech.biz.xom.core.dao.MsgTemplateDAO;
import kr.re.kitech.biz.xom.core.service.MsgService;
import kr.re.kitech.biz.xom.core.vo.MsgVo;


/**  
 * @ClassSubJect 메시지 발송 테이블 관련 처리를 담당하는 MyBatis Impl
 * @Class Name AttachServiceImpl.java
 * @Description 메시지 발송 테이블  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/18   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/18
 * @version 1.0
 * @see
 * 
 */
@Service("msgServiceImpl")
public class MsgServiceImpl  extends EgovAbstractServiceImpl implements MsgService {

    @Resource(name="msgDAO")
    private MsgDAO msgDAO;
	
    @Resource(name="msgTemplateDAO")
    private MsgTemplateDAO msgTemplateDAO;	
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
    
    @Override
    public String getContentByTemplateCode(String templateCode) throws Exception {
    	Map<String,String> templateMap = this.msgTemplateDAO.getContentByTemplateCode(templateCode);
    	return templateMap.get("template_cont");
    }
	 
    @Override
    public String getContentStrByTemplateCode(String templateCode) throws Exception {
    	return this.msgTemplateDAO.getContentStrByTemplateCode(templateCode);
    }
	 	 
	@Override
	public boolean insertMessage(MsgVo message) throws Exception {
		return 0 < msgDAO.insertMessage(message);
	}
	
}
