package kr.re.kitech.biz.res.exc.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.res.exc.dao.ResExcExeBdgetDAO;
import kr.re.kitech.biz.res.exc.service.ResExcExeBdgetService;
import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo;
import kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : ResExcExeBdgetServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.16.    김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.10.16.
 * @version 1.0
 * @see
 * 
 */
@Service("resExcExeBdgetServiceImpl")
public class ResExcExeBdgetServiceImpl  extends EgovAbstractServiceImpl implements ResExcExeBdgetService {
	@Resource(name="resExcExeBdgetDAO")
	private ResExcExeBdgetDAO excDAO;

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
	 * 실행예산편성관리 목록 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetList(ResExcExeBdgetInfoVo vo) throws KitechException {
		List<ResExcExeBdgetInfoVo> resVo = excDAO.selectResExcExeBdgetList(vo);	
		return resVo;
	}
	
	/**
	 * 실행예산(계정) 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public ResExcExeBdgetInfoVo selectResExcBdgetAcctm(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetInfoVo resVo = excDAO.selectResExcBdgetAcctm(vo);		
	    ResExcExeBdgetInfoVo consWorkFileVo = excDAO.selectResExcConsWorkFile(vo);	
	    if (consWorkFileVo != null) {
	    	resVo.setCons_work_file(consWorkFileVo.getCons_work_file());
	    }
		return resVo;
	}

	/**
	 * 실행예산신청번호를 가지고 과제번호,계정번호 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */	
	@Override
	public ResExcExeBdgetInfoVo selectResExcBdgetPrjAccntNoByReqNo(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetInfoVo resVo = excDAO.selectResExcBdgetPrjAccntNoByReqNo(vo);			
		return resVo;
	}

