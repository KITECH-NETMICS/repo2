package kr.re.kitech.biz.ccs.cgs.service.impl;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.cgs.dao.CgsCommDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsCommService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo;


/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CwsOutWorkServiceImpl.java
 * @Description 재택근무신청  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
@Service("cgsCommServiceImpl")
public class CgsCommServiceImpl  extends EgovAbstractServiceImpl implements CgsCommService {

    @Resource(name="cgsCommDAO")
    private CgsCommDAO cgsCommDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
    
	@Override
	public Object selectEmp(Object cgsCommVo) {
		// TODO Auto-generated method stub
		AppLog.debug("+++++++++++++++++++++++++++++++++++++++"+cgsCommVo.toString());
		return cgsCommDAO.selectEmp((CgsCommVo)cgsCommVo);
	}
	
}
