package kr.re.kitech.biz.res.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.com.service.ResCommService;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthListVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeSearchVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeVo;
import kr.re.kitech.biz.res.com.vo.ResIndTeccVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;
import kr.re.kitech.biz.res.std.vo.XodrResManVo;


/**  
 * @ClassSubJect 컨트롤러
 * @Class Name ResCommController.java
 * @Description  컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31     개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */

@Controller
public class ResCommController {
    
    @Resource(name="resCommServiceImpl")
    private ResCommService resCommService;
    
    @ElService(key="SvcRESCOMRBAR01")
    @RequestMapping(value="SvcRESCOMRBAR01")    
    @ElDescription(sub="업무구분 공통코드 조회", desc="업무구분 공통코드를 모두 조회하다.")               
    public ResBsnsCodeDepthListVo selectBsnsCodeDepthList(ResBsnsCodeSearchVo vo) throws Exception {      		
        return resCommService.selectBsnsCodeDepthList(vo);
    }
    
    @ElService(key="SvcRESCOMRBAR02")
    @RequestMapping(value="SvcRESCOMRBAR02")    
    @ElDescription(sub="사업분류 조회 ", desc="사업분류(관계부처, 사업분류, 세부사업명, 내/외부, 전담기관) 조회")               
    public List<ResBsnsCodeVo> selectRbaCodeListNoDepth(ResBsnsCodeSearchVo vo) throws Exception {      		
    	return resCommService.selectRbaCodeListNoDepth(vo);
    }
    
    @ElService(key="SvcRESCOMRBAR03")
	@RequestMapping(value="SvcRESCOMRBAR03")    
	@ElDescription(sub="사업분류 조회 ", desc="사업분류 검색 팝업을 위한 목록 조회")               
	public List<ResBsnsCodeVo> selectXodrBaCodePop(ResBsnsCodeSearchVo vo) throws Exception {      		
	    return resCommService.selectXodrBaCodePop(vo);
	}
    
    @ElService(key = "SvcRESCOMR01")
	@RequestMapping(value = "SvcRESCOMR01")
	@ElDescription(sub = "연구담당자조회(공통함수)", desc = "부서로 연구담당자를 조회한다.")
	@ElValidator(errUrl = "")
	public XodrResManVo selectXodrResMan(XodrResManVo vo) throws Exception{
    	return resCommService.selectXodrResMan(vo);
    }
    
    @ElService(key = "SvcRESCOMR02")
	@RequestMapping(value = "SvcRESCOMR02")
	@ElDescription(sub = "산업기술분류표 대분류 조회", desc = "산업기술분류표 대분류를 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResIndTeccVo> selectResIndTeccBigClsf(ResIndTeccVo vo) throws Exception{
    	return resCommService.selectResIndTeccBigClsf(vo);
    }
    
    @ElService(key = "SvcRESCOMR03")
	@RequestMapping(value = "SvcRESCOMR03")
	@ElDescription(sub = "산업기술분류표 중분류 조회", desc = "산업기술분류표 중분류를 조회한다.(콤보박스)")
	@ElValidator(errUrl = "")
	public List<ResIndTeccVo> selectResIndTeccMidClsf(ResIndTeccVo vo) throws Exception{
    	return resCommService.selectResIndTeccMidClsf(vo);
    }
    
    @ElService(key = "SvcRESCOMR06")
	@RequestMapping(value = "SvcRESCOMR06")
	@ElDescription(sub = "산업기술분류표 소분류 조회", desc = "산업기술분류표 소분류를 조회한다.(콤보박스)")
	@ElValidator(errUrl = "")
	public List<ResIndTeccVo> selectResIndTeccSmlClsf(ResIndTeccVo vo) throws Exception{
    	return resCommService.selectResIndTeccSmlClsf(vo);
    }
    
    @ElService(key = "SvcRESCOMR04")
	@RequestMapping(value = "SvcRESCOMR04")
	@ElDescription(sub = "중분류검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)", desc = "TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류에 대한 중분류를 조회한다.")
	@ElValidator(errUrl = "")
	public List<XodxCommstVo> selectXodxCommstMidClsf(XodxCommstVo vo) throws Exception{
    	return resCommService.selectXodxCommstMidClsf(vo);
    }
    
    @ElService(key = "SvcRESCOMR05")
	@RequestMapping(value = "SvcRESCOMR05")
	@ElDescription(sub = "코드검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)", desc = "코드(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류) 검색을 한다.")
	@ElValidator(errUrl = "")
	public List<XodxCommstVo> selectXodxCommstMngmt(XodxCommstVo vo) throws Exception{
    	return resCommService.selectXodxCommstMngmt(vo);
    }
}
