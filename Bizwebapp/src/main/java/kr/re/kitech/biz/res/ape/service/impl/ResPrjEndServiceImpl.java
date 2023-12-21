package kr.re.kitech.biz.res.ape.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.res.ape.dao.ResPrjEndDAO;
import kr.re.kitech.biz.res.ape.service.ResPrjEndService;

/**
 * @ClassSubJect 과제정산 ServiceImpl
 * @Class Name ResPrjEndServiceImpl.java
 * @Description 과제정산 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/14      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/14
 * @version 1.0
 * @see
 * 
 */
@Service("resPrjEndService")
public class ResPrjEndServiceImpl extends EgovAbstractServiceImpl implements ResPrjEndService {
	@Resource(name="finComDepstReqService")
	private FinComDepstReqService depstService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService finSlipService;
	
	@Resource(name="resPrjEndDAO")
	private ResPrjEndDAO dao;

	/**
    * 연구비정산결의취소
    * @param String unslipNo
    * @author LeeYH
    * @since 2022.07.13.
    */
	@Override
	public void deleteResPrjEndSlip(String unslipNo, String reqNo) throws ElException {
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);
		
		// 2) 잔액정산 삭제 및 잔액생성 수정
		depstService.deleteFspRamtAdjst(unslipNo, false);
		
		// 3) 연구비정산 반납 헤더 저장
		FinSpaSlipUpdVo vo = new FinSpaSlipUpdVo();
		vo.setUnslip_no(unslipNo);
		dao.updateResEnyrAdjReqHDel(vo);
		
		// 4) xomxintfatab 결의결재상태 테이블 삭제
		dao.deleteXomxintfatab(unslipNo);
		
		// 5) 전자증빙 결의번호 빈값처리 및 크리스피드 전자증빙 삭제 호출
		vo.setRqst_no(unslipNo);
		vo.setReq_no(reqNo);
		vo.setUnslip_no("");
		attachService.updateFspEvidAttach(vo);
	}

}
