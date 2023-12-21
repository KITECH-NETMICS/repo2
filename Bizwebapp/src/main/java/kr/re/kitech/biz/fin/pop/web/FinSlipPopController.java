package kr.re.kitech.biz.fin.pop.web;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.fin.com.vo.FcpPrmsntVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.pop.service.FinSlipPopService;
import kr.re.kitech.biz.fin.pop.vo.AccntCdListVo;
import kr.re.kitech.biz.fin.pop.vo.CtrlSlipListVo;
import kr.re.kitech.biz.fin.pop.vo.FinPopSearchVo;
import kr.re.kitech.biz.fin.pop.vo.FspMeetMntPopVo;
import kr.re.kitech.biz.fin.pop.vo.FspSlipDListVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuMstrDetlVo;
import kr.re.kitech.biz.fin.pop.vo.ResEquipFeeReqListVo;
import kr.re.kitech.biz.fin.pop.vo.XodfVendListVo;
import kr.re.kitech.biz.fin.spm.vo.FspRamtCreatListVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.std.vo.FbaCardListVo;
import kr.re.kitech.biz.fin.std.vo.XodfExpnsListVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;

/**  
 * @ClassSubJect 결의생성 팝업 Controller
 * @Class Name : FinSlipPopController.java
 * @Description : 결의생성관련 팝업 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/25   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/04/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinSlipPopController {
	@Resource(name="finSlipPopService")
	private FinSlipPopService popService;
	
	/**
     * On-Line 가수반제 회계코드 조회
     * @param FinSlipSearchVo
     * @return FspRamtCreatListVo
     * @throws Exception
     */
	@ElService(key = "SvcFINSPMPOPR01")
	@RequestMapping(value = "SvcFINSPMPOPR01")
	@ElDescription(sub = "On-Line가수반제 회계코드 조회", desc = "On-Line가수반제 회계코드를 조회한다.")
	@ElValidator(errUrl = "")
	public FspRamtCreatListVo selectFspRamtCreatList(FinPopSearchVo vo) throws Exception{
		FspRamtCreatListVo retVo = new FspRamtCreatListVo();
		retVo.setRamtList(popService.selectFspRamtCreatList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPR02")
	@RequestMapping(value = "SvcFINSPMPOPR02")
	@ElDescription(sub = "카드정보조회(팝업)", desc = "팝업에서 카드정보를 조회한다.")
	@ElValidator(errUrl = "")
	public FbaCardListVo selectFbaCardPopList(FinPopSearchVo vo) throws Exception{
		FbaCardListVo retVo = new FbaCardListVo();
		retVo.setCardList(popService.selectFbaCardPopList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPR03")
	@RequestMapping(value = "SvcFINSPMPOPR03")
	@ElDescription(sub = "연구장비집행요청확인 조회", desc = "연구장비집행요청확인을 조회한다.(팝업)")
	@ElValidator(errUrl = "")
	public ResEquipFeeReqListVo selectAssReqEquipFeeReqList(ResEquipFeeReqVo vo) throws Exception{
		ResEquipFeeReqListVo retVo = new ResEquipFeeReqListVo();
		retVo.setReqList(popService.selectAssReqEquipFeeReqList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPM01")
	@RequestMapping(value = "SvcFINSPMPOPM01")
	@ElDescription(sub = "연구시설장비비 집행요청 확인 저장", desc = "결의생성시 연구시설장비비 집행요청 확인을 저장한다.")
	@ElValidator(errUrl = "")
	public ResEquipFeeReqVo saveAssResEquipFeeReq(ResEquipFeeReqVo vo) throws Exception{
		return popService.saveAssResEquipFeeReq(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPR04")
	@RequestMapping(value = "SvcFINSPMPOPR04")
	@ElDescription(sub = "거래증빙팝업 조회", desc = "거래증빙팝업화면에서 계산서내역을 조회한다.")
	@ElValidator(errUrl = "")
	public KtxIssuMstrVo selectKtxIssuMstrPop(KtxIssuMstrComVo vo) throws Exception{
		return popService.selectKtxIssuMstrPop(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPC01")
	@RequestMapping(value = "SvcFINSPMPOPC01")
	@ElDescription(sub = "전자세금계산서등록팝업-계산서정보 저장", desc = "전자세금계산서등록팝업에서 계산서마스터정보와 품목내역을 저장한다.")
	@ElValidator(errUrl = "")
	public KtxIssuMstrComVo saveKtxIssuMstr(KtxIssuMstrVo vo) throws Exception{
		return popService.saveKtxIssuMstr(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPD01")
	@RequestMapping(value = "SvcFINSPMPOPD01")
	@ElDescription(sub = "거래증빙삭제", desc = "거래증빙을 삭제하고 이력을 저장한다.(팝업화면)")
	@ElValidator(errUrl = "")
	public void deleteKtxIssuMstr(KtxIssuMstrComVo vo) throws Exception{
		popService.deleteKtxIssuMstr(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPR05")
	@RequestMapping(value = "SvcFINSPMPOPR05")
	@ElDescription(sub = "비용코드 검색", desc = "비용코드를 전체 검색할 수 있다.")
	@ElValidator(errUrl = "")
	public XodfExpnsListVo selectXodfExpnsList(FinPopSearchVo vo) throws Exception{
		XodfExpnsListVo retVo = new XodfExpnsListVo();
		retVo.setExpnsList(popService.selectXodfExpnsList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPR06")
	@RequestMapping(value = "SvcFINSPMPOPR06")
	@ElDescription(sub = "결의내역대체처리 검색팝업", desc = "일반결의 결의내역대체처리검색 팝업에서 결의내역을 조회한다.")
	@ElValidator(errUrl = "")
	public FspSlipDListVo selectTransSlipInfoList(FinPopSearchVo vo) throws Exception{
		FspSlipDListVo retVo = new FspSlipDListVo();
		retVo.setSlipList(popService.selectTransSlipInfoList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPR07")
	@RequestMapping(value = "SvcFINSPMPOPR07")
	@ElDescription(sub = "일반결의 통제내역 결의처리 팝업 조회", desc = "일반결의 통제내역 결의처리 팝업에서 계정번호, 회계코드, 비용코드, 결의금액등을 조회한다.")
	@ElValidator(errUrl = "")
	public CtrlSlipListVo selectBblEnfrcForSlip(FinPopSearchVo vo) throws Exception{
		CtrlSlipListVo retVo = new CtrlSlipListVo();
		retVo.setCtrlList(popService.selectBblEnfrcForSlip(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPR08")
	@RequestMapping(value = "SvcFINSPMPOPR08")
	@ElDescription(sub = "채무반제처리 회계코드 조회", desc = "일반결의 채무반제처리, On-Line가수반제처리에서 회계코드를 조회한다.")
	@ElValidator(errUrl = "")
	public AccntCdListVo selectXodfAccntCdForDebt(FinCodeNmVo vo) throws Exception{
		AccntCdListVo retVo = new AccntCdListVo();
		retVo.setAccntList(popService.selectXodfAccntCdForDebt(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPR09")
	@RequestMapping(value = "SvcFINSPMPOPR09")
	@ElDescription(sub = "전자세금계산서 팝업 조회", desc = "전자세금계산서 팝업에서 마스터 및 품목내역을 조회한다.")
	@ElValidator(errUrl = "")
	public KtxIssuMstrDetlVo selectKtxIssuMstr(KtxIssuMstrComVo vo) throws Exception{
		return popService.selectKtxIssuMstr(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPF01")
	@RequestMapping(value = "SvcFINSPMPOPF01")
	@ElDescription(sub = "전자세금계산서 업로드", desc = "전자세금계산서 파일을 파싱하여 저장하고, 그 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public void upLoadXmlFile(HttpServletRequest req, HttpServletResponse res) throws Exception{		
		MultipartHttpServletRequest multiPartRequest = (MultipartHttpServletRequest) req;		    
		Iterator<String> iter = multiPartRequest.getFileNames();
		if(!iter.hasNext()) {
			throw new RuntimeException("파일 업로드 오류!!");
		}
		
		MultipartFile mfile = (MultipartFile) multiPartRequest.getFile(iter.next());
		String content = new String(mfile.getBytes(), StandardCharsets.UTF_8);
		
		// 미사용 노드 제거, ds:Signature 검증이 필요하다면 여기에서 하고 ds:Signature 자체를 remove 하는게 좋음
		JSONObject json = XML.toJSONObject(content, true);
		json.getJSONObject("TaxInvoice").remove("ds:Signature");
		json.getJSONObject("TaxInvoice").remove("xmlns");
		json.getJSONObject("TaxInvoice").remove("xsi:schemaLocation");
		json.getJSONObject("TaxInvoice").remove("xmlns:xsi");
		AppLog.debug(json.toString(4));
		
		// Double Quotes
		content = new ObjectMapper().writeValueAsString( json.toString());
	
		StringBuilder builder = new StringBuilder();
		builder.append("<script>window.onload = doInit;function doInit() {");
		builder.append("parent.").append(req.getParameter("callbackFunc"));
		builder.append("(").append(content).append(");}</script>");
		
		HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper(res);
		wrapper.setContentType("text/html;charset=UTF-8");
		wrapper.setHeader("Content-length", "" + builder.toString().getBytes().length);
		
		res.getWriter().print(builder.toString());
	}
	
	@ElService(key = "SvcFINSPMPOPR10")
	@RequestMapping(value = "SvcFINSPMPOPR10")
	@ElDescription(sub = "전자세금계산서 거래처정보 조회", desc = "전자세금계산서 등록 팝업에서 거래처정보를 조회한다.")
	@ElValidator(errUrl = "")
	public XodfVendListVo selectXodfVendList(XodfVendVo vo) throws Exception{
		XodfVendListVo retVo = new XodfVendListVo();
		retVo.setVendList(popService.selectXodfVendList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINSPMPOPC02")
	@RequestMapping(value = "SvcFINSPMPOPC02")
	@ElDescription(sub = "전자세금계산서등록팝업-계산서정보 저장", desc = "전자세금계산서등록팝업에서 계산서마스터정보와 품목내역을 저장한다.")
	@ElValidator(errUrl = "")
	public void saveKtxIssuMstrAndDetl(KtxIssuMstrDetlVo vo) throws Exception{
		popService.saveKtxIssuMstr(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPR11")
	@RequestMapping(value = "SvcFINSPMPOPR11")
	@ElDescription(sub = "어음번호 검색(팝업)", desc = "어음번호 검색(팝업)")
	@ElValidator(errUrl = "")
	public List<FcpPrmsntVo> selectFcpPrmsntList(FcpPrmsntVo vo) throws Exception{
		return popService.selectFcpPrmsntList(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPR12")
	@RequestMapping(value = "SvcFINSPMPOPR12")
	@ElDescription(sub = "회의록조회(팝업 F244)", desc = "회의록조회팝업(F244)에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FspMeetMntPopVo> selectFspMeetPopList(FinPopSearchVo vo) throws Exception{
		return popService.selectFspMeetPopList(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPR13")
	@RequestMapping(value = "SvcFINSPMPOPR13")
	@ElDescription(sub = "이지바로과제일 경우 과학기술인번호가 없는 회의참석자 조회", desc = "이지바로과제일 경우 과학기술인번호가 없는 회의참석자를 조회한다.(팝업 F244)")
	@ElValidator(errUrl = "")
	public Map<String, String> selectNoSciTechNoPsn(FinPopSearchVo vo) throws Exception{
		Map<String, String> map = new HashMap<>();
		map.put("no_sci_tech_psn", popService.selectNoSciTechNoPsn(vo.getReq_no()));
		return map;
	}
	
	@ElService(key = "SvcFINSPMPOPU01")
	@RequestMapping(value = "SvcFINSPMPOPU01")
	@ElDescription(sub = "매입계산서(관) 팝업호출 - 결의번호 업데이트", desc = "")
	@ElValidator(errUrl = "")
	public void updateKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo) throws Exception{
		popService.updateKtxIssuMstrUnslipNo(vo);
	}
	
	@ElService(key = "SvcFINSPMPOPD02")
	@RequestMapping(value = "SvcFINSPMPOPD02")
	@ElDescription(sub = "매입계산서(관) 팝업호출 - 결의번호 삭제", desc = "")
	@ElValidator(errUrl = "")
	public void deleteKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo) throws Exception{
		popService.deleteKtxIssuMstrUnslipNo(vo);
	}
}
