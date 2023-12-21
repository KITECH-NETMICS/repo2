package kr.re.kitech.biz.res.app.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.app.service.ResBsnsAplyReqService;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsAppRetVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsReqVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsThreeFiveVo;
import kr.re.kitech.biz.res.app.vo.ResAppBugtVo;
import kr.re.kitech.biz.res.app.vo.ResAppMastVo;
import kr.re.kitech.biz.res.app.vo.ResAppPareVo;
import kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo;
import kr.re.kitech.biz.res.app.vo.ResAppSrcVo;
import kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo;
import kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo;

/**  
 * @ClassSubJect 사업신청 
 * @Class Name : ResAppController.java
 * @Description : 사업신청 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/12/10   홍성민                최초생성
 * 
 * @author 홍성민
 * @since 2022/12/10
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Controller
public class ResBsnsAplyReqController {
	
	@Resource(name="resBsnsAplyReqService")
	private ResBsnsAplyReqService bsnsReqService;
	
    @ElService(key = "SvcRESAPPAPLR01")
    @RequestMapping(value = "SvcRESAPPAPLR01")    
    @ElDescription(sub = "사업신청(사용자화면) 목록 조회", desc = "검색 조건에 대한 사업신청 목록을 조회한다.")
	@ElValidator(errUrl = "")               
    public List<ResAppBsnsReqVo> selectBsnsAppUserList(ResAppSrcVo vo) throws Exception {      		
        return bsnsReqService.selectBsnsAppUserList(vo);
    }
	
    @ElService(key="SvcRESAPPAPLR02")
    @RequestMapping(value="SvcRESAPPAPLR02")    
    @ElDescription(sub="사업신청 조회", desc="검색 조건에 대한 사업신청 상세를 조회한다.")               
    public ResAppBsnsAppRetVo selectBsnsApp(ResAppSrcVo vo) throws Exception {      		
        return bsnsReqService.selectBsnsApp(vo);
    }
    
    @ElService(key="SvcRESAPPAPLR04")
    @RequestMapping(value="SvcRESAPPAPLR04")    
    @ElDescription(sub="사업신청 예산 내역 템플릿 조회", desc="사업신청 예산 내역의 템플릿을 조회한다.")               
    public List<ResAppBugtVo> selectBugtTemplate(ResAppSrcVo vo) throws Exception {
    	return bsnsReqService.selectBugtTemplate(vo);
    }

    @ElService(key="SvcRESAPPAPLR05")
    @RequestMapping(value="SvcRESAPPAPLR05")    
    @ElDescription(sub="간접비율 조회", desc="간접비율 조회")               
    public ResBsnsReqEtcVo selectAppIndrc(ResBsnsReqEtcVo vo) throws Exception {      		
    	return bsnsReqService.selectAppIndrc(vo);
    }
    
    @ElService(key="SvcRESAPPAPLR06")
    @RequestMapping(value="SvcRESAPPAPLR06")    
    @ElDescription(sub="선행연구과제 목록 조회", desc="선행연구과제 목록 조회한다.")               
    public List<ResAppPrePrjVo> selectResAppPrePrjList(ResAppPrePrjVo vo) throws Exception {      		
    	return bsnsReqService.selectResAppPrePrjList(vo);
    }
    
    @ElService(key = "SvcRESAPPAPLR07")
	@RequestMapping(value = "SvcRESAPPAPLR07")    
	@ElDescription(sub = "참여연구원사전등록 조회", desc = "참여연구원 사전등록 목록을 조회한다.")
	@ElValidator(errUrl = "")               
	public List<ResPareMngmtMstrVo> selectResPareMngmtMstrList(ResPareMngmtMstrVo vo) throws Exception {      		
	    return bsnsReqService.selectResPareMngmtMstrList(vo);
	}
    
    @ElService(key="SvcRESAPPAPLR08")
	@RequestMapping(value="SvcRESAPPAPLR08")    
	@ElDescription(sub="사업신청 참여연구원 내역 조회", desc="사업신청 참여연구원의 내역을 조회한다")               
	public List<ResAppPareVo> selectResAppPareList(ResPareMngmtMstrVo vo) throws Exception {      		
	    return bsnsReqService.selectResAppPareList(vo);
	}

    @ElService(key="SvcRESAPPAPLR09")
	@RequestMapping(value="SvcRESAPPAPLR09")    
	@ElDescription(sub="제외사업 조회", desc="사업신청 3책 5공, 사업기준 제외사업을 조회한다")               
	public List<ResAppBsnsThreeFiveVo> selectBsnsAplyThreeFive(ResAppBsnsThreeFiveVo vo) throws Exception {      		
	    return bsnsReqService.selectBsnsAplyThreeFive(vo);
	}
	
	@ElService(key = "SvcRESAPPAPLR10")
	@RequestMapping(value = "SvcRESAPPAPLR10")
	@ElDescription(sub = "사업신청 목록 조회(관리자화면)", desc = "연구관리 사업신청목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResAppBsnsReqVo> selectBsnsAppList(ResAppSrcVo vo) throws Exception{
		return bsnsReqService.selectBsnsAppList(vo);
	}
	
	@ElService(key = "SvcRESAPPAPLM01")
	@RequestMapping(value = "SvcRESAPPAPLM01")
	@ElDescription(sub = "사업신청 저장", desc = "사업신청 마스터, 선행과제, 참여연구원, 연구비, 연구장비통합관리등을 저장한다.")
	@ElValidator(errUrl = "")
	public ResAppSrcVo saveResBsnsAplyReq(ResAppBsnsAppRetVo vo) throws Exception{
		ResAppSrcVo retVo = new ResAppSrcVo();
		retVo.setBsns_req_no(bsnsReqService.saveResBsnsAplyReq(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcRESAPPAPLM02")
	@RequestMapping(value = "SvcRESAPPAPLM02")
	@ElDescription(sub = "사업신청 선정결과 저장", desc = "사업신청 선정결과를 저장하고 연구책임자에게 메일을 발송한다.")
	@ElValidator(errUrl = "")
	public Map<String,String> saveBsnsAplySeltRst(ResAppMastVo vo) throws Exception{
		Map<String,String> map = new HashMap<>();
		map.put("mail_yn", bsnsReqService.saveBsnsAplySeltRst(vo));
		return map;
	}
	
	@ElService(key = "SvcRESAPPAPLD01")
	@RequestMapping(value = "SvcRESAPPAPLD01")
	@ElDescription(sub = "사업신청 삭제", desc = "사업신청 마스터, 참여연구원,연구비,보안등급분류및심사기준, 연구장비통합관리비등을 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteResBsnsReq(ResAppSrcVo vo) throws Exception{
		bsnsReqService.deleteResBsnsReq(vo);
	}
}
