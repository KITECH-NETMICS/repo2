package kr.re.kitech.biz.fin.spa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinSlipSaveDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.spa.dao.FspPayAdvcReqDAO;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.fin.spa.service.FspPayAdvcReqService;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqBankVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqListVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("fspPayAdvcReqServiceImpl")
public class FspPayAdvcReqServiceImpl  extends EgovAbstractServiceImpl implements FspPayAdvcReqService {
  @Resource(name="fspPayAdvcReqDAO")
  private FspPayAdvcReqDAO spaDAO;
  
  /*@Resource(name="EpuPurReqAccntDAO")
  private EpuPurReqAccntDAO ordDAO;*/
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;
  
  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;
  
  @Resource(name="finComAttachService")
  private FinComAttachService attachService;
  
  @Resource(name = "finComService")
  private FinComService finComService;
  
  @Resource(name = "finSlipSaveDAO")
  private FinSlipSaveDAO slipDao;
  
  @Resource(name="attachDAO")
  private AttachDAO attachDAO;  
  
  @Resource(name="finAutoSlipService")
  private FinAutoSlipService finAutoSlipService;
  
  @Resource(name="finSlipSaveService")
  private FinSlipSaveService finSlipService;  
  
  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;  	            
      
 /**
   * 가지급금신청 목록 조회
   * 
   * @author 
   * @param FspPayAdvcReqVo
   * @return List<FspPayAdvcReqVo>
   * @throws KitechException
   * @since 2023.10.06.   
   */
  @Override
  public List<FspPayAdvcReqVo> selectList01(FspPayAdvcReqVo vo) throws KitechException {
    List<FspPayAdvcReqVo> list = spaDAO.selectFspPayAdvcReqList(vo);	
    return list;
  }  

  /**
    * 가지급금신청서 조회
    * @author 
    * @since 2023.10.6.
    */
  @Override
  public FspPayAdvcReqListVo selectFspPayAdvcReq(FspPayAdvcReqVo vo) throws ElException {
    FspPayAdvcReqListVo resultVO = new FspPayAdvcReqListVo();
    resultVO.setFspPayAdvcReqVo(spaDAO.selectFspPayAdvcReq(vo));
    resultVO.setFspPayAdvcReqVoList(spaDAO.selectFspPayAdvcReqGrid(vo));			
      return resultVO;
  }
  
  /**
    * 신청구분선택시회계코드,계정번호,계정책임자가져오기
    * @author 
    * @since 2023.08.24.
    */
  @Override
  public FspPayAdvcReqVo selectFspPayAdvcReqClsf(FspPayAdvcReqVo vo) throws ElException {
     FspPayAdvcReqVo resultVO = new FspPayAdvcReqVo();
     resultVO=spaDAO.selectFspPayAdvcReqClsf(vo);
			
      return resultVO;
  }  

  /**
    * 지급구분이 개인일 경우 별도계좌정보가져오기
    * @author 
    * @since 2023.10.10.
    */
  @Override
  public FspPayAdvcReqBankVo selectFspPayAdvcReqBank(FspPayAdvcReqVo vo) throws ElException {
     FspPayAdvcReqBankVo resultVO = new FspPayAdvcReqBankVo();
     resultVO=spaDAO.selectFspPayAdvcReqBank(vo);
       			
      return resultVO;
  }  
     
