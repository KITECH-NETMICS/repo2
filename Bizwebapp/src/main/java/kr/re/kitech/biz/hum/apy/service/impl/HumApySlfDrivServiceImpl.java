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
import kr.re.kitech.biz.hum.apy.dao.HumApySlfDrivDAO;
import kr.re.kitech.biz.hum.apy.service.HumApySlfDrivService;
import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 자가운전보조비신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name HumApySlfDrivServiceImpl.java
 * @Description 자가운전보조비신청 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.04.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.04.
 * @version 1.0
 * @see
 * 
 */
 
@Service("humApySlfDrivServiceImpl")
public class HumApySlfDrivServiceImpl  extends EgovAbstractServiceImpl implements HumApySlfDrivService {
    @Resource(name="humApySlfDrivDAO")
    private HumApySlfDrivDAO apyDAO;
  
  	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;   
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;

	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;
	
    /**
     * 자가운전보조비신청 목록조회 
	 * @param HumApySlfDrivInfoVo
	 * @return List<HumApySlfDrivInfoVo>
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	@Override
	public List<HumApySlfDrivInfoVo> selectList(HumApySlfDrivInfoVo vo) throws KitechException {
	  List<HumApySlfDrivInfoVo> list = apyDAO.selectList(vo);	
	  return list;
	}

    /**
     * 자가운전보조비 신청 조회
	 * @param HumApySlfDrivInfoVo
	 * @return HumApySlfDrivVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	@Override
	public HumApySlfDrivVo select(HumApySlfDrivInfoVo vo) throws KitechException {
		// TODO Auto-generated method stub
		HumApySlfDrivVo resVo = new HumApySlfDrivVo();
		
		HumApySlfDrivInfoVo slfDrivInfoVo = new HumApySlfDrivInfoVo();
		
		slfDrivInfoVo = apyDAO.select(vo) ;
		resVo.setHumApySlfDrivInfoVo(slfDrivInfoVo);
		
		if (slfDrivInfoVo != null && slfDrivInfoVo.getApr_state().equals("XAD015")) {
			DocCommentsVo docVo = new DocCommentsVo();
			docVo.setReq_no(vo.getReq_no());
			docVo.setOpt_type("rejecttop");
			resVo.setDocList(apprCommonService.selectDocComments(docVo));		
		}
		return resVo;
	}

    /**
     * 자가운전보조비 신청 결재신청 조회
	 * @param  HumApySlfDrivInfoVo
	 * @return HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
  	@Override
	public HumApySlfDrivInfoVo selectAprDirvInfo(HumApySlfDrivInfoVo vo) throws KitechException {
		HumApySlfDrivInfoVo slfDrivInfoVo = new HumApySlfDrivInfoVo();
		slfDrivInfoVo = apyDAO.selectAprDirvInfo(vo) ;
		return slfDrivInfoVo;
	}

    /**
     * 자가운전보조비 신청정보 저장
	 * @param  HumApySlfDrivInfoVo
	 * @return HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	@Override
	public HumApySlfDrivInfoVo save(HumApySlfDrivInfoVo vo) throws KitechException {
		HumApySlfDrivInfoVo resVo = new HumApySlfDrivInfoVo();
		String req_no = vo.getReq_no();
		if(req_no.equals("")){
			String gen = "";
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDoc_id());
			
			vo.setReq_no(gen);	
			
			apyDAO.insert(vo);
			apprFuncService.formInit(gen, vo.getService_id(), KitechContextUtil.getUserId());;			
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
     * 자가운전보조비 신청정보 삭제
	 * @param HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */	
	@Override
	public void delete(HumApySlfDrivInfoVo vo) throws KitechException {
		apyDAO.delete(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

  	/**
	 * 자가운전보조비 신청 전자결제 처리(화면)
	 * @param HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	@Override
	public void formConfirm(HumApySlfDrivInfoVo vo) throws KitechException {
		// 3. BPM 완료
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getApr_state());
		apprFuncService.formAccept(aprVo);
	}

	/**
	 * 자가운전보조비 신청 전자결제 반려(화면)
	 * @param HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	@Override
	public void formReject(HumApySlfDrivInfoVo vo) throws KitechException {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());
		apprFuncService.formReject(aprScVo);				
	}
}
