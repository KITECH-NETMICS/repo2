package kr.re.kitech.biz.fin.com.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.AutoBugtVo;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.BugtChkVo;
import kr.re.kitech.biz.fin.com.vo.BugtRamtVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmListVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.spm.vo.FspEvidAttchListVo;

/**  
 * @ClassSubJect 재무공통 컨트롤러
 * @Class Name FinComController.java
 * @Description 재무공통 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/08     이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/04/08
 * @version 1.0
 * @see
 * 
 */
 @Controller
public class FinComController {
	 @Resource(name="finComService")
	 private FinComService finComService;
	 
	 @Resource(name="finComAttachService")
	private FinComAttachService attachService;
	 
	 @ElService(key = "SvcFINCOMCODR01")
	@RequestMapping(value = "SvcFINCOMCODR01")
	@ElDescription(sub = "콤보용코드조회", desc = "콤보용 코드데이터를 조회한다.")
	@ElValidator(errUrl = "")
	public FinCodeNmListVo selectCodeList(FinCodeNmVo vo) throws Exception{
		 FinCodeNmListVo codeList = new FinCodeNmListVo();
		 codeList.setCodeNmList(finComService.selectCodeList(vo));
		 return codeList;
	}
	
	@ElService(key = "SvcFINCOMEVDR01")
	@RequestMapping(value = "SvcFINCOMEVDR01")
	@ElDescription(sub = "전자증빙조회", desc = "전자증빙팝업에서 전자증빙리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public FspEvidAttchListVo selectFbaExpnsEvidList(FbaExpnsEvidVo vo) throws Exception{
		FspEvidAttchListVo retVo = new FspEvidAttchListVo();
		retVo.setGridList(attachService.selectFbaExpnsEvidList(vo));
		return retVo;
	}
	
	@ElService(key = "SvcFINCOMEVDU01")
	@RequestMapping(value = "SvcFINCOMEVDU01")
	@ElDescription(sub = "전자증빙팝업 저장호출", desc = "전자증빙팝업에서 저장 후 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public FbaExpnsEvidVo saveFspEvidAttachPop (FspEvidAttchListVo vo) throws Exception{
		FbaExpnsEvidVo retVo = new FbaExpnsEvidVo();
		retVo.setEvid_mngmt_no(attachService.saveFspEvidAttachPop(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcFINCOMCHKR02")
	@RequestMapping(value = "SvcFINCOMCHKR02")
	@ElDescription(sub = "결의생성시 예산잔액 조회", desc = "결의생성시 예산잔액을 조회한다.")
	@ElValidator(errUrl = "")
	public BugtRamtVo selectBugtRamtChk(BblenfrcVo vo) throws Exception{
		BugtRamtVo ramtVo = finComService.selectBugtRamtChk(vo, "");		
		return ramtVo;
	}
	
	@ElService(key = "SvcFINCOMBUGR01")
	@RequestMapping(value = "SvcFINCOMBUGR01")
	@ElDescription(sub = "출장,결의서 예산통제자,자동통제여부 조회", desc = "국내출장,결의서에서 예산통제자,자동통제여부를 조회한다.")
	@ElValidator(errUrl = "")
	public AutoBugtVo selectAccntAutoBugtPsn(AutoBugtVo vo) throws Exception{
		return finComService.getAccntAutoBugtPsn(vo);
	}
	
	@ElService(key = "SvcFINCOMBUGR02")
	@RequestMapping(value = "SvcFINCOMBUGR02")
	@ElDescription(sub = "예실반영여부 체크", desc = "예실반영여부를 체크한다(구:gfnBugtEtcChk)")
	@ElValidator(errUrl = "")
	public BugtRamtVo selectBugtEtcChk(BugtChkVo vo) throws Exception{
		return finComService.selectBugtEtcChk(vo);
	}
}
