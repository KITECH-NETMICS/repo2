package kr.re.kitech.biz.fin.spm.service.impl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.service.ExceptService;
import kr.re.kitech.biz.com.vo.ExceptItemVo;
import kr.re.kitech.biz.fin.com.dao.FinComDAO;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.service.FinSlipSaveService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.BugtRamtVo;
import kr.re.kitech.biz.fin.com.vo.FbaCardVo;
import kr.re.kitech.biz.fin.com.vo.FinSaveSlipVo;
import kr.re.kitech.biz.fin.com.vo.FinSlipAprVo;
import kr.re.kitech.biz.fin.com.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo;
import kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo;
import kr.re.kitech.biz.fin.spm.dao.FinExpnsSlipDAO;
import kr.re.kitech.biz.fin.spm.service.FinExpnsSlipMntService;
import kr.re.kitech.biz.fin.spm.vo.CardInfoVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsAmtSummryVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsSlipMngmtVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsSlipVo;
import kr.re.kitech.biz.fin.spm.vo.FinExpnsSlipNumVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FinSpmSlipVo;
import kr.re.kitech.biz.fin.spm.vo.GenrlSlipVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.spm.vo.PreAprCheckVo;
import kr.re.kitech.biz.fin.std.vo.FbaAccntMngmtVo;
import kr.re.kitech.biz.fin.std.vo.XodfAccntVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**
 * FinExpnsSlipMntServiceImpl
 * 경비결의 ServiceImpl
 * @author LeeYH-PC
 * @since 2022.04.08.
 */
@Service("finExpnsSlipService")
public class FinExpnsSlipMntServiceImpl extends EgovAbstractServiceImpl implements FinExpnsSlipMntService {
	@Resource(name="finExpnsSlipDAO")
	private FinExpnsSlipDAO expnsDao;
	
	@Resource(name="finComDAO")
	private FinComDAO finComDao;
	
	@Resource(name="finComService")
	private FinComService comService;
	
	@Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    @Resource(name="finSlipSaveService")
	private FinSlipSaveService slipService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;
	
	@Resource(name="exceptService")
	private ExceptService exceptService;
	
	/**
    * 카드결의 목록 조회
    */
	@Override
	public List<FinSpmSlipVo> selectFinSlipList(FinSlipSearchVo vo) throws ElException {
		return expnsDao.selectFinSlipList(vo);
	}
	
	/**
    * 카드결의 결의대상 카드목록, 일반결의 카드내역팝업 조회
    */
	public List<CardInfoVo> selectFinExpnsSlipCardList(FinSlipSearchVo vo) throws ElException{
		if(StringUtil.isEmpty(vo.getKeep_charg())){
			// 카드구분, 카드종류 조회 (카드번호 뒤 8자리 XXXX-XXXX)
			if(vo.getCard_no() == null || "".equals(vo.getCard_no())){
				vo.setCard_no(vo.getCard_no_tmp());
			}
			
			if(!"".equals(vo.getCard_no())){
				FbaCardVo cardVo = finComDao.selectFbaCard(vo.getCard_no());		
				if(cardVo != null){
					vo.setCardno(cardVo.getCardno());
					vo.setCard_clsf(cardVo.getCard_clsf());
					vo.setCard_knd(cardVo.getCard_knd());
					vo.setCard_no(cardVo.getCard_no());
				}else{
					throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0007", new String[]{"카드번호[" + vo.getCard_no() +"]"});
				}
			}
		}
		return expnsDao.selectFinExpnsSlipCardList(vo);
	}
	
	/**
    * 경비결의, 일반결의 관리항목 조회
    */
	public List<FbaAccntMngmtVo> selectSlipMngmtList(FinSlipSearchVo vo) throws ElException{
		FbaAccntMngmtVo mngmtVo = new FbaAccntMngmtVo();
		mngmtVo.setAccnt_cd(vo.getAccnt_cd());
		if(vo.getBase_debit_cr() == null || "".equals(vo.getBase_debit_cr())){
			mngmtVo.setDebit_cr_clsf("1");
		}else{
			mngmtVo.setDebit_cr_clsf(vo.getBase_debit_cr());
		}
		
		return finComDao.selectFbaAccntMngmtList(mngmtVo);
	}
	
