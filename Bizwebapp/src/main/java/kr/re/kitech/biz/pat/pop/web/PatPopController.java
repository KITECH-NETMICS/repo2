package kr.re.kitech.biz.pat.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.pat.pop.service.PatPopService;
import kr.re.kitech.biz.pat.pop.vo.PatCodeMastrVo;
import kr.re.kitech.biz.pat.pop.vo.PatMasterFileSearchPopVo;
import kr.re.kitech.biz.pat.pop.vo.PatOfficeVo;
import kr.re.kitech.biz.pat.pop.vo.PatPopSrcVo;
import kr.re.kitech.biz.pat.pop.vo.PatSmitAppNoVo;
import kr.re.kitech.biz.pat.pop.vo.RelatedSmitAppNoVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;

/**  
 * @ClassSubJect 지식재산권 팝업 Controller
 * @Class Name PatPopController.java
 * @Description 지식재산권 팝업관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/27   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/01/27
 * @version 1
 * @see
 * 
 */
@Controller
public class PatPopController {
	@Resource(name="patPopService")
	private PatPopService popService;
	
	@ElService(key = "SvcPATPOPR01")
	@RequestMapping(value = "SvcPATPOPR01")
	@ElDescription(sub = "출원번호검색(팝업)", desc = "출원번호를 검색한다.(발명신고서,심의평가 결과등록,출원지시 등록)")
	@ElValidator(errUrl = "")
	public List<PatSmitAppNoVo> selectSmitAppNo(PatSmitAppNoVo vo) throws Exception{
		return popService.selectSmitAppNo(vo);
	}
	
	@ElService(key = "SvcPATPOPR02")
	@RequestMapping(value = "SvcPATPOPR02")
	@ElDescription(sub = "발명신고서 특허사무소 조회(검색팝업)", desc = "발명신고서 특허사무소 검색팝업에서 특허사무소를 조회한다.")
	@ElValidator(errUrl = "")
	public List<PatOfficeVo> selectPatOfficeList(PatOfficeVo vo) throws Exception{
		return popService.selectPatOfficeList(vo);
	}
	
	@ElService(key = "SvcPATPOPR03")
	@RequestMapping(value = "SvcPATPOPR03")
	@ElDescription(sub = "프로그램종류 코드 조회", desc = "발명신고서 프로그래내역 프로그램종류코드 검색팝업에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<XodxCommstVo> selectXodxCommstPPC(XodxCommstVo vo) throws Exception{
		return popService.selectXodxCommstPPC(vo);
	}
	
	@ElService(key = "SvcPATPOPR04")
	@RequestMapping(value = "SvcPATPOPR04")
	@ElDescription(sub = "출원희망국가 조회(검색팝업)", desc = "출원희망국가정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<PatCodeMastrVo> selectPatCodeMastr(PatPopSrcVo vo) throws Exception{
		return popService.selectPatCodeMastr(vo);
	}
		
	@ElService(key = "SvcPATPOPR05")
	@RequestMapping(value = "SvcPATPOPR05")
	@ElDescription(sub = "관련 출원번호검색(팝업)", desc = "관련 출원번호검색(팝업)")
	@ElValidator(errUrl = "")
	public List<RelatedSmitAppNoVo> selectRelatedSmitAppNo(RelatedSmitAppNoVo vo) throws Exception {
		return popService.selectRelatedSmitAppNo(vo);
	}
	
	@ElService(key = "SvcPATPOPR06")
	@RequestMapping(value = "SvcPATPOPR06")
	@ElDescription(sub = "첨부파일 다운로드 조회", desc = "첨부파일 다운로드 항목을 조회한다.")
	@ElValidator(errUrl = "")
	public PatMasterFileSearchPopVo selectPatMasterFileSearch(PatMasterFileSearchPopVo vo) throws Exception{
		return popService.selectPatMasterFileSearch(vo);
	}
	
	@ElService(key = "SvcPATPOPR07")
	@RequestMapping(value = "SvcPATPOPR07")
	@ElDescription(sub = "소연심의_자유발명신고서 파일조회", desc = "소연심의_자유발명신고서 파일조회한다.")
	@ElValidator(errUrl = "")
	public PatMasterFileSearchPopVo selectPatAttachFileSearch(PatMasterFileSearchPopVo vo) throws Exception{
		return popService.selectPatAttachFileSearch(vo);
	}

}
