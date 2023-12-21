package kr.re.kitech.biz.sup.cus.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.cus.service.SptCustInfoRegService;
import kr.re.kitech.biz.sup.cus.vo.SptCustBaseInfoMntVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustSrcVo;

/**  
 * @ClassSubJect 기술지원 고객정보 관리
 * @Class Name SptCustInfoController.java
 * @Description 기술지원 고객정보 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
@Controller
public class SptCustInfoController {
	@Resource(name="sptCustInfoRegService")
	private SptCustInfoRegService custService;
	
	@ElService(key = "SvcSUPCUSMNTR01")
	@RequestMapping(value = "SvcSUPCUSMNTR01")
	@ElDescription(sub = "기업정보관리 목록조회", desc = "기업정보관리화면에서 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SptCustBaseInfoMntVo> selectSptCustBaseInfoList(SptCustSrcVo vo) throws Exception{
		return custService.selectSptCustBaseInfoList(vo);
	}
}