	/**
	 * 계정별 실행예산상태, 실행예산차수 MAX, 계정상태 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public ResExcExeBdgetVo selectResExcBdgetState(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetVo resVo = new ResExcExeBdgetVo();
		
		ResExcExeBdgetInfoVo infoVo = excDAO.selectResExcBdgetState(vo);	
		ResExcExeBdgetInfoVo agreeSumVo = excDAO.selectResBgAgreeSum(vo);	
		if (infoVo != null) {
			if (agreeSumVo != null) {
				infoVo.setMax_anal(agreeSumVo.getMax_anal());
				infoVo.setOthr_accnt_amt_sum(agreeSumVo.getOthr_accnt_amt_sum());
			}
			vo.setAccnt_no1(vo.getAccnt_no().substring(0, 7) + "0"); // 계정번호
			vo.setItm_solve_base1(vo.getItm_solve_base());
			vo.setItm_solve_base2(vo.getItm_solve_base());
			vo.setPrj_no1(vo.getPrj_no());
			vo.setAccnt_no2(vo.getAccnt_no());		
			List<ResExcExeBdgetInfoVo> listVo =  excDAO.selectResExcBdgetAgree(vo);
				
			resVo.setInfoVo(infoVo);
			resVo.setListVo(listVo);
		}
		return resVo;
	}
	
	/**
	 * 계정별 대비목/세부비목에 대한 차수별 실행예산 내역 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public List<ResExcExeBdgetVo> selectResExcBdgetExect(ResExcExeBdgetInfoVo vo) throws KitechException {
		List<ResExcExeBdgetVo> resVo = new ArrayList<ResExcExeBdgetVo>();	
		int bdgetMaxSeq = Integer.valueOf(vo.getExec_bugt_seq_max());
		if(bdgetMaxSeq > 0){
			for (int i=1; i <= bdgetMaxSeq; i++) {
				ResExcExeBdgetInfoVo paramVo = new ResExcExeBdgetInfoVo();
				ResExcExeBdgetVo mapVo = new ResExcExeBdgetVo();
				paramVo = vo;
				paramVo.setExec_bugt_seq(String.valueOf(i));
				List<ResExcExeBdgetInfoVo> detailList = excDAO.selectResExcBdgetExect(paramVo);
				mapVo.setDetailList(detailList);
				resVo.add(i-1, mapVo);
			}
		}
		return resVo;
	}
	
	/**
	 * 계정의 실행예산에 대한 검증 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  	
	@Override
	public ResExcExeBdgetInfoVo selectCheckResBgExectAmt(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetInfoVo resVo = new ResExcExeBdgetInfoVo();
		
		String accntClsf = vo.getAccnt_no(); // 계정구분
		double aggreeTotSum = Double.valueOf(vo.getBg_agree_tot_sum_sum());// 협약예산 총합
		double bugtItem = Double.valueOf(vo.getBugt_item_amt()); // 실행예산 총합
		double aggree026Sum = Double.valueOf(vo.getBg_agree_026_sum_sum()); // 연구과제추진비 협약예산 총합
		double bugt026Item = Double.valueOf(vo.getBugt_item_026_amt()); // 연구과제추진비 실행예산 총합
		String accntNo = vo.getAccnt_no2();
		String mainAccntNo = accntNo.substring(0, 7) + "0";
         
		String resultValue = "";
		switch (vo.getAccnt_clsf()) {
			case "RAR001": // 메인계정
			case "RAR002": // 서브계정
				List<ResExcExeBdgetInfoVo> exeBdgetEctList = excDAO.selectResExcExeBdgetEct(vo);
				if (exeBdgetEctList.size() > 0){
					for (ResExcExeBdgetInfoVo exeVo : exeBdgetEctList) {
						double totAmt = Double.valueOf(exeVo.getTot_amt());
						totAmt += bugtItem;
						if (totAmt > aggreeTotSum) { // 실행예산합 > 협약예산합
							resultValue = "stop";
						} else {
							resultValue = "pass";
						}					
					}				
				} else {
					resultValue = "stop";
				}
				break;
			case "RAR003": // 서브계정	
				vo.setAccnt_no(mainAccntNo);
				List<ResExcExeBdgetInfoVo> prjBdgetEctList = excDAO.selectResExcPrjBdgetEct(vo);
				if (prjBdgetEctList.size() > 0){
					for (ResExcExeBdgetInfoVo exeVo : prjBdgetEctList) {
						double totAmt = Double.valueOf(exeVo.getTot_amt());
						if (totAmt >=bugtItem) { 
							resultValue = "stop";
						} else {
							resultValue = "pass";
						}					
					}				
				} else {
					resultValue = "stop";
				}						
				break;
			case "RAR004": // 이월계정	
				vo.setAccnt_no(mainAccntNo);
				List<ResExcExeBdgetInfoVo> prjBdgetEctList2 = excDAO.selectResExcPrjBdgetEct(vo);
				if (prjBdgetEctList2.size() > 0){
					for (ResExcExeBdgetInfoVo exeVo : prjBdgetEctList2) {
						double totAmt = Double.valueOf(exeVo.getTot_amt());
						if (totAmt >=bugtItem) { 
							resultValue = "stop";
						} else {
							resultValue = "pass";
						}					
					}				
				} else {
					resultValue = "stop";
				}						
				break;
		}
		
		if (accntClsf.equals("RAR001") || accntClsf.equals("RAR002")) {
			if (resultValue.equals("pass")) { // pass 일경우 연구과제추진비 체크
				List<ResExcExeBdgetInfoVo> bdgetAgreeList = excDAO.selectResExcBdgetAgreeTotal(vo);
				if (bdgetAgreeList.size() > 0) {
					for (ResExcExeBdgetInfoVo exeVo : bdgetAgreeList) {
						double totAmt = Double.valueOf(exeVo.getTot_026_amt());
						totAmt += bugt026Item;
						if (totAmt > aggree026Sum) {
							resultValue = "stop026";
						} else {
							resultValue = "pass";
						}
					}
				}
			}
		}	
		resVo.setResult_detail(resultValue);	
		return resVo;
	}
	
	/**
	 * Main계정 체크 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */ 
	@Override
	public ResExcExeBdgetInfoVo selectMainAccntChk(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetInfoVo resVo = excDAO.selectMainAccntChk(vo);			
		return resVo;
	}

	/**
	 * 실행예산 내 외부전문기술활용비를 협약예산과 체크
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@Override
	public ResExcExeBdgetInfoVo selectResExcRstAmtChk(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetInfoVo resVo = excDAO.selectResExcRstAmtChk(vo);			
		return resVo;
	}

	/**
	 * 실행예산 내 외부전문기술활용비를 직접비와 체크 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return ResExcExeBdgetInfoVo
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */  
	@Override
	public ResExcExeBdgetInfoVo selectResExcDrctAmtChk(ResExcExeBdgetInfoVo vo) throws KitechException {
		ResExcExeBdgetInfoVo resVo = excDAO.selectResExcDrctAmtChk(vo);			
		return resVo;
	}
	
