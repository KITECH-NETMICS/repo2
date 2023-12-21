package kr.re.kitech.biz.sup.tec.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.tec.service.SptTecSlipMntService;
import kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipInfoVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo;

/**  
 * @ClassSubJect 기술지원결의생성
 * @Class Name SptTecSlipMntController.java
 * @Description 기술지원결의생성 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/02   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/02
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTecSlipMntController {
	@Resource(name="sptTecSlipMntService")
	private SptTecSlipMntService service;
	
	@ElService(key = "SvcSUPTECSLPR01")
	@RequestMapping(value = "SvcSUPTECSLPR01")
	@ElDescription(sub = "기술지원결의생성 조회", desc = "기술지원 결의생성(기술지원, 성적서발행, 케이-바우처)을 처리한다.")
	@ElValidator(errUrl = "")
	public List<SptTecSlipMntVo> selectSptTecSlipMnt(SptTecSlipSrcVo vo) throws Exception{
		return service.selectSptTecSlipMnt(vo);
	}
	
	@ElService(key = "SvcSUPTECSLPM01")
	@RequestMapping(value = "SvcSUPTECSLPM01")
	@ElDescription(sub = "기술지원 영수결의생성", desc = "기술지원 결의(기술지원,성적서,바우처) 생성(영수)")
	@ElValidator(errUrl = "")
	public SptTecSlipSrcVo saveSptTecRcptSlip(SptTecSlipInfoVo vo) throws Exception{
		SptTecSlipSrcVo retVo = new SptTecSlipSrcVo();
		if("215".equals(vo.getSlipHVo().getSlip_typ_cd())){
			retVo.setUnslip_no(service.saveTecRcptDepstSlip(vo));
		}else{
			retVo.setUnslip_no(service.saveTecRcptDemndSlip(vo));
		}
		
		return retVo;
	}	
	
	@ElService(key = "SvcSUPTECSLPM02")
	@RequestMapping(value = "SvcSUPTECSLPM02")
	@ElDescription(sub = "기술지원 영수 또는 청구결의 취소", desc = "기술지원 결의(기술지원,바우처,성적서)를 취소한다.")
	@ElValidator(errUrl = "")
	public void deleteSptTecDepstSlip(SptTecSlipSrcVo vo) throws Exception{
		if("2".equals(vo.getDemnd_recv_clsf())){
			service.deleteSptTecDepstSlip(vo);
		}else{
			service.deleteSptTecDemndSlip(vo);
		}
	}
	
	@ElService(key = "SvcSUPTECSLPR03")
	@RequestMapping(value = "SvcSUPTECSLPR03")
	@ElDescription(sub = "미수수탁정산결의 목록 조회", desc = "기업지원 미수수탁정산결의에서 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptTecAdjstSlipVo> selectFinUnPaidAdjst(SptTecSlipSrcVo vo) throws Exception{
		return service.selectFinUnPaidAdjst(vo);
	}
	
	@ElService(key = "SvcSUPTECSLPM03")
	@RequestMapping(value = "SvcSUPTECSLPM03")
	@ElDescription(sub = "미수수탁정산결의 생성", desc = "미수수탁 정산결의를 생성한다.(미수반제, 온라인가수반제)")
	@ElValidator(errUrl = "")
	public SptTecSlipSrcVo saveTecRcptRepaySlip(SptTecSlipInfoVo vo) throws Exception{
		SptTecSlipSrcVo retVo = new SptTecSlipSrcVo();
		retVo.setUnslip_no(service.saveTecRcptRepaySlip(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcSUPTECSLPD01")
	@RequestMapping(value = "SvcSUPTECSLPD01")
	@ElDescription(sub = "미수수탁 정산결의 삭제", desc = "미수수탁 정산결의를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteTecRcptRepaySlip(SptTecSlipSrcVo vo) throws Exception{
		service.deleteTecRcptRepaySlip(vo);
	}
}
