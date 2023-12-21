package kr.re.kitech.biz.fin.spm.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.com.vo.ComReqVo;
import kr.re.kitech.biz.fin.com.vo.FinSaveSlipVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo;
import kr.re.kitech.biz.fin.spm.service.FinExpnsSlipMntService;
import kr.re.kitech.biz.fin.spm.vo.CardSlipInfoListVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsSlipMngmtVo;
import kr.re.kitech.biz.fin.spm.vo.ExpnsSlipVo;
import kr.re.kitech.biz.fin.spm.vo.FbaAccntMngmtListVo;
import kr.re.kitech.biz.fin.spm.vo.FinExpnsSlipNumVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipSearchVo;
import kr.re.kitech.biz.fin.spm.vo.FinSpmSlipListVo;
import kr.re.kitech.biz.fin.spm.vo.FspItmEvidDetlsListVo;
import kr.re.kitech.biz.fin.spm.vo.FspSlipMngmtListVo;
import kr.re.kitech.biz.fin.spm.vo.GenrlSlipVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrListVo;
import kr.re.kitech.biz.fin.spm.vo.PreAprCheckListVo;
import kr.re.kitech.biz.fin.std.vo.XodfAccntVo;

/**  
 * @ClassSubJect 경비결의(카드) Controller
 * @Class Name : FinExpnsSlipController.java
 * @Description : 경비결의(카드)를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/12   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/04/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinExpnsSlipController {
	@Resource(name="finExpnsSlipService")
	private FinExpnsSlipMntService expnsService;
	
	/**
     * 경비결의목록조회
     * @param FinSlipSearchVo
     * @return FinSpmSlipListVo
     * @throws Exception
     */
	@ElService(key = "SvcFINSPMEXPR01")
	@RequestMapping(value = "SvcFINSPMEXPR01")
	@ElDescription(sub = "경비결의목록조회", desc = "")
	@ElValidator(errUrl = "")
	public FinSpmSlipListVo selectFinSlipList(FinSlipSearchVo vo) throws Exception{
		FinSpmSlipListVo rteVo = new FinSpmSlipListVo();
		rteVo.setFinSlipVoList(expnsService.selectFinSlipList(vo));
		return rteVo;
	}
	
	@ElService(key = "SvcFINSPMEXPR02")
	@RequestMapping(value = "SvcFINSPMEXPR02")
	@ElDescription(sub = "카드결의대상 카드정보 조회", desc = "카드결의대상 카드정보목록을 조회한다.")
	@ElValidator(errUrl = "")
	public CardSlipInfoListVo selectFinExpnsSlipCardList(FinSlipSearchVo vo) throws Exception{
		CardSlipInfoListVo retVo = new CardSlipInfoListVo();
		retVo.setCardInfoList(expnsService.selectFinExpnsSlipCardList(vo));
		return retVo;
	}
	