	/**
	 * 사용자용 실행예산편성 조회
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */	
	@Override
	public List<ResExcExeBdgetInfoVo> selectResExcExeBdgetForUserList(ResExcExeBdgetInfoVo vo) throws KitechException {
		List<ResExcExeBdgetInfoVo> resVo = excDAO.selectResExcExeBdgetForUserList(vo);	
		return resVo;
	}

	/**
	 * 실행예산 변경사유 조회 
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetInfoVo
	 * @return List<ResExcExeBdgetInfoVo>
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public List<ResExcExeBdgetInfoVo> selectResExcBdgetExereList(ResExcExeBdgetInfoVo vo) throws KitechException {
		List<ResExcExeBdgetInfoVo> resVo = excDAO.selectResExcBdgetExereList(vo);	
		return resVo;
	}

	/**
	 * 실행예산 변경사유 수정
	 * 
	 * @author 김상미
	 * @param ResExcExeBdgetVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.10.16.   
	 */
	@Override
	public int saveResExcBdgetExere(ResExcExeBdgetVo vo) throws KitechException {
		ResExcExeBdgetInfoVo infoVo = vo.getInfoVo();
		List<ResExcExeBdgetInfoVo> listVo = vo.getListVo();
		int result = 0;
		
		if (infoVo != null && infoVo.getScrn_clsf().equals("chngResn")) {
			String syspayno = infoVo.getSyspayno();
			
			for (ResExcExeBdgetInfoVo excVo : listVo) {
				excVo.setUpdt_syspayno(syspayno);
				result += excDAO.updateResExcBdgetExere(excVo);
			}
		}
		return result;
	}

