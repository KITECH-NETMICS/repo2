package kr.re.kitech.biz.fin.spa.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.dao.FinComDAO;
import kr.re.kitech.biz.fin.com.dao.FinComDepstReqDAO;
import kr.re.kitech.biz.fin.com.dao.FinSlipSaveDAO;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComDepstReqService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo;
import kr.re.kitech.biz.fin.spa.dao.FspPayAdvcAdjstDAO;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.fin.spa.service.FspPayAdvcAdjstService;
import kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstListVo;
import kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 가지급금전도금정산
 * @Class Name FspPayAdvcAdjstServiceImpl.java
 * @Description 가지급금전도금정산 관련 처리 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/10/05      김준하             최초생성
 * 
 * @author 김준하
 * @since 2023/10/05
 * @version 1.0
 * @see
 * 
 */
@Service("fspPayAdvcAdjstServiceImpl")
public class FspPayAdvcAdjstServiceImpl  extends EgovAbstractServiceImpl implements FspPayAdvcAdjstService {
  @Resource(name="fspPayAdvcAdjstDAO")
  private FspPayAdvcAdjstDAO spaDAO;
  
  @Resource(name="generationServiceImpl")
  private GenerationService genService;

  @Resource(name="finComService")
  private FinComService finComService;    
  
  @Resource(name="finComDepstReqService")
  private FinComDepstReqService depstService;
  
  @Resource(name="apprCommonServiceImpl")
  private ApprCommonService aprComService;
  
  @Resource(name="finComAttachService")
  private FinComAttachService attachService;
  
  @Resource(name = "finSlipSaveDAO")
  private FinSlipSaveDAO slipDao;
  
  @Resource(name="finAutoSlipService")
  private FinAutoSlipService finAutoSlipService;
  
  @Resource(name="finSlipSaveService")
  private FinSlipSaveService finSlipService;
    
  @Resource(name="attachDAO")
  private AttachDAO attachDAO;
  
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;
        
  @Resource(name="comDepstReqDAO")
  private FinComDepstReqDAO depstDao;	  
  
  @Resource(name="finComDAO")
  private FinComDAO comDAO;
             
  /**
    * 가지급금/전도금정산(신청결의내역조회)리스트
    * @author 
    * @since 2023.09.15.
    */
  @Override
  public List<FspPayAdvcAdjstVo> selectFspPayAdvcAdjstList(FspPayAdvcAdjstVo vo) throws ElException {
    List<FspPayAdvcAdjstVo> list = spaDAO.selectFspPayAdvcAdjstList(vo);	
    return list;
  }

  /**
    * 가지급금 및 전도금신청 내역을 조회한다.
    * @author 
    * @since 2023.08.29.
    */
  @Override
  public FspPayAdvcAdjstListVo selectFspPayAdvcAdjst(FspPayAdvcAdjstVo vo) throws ElException {
    FspPayAdvcAdjstListVo resultVo = new FspPayAdvcAdjstListVo();
 
    String saveTag = vo.getCud_type();
	String reqNo = vo.getReq_no().trim();
    // 조회화면에서 넘어온 경우
	if (!"".equals(reqNo) || !vo.isApproval()) {
		//form data
		FspPayAdvcAdjstVo tmpVo = spaDAO.selectFspPayAdvcAdjst(vo);
		tmpVo.setCud_type(saveTag);
		resultVo.setFspPayAdvcAdjstVo(tmpVo);
		
		//정산계정내역 그리드
		List<FspPayAdvcAdjstGridVo> gridVo = spaDAO.selectFspPayAdvcAdjstGrid(vo);
		resultVo.setFspPayAdvcAdjstGridVoList(gridVo);
		
		if ("U".equals(saveTag)) {
			//잔액입금내역 그리드
			List<FcpDepstDetlsVo> detlsVo = spaDAO.selectFcpDepstDetls(vo);
			resultVo.setFcpDepstDetlsVoList(detlsVo);
			
			//정산계정추가내역 그리드 fcpDepstDetlsVoList
			List<FspPayAdvcAdjstAddVo> addVo = spaDAO.selectFspPayAdvcAdjstAdd(vo);
			resultVo.setFspPayAdvcAdjstAddVoList(addVo);						
		}			
	} else { // 결재함에서 넘어왔을 때 실행되는 쿼리(정산신청번호만 있을 때)
		//form data
		FspPayAdvcAdjstVo apprVo = spaDAO.selectFspPayAdvcAdjstAppr(vo);
		resultVo.setFspPayAdvcAdjstVo(apprVo);
		
		//정산계정내역 그리드
		List<FspPayAdvcAdjstGridVo> gridVo = spaDAO.selectFspPayAdvcAdjstGridAppr(vo);
		resultVo.setFspPayAdvcAdjstGridVoList(gridVo);
		
		//잔액입금내역 그리드
		List<FcpDepstDetlsVo> detlsVo = spaDAO.selectFcpDepstDetlsAppr(vo);
		resultVo.setFcpDepstDetlsVoList(detlsVo);
		
		//정산계정추가내역 그리드
		List<FspPayAdvcAdjstAddVo> addVo = spaDAO.selectFspPayAdvcAdjstAdd(vo);
		resultVo.setFspPayAdvcAdjstAddVoList(addVo);	
	}
	String checkCudType = resultVo.getFspPayAdvcAdjstVo().getAdjst_req_no();
	if (checkCudType != null) {
		resultVo.getFspPayAdvcAdjstVo().setCud_type("U");
	} else {
		resultVo.getFspPayAdvcAdjstVo().setCud_type("I");
	}
      		
  return resultVo;
  }

