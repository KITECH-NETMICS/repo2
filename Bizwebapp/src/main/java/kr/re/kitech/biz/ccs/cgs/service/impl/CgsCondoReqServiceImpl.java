package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cgs.dao.CgsCondoReqDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsCondoReqService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;

/**
 * @ClassSubJect : 콘도신청 serviceImpl
 * @Class Name : CgsCondoReqServiceImpl.java
 * @Description : 콘도신청 서비스 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Service("cgsCondoReqServiceImpl")
public class CgsCondoReqServiceImpl  extends EgovAbstractServiceImpl implements CgsCondoReqService {
    @Resource(name="cgsCondoReqDAO")
    private CgsCondoReqDAO cgsDAO;
      
  	@Resource(name="mailSender")
  	private MailSender mailSender;
    
	@Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;    
	
	//결재관련 추가
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
    
   /**
    * 콘도신청 목록 조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return List<CgsCondoReqVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    @Override
    public List<CgsCondoReqVo> selectList(CgsCondoReqVo vo) throws ElException {
    	List<CgsCondoReqVo> list = cgsDAO.selectListCondoReq(vo);	
    	return list;
    }
    
   /**
    * 콘도신청 상세 조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return CgsCondoReqVo
    * @throws ElException
    * @since 2023.08.30.   
    */
	@Override
	public CgsCondoReqVo selectItem(CgsCondoReqVo vo) throws ElException {
		CgsCondoReqVo resultVO = cgsDAO.selectCondoReq(vo);			
	    return resultVO;
	}
    
   /**
    * 콘도신청 등록
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return CgsCondoReqVo
    * @throws ElException
    * @since 2023.08.30.   
    */
 	@Override
	public CgsCondoReqVo insertItem(CgsCondoReqVo vo) throws ElException, IOException {
 		CgsCondoReqVo resultVo = new CgsCondoReqVo();
	
 		if("C".equals(vo.getCud_type())){ // 신규등록일때
			vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C58"));
			cgsDAO.insertItem(vo);
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(vo.getReq_no(), "C21D", "");
		}else{ // 수정일때
		
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab("C21D", vo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}
			
			// 콘도신청 수정
			cgsDAO.updateItem(vo);
			
			//전자결재 반려,회수후 신청화면 [저장]버튼을 클릭하면 인터페이스 테이블에 재신청이 가능하게 "XAD005" 수정
			if ("XAD015".equals(vo.getApr_state())) {
				aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
			}
		}
		
		if(vo.isApproval()){
    		// 결재정보
	    	AprVo aprVo = new AprVo();
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setReqNo(vo.getReq_no());
			aprVo.setUiId("C21D"); //서비스ID
			aprVo.setExt1Cd(vo.getReq_psn_nm()); 
			aprVo.setExt2Cd(vo.getRegion_nm()); 
				
			apprFuncService.approvalScreen(aprVo, vo);
    	}
	
		resultVo.setReq_no(vo.getReq_no());
 		return resultVo;
	}
    
   /**
    * 콘도신청 신청상태 수정(취소, 취소확정, 예약확정, 승인, 반려)
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return void
    * @throws Exception
    * @since 2023.08.30.   
    */
  	@Override
	public void updateReqState(CgsCondoReqVo vo) throws Exception {
  		// 처리구분(req_flag) : 취소요청, 취소확정, 예약확정 - cancel / 승인, 반려 - proc
  		// 동작구분(req_action) : 승인 - agree, 반려 - reject, 취소요청 - reqCancel, 취소확정 - confirmCancel, 예약확정 - confirmReserv
  		// 취소요청, 예약확정의 경우에는 신청상태코드(req_state)만 변경
  		if("cancel".equals(vo.getReq_flag())){
  			if("confirmCancel".equals(vo.getReq_action())){ // 취소확정 
  				aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
  			}
  			// 콘도신청 신청상태변경시 수정
  			cgsDAO.updateCondoReqCancel(vo);
  		}else if("proc".equals(vo.getReq_flag())){
  			if("agree".equals(vo.getReq_action())){ // 승인
  				AprVo aprVo = new AprVo();			
				aprVo.setReqNo(vo.getReq_no());	//신청번호
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(vo.getReq_psn_syspayno());
				aprVo.setUiId("C21D");
				aprVo.setOperCode("0");
				aprVo.setBiz(true);
				aprVo.setResult("");
				aprVo.setEndpoint(KitechContextUtil.getUserId());	//아이디
				
				// 승인처리
				apprFuncService.formAccept(aprVo);	
  				
  			}else if("reject".equals(vo.getReq_action())){ // 반려
  				AprScVo aprScVo = new AprScVo();		
				aprScVo.setReqNo(vo.getReq_no());			//신청번호	
				aprScVo.setComments(vo.getRejct_resn());	//반려사유
				aprScVo.setEndpoint(KitechContextUtil.getUserId());
				
				// 반려처리
				if (AprState.isComplate(vo.getApr_state())) {
					// 담당자 반려처리
					apprFuncService.formAuthReject(aprScVo);
				} else {
					apprFuncService.formReject(aprScVo);
				}
  			}
  			
  			// 콘도신청 승인, 반려 처리시 수정 
  			cgsDAO.updateCondoReqReject(vo);
  		}
	}
    
   /**
    * 콘도신청 삭제
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return void
    * @throws ElException
    * @since 2023.08.30.   
    */
  	@Override
	public void deleteItem(CgsCondoReqVo vo) throws ElException {
  		cgsDAO.deleteItem(vo);
	
		// 결재정보 삭제
		apprFuncService.formRemove(vo.getReq_no());
	}
	
   /**
    * 콘도 지역명 목록 조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return List<CgsCondoReqVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    @Override
    public List<CgsCondoReqVo> selectCondoRegion(CgsCondoReqVo vo) throws ElException {
    	List<CgsCondoReqVo> list = cgsDAO.selectCondoRegion(vo);	
    	return list;
    }
    
   /**
    * 콘도명 목록 조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return List<CgsCondoReqVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    @Override
    public List<CgsCondoReqVo> selectCondoNm(CgsCondoReqVo vo) throws ElException {
    	List<CgsCondoReqVo> list = cgsDAO.selectCondoNm(vo);	
    	return list;
    }

    /**
     * 콘도신청관리 목록 조회
     * 
     * @author lsh
     * @param CgsCondoReqVo
     * @return List<CgsCondoReqVo>
     * @throws ElException
     * @since 2023.08.30.   
     */
    @Override
    public List<CgsCondoReqVo> selectListCondoReqMnt(CgsCondoReqVo vo) throws ElException {
    	List<CgsCondoReqVo> list = cgsDAO.selectListCondoReqMnt(vo);	
    	return list;
    }
    
    /**
     * 콘도신청관리 수정
     * 
     * @author lsh
     * @param List<CgsCondoReqVo>
     * @return void
     * @throws ElException
     * @since 2023.08.30.   
     */
    @Override
    public void updateCondoReqMnt(List<CgsCondoReqVo> listVo) throws ElException {
    	for(CgsCondoReqVo vo : listVo){
    		cgsDAO.updateCondoReqMnt(vo);
    	}
    }
}
