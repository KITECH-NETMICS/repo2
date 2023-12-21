package kr.re.kitech.biz.res.stu.service.impl;


import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.set.dao.FsaAbsrpDAO;
import kr.re.kitech.biz.fin.set.vo.FsaAbsrpListVo;
import kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo;
import kr.re.kitech.biz.fin.spm.dao.FinExpnsSlipDAO;
import kr.re.kitech.biz.res.stu.dao.ResStuCostTrnsDAO;
import kr.re.kitech.biz.res.stu.service.ResStuCostTrnsService;
import kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect : 연구비집행내역 테이블 관련 작업
 * @Class Name : FsaAbsrpServiceImpl.java
 * @Description : 연구비집행(내부인건비, 간접비, 학생인건비 등) 관련
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.29.      이민기    최초생성
 * 
 * @author 작업자
 * @since 2023.08.29.
 * @version 1.0
 * @see
 * 
 */
@Service("resStuCostTrnsService")
public class ResStuCostTrnsServiceImpl extends EgovAbstractServiceImpl implements ResStuCostTrnsService {
  @Resource(name="fsaAbsrpDAO")
  private FsaAbsrpDAO fsaAbsrpDAO;
  
  @Resource(name="finSlipSaveService")
  private FinSlipSaveService finSlipService;
	
  @Resource(name="finComAttachService")
  private FinComAttachService attachService;	
	
  @Resource(name="finComDepstReqService")
  private FinComDepstReqService depstService;
	
  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;	
	
  @Resource(name="finComService")
  private FinComService finComService;
	
  @Resource(name="finExpnsSlipDAO")	
  private FinExpnsSlipDAO slipDAO;
  
  @Resource(name="resStuCostTrnsDAO")	
  private ResStuCostTrnsDAO stuCostDAO;
  
  @Resource(name="attachDAO")
  private AttachDAO attachDao;
  
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;
  /**
   * 학생인건비 추가흡수 및 흡수취소 결의 목록 조회
   * 
   * @author 이민기
   * @param ResStuCostTrnsListVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<ResStuCostTrnsVo> selectResStuCostSlipMS (ResStuCostTrnsVo vo) throws KitechException {	  	 
      return  stuCostDAO.selectResStuCostAbsrpSlipList(vo);
  }
  
  /**
   * 학생인건비 추가흡수 및 흡수취소 결의 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public FsaAbsrpListVo selectResStuCostSlipSS (FsaAbsrpVo vo) throws KitechException {
	  FspSlipHVo fspsliphVO = slipDAO.selectFspSlipH(vo.getUnslip_no());
	  List<FsaAbsrpVo> slipDList = fsaAbsrpDAO.selectResStuCostAbsrpSlip(vo); 			
	  FsaAbsrpListVo resultVO = new FsaAbsrpListVo();
	  resultVO.setFsaAbsrpListVo(slipDList);	  
	  resultVO.setFspSlipHVo(fspsliphVO);
      return resultVO;
  }
  
  /**
   * 학생인건비 흡수취소 이전흡수내역 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<FsaAbsrpVo> selectFsaAbsrpBfSlipMS (FsaAbsrpVo vo) throws KitechException {
      return  fsaAbsrpDAO.selectFsaAbsrpBfSlip(vo);
  }
  
   /**
   * 학생이건비 추가흡수 계정상세 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.09.6.   
   */
  public List<FsaAbsrpVo> selectFsaAbsrpAccntMS (FsaAbsrpVo vo) throws KitechException {
      return  stuCostDAO.selectResStuCostAbsrpSlipList(vo);
  }
  
  /**
   * 학생인건비 이관대상 상세 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.09.11.   
   */
  public List<ResStuCostTrnsVo> selectFsaTrnspAccntMS(ResStuCostTrnsVo absrVo) throws ElException {
	return  stuCostDAO.selectResStuCostTrnsSlipList(absrVo);
  }
  
