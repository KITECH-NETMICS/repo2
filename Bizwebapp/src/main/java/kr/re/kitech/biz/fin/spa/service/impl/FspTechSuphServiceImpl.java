package kr.re.kitech.biz.fin.spa.service.impl;

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
import kr.re.kitech.biz.com.service.CommonPopService;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinSlipSaveDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.spa.dao.FspTechSuphDAO;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.fin.spa.service.FspTechSuphService;
import kr.re.kitech.biz.fin.spa.vo.FbaItmAccntVo;
import kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupMVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphExcelVo;
import kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo;
import kr.re.kitech.biz.fin.spa.vo.ResBgacCtmSpaVo;
import kr.re.kitech.biz.fin.spa.vo.XodxComMVo;
import kr.re.kitech.biz.sup.tec.dao.SptTecMntDAO;
import kr.re.kitech.biz.sup.tec.vo.SptEquipUseRsltVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecEquipRsltVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;

@Service("fspTechSuphServiceImpl")
public class FspTechSuphServiceImpl  extends EgovAbstractServiceImpl implements FspTechSuphService {
  @Resource(name="fspTechSuphDAO")
  private FspTechSuphDAO spaDAO;
  
  @Resource(name="finAutoSlipService")
  private FinAutoSlipService autoSlipService;
  
  @Resource(name="commonPopService")
  private CommonPopService commonPopService;
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;
  
  @Resource(name="finComService")
  private FinComService finComService;
  
  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;
  
  @Resource(name="finComAttachService")
  private FinComAttachService attachService;
  
  @Resource(name="sptTecMntDAO")
  private SptTecMntDAO mntdao;
  
  @Resource(name = "finSlipSaveDAO")
  private FinSlipSaveDAO slipDao;
  
  @Resource(name="finAutoSlipService")
  private FinAutoSlipService finAutoSlipService;    
  
  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;
  
  @Resource(name="attachDAO")
  private AttachDAO attachDAO;  
    
	  
	@Resource(name="mailSender")
	private MailSender mailSender;

  /**
    * 내부장비활용 목록 조회
    * @author 
    * @since 2023.10.25.
    */
  @Override
  public List<FspTechSuphVo> selectList(FspTechSuphVo vo) throws ElException {
	if (vo.getReq_state().equals("XAD010")) {
		vo.setComplt_demnd_ymd_ed("");
		vo.setComplt_demnd_ymd_st("");
	} else if (vo.getReq_state().equals("XAD070")) {
		vo.setReq_ymd_st("");
		vo.setReq_ymd_ed("");
	}
    List<FspTechSuphVo> list = spaDAO.selectList(vo);	
    return list;
  }
  
  /**
    * 내부장비활용 액셀상세 조회
    * @author 
    * @since 2023.10.25.
    */
  @Override
  public List<FspTechSuphExcelVo> selectList2(FspTechSuphExcelVo vo) throws ElException {
    List<FspTechSuphExcelVo> list = spaDAO.selectFspTechSuphExcel(vo);	
    return list;
  }  

  /**
    * 내부장비활용 상세 조회
    * @author 
    * @since 2023.10.26.
    */
  @Override
  public FspTechSupMVo selectSingle(FspTechSuphVo vo) throws ElException {
	//어차피 req_no 만 보내니 헤더에 req로 통일
	FspTechSupMVo retVo = new FspTechSupMVo();
	FspTechSuphVo headVo = spaDAO.fspTechSuph(vo);  
    retVo.setFspTechSuphVo(headVo);//내부장비활용 내역
    
    List<FspTechSupdVo> techVo = spaDAO.fspTechSupd(vo);
    int i = 0;
    for (FspTechSupdVo tVo:techVo) {
    	if (tVo.getRst_book_issu().equals("1")) {
    		tVo.setRst_book_issu("Y");
    	}
    	techVo.set(i, tVo);
    	i++;
    }
    retVo.setFspTechSupdVoList(techVo); //내부장비활용 상세  
    List<FspEquipUseVo> equipVo = spaDAO.fspEquipUse(vo);   
    retVo.setFspEquipUseVoList(equipVo); //내부장비활용 장비사용실적  
    List<FspTechSupMatrlVo> matrlVo = spaDAO.fspTechSupMatrl(vo);
    retVo.setFspTechSupMatrlVoList(matrlVo); //내부장비활용 재료 사용 내용  
    List<FspTechSupPsnVo> psnVo = spaDAO.fspTechSupPsn(vo);
    retVo.setFspTechSupPsnVoList(psnVo); //내부장비활용 지원 인력
  			
      return retVo;
  }