@ElService(key = "SvcFINSPMEXPR03")
	@RequestMapping(value = "SvcFINSPMEXPR03")
	@ElDescription(sub = "카드결의 헤더,디테일, 비용합계 조회", desc = "카드결의 헤더,디테일리스트, 비용합계를 조회한다")
	@ElValidator(errUrl = "")
	public ExpnsSlipVo selectExpnsCardSlip(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectExpnsCardSlip(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR09")
	@RequestMapping(value = "SvcFINSPMEXPR09")
	@ElDescription(sub = "경비결의(일반) 조회", desc = "경비결의(일반) 결의서 헤더, 디테일, 비용합계를 조회한다.")
	@ElValidator(errUrl = "")
	public ExpnsSlipVo selectExpnsSlip(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectExpnsBillSlip(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR04")
	@RequestMapping(value = "SvcFINSPMEXPR04")
	@ElDescription(sub = "회계코드별 관리항목 조회", desc = "회계코드별 관리항목을 조회한다.")
	@ElValidator(errUrl = "")
	public FbaAccntMngmtListVo selectSlipMngmtList(FinSlipSearchVo vo) throws Exception{
		FbaAccntMngmtListVo retVo = new FbaAccntMngmtListVo();
		retVo.setMngmtVo(expnsService.selectSlipMngmtList(vo));
		return retVo;
	}	
	
	@ElService(key = "SvcFINSPMEXPR05")
	@RequestMapping(value = "SvcFINSPMEXPR05")
	@ElDescription(sub = "카드결의 관리항목 및 카드정보조회", desc = "카드결의 관리항목 및 카드정보를 조회한다.")
	@ElValidator(errUrl = "")
	public ExpnsSlipMngmtVo selectSlipMngmtAndCard(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectSlipMngmtAndCard(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR06")
	@RequestMapping(value = "SvcFINSPMEXPR06")
	@ElDescription(sub = "이지바로과제 증빙 조회 및 저장", desc = "이지바로과제 증빙 조회 및 데이터가 없을 경우 저장한다.")
	@ElValidator(errUrl = "")
	public FinExpnsSlipNumVo selectFspItmEvidDetlsCnt(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectFspItmEvidDetlsCnt(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR07")
	@RequestMapping(value = "SvcFINSPMEXPR07")
	@ElDescription(sub = "경비결의(일반)관리항목, 송금내역, 계산서정보 조회", desc = "경비결의(일반)관리항목, 송금내역, 계산서정보를 조회한다")
	@ElValidator(errUrl = "")
	public ExpnsSlipMngmtVo selectSlipMngmtAndBill(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectSlipMngmtAndBill(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR08")
	@RequestMapping(value = "SvcFINSPMEXPR08")
	@ElDescription(sub = "경비결의 계산서내역조회", desc = "경비결의 계산서내역을 조회한다.")
	@ElValidator(errUrl = "")
	public KtxIssuMstrListVo selectKtxIssuMstrList(FinSlipSearchVo vo) throws Exception{
		KtxIssuMstrListVo retVo = new KtxIssuMstrListVo();
		retVo.setBillList(expnsService.selectKtxIssuMstrList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMEXPR10")
	@RequestMapping(value = "SvcFINSPMEXPR10")
	@ElDescription(sub = "일반결의 헤더, 디테일 차변, 대변 리스트 조회", desc = "일반결의 헤더, 디테일 차변, 대변 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public GenrlSlipVo selectGenrlSlip(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectGenrlSlip(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPD01")
	@RequestMapping(value = "SvcFINSPMEXPD01")
	@ElDescription(sub = "일반, 경비결의 삭제", desc = "일반결의, 경비결의를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteExpnsSlip(FspSlipDVo vo) throws Exception{
		expnsService.deleteExpnsSlip(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPM01")
	@RequestMapping(value = "SvcFINSPMEXPM01")
	@ElDescription(sub = "경비결의,일반결의 저장", desc = "경비결의(117,113), 일반결의를 생성,수정,삭제한다.")
	@ElValidator(errUrl = "")
	public FinSlipSearchVo saveFinExpnsSlip(FinSaveSlipVo vo) throws Exception{
		return expnsService.saveFinExpnsSlip(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR11")
	@RequestMapping(value = "SvcFINSPMEXPR11")
	@ElDescription(sub = "관리항목 조회", desc = "일반결의 결의내역대체처리에서 관리항목을 조회한다.")
	@ElValidator(errUrl = "")
	public FspSlipMngmtListVo selectSlipMngmt(FinSlipSearchVo vo) throws Exception{
		FspSlipMngmtListVo retVo = new FspSlipMngmtListVo();
		retVo.setMngmtList(expnsService.selectSlipMngmt(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMEXPR12")
	@RequestMapping(value = "SvcFINSPMEXPR12")
	@ElDescription(sub = "일반결의 수입처리 회계코드 조회", desc = "일반결의 분개유형이 수입처리일 경우 회계코드를 조회한다.")
	@ElValidator(errUrl = "")
	public XodfAccntVo selectAccntCdByFinBsnsClsf(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectAccntCdByFinBsnsClsf(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR13")
	@RequestMapping(value = "SvcFINSPMEXPR13")
	@ElDescription(sub = "일반결의 관리항목,송금내역,계산서정보, 카드정보 조회", desc = "일반결의에서 관리항목,송금내역,계산서정보, 카드정보를 조회한다.")
	@ElValidator(errUrl = "")
	public ExpnsSlipMngmtVo selectSlipMngmtAndEtc(FinSlipSearchVo vo) throws Exception{
		return expnsService.selectSlipMngmtAndEtc(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR14")
	@RequestMapping(value = "SvcFINSPMEXPR14")
	@ElDescription(sub = "이지바로 과제 회의록증빙 조회", desc = "일반결의, 경비결의에서 이지바로 과제 회의록증빙을 조회한다.")
	@ElValidator(errUrl = "")
	public FspItmEvidDetlsListVo selectFspItmEvidDetlsList(FinSlipSearchVo vo) throws Exception{
		FspItmEvidDetlsListVo retVo = new FspItmEvidDetlsListVo();
		retVo.setEvidList(expnsService.selectFspItmEvidDetlsList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMEXPC01")
	@RequestMapping(value = "SvcFINSPMEXPC01")
	@ElDescription(sub = "이지바로 과제 증빙 저장", desc = "이지바로 과제일 경우 회의록,학회/세미나,특근정보,전문가활용정보등을 증빙으로 저장한다.")
	@ElValidator(errUrl = "")
	public void insertFspItmEvidDetls(FspItmEvidDetlsListVo vo) throws Exception{
		expnsService.insertFspItmEvidDetls(vo.getEvidList());
	}
	
	@ElService(key = "SvcFINSPMEXPD02")
	@RequestMapping(value = "SvcFINSPMEXPD02")
	@ElDescription(sub = "신한(통합이지바로)과제 증빙 삭제", desc = "신한(통합이지바로)과제에 대한 증빙(회의록,학회/세미나,특근,전문가)을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteFspItmEvidDetls(FspItmEvidDetlsVo vo) throws Exception{
		expnsService.deleteFspItmEvidDetls(vo);
	}
	
	@ElService(key = "SvcFINSPMEXPR15")
	@RequestMapping(value = "SvcFINSPMEXPR15")
	@ElDescription(sub = "결의서 결재시 체크조회", desc = "결의서 결재신청 전 증빙,총액등을 체크한다.")
	@ElValidator(errUrl = "")
	public PreAprCheckListVo selectPreApprvCheck(FinSlipSearchVo vo) throws Exception{
		PreAprCheckListVo retVo = new PreAprCheckListVo();
		retVo.setCheckList(expnsService.selectPreApprvCheck(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMEXPR16")
	@RequestMapping(value = "SvcFINSPMEXPR16")
	@ElDescription(sub = "카드결의생성을 위한 회의록 정보 조회", desc = "카드결의생성을 위하여 회의록 정보를 조회한다.")
	@ElValidator(errUrl = "")
	public FspSlipDVo selectFspSlipMeetInfo(ComReqVo vo) throws Exception{
		return expnsService.selectFspSlipMeetInfo(vo.getReq_no());
	}
}
