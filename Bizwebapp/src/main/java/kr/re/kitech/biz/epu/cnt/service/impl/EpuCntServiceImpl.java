package kr.re.kitech.biz.epu.cnt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.epu.cnt.dao.EpuCntDAO;
import kr.re.kitech.biz.epu.cnt.service.EpuCntService;

/**  
 * @ClassSubJect 구매계약업무를 처리하는 Service
 * @Class Name : EpuCntServiceImpl.java
 * @Description : 구매계약업무를 처리하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/02/10   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/02/10
 * @version 1.0
 * @see
 * 
 */
@Service("epuCntService")
public class EpuCntServiceImpl extends EgovAbstractServiceImpl implements EpuCntService {
	@Resource(name="epuCntDAO")
	private EpuCntDAO dao;
	
}
