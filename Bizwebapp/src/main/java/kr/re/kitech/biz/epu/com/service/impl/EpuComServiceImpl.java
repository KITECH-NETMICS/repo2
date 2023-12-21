package kr.re.kitech.biz.epu.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprManageService;
import kr.re.kitech.biz.apr.vo.AprMngVo;
import kr.re.kitech.biz.epu.cnt.vo.BblenfrcVo;
import kr.re.kitech.biz.epu.cnt.vo.CtrlAmtProcVo;
import kr.re.kitech.biz.epu.com.dao.EpuCommonDAO;
import kr.re.kitech.biz.epu.com.service.EpuComService;
import kr.re.kitech.biz.epu.com.vo.EpuComCodeG2bVo;
import kr.re.kitech.biz.epu.com.vo.PurAprVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 구매공통업무를 처리하는 Service
 * @Class Name : EpuComServiceImpl.java
 * @Description : 구매공통업무를 처리하는 ServiceImpl
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
@Service("epuComService")
public class EpuComServiceImpl extends EgovAbstractServiceImpl implements EpuComService {
	@Resource(name="apprManagerService")
	private ApprManageService aprManageService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="epuCommonDAO")
	private EpuCommonDAO dao;
	
	/**
     * 구매 통제금액 조회
     * @param String
     * @return List<BblenfrcVo>
     * @throws Exception
     * @author LeeYH
     * @since 2023.02.10.
     */
	public List<BblenfrcVo> selectBblenfrcChngAmt(BblenfrcVo vo) throws KitechException{
		return dao.selectBblenfrcChngAmt(vo.getReq_no());
	}
	
	/**
     * 구매 원인행위금액 정리
     * @param CtrlAmtProcVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.02.10.
     */
	public void processCauseAmt(CtrlAmtProcVo vo) throws KitechException{
		List<BblenfrcVo> ctrlList = dao.selectBblenfrcChngAmt(vo.getReq_no());
		if(ctrlList != null && ctrlList.size() > 0){
			for(BblenfrcVo ctrlVo : ctrlList){
				// bblenfrc.enfrc_amt_cause 정리
				dao.updateBblenfrcCtrlAmt(ctrlVo);
				
				// 예산 원인행위금액 정리
				dao.updateBblBugtActRsltCauseAmt(ctrlVo);
			}
		}
		
		// 통합프로세스 삭제
		if(vo.getBid_ord_no() != null && !"".equals(vo.getBid_ord_no().trim())){
			AprMngVo mngVo = new AprMngVo();
			mngVo.setName(vo.getBid_ord_no());
			
			if("P81".equals(vo.getBid_ord_no().substring(0, 3))){
				mngVo.setDefname("내자구매 통합프로세스");
			}else{
				mngVo.setDefname("외자구매 통합프로세스");
			}
			aprManageService.removeBpmProcInst(mngVo);
		}
		
		// 구매요구서 purreqmastr에 삭제 플래그 저장
		dao.updatePurReqDelFlag(vo.getReq_no());
	}
	
	/**
     * 재공고시 신규공고 상태로 되돌리도록 프로세스를 수정
     * @param PurAprVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.02.13.
     */
	public void processPurApr(PurAprVo vo) throws Exception{
		dao.updatePurReqItemOrderCd(vo.getPur_req_no());
	}
	
	/**
     * G2b 공통코드 조회
     * @param EpuComCodeG2bVo
     * @return List<EpuComCodeG2bVo>
     * @throws Exception
	 * @author LeeYH
     * @since 2023.08.08.
     */
	public List<EpuComCodeG2bVo> selectEpuComCodeG2b(EpuComCodeG2bVo vo) throws KitechException{
		return dao.selectEpuComCodeG2b(vo);
	}
	
	/**
     * 구매담당자 부서정보 조회
     * @param String sysPayNo
     * @return ApiEpuVo
     * @throws Exception
	 * @author LeeYH
     * @since 2023.08.21.
     */
	public ApiEpuVo selectChrgPsnDeptInfo(String sysPayNo) throws KitechException{
		return dao.selectChrgPsnDeptInfo(sysPayNo);
	}
}