	/**
    * 카드결의 헤더,디테일리스트, 비용합계 조회
    */
	public ExpnsSlipVo selectExpnsCardSlip(FinSlipSearchVo vo) throws ElException{
		ExpnsSlipVo retVo = new ExpnsSlipVo();
		// 헤더조회
		retVo.setSlipHVo(expnsDao.selectFspSlipH(vo.getUnslip_no()));
		// 디테일 리스트 조회
		retVo.setSlipDList(expnsDao.selectFspSlipDList(vo));		
		// 비용합계 조회ExpnsSlipVo	
		retVo.setEvidSumVo(expnsDao.selectExpnsCardSum(vo));
		return retVo;
	}
	
	/**
    * 경비결의(일반) 헤더,디테일리스트, 비용합계 조회
    */
	public ExpnsSlipVo selectExpnsBillSlip(FinSlipSearchVo vo) throws ElException{
		ExpnsSlipVo retVo = new ExpnsSlipVo();
		// 헤더조회
		retVo.setSlipHVo(expnsDao.selectFspSlipH(vo.getUnslip_no()));
		// 디테일 리스트 조회
		retVo.setSlipDList(expnsDao.selectFspSlipDList(vo));		
		// 비용합계 조회ExpnsSlipVo
		retVo.setEvidSumVo(expnsDao.selectExpnsBillSum(vo.getUnslip_no()));
		return retVo;
	}
	
	/**
    * 카드결의 관리항목 및 카드정보 조회
    */
	public ExpnsSlipMngmtVo selectSlipMngmtAndCard(FinSlipSearchVo vo) throws ElException{
		ExpnsSlipMngmtVo retVo = new ExpnsSlipMngmtVo();
		retVo.setMngmtList(expnsDao.selectFspSlipMngmtList(vo));
		
		// 카드사용일자, 승인번호 누락시 다시 조회
		if(StringUtil.isEmpty(vo.getUse_ymd()) || StringUtil.isEmpty(vo.getApprvl_no())){
			if(!StringUtil.isEmpty(vo.getCard_no())){
			    FspSlipDVo dVo = new FspSlipDVo();
			    dVo.setUnslip_no(vo.getUnslip_no());
			    dVo.setUnslip_odr(vo.getUnslip_odr());
			    dVo.setCard_no(vo.getCard_no());
				CardInfoVo cardVo = slipService.selectCardInfo(dVo);
				if(cardVo != null){
					vo.setApprvl_no(cardVo.getApprvl_no());
					vo.setUse_ymd(cardVo.getUse_ymd());
					vo.setCard_clsf(cardVo.getCard_clsf());
					vo.setCard_knd(cardVo.getCard_knd());
				}
			}
		}
		retVo.setCardVo(expnsDao.selectExpnsCardSlip(vo));		
		return retVo;
	}
	
	/**
    * 경비결의(일반) 관리항목, 송금내역, 계산서정보 조회
    */
	public ExpnsSlipMngmtVo selectSlipMngmtAndBill(FinSlipSearchVo vo) throws ElException{	
		ExpnsSlipMngmtVo retVo = new ExpnsSlipMngmtVo();
		retVo.setMngmtList(expnsDao.selectFspSlipMngmtList(vo));
		
		// 공제일 경우에는 송금내역 및 계산서 정보 조회하지 않음
		if(!"2".equals(vo.getBase_debit_cr())){
			retVo.setSendList(expnsDao.selectFspSendReqList(vo));
			
			if(!"".equals(vo.getIssu_seqno())){
				vo.setRelat_no("");
				List<KtxIssuMstrVo> billList = expnsDao.selectKtxIssuMstrList(vo);
				if(billList != null && billList.size() > 0){
					retVo.setBillVo(expnsDao.selectKtxIssuMstrList(vo).get(0));
				}
			}
		}
		return retVo;
	}
	
