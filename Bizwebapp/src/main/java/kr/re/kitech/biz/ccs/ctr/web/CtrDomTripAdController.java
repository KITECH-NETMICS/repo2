package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.ctr.service.CtrDomTripAdService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdFormVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrDomAdInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripGpsVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;

/**  
 * @ClassSubJect 국내출장정산
 * @Class Name CtrDomTripAdController.java
 * @Description 국내출장정산 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/11/08     이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/11/08
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CtrDomTripAdController {
	@Resource(name="ctrDomTripAdService")
	private CtrDomTripAdService adService;
	
	@ElService(key = "SvcCCSCTRDADR01")
	@RequestMapping(value = "SvcCCSCTRDADR01")
	@ElDescription(sub = "국내출장정산 내역 조회", desc = "국내출장정산내역, 동반자, 경로, 지급내역, 출장경비, 계정내역등을 조회한다.")
	@ElValidator(errUrl = "")
	public CtrDomAdInfoVo selectCtrDomAd(CtrTripAdSrcVo vo) throws Exception{
		return adService.selectCtrDomAd(vo);
	}
	
	@ElService(key = "SvcCCSCTRDADR02")
	@RequestMapping(value = "SvcCCSCTRDADR02")
	@ElDescription(sub = "국내출장정산을 위한 출장정보 조회", desc = "국내출장정산을 위하여 출장정보(기본내역, 동반자, 경로, 계정내역 등)을 조회한다.")
	@ElValidator(errUrl = "")
	public CtrDomAdInfoVo selectCtrDomForAd(CtrTripSrcVo vo) throws Exception{
		return adService.selectCtrDomTripForAd(vo);
	}
	
	@ElService(key = "SvcCCSCTRDADR03")
	@RequestMapping(value = "SvcCCSCTRDADR03")
	@ElDescription(sub = "출장정산 위치정보 조회", desc = "출장정산에서 위치정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<CtrTripGpsVo> selectGpsInfoData(CtrTripAdSrcVo vo) throws Exception{
		return adService.selectGpsInfoData(vo);
	}
	
	@ElService(key = "SvcCCSCTRDADM01")
	@RequestMapping(value = "SvcCCSCTRDADM01")
	@ElDescription(sub = "국내출장 정산 저장", desc = "국내출장 정산내역을 저장, 결재신청, 결의생성을 처리한다.")
	@ElValidator(errUrl = "")
	public CtrTripAdSrcVo saveCtrDomTripAdInfo(CtrDomAdInfoVo vo) throws Exception{
		CtrTripAdSrcVo retVo = new CtrTripAdSrcVo();
		retVo.setReq_no(adService.saveCtrDomTripAdInfo(vo));
		return retVo;
	}
	
	@ElService(key = "SvcCCSCTRDADD01")
	@RequestMapping(value = "SvcCCSCTRDADD01")
	@ElDescription(sub = "국내출장정삭 삭제", desc = "국내출장정산정보 및 결의서정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteCtrDomTripAd(CtrTripAdSrcVo vo) throws Exception{
		adService.deleteCtrDomTripAd(vo);
	}
	
	@ElService(key = "SvcCCSCTRDADR04")
	@RequestMapping(value = "SvcCCSCTRDADR04")
	@ElDescription(sub = "출장정산여부 체크", desc = "업무대기함 호출시 출장정산여부 체크")
	@ElValidator(errUrl = "")
	public Map<String,String> selectCtrDomAdExistsYn(CtrTripSrcVo vo) throws Exception{
		return adService.selectCtrDomAdExistsYn(vo);
	}
	
	@ElService(key = "SvcCCSCTRDADU01")
	@RequestMapping(value = "SvcCCSCTRDADU01")
	@ElDescription(sub = "출장담당자 출장정산서 수정", desc = "출장담당자가 출장정산서 및 복명서의 일부를 수정한다.")
	@ElValidator(errUrl = "")
	public void updateCtrDomAdMng(CtrDomAdFormVo vo) throws Exception{
		adService.updateCtrDomAdMng(vo);
	}
}