  /**
    * 가지급금/전도금신청등록(Insert)
    * @author 
    * @since 2023.10.10.
    */
  @Override
	public FspPayAdvcReqVo insertFspPayAdvcReq(FspPayAdvcReqListVo vo) throws Exception {
    
	String reqNo = null;
	String saveClsf = ""; // 등록/수정구별
	String rgst_syspayno = "";
	String syspayno = "";
	String cudType = "";
	String reqYmd = "";
	String reqDept = "";
	String reqDeptNewYmd = "";
	String rmk = "";
		
	saveClsf = vo.getFspPayAdvcReqVo().getCud_type();
	rgst_syspayno = KitechContextUtil.getSyspayno();
	syspayno = vo.getFspPayAdvcReqVo().getUpdt_syspayno();
	reqYmd = vo.getFspPayAdvcReqVo().getPay_demnd_ymd();
	reqDept = vo.getFspPayAdvcReqVo().getReq_dept();
	reqDeptNewYmd = vo.getFspPayAdvcReqVo().getReq_dept_new_ymd();
	rmk = vo.getFspPayAdvcReqVo().getRmk();
	    
    if ("I".equals(saveClsf)) {
    	//신청번호 채번
    	reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F05");
		vo.getFspPayAdvcReqVo().setReq_no(reqNo);
		
		// 가지급금/전도금 신청테이블(등록)
		spaDAO.insertFspPayAdvcReq(vo.getFspPayAdvcReqVo());
		//인터페이스
		aprComService.createAprInterface(reqNo, "F419", KitechContextUtil.getUserId());
		
    } else {
    	// 가지급금/전도금 신청테이블(수정)
    	spaDAO.updateFspPayAdvcReq(vo.getFspPayAdvcReqVo());
    	reqNo = vo.getFspPayAdvcReqVo().getReq_no();
    }
    
    for (int i = 0; i < vo.getFspPayAdvcReqVoList().size(); i++) {
    	FspPayAdvcReqVo reqstVo = new FspPayAdvcReqVo();
    	reqstVo = vo.getFspPayAdvcReqVoList().get(i);
    	cudType = reqstVo.getCud_type();
    	
    	if ("I".equals(saveClsf)) {
    		// 가지급금신청계정 등록
    		reqstVo.setReq_no(reqNo);
    		reqstVo.setReq_seq(i+1);
    		reqstVo.setCtrl_no("");
    		reqstVo.setBugt_ctrl_way("");
    		reqstVo.setRegst_syspayno(rgst_syspayno);
    		reqstVo.setReq_clsf("FBJ101");
    		reqstVo.setReq_ymd(reqYmd);
    		reqstVo.setRelat_no(reqstVo.getAccnt_rspns().substring(2,8));//개인번호
    		reqstVo.setReq_psn(rgst_syspayno);
    		reqstVo.setReq_dept(reqDept);
    		reqstVo.setReq_dept_new_ymd(reqDeptNewYmd);
    		reqstVo.setRmk_2(rmk);
    		 		
    		spaDAO.insertFspPayAdvcReqAccnt(reqstVo);
    				 			    	    				 		
    		if (!reqstVo.getAccnt_no().equals("FF030001")) {
				finComService.budEnfrcMnt01(reqstVo);				
				spaDAO.updateFspPayAdvcReqAccnt(reqstVo);							
			}
    	
    	} else { // 가지금신청화면에서 신청번호을 클릭한후 신청서화면으로 넘어옴
    			// 정산계정내역에 추가되었을 때
    		FspPayAdvcReqVo reqSeqVo = new FspPayAdvcReqVo();
    		reqSeqVo.setReq_no(reqNo);
    		reqSeqVo = spaDAO.selectFspPayAdvcReqAccnt(reqSeqVo);
    		reqstVo.setReq_no(reqNo);
    		reqstVo.setReq_seq(reqSeqVo.getCnt());
    		reqstVo.setCtrl_no("");
    		reqstVo.setBugt_ctrl_way("");
    		reqstVo.setRegst_syspayno(rgst_syspayno);
    		reqstVo.setReq_clsf("FBJ101");
    		reqstVo.setReq_ymd(reqYmd);
    		reqstVo.setRelat_no(reqstVo.getAccnt_rspns().substring(2,8));//개인번호
    		reqstVo.setReq_psn(rgst_syspayno);
    		reqstVo.setReq_dept(reqDept);
    		reqstVo.setReq_dept_new_ymd(reqDeptNewYmd);
    		reqstVo.setRmk_2(rmk); 
    		
    		if ("C".equals(cudType)) {
    			if (!reqstVo.getAccnt_no().equals("FF030001")) {
    				finComService.budEnfrcMnt01(reqstVo);				
    				spaDAO.updateFspPayAdvcReqAccnt(reqstVo);								
    			}    		   			
    				
    			// 가지급금신청계정 등록
    			spaDAO.insertFspPayAdvcReqAccnt(reqstVo);
    			
	    	  // 정산계정내역이 수정되었을 때
    		} else if ("U".equals(cudType)) {
    			// 가지급금정산계정내역 수정
    			reqstVo.setUpdt_syspayno(syspayno);
    			reqstVo.setReq_seq(i+1);
    			spaDAO.updateFspPayAdvcCalReqAccnt(reqstVo);   			 							
				
				if (!reqstVo.getAccnt_no().equals("FF030001")) {
					//원인행위 삭제
					DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
					enfrcVo.setReq_no(reqstVo.getReq_no());
					if (!StringUtils.isEmpty(String.valueOf(reqstVo.getReq_seq()))) {
						enfrcVo.setReq_seq(String.valueOf(reqstVo.getReq_seq()));
					}
					finComService.deleteBudEnfrcMnt(enfrcVo);
	    			finComService.budEnfrcMnt01(reqstVo);				
								
					spaDAO.updateFspPayAdvcReqAccnt(reqstVo);
				}    			    			
    		}
    	}
    }
    
    //전자증빙 저장
	FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
	paramVo.setDoc_id(reqNo.substring(0, 3));
	List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
	
	for(FspEvidAttachVo evidVo : evidVoList){
		evidVo.setReq_no(reqNo);
		evidVo.setKey_val(reqNo);
	}
	attachService.saveFspEvidAttach(evidVoList);
	
	if (vo.getFspPayAdvcReqVo().isApproval()) {			
		// 결의번호가 있을 경우 삭제
		if(vo.getFspPayAdvcReqVo().getUnslip_no() != null && !"".equals(vo.getFspPayAdvcReqVo().getUnslip_no())){
			finAutoSlipService.deleteFinPayAdvcAdjstSlipMnt(vo.getFspPayAdvcReqVo().getUnslip_no(),vo.getFspPayAdvcReqVo().getReq_no());
		}
		//결의생성
		this.creatFspPayAdvcReqSlip(vo);
		
		//결재신청
		this.approvalFspPayAdvcReq(vo);													
	}
	
    return vo.getFspPayAdvcReqVo();
	}
	