  /**
    * 내부장비활용(유상) 신청 등록
    * @author 
    * @since 2023.10.27.
    */
  @Override
	public FspTechSuphVo insertItem(FspTechSupMVo vo) throws Exception {
				
		int iCnt = 0;
		String reqNo = "";
		String rcptNo = "";
		String reqYmd = "";
		String cudType = "";
		String accntNo = "";
		String reqClsf = "";
		String suptClsf = "";
		String accntCd = "";
		String expnsCd = "";
		String itmslvBase = "";
		
		cudType = vo.getFspTechSuphVo().getCud_type();
		reqNo = vo.getFspTechSuphVo().getReq_no();
		reqYmd = vo.getFspTechSuphVo().getReq_ymd();
		rcptNo = vo.getFspTechSuphVo().getRcpt_no();
		suptClsf = vo.getFspTechSuphVo().getSupt_clsf();
		accntNo = vo.getFspTechSuphVo().getAccnt_no();
		accntCd = vo.getFspTechSuphVo().getAccnt_cd();						
	
		// 가결의 삭제
		if ("D".equals(cudType)) {
			String decsn_ex = spaDAO.selectFspSlipD(vo.getFspTechSuphVo()).getDecsn_ex();
	
			if ("Y".equals(decsn_ex)) {
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0003", new String[]{"해당 결의서는 " + reqYmd + " 일자로 확정 완료되어"});
			} else {
				if (!"".equals(vo.getFspTechSuphVo().getUnslip_no())) {
					ComReqVo comVo = new ComReqVo();
					comVo.setReq_no(vo.getFspTechSuphVo().getReq_no());
					comVo.setUnslip_no(vo.getFspTechSuphVo().getUnslip_no());
					autoSlipService.deleteFinTechSupSlipMnt(comVo);
				}
			}
		}	
		if (!"D".equals(cudType)) {
			// =============================================== //
			// 1. 내부 장비 활용(유상) 신청 정보
			// =============================================== //
			reqClsf = vo.getFspTechSuphVo().getReq_clsf();
						
			// =============================================== //
			// 1.1 비용 코드 확인
			// =============================================== //
			String[] codeTypes = {"비용코드값", "비목해소기준값", "회계코드값"};
			Object[] results = {null, null, null};  // 결과를 담을 배열 초기화
			for (int i = 0; i < 3; i++) {
			    switch (i) {
			        case 0:
			            XodxComMVo xodVo = new XodxComMVo();
			            xodVo.setCd(reqClsf); 
			            results[i] = spaDAO.selectXodxComM(xodVo);
			            expnsCd = ((XodxComMVo) results[i]).getMngmt_item_2();
			            break;
			        case 1:
			            ResBgacCtmSpaVo ctmVo = new ResBgacCtmSpaVo();
			            ctmVo.setAccnt_no(accntNo);
			            results[i] = spaDAO.selectResBgacCtm(ctmVo);
			            itmslvBase = ((ResBgacCtmSpaVo) results[i]).getItm_solve_base();
			            break;
			        case 2:
			            FbaItmAccntVo accntVo = new FbaItmAccntVo(); 
			            accntVo.setItm_solve_base(itmslvBase);
			            accntVo.setExpns_cd(expnsCd);
			            results[i] = spaDAO.selectFbaItmAccnt(accntVo);
			            accntCd = ((FbaItmAccntVo) results[i]).getAccnt_cd();
			            break;
			    }
			    
			    // 결과 검증 및 예외 처리
			if (results[i] == null || "".equals(results[i])) {
			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.co.com.0001", 
			    new String[]{"[내부장비활용(유상)신청번호 : " + reqNo + "]의 정보 저장시 " + codeTypes[i]});
			    }
			}
			vo.getFspTechSuphVo().setAccnt_cd(accntCd);
			vo.getFspTechSuphVo().setExpns_cd(expnsCd);
			// =============================================== //
			// 1.2 신청 번호 채번
			// =============================================== //
			if ("".equals(reqNo)) {					
				reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F03");
				vo.getFspTechSuphVo().setReq_no(reqNo);
			}	
			// =============================================== //
			// 1.3 접수 번호 채번
			// =============================================== //
			if ("P".equals(cudType)) {
				if ("".equals(rcptNo)) {
					FspTechSuphVo numReqVo = new FspTechSuphVo();
					numReqVo.setRcpt_ymd(reqYmd.substring(0, 4));
					numReqVo.setCd(suptClsf);	
					numReqVo = spaDAO.selectFspTechNumSuph(numReqVo);	
					rcptNo = "K" + reqYmd.substring(2, 4) + numReqVo.getMngmt_item_1() + numReqVo.getCnt();									
					vo.getFspTechSuphVo().setRcpt_no(rcptNo);
				}
			}
			// =============================================== //
			// 1.4 예산 통제 확인
			// =============================================== //			
			BblenfrcVo ctrlVo = new BblenfrcVo();
			ctrlVo.setReq_no(reqNo);
			ctrlVo.setReq_seq(1);
			ctrlVo.setReq_ymd(reqYmd);
			ctrlVo.setReq_clsf("FBJ031");
			ctrlVo.setReq_psn(vo.getFspTechSuphVo().getReq_psn());
			ctrlVo.setCtrl_no(vo.getFspTechSuphVo().getCtrl_no());
			ctrlVo.setReq_dept(vo.getFspTechSuphVo().getReq_dept());
			ctrlVo.setAccnt_no(accntNo);
			ctrlVo.setAccnt_cd(vo.getFspTechSuphVo().getAccnt_cd());
			ctrlVo.setExpns_cd(vo.getFspTechSuphVo().getExpns_cd());
			ctrlVo.setReq_dept_new_ymd(vo.getFspTechSuphVo().getReq_dept_new_ymd());
			ctrlVo.setReq_amt(vo.getFspTechSuphVo().getReq_amt());
	
			// =============================================== //
			// 1.5 저장
			// =============================================== //
			FspTechSuphVo headChk = spaDAO.fspTechSuphCnt(vo.getFspTechSuphVo());
			iCnt = headChk.getCnt();		
			if (iCnt == 0){
				spaDAO.insertFspTechSuph(vo.getFspTechSuphVo());
				aprComService.createAprInterface(reqNo, "S332", KitechContextUtil.getUserId());										
			} else {
				spaDAO.updateFspTechSuph(vo.getFspTechSuphVo());
			}
			if ("reqMnt1".equals(vo.getFspTechSuphVo().getCud_menu())) {			
				finComService.budEnfrcMnt01(ctrlVo);				
				spaDAO.updateFspTechSuphBblenfrc(ctrlVo);
			}														

			// ==================================================== //
			// 3)전자증빙
			// ==================================================== //
			
			FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
			paramVo.setDoc_id(reqNo.substring(0, 3));
			List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
			
			for(FspEvidAttachVo evidVo : evidVoList){
				evidVo.setReq_no(reqNo);
				evidVo.setKey_val(reqNo);
			}
			attachService.saveFspEvidAttach(evidVoList);
			
			// =============================================== //
			// 2. 내부기술지원 내역
			// =============================================== //
			List<FspTechSupdVo> supdVo = vo.getFspTechSupdVoList();
			
			// =============================================== //
			// 2.1 저장
			// =============================================== //
			spaDAO.deleteFspTechSupd(reqNo);							
			for (int i = 0; i < supdVo.size(); i++) {
				supdVo.get(i).setReq_no(reqNo);
				supdVo.get(i).setReq_odr(i+1);
				spaDAO.insertFspTechSupd(supdVo.get(i));
			}
			
			// =============================================== //
			// 3. 장비사용 실적
			// =============================================== //
			List<FspEquipUseVo> equipUseVo = vo.getFspEquipUseVoList();
			
			// =============================================== //
			// 3.1 저장
			// =============================================== //
			spaDAO.deleteFspEquipUse(reqNo);
			
			// 정보일지 삭제
			SptTecEquipRsltVo equVo = new SptTecEquipRsltVo();
			equVo.setTech_supt_req_no(reqNo);
			mntdao.deleteSptTecSupEquipRslt(equVo);
			
			for (int i = 0; i < equipUseVo.size(); i++){
				FspEquipUseVo resultVo = spaDAO.selectFspEquipUseMax(equipUseVo.get(i));		
				equipUseVo.get(i).setReq_no(reqNo);
				equipUseVo.get(i).setUse_odr(resultVo.getCnt());
				spaDAO.insertFspEquipUse(equipUseVo.get(i));
				if ("STA010".equals(equipUseVo.get(i).getUse_clsf())) { // 내부장비활용(유상)
					// 장비일지 등록
					String mntncReq_no = genService.getGenNumber(Numberings.DOCUMENT.getName(), "S20");
					SptEquipUseRsltVo sptEquipVo = new SptEquipUseRsltVo();
					sptEquipVo.setReq_no(mntncReq_no);
					sptEquipVo.setJob_clsf("1");
					sptEquipVo.setTech_sup_req_no(reqNo);
					sptEquipVo.setTech_sup_seq(equipUseVo.get(i).getUse_odr());
					sptEquipVo.setEquip_cd(equipUseVo.get(i).getEquip_no());
					sptEquipVo.setEquip_use_syspayno(equipUseVo.get(i).getRcptPsnSyspayno());
					sptEquipVo.setEquip_use_start_day(equipUseVo.get(i).getUse_start_ymd());	
					String equip_use_start_hour = equipUseVo.get(i).getUse_start_time();
					equip_use_start_hour = equip_use_start_hour.length() == 2 ? equip_use_start_hour : "0" + equip_use_start_hour;
					sptEquipVo.setEquip_use_start_hour(equip_use_start_hour);
					sptEquipVo.setEquip_use_start_minute(equipUseVo.get(i).getUse_start_minute());					
					sptEquipVo.setEquip_use_cls_day(equipUseVo.get(i).getUse_cls_ymd());		
					String equip_use_cls_hour = equipUseVo.get(i).getUse_cls_time();
					equip_use_cls_hour = equip_use_cls_hour.length() == 2 ? equip_use_cls_hour : "0" + equip_use_cls_hour;
					sptEquipVo.setEquip_use_cls_hour(equip_use_cls_hour);
					sptEquipVo.setEquip_use_cls_minute(equipUseVo.get(i).getUse_cls_minute());
					double jobTime = 0;
					jobTime = Double.parseDouble(equipUseVo.get(i).getUse_time());
					sptEquipVo.setJob_time((int) Math.floor(jobTime));
					sptEquipVo.setJob_rmk(equipUseVo.get(i).getUse_usg());
					sptEquipVo.setAccnt_no("");
					sptEquipVo.setUse_clsf("S");
					sptEquipVo.setUser_clsf("C");
					sptEquipVo.setUse_type("STD010");
					sptEquipVo.setCmpy_type("RZB001");
					sptEquipVo.setRegst_syspayno(equipUseVo.get(i).getRcptPsnSyspayno());	
					// 정보일지 등록
					mntdao.mergeSptEquipUseRslt(sptEquipVo);		
				}
			}
			
			// =============================================== //
			// 4. 사용 재료 실적
			// =============================================== //
			List<FspTechSupMatrlVo> matrlVo = vo.getFspTechSupMatrlVoList();
			
			// =============================================== //
			// 4.1 저장
			// =============================================== //
			FspTechSupMatrlVo matVo = new FspTechSupMatrlVo();
			matVo.setReq_no(reqNo);
			spaDAO.deleteFspTechSupMatrl(matVo);
			
			for (int i = 0; i < matrlVo.size(); i++){
				matrlVo.get(i).setReq_no(reqNo);
				matrlVo.get(i).setReq_odr(i+1);
				spaDAO.insertFspTechSupMatrl(matrlVo.get(i));
			}
			
			// =============================================== //
			// 5. 지원 인원 실적
			// =============================================== //
			List<FspTechSupPsnVo> psnVo = vo.getFspTechSupPsnVoList();
			
			// =============================================== //
			// 5.1 저장
			// =============================================== //
			spaDAO.deleteFspTechSupPsn(reqNo);		
			for (int i = 0; i < psnVo.size(); i++){
				psnVo.get(i).setReq_no(reqNo);
				psnVo.get(i).setReq_odr(i+1);
				spaDAO.insertFspTechSupPsn(psnVo.get(i));
			}				
		}
		// 삭제
		if ("D".equals(cudType)) {
			// 예산 통제 처리
			DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
			enfrcVo.setReq_no(reqNo);
			//enfrcVo.setReq_seq(1); 순번 타입 물어보기 4)
			/*XMLUtil.setString(deleteDoc, "req_ymd", reqYmd);
			XMLUtil.setString(deleteDoc, "accnt_no", accntNo);
			XMLUtil.setString(deleteDoc, "accnt_cd", accntCd); 없는거 물어보기*/
			finComService.deleteBudEnfrcMnt(enfrcVo);
			
			// 내부기술지원(유상) 삭제
			spaDAO.deleteFspTechSuph(vo.getFspTechSuphVo());
			
			spaDAO.deleteFspTechSupd(reqNo);
			
			spaDAO.deleteFspEquipUse(reqNo);
			
			// 정보일지 삭제
			SptTecEquipRsltVo equVo = new SptTecEquipRsltVo();
			equVo.setTech_supt_req_no(reqNo);
			mntdao.deleteSptTecSupEquipRslt(equVo);
			
			spaDAO.deleteFspTechSupPsn(reqNo);
			
			// 전자 결재 처리
			aprComService.deleteApr(vo.getFspTechSuphVo().getReq_no());
		}
		if (vo.getFspTechSuphVo().isApproval()) {			
			// 결의번호가 있을 경우 삭제
			if (vo.getFspTechSuphVo().getUnslip_no() != null && !"".equals(vo.getFspTechSuphVo().getUnslip_no())) {
				finAutoSlipService.deleteFinPayAdvcAdjstSlipMnt(vo.getFspTechSuphVo().getUnslip_no(),vo.getFspTechSuphVo().getReq_no());
			}
			//결재신청
			this.approvalFspTech(vo);													
		}			
				 
