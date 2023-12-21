package kr.re.kitech.biz.xom.core.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.core.dao.LoggingDAO;
import kr.re.kitech.biz.xom.core.service.LoggingService;
import kr.re.kitech.biz.xom.core.vo.MailVo;


/**  
 * @ClassSubJect 공통첨부파일테이블 관련 처리를 담당하는 MyBatis Impl
 * @Class Name AttachServiceImpl.java
 * @Description 공통첨부파일테이블  처리를 담당하는 구현체 서비스
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
@Service("loggingServiceImpl")
public class LoggingServiceImpl  extends EgovAbstractServiceImpl implements LoggingService {

    @Resource(name="loggingDAO")
    private LoggingDAO loggingDAO;

    @Override
	public int insertMailSendLog(Map<String,String> mailSendLog) throws Exception {
		return loggingDAO.insertMailSendLog(mailSendLog);	
	}

	@Override
	public int insertMsgSendLog(Map<String, String> msgSendLog) throws Exception {
		return loggingDAO.insertMsgSendLog(msgSendLog);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.LoggingService#insertMailFailLog(kr.re.kitech.biz.xom.core.vo.MailVo)
	 */
	@Override
	public int insertMailFailLog(MailVo vo) throws Exception {
		return loggingDAO.insertMailFailLog(vo);
	}
	
}