   /**
   * 학생인건비 추가흡수 및 흡수취소 결의
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public String saveStuCostSlip (FsaAbsrpListVo stuCostVoList) throws KitechException {
	  
	  List<FsaAbsrpVo> slipDList =  stuCostVoList.getFsaAbsrpListVo();
	  
	  if("A".equals(slipDList.get(0).getSlip_typ())){
		  return saveStuCostSlipA(stuCostVoList);
	  }else if("C".equals(slipDList.get(0).getSlip_typ())){
		  return saveStuCostSlipB(stuCostVoList);
	  }else {
		  return saveStuCostSlipC(stuCostVoList);
	  }	  
  }

 /**
   * 학생인건비 추가흡수 및 흡수취소 결의 A타입
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return Unslip_no
   * @throws KitechException
 * @since 2023.08.30.   
   */
  public String saveStuCostSlipA (FsaAbsrpListVo stuCostVoList) throws KitechException {
	 	   
	    FspSlipHVo fspSlipHVo = stuCostVoList.getFspSlipHVo();	  	
	    List<FsaAbsrpVo> slipDList =  stuCostVoList.getFsaAbsrpListVo();
	    
	    FsaAbsrpVo stuCostVo = new FsaAbsrpVo();
	    try {
			BeanUtils.copyProperties(stuCostVo, fspSlipHVo);			
			stuCostVo.setAbsrp_yrmon(slipDList.get(0).getAbsrp_yrmon());
			stuCostVo.setAbsrp_clsf(slipDList.get(0).getAbsrp_clsf());
			stuCostVo.setAccnt_no(slipDList.get(0).getAccnt_no());
			stuCostVo.setAccnt_cd(slipDList.get(0).getAccnt_cd());
			stuCostVo.setAccnt_rspns(slipDList.get(0).getAccnt_rspns());
			stuCostVo.setRegst_syspayno(slipDList.get(0).getRegst_syspayno());
			stuCostVo.setAttach_file_no(slipDList.get(0).getAttach_file_no());
			stuCostVo.setDept(fspSlipHVo.getWrte_dept());
			stuCostVo.setDept_new_ymd(fspSlipHVo.getWrte_dept_new_ymd());			
		} catch (IllegalAccessException e) {			
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.res.stu.0001", new String[]{stuCostVo.getAccnt_no()});
		} catch (InvocationTargetException e) {			
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.res.stu.0001", new String[]{stuCostVo.getAccnt_no()});
		}
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
	  	String rmk = stuCostVo.getRmk();
		String slipYmd = stuCostVo.getSlip_ymd();
		String expnsCd = "220"; //학생인건비 비용코드
		String strAccntNo = ""; //전자증빙 중복생성 방지 변수 
		long totalSum = 0;
		
		FspSlipHVo hVo = new FspSlipHVo();
		FinComSlipVo slipVo = new FinComSlipVo();
		
		hVo.setSlip_ymd(slipYmd);		
		hVo.setSlip_typ_cd("312");		
		hVo.setRmk(rmk);
		
		String unslipNo = finSlipService.saveAutoSlipH("", hVo);	

		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("R496");
		inftaVo.setAprState("XAD010");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		aprComService.putXomxintfatab(inftaVo);

		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //
		

		int seq = 1;
			
		
		for(FsaAbsrpVo stuCostList : slipDList){

			//EIP2.0에 존재하던 학생인건비 비목 잔액 체크는 EIP3.0 예산통제 시점에 체크하므로 제외처리
						
			//예산통제 값 세팅
			BblenfrcVo enfrcVo = new BblenfrcVo();
			enfrcVo.setReq_no(unslipNo); 		
			enfrcVo.setReq_seq(seq); 	
			enfrcVo.setUnslip_no(unslipNo);
			enfrcVo.setUnslip_odr(seq);		
			enfrcVo.setReq_clsf("FBJ011"); 			    
			enfrcVo.setReq_ymd(stuCostVo.getSlip_ymd()); 	    
			enfrcVo.setReq_psn(stuCostList.getRegst_syspayno());		
			enfrcVo.setReq_dept(stuCostVo.getDept());	
			enfrcVo.setReq_dept_new_ymd(stuCostVo.getDept_new_ymd());
			enfrcVo.setAccnt_no(stuCostList.getAccnt_no());		
			enfrcVo.setAccnt_cd(stuCostList.getAccnt_cd());		
			enfrcVo.setExpns_cd(expnsCd);		
			enfrcVo.setReq_amt(stuCostList.getPlan_amt());				
			enfrcVo.setRmk(rmk.trim());
			enfrcVo.setCtrn_yn("Y"); //비목단위 예산 확인
			enfrcVo.setRelat_no(stuCostList.getAccnt_rspns().substring(2,8));
			//예산통제
			finComService.budEnfrcMnt01(enfrcVo);
		
			// 결의생성을 위한 Vo			
			slipVo.setSlip_ymd(slipYmd);	
			FspSlipDVo dVo = new FspSlipDVo();
			
			//계정책임자 및 편성단위 조회
			ResBgAcctmVo acctnoVo = finComService.selectResBgAcctmChk(stuCostList.getAccnt_no());
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no(stuCostList.getAccnt_no());
			dVo.setAccnt_rspns(acctnoVo.getAccnt_rspns());
			dVo.setFomat_unit(acctnoVo.getFomat_unit());
			
			dVo.setAccnt_cd(stuCostList.getAccnt_cd());
			dVo.setExpns_cd(expnsCd);
			dVo.setUnslip_amt(stuCostList.getPlan_amt());
			dVo.setCtrl_no(enfrcVo.getCtrl_no());			
			
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(stuCostList.getAbsrp_yrmon().substring(4,6)+"월 학생인건비 추가흡수("+stuCostList.getAccnt_no()+")");
			dVo.setRmk_2("계정대체");
			dVo.setRegst_req_psn(stuCostList.getRegst_syspayno());
			
			dVo.setRamt_mngmt_1(stuCostList.getDept());
			dVo.setRamt_mngmt_2("");
						
			slipVo.setSlipDVo(dVo);				
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
	
			// 연구비흡수 테이블 입력
			stuCostList.setAbsrp_clsf("FBK035");  //학생인건비 구분
			FsaAbsrpVo resultVO = new FsaAbsrpVo();
			FsaAbsrpVo insertVO = new FsaAbsrpVo();
			FsaAbsrpVo ParamVO = new FsaAbsrpVo();
			ParamVO.setAbsrp_yrmon(stuCostList.getAbsrp_yrmon());
			ParamVO.setAccnt_no(stuCostList.getAccnt_no());
			ParamVO.setAbsrp_clsf("FBK035"); //학생인건비 구분
			resultVO = fsaAbsrpDAO.selectFsaAbsrpMaxOdr(ParamVO); //MAX odr 확인
			insertVO = stuCostList;
			insertVO.setUnslip_no(unslipNo);
			insertVO.setOdr(resultVO.getOdr());
			insertVO.setExpns_cd(expnsCd);
			insertVO.setPlan_amt(stuCostList.getPlan_amt());
			insertVO.setRegst_syspayno(stuCostList.getRegst_syspayno());
			fsaAbsrpDAO.insertFsaAbsrpByUnslipNo(insertVO);
			
			// 전자증빙
			String docId = unslipNo.substring(0, 3);
			
			FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
			evidVo.setDoc_id(docId); 
			evidVo.setExpns_cd("001"); // 흡수케이스
			
			List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(evidVo);			
					
			String accntNo = stuCostList.getAccnt_no();
			
			if(strAccntNo.indexOf(accntNo) == -1){
				strAccntNo += stuCostList.getAccnt_no() + "/";
				for(FspEvidAttachVo attachVo : attachList){
					switch(attachVo.getEvid_item_cd()){
						case "F006" : // 계정원장상세
							attachVo.setReq_no(unslipNo);
							attachVo.setUnslip_no(unslipNo);
							attachVo.setUnslip_odr(seq);
							attachVo.setKey_val(stuCostList.getAccnt_no() + "," + acctnoVo.getItm_solve_base() + "," + "0");
							break;			
						}					
				}
				attachService.saveFspEvidAttach(attachList);
			}						
			
			//대변 총계 구하기
			totalSum += stuCostList.getPlan_amt(); 
			
			seq++;
		}

		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //
		
		
		FspSlipDVo dVo = new FspSlipDVo();
		
		//  FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF130005");
		
			
		dVo.setUnslip_no(unslipNo);
		dVo.setUnslip_odr(seq);
		dVo.setJourn_cd("Fn9920");
		dVo.setJourn_odr(seq);
		dVo.setBase_debit_cr("2");
		dVo.setAccnt_no("FF130005");
		dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
		dVo.setFomat_unit(acctmVo.getFomat_unit());
		// 대변회계코드 조회
		String accntCd = "22050010";
		dVo.setAccnt_cd(accntCd);
		dVo.setExpns_cd("999");

		dVo.setUnslip_amt(totalSum);		
		dVo.setEvid_cd("FAH999");
		dVo.setRmk_1(stuCostVo.getAbsrp_yrmon().substring(4,6)+"월 학생인건비 추가흡수");		
		dVo.setRmk_2("계정대체");
		dVo.setRegst_req_psn(stuCostVo.getRegst_syspayno());
		dVo.setAttach_file_no(stuCostVo.getAttach_file_no());
		dVo.setRamt_mngmt_1(stuCostVo.getAccnt_rspns());
		dVo.setRamt_mngmt_2(stuCostVo.getAccnt_no());
		
		slipVo.setSlipDVo(dVo);

		// 관리항목
		Map<String, String> map = new HashMap<String, String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(seq));		
		map.put("base_debit_cr", dVo.getBase_debit_cr());
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("relat_no", stuCostVo.getAccnt_rspns().substring(2, 8));
		map.put("updt_possbl_yn", "N");
		map.put("journ_cd", dVo.getJourn_cd());
		map.put("journ_odr", String.valueOf(dVo.getJourn_odr()));		
		map.put("mngmt_accnt_no", stuCostVo.getAccnt_no());
			
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));

		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);		

		// 전자증빙 호출 시작(크리스피드 이원길)  세팅		
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);

		return unslipNo;
  }
  
  /**
   * 학생인건비 추가흡수 및 흡수취소 결의 B타입 (흡수취소)
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return Unslip_no
   * @throws KitechException
   * @since 2023.09.06.   
   */
  public String saveStuCostSlipB (FsaAbsrpListVo stuCostVoList) throws KitechException {
	  	FspSlipHVo fspSlipHVo = stuCostVoList.getFspSlipHVo();	  	
	    List<FsaAbsrpVo> slipDList =  stuCostVoList.getFsaAbsrpListVo();
	    
	    FsaAbsrpVo stuCostVo = new FsaAbsrpVo();
	    try {
			BeanUtils.copyProperties(stuCostVo, fspSlipHVo);
			stuCostVo.setAbsrp_yrmon(slipDList.get(0).getAbsrp_yrmon());
			stuCostVo.setAbsrp_clsf(slipDList.get(0).getAbsrp_clsf());
			stuCostVo.setAccnt_no(slipDList.get(0).getAccnt_no());
			stuCostVo.setAccnt_cd(slipDList.get(0).getAccnt_cd());
			stuCostVo.setAccnt_rspns(slipDList.get(0).getAccnt_rspns());
			stuCostVo.setRegst_syspayno(slipDList.get(0).getRegst_syspayno());
			stuCostVo.setAttach_file_no(slipDList.get(0).getAttach_file_no());
			stuCostVo.setDept(fspSlipHVo.getWrte_dept());
			stuCostVo.setDept_new_ymd(fspSlipHVo.getWrte_dept_new_ymd());			
		} catch (IllegalAccessException e) {			
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.res.stu.0001", new String[]{stuCostVo.getAccnt_no()});
		} catch (InvocationTargetException e) {			
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.res.stu.0001", new String[]{stuCostVo.getAccnt_no()});
		}
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
	  	String rmk = stuCostVo.getRmk();
		String slipYmd = stuCostVo.getSlip_ymd();
		String expnsCd = "220"; //학생인건비 비용코드
		String strAccntNo = ""; //전자증빙 중복 제거 변수
		 			
		FspSlipHVo hVo = new FspSlipHVo();
		FinComSlipVo slipVo = new FinComSlipVo();
		
		hVo.setSlip_ymd(slipYmd);		
		hVo.setSlip_typ_cd("312");		
		hVo.setRmk(rmk);
		
		String unslipNo = finSlipService.saveAutoSlipH("", hVo);	

		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("R496");
		inftaVo.setAprState("XAD010");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		aprComService.putXomxintfatab(inftaVo);

		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //
		
		//  FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctnoVo = finComService.selectResBgAcctmChk("FF030001");
		
		int seq = 1;		
		
		for(FsaAbsrpVo stuCostList : slipDList){
			
			String bfOdr = "0";
			long planAmt = 0;
			
			bfOdr = stuCostList.getOdr();
			//계정책임자 및 편성단위 조회
			ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk(stuCostList.getAccnt_no());
			
			// 결의생성을 위한 Vo			
			slipVo.setSlip_ymd(slipYmd);	
			FspSlipDVo dVo = new FspSlipDVo();
			planAmt = stuCostList.getPlan_amt(); 
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF130005");
			dVo.setAccnt_rspns(acctnoVo.getAccnt_rspns());
			dVo.setFomat_unit(acctnoVo.getFomat_unit());			
			dVo.setAccnt_cd("22050010"); //학생인건비 준비금
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(stuCostList.getPlan_amt());
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(stuCostList.getAbsrp_yrmon().substring(4,6)+"월 학생인건비 흡수취소("+stuCostList.getAccnt_no()+")");
			dVo.setRmk_2("계정대체");
			dVo.setRegst_req_psn(stuCostList.getRegst_syspayno());			
			dVo.setRamt_mngmt_1(acctmVo.getAccnt_rspns().substring(2, 6));
			dVo.setRamt_mngmt_2(acctmVo.getAccnt_no());						
			
			slipVo.setSlipDVo(dVo);
			
			// 관리항목
			Map<String, String> map = new HashMap<String, String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq));		
			map.put("base_debit_cr", dVo.getBase_debit_cr());
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("relat_no", stuCostVo.getAccnt_rspns().substring(2, 8));
			map.put("updt_possbl_yn", "N");
			map.put("journ_cd", dVo.getJourn_cd());
			map.put("journ_odr", String.valueOf(dVo.getJourn_odr()));		
			map.put("mngmt_accnt_no", stuCostVo.getAccnt_no());
				
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));				
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			//관리항목 초기화
			slipVo.setMngmtList(null);
			
			// 연구비흡수 테이블 입력
			stuCostList.setAbsrp_clsf("FBK035");  //학생인건비 구분
			FsaAbsrpVo resultVO = new FsaAbsrpVo();
			FsaAbsrpVo insertVO = new FsaAbsrpVo();
			FsaAbsrpVo ParamVO = new FsaAbsrpVo();
			ParamVO.setAbsrp_yrmon(stuCostList.getAbsrp_yrmon());
			ParamVO.setAccnt_no(stuCostList.getAccnt_no());
			ParamVO.setAbsrp_clsf("FBK035"); //학생인건비 구분
			ParamVO.setPlan_amt(planAmt);
			ParamVO.setOdr(stuCostList.getOdr());			
			fsaAbsrpDAO.updateFsaAbsrpByUnslipNo(ParamVO);  // cancel_amt 입력
			
			resultVO = fsaAbsrpDAO.selectFsaAbsrpMaxOdr(ParamVO); //MAX odr 확인			
			
			insertVO = stuCostList;
			insertVO.setUnslip_no(unslipNo);
			insertVO.setOdr(resultVO.getOdr());
			insertVO.setExpns_cd(expnsCd);		
				
			insertVO.setPlan_amt(-planAmt);  //흡수취소 마이너스금액으로 입력
			
			insertVO.setRegst_syspayno(stuCostList.getRegst_syspayno());
			insertVO.setBf_absrp_yrmon(stuCostList.getAbsrp_yrmon());
			insertVO.setBf_odr(bfOdr);
			fsaAbsrpDAO.insertFsaAbsrpByUnslipNo(insertVO);
			
			
			// 전자증빙
			String docId = unslipNo.substring(0, 3);
			
			FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
			evidVo.setDoc_id(docId); 
			evidVo.setExpns_cd("002"); // 흡수케이스
			
			List<FspEvidAttachVo> attachList = attachService.selectFbaExpnsEvidList(evidVo);			
			
			String accntNo = stuCostList.getAccnt_no();
			
			if(strAccntNo.indexOf(accntNo) == -1){
				strAccntNo += stuCostList.getAccnt_no() + "/";
				
				for(FspEvidAttachVo attachVo : attachList){
					switch(attachVo.getEvid_item_cd()){
						case "F006" : //계정원장상세
							attachVo.setReq_no(unslipNo);
							attachVo.setUnslip_no(unslipNo);
							attachVo.setUnslip_odr(seq);
							attachVo.setKey_val(stuCostList.getAccnt_no() + "," + acctmVo.getItm_solve_base() + "," + "0");
							break;			
		
						case "F033" : //  예실대비표
							attachVo.setReq_no(unslipNo);
							attachVo.setUnslip_no(unslipNo);
							attachVo.setUnslip_odr(seq);
							attachVo.setKey_val(stuCostList.getAccnt_no() + "," + stuCostList.getStart_ymd() + "," + stuCostList.getCls_ymd() + ",N,FBL027" );
																
							break;			
						}				
				}
				attachService.saveFspEvidAttach(attachList);	
			}
					
					
			seq++;		

			// ==================================================== //
			// 3. 결의서 디테일(대변저장)
			// ==================================================== //
			//AppLog.info("\n =================== stuCostList1 : " + stuCostList.getPlan_amt());
			
			FspSlipDVo cVo = new FspSlipDVo();			
				
			cVo.setUnslip_no(unslipNo);
			cVo.setUnslip_odr(seq);
			cVo.setJourn_cd("Fn9920");
			cVo.setJourn_odr(seq);
			cVo.setBase_debit_cr("2");
			cVo.setAccnt_no(stuCostList.getAccnt_no());
			cVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			cVo.setFomat_unit(acctmVo.getFomat_unit());
			// 대변회계코드 조회
			String accntCd = stuCostList.getAccnt_cd();
			cVo.setAccnt_cd(accntCd);
			cVo.setExpns_cd(stuCostList.getExpns_cd());
			
			cVo.setUnslip_amt(-stuCostList.getPlan_amt());  //-금액 원복(집행테이블 인서트시 취소금액 -처리		
			cVo.setEvid_cd("FAH999");
			cVo.setRmk_1(stuCostVo.getAbsrp_yrmon().substring(4,6)+"월 학생인건비 흡수취소");		
			cVo.setRmk_2("계정대체");
			cVo.setRegst_req_psn(stuCostVo.getRegst_syspayno());
			cVo.setAttach_file_no(stuCostVo.getAttach_file_no());
			
			
			slipVo.setSlipDVo(cVo);			
	
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);	
			
			seq++;		
		}		

		// 전자증빙 호출 시작(크리스피드 이원길) 예실대비표 세팅		
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
	  	
		return unslipNo;
	  
  }
  
  /**
   * 학생인건비 이관결의 (C타입)
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return Unslip_no
   * @throws KitechException
   * @since 2023.08.31.   
   */
	@Override
	public String saveStuCostSlipC(FsaAbsrpListVo stuCostVoList) throws ElException {
		
		FspSlipHVo fspSlipHVo = stuCostVoList.getFspSlipHVo();	  	
	    List<FsaAbsrpVo> slipDList =  stuCostVoList.getFsaAbsrpListVo();
	    
	    FsaAbsrpVo stuCostVo = new FsaAbsrpVo();
	    try {
			BeanUtils.copyProperties(stuCostVo, fspSlipHVo);
			stuCostVo.setAbsrp_yrmon(slipDList.get(0).getAbsrp_yrmon());
			stuCostVo.setAbsrp_clsf(slipDList.get(0).getAbsrp_clsf());
			stuCostVo.setAccnt_no(slipDList.get(0).getAccnt_no());
			stuCostVo.setAccnt_cd(slipDList.get(0).getAccnt_cd());
			stuCostVo.setAccnt_rspns(slipDList.get(0).getAccnt_rspns());
			stuCostVo.setRegst_syspayno(slipDList.get(0).getRegst_syspayno());
			stuCostVo.setAttach_file_no(slipDList.get(0).getAttach_file_no());
			stuCostVo.setDept(fspSlipHVo.getWrte_dept());
			stuCostVo.setDept_new_ymd(fspSlipHVo.getWrte_dept_new_ymd());			
		} catch (IllegalAccessException e) {			
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.res.stu.0001", new String[]{stuCostVo.getAccnt_no()});
		} catch (InvocationTargetException e) {			
			throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.res.stu.0001", new String[]{stuCostVo.getAccnt_no()});
		}
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //
	  	String rmk = stuCostVo.getRmk();
		String slipYmd = fspSlipHVo.getSlip_ymd();
		String expnsCd = "999"; //학생인건비 비용코드
		String aftrAccntRpsn = ""; //이관후 계정책임자
		 			
		FspSlipHVo hVo = new FspSlipHVo();
		FinComSlipVo slipVo = new FinComSlipVo();
		
		hVo.setSlip_ymd(slipYmd);		
		hVo.setSlip_typ_cd("312");		
		hVo.setRmk(rmk);
		
		String unslipNo = finSlipService.saveAutoSlipH("", hVo);	

		// 1-1) 인터페이스 테이블 저장
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(unslipNo);
		inftaVo.setUiId("R496");
		inftaVo.setAprState("XAD010");
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		aprComService.putXomxintfatab(inftaVo);

		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //
		
		//  FF030001 계정 - 계정책임자 및 편성단위 조회
		ResBgAcctmVo acctnoVo = finComService.selectResBgAcctmChk("FF030001");
		aftrAccntRpsn = slipDList.get(0).getAftr_accnt_rspns();
		
		int seq = 1;		
		
		for(FsaAbsrpVo stuCostList : slipDList){
						
			long planAmt = 0;
			
			planAmt = stuCostList.getUnslip_amt();
			
			
			//예산통제 값 세팅
			BblenfrcVo enfrcVo = new BblenfrcVo();
			enfrcVo.setReq_no(unslipNo); 		
			enfrcVo.setReq_seq(seq); 	
			enfrcVo.setUnslip_no(unslipNo);
			enfrcVo.setUnslip_odr(seq);		
			enfrcVo.setReq_clsf("FBJ011"); 			    
			enfrcVo.setReq_ymd(fspSlipHVo.getSlip_ymd()); 	    
			enfrcVo.setReq_psn(stuCostList.getRegst_syspayno());		
			enfrcVo.setReq_dept(fspSlipHVo.getWrte_dept());	
			enfrcVo.setReq_dept_new_ymd(fspSlipHVo.getWrte_dept_new_ymd());
			enfrcVo.setAccnt_no(stuCostList.getAccnt_no());		
			enfrcVo.setAccnt_cd(stuCostList.getAccnt_cd());		
			enfrcVo.setExpns_cd(expnsCd);		
			enfrcVo.setReq_amt(stuCostList.getUnslip_amt());				
			enfrcVo.setRmk(rmk.trim());			
			enfrcVo.setRelat_no(stuCostList.getAccnt_rspns().substring(2,8));
			//예산통제
			finComService.budEnfrcMnt01(enfrcVo);
						
		
			//계정책임자 및 편성단위 조회
			ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk(stuCostList.getAccnt_no());
			
			// 결의생성을 위한 Vo			
			slipVo.setSlip_ymd(slipYmd);	
			FspSlipDVo dVo = new FspSlipDVo();
			planAmt = stuCostList.getPlan_amt(); 
			
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF130005");
			dVo.setAccnt_rspns(acctnoVo.getAccnt_rspns());
			dVo.setFomat_unit(acctnoVo.getFomat_unit());			
			dVo.setAccnt_cd(stuCostList.getAccnt_cd()); 
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(stuCostList.getUnslip_amt());
			dVo.setEvid_cd("FAH999");
			if("22050010".equals(stuCostList.getAccnt_cd())){			
				dVo.setRmk_1("학생인건비통합관리준비금 이관");
			}else{
				dVo.setRmk_1("학생인건비통합관리준비금(이자) 이관");
			}
			dVo.setRmk_2("계정대체");
			dVo.setRegst_req_psn(stuCostList.getRegst_syspayno());			
			dVo.setRamt_mngmt_1(stuCostList.getAccnt_rspns().substring(2, 8));  //이관전 연수책임자
												
			slipVo.setSlipDVo(dVo);
							
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);			
							
			seq++;		

			// ==================================================== //
			// 3. 결의서 디테일(대변저장)
			// ==================================================== //
			//AppLog.info("\n =================== stuCostList1 : " + stuCostList.getPlan_amt());
			
			FspSlipDVo cVo = new FspSlipDVo();			
				
			cVo.setUnslip_no(unslipNo);
			cVo.setUnslip_odr(seq);
			cVo.setJourn_cd("Fn9920");
			cVo.setJourn_odr(seq);
			cVo.setBase_debit_cr("2");
			cVo.setAccnt_no(stuCostList.getAccnt_no());
			cVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			cVo.setFomat_unit(acctmVo.getFomat_unit());
			// 대변회계코드 조회
			String accntCd = stuCostList.getAccnt_cd();
			cVo.setAccnt_cd(accntCd);
			cVo.setExpns_cd("999");
			
			cVo.setUnslip_amt(stuCostList.getUnslip_amt());  //금액 원복(집행테이블 인서트시 취소금액 -처리		
			cVo.setEvid_cd("FAH999");
			if("22050010".equals(stuCostList.getAccnt_cd())){			
				cVo.setRmk_1("학생인건비통합관리준비금 이관");
			}else{
				cVo.setRmk_1("학생인건비통합관리준비금(이자) 이관");
			}				
			cVo.setRmk_2("계정대체");
			cVo.setRegst_req_psn(stuCostVo.getRegst_syspayno());
			cVo.setAttach_file_no(stuCostVo.getAttach_file_no());

			cVo.setRamt_mngmt_1(aftrAccntRpsn.substring(2,8));  //이관후 연수책임자
			slipVo.setSlipDVo(cVo);			
	
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);	
			
			// 연구비흡수 테이블 입력
			stuCostList.setAbsrp_clsf("FBK035");  //학생인건비 구분
			FsaAbsrpVo resultVO = new FsaAbsrpVo();
			FsaAbsrpVo insertVO = new FsaAbsrpVo();
			FsaAbsrpVo ParamVO = new FsaAbsrpVo();
			ParamVO.setAbsrp_yrmon(fspSlipHVo.getSlip_ymd().substring(0, 6));
			ParamVO.setAccnt_no(stuCostList.getAccnt_no());
			ParamVO.setAbsrp_clsf("FBK035"); //학생인건비 구분
			ParamVO.setPlan_amt(planAmt);
			ParamVO.setOdr(stuCostList.getOdr());						
			
			resultVO = fsaAbsrpDAO.selectFsaAbsrpMaxOdr(ParamVO); //MAX odr 확인			
			int Odr = Integer.valueOf(resultVO.getOdr());
			insertVO = stuCostList;
			insertVO.setUnslip_no(unslipNo);
			insertVO.setOdr(resultVO.getOdr());
			insertVO.setExpns_cd(expnsCd);		
			insertVO.setAbsrp_yrmon(fspSlipHVo.getSlip_ymd().substring(0, 6));
			insertVO.setAbsrp_clsf("FBK035");	
			insertVO.setPlan_amt(-stuCostList.getUnslip_amt());  //이관금액 입력
			insertVO.setAccnt_rspns(stuCostList.getAccnt_rspns());
			insertVO.setRegst_syspayno(stuCostList.getRegst_syspayno());
			insertVO.setDept(fspSlipHVo.getWrte_dept());
			insertVO.setDept_new_ymd(fspSlipHVo.getWrte_dept_new_ymd());			
			insertVO.setRmk(stuCostList.getRmk()); //그리드 입력한 적요
			fsaAbsrpDAO.insertFsaAbsrpByUnslipNo(insertVO);  //이관 대상자(예산감액)
			
			insertVO.setAccnt_rspns(aftrAccntRpsn);
			insertVO.setOdr(String.valueOf(Odr+1));
			insertVO.setPlan_amt(stuCostList.getUnslip_amt());  //이관금액 입력
			fsaAbsrpDAO.insertFsaAbsrpByUnslipNo(insertVO); //이관 신청자 (예산즈액) 
			
			seq++;		
		}		

		// 전자증빙 호출 시작(크리스피드 이원길) 예실대비표 세팅		
		EvidAttachVo evidVo = new EvidAttachVo();
		evidVo.setUnslip_no(unslipNo);
		attachService.executeProcess(evidVo);
	  	
		return unslipNo;
	}

  
  /**
   * 학생인건비 추가흡수 및 흡수취소 결의취소
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return 
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public void saveStuCostSlipCancel (FsaAbsrpListVo stuCostVoList) throws KitechException {
	  	  	
	  	FspSlipHVo fspsliphVO = stuCostVoList.getFspSlipHVo();
	  	List<FsaAbsrpVo> slipDList =  stuCostVoList.getFsaAbsrpListVo();	  	
	  	
	  	FsaAbsrpVo fsaAbsrpVo = new FsaAbsrpVo();
	  	fsaAbsrpVo.setAbsrp_yrmon(stuCostVoList.getFsaAbsrpListVo().get(0).getAbsrp_yrmon());
	  	fsaAbsrpVo.setUnslip_no(fspsliphVO.getUnslip_no());
	  	fsaAbsrpVo.setAccnt_no(stuCostVoList.getFsaAbsrpListVo().get(0).getAccnt_no());	  	
	  	fsaAbsrpVo.setAbsrp_clsf("FBK035");
	  	
	  	String unslipNo = fspsliphVO.getUnslip_no();
	    //자동결의외에 수정된 건이 있는지 조사(분개코드(Fn9910, Fn9920)외의 건수구하기)
		finSlipService.selectAutoSlipCnt(unslipNo);
		
		// 1) 결의서 삭제
		finSlipService.deleteFspSlip(unslipNo);		
		
		// 2) xomxintfatab 결의결재상태 테이블 삭제
		aprComService.delXomxintfatab(unslipNo);
		
		// 3) 흡수결의(A타입) 예산 복원
		if("A".equals(slipDList.get(0).getSlip_typ())||"T".equals(slipDList.get(0).getSlip_typ())){
			DelBblEnfrcVo delVo = new DelBblEnfrcVo();
			delVo.setReq_no(unslipNo);
			finComService.deleteBudEnfrcMnt(delVo);
		}else if("C".equals(slipDList.get(0).getSlip_typ())){
			// 4) 연구비집행 테이블 복원
			for(FsaAbsrpVo stuCostList : slipDList){			
				stuCostList.setAbsrp_clsf("FBK035");
				stuCostList.setPlan_amt(-stuCostList.getPlan_amt());
				stuCostList.setOdr(stuCostList.getBf_odr());
				stuCostList.setAbsrp_yrmon(stuCostList.getBf_absrp_yrmon());
				fsaAbsrpDAO.updateFsaAbsrpByUnslipNo(stuCostList);  // fsaabsrp.cancel_amt 복구
			}	
		}
			
		
		//AppLog.info("\n ------------------- FsaAbsrpVo : " +fsaAbsrpVo);
		fsaAbsrpDAO.deleteFsaAbsrpByUnslipNo(fsaAbsrpVo);  // fsaabsrp. 데이터 삭제
		
		// 5) 전자증빙 결의서번호 초기화 및 크리스피드 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(unslipNo);
		evidVo.setRqst_no(unslipNo); // 크리스피드 전자증빙삭제
		attachService.deleteFspAttchEvid(evidVo);		
  
  }
  
   /**
   * 학생인건비 추가흡수 및 흡수취소 결재신청
   * 
   * @author 이민기
   * @param FsaAbsrpListVo
   * @return 
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public void saveStuCostApr(FsaAbsrpListVo vo) throws KitechException {	  	
	  	// 01.헤더,디테일정보
	  	FspSlipHVo fspsliphVO = vo.getFspSlipHVo();
	  	List<FsaAbsrpVo> slipDList =  vo.getFsaAbsrpListVo();	  				
		FsaAbsrpVo fsaAbsrpVo = new FsaAbsrpVo();
		fsaAbsrpVo.setSlip_typ(slipDList.get(0).getSlip_typ());
		fsaAbsrpVo.setAccnt_no_nm(slipDList.get(0).getAccnt_no_nm());
		fsaAbsrpVo.setAccnt_no(slipDList.get(0).getAccnt_no());
		fsaAbsrpVo.setAccnt_rspns_nm(slipDList.get(0).getAccnt_rspns_nm());
		fsaAbsrpVo.setAccnt_prd(slipDList.get(0).getAccnt_prd());
		fsaAbsrpVo.setBugt_yr(slipDList.get(0).getBugt_yr());
		
		fsaAbsrpVo.setAttach_file_no(slipDList.get(0).getAttach_file_no());
		
		vo.setFsaAbsrpVo(fsaAbsrpVo);
		// 02.첨부파일
		if(!"".equals(slipDList.get(0).getAttach_file_no())){
			vo.setFileList_A(attachDao.selectListAttach(slipDList.get(0).getAttach_file_no()));
		}
		
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());		
		aprVo.setReqNo(fspsliphVO.getUnslip_no());		
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId(KitechContextUtil.getServiceId());									
		aprVo.setInfoCd(fspsliphVO.getRmk());
		aprVo.setExt1Cd(slipDList.get(0).getAccnt_no());
		
		String budgtCheck = ""; //예산통제자
		String resManager = ""; //예산확인담당
		String accntPsn = ""; //계정책임자
		
		for(int i=0; slipDList.size() > i; i++){
			FsaAbsrpVo aprAbsrpVo = new FsaAbsrpVo();
			aprAbsrpVo = slipDList.get(i);
			
			if(aprAbsrpVo.getSlip_typ().equals("A")){
				if(budgtCheck.indexOf(aprAbsrpVo.getBugt_ctrl_psn()) < 0){
					budgtCheck = budgtCheck+";"+aprAbsrpVo.getBugt_ctrl_psn();
				}
				if(accntPsn.indexOf(aprAbsrpVo.getAccnt_rspns()) < 0){
					accntPsn = accntPsn+";"+aprAbsrpVo.getAccnt_rspns();
				}				
				
			}else if(aprAbsrpVo.getSlip_typ().equals("C")){
				
				if(resManager.indexOf(aprAbsrpVo.getBugt_ctrl_psn()) < 0){
					resManager = resManager+";"+aprAbsrpVo.getBugt_ctrl_psn();					
				}				
				if(accntPsn.indexOf(aprAbsrpVo.getAccnt_rspns()) < 0){
					accntPsn = accntPsn+";"+aprAbsrpVo.getAccnt_rspns();
				}		
			}			
			
		}
		aprVo.setBudgetController(budgtCheck);
		aprVo.setBudgtCheckPsn(resManager);		
		aprVo.setAccountCharger(accntPsn);
		// 04. 결재프로세스 호출
		//AppLog.info("\n =================== aprVo : " + vo);
		apprFuncService.approvalRequest(aprVo, vo);		
  }

}