package kr.re.kitech.biz.sup.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.pop.service.SptTecPopService;
import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;

/**  
 * @ClassSubJect 외부기술지원 팝업
 * @Class Name SptTecPopController.java
 * @Description 외부기술지원 팝업 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/03   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/07/03
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTecPopController {
	@Resource(name="sptTecPopService")
	private SptTecPopService tecPopService;
	
	@ElService(key = "SvcSUPTECPOPR01")
	@RequestMapping(value = "SvcSUPTECPOPR01")
	@ElDescription(sub = "외부기술지원(유상) 카드처리내역 그리드조회", desc = "외부기술지원(유상) 카드처리내역팝업에서 그리드를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptTranTableVo> selectSptTranTable(SptTranTableVo vo) throws Exception{
		return tecPopService.selectSptTranTable(vo);
	}
	
	@ElService(key = "SvcSUPTECPOPR02")
	@RequestMapping(value = "SvcSUPTECPOPR02")
	@ElDescription(sub = "외부기술지원(유상) SMS결제팝업 조회", desc = "외부기술지원(유상)에서 SMS결제팝업내역을 조회한다.")
	@ElValidator(errUrl = "")
	public EasyPayInfoVo selectEasyPayInfoPop(SptTecSrcVo vo) throws Exception{
		return tecPopService.selectEasyPayInfoPop(vo);
	}
}
