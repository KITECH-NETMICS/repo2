package kr.re.kitech.biz.epu.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo;
import kr.re.kitech.biz.epu.pop.service.EpuOrdPopService;
import kr.re.kitech.biz.epu.pop.vo.PurReqItemVo;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

@Controller
public class EpuOrdPopController {

	@Resource(name = "epuOrdPopService")
	private EpuOrdPopService popService;

  @ElService(key = "SvcEPUORDPOPR01")
  @RequestMapping(value = "SvcEPUORDPOPR01")
  @ElDescription(sub = "발주계획 품목내역 팝업-구매요구목록 조회", desc = "발주계획 품목내역 팝업에서 구매요구목록을 조회한다.")
@ElValidator(errUrl = "")
	public List<PurReqItemVo> selectPurReqForOrd(PurReqItemVo ordVo) throws Exception {      
	  	return popService.selectPurReqForOrd(ordVo);
  	}

  	@ElService(key = "SvcEPUORDPOPR02")
	@RequestMapping(value = "SvcEPUORDPOPR02")
	@ElDescription(sub = "발주계획 - 구매요구내역 첨부파일조회", desc = "발주계획 - 구매요구번호로 첨부파일을 조회한다.")
	@ElValidator(errUrl = "")
	public List<AttachVo> selectXomxComAttachPur(EpuOrdSrcVo vo) throws Exception{
  		return popService.selectXomxComAttachPur(vo);
  	}
  	
  	@ElService(key = "SvcEPUORDPOPR03")
	@RequestMapping(value = "SvcEPUORDPOPR03")
	@ElDescription(sub = "발주계획 및 입찰설명회등록 - 지명업체조회", desc = "발주계획 및 입찰설명회등록화면에서 지명(참가)업체를 조회한다.")
	@ElValidator(errUrl = "")
	public List<EpuOrnomVendVo> selectEpuVendInfo(EpuOrnomVendVo vo) throws Exception{
  		return popService.selectEpuVendInfo(vo);
  	}
  	
  	@ElService(key = "SvcEPUORDPOPR04")
	@RequestMapping(value = "SvcEPUORDPOPR04")
	@ElDescription(sub = "조달청거래처등록 팝업 조회", desc = "조달청거래처등록 팝업에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public EpuOrnomVendVo selectEpuVendInfoG2b(EpuOrnomVendVo vo) throws Exception{
  		return popService.selectEpuVendInfoG2b(vo);
  	}
  	
  	@ElService(key = "SvcEPUORDPOPM01")
	@RequestMapping(value = "SvcEPUORDPOPM01")
	@ElDescription(sub = "조달청 거래처등록 팝업 저장", desc = "조달청 거래처등록 팝업 저장")
	@ElValidator(errUrl = "")
	public void saveEpuVendInfoG2b(EpuOrnomVendVo vo) throws Exception{
  		popService.saveEpuVendInfoG2b(vo);
  	}

}
