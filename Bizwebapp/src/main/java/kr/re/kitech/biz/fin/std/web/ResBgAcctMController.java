package kr.re.kitech.biz.fin.std.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.std.service.ResBgAcctMService;
import kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 
 * @ClassName : ResBgAcctmController.java
 * @Description 
 * @Modification :   
 *     수정일       		 수정자     		수정내용
 *  -----------   ---------   ---------
 *  2023.09.06.    timothee 	최초생성
 * 
 * @author timothee
 * @since 2023.09.06.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ResBgAcctMController {

	@Resource(name = "resBgAcctMServiceImpl")
	private ResBgAcctMService stdService;

	@ElService(key = "SvcFINSTDRESBGR01")
	@RequestMapping(value = "SvcFINSTDRESBGR01")
	@DataCollection(ref = "", target = "")
	@ElDescription(sub = "계정정보관리 다건(그리드) 조회", desc = "계정정보를 다건 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResBgAcctMVo> selectResBgAcctMList(ResBgAcctMVo stdVo) throws Exception {
		return stdService.selectResBgAcctMList(stdVo);
	}

	@ElService(key = "SvcFINSTDRESBGM01")
	@RequestMapping(value = "SvcFINSTDRESBGM01")
	@DataCollection(ref = "", target = "")
	@ElDescription(sub = "계정번호 단건 등록/수정", desc = "계정번호를 단건 등록/수정한다.")
	@ElValidator(errUrl = "")
	public ResBgAcctMVo saveResBgAcctM(ResBgAcctMVo stdVo) throws Exception {
		return stdService.saveResBgAcctM(stdVo);
	}
	
	@ElService(key = "SvcFINSTDRESBGD01")
	@RequestMapping(value = "SvcFINSTDRESBGD01")
	@DataCollection(ref = "", target = "")
	@ElDescription(sub = "계정번호 단건 삭제", desc = "계정번호를 단건 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteResBgAcctM(ResBgAcctMVo stdVo) throws Exception {
		stdService.deleteResBgAcctM(stdVo);
	}

}