	/**
    * 일반결의 관리항목, 송금내역, 계산서정보, 카드내역 조회
    */
	public ExpnsSlipMngmtVo selectSlipMngmtAndEtc(FinSlipSearchVo vo) throws ElException{	
		ExpnsSlipMngmtVo retVo = new ExpnsSlipMngmtVo();
		retVo.setMngmtList(expnsDao.selectFspSlipMngmtList(vo));
		
		// 송금내역
		if(vo.getJourn_cd().matches("Fn0126|Fn0500")){
			retVo.setSendList(expnsDao.selectFspSendReqList(vo));
		}
		
		// 계산서 내역
		if(!"".equals(vo.getIssu_seqno())){
			List<KtxIssuMstrVo> billList = expnsDao.selectKtxIssuMstrList(vo);
			if(billList != null && billList.size() > 0){
				retVo.setBillVo(expnsDao.selectKtxIssuMstrList(vo).get(0));
			}
		}
		
		// 카드내역
		if(!"".equals(vo.getCard_no())){			
			retVo.setCardVo(expnsDao.selectExpnsCardSlip(vo));	
		}
		
		return retVo;
	}
	
	/**
    * 이지바로과제 증빙개수 조회 및 저장
    */
	public FinExpnsSlipNumVo selectFspItmEvidDetlsCnt(FinSlipSearchVo vo) throws ElException{
		FinExpnsSlipNumVo cntVo = new FinExpnsSlipNumVo();	
		// 건수 조회
		int cnt = expnsDao.selectFspItmEvidDetlsCnt(vo);
		
		if(vo.getExpns_cd().matches("410|411") && cnt == 0){
			// 2017.10.24. 이지바로과제일 경우 회의록 참조하여 fspitmeviddetls저장, 비용코드 410, 411일 때
			cnt = expnsDao.insertFspItmEvidDetlsBySel(vo);			
		}
		
		cntVo.setCnt(cnt);
		return cntVo;
	}
	
	/**
    * 경비결의 계산서 정보 조회
    */
	public List<KtxIssuMstrVo> selectKtxIssuMstrList(FinSlipSearchVo vo) throws ElException{
		return expnsDao.selectKtxIssuMstrList(vo);
	}
	
	/**
    * 경비결의(일반) 헤더,디테일리스트, 비용합계 조회
    */
	public GenrlSlipVo selectGenrlSlip(FinSlipSearchVo vo) throws ElException{
		GenrlSlipVo retVo = new GenrlSlipVo();
		// 헤더조회
		FspSlipHVo hVo = expnsDao.selectFspSlipH(vo.getUnslip_no()); 		
		if("119".equals(vo.getUnslip_no().substring(0,3))){
			Map<String,String> map = expnsDao.selectSmlItmCheckupAserReg(vo.getUnslip_no());
			hVo.setAset_reg(map.get("aset_reg"));
			hVo.setAset_manager(map.get("aset_manager"));
		}
		retVo.setHVo(hVo);
		
		// 디테일 차변 조회
		vo.setBase_debit_cr("1");
		retVo.setDrList(expnsDao.selectFspSlipDList(vo));			
		// 디테일 대변 조회
		vo.setBase_debit_cr("2");
		retVo.setCrList(expnsDao.selectFspSlipDList(vo));		
		
		return retVo;
	}
	
	/**
    * 관리항목 조회(일반결의 결의내역 대체처리)
    */
	public List<FspSlipMngmtVo> selectSlipMngmt(FinSlipSearchVo vo) throws ElException{
		return expnsDao.selectFspSlipMngmtList(vo);
	}

