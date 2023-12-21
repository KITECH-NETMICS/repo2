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
import kr.re.kitech.biz.hum.apy.dao.HumApyAnutyDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyAnutyService;
import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAnutyVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 과학기술인연금신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name HumApyAnutyServiceImpl.java
 * @Description 과학기술인연금신청 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.25.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.25.
 * @version 1.0
 * @see
 * 
 */
 
@Service("humApyAnutyServiceImpl")
public class HumApyAnutyServiceImpl extends EgovAbstractServiceImpl implements HumApyAnutyService {
	@Resource(name="humApyAnutyDAO")
	private HumApyAnutyDAO apyDAO;
	
  	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;   
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	
	
	/**
	 * 과학기술인연금신청 리스트 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return List<HumApyAnutyInfoVo>
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public List<HumApyAnutyInfoVo> selectList(HumApyAnutyInfoVo vo) throws KitechException {
		return apyDAO.selectList(vo);
	}

	/**
	 * 과학기술인연금신청 상세 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return List<HumApyAnutyInfoVo>
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public HumApyAnutyVo select(HumApyAnutyInfoVo vo) throws KitechException {
		HumApyAnutyVo resVo = new HumApyAnutyVo();
		HumApyAnutyInfoVo humApyAnutyInfoVo = new HumApyAnutyInfoVo(); 

		if(vo.getReq_no().equals("")){
			humApyAnutyInfoVo = apyDAO.selectEmpInfo(vo);
		}else{
			humApyAnutyInfoVo = apyDAO.select(vo);
			if(humApyAnutyInfoVo != null){
				if(humApyAnutyInfoVo.getApr_state().equals("XAD015")){
					DocCommentsVo docVo = new DocCommentsVo();
					docVo.setReq_no(vo.getReq_no());
					docVo.setOpt_type("rejecttop");
					resVo.setDocList(apprCommonService.selectDocComments(docVo));	
				}
			}
		}

		String slAmt = "";
		HumApyAnutyInfoVo codeVo = new HumApyAnutyInfoVo(); //급여관련 코드 조회용 vo 선언
		codeVo = apyDAO.selecXodhSlCode(vo);
		slAmt = codeVo.getCalc_base();
		humApyAnutyInfoVo.setCalc_base(slAmt);
		resVo.setHumApyAnutyInfoVo(humApyAnutyInfoVo);
		
		return resVo;
	}

	/**
	 * 과학기술인연금신청 등록/결재요청/수정
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public HumApyAnutyInfoVo save(HumApyAnutyInfoVo vo) throws KitechException {
		HumApyAnutyInfoVo resVo = new HumApyAnutyInfoVo();
		String req_no = vo.getReq_no();
		if(req_no.equals("")){
			String gen = "";
			String req_typ = vo.getDoc_id(); 
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), req_typ);
			req_no = gen;
			vo.setReq_no(req_no);		
			apyDAO.insert(vo);
			apprFuncService.formInit(gen, vo.getService_id(), KitechContextUtil.getUserId());			
		}else{
	
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(vo.getService_id(), vo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}
			
			//신청서 내용 변경처리		
			apyDAO.update(vo);
								
			if(vo.isApproval()){
				//신청서
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(vo.getReq_no());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setUiId(vo.getService_id());			
				aprVo.setInfoCd(vo.getInfo_cd());	
				apprFuncService.approvalScreen(aprVo);		
			}
		}
		
		resVo.setReq_no(vo.getReq_no());
		return resVo;
	}

	/**
	 * 과학기술인연금신청 삭제
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public void delete(HumApyAnutyInfoVo vo) throws KitechException {
		apyDAO.delete(vo);
		apprFuncService.formRemove(vo.getReq_no());		
	}
	
	/**
	 * 과학기술인연금신청 결재상태 조회
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @return HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public HumApyAnutyInfoVo selectApr(HumApyAnutyInfoVo vo) throws KitechException {
		HumApyAnutyInfoVo resVo = new HumApyAnutyInfoVo();
		resVo = apyDAO.select(vo);
		return resVo;
	}

	/**
	 * 과학기술인연금신청 신청 전자결제 처리(화면)
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public void formConfirm(HumApyAnutyInfoVo vo) throws KitechException {
		// 3. BPM 완료
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getApr_state());
		apprFuncService.formAccept(aprVo);
		//승인이 되면 후속 처리를 하도록 위치.
		if(vo.getReq_typ().equals("HSF001")){
			apyDAO.insertAnutyRet(vo);
		}
		apyDAO.updateEmpBasicInfo(vo);
		apyDAO.updateSlBasInfo(vo);
	}

	/**
	 * 과학기술인연금신청 신청 전자결제 반려(화면)
	 *
	 * @author 김상미	
	 * @param HumApyAnutyInfoVo
	 * @throws KitechException
	 * @since 2023.08.25.
	 */
	@Override
	public void formReject(HumApyAnutyInfoVo vo) throws KitechException {
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
}