  /**
    * 가지급금 및 전도금정산 입력내역을 저장한다.
    * @author 
 * @throws Exception 
    * @since 2023.08.29.
    */
  @Override
	public FspPayAdvcAdjstVo insertFspPayAdvcAdjst(FspPayAdvcAdjstListVo vo) throws Exception {
				
		String adjstReqNo = "";		
		String saveTag = vo.getFspPayAdvcAdjstVo().getCud_type();
		String cudType = "";			
        String syspayno = KitechContextUtil.getSyspayno();
        String reqYmd = vo.getFspPayAdvcAdjstVo().getAdjst_ymd(); // 계정추가 신청일자
        String reqNo = vo.getFspPayAdvcAdjstVo().getReq_no();     // 가지급금신청번호
                        
        //=====================================================================//
		// 1.공통정보
		//=====================================================================//
		
		if ("I".equals(saveTag)) {
			//신청번호 생성
			adjstReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F11");
			vo.getFspPayAdvcAdjstVo().setAdjst_req_no(adjstReqNo);
			vo.getFspPayAdvcAdjstVo().setAdjst_req_odr("1");
			vo.getFspPayAdvcAdjstVo().setAccnt_no("FF030001");
			vo.getFspPayAdvcAdjstVo().setAccnt_cd("11137010");
			vo.getFspPayAdvcAdjstVo().setExpns_cd("999");
			vo.getFspPayAdvcAdjstVo().setRegst_syspayno(syspayno);
			
			// 계정책임자 조회
			// FF030001 계정 - 계정책임자 및 편성단위 조회
			ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk("FF030001");
			vo.getFspPayAdvcAdjstVo().setAccnt_rspns(acctmVo.getAccnt_rspns());
			
			//가지급금정산신청테이블에 등록
			spaDAO.insertFspPayAdvcAdjst(vo.getFspPayAdvcAdjstVo());	
		} else {
			adjstReqNo = vo.getFspPayAdvcAdjstVo().getAdjst_req_no();
			vo.getFspPayAdvcAdjstVo().setAdjst_req_no(adjstReqNo);
			vo.getFspPayAdvcAdjstVo().setUpdt_syspayno(syspayno);
			vo.getFspPayAdvcAdjstVo().setAdjst_ymd(reqYmd);
			vo.getFspPayAdvcAdjstVo().setRmk("");
			
			//가지급금정산신청테이블 수정
			spaDAO.updateFspPayAdvcAdjst(vo.getFspPayAdvcAdjstVo());		
		}
		
		//=====================================================================//
		// 2. 가지급금정산신청서의 정산예정계정내역 등록 및 수정
		//=====================================================================//
		List <FspPayAdvcAdjstGridVo> gridVo = vo.getFspPayAdvcAdjstGridVoList();
		
		for (int i = 0; i < gridVo.size(); i++) {
			FspPayAdvcAdjstGridVo reqstVo = new FspPayAdvcAdjstGridVo();
			reqstVo = gridVo.get(i);
			cudType = reqstVo.getCud_type();
		
			if ("I".equals(saveTag)) {
				reqstVo.setAdjst_req_no(adjstReqNo);
				reqstVo.setAdjst_req_odr(i+1);
				reqstVo.setRegst_syspayno(syspayno);
				
				//정산예정계정내역 등록
				spaDAO.insertFspPayAdvcAdjstAccnt(reqstVo);
			} else {
				if ("U".equals(cudType)) {
					reqstVo.setUpdt_syspayno(syspayno);					
					spaDAO.updateFspPayAdvcAdjstAccnt(reqstVo);					
				}
			}		
		}
		
		//=====================================================================//
		// 4. 가지급금 전도정산 잔액분 입금내역 등록 및 수정
		//=====================================================================//
		List <FcpDepstDetlsVo> detlsListVo = vo.getFcpDepstDetlsVoList();			
		for (FcpDepstDetlsVo reqVo : detlsListVo) {
			String rmk = reqVo.getRmk();
			cudType = reqVo.getCud_type();
							
			// 신규생성
			if ("C".equals(cudType)) {
				reqVo.setAdjst_req_no(adjstReqNo);
				reqVo.setRegst_syspayno(syspayno);
				
				int result = spaDAO.insertFcpDepstDetls(reqVo);
								
				if (result == 1) {
					/*(1) 잔액관리모듈 호출 - 생성 */					
					reqVo.setReq_no(genService.getGenNumber(Numberings.DOCUMENT.getName(), "F35"));
					reqVo.setBf_depst_liq(0);//이전 입금 금액
					reqVo.setDepst_schdl_seq(1);
					reqVo.setDepst_schdl_detls_seq(1);
					reqVo.setVend_cd("");
					reqVo.setAccnt_no("");
					reqVo.setRecv_bill_no("");
					reqVo.setDemnd_bill_no("");
					reqVo.setDepst_ymd(reqVo.getAcct_txday());
					reqVo.setDepst_liq(reqVo.getDepst_amt());
					reqVo.setReq_psn(syspayno);
					reqVo.setDepst_req_decsn("N");
					reqVo.setDepst_clsf("FBD099");
					reqVo.setRmk(adjstReqNo +"/"+ reqVo.getDepst_odr()+" (가지급금전도금정산)");

					depstService.saveDepstReq(reqVo);
					
					// (2) 잔액입금내역테이블(fcpdepstdetls)에 입금의뢰신청번호(depst_req_no) 넣기			
					reqVo.setRmk(rmk);
					reqVo.setUpdt_syspayno(syspayno);
					reqVo.setDepst_req_no(reqVo.getReq_no());
					spaDAO.updateFcpDepstDetls(reqVo);									
				}
			} else { // 수정								
				reqVo.setReq_no(reqVo.getDepst_req_no());
				reqVo.setAccnt_no("");
				reqVo.setDepst_schdl_seq(1);
				reqVo.setDepst_schdl_detls_seq(1);
				reqVo.setDemnd_bill_no("");
				reqVo.setRecv_bill_no("");
				reqVo.setVend_cd("");
				reqVo.setDepst_liq(reqVo.getDepst_amt());
				reqVo.setBf_depst_liq(reqVo.getBf_depst_amt());//이전 입금 금액
				reqVo.setUnslip_no("");
				reqVo.setSlip_no("");
				reqVo.setUnslip_odr(reqVo.getDepst_unslip_odr());
				reqVo.setReq_psn(syspayno);;
				reqVo.setDepst_clsf("FBD099");
				reqVo.setRmk(adjstReqNo +"/"+ reqVo.getDepst_odr()+" (가지급금전도금정산)");
				reqVo.setDepst_req_decsn("N");
				
				depstService.saveDepstReq(reqVo);

				//잔액입금내역테이블(fcpdepstdetls) 수정
				reqVo.setRmk(rmk);
				reqVo.setUpdt_syspayno(syspayno);
				reqVo.setAdjst_req_no(adjstReqNo);
				spaDAO.updateFcpDepstDetls(reqVo);
			}
		
		}
		//==========================================================
		// 5. 정산계정내역(계정추가, 초과분, 환차손, 환차익, 과입금) 저장 및 수정  20140417 by sybae
		//==========================================================
		List <FspPayAdvcAdjstAddVo> addVoListVo = vo.getFspPayAdvcAdjstAddVoList();				
		int i = 1;
		for (FspPayAdvcAdjstAddVo addVo : addVoListVo) {
			cudType = addVo.getCud_type();
			// 편성단위 조회
			ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk(addVo.getAccnt_no());
			addVo.setFomat_unit(acctmVo.getFomat_unit());
			addVo.setRelat_no(addVo.getAccnt_rspns().substring(2,8));//개인번호
						
			if ("I".equals(saveTag)) {
				//(1) 가지급금정산 추가계정 등록
				addVo.setAdjst_amt(0); //정산금액
				addVo.setAdjst_req_odr(i); //신청순번
				addVo.setReq_no(reqNo); //가지급금신청번호
				addVo.setReq_ymd(reqYmd); //신청일자
				addVo.setAdjst_req_no(adjstReqNo); //신청번호
				addVo.setRegst_syspayno(syspayno); //등록자 시스템 번호
				if(!addVo.getAccnt_no().equals("FF030001")){					
					finComService.budEnfrcMnt01(addVo);
				}
				
				spaDAO.insertFspPayAdvcAdjstAddAccnt(addVo);
				
				//(2) 통제번호생성
				addVo.setReq_seq(i); 						    	    							
				addVo.setReq_no(adjstReqNo); 		

			} else {
				// 정산계정내역에 추가되었을 때
				addVo.setAdjst_req_no(adjstReqNo); //신청번호
				addVo.setAdjst_req_odr(i); //신청순번
				addVo.setAdjst_amt(0); //정산금액
				addVo.setReq_ymd(reqYmd); //신청일자
				addVo.setRegst_syspayno(syspayno); //등록자 시스템 번호
				addVo.setReq_no(adjstReqNo); 		
				addVo.setReq_seq(i);	 			    	    			
				if (!addVo.getAccnt_no().equals("FF030001")) {
					finComService.budEnfrcMnt01(addVo);
				}
				if ("C".equals(cudType)){		
					addVo.setReq_no(reqNo); 		
					// (2) 가지급금정산신청 추가계정 등록
					spaDAO.insertFspPayAdvcAdjstAddAccnt(addVo);
					
				} else if ("U".equals(cudType)){  // 가지급금정산신청 추가계정내역이 수정되었을 때					
					addVo.setReq_no(reqNo);
					addVo.setUpdt_syspayno(syspayno); 
					spaDAO.updateFspPayAdvcAdjstAdd(addVo);
					
						// 기존의 계정번호가 FF030001 아니면 원인행위 삭제 후 수정된 계정번호로 원인행위 생성
						if (!addVo.getAccnt_no().equals("FF030001")) {
							//  (3) 원인행위 삭제
							DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
							enfrcVo.setReq_no(addVo.getAdjst_req_no());
							if (!StringUtils.isEmpty(String.valueOf(addVo.getAdjst_req_odr()))) {
								enfrcVo.setReq_seq(String.valueOf(addVo.getAdjst_req_odr()));
							}
							finComService.deleteBudEnfrcMnt(enfrcVo);							
						}											
				} 				
			}
		
			i++;
		}
		
		//=====================================================================//
		// 6. 가지급금 신청 정산번호 수정 
		//=====================================================================//	
		
		spaDAO.updateFspPayAdvcReqNo(vo.getFspPayAdvcAdjstVo());
		
		//임시저장
		if ("I".equals(saveTag)) {
			vo.getFspPayAdvcAdjstVo().setAdjst_req_no(adjstReqNo);
			//인터페이스
			aprComService.createAprInterface(adjstReqNo, "F453", KitechContextUtil.getUserId());
		}
		
		//전자증빙 저장
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id("F11");
		List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
		
		for (FspEvidAttachVo evidVo : evidVoList) {
			evidVo.setReq_no(adjstReqNo);
			evidVo.setKey_val(adjstReqNo);
		}
		attachService.saveFspEvidAttach(evidVoList);
		
		if (vo.getFspPayAdvcAdjstVo().isApproval()) {			
			// 결의번호가 있을 경우 삭제
			if(vo.getFspPayAdvcAdjstVo().getUnslip_no() != null && !"".equals(vo.getFspPayAdvcAdjstVo().getUnslip_no())){
				finAutoSlipService.deleteFinPayAdvcAdjstSlipMnt(vo.getFspPayAdvcAdjstVo().getUnslip_no(),vo.getFspPayAdvcAdjstVo().getAdjst_req_no());
			}
			//결의생성
			this.creatFspPayAdvcAdjsSlip(vo);
			
			//결재신청
			this.approvalFspPayAdvcAdjst(vo);													
		}
	 return vo.getFspPayAdvcAdjstVo();
	}
	