	 return vo.getFspTechSuphVo();
	}
	
  /**
    * 관리자 저장
    * @author 
    * @since 2023.10.30.
    */
  @Override
	public FspTechSuphVo adminSave(FspTechSupMVo vo) throws KitechException {
	  String reqNo = "";
	  String updtSyspayno = "";
	  FspTechSuphVo headVo = vo.getFspTechSuphVo();
	  reqNo = headVo.getReq_no();
	  updtSyspayno = headVo.getUpdt_syspayno();
	  
	  spaDAO.updateFspTechSaveSuph(vo.getFspTechSuphVo());
	  
	  List<FspTechSupdVo> bodyVo = vo.getFspTechSupdVoList();
	    
	  for (int i = 0; i < bodyVo.size(); i++ ) {
		  bodyVo.get(i).setReq_no(reqNo);
		  bodyVo.get(i).setUpdt_syspayno(updtSyspayno);
		  spaDAO.updateFspTechSupd(bodyVo.get(i));
	  }
	  
	 return vo.getFspTechSuphVo();
	 }
	 
  /**
    * 내부장비활용(유상) 삭제
    * @author 
    * @since 2023.10.30.
    */
  @Override
	public void deleteItem(FspTechSupMVo vo) throws KitechException {
	  	String reqNo = vo.getFspTechSuphVo().getReq_no();
	  	String unslipNo = vo.getFspTechSuphVo().getUnslip_no();
	  	if (!(vo.getFspTechSuphVo().getUnslip_no() == null || "".equals(vo.getFspTechSuphVo().getUnslip_no()))) {	
		  	Map<String, String> map1 = slipDao.selectFspSlipHDecsnEx(unslipNo);
			// 01. 결의확정여부에 따라 삭제 가능 체크
			if ("Y".equals(map1.get("decsn_ex"))) {
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0003", new String[]{"해당 결의서는 " + map1.get("accnt_ymd") + " 일자로 확정 완료되어"});
			} else {
				if (!"".equals(vo.getFspTechSuphVo().getUnslip_no())) {
					//가지급금(전도금)신청결의 취소
					finAutoSlipService.deleteFinPayAdvcReqSlipMnt(unslipNo,reqNo);
				}
			}
		}
		
		//원인행위삭제
		DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
		enfrcVo.setReq_no(vo.getFspTechSuphVo().getReq_no());
		if (!StringUtils.isEmpty(String.valueOf(vo.getFspTechSuphVo().getReq_no()))) {
			enfrcVo.setReq_seq(String.valueOf(1));
		}			
		finComService.deleteBudEnfrcMnt(enfrcVo);		
		
		// ====================================
		// 1.내부장비활용(유상) 삭제
		// ====================================
			
		spaDAO.deleteFspTechSuph(vo.getFspTechSuphVo());
		
		spaDAO.deleteFspTechSupd(reqNo);
		
		spaDAO.deleteFspEquipUse(reqNo);
		
		// 정보일지 삭제
		SptTecEquipRsltVo equVo = new SptTecEquipRsltVo();
		equVo.setTech_supt_req_no(reqNo);
		mntdao.deleteSptTecSupEquipRslt(equVo);
		
		spaDAO.deleteFspTechSupPsn(reqNo);
		
		// 전자결재 삭제
    	apprFuncService.formRemove(reqNo);				 			
	}	 
	  
	/**
    * 내부기술지원(유상) 결재신청
    * @param FspTechSupMVo
    * @throws Exception
    * @author 
    * @since 2023.10.30.
    */
	private void approvalFspTech(FspTechSupMVo vo) throws Exception{
	  	AutoBugtVo BugtVo = new AutoBugtVo();
	  	BugtVo.setAccnt_no(vo.getFspTechSuphVo().getAccnt_no());  			
	  	BugtVo = finComService.getAccntAutoBugtPsn2(BugtVo);	
	  		
		// 결재정보
		AprVo aprVo = new AprVo();
		aprVo.setUiId("F405");
		aprVo.setReqNo(vo.getFspTechSuphVo().getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setInfoCd(vo.getFspTechSuphVo().getRmk());
		aprVo.setAprState("XAD010");
		aprVo.setManager(vo.getFspTechSuphVo().getRcpt_psn());
		aprVo.setAccountCharger(BugtVo.getAccnt_rspns());
		aprVo.setBudgetController(BugtVo.getBugt_ctrl_psn());
		aprVo.setExt1Cd(vo.getFspTechSuphVo().getAccnt_no());
		aprVo.setExt2Cd("");
		aprVo.setExt3Cd("");
		aprVo.setResearcher(KitechContextUtil.getSyspayno());

		// 첨부파일 번호로 첨부파일 리스트 조회
		vo.setFileList(attachDAO.selectListAttach(vo.getFspTechSuphVo().getAttach_file_no()));			
		apprFuncService.approvalRequest(aprVo, vo);    	  
	}	
}
