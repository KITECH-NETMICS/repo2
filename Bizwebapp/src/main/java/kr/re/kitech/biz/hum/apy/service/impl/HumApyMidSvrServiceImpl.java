package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApyMidSvrDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyMidSvrService;
import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrVo;
import kr.re.kitech.biz.hum.apy.vo.HumSlmmPayAmtVo;
import kr.re.kitech.biz.hum.apy.vo.HumslBasInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 퇴직금중간정산신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name HumApyMidSvrServiceImpl.java
 * @Description 퇴직금중간정산신청 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.31.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
 
@Service("humApyMidSvrServiceImpl")
public class HumApyMidSvrServiceImpl extends EgovAbstractServiceImpl implements HumApyMidSvrService {

	@Resource(name="humApyMidSvrDAO")
	private HumApyMidSvrDAO apyDAO;
	
	@Resource(name = "generationServiceImpl")
	public GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;   
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService; 

	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;		

    /**
     * 퇴직금중간정산신청 리스트조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return List<HumApyMidSvrInfoVo>
	 * @throws KitechException
	 * @since 2023.08.31.
	 */	
	@Override
	public List<HumApyMidSvrInfoVo> selectList(HumApyMidSvrInfoVo vo) throws KitechException {
		List<HumApyMidSvrInfoVo> list = apyDAO.selectList(vo);
		return list;
	}

    /**
     * 퇴직금중간정산신청 대상여부 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumslBasInfoVo
	 * @throws KitechException
	 * @since 2023.08.31
	 */	
	@Override
	public HumslBasInfoVo selectEmpState(HumslBasInfoVo vo) throws KitechException {	
		return apyDAO.selectEmpState(vo);
	}

    /**
     * 퇴직금중간정산신청 상세 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	@Override
	public HumApyMidSvrVo select(HumApyMidSvrInfoVo vo) throws KitechException {
		HumApyMidSvrVo resVo = new HumApyMidSvrVo();
		HumApyMidSvrInfoVo infoVo = apyDAO.select(vo);

		if (infoVo != null){
			if (infoVo.getApr_state().equals("XAD015")) {
				DocCommentsVo docVo = new DocCommentsVo();
				docVo.setReq_no(vo.getReq_no());
				docVo.setOpt_type("rejecttop");
				resVo.setDocList(apprCommonService.selectDocComments(docVo));	
			}		
		
			//퇴직충당금 조회 세팅
			String retireAppro ="";
			HumSlmmPayAmtVo payAmtVo = apyDAO.selectSlmmPayAmt(infoVo);
			retireAppro = payAmtVo.getRetire_appro();
			infoVo.setRetire_appro(retireAppro);
			resVo.setHumApyMidSvrInfoVo(infoVo);
		}
		return resVo;
	}
		
    /**
     * 퇴직금중간정산 신청자 기본 정보 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */		
	@Override
	public HumApyMidSvrInfoVo selectEmpInfo(HumApyMidSvrInfoVo vo) throws KitechException {
		HumApyMidSvrInfoVo infoVo = new HumApyMidSvrInfoVo();
		infoVo = apyDAO.selectEmpInfo(vo);
		
		//퇴직충당금 조회 세팅
		String retireAppro ="";
		HumSlmmPayAmtVo payAmtVo = apyDAO.selectSlmmPayAmt(infoVo);
		retireAppro = payAmtVo.getRetire_appro();
		infoVo.setRetire_appro(retireAppro);
		
		return infoVo;
	}

    /**
     * 퇴직금중간정산신청 건수 조회
	 * 
	 * @author 김상미
	 * @param vo 퇴직금중간정산신청 HumApyMidSvrInfoVo
	 * @return 퇴직금중간정산신청 HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */		
	@Override
	public HumApyMidSvrInfoVo selectReqCount(HumApyMidSvrInfoVo vo) throws KitechException {
		return apyDAO.selectReqCount(vo);
	}

    /**
     * 퇴직충당금조회
	 * 
	 * @author 김상미
	 * @param  HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */		
	@Override
	public HumApyMidSvrInfoVo selectSalBasicInfo(HumApyMidSvrInfoVo vo) throws KitechException {
		return apyDAO.selectSalBasicInfo(vo);
	}

    /**
     * 퇴직금중간정산신청 정보 등록
	 * 
	 * @author 김상미
	 * @param  HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	@Override
	public HumApyMidSvrInfoVo save(HumApyMidSvrInfoVo vo) throws KitechException {
		HumApyMidSvrInfoVo resVo = new HumApyMidSvrInfoVo();
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
				aprVo.setUiId(vo.getService_id());		
				aprVo.setInfoCd(vo.getInfo_cd());		
				apprFuncService.approvalScreen(aprVo);
			}	
		}
		resVo.setReq_no(vo.getReq_no());		
		return resVo;
	}

    /**
     * 퇴직금중간정산신청 정보 삭제
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	@Override
	public void delete(HumApyMidSvrInfoVo vo) throws KitechException {
		apyDAO.delete(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

	/**
	 * 퇴직금중간정산신청 결재상태 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	@Override
	public HumApyMidSvrInfoVo selectApr(HumApyMidSvrInfoVo vo) throws KitechException {
		return apyDAO.select(vo);
	}

	/**
	 * 퇴직금중간정산신청 신청 전자결제 처리(화면)
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	@Override
	public void formConfirm(HumApyMidSvrInfoVo vo) throws KitechException {
		// 3. BPM 완료
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getApr_state());
		apprFuncService.formAccept(aprVo);	
	}

	/**
	 * 퇴직금중간정산신청 신청 전자결제 반려(화면)
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	@Override
	public void formReject(HumApyMidSvrInfoVo vo) throws KitechException {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());
		apprFuncService.formReject(aprScVo);
	}
	
}