	/**
    * 가지급금 정산 결재신청
    * @param FspPayAdvcAdjstListVo
    * @throws Exception
    * @author 
    * @since 2023.9.25.
    */
	private void approvalFspPayAdvcAdjst(FspPayAdvcAdjstListVo vo) throws Exception{
		AprVo aprVo = new AprVo();	
		
		// 정산계정내역
		List<FspPayAdvcAdjstGridVo> adjstListVo = spaDAO.selectFspPayAdvcAdjstGrid(vo.getFspPayAdvcAdjstVo());
		vo.setFspPayAdvcAdjstGridVoList(adjstListVo);
		// 정산계정추가내역	
		List<FspPayAdvcAdjstAddVo> adjstAddListVo = spaDAO.selectFspPayAdvcAdjstAdd(vo.getFspPayAdvcAdjstVo());
		vo.setFspPayAdvcAdjstAddVoList(adjstAddListVo);
		// 잔액입금내역		
		List<FcpDepstDetlsVo> ramtListVo = spaDAO.selectFcpDepstDetls(vo.getFspPayAdvcAdjstVo());
		vo.setFcpDepstDetlsVoList(ramtListVo);
			
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
					arrAccnt.add(BugtVo.getAccnt_rspns());
					
					if (accntNo != "FF030001") {
						bugtRspns = bugtRspns + ";" + BugtVo.getBugt_ctrl_psn();
					}
				}
			}
		}

		String addAccntNo = "";
		String addAccntNoList = "";
		int addcnt = 0;

		// 정산계정내역(계정추가, 초과분, 환차손, 환차익, 과입금)
		for (int i=0; i<adjstAddListVo.size(); i++) {	
			addAccntNo = adjstAddListVo.get(i).getAccnt_no();

			if (!"FF030001".equals(addAccntNo)) {
			  	AutoBugtVo BugtVo = new AutoBugtVo();
			  	BugtVo.setAccnt_no(adjstAddListVo.get(i).getAccnt_no());
			  			
			  	BugtVo = finComService.getAccntAutoBugtPsn2(BugtVo);			

				addAccntNoList = addAccntNoList + ", " + addAccntNo;

				for (int j=0; j<arrAccnt.size(); j++) {
					if (arrAccnt.get(j).equals(BugtVo.getAccnt_rspns())) {
						addcnt++;
					}
				}
				if (addcnt == 0) {
					arrAccnt.add(BugtVo.getAccnt_rspns());
					accntRspns = accntRspns + ";" + BugtVo.getAccnt_rspns();
				}

				addcnt = 0;

				for (int j=0; j<arrBugtRspns.size(); j++) {
					if (arrBugtRspns.get(j).equals(BugtVo.getBugt_ctrl_psn())) {
						addcnt++;
					}
				}

				if (addcnt == 0) {
					arrAccnt.add(BugtVo.getAccnt_rspns());
					bugtRspns = bugtRspns + ";" + BugtVo.getBugt_ctrl_psn();
				}
			}
		}
				
		aprVo.setReqNo(vo.getFspPayAdvcAdjstVo().getAdjst_req_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setAprState(vo.getFspPayAdvcAdjstVo().getApr_state());
		aprVo.setAccountCharger(accntRspns);
		aprVo.setBudgetController(bugtRspns);
		aprVo.setExt1Cd(accntNoList);
		aprVo.setExt2Cd(addAccntNoList);
		aprVo.setRuleMoney(""+vo.getFspPayAdvcAdjstVo().getAdjst_amt());
		aprVo.setRuleType("ADR040");
		aprVo.setAmounts(""+vo.getFspPayAdvcAdjstVo().getAdjst_amt());	
		aprVo.setUiId("F453");
		
		String unslip_no_seq = "";
		String slipYmd = vo.getFspPayAdvcAdjstVo().getAdjst_ymd();
		
		if ("10".equals(slipYmd.substring(4, 6))) {
			unslip_no_seq = "165" + slipYmd.substring(2, 4) + "A";
		} else if (slipYmd.substring(4, 6) == "11") {
			unslip_no_seq = "165" + slipYmd.substring(2, 4) + "B";					
		} else if (slipYmd.substring(4, 6) == "12") {
			unslip_no_seq = "165" + slipYmd.substring(2, 4) + "C";
		} else {
			unslip_no_seq = "165" + slipYmd.substring(2, 4) + slipYmd.substring(5, 6); 					
		}
		vo.getFspPayAdvcAdjstVo().setUnslip_no_seq(unslip_no_seq);		
		// 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)			
		vo.setFileList(attachDAO.selectListAttach(vo.getFspPayAdvcAdjstVo().getAttach_file_no1()));									
		// 전자결재 기능 메소드 호출 (결재신청)
		apprFuncService.approvalRequest(aprVo, vo);		
	
	}	
	
	/**
    * 가지급금 정산 결의생성
    * @param FspPayAdvcAdjstListVo
    * @throws Exception
    * @author 
    * @since 2023.9.25.
    */
	private void creatFspPayAdvcAdjsSlip(FspPayAdvcAdjstListVo vo) throws Exception{

		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = null;	
		String unslipNo = "";
		String reqClsf = "";
			
		// 가지급정산결의데이타 조회
		List<FspPayAdvcAdjstVo> aprVo = spaDAO.selectFspPayAdvcAdjstApr(vo.getFspPayAdvcAdjstVo());
		FspPayAdvcAdjstVo tmpVo = aprVo.get(0);
		int chadeaOdr = 0;
		String adjstReqNo = tmpVo.getAdjst_req_no();
		String slipYmd = tmpVo.getAdjst_ymd();
		String Rmk = tmpVo.getRmk();
		int CHAcount = tmpVo.getChacount();
		int Rmkdaecount = tmpVo.getRmk_daecount();
		String reqWrteDeptNm = tmpVo.getReq_wrte_dept();
		
		// ============================================================================
		// 01. 결의서 헤드 저장
		// ============================================================================ 	
	
		
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setSlip_ymd(slipYmd);
		hVo.setSlip_typ_cd("165");
		
		// 헤더적요는 첫번째차변의 적요를 가져온다.
		if (CHAcount > 1) {
			hVo.setRmk(Rmk + "외 " + (CHAcount - 1) + "건"); 
		} else {
			hVo.setRmk(Rmk); 
		}
		
		// 결의서헤더 저장
		unslipNo = finSlipService.saveAutoSlipH(adjstReqNo, hVo);
		vo.getFspPayAdvcAdjstVo().setUnslip_no(unslipNo);		
		
		// 가지급금정산신청테이블 unslip_no, unslip_odr 수정(odr은 의미 없음으로 0으로 설정)
		spaDAO.updateFspPayAdvcAdjstApr(vo.getFspPayAdvcAdjstVo());
		
		// ============================================================================
		// 02. 결의서 디테일 생성
		// ============================================================================
		
		//form data, 정산예정계정내역, 잔액입금내역, 정산추가계정내역 조회
		FspPayAdvcAdjstListVo resultVo = this.selectFspPayAdvcAdjst(vo.getFspPayAdvcAdjstVo());
		FspPayAdvcAdjstVo adjstFormVo = spaDAO.selectFspPayAdvcAdjstAppr(vo.getFspPayAdvcAdjstVo());
		List<FspPayAdvcAdjstGridVo> adjstListVo = spaDAO.selectFspPayAdvcAdjstGridAppr(vo.getFspPayAdvcAdjstVo());
		List<FcpDepstDetlsVo> ramtListVo = spaDAO.selectFcpDepstDetlsAppr(vo.getFspPayAdvcAdjstVo());
		List<FspPayAdvcAdjstAddVo> adjstAddListVo = resultVo.getFspPayAdvcAdjstAddVoList();
		/**********************************************************************
		 * 3.0. 결의서 디테일 대변생성
		 **********************************************************************/							
		// ============================================================================
		// 03-1. 정산예정계정내역 디테일 차변생성
		// ============================================================================
				
		// 정산예정계정내역
		FspSlipDVo dVo = null;
		int seq = 0;
		for (FspPayAdvcAdjstGridVo adjstVo: adjstListVo) {
		
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			
			// 계정책임자 조회
			ResBgAcctmVo acctmVo = finComService.selectResBgAcctmChk(adjstVo.getAccnt_no());
			vo.getFspPayAdvcAdjstVo().setAccnt_rspns(acctmVo.getAccnt_rspns());	
								
			dVo = new FspSlipDVo();
			
			dVo.setCtrl_no(adjstVo.getCtrl_no());
			dVo.setReq_no(adjstVo.getAdjst_req_no());
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq+1);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(seq+1);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no(adjstVo.getAccnt_no());
			dVo.setFomat_unit(acctmVo.getFomat_unit());
			dVo.setAccnt_rspns(acctmVo.getAccnt_rspns());
			dVo.setAccnt_cd(adjstVo.getAccnt_cd());
			dVo.setExpns_cd(adjstVo.getExpns_cd());
			dVo.setUnslip_amt(adjstVo.getAdjst_amt());
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1(adjstVo.getRmk().trim() + "(" + adjstVo.getDepstr_nm() + ", " + adjstVo.getAccnt_no() + ")");
			dVo.setRmk_2(reqWrteDeptNm);
			
			slipVo.setSlipDVo(dVo);
			
			//잔액관리항목
			
			//필수
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(seq+1));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());
			
			//회계코드별 관리항목 코드			
			map.put("mngmt_2060_nm", adjstVo.getRmk());
			map.put("mngmt_accnt_no", adjstVo.getAccnt_no());
			map.put("pur_req_no", adjstVo.getAdjst_req_no());
			map.put("occr_ymd", slipYmd);
			map.put("vend_cd", "");
			map.put("vend_nm", adjstVo.getDepstr_nm());
			map.put("req_no", adjstVo.getAdjst_req_no());
			map.put("updt_possbl_yn", "N");
			map.put("journ_cd", dVo.getJourn_cd());
			map.put("journ_odr", String.valueOf(dVo.getJourn_odr()));
			map.put("dept_cd", vo.getFspPayAdvcAdjstVo().getAdjst_dept());
			map.put("dept_nm", vo.getFspPayAdvcAdjstVo().getAdjst_dept_nm());
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));	
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// 가지급금정산예정 계정내역테이블 unslip_no, unslip_odr 수정
			adjstVo.setUnslip_no(unslipNo);	
			adjstVo.setUnslip_odr(seq+1);			
			spaDAO.updateFspPayAdvcAdjstAccnt(adjstVo);	
						
			//집행내역테이블에 결의금액, 결의번호, 결의순번, trans_amt, part_all_clsf, trans_unslip_no, trans_unslip_odr, req_no(가지급금신청번호), req_seq(순번)			
			BblenfrcVo addAmtVo = new BblenfrcVo();
			
			addAmtVo.setUnslip_amt(adjstVo.getAdjst_amt());
			addAmtVo.setTrans_amt(adjstVo.getAdjst_amt());
			addAmtVo.setPart_all_clsf("F");
			addAmtVo.setTrans_unslip_no(unslipNo);
			addAmtVo.setTrans_unslip_odr(seq+1);
			addAmtVo.setReq_no(adjstVo.getReq_no());
			addAmtVo.setReq_seq(adjstVo.getReq_seq());
			
			comDAO.updateBblenFrcAddAmt(addAmtVo);			
			
			seq++;			
			chadeaOdr++;
		}

		// ============================================================================
		// 03-2. 잔액입금내역 디테일 차변생성
		// ============================================================================
		
		// 잔액입금내역
		seq = 0; 
		for (FcpDepstDetlsVo ramtVo : ramtListVo) {
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			dVo = new FspSlipDVo();

			// 01. 잔액생성 확정결의번호 조회
			FspRamtCreatVo ramtUnslipVo = depstDao.selectDepstReqSlipNo(ramtVo.getDepst_req_no());
			
			dVo.setReq_no(ramtVo.getAdjst_req_no());
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(chadeaOdr+1);
			dVo.setJourn_cd("Fn9910");
			dVo.setJourn_odr(chadeaOdr+1);
			dVo.setBase_debit_cr("1");
			dVo.setAccnt_no("FF030001");
			dVo.setAccnt_cd("21017911");// 가수금-기타가수금(On-Line입금)
			dVo.setExpns_cd("999");
			dVo.setUnslip_amt(ramtVo.getDepst_amt());
			dVo.setEvid_cd("FAH999");
			dVo.setRmk_1("ON-LINE입금(" + ramtVo.getDepst_ymd().trim() + "/" + ramtVo.getRmk().trim() + ")");
			dVo.setRmk_2(ramtVo.getDepstr_nm());
			dVo.setOccr_slip_no(ramtUnslipVo.getSlip_no());
			dVo.setOccr_slip_odr(ramtUnslipVo.getSlip_odr());
			slipVo.setSlipDVo(dVo);
			
			//잔액관리항목
			
			//필수
			Map<String, String> map = new HashMap<String,String>();
			map.put("unslip_no", unslipNo);
			map.put("unslip_odr", String.valueOf(chadeaOdr+1));		
			map.put("accnt_cd", dVo.getAccnt_cd());
			map.put("base_debit_cr", dVo.getBase_debit_cr());
			
			//회계코드별 관리항목 코드			
			map.put("bankaccnt_no", ramtVo.getBankaccnt_no());
			map.put("mngmt_2060_nm", ramtVo.getDetls());
			map.put("occr_ymd", ramtVo.getDepst_ymd());
			map.put("updt_possbl_yn", "N");
			map.put("journ_cd", dVo.getJourn_cd());
			map.put("journ_odr", String.valueOf(dVo.getJourn_odr()));
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map));	
			
			// 잔액정산
			FspRamtCreatVo ramtCreatVo = new FspRamtCreatVo();
			
			ramtCreatVo.setUnslip_no(dVo.getUnslip_no());
			ramtCreatVo.setUnslip_odr(dVo.getUnslip_odr());
			ramtCreatVo.setAccnt_no(dVo.getAccnt_no());
			ramtCreatVo.setAccnt_cd(dVo.getAccnt_cd());
			ramtCreatVo.setExpns_cd(dVo.getExpns_cd());
			ramtCreatVo.setBase_debit_cr(dVo.getBase_debit_cr());			
			ramtCreatVo.setUnslip_amt(dVo.getUnslip_amt());
			ramtCreatVo.setBefore_amt(0);
			ramtCreatVo.setRmk_1(dVo.getRmk_1());
			ramtCreatVo.setRmk_2(dVo.getRmk_2());
			ramtCreatVo.setSlip_no(dVo.getOccr_slip_no());
			ramtCreatVo.setSlip_odr(dVo.getOccr_slip_odr());	
			ramtCreatVo.setUnslip_repay_upd_yn(false);
			slipVo.setRamtVo(ramtCreatVo);			
			
			// 결의생성 호출
			finSlipService.saveAutoSlip(slipVo);
			
			// 잔액입금내역테이블 unslip_no, unslip_odr 수정
			ramtVo.setUnslip_no(unslipNo);
			ramtVo.setUnslip_odr(chadeaOdr+1);
			spaDAO.updateFcpDepstDetls(ramtVo);
															
			chadeaOdr++;
		}
		
		// ============================================================================
		// 03-3. 정산추가계정내역 디테일 차변생성
		// ============================================================================		
		for (FspPayAdvcAdjstAddVo adjstAddVo : adjstAddListVo) {
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			dVo = new FspSlipDVo();
			
			reqClsf = adjstAddVo.getReq_clsf();
			
			// 추가계정의 구분이 계정추가, 초과분, 환차손인 경우만 차변 / 과입금, 환차익은 대변으로 처리
			if ("FEG001".equals(reqClsf) || "FEG002".equals(reqClsf)) {
			
				dVo.setReq_no(adjstAddVo.getAdjst_req_no());
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(chadeaOdr+1);
				dVo.setJourn_cd("Fn9910");
				dVo.setJourn_odr(chadeaOdr+1);
				dVo.setBase_debit_cr("1");
				dVo.setAccnt_no(adjstAddVo.getAccnt_no());
				dVo.setAccnt_cd(adjstAddVo.getAccnt_cd());
				dVo.setExpns_cd(adjstAddVo.getExpns_cd());
				dVo.setCtrl_no(adjstAddVo.getCtrl_no());
				dVo.setUnslip_amt(adjstAddVo.getReq_amt());
				dVo.setEvid_cd("FAH999");				
				if ("FEG001".equals(reqClsf)) {
					dVo.setRmk_1("계정추가 - " + adjstAddVo.getRmk().trim() + "(" + adjstAddVo.getDepstr_nm() + ", "+ adjstAddVo.getAccnt_no() + ")");
				} else if ("FEG002".equals(reqClsf)) {
					dVo.setRmk_1("초과분 - " + adjstAddVo.getRmk().trim() + "(" + adjstAddVo.getDepstr_nm() + ", "+ adjstAddVo.getAccnt_no() + ")");
				}
				dVo.setRmk_2(reqWrteDeptNm);				
				slipVo.setSlipDVo(dVo);
				
				//잔액관리항목
				
				//필수
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(chadeaOdr+1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				
				//회계코드별 관리항목 코드			
				map.put("mngmt_2060_nm", adjstAddVo.getRmk());
				map.put("occr_ymd", slipYmd);
				map.put("vend_cd", "");
				map.put("vend_nm", adjstAddVo.getDepstr_nm());
				map.put("req_no", adjstAddVo.getAdjst_req_no());
			    map.put("dept_cd", vo.getFspPayAdvcAdjstVo().getAdjst_dept());
			    map.put("dept_nm", vo.getFspPayAdvcAdjstVo().getAdjst_dept_nm());
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);
				
				// 가지급금정산예정 계정내역테이블 unslip_no, unslip_odr 수정
				adjstAddVo.setUnslip_no(unslipNo);	
				adjstAddVo.setUnslip_odr(chadeaOdr+1);
				spaDAO.updateFspPayAdvcAdjstAdd(adjstAddVo);			

							
				//집행내역테이블에 결의금액, 결의번호, 결의순번, trans_amt, part_all_clsf, trans_unslip_no, trans_unslip_odr, req_no(가지급금신청번호), req_seq(순번)			
				BblenfrcVo addAmtVo = new BblenfrcVo();
				
				addAmtVo.setUnslip_amt(adjstAddVo.getReq_amt());
				addAmtVo.setTrans_amt(adjstAddVo.getReq_amt());
				addAmtVo.setPart_all_clsf("F");
				addAmtVo.setTrans_unslip_no(unslipNo);
				addAmtVo.setTrans_unslip_odr(chadeaOdr+1);
				addAmtVo.setReq_no(adjstAddVo.getAdjst_req_no());
				addAmtVo.setReq_seq(adjstAddVo.getAdjst_req_odr());	
				comDAO.updateBblenFrcAddAmt(addAmtVo);												
				
				chadeaOdr++;
			} else if ("FEG003".equals(reqClsf)) { // 환차손은 FF030001, 잡손실(53175010), 비용코드(999)로 처리
				
				dVo.setReq_no(adjstAddVo.getAdjst_req_no());
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(chadeaOdr+1);
				dVo.setJourn_cd("Fn9910");
				dVo.setJourn_odr(chadeaOdr+1);
				dVo.setBase_debit_cr("1");
				dVo.setAccnt_no("FF030001");
				dVo.setAccnt_cd("53175010");
				dVo.setExpns_cd("999");
				dVo.setCtrl_no(adjstAddVo.getCtrl_no());
				dVo.setUnslip_amt(adjstAddVo.getReq_amt());
				dVo.setEvid_cd("FAH999");
				dVo.setRmk_1("환차손 - " + adjstAddVo.getRmk().trim());
				dVo.setRmk_2(reqWrteDeptNm);	
				slipVo.setSlipDVo(dVo);
				
				//잔액관리항목
				
				//필수
				Map<String, String> map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(chadeaOdr+1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("relat_no", KitechContextUtil.getSyspayno().substring(2, 8));
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
	
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);
				
				// 가지급금정산예정 계정내역테이블 unslip_no, unslip_odr 수정
				adjstAddVo.setUnslip_no(unslipNo);	
				adjstAddVo.setUnslip_odr(chadeaOdr+1);
				spaDAO.updateFspPayAdvcAdjstAdd(adjstAddVo);				
								
				chadeaOdr++;
			}						
		}
		/**********************************************************************
		 * 4.0. 결의서 디테일 대변생성
		 **********************************************************************/
		 //TO-DO -> 대변 만들기
		 slipVo = new FinComSlipVo();
		 slipVo.setSlip_ymd(hVo.getSlip_ymd());
		 dVo = new FspSlipDVo();
		 dVo.setReq_no(adjstFormVo.getAdjst_req_no());
		 dVo.setUnslip_no(unslipNo);
		 dVo.setUnslip_odr(chadeaOdr+1);
		 dVo.setJourn_cd("Fn9920");		
		 dVo.setJourn_odr(chadeaOdr+1);
		 dVo.setBase_debit_cr("2");
		 dVo.setAccnt_no(adjstFormVo.getAccnt_no());
		 dVo.setAccnt_cd(adjstFormVo.getAccnt_cd());
		 dVo.setExpns_cd(adjstFormVo.getExpns_cd());
		 dVo.setUnslip_amt(adjstFormVo.getRecv_amt());
		 // 가지급신청결의(160) 확정결의번호가 잔액생성테이블의 키임으로 정산결의(165)생성 시 넣어준다.
		 dVo.setOccr_slip_no(adjstFormVo.getReq_slip_no());
		 dVo.setOccr_slip_odr(1);
		 if (Rmkdaecount > 1) {
			 dVo.setRmk_1(Rmk + "외 " + (Rmkdaecount - 1) + "건"); //차변적요입력
		 } else {
			 dVo.setRmk_1(Rmk); //차변적요입력
		 }
		 dVo.setRmk_2(reqWrteDeptNm);
		 slipVo.setSlipDVo(dVo);
		 
		//필수
		Map<String, String> map = new HashMap<String,String>();
		map.put("unslip_no", unslipNo);
		map.put("unslip_odr", String.valueOf(chadeaOdr+1));		
		map.put("accnt_cd", dVo.getAccnt_cd());
		map.put("base_debit_cr", dVo.getBase_debit_cr());
		
		//회계코드별 관리항목 코드			
		map.put("mngmt_2060_nm", adjstFormVo.getRmk());
		map.put("occr_ymd", slipYmd);
		map.put("vend_cd", "");
		map.put("vend_nm", adjstFormVo.getDepstr_nm());
		map.put("req_no", adjstFormVo.getReq_no());
		map.put("relat_no", KitechContextUtil.getSyspayno().substring(2, 8));
		map.put("req_no", adjstFormVo.getReq_no());
		map.put("updt_possbl_yn", "N");
		map.put("journ_cd", dVo.getJourn_cd());
		map.put("journ_odr", String.valueOf(dVo.getJourn_odr()));
		map.put("dept_cd", vo.getFspPayAdvcAdjstVo().getAdjst_dept());
		map.put("dept_nm", vo.getFspPayAdvcAdjstVo().getAdjst_dept_nm());
		slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
		// 잔액정산
		FspRamtCreatVo ramtCreatVo = new FspRamtCreatVo();
		ramtCreatVo.setUnslip_no(unslipNo);
		ramtCreatVo.setUnslip_odr(dVo.getOccr_slip_odr());
		ramtCreatVo.setAccnt_no("FF030001");
		ramtCreatVo.setAccnt_cd("11137010"); //팀별가지급금
		ramtCreatVo.setExpns_cd("999");
		ramtCreatVo.setBase_debit_cr(dVo.getBase_debit_cr());			
		ramtCreatVo.setUnslip_amt(dVo.getUnslip_amt());
		ramtCreatVo.setWon_occr_amt(adjstFormVo.getRecv_amt());
		ramtCreatVo.setRmk_1(adjstFormVo.getReq_cause());
		ramtCreatVo.setRmk_2("");
		ramtCreatVo.setUnslip_repay_amt(0);
		ramtCreatVo.setSlip_no(adjstFormVo.getReq_slip_no());
		ramtCreatVo.setSlip_odr(1);	
		ramtCreatVo.setUnslip_repay_upd_yn(false);
		if (ramtCreatVo.getUnslip_no() != null) {		
			slipVo.setRamtVo(ramtCreatVo);			
		}		
		
		// 결의생성 호출
		finSlipService.saveAutoSlip(slipVo);
		
		chadeaOdr++;
		
		// ============================================================================
		// 정산추가계정내역 디테일 대변생성
		// ============================================================================		
		for (FspPayAdvcAdjstAddVo adjstAddVo : adjstAddListVo) {
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());
			dVo = new FspSlipDVo();
			
			reqClsf = adjstAddVo.getReq_clsf();
			
			// 환차익은 대변("FF030001")으로 처리, 회계코드 잡수익(45005010), 비용코드(999)
			if ("FEG004".equals(reqClsf)) {
				
				dVo.setReq_no(adjstAddVo.getAdjst_req_no());
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(chadeaOdr+1);
				dVo.setJourn_cd("Fn9920");		
				dVo.setJourn_odr(chadeaOdr+1);
				dVo.setBase_debit_cr("2");
				dVo.setAccnt_no("FF030001");
				dVo.setAccnt_cd("45005010");
				dVo.setExpns_cd("999");
				dVo.setUnslip_amt(adjstAddVo.getReq_amt());
				dVo.setRmk_1("환차익 - " + adjstAddVo.getRmk().trim());
				dVo.setRmk_2(reqWrteDeptNm);
				slipVo.setSlipDVo(dVo);
				 
				//필수
				map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(chadeaOdr+1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("relat_no", KitechContextUtil.getSyspayno().substring(2, 8));	
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);				 			
			
				chadeaOdr++;
			} else if ("FEG005".equals(reqClsf) || "FEG001".equals(reqClsf) || "FEG002".equals(reqClsf)) { // 과입금, 계정추가, 초과분은 FF030001, 미지급당좌(21009010), 비용코드(999)			
				
				dVo.setReq_no(adjstAddVo.getAdjst_req_no());
				dVo.setUnslip_no(unslipNo);
				dVo.setUnslip_odr(chadeaOdr+1);
				dVo.setJourn_cd("Fn9920");		
				dVo.setJourn_odr(chadeaOdr+1);
				dVo.setBase_debit_cr("2");
				dVo.setAccnt_no("FF030001");
				dVo.setAccnt_cd("21009010");
				dVo.setExpns_cd("999");
				dVo.setUnslip_amt(adjstAddVo.getReq_amt());
				
				if ("FEG005".equals(reqClsf)) {
					dVo.setRmk_1("과입금 - " + adjstAddVo.getRmk().trim());
				} else if ("FEG001".equals(reqClsf)) {
					dVo.setRmk_1("계정추가 - " + adjstAddVo.getRmk().trim());
				} else if ("FEG002".equals(reqClsf)) {
					dVo.setRmk_1("초과분 - " + adjstAddVo.getRmk().trim());
				}
				dVo.setRmk_2(reqWrteDeptNm);
				slipVo.setSlipDVo(dVo);
				//필수
				map = new HashMap<String,String>();
				map.put("unslip_no", unslipNo);
				map.put("unslip_odr", String.valueOf(chadeaOdr+1));		
				map.put("accnt_cd", dVo.getAccnt_cd());
				map.put("base_debit_cr", dVo.getBase_debit_cr());
				map.put("relat_no", KitechContextUtil.getSyspayno().substring(2, 8));
				
				//회계코드별 관리항목 코드
				map.put("occr_ymd", slipYmd);
				slipVo.setMngmtList(finComService.getFspSlipMngmt(map));
				
				// 송금의뢰내역 조회 및 입력
				List<FspSendReqVo> sendListVo = new ArrayList<>();
				for (FspSendReqVo sendVo : spaDAO.selectFspSendReqS(tmpVo)) {
					sendVo.setUnslip_no(unslipNo);
					sendVo.setUnslip_odr(chadeaOdr+1);
					sendVo.setSend_odr(chadeaOdr+1);
					sendVo.setSend_req_amt(adjstAddVo.getReq_amt());
					
					if ("FEG005".equals(reqClsf)) {
						sendVo.setRmk("과입금 - " + adjstAddVo.getRmk().trim());
					} else if ("FEG001".equals(reqClsf)) {
						sendVo.setRmk("계정추가 - " + adjstAddVo.getRmk().trim());
					} else if ("FEG002".equals(reqClsf)) {
						sendVo.setRmk("초과분 - " + adjstAddVo.getRmk().trim());
					}
					
					sendListVo.add(sendVo);
					
				}				
				slipVo.setSendList(sendListVo);
					
				// 결의생성 호출
				finSlipService.saveAutoSlip(slipVo);
							
				chadeaOdr++;																				
			}
		}
		
		FinSpaSlipUpdVo updVo = new FinSpaSlipUpdVo();
		updVo.setReq_no(adjstReqNo);
		updVo.setUnslip_no(unslipNo);	
		attachService.updateFspEvidAttach(updVo);		
						
		// 02.전자증빙(크리스피드)
		EvidAttachVo attachVo = new EvidAttachVo();
		attachVo.setUnslip_no(unslipNo);
		attachService.executeProcess(attachVo);		
							
	}
			
  /**
    * 가지급금 및 전도금정산 삭제 한다.
    * @author 
    * @since 2023.08.29.
    */
  @Override
	public FspPayAdvcAdjstVo deleteFspPayAdvcAdjst(FspPayAdvcAdjstListVo vo) throws ElException, IOException {	  	
	  	if (!(vo.getFspPayAdvcAdjstVo().getUnslip_no() == null || "".equals(vo.getFspPayAdvcAdjstVo().getUnslip_no()))) {	  	
	  		// 01. 결의확정여부에 따라 삭제 가능 체크
	  		Map<String, String> map1 = slipDao.selectFspSlipHDecsnEx(vo.getFspPayAdvcAdjstVo().getUnslip_no());
	  		if ("Y".equals(map1.get("decsn_ex"))) {
	  			throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.com.0003", new String[]{"해당 결의서는 " + map1.get("accnt_ymd") + " 일자로 확정 완료되어"});
	  		} else {
	  			if (!"".equals(vo.getFspPayAdvcAdjstVo().getUnslip_no())) {
	  				//가지급금(전도금)정산 결의 취소
	  				finAutoSlipService.deleteFinPayAdvcAdjstSlipMnt(vo.getFspPayAdvcAdjstVo().getUnslip_no(),vo.getFspPayAdvcAdjstVo().getReq_no());
	  			}
	  		}		
		}
		List <FspPayAdvcAdjstAddVo> addVoListVo = vo.getFspPayAdvcAdjstAddVoList();				
		// (1) 가지급금전도금계정추가내역 테이블 삭제
		for (FspPayAdvcAdjstAddVo addVo : addVoListVo){
			if (addVo.getAccnt_no().equals("FF030001")){
				//원인행위삭제
				DelBblEnfrcVo enfrcVo = new DelBblEnfrcVo();
				enfrcVo.setReq_no(addVo.getAdjst_req_no());
				if(!StringUtils.isEmpty(String.valueOf(addVo.getAdjst_req_no()))){
					enfrcVo.setReq_seq(String.valueOf(addVo.getAdjst_req_odr()));
				}			
				finComService.deleteBudEnfrcMnt(enfrcVo);
				//가지급금정산계정삭제
				spaDAO.deleteFspPayAdvcAdjstAdd(addVo);				
			} else {
				spaDAO.deleteFspPayAdvcAdjstAdd(addVo);
			}		
		}
		// (2) 가지급금 입금내역 삭제
		List <FcpDepstDetlsVo> detlsListVo = vo.getFcpDepstDetlsVoList();			
		for (FcpDepstDetlsVo reqVo : detlsListVo) {		
			reqVo.setSlip_no("");
			reqVo.setReq_no(reqVo.getDepst_req_no());
			reqVo.setDepst_liq(reqVo.getDepst_amt());
	
			//입금의뢰 삭제
			depstService.deleteDepstReq(reqVo);
			//잔액내역테이블 삭제
			spaDAO.deleteFcpDepstDetls(reqVo);			
		}	
		 // (3) 가지급금전도금 정산신청계정내역 테이블 삭제
		spaDAO.deleteFspPayAdvcAdjstAccnt(vo.getFspPayAdvcAdjstVo());		
		 // (4) 가지급금전도금 정산신청 테이블 삭제
		spaDAO.deleteFspPayAdvcAdjst(vo.getFspPayAdvcAdjstVo());
		 // (5) 가지급금전도금 정산신청 번호 초기화
		spaDAO.updateFspPayAdvcReqReset(vo.getFspPayAdvcAdjstVo());			
    	//  (6) 결재 삭제
    	apprFuncService.formRemove(vo.getFspPayAdvcAdjstVo().getAdjst_req_no());			
		
	return vo.getFspPayAdvcAdjstVo();
	}

}
