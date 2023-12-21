package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.ctr.service.CtrTripListService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripListVO;

@Controller
public class CtrTripListController {
	
	@Resource(name = "ctrTripListService")
	private CtrTripListService ctrTripListService;
	
	
	/**
     * 출장현황을 조회 한다
     * @param Object
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRTRLR01")
    @RequestMapping(value="SvcCCSCTRTRLR01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="출장현황 조회",desc="출장현황을 조회 한다")
    public List<CtrTripListVO> selectCtrTripList(Object param) throws Exception {
    	return ctrTripListService.selectCtrTripList(param);
    }
    
    @ElService(key = "SvcCCSCTRTRLR02")
	@RequestMapping(value = "SvcCCSCTRTRLR02")
	@ElDescription(sub = "출장정산현황 조회", desc = "국내출장 및 해외출장 정산현황을 조회한다.")
	@ElValidator(errUrl = "")
	public List<CtrTripListVO> selectCtrTripAdList(CtrTripAdSrcVo vo) throws Exception{
    	return ctrTripListService.selectCtrTripAdList(vo);
    }
}