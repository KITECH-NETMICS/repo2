package kr.re.kitech.biz.fin.spa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinComSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.spa.dao.FinAutoSlipDAO;
import kr.re.kitech.biz.fin.spa.dao.FinLocalTripSlipDAO;
import kr.re.kitech.biz.fin.spa.service.FinLocalTripSlipService;
import kr.re.kitech.biz.fin.spa.vo.CtrLocalSlipDVo;
import kr.re.kitech.biz.fin.spa.vo.CtrLocalSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FinAutoSlipCrtVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 근거리출장 결의생성 ServiceImpl
 * @Class Name FinLocalTripSlipServiceImpl.java
 * @Description 근거리출장 결의생성 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/03/21      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/03/21
 * @version 1.0
 * @see
 * 
 */
@Service("finLocalTripSlipService")
public class FinLocalTripSlipServiceImpl extends EgovAbstractServiceImpl implements FinLocalTripSlipService {
	@Resource(name="finLocalTripSlipDAO")
	private FinLocalTripSlipDAO dao;
	
	@Resource(name="finAutoSlipDAO")
	private FinAutoSlipDAO autoDao;
	
	@Resource(name="finSlipSaveService")
	private FinSlipSaveService slipService;
	
	@Resource(name = "finComService")
	private FinComService finComService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	/**
     * 근거리 출장 결의생성 목록 조회
     * @param FinSpaSrcVo
     * @return List<CtrLocalSlipVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.03.21.
     */
	@Override
	public List<CtrLocalSlipVo> selectCtrLocalSlip(FinSpaSrcVo vo) throws KitechException{
		return dao.selectCtrLocalSlip(vo);
	}
	
	/**
     * 근거리 출장 결의생성
     * @param FinAutoSlipCrtVo
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.03.22.
     */
	public String saveLocalTripSlip(FinAutoSlipCrtVo vo) throws KitechException{
		// 결의생성을 위한 Vo
		FinComSlipVo slipVo = null;	
		
		String unslipNo = "";
		// ==================================================== //
		// 1. 결의서 헤더
		// ==================================================== //	
		FspSlipHVo hVo = new FspSlipHVo();
		hVo.setSlip_ymd(vo.getSlip_ymd());		
		hVo.setSlip_typ_cd("125");
		hVo.setRmk("근거리출장(" + vo.getRmk() + ")");
		
		String[] reqNoArr = vo.getReq_no().split(",");
		List<ComReqVo> reqNoList = new ArrayList<>();
		
		ComReqVo reqVo = null;
		for(String reqNo : reqNoArr){
			reqVo = new ComReqVo();
			reqVo.setReq_no(reqNo);
			
			reqNoList.add(reqVo);
		}
		
		unslipNo = slipService.saveAutoSlipH("", reqNoList, hVo);
		
		// ==================================================== //
		// 2. 결의서 디테일(차변저장)
		// ==================================================== //	
		vo.setReqNoList(reqNoList);
		
		List<CtrLocalSlipDVo> slipDList = dao.selectCtrLocalSlipDr(vo);
		int seq = 1;
		for(CtrLocalSlipDVo dVo : slipDList){	
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());		
			
			// 2-1. 디테일 저장
			dVo.setUnslip_no(unslipNo);
			dVo.setUnslip_odr(seq);			
			dVo.setJourn_odr(seq);				
			
			slipVo.setSlipDVo(dVo);			
			
			// 2-2. 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", dVo.getAccnt_cd());
			map2.put("base_debit_cr", dVo.getBase_debit_cr());			
			map2.put("req_no", dVo.getReq_no());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 2.3 송금내역생성 (원차량사용 신청서인 경우 개인지급 없음)
			if("FDO001".equals(dVo.getCar_use_yn())){
				List<FspSendReqVo> sendList = dao.selectCtrLocalSendReq(dVo.getReq_no());
				
				if(sendList != null && sendList.size() > 0){
					int sendOdr = 1;
					for(FspSendReqVo sendVo : sendList){
						if(sendVo.getBank() == null || "".equals(sendVo.getBank().trim())){
							throw new KitechException(Exceptions.ALERT, Business.CCS, "message.alert.ccs.ctr.0012", new String[]{dVo.getReq_no()});
						}
						
						sendVo.setUnslip_no(unslipNo);
						sendVo.setUnslip_odr(seq);
						sendVo.setSend_odr(sendOdr);
						
						sendOdr++;
					}					
					slipVo.setSendList(sendList);
				}
			}
			
			// 2-4.결의생성 호출
			slipService.saveAutoSlip(slipVo);
			
			seq++;		
			
			// 2-5.근거리출장 결의정보 수정
			dao.updateCtrLocalUnslipNo(dVo);
			
			// 2.6 원인행위테이블의 결의정보 수정			
			dVo.setPart_all_clsf("F");						
			autoDao.updateBblenfrcAutoSlip(dVo);
		}
		
		// ==================================================== //
		// 3. 결의서 디테일(대변저장)
		// ==================================================== //	
		List<FspSlipDVo> crList = dao.selectCtrLocalSlipCr(vo);
					
		for(FspSlipDVo crVo : crList){
			// FF030001 계정 대변의 금액(total_amt)이 0원이면 생성하지 않는다.
			if("FF030001".equals(crVo.getAccnt_no()) && crVo.getTotal_amt() == 0){
				continue;
			}
			slipVo = new FinComSlipVo();
			slipVo.setSlip_ymd(hVo.getSlip_ymd());	
			
			// 3-1. 대변 저장
			crVo.setUnslip_no(unslipNo);
			crVo.setUnslip_odr(seq);
			crVo.setJourn_odr(seq);
			crVo.setBase_debit_cr("2");
			
			slipVo.setSlipDVo(crVo);
			
			// 3-2. 관리항목
			Map<String, String> map2 = new HashMap<String,String>();
			map2.put("unslip_no", unslipNo);
			map2.put("unslip_odr", String.valueOf(seq));
			map2.put("accnt_cd", crVo.getAccnt_cd());
			map2.put("base_debit_cr", crVo.getBase_debit_cr());			
			map2.put("occr_ymd", hVo.getSlip_ymd());
			
			slipVo.setMngmtList(finComService.getFspSlipMngmt(map2));
			
			// 3-3.결의생성 호출
			slipService.saveAutoSlip(slipVo);
			
			seq++;		
		}
		
		// ==================================================== //
		// 4. 전자증빙
		// ==================================================== //	
		FbaExpnsEvidVo paramVo = new FbaExpnsEvidVo();
		paramVo.setDoc_id("C76");
		List<FspEvidAttachVo> evidVoList = attachService.selectFbaExpnsEvidList(paramVo);
		
		for(FspEvidAttachVo evidVo : evidVoList){
			evidVo.setReq_no(unslipNo);
			evidVo.setUnslip_no(unslipNo);
			evidVo.setKey_val(unslipNo);
		}
		attachService.saveFspEvidAttach(evidVoList);	
		
		// 전자증빙(크리스피드)
		EvidAttachVo attachVo = new EvidAttachVo();			
		attachVo.setUnslip_no(unslipNo);	
		attachService.executeProcess(attachVo);		
		
		return unslipNo;
	}
	
	/**
    * 근거리출장결의서 삭제
    * @param FinAutoSlipCrtVo
    * @throws Exception
    * @author LeeYH
    * @since 2023.03.24.
    */
	public void deleteLocalTripSlip(FinAutoSlipCrtVo vo) throws KitechException{		
		// 1) 결의서 삭제
		slipService.deleteFspSlip(vo.getUnslip_no());
		
		// 2) ctrlocal- unslip_no 초기화
		dao.updateCtrLocalSlipDel(vo.getUnslip_no());
		
		// 3) 집행내역 결의정보 초기화
		DelBblEnfrcVo delVo = new DelBblEnfrcVo();
		delVo.setUnslip_no(vo.getUnslip_no());
		delVo.setPart_all_clsf("");
		
		autoDao.updateBblenfrcDel(delVo);
		
		// 4) 전자증빙 삭제
		FbaExpnsEvidVo evidVo = new FbaExpnsEvidVo();
		evidVo.setReq_no(vo.getUnslip_no());
		evidVo.setRqst_no(vo.getUnslip_no());
		attachService.deleteFspAttchEvid(evidVo);
	}
}