    /**
    * 일반결의 수입처리 회계코드 조회
    * @param FinSlipSearchVo
    * @return XodfAccntVo
    * @author LeeYH
    */
	public XodfAccntVo selectAccntCdByFinBsnsClsf(FinSlipSearchVo vo) throws ElException{
		return expnsDao.selectAccntCdByFinBsnsClsf(vo);
	}
	
	/**
    * 이지바로 과제 회의록 증빙 조회
    * @param FinSlipSearchVo
    * @return List<FspItmEvidDetlsVo>
    * @author LeeYH
    * @since 2022.05.30.
    */
	public List<FspItmEvidDetlsVo> selectFspItmEvidDetlsList(FinSlipSearchVo vo) throws ElException{
		// 건수 조회 후 없으면 fspmeetmnth 참조하여 저장
		FinExpnsSlipNumVo cntVo = this.selectFspItmEvidDetlsCnt(vo);
		if(cntVo.getCnt() > 0){
			return expnsDao.selectFspItmEvidDetlsList(vo);
		}else{
			return new ArrayList<FspItmEvidDetlsVo>();
		}
	}
	
	/**
    * 이지바로 과제 회의록 등 증빙 저장
    * @param FspItmEvidDetlsListVo
    * @author LeeYH
    * @since 2022.05.31.
    */
	public void insertFspItmEvidDetls(List<FspItmEvidDetlsVo> voList) throws ElException{
		int idx = 0;
		boolean delYn = false;
		for(FspItmEvidDetlsVo vo : voList){
			if(!delYn && !"C".equals(vo.getCud_type())){
				// 저장된 데이터 삭제
				expnsDao.deleteFspItmEvidDetls(vo);
				delYn = true;
			}
			
			vo.setOdr(++idx);
			// 증빙저장
			if(expnsDao.insertFspItmEvidDetls(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"신연구비증빙저장"});
			}
		}
	}
	
	/**
    * 이지바로 과제 회의록 등 증빙 삭제
    * @param FspItmEvidDetlsVo
    * @author LeeYH
    * @since 2022.05.31.
    */
	public void deleteFspItmEvidDetls(FspItmEvidDetlsVo vo) throws ElException{
		if(expnsDao.deleteFspItmEvidDetls(vo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"신연구비증빙삭제"});
		}
	}
	
	/**
    * 결의서 결재전 체크
    * @param FinSlipSearchVo
    * @return PreAprCheckVo
    * @author LeeYH
    * @since 2022.05.31.
    */
	public List<PreAprCheckVo> selectPreApprvCheck(FinSlipSearchVo vo) throws ElException{
		// 이지바로 과제 증빙 체크
		if("evid_check".equals(vo.getInqr_clsf())){
			return expnsDao.selectEvidDetlsCntPreApr(vo);
			
		}else if("amt_check".equals(vo.getInqr_clsf())){
			// 결의서 디테일 조회
			vo.setBase_debit_cr("");
			List<FspSlipDVo> slipList = expnsDao.selectFspSlipDList(vo);
			
			StringBuilder rtnMsg = new StringBuilder();
			int chkCnt = 0;
			
			for(FspSlipDVo slipVo : slipList){
				if(!StringUtil.isEmpty(slipVo.getBill_no())){
					KtxIssuMstrComVo billVo = new KtxIssuMstrComVo();
					billVo.setIssu_seqno(slipVo.getBill_no());
								
					billVo = expnsDao.selectBillAmtPreApr(billVo);
					
					if(billVo != null){
						// 계산서 공급가액 + 세액이 결의금액과 다르면 메세지 리턴
						if(billVo.getChrg_amt() + billVo.getTax_amt() != billVo.getTrans_amt()){
							rtnMsg.append(" [" + slipVo.getBill_no()+ " // " + (String.valueOf(billVo.getChrg_amt()) + String.valueOf(billVo.getTax_amt())) + " // " + String.valueOf(billVo.getTrans_amt()) + "] \n");
							chkCnt++;
						}
					}
				}else if(!StringUtil.isEmpty(slipVo.getCard_no())){
					KtxIssuMstrComVo cardVo = expnsDao.selectCardAmtPreApr(slipVo);
					
					if(cardVo != null){
						// 카드사용 공급가액 + 세액이 결의금액과 다르면 메세지 리턴
						if(cardVo.getChrg_amt() + cardVo.getTax_amt() != cardVo.getTrans_amt()){
							rtnMsg.append(" [" + slipVo.getCard_no()+ "(" + slipVo.getApprvl_no() + ") // " + (String.valueOf(cardVo.getChrg_amt()) + String.valueOf(cardVo.getTax_amt())) + " // " + String.valueOf(cardVo.getTrans_amt()) + "] \n");
							chkCnt++;
						}
					}
				}
			}
			List<PreAprCheckVo> retVo = new ArrayList<PreAprCheckVo>();
			PreAprCheckVo chkVo = new PreAprCheckVo();
			chkVo.setRtn_msg(rtnMsg.toString());
			chkVo.setChk_cnt(chkCnt);
			retVo.add(chkVo);
			return retVo;
		}else {
			return null;
		}
	}	
	
	/**
    * 경비결의, 일반결의 결의생성
    * @param FinSaveSlipVo
    * @author LeeYH
    * @since 2022.11.30. 수정
    */
	public FinSlipSearchVo saveFinExpnsSlip(FinSaveSlipVo vo) throws KitechException{
		FinSlipSearchVo srcVo = slipService.saveSlip(vo);
		
		if("U".equals(vo.getSlipHVo().getCud_type())){
			String unslipNo = vo.getSlipHVo().getUnslip_no();
			// AprState 체크하는 공통 메소드호출
			if(!unslipNo.substring(0, 3).equals("150")) {
				if(!unslipNo.substring(0, 3).matches("110|113|117")){
					if(expnsDao.selectXomxIntfaTabCnt(unslipNo) == 0){
						apprFuncService.formInit(unslipNo);
					}		
				} else {
					String serviceId = "";
					switch(unslipNo.substring(0, 3)) {
						case "113": serviceId = "F201"; break;
						case "117": serviceId = "F202"; break;
						case "110": serviceId = "F203"; break;
					}
					try {
					    apprValidService.isWaitStateAtIntfatab(serviceId, unslipNo);
					} catch (KitechException ex) {
					    throw ex;
					}			
				}
			}
		}
	
		if(vo.getSlipHVo().isApproval()){			
			try {
				this.approvalExpnsSlip(vo.getSlipHVo());
			}catch (KitechException ex) {
				throw ex;
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new KitechException(Exceptions.ERROR, Business.FIN, "결재신청시 에러가 발생하였습니다.", e);
			}			
		}
		
		return srcVo;
	}
	
	/**
    * 일반, 경비결의 결재신청
    * @param FspSlipDVo
    * @author LeeYH
    * @since 2022.07.28.
    */
	private void approvalExpnsSlip(FspSlipHVo vo) throws Exception{		
		String unslipNo = vo.getUnslip_no();	
		String unslipNoSub = unslipNo.substring(0,3);		
		
		if("113".equals(unslipNoSub)){
			ExpnsAmtSummryVo sumVo = expnsDao.selectExpnsBillSum(unslipNo);
			if(sumVo.getTot_expns_amt() != sumVo.getTot_dedct_amt() + sumVo.getTot_send_amt()){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.ui.fin.051");
			}
			
			if(sumVo.getTot_evid_amt() != sumVo.getTot_expns_amt()){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.ui.fin.056");
			}
		}else if("117".equals(unslipNoSub)){
		}else{
			ExpnsAmtSummryVo sumVo = expnsDao.selectSlipDAmtSum(unslipNo);
			if(sumVo.getCheck_amt() != 0){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.alert.fin.spm.0009", new String[]{String.valueOf(sumVo.getDr_amt()), String.valueOf(sumVo.getCr_amt()), String.valueOf(sumVo.getCheck_amt())});
			}
			
			if(!"110".equals(unslipNoSub)){
				if(expnsDao.selectXomxIntfaTabCnt(unslipNo) == 0){
					apprFuncService.formInit(unslipNo);
				}
			}
		}
		
		// 2) 결의서 디테일 조회
		List<FspSlipDAprVo> slipdList = expnsDao.selectSlipDAprList(unslipNo);
		
		BblenfrcVo bblVo = new BblenfrcVo();
		bblVo.setBugt_yr(vo.getSlip_ymd().substring(0,4));
		int cnt = 1;
		
		List<String> accntNos = new ArrayList<String>();
		
		String expsnCdVal = "N";
		String amtChkVal = "N";
		String bookManager = ""; // 비용코드 143인 경우 도서담당자
		int awaitCnt = 0;
		
		for(FspSlipDAprVo slipdVo : slipdList){
			if("1".equals(slipdVo.getBase_debit_cr()) && !slipdVo.getAccnt_cd().matches("11149015|21025100")){
				// 예외처리를 위한 객체 생성
				ExceptItemVo exceptVo = new ExceptItemVo();
				exceptVo.setKind_cd("XEK061");
				exceptVo.setAllow_yn("Y");
				if("113".equals(slipdVo.getExpns_cd())) {	// 경비일반결의
					exceptVo.setService_id("F201");
				} else {									// 카드경비결의
					exceptVo.setService_id("F202");
				}
				// 예외처리 메소드 호출
				List<String> values = exceptService.getExceptValues(exceptVo);
				// 패스 데이터 결과 값을 설정하여 반환. 
				exceptVo.setValues(String.join(",", values));
				
				if(exceptVo.getValues().indexOf(slipdVo.getAccnt_no()) > -1) {
					awaitCnt++;
				}
			
				// 2013.05.08 업무추진비는 예산부족인 경우 결의생성 안되게 요청
				// 2017.12.12 연구과제추진비 예산잔액 체크로직 추가
				// 2023.04.20  외부전문기술활용비 예산잔액 체크로직 추가
				if(StringUtil.isEmpty(slipdVo.getCtrl_no()) && ("FAE026".equals(slipdVo.getItm_clsf())
					|| ("GA2201".equals(slipdVo.getItm_solve_base()) && "51105130".equals(slipdVo.getAccnt_cd()))
					|| ("IG2101".equals(slipdVo.getItm_solve_base()) && "51120130".equals(slipdVo.getAccnt_cd()))
					|| ("SR2201".equals(slipdVo.getItm_solve_base()) && "51145130".equals(slipdVo.getAccnt_cd()))) ){
					
					bblVo.setAccnt_no(slipdVo.getAccnt_no());
					bblVo.setAccnt_cd(slipdVo.getAccnt_cd());
					bblVo.setRelat_no(slipdVo.getAccnt_rspns().substring(2, 8));
					BugtRamtVo ramtVo = comService.selectBugtRamtChk(bblVo, "");
					
					long ramtAmt = ramtVo.getBugt_amt() - ramtVo.getCause_amt() - ramtVo.getEnfrc_amt() - slipdVo.getDebit_amt();
					DecimalFormat decimalFormat = new DecimalFormat("#,###");
					String formatRamtAmt = decimalFormat.format(ramtAmt);	// 집행잔액
					String formatBugtAmt = decimalFormat.format(ramtVo.getBugt_amt());	// 예산금액
					
					if(ramtAmt < 0){
						String msgCode = "";
						// 2019.01.02 연구과제추진비 잔액부족 메세지 상세내용 추가
						if("FAE026".equals(slipdVo.getItm_clsf()) && "117".equals(unslipNoSub)){
							msgCode = "message.alert.fin.spm.0007"; // ({0})번째 행 회계코드[{1}](비목구분:연구과제추진비)는 예산부족으로 결재신청을 할 수 없습니다. \n※ 내부과제는 내부인건비1, 연구수당, 간접비가 제외된 잔액이 연구과제추진비로 집행가능하므로 예실대비표 상의 잔액과 실제 집행가능 잔액이 상이 할 수 있습니다. \n-예산금액 : [{2}]\n-집행잔액 : [{3}]\n*해당 계정으로만 예산 검증진행 (서브/메인 합계 미검증)
						} else if(slipdVo.getAccnt_cd().matches("51105130|51120130|51145130")) {
							// 2023.04.20  외부전문기술활용비 잔액부족 메세지 상세내용 추가
							msgCode = "message.alert.fin.spm.0010"; // ({0})번째 행 회계코드[{1}](비목구분:외부전문기술활용비)는 예산부족으로 결재신청을 할 수 없습니다. \n-예산금액 : [{2}]\n-집행잔액 : [{3}]\n*해당 계정으로만 예산 검증진행 (서브/메인 합계 미검증)
						} else {
							msgCode = "message.alert.fin.spm.0008"; // ({0})번째 행 회계코드[{1}](비목구분:연구과제추진비)는 예산부족으로 결재신청을 할 수 없습니다. \n-예산금액 : [{2}]\n-집행잔액 : [{3}]\n*해당 계정으로만 예산 검증진행 (서브/메인 합계 미검증)
						}
						
						throw new KitechException(Exceptions.ERROR, Business.FIN, msgCode, new String[]{String.valueOf(cnt), slipdVo.getAccnt_cd(), formatBugtAmt, formatRamtAmt});
						
					}
				}
				
				if(!"FF030001".equals(slipdVo.getAccnt_no())){
					accntNos.add(slipdVo.getAccnt_no());
				}
				
				if("143".equals(slipdVo.getExpns_cd())){
					expsnCdVal = "143";
					bookManager = "20140565";
				}else if(slipdVo.getDebit_amt() > 400000 && slipdVo.getExpns_cd().matches("373|374|410|461")){
					if("117".equals(unslipNoSub)){
						expsnCdVal = "Y";
					}
				}
				
				// 카드증빙 40만원 이상건 감사실장 결재라인추가 2019.02.21
				if("119".equals(unslipNoSub) && "FAH500".equals(slipdVo.getEvid_cd()) && slipdVo.getUnslip_amt_max() >= 400000){
					amtChkVal = "Y";
				}
			}
			
			cnt++;
		}
		
		// 예외테이블을 통해서 특정계정에 카드/경비 결의 차변에 1개라도 포함이 되어 있으면 Expns = ‘E’ 값으로 전문 송신
		// 특정계정은 매년 변경 예정 (2023년 : BG230026 / BH230001) 예외항목 : 교육비처리
		if(awaitCnt > 0) {
			expsnCdVal = "E";
		}
		
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());		
		aprVo.setReqNo(unslipNo);
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId(KitechContextUtil.getServiceId());
		aprVo.setManagerId(KitechContextUtil.getSyspayno());
		aprVo.setExt1Cd(String.join(",",  accntNos));
		aprVo.setInfoCd(vo.getRmk());
		aprVo.setResearcher(KitechContextUtil.getSyspayno());
		aprVo.setAmounts(String.valueOf(slipdList.get(0).getUnslip_amt_max()));
		aprVo.setRegion(vo.getFomat_unit());
		aprVo.setExpns(expsnCdVal);
		aprVo.setSlipGubun(vo.getSlip_typ_cd());
		aprVo.setBookManager(bookManager);
		aprVo.setRuleMoney(String.valueOf(slipdList.get(0).getUnslip_amt_max()));
		aprVo.setRuleType("ADR040");
		
		// 2012.02.22. 계정책임자 및 예산통제자 입력 안되도록 처리
		if(unslipNoSub.matches("130|132|168|172|175|272|273|174|216")){
			aprVo.setAccountCharger(""); // 계정책임자
			aprVo.setBudgetController(""); // 예산통제자
		}else{
			// 예산통제자 및 자동통제여부 조회
			AutoBugtVo autoVo = null;						
			if(accntNos.size() > 0){
				autoVo = new AutoBugtVo();				
				autoVo.setReq_no(unslipNo);
				autoVo = comService.getAccntAutoBugtPsn(autoVo);
			}
			// 20190515 직무훈련생 비용결의 예산통제자 입력 안되도록 처리
			if("171".equals(unslipNoSub)){
				aprVo.setAccountCharger((autoVo == null)?"": autoVo.getAccnt_rspns()); // 계정책임자
				aprVo.setBudgetController(""); // 예산통제자
			}else{
				if("119".equals(unslipNoSub)){		
					if(!"143".equals(expsnCdVal)){
						aprVo.setInspectYn(vo.getAset_reg()); // //소액물품검수 자산등재 여부
						if("Y".equals(vo.getAset_reg())){
							aprVo.setAssetRgManager(vo.getAset_manager());
						}
					}
					
					if("Y".equals(amtChkVal)){
						aprVo.setInspectEvid("C"); // // 감사실장 결재라인추가
					}
				}
				aprVo.setAccountCharger((autoVo == null)?"": autoVo.getAccnt_rspns()); // 계정책임자
				aprVo.setBudgetController((autoVo == null)?"": autoVo.getBugt_ctrl_psn()); // 예산통제자
				aprVo.setAutoControlYn((autoVo == null)?"": autoVo.getBugt_auto_yn()); // 예산자동통제유무
			}			
		}
		
		// 결재신청
		FinSlipAprVo slipAprVo = new FinSlipAprVo();
		// 결의서 헤더
		slipAprVo.setSlipHVo(vo);
		// 결의서 디테일
		slipAprVo.setSlipdList(slipdList);
		// 송금내역
		List<FspSendReqVo> sendList = expnsDao.selectFspSendReqApr(unslipNo);
		if(sendList != null && sendList.size() > 0){
			slipAprVo.setSendList(sendList);
		}
		// 첨부파일
		List<AttachVo> fileList = expnsDao.selectXomxComAttachFileApr(unslipNo);
		if(fileList != null && fileList.size() > 0){
			slipAprVo.setFileList(fileList);
		}
		// 이지바로 결의서 증빙
		List<FspItmEvidDetlsVo> evidList = expnsDao.selectFspItmEvidDetlsApr(unslipNo);
		if(evidList != null && evidList.size() > 0){
			slipAprVo.setEvidList(evidList);
		}
		
		// 전자증빙
		List<AttachVo> evidFileList = expnsDao.selectFspEvidAttachApr(unslipNo);
		if(evidFileList != null && evidFileList.size() > 0){
			slipAprVo.setEvidFileList(evidFileList);
		}
		
		AppLog.debug("\n ##################### approvalExpnsSlip >> aprVo : " + aprVo);
		apprFuncService.approvalRequest(aprVo, slipAprVo);
	}
	
	/**
    * 카드결의 생성을 위한 회의록 정보 조회
    * @param String unslipNo
    * @return FspSlipDVo
	* @since 2022.09.28.
    * @author LeeYH
    */
	public FspSlipDVo selectFspSlipMeetInfo(String reqNo) throws ElException{
		return expnsDao.selectFspSlipMeetInfo(reqNo);
	}
	
	/**
    * 일반결의, 경비결의 삭제
    * @param FspSlipDVo
	* @since 2022.11.30.
    * @author LeeYH
    */
	public void deleteExpnsSlip(FspSlipDVo vo) throws Exception{
		slipService.deleteSlip(vo);
	}
}
