package kr.re.kitech.biz.res.exc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.exc.service.ResDepstMntService;
import kr.re.kitech.biz.res.exc.vo.FcpDepstReqListVo;
import kr.re.kitech.biz.res.exc.vo.ResBgDepstMntVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRectlVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndReqVo;
import kr.re.kitech.biz.res.exc.vo.ResDepstDetlVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSlipCancelVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSrcVo;

/**  
 * @ClassSubJect 연구비입금 및 입금결의 
 * @Class Name : ResDepstReqController.java
 * @Description : 연구비입금 및 입금결의 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/04/19   이영희                최초생성
 * 
 * @author 이영희
 * @since 2023/04/19
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Controller
public class ResDepstReqController {
	@Resource(name="resDepstMntService")
	private ResDepstMntService reqService;
	
	@ElService(key = "SvcRESEXCDEPR01")
	@RequestMapping(value = "SvcRESEXCDEPR01")
	@ElDescription(sub = "연구비입금관리 목록 조회", desc = "연구비입금관리목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResBgDepstMntVo> selectResBgDepstMntList(ResExcSrcVo vo) throws Exception{
		return reqService.selectResBgDepstMntList(vo);
	}
	
	@ElService(key = "SvcRESEXCDEPR02")
	@RequestMapping(value = "SvcRESEXCDEPR02")
	@ElDescription(sub = "연구비입금관리 상세 조회", desc = "연구비입금관리 상세(과제 및 입금예정정보)를 조회한다.")
	@ElValidator(errUrl = "")
	public ResDepstDetlVo selectResDepstDetlInfo(ResExcSrcVo vo) throws Exception{
		return reqService.selectResDepstDetlInfo(vo);
	}
	
	@ElService(key = "SvcRESEXCDEPR03")
	@RequestMapping(value = "SvcRESEXCDEPR03")
	@ElDescription(sub = "연구비입금내역 조회", desc = "연구비입금관리화면에서 상세내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResBgRectlVo> selectResBgRectlList(ResExcSrcVo vo) throws Exception{
		return reqService.selectResBgRectlList(vo);
	}
	
	@ElService(key = "SvcRESEXCDEPM01")
	@RequestMapping(value = "SvcRESEXCDEPM01")
	@ElDescription(sub = "연구비입금관리 상세 저장", desc = "연구비입금관리 상세(입금예정내역 및 상세내역)를 저장한다.")
	@ElValidator(errUrl = "")
	public void saveResBgRecvDetail(ResDepstDetlVo vo) throws Exception{
		reqService.saveResBgRecvDetail(vo);
	}
	
	@ElService(key = "SvcRESEXCDMDR01")
	@RequestMapping(value = "SvcRESEXCDMDR01")
	@ElDescription(sub = "연구비청구의뢰 조회", desc = "연구비청구의뢰 및 계정정보를 조회한다.")
	@ElValidator(errUrl = "")
	public ResDepstDetlVo selectResDemndReq(ResExcSrcVo vo) throws Exception{
		return reqService.selectResDemndReq(vo);
	}
	
	@ElService(key = "SvcRESEXCDMDM01")
	@RequestMapping(value = "SvcRESEXCDMDM01")
	@ElDescription(sub = "연구비청구의뢰 저장", desc = "연구비청구의뢰를 저장한다.")
	@ElValidator(errUrl = "")
	public ResExcSrcVo saveResDemndReq(ResDemndReqVo vo) throws Exception{
		ResExcSrcVo retVo = new ResExcSrcVo();
		retVo.setReq_no(reqService.saveResDemndReq(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcRESEXCDMDM02")
	@RequestMapping(value = "SvcRESEXCDMDM02")
	@ElDescription(sub = "연구비청구의뢰 삭제", desc = "연구비청구의뢰를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteResDemndReq(ResDemndReqVo vo) throws Exception{
		reqService.deleteResDemndReq(vo);
	}
	
	@ElService(key = "SvcRESEXCDEPR04")
	@RequestMapping(value = "SvcRESEXCDEPR04")
	@ElDescription(sub = "연구비반제신청 조회", desc = "연구비반제신청(과제정보,청구의뢰정보, 입금의뢰신청정보)을 조회한다.")
	@ElValidator(errUrl = "")
	public ResDepstDetlVo selectResRepayReq(ResExcSrcVo vo) throws Exception{
		return reqService.selectResRepayReq(vo);
	}	
	
	@ElService(key = "SvcRESEXCDEPM02")
	@RequestMapping(value = "SvcRESEXCDEPM02")
	@ElDescription(sub = "연구비 반제신청 저장", desc = "연구비 반제신청을 저장한다.(다건 저장가능)")
	@ElValidator(errUrl = "")
	public ResExcSrcVo saveRepayReqMnt(ResDepstDetlVo vo) throws Exception{
		ResExcSrcVo retVo = new ResExcSrcVo();
		retVo.setDepst_req_no(reqService.saveRepayReqMnt(vo));
		return retVo;
	}
	
	@ElService(key = "SvcRESEXCDEPM03")
	@RequestMapping(value = "SvcRESEXCDEPM03")
	@ElDescription(sub = "연구비 입금 결재신청", desc = "연구비입금 결재신청 및 결의생성을 처리한다.")
	@ElValidator(errUrl = "")
	public ResExcSrcVo saveResRepayApr(ResDepstDetlVo vo) throws Exception{
		ResExcSrcVo retVo = new ResExcSrcVo();
		retVo.setReq_no(reqService.approvalResDepstReq(vo));
		return retVo;
	}
	
	@ElService(key = "SvcRESEXCDEPD01")
	@RequestMapping(value = "SvcRESEXCDEPD01")
	@ElDescription(sub = "연구비반제신청 삭제", desc = "결의서,잔액정산,신청서,증빙,결재정보 등을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteRepayReqMnt(ResDepstDetlVo vo) throws Exception{
		reqService.deleteRepayReqMnt(vo);
	}
	
	@ElService(key = "SvcRESEXCDEPM04")
	@RequestMapping(value = "SvcRESEXCDEPM04")
	@ElDescription(sub = "연구비 입금의뢰 저장", desc = "연구비 입금의뢰신청을 저장한다.(잔액생성 수정)")
	@ElValidator(errUrl = "")
	public ResExcSrcVo saveResDepstReq(FcpDepstReqListVo vo) throws Exception{
		ResExcSrcVo retVo = new ResExcSrcVo();
		retVo.setReq_no(reqService.saveResDepstReq(vo.getDepstList()));
		return retVo;
	}
	
	@ElService(key = "SvcRESEXCDEPD02")
	@RequestMapping(value = "SvcRESEXCDEPD02")
	@ElDescription(sub = "연구비 예금입금의뢰 삭제", desc = "연구비 예금입금의뢰를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteResDepstReq(FcpDepstReqListVo vo) throws Exception{
		reqService.deleteResDepstReq(vo.getDepstList());
	}
	
	@ElService(key = "SvcRESEXCDEPD03")
	@RequestMapping(value = "SvcRESEXCDEPD03")
	@ElDescription(sub = "연구비청구,입금결의 결의취소", desc = "계산서 수정발행이 필요한 경우 의뢰서 삭제없이 결의서만 삭제하기위하여 작성")
	@ElValidator(errUrl = "")
	public void deleteResExcSlipMnt(ResExcSlipCancelVo vo) throws Exception{
		reqService.deleteResExcSlipMnt(vo);
	}

}