  /**
    * 가지급금신청  결의생성
    * @param FspPayAdvcAdjstListVo
    * @throws Exception
    * @author 
    * @since 2023.10.16.
    */
	private void creatFspPayAdvcReqSlip(FspPayAdvcReqListVo vo) throws Exception{
	
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = null;	
		String unslipNo = "";
		
		// 가지급신청결의데이타 조회
		List<FspPayAdvcReqVo> aprListVo = spaDAO.selectFspPayAdvcReqSlip(vo.getFspPayAdvcReqVo());
		for (FspPayAdvcReqVo aprVo: aprListVo) {
		
			// ============================================================================
			// 01. 결의서 헤드 저장
			// ============================================================================ 	
				
			FspSlipHVo hVo = new FspSlipHVo();
			hVo.setSlip_ymd(aprVo.getReq_ymd());
			hVo.setSlip_typ_cd("160");
			hVo.setWrte_psn(aprVo.getReq_psn());
			hVo.setWrte_dept(aprVo.getReq_dept());
			hVo.setWrte_dept_new_ymd(aprVo.getDept_new_ymd());
			hVo.setDecsn_ex("N");
			hVo.setRmk("가지급금 (" +aprVo.getReq_no()+ ")");
			hVo.setRegst_syspayno(vo.getFspPayAdvcReqVo().getSyspayno());
			
			// 결의서헤더 저장
			unslipNo = finSlipService.saveAutoSlipH(aprVo.getReq_no(), hVo);
			vo.getFspPayAdvcReqVo().setUnslip_no(unslipNo);
			vo.getFspPayAdvcReqVo().setUnslip_odr(1);
			
			// 가지급금신청테이블 unslip_no, unslip_odr 수정(odr은 의미 없음으로 1으로 설정)
			spaDAO.updateFspPayAdvcSlipReq(vo.getFspPayAdvcReqVo());
			
			// ============================================================================
			// 02. 결의서 디테일 생성
			// ============================================================================
			// ============================================================================
			// 02-1. 정산예정계정내역 디테일 차변생성
			// ============================================================================									
			FspSlipDVo dVo = new FspSlipDVo();
			
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(1);
			dVo.setBase_debit_cr("1");
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(1);
			dVo.setRmk_2(aprVo.getDept_nm());
			dVo.setRmk_1(aprVo.getRmk());
			dVo.setFomat_unit(aprVo.getFomat_unit());
			dVo.setAccnt_no(aprVo.getAccnt_no());
			dVo.setAccnt_cd(aprVo.getAccnt_cd());
			dVo.setExpns_cd(aprVo.getExpns_cd());
			dVo.setAttach_file_no(aprVo.getAttach_file_no());
			dVo.setPay_clsf(aprVo.getPay_clsf());
			dVo.setUnslip_amt(aprVo.getReq_amt());
			dVo.setReq_no(aprVo.getReq_no());
			
			slipVo.setSlipDVo(dVo);
			
			//잔액관리항목
			if (dVo.getAccnt_cd().equals("11137010")) { // 팀별가지급금		
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("relat_no", KitechContextUtil.getSyspayno().substring(2, 8)); //개인번호
				map.put("occr_ymd", hVo.getSlip_ymd()); //발생일자
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);									
			} else if (dVo.getAccnt_cd().equals("11137900")) { // 기타가지급금
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("mngmt_2060_nm", aprVo.getRmk()); //관련내용
				map.put("occr_ymd", hVo.getSlip_ymd()); //발생일자
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);
			} else if (dVo.getAccnt_cd().equals("11141010")) { // 팀별전도금
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("dept_cd", aprVo.getReq_dept()); //부서명
				map.put("dept_nm", aprVo.getDept_nm());
				map.put("mngmt_2060_nm", aprVo.getRmk()); //관련내용
				map.put("occr_ymd", hVo.getSlip_ymd()); //발생일자
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);																			
			} else if (dVo.getAccnt_cd().equals("11141020")) { // 기타전도금
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("mngmt_2060_nm", aprVo.getRmk()); //관련내용
				map.put("occr_ymd", hVo.getSlip_ymd()); //발생일자
				
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);									
			}
			
			// ============================================================================
			// 02-2. 정산예정계정내역 디테일 대변생성
			// ============================================================================
			
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			dVo = new FspSlipDVo();
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(2);
			dVo.setBase_debit_cr("2");
			dVo.setJourn_cd("Fn9920");
			dVo.setJourn_odr(1);
			dVo.setRmk_2(aprVo.getDept_nm());
			dVo.setRmk_1(aprVo.getRmk());
			dVo.setFomat_unit(aprVo.getFomat_unit());
			dVo.setAccnt_no(aprVo.getAccnt_no());
			dVo.setAccnt_cd("21009010");
			dVo.setExpns_cd(aprVo.getExpns_cd());
			dVo.setAttach_file_no(aprVo.getAttach_file_no());
			dVo.setPay_clsf(aprVo.getPay_clsf());
			dVo.setUnslip_amt(aprVo.getReq_amt());
			dVo.setReq_no(aprVo.getReq_no());

			slipVo.setSlipDVo(dVo);
			
			// 송금의뢰내역 저장
			List<FspSendReqVo> sendListVo = new ArrayList<>();
			FspSendReqVo sendVo = new FspSendReqVo();
			sendVo.setUnslip_no(unslipNo);
			sendVo.setUnslip_odr(1);
			sendVo.setSend_odr(1);
			sendVo.setSend_amt(0);
			sendVo.setPay_clsf(aprVo.getPay_clsf());
			sendVo.setSyspayno(aprVo.getSyspayno());
			sendVo.setBankaccnt_no(aprVo.getBankaccnt_no());
			sendVo.setBank(aprVo.getBank());
			sendVo.setDepstr_nm(aprVo.getDepstr_nm());
			sendVo.setSend_req_amt(aprVo.getReq_amt());
			sendVo.setRmk(aprVo.getRmk());
			//sendVo.setRegst_syspayno(aprVo.getSyspayno()); -> 필요 없음
								
			sendListVo.add(sendVo);
										
			slipVo.setSendList(sendListVo);			
			
			//관리항목

			Map<String, String> map = new HashMap<String,String>();;
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(2));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());
			map.put("occr_ymd", hVo.getSlip_ymd()); //발생일자
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);											
						 
			 							
			FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
			updVo.setReq_no(aprVo.getReq_no());
			updVo.setUnslip_no(unslipNo);	
			attachService.updateFspEvidAttach(updVo);		
			
			// 02.전자증빙(크리스피드)
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(unslipNo);
			attachService.executeProcess(attachVo);						
		}
	
	}

  /**
    * 가지급금신청  결재신청
    * @param FspPayAdvcAdjstListVo
    * @throws Exception
    * @author 
    * @since 2023.10.17.
    */
	private void approvalFspPayAdvcReq(FspPayAdvcReqListVo vo) throws Exception{
		AprVo aprVo = new AprVo();
		
		// 정산계정내역
		List<FspPayAdvcReqVo> adjstListVo = spaDAO.selectFspPayAdvcReqGrid(vo.getFspPayAdvcReqVo());
		vo.setFspPayAdvcReqVoList(adjstListVo);
		
		String accntNo = "";
		String accntNoList = "";
		String accntRspns = "";
		String bugtRspns = "";
		List<String> arrAccnt = new ArrayList<>();
		List<String> arrBugtRspns = new ArrayList<>();
		int cnt = 0;
		
		// 정산예정계정내역(가지급신청서)
		for (int i=0; i < adjstListVo.size(); i++) {
			accntNo = adjstListVo.get(i).getAccnt_no();

		  	AutoBugtVo BugtVo = new AutoBugtVo();
		  	BugtVo.setAccnt_no(adjstListVo.get(i).getAccnt_no());
		  			
		  	BugtVo = finComService.getAccntAutoBugtPsn2(BugtVo);			

			if (i == 0) {
				accntNoList = accntNoList + accntNo;
				arrAccnt.add(BugtVo.getAccnt_rspns());
				arrBugtRspns.add(BugtVo.getBugt_ctrl_psn());
				
				accntRspns = accntRspns + BugtVo.getAccnt_rspns();
				
				if (!"FF030001".equals(accntNo)) {
					bugtRspns = bugtRspns + BugtVo.getBugt_ctrl_psn();
				}
			} else {
				accntNoList = accntNoList + ", " + accntNo;

				for(int j=0; j<arrAccnt.size(); j++) {
					if (arrAccnt.get(j).equals(BugtVo.getAccnt_rspns())) {
						cnt++;
					}
				}

				if (cnt == 0) {
					arrAccnt.add(BugtVo.getAccnt_rspns());
					accntRspns = accntRspns + ";" + BugtVo.getAccnt_rspns();
				}

				cnt = 0;

				for (int j=0; j<arrBugtRspns.size(); j++) {
					if (arrBugtRspns.get(j).equals(BugtVo.getBugt_ctrl_psn())) {
						cnt++;
					}
				}

				if (cnt == 0) {					
					arrBugtRspns.add(BugtVo.getBugt_ctrl_psn());
					
					if (accntNo != "FF030001") {
						bugtRspns = bugtRspns + ";" + BugtVo.getBugt_ctrl_psn();
					}
				}
			}
		}
		
		aprVo.setReqNo(vo.getFspPayAdvcReqVo().getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setAprState(vo.getFspPayAdvcReqVo().getApr_state());
		aprVo.setAccountCharger(accntRspns);
		aprVo.setBudgetController(bugtRspns);
		aprVo.setExt1Cd(accntNoList);
		aprVo.setExt2Cd("");
		aprVo.setExt3Cd("");
		aprVo.setRuleMoney(""+vo.getFspPayAdvcReqVo().getReq_amt());
		aprVo.setRuleType("ADR040");
		aprVo.setAmounts(""+vo.getFspPayAdvcReqVo().getReq_amt());
		aprVo.setInfoCd(vo.getFspPayAdvcReqVo().getReq_cause());	
		aprVo.setUiId("F419");
		
		// 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
		vo.setFileList(attachDAO.selectListAttach(vo.getFspPayAdvcReqVo().getAttach_file_no()));
		// 전자결재 기능 메소드 호출 (결재신청)
		apprFuncService.approvalRequest(aprVo, vo);											
	
	}		

  /**
    * 가지급금/전도금신청(삭제)
    * @author 
    * @since 2023.10.16.
    */
  @Override
	public FspPayAdvcReqVo deleteFspPayAdvcReq(FspPayAdvcReqListVo vo) throws Exception {
	  	if (!(vo.getFspPayAdvcReqVo().getUnslip_no() == null || "".equals(vo.getFspPayAdvcReqVo().getUnslip_no()))) {	
		  	Map<String, String> map1 = slipDao.selectFspSlipHDecsnEx(vo.getFspPayAdvcReqVo().getUnslip_no());
			// 01. 결의확정여부에 따라 삭제 가능 체크
			if("Y".equals(map1.get("decsn_ex"))){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0003", new String[]{"해당 결의서는 " + map1.get("accnt_ymd") + " 일자로 확정 완료되어"});
			} else {
				if (!"".equals(vo.getFspPayAdvcReqVo().getUnslip_no())) {
					//가지급금(전도금)신청결의 취소
					finAutoSlipService.deleteFinPayAdvcReqSlipMnt(vo.getFspPayAdvcReqVo().getUnslip_no(),vo.getFspPayAdvcReqVo().getReq_no());
				}
			}
		}
		// ====================================
		// 1.가지급금 신청 삭제
		// ====================================	  
		
		List <FspPayAdvcReqVo> reqListVo = vo.getFspPayAdvcReqVoList();				
		// (1) 가지급금전도금계정추가내역 테이블 삭제
		for (FspPayAdvcReqVo reqVo : reqListVo){
			if (!reqVo.getAccnt_no().equals("FF030001")){
				//원인행위삭제
				DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
				enfrcVo.setReq_no(reqVo.getReq_no());
				if(!StringUtils.isEmpty(String.valueOf(reqVo.getReq_no()))){
					enfrcVo.setReq_seq(String.valueOf(reqVo.getReq_seq()));
				}			
				finComService.deleteBudEnfrcMnt(enfrcVo);
				
				spaDAO.deleteFspPayAdvcReqAccnt(reqVo); // 가지급신청계정삭제			
			} else {
				spaDAO.deleteFspPayAdvcReqAccnt(reqVo); // 가지급신청계정삭제			
			}
		}					
		
		spaDAO.deleteFspPayAdvcReq(vo.getFspPayAdvcReqVo()); // 가지급금/전도금신청 삭제
		
		// ====================================
		// 2. 스냅샷 삭제
		// ====================================
		
		// 전자결재 삭제
    	apprFuncService.formRemove(vo.getFspPayAdvcReqVo().getReq_no());		
	
		return vo.getFspPayAdvcReqVo();
	}
}
