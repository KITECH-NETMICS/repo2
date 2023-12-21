package kr.re.kitech.biz.sup.tec.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.res.exc.vo.FcpDepstReqListVo;
import kr.re.kitech.biz.sup.tec.service.SupTecDepstReqService;
import kr.re.kitech.biz.sup.tec.vo.SptFtxBillHVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecBillInitInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecChkVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecDepstVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptBillVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptDemndVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecRepayReqInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;

/**  
 * @ClassSubJect 기술지원입금의뢰
 * @Class Name SupTecDepstReqController.java
 * @Description 기술지원입금의뢰 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/23   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/23
 * @version 1
 * @see
 * 
 */
@Controller
public class SupTecDepstReqController {
	@Resource(name="supTecDepstReqService")
	private SupTecDepstReqService reqService;
	
	@ElService(key = "SvcSUPTECDEPR01")
	@RequestMapping(value = "SvcSUPTECDEPR01")
	@ElDescription(sub = "외부기술지원 입금의뢰(계산서발행) 목록 조회", desc = "외부기술지원 입금의뢰(계산서발행) 목록화면에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptTecDepstVo> selectSptTechRcptDepstList(SptTecSrcVo vo) throws Exception{
		return reqService.selectSptTechRcptDepstList(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPR02")
	@RequestMapping(value = "SvcSUPTECDEPR02")
	@ElDescription(sub = "외부기술지원 계산서 신규발행시 디테일 및 공급받는자 정보 조회", desc = "외부기술지원 계산서 신규발행시 디테일 및 공급받는자 정보를 조회한다.")
	@ElValidator(errUrl = "")
	public SptTecBillInitInfoVo selectSptTechBillInitInfo(SptTecSrcVo vo) throws Exception{
		return reqService.selectSptTechBillInitInfo(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPU01")
	@RequestMapping(value = "SvcSUPTECDEPU01")
	@ElDescription(sub = "기술지원접수 처리상태 업데이트", desc = "매출계산서 발행팝업에서 일반사용자 청구발행요청을 저장한다.")
	@ElValidator(errUrl = "")
	public void updateSptTecRcptInfoPrcsState(SptTecRcptInfoVo vo) throws Exception{
		reqService.updateSptTecRcptInfoPrcsState(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPM01")
	@RequestMapping(value = "SvcSUPTECDEPM01")
	@ElDescription(sub = "외부기술지원 입금의뢰 저장", desc = "외부기술지원 입금의뢰를 저장하고 기술지원접수에 의뢰번호를 업데이트한다.")
	@ElValidator(errUrl = "")
	public SptTecSrcVo saveSptTecDepstReq(FcpDepstReqListVo vo) throws Exception{
		SptTecSrcVo retVo = new SptTecSrcVo();
		retVo.setDepst_mngmt_no(reqService.saveSptTecDepstReq(vo.getDepstList()));		
		return retVo;
	}
	
	@ElService(key = "SvcSUPTECDEPD01")
	@RequestMapping(value = "SvcSUPTECDEPD01")
	@ElDescription(sub = "외부기술지원 입금의뢰 삭제", desc = "외부기술지원 입금의뢰를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteSptTecDepstReq(FcpDepstReqListVo vo) throws Exception{
		reqService.deleteSptTecDepstReq(vo.getDepstList());
	}
	
	@ElService(key = "SvcSUPTECDEPR03")
	@RequestMapping(value = "SvcSUPTECDEPR03")
	@ElDescription(sub = "청구계산서 발행관리 목록 조회", desc = "청구계산서 발행관리화면에서 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptTecRcptDemndVo> selectSptTecRcptDemndList(SptTecSrcVo vo) throws Exception{
		return reqService.selectSptTecRcptDemndList(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPR04")
	@RequestMapping(value = "SvcSUPTECDEPR04")
	@ElDescription(sub = "청구계산서 발행일자 기준 1개월 이내에 미수수탁정산 미결의 건수 조회 ", desc = "청구계산서 발행일자 기준 1개월 이내에 미수수탁정산 미결의 건수 조회 ")
	@ElValidator(errUrl = "")
	public SptTecChkVo selectSptTecRcptUnRepayCnt(SptTecSrcVo vo) throws Exception{
		SptTecChkVo retVo = new SptTecChkVo();
		retVo.setCnt(reqService.selectSptTecRcptUnRepayCnt(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcSUPTECDEPR05")
	@RequestMapping(value = "SvcSUPTECDEPR05")
	@ElDescription(sub = "미수수탁정산 입금내역 조회", desc = "미수수탁정산결의 입금신청 팝업에서 입금내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FcpDepstReqVo> selectFcpDepstReqSptRepay(SptTecSlipSrcVo vo) throws Exception{
		return reqService.selectFcpDepstReqSptRepay(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPR06")
	@RequestMapping(value = "SvcSUPTECDEPR06")
	@ElDescription(sub = "미수수탁정산결의 반제신청 청구내역조회", desc = "미수수탁정산결의 반제신청팝업에서 청구내역을 조회한다.")
	@ElValidator(errUrl = "")
	public SptFtxBillHVo selectFtxBillHForAdjstSlip(SptFtxBillHVo vo) throws Exception{
		return reqService.selectFtxBillHForAdjstSlip(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPM02")
	@RequestMapping(value = "SvcSUPTECDEPM02")
	@ElDescription(sub = "미수수탁정산 반제신청 저장", desc = "미수수탁정산 입금신청팝업에서 신청내역을 저장한다.")
	@ElValidator(errUrl = "")
	public SptTecSlipSrcVo saveSptTecRepayReq(SptTecRepayReqInfoVo infoVo) throws Exception{
		SptTecSlipSrcVo retVo = new SptTecSlipSrcVo();
		retVo.setReq_no(reqService.saveSptTecRepayReq(infoVo));
		
		return retVo;
	}
	
	@ElService(key = "SvcSUPTECDEPR07")
	@RequestMapping(value = "SvcSUPTECDEPR07")
	@ElDescription(sub = "기술지원 입금의뢰를 위한 기본정보 조회", desc = "기술지원 입금의뢰를 위한 기본정보를 조회한다.(param:계산서번호)")
	@ElValidator(errUrl = "")
	public SptFtxBillHVo selectFtxBillHForDepst(SptTecRcptBillVo vo) throws Exception{
		return reqService.selectFtxBillHForDepst(vo);
	}
	
	@ElService(key = "SvcSUPTECDEPD02")
	@RequestMapping(value = "SvcSUPTECDEPD02")
	@ElDescription(sub = "외부기술지원 미수수탁반제신청 삭제", desc = "외부기술지원 미수수탁반제신청을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteSptTecRepayReq(SptTecRepayReqInfoVo vo) throws Exception{
		reqService.deleteSptTecRepayReq(vo);
	}
}