	/**
	 * 실행예산 변경 등록
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @return ResExcExeBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@Override
	public ResExcExeBdgetInfoVo saveResExcBdgetData(ResExcExeBdgetVo vo) throws KitechException {
		ResExcExeBdgetInfoVo infoVo = vo.getInfoVo();
		ResExcExeBdgetInfoVo resVo = new ResExcExeBdgetInfoVo();
		List<ResExcExeBdgetInfoVo> listVo = vo.getListVo();		

		String crudTag = infoVo.getCrud_tag(); // Insert or Update Tag
		String req_no = infoVo.getReq_no(); // 전자결재 신청번호
		String reqYmd = new SimpleDateFormat("yyyyMMdd").format(new java.util.Date()); // 신청일자
		String accntNo = infoVo.getAccnt_no(); // 계정번호
		String execBugtSeq = infoVo.getExec_bugt_seq(); // 실행예산차수
		String regstSyspayno = infoVo.getRegst_syspayno(); // 등록시스템개인번호
		String updtSyspayno = infoVo.getUpdt_syspayno(); // 수정시스템개인번호
		String reqPsn = regstSyspayno; // 신청자
		String state = infoVo.getState();

		if(req_no.equals("")){
			if(crudTag.equals("I")){
				String gen = "";
				gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), infoVo.getDoc_id());
				infoVo.setReq_no(gen);
				req_no = gen;
				apprFuncService.formInit(gen, infoVo.getService_id(), KitechContextUtil.getUserId());
			}
		}
		// AprState 체크하는 공통 메소드호출
		try {
		    apprValidService.isWaitStateAtIntfatab(infoVo.getService_id(), infoVo.getReq_no());
		} catch (KitechException ex) {
		    throw ex;
		}	
			
		for (ResExcExeBdgetInfoVo detailVo : listVo) {
			detailVo.setAccnt_no(accntNo);
			detailVo.setExec_bugt_seq(execBugtSeq);
			int res = 0;
			
			switch (detailVo.getCud_flag()) {
			case "update":
				detailVo.setUpdt_syspayno(updtSyspayno);
				res = excDAO.updateResExcBdgetExect(detailVo);// 실행예산 내역 수정
				if (res > 0) // 수정된 내역이 있으면
					break; // OK
				else
					// 수정이 안됐으면
					detailVo.setState(state); // break로 끊지 않고 다음의 insert 로직 진입
			case "insert":
				detailVo.setReq_no(req_no);
				detailVo.setReq_ymd(reqYmd);
				detailVo.setReq_psn(reqPsn);
				detailVo.setRegst_syspayno(regstSyspayno);
				excDAO.insertResExcBdgetExect(detailVo);// 실행예산 내역 등록
				break;
			}			
			 
/*			
			if (detailVo.getCud_flag().equals("update")) {
				detailVo.setUpdt_syspayno(updtSyspayno);
				excDAO.updateResExcBdgetExect(detailVo);
			} else if(detailVo.getCud_flag().equals("insert")) {
				detailVo.setReq_no(req_no);
				detailVo.setReq_ymd(reqYmd);
				detailVo.setReq_psn(reqPsn);
				detailVo.setRegst_syspayno(regstSyspayno);
				excDAO.insertResExcBdgetExect(detailVo);
			} */
		}
		
		if (crudTag.equals("U")) {
			excDAO.updateResExcBdgetExere(infoVo);
		}else if (crudTag.equals("I")){
			excDAO.insertResExcBdgetExere(infoVo);
		}
		resVo.setReq_no(req_no);
		return resVo;
	}
	
	/**
	 * 실행예산 결제 신청
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @return ResExcExeBdgetInfoVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@Override
	public ResExcExeBdgetInfoVo saveResExcBdgetApr(ResExcExeBdgetVo vo) throws KitechException {
		ResExcExeBdgetInfoVo infoVo = vo.getInfoVo();
		ResExcExeBdgetInfoVo resVo = new ResExcExeBdgetInfoVo();
		String reqYmd = new SimpleDateFormat("yyyyMMdd").format(new java.util.Date()); // 신청일자
		infoVo.setReq_ymd(reqYmd);

		// AprState 체크하는 공통 메소드호출
		try {
		    apprValidService.isWaitStateAtIntfatab(infoVo.getService_id(), infoVo.getReq_no());
		} catch (KitechException ex) {
		    throw ex;
		}	
			
					
		excDAO.updateResExcBgacctmState(infoVo);
		ResExcExeBdgetInfoVo bgExectVo = excDAO.selectResExcBdgetState(infoVo);
		excDAO.updateResExcBdgetExectState(infoVo);
		
		resVo.setState(infoVo.getState());
		resVo.setReq_ymd(reqYmd);
		resVo.setReq_psn(infoVo.getReq_psn());
		resVo.setApr_state(bgExectVo.getApr_state());
		resVo.setApr_state_nm(bgExectVo.getApr_state_nm());
		
		AutoBugtVo bugtVo = new AutoBugtVo();
		bugtVo.setAccnt_no(infoVo.getAccnt_no());
		bugtVo = finComService.getAccntAutoBugtPsn2(bugtVo);

		AutoBugtVo bugtMainVo = new AutoBugtVo();
		bugtMainVo = excDAO.selectBudgetResMan(infoVo);
		
		ResExcExeBdgetVo aprBdgetVo = new ResExcExeBdgetVo();
		aprBdgetVo.setInfoVo(infoVo);
		aprBdgetVo.setDetailList(vo.getDetailList());
		
		String currReshRspnsSys = infoVo.getCurr_resch_rspns_sys();
		String manager = bugtMainVo.getBugt_ctrl_psn();
		String accountCharger = bugtVo.getAccnt_rspns();
		String budgetController = bugtVo.getBugt_ctrl_psn();
		String resManager = "";
				
		if (accountCharger.equals(KitechContextUtil.getSyspayno())) {
			accountCharger = "";
		}
		
		if (budgetController.equals(manager)) {
			budgetController = ""; 
		}
		
		if (!currReshRspnsSys.equals(accountCharger)){
			resManager = currReshRspnsSys;
		}		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(infoVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());		
		aprVo.setAprState(infoVo.getApr_state());
		aprVo.setUiId(infoVo.getService_id());
		aprVo.setInfoCd(infoVo.getInfo_cd());
		aprVo.setExt1Cd(infoVo.getAccnt_no());
		aprVo.setExt2Cd(accountCharger);
		aprVo.setManager(manager);
		aprVo.setAccountCharger(accountCharger);
		aprVo.setBudgetController(budgetController);
		aprVo.setResearcher("");
		aprVo.setResManager(resManager);

		//2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
		// 첨부파일 번호로 첨부파일 리스트 조회
		aprBdgetVo.setFileList(attachDAO.selectListAttach(infoVo.getCons_work_file()));
		
		apprFuncService.approvalRequest(aprVo, aprBdgetVo);
		
		return resVo;
	}

	/**
	 * 실행예산 결재 정보 삭제
     *
     * @author 김상미
     * @param  ResExcExeBdgetVo
     * @throws KitechException
	 * @since 2023.10.16. 
	 */
	@Override
	public void deleteResExcBdgetApr(ResExcExeBdgetInfoVo vo) throws KitechException {
		excDAO.updateResExcBgacctmState(vo);
		excDAO.deleteResExcBgExect(vo);
		excDAO.deleteResExcBgExere(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

	
}
