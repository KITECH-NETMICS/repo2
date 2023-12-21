package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.ArrayList;
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
import kr.re.kitech.biz.hum.apy.dao.HumApyAllowDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyAllowService;
import kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAllowVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 가족수당신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name humApyAllowServiceImpl.java
 * @Description 가족수당신청 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.11.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.11.
 * @version 1.0
 * @see
 * 
 */
 
@Service("humApyAllowServiceImpl")
public class HumApyAllowServiceImpl extends EgovAbstractServiceImpl implements HumApyAllowService {

	@Resource(name="humApyAllowDAO")
	private HumApyAllowDAO apyDAO;

  	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;   
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	

    /**
     * 가족수당신청 목록조회 
     *
	 * @author 김상미
	 * @param  HumApyAllowInfoVo
	 * @return List<HumApyAllowInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */			  
	@Override
	public List<HumApyAllowInfoVo> selectList(HumApyAllowInfoVo vo) throws KitechException {
	  List<HumApyAllowInfoVo> list = apyDAO.selectList(vo);	
	  return list;

	}
	
    /**
     * 가족수당신청 정보 조회 
     *
	 * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return HumApyAllowVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
	@Override
	public HumApyAllowVo select(HumApyAllowInfoVo vo) throws KitechException {
		HumApyAllowVo resVo = new HumApyAllowVo();
		HumApyAllowInfoVo infoVo = new HumApyAllowInfoVo();
		List<HumApyRctFamInfoVo> famList = new ArrayList<HumApyRctFamInfoVo>();
		List<HumApyRctFamInfoVo> famAddList = new ArrayList<HumApyRctFamInfoVo>();
		if (vo.getReq_no().equals("")) {
			infoVo = apyDAO.selectHumApyUserBasicInfo(vo);
			famList = apyDAO.selectHumApyBasicFamList(vo);
			resVo.setHumApyAllowInfoVo(infoVo);
			resVo.setBeforeList(famList);
		} else {
			infoVo = apyDAO.selectHumApyAllowBasic(vo);
			if(infoVo != null){
				resVo.setHumApyAllowInfoVo(infoVo);
				
				//변경전 가족사항 리스트
				vo.setBf_clsf("B");
				famList = apyDAO.selectHumApyReqRctFamList(vo);
				resVo.setBeforeList(famList);
				
				//변경후 가족사항 리스트			
				vo.setBf_clsf("P");
				famAddList = apyDAO.selectHumApyReqRctFamList(vo);			
				resVo.setAfterList(famAddList);	
				
				if (infoVo.getApr_state().equals("XAD015")) {
					DocCommentsVo docVo = new DocCommentsVo();
					docVo.setReq_no(vo.getReq_no());
					docVo.setOpt_type("rejecttop");
					resVo.setDocList(apprCommonService.selectDocComments(docVo));		
				}		
			}
		}
		return resVo;
	}
	
    /**
     * 결재진행중인 가족수당신청서 유무 조회 
     *
	 * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
	@Override
	public HumApyAllowInfoVo selectDupCheck(HumApyAllowInfoVo vo) throws KitechException {
		return apyDAO.selectHumApyAprDuplCheck(vo);
	}
	
    /**
     * 가족수당신청서 등록
     *
	 * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */	
	@Override
	public HumApyAllowInfoVo saveAllowInfo(HumApyAllowVo vo) throws KitechException {
		HumApyAllowInfoVo resVo = new HumApyAllowInfoVo();
		HumApyAllowInfoVo allowInfoVo = vo.getHumApyAllowInfoVo();
		String req_no = allowInfoVo.getReq_no();
		if (req_no.equals("")) {
			String gen = "";
			String req_typ = allowInfoVo.getReq_typ(); //H13
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), req_typ);
			req_no = gen;
			allowInfoVo.setReq_no(req_no);	
			allowInfoVo.setReq_typ(req_typ);
			apyDAO.insert(allowInfoVo);
			apprFuncService.formInit(gen, allowInfoVo.getService_id(), KitechContextUtil.getUserId());				
		} else {			
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(allowInfoVo.getService_id(), allowInfoVo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}
			allowInfoVo.setUpdt_syspayno(allowInfoVo.getSyspayno());
			apyDAO.update(allowInfoVo);

		}

		String syspayno = allowInfoVo.getSyspayno();
		List<HumApyRctFamInfoVo> beforeList = vo.getBeforeList();
		if (beforeList.size() > 0) {
			for (HumApyRctFamInfoVo bVo : beforeList) {
				if (bVo.getCud_type().equals("insert")) {
					bVo.setReq_no(req_no);
					bVo.setRegst_syspayno(syspayno);
					bVo.setHuman_dedct_yn(convertFlag(bVo.getHuman_dedct_yn()));
					bVo.setCohbt_yn(convertFlag(bVo.getCohbt_yn()));
					bVo.setObst_yn(convertFlag(bVo.getObst_yn()));
					bVo.setFam_payamt_yn(convertFlag(bVo.getFam_payamt_yn()));
					apyDAO.insertRctFam(bVo);
				}
			}
		}

		List<HumApyRctFamInfoVo> afterList = vo.getAfterList();
		if (afterList.size() > 0) {
			for (HumApyRctFamInfoVo aVo : afterList) {
				aVo.setReq_no(req_no);
				aVo.setRegst_syspayno(syspayno);
				aVo.setHuman_dedct_yn(convertFlag(aVo.getHuman_dedct_yn()));
				aVo.setCohbt_yn(convertFlag(aVo.getCohbt_yn()));
				aVo.setObst_yn(convertFlag(aVo.getObst_yn()));
				aVo.setFam_payamt_yn(convertFlag(aVo.getFam_payamt_yn()));
				if (aVo.getCud_type().equals("insert")) {
					apyDAO.insertRctFam(aVo);				
				} else if (aVo.getCud_type().equals("update")) {
					apyDAO.updateRctFam(aVo);	
				}
			}
		
		}
		
		String apr_state = allowInfoVo.getApr_state(); 
		if (allowInfoVo.isApproval()) {
			//신청서
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(allowInfoVo.getReq_no());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setUiId(allowInfoVo.getService_id());	
			aprVo.setInfoCd(allowInfoVo.getInfo_cd());			
			apprFuncService.approvalScreen(aprVo);
		}
		
		resVo.setApr_state(apr_state);
		resVo.setReq_no(req_no);
		return resVo;
	}
	

    /**
     * 가족수당신청정보 삭제
     *
	 * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
	@Override
	public void delete(HumApyAllowInfoVo vo) throws KitechException {
		apyDAO.deleteRctFam(vo);
		apyDAO.delete(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

    /**
	 * 가족수당신청 전자결제 처리(화면)
     *
	 * @author 김상미
	 * @param HumApyAllowVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
	@Override
	public void formConfirm(HumApyAllowVo vo) throws KitechException {
		// 3. BPM 완료		
		HumApyAllowInfoVo allowInfoVo = vo.getHumApyAllowInfoVo();
		
		String regstSyspayno = allowInfoVo.getRegst_syspayno();
		String syspayno = allowInfoVo.getSyspayno();
		
		List<HumApyRctFamInfoVo> famInfoVoList = apyDAO.selectHumApyAllowDelFamy(allowInfoVo);
		//기본가족에서 제외 대상이 되는지 확인해서 기본가족정보에서 삭제처리
		if (famInfoVoList.size() > 0) {
		 for (HumApyRctFamInfoVo famVo : famInfoVoList) {
			 String deleteFlg = famVo.getDel_flag();
			 if ("D".equals(deleteFlg)) {
				 famVo.setSyspayno(syspayno);
				 apyDAO.deleteBasicFamyInfo(famVo);
			 }
		 }
		}
		
		List<HumApyRctFamInfoVo> afterRctFamList = apyDAO.selectRctFamAfterList(allowInfoVo);
		//변경후 가족리스트에 있는데, 기본가족정보에 없는 경우 기본가족정보에 등록
		if (afterRctFamList.size()>0) {
			for (HumApyRctFamInfoVo afterFamVo : afterRctFamList) {
				afterFamVo.setSyspayno(syspayno);
				afterFamVo.setRegst_syspayno(regstSyspayno);
			    HumApyRctFamInfoVo basicFamVo = apyDAO.selectHumFamyInfo(afterFamVo);
			    if (basicFamVo != null) {
			    	apyDAO.updateHumFamyInfo(afterFamVo);
			    } else {
			    	apyDAO.insertHumFamyInfo(afterFamVo);
			    }
			}
		}	
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(allowInfoVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(allowInfoVo.getApr_state());
		apprFuncService.formAccept(aprVo);			
	}


	/**
	 * 가족수당신청 전자결제 반려(화면)
     *
	 * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
	@Override
	public void formReject(HumApyAllowInfoVo vo) throws KitechException {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());
		apprFuncService.formReject(aprScVo);	
	}
	
	/**
	 * flag 값 변환 처리
     *
	 * @author 김상미
	 * @param String
	 * @return String
	 * @since 2023.08.11.
     */	
	private String convertFlag(String flag) {
		return (flag !=null && flag.equals("1")) ? "Y" :"N";
	}
}
