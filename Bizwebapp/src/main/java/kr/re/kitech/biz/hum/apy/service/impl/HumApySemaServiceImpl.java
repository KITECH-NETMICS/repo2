package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApySemaDAO;
import kr.re.kitech.biz.hum.apy.service.HumApySemaService;
import kr.re.kitech.biz.hum.apy.vo.HumApySemaAprVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySemaInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 적립형공제신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name HumApySemaServiceImpl.java
 * @Description 적립형공제신청 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.09.25      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.09.25.
 * @version 1.0
 * @see
 * 
 */
 
@Service("humApySemaServiceImpl")
public class HumApySemaServiceImpl extends EgovAbstractServiceImpl implements HumApySemaService {
	@Resource(name="humApySemaDAO")
	private HumApySemaDAO apyDAO;

	@Resource(name = "generationServiceImpl")
	public GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;   
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService; 

	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	
	
    /**
     * 적립형공제신청 목록 조회
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return List<HumApySemaInfoVo>
	 * @throws KitechException
	 * @since 2023.09.25.  
	 */
	@Override
	public List<HumApySemaInfoVo> selectList(HumApySemaInfoVo vo) throws KitechException {
		List<HumApySemaInfoVo> resVo = apyDAO.selectList(vo);
		return resVo;
	}

    /**
     * 적립형공제신청 정보 조회 
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return HumApySemaVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	@Override
	public HumApySemaAprVo select(HumApySemaInfoVo vo) throws KitechException {
		HumApySemaAprVo resVo = new HumApySemaAprVo();
		HumApySemaInfoVo infoVo = apyDAO.select(vo);
			
		if (infoVo != null) {
			if (infoVo.getApr_state().equals("XAD015")) {
				DocCommentsVo docVo = new DocCommentsVo();
				docVo.setReq_no(vo.getReq_no());
				docVo.setOpt_type("rejecttop");
				resVo.setDocList(apprCommonService.selectDocComments(docVo));	
			}
			
	    	infoVo.setSalry_cd(vo.getSalry_cd());
	    	
	    	//가입금액 세팅
	    	this.setTotSemaAmt(infoVo);
		}
    	
		resVo.setInfoVo(infoVo);
		
		return resVo;
	}

	/**
	 * 신규 신청으로 진입시 결재진행 중인 적립형공제신청건 유무 조회
 	 * 
	 * @author 김상미
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	@Override
	public HumApySemaInfoVo selectHumApySemaDupCheck(HumApySemaInfoVo vo) throws KitechException {
		HumApySemaInfoVo resVo = apyDAO.selectHumApySemaDupCheck(vo);
		return resVo;
	}

	/**
     * 적립형공제신청 사용자 정보 조회 
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
	 */
    @Override
	public HumApySemaInfoVo selectEmpInfo(HumApySemaInfoVo vo) throws KitechException {
    	HumApySemaInfoVo resVo = apyDAO.selectEmpInfo(vo);
    	
    	resVo.setSalry_cd(vo.getSalry_cd());
    	
    	//가입금액 세팅
    	this.setTotSemaAmt(resVo);
    	
		return resVo;
	}

	/**
     * 적립형공제신청 등록
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25.  
	 */
	@Override
	public HumApySemaInfoVo save(HumApySemaInfoVo vo) throws KitechException {
		HumApySemaInfoVo resVo = new HumApySemaInfoVo();
		String req_no = vo.getReq_no();
		if (req_no.equals("")) {
			String gen = "";
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDoc_id());
			
			vo.setReq_no(gen);	
			
			apyDAO.insert(vo);
			apprFuncService.formInit(gen, vo.getService_id(), KitechContextUtil.getUserId());
		} else {
		
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(vo.getService_id(), vo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}
			
			//신청서 내용 변경처리
			apyDAO.update(vo);
			if (vo.isApproval()) {
				//신청서
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(vo.getReq_no());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setInfoCd(vo.getInfo_cd());
				aprVo.setUiId(vo.getService_id());				
				apprFuncService.approvalScreen(aprVo);
			}	
		}
		resVo.setReq_no(vo.getReq_no());		
		return resVo;
	}

    /**
     * 적립형공제신청 삭제
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25.  
	 */
	@Override
	public void delete(HumApySemaInfoVo vo) throws KitechException {
		apyDAO.delete(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

    /**
	 * 적립형공제신청 전자결제 처리(화면)
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
     */
	@Override
	public void formConfirm(HumApySemaInfoVo vo) throws KitechException {	
		apyDAO.updateHumApySemaEmpBasicInfo(vo);
		apyDAO.updateHumApySemaSlBasInfo(vo);
		
		// 3. BPM 완료
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getApr_state());
		apprFuncService.formAccept(aprVo);	
	}
	
	/**
	 * 적립형공제신청 전자결제 반려(화면)
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
     */
	@Override
	public void formReject(HumApySemaInfoVo vo) throws KitechException {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());

		if (AprState.isComplate(vo.getApr_state())) {
			aprScVo.setEndpoint("system");
			apprFuncService.formAuthReject(aprScVo);
		} else {
			apprFuncService.formReject(aprScVo);
		}
	}

	/**
	 * 전체가입금액계산
 	 * 
	 * @author 김상미
	 * @param HumApySemaInfoVo
	 * @return int
	 * @throws KitechException
     * @since 2023.09.25.
     */
	private void setTotSemaAmt(HumApySemaInfoVo infoVo) throws KitechException {
		int totSemaAmt = 0;
		
		String totBankaccntNo = infoVo.getTot_bankaccnt_no();
		
		HumApySemaInfoVo slAmtVo = apyDAO.selectHumApySemaCalcBase(infoVo);
		String slAmt = slAmtVo.getCalc_base();
		totSemaAmt = Integer.parseInt(totBankaccntNo) * (int)Float.parseFloat(slAmt);
		
		infoVo.setCalc_base(slAmt);
	    infoVo.setTotal_sema_amt(totSemaAmt);
	}
}
