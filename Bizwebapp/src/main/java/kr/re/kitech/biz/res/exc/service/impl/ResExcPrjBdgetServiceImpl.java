package kr.re.kitech.biz.res.exc.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.server.dao.ResProcessDAO;
import kr.re.kitech.biz.api.server.vo.biz.ResBgAcctmAprVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.res.exc.dao.ResExcPrjBdgetDAO;
import kr.re.kitech.biz.res.exc.service.ResExcPrjBdgetService;
import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : ResExcPrjBdgetServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.24.     김상미	    최초생성
 * 
 * @author 김상미
 * @since 2023.10.24.
 * @version 1.0
 * @see
 * 
 */
@Service("resExcPrjBdgetServiceImpl")
public class ResExcPrjBdgetServiceImpl  extends EgovAbstractServiceImpl implements ResExcPrjBdgetService {
	@Resource(name="resExcPrjBdgetDAO")
	private ResExcPrjBdgetDAO excDAO;

	@Resource(name="resProcessDAO")
	private ResProcessDAO resProcessDAO;
	
  	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;   
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="attachDAO")
	private AttachDAO attachDAO;
	  
	@Resource(name="accntServiceImpl")
	private AccntService accntService;  
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;		

	@Resource(name="finComService")
	private FinComService finComService;	
	  
	/**
	 * PX프로젝트 계정 실행예산 편성 계정 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBudgetVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	@Override
	public List<ResExcPrjBdgetInfoVo> selectResExcPrjBdgetList(ResExcPrjBdgetInfoVo vo) throws KitechException {
		List<ResExcPrjBdgetInfoVo> list = excDAO.selectResExcPrjBdgetList(vo);	
		return list;
	}
	
	/**
	 * 프로젝트예산편성 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBudgetVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */
	@Override
	public ResExcPrjBdgetVo selectPrjAccntBugtDetail(ResExcPrjBdgetInfoVo vo) throws KitechException {
	
		ResExcPrjBdgetVo resVo = new ResExcPrjBdgetVo();
		ResExcPrjBdgetInfoVo masterVo = excDAO.selectPrjAccntBugtMaster(vo);	
		ResExcPrjBdgetInfoVo infoVo = excDAO.selectPrjAccntBugtInfo(vo);	
		List<ResExcPrjBdgetInfoVo> listVo = excDAO.selectResExcPrjAccntBuget(vo);
		
		resVo.setInfoVo(infoVo);
		resVo.setMasterVo(masterVo);
		resVo.setListVo(listVo);
		
	  	return resVo;
	}
	
	/**
	 * 신청번호로 계정번호조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */  
	@Override
	public ResExcPrjBdgetInfoVo selectAccntNoByReqNo(ResExcPrjBdgetInfoVo vo) throws KitechException {
		ResExcPrjBdgetInfoVo resVo = excDAO.selectResPrjAccntBugtByReqno(vo);
		return resVo;
	}	

	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return List<ResExcPrjBdgetVo>
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */	
	@Override
	public List<ResExcPrjBdgetVo> selectResPrjAccntBugt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		List<ResExcPrjBdgetVo> resVo = new ArrayList<ResExcPrjBdgetVo>();
		int bdgetMaxSeq = Integer.valueOf(vo.getExec_bugt_seq_max());
		if(bdgetMaxSeq > 0){
			for (int i=1; i <= bdgetMaxSeq; i++) {
				ResExcPrjBdgetInfoVo paramVo = new ResExcPrjBdgetInfoVo();
				ResExcPrjBdgetVo mapVo = new ResExcPrjBdgetVo();
				paramVo = vo;
				paramVo.setExec_bugt_seq(String.valueOf(i));
				List<ResExcPrjBdgetInfoVo> detailList = excDAO.selectResPrjAccntBugt(paramVo);
				mapVo.setDetailList(detailList);
				resVo.add(i-1, mapVo);
			}
		}
		return resVo;
	}

	/**
	 * 프로젝트얘산편셩 변경 등록
	 * 
	 * @author 김상미
	 * @param ResExcPrjBdgetInfoVo
	 * @return ResExcPrjBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.24.   
	 */ 
	@Override
	public ResExcPrjBdgetInfoVo saveResExcPrjBdgetData(ResExcPrjBdgetVo vo) throws KitechException {
		ResExcPrjBdgetInfoVo resVo = new ResExcPrjBdgetInfoVo();
		
		ResExcPrjBdgetInfoVo infoVo = vo.getInfoVo();
		List<ResExcPrjBdgetInfoVo> listVo = vo.getListVo();
		
		String crudTag = infoVo.getCrud_tag();
		String syspayno = infoVo.getSyspayno();
		String req_no = infoVo.getReq_no();
		
		/*****************************************************************
		 * 01. 실행예산편성/변경 마스터저장
		 *****************************************************************/
		if (req_no.equals("")) {
			String gen = "";
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), infoVo.getDoc_id());
			infoVo.setReq_no(gen);
			req_no = gen;
			apprFuncService.formInit(gen, infoVo.getService_id(), KitechContextUtil.getUserId());
	
			infoVo.setRegst_syspayno(syspayno);
			excDAO.insertResBgPrjbugtm(infoVo);
		} else {
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(infoVo.getService_id(), infoVo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}	
			
			infoVo.setUpdt_syspayno(syspayno);
			excDAO.updateResBgPrjbugtm(infoVo);
		}

		/*****************************************************************
		 * 02. 실행예산편성/변경 내역저장
		 *****************************************************************/	
		String cudType = "";
		int res = 0;
		
		if ("I".equals(crudTag)) {
			for (ResExcPrjBdgetInfoVo itemVo : listVo) {
				cudType = itemVo.getCud_type();
				itemVo.setRegst_syspayno(syspayno);

				if (!"D".equals(cudType)) {
					res = excDAO.insertResBgPrjbugt(itemVo);
				}
				if (res < 0) {
					throw new KitechException(Exceptions.ERROR, Business.RES, "저장중 오류가 발생하였습니다. 관리자에게 문의하세요. ");
				}
			}		
		} else if ("U".equals(crudTag)){
			for (ResExcPrjBdgetInfoVo itemVo : listVo) {
				cudType = itemVo.getCud_type();

				if ("C".equals(cudType)) {
					itemVo.setRegst_syspayno(syspayno);
					res = excDAO.insertResBgPrjbugt(itemVo);
				} else {
					itemVo.setUpdt_syspayno(syspayno);
					res = excDAO.updateResBgPrjbugt(itemVo);
					if (res == 0) {
						itemVo.setRegst_syspayno(syspayno);
						res = excDAO.insertResBgPrjbugt(itemVo);
					}
				}
			}			
		}
		resVo.setReq_no(req_no);
		
		return resVo;
	}
	
	/**
	 * 프로젝트얘산편셩 결제 신청
     *
     * @author 김상미
     * @param  ResExcPrjBdgetVo
     * @return ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@Override
	public ResExcPrjBdgetInfoVo saveResExcPrjBdgetApr(ResExcPrjBdgetVo vo) throws KitechException {
		ResExcPrjBdgetInfoVo resVo = new ResExcPrjBdgetInfoVo();
		ResExcPrjBdgetInfoVo infoVo = vo.getInfoVo();

		// AprState 체크하는 공통 메소드호출
		try {
		    apprValidService.isWaitStateAtIntfatab(infoVo.getService_id(), infoVo.getReq_no());
		} catch (KitechException ex) {
		    throw ex;
		}
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String reqYmd = sdf.format(new java.util.Date()); // 신청일자		
		
		infoVo.setReq_ymd(reqYmd);
		excDAO.updateResBgAcctm(infoVo);		
		
		excDAO.updateResBgPrjbugtm(infoVo);
		
		ResExcPrjBdgetVo aprBdgetVo = new ResExcPrjBdgetVo(); 
		aprBdgetVo.setInfoVo(infoVo);
		aprBdgetVo.setDetailList(vo.getDetailList());
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(infoVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());		
		aprVo.setAprState(infoVo.getApr_state());
		aprVo.setUiId(infoVo.getService_id());
		aprVo.setInfoCd(infoVo.getInfo_cd());
		aprVo.setExt1Cd(infoVo.getAccnt_no());
		aprVo.setExt2Cd("");
		aprVo.setAccountCharger(infoVo.getAccnt_rspns());
		aprVo.setBudgetController(infoVo.getBugt_ctrl_psn());

		// 첨부파일 번호로 첨부파일 리스트 조회
		aprBdgetVo.setFileList(attachDAO.selectListAttach(infoVo.getAttach_file_no()));
		
		apprFuncService.approvalRequest(aprVo, aprBdgetVo);
		
		return resVo;
	}
	
	/**
	 * 이월금변경
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */ 
	@Override
	public void updateCryfwdAmt(ResExcPrjBdgetInfoVo vo) throws KitechException {
		excDAO.updateResCryfwdAmt(vo);
	}
	
	/**
	 * 프로젝트얘산편성 결재 정보 삭제
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@Override
	public void deleteResExcPrjBdgetApr(ResExcPrjBdgetInfoVo vo) throws KitechException {
		excDAO.updateResBgAcctm(vo);
		excDAO.deleteResBgPrjBugt(vo);
		excDAO.deleteResBgPrjBugtm(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

	/**
	 * 예실반영
     *
     * @author 김상미
     * @param  ResExcPrjBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.24.  
	 */
	@Override
	public void saveBugtAplyPrcs(ResExcPrjBdgetInfoVo vo) throws KitechException {
		ResBgAcctmAprVo acctmAprVo = new ResBgAcctmAprVo();
		
		acctmAprVo.setAccnt_no(vo.getAccnt_clsf());
		acctmAprVo.setBugt_ctrl_psn(vo.getSyspayno());
		
		if (vo.getPrcs_clsf().equals("PX")) {
			resProcessDAO.selectSrpResPrjBBlReflect(acctmAprVo);

			vo.setLog_no(vo.getAccnt_no());
		    ResExcPrjBdgetInfoVo resVo = excDAO.selectFcommlog(vo);	
		    		
		    if (resVo != null) {
				int ss_sql = resVo.getSs_sql();
				String ss_desc = resVo.getSs_desc();
				
				if (ss_sql < 0) {
					throw new KitechException(Exceptions.ERROR, Business.RES, "결의서가 생성되지 않았습니다. " + ss_desc);
				}
		    }
		} else {
			resProcessDAO.selectSrpResBBlReflect(acctmAprVo);// n차수 실행예산 내역 예실반영 처리
		}				
	}	
}
