package kr.re.kitech.biz.res.out.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.out.service.ResOutCtrbtEvalService;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalListVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqIntegVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo;


@Controller
public class ResOutCtrbtEvalController {

  @Resource(name = "resOutCtrbtEvalService")
  private ResOutCtrbtEvalService service;

	@ElService(key = "SvcCtrbtEval01")
	@RequestMapping(value = "SvcCtrbtEval01")
	@ElDescription(sub = "조직기여도 정보 조회", desc = "조직기여도 정보를 조회한다")
	@ElValidator(errUrl = "")
	public List<ResOutCtrbtEvalListVo> selectCtrbtEval01(ResOutCtrbtEvalVo vo) throws Exception{
		return service.selectCtrbtEval01(vo);
	}
	
	@ElService(key = "SvcCtrbtEvalReqR01")
	@RequestMapping(value = "SvcCtrbtEvalReqR01")
	@ElDescription(sub = "조직기여도 신청서 조회", desc = "조직기여도 신청 정보를 조회한다")
	@ElValidator(errUrl = "")
	public ResOutCtrbtReqIntegVo selectCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws Exception{
		return service.selectCtrbtEvalReq01(vo);
	}
	

	@ElService(key = "SvcCtrbtEvalReqC01")
	@RequestMapping(value = "SvcCtrbtEvalReqC01")
	@ElDescription(sub = "조직기여도 신청서 저장", desc = "조직기여도 신청 정보를 저장한다")
	@ElValidator(errUrl = "")
	public ResOutCtrbtReqVo saveCtrbtEvalReq01(ResOutCtrbtReqIntegVo vo) throws Exception{
		return service.saveCtrbtEvalReq01(vo);
	}


	@ElService(key = "SvcCtrbtEvalReqD01")
	@RequestMapping(value = "SvcCtrbtEvalReqD01")
	@ElDescription(sub = "조직기여도 신청서 삭제", desc = "조직기여도 신청 정보를 삭제한다")
	@ElValidator(errUrl = "")
	public void deleteCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws Exception{
		service.deleteCtrbtEvalReq01(vo);
	}

    /**
     * 조직기여도 전자결재 담당자 승인(화면)
     */
    @ElService(key = "SvcCtrbtEvalReqU01")    
    @RequestMapping(value = "SvcCtrbtEvalReqU01")
    @ElDescription(sub = "조직기여도 담당자 승인", desc = "조직기여도 담당자 승인")
	@ElValidator(errUrl = "")
    public void cofirmCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws Exception {    	 
    	service.cofirmCtrbtEvalReq01(vo);
    }
    
    /**
     * 조직기여도 전자결재 담당자 반려(화면)
     */
    @ElService(key = "SvcCtrbtEvalReqU02")    
    @RequestMapping(value = "SvcCtrbtEvalReqU02")
    @ElDescription(sub = "조직기여도 담당자 반려", desc = "조직기여도 담당자 반려")
	@ElValidator(errUrl = "")
    public void rejectCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws Exception {    	 
    	service.rejectCtrbtEvalReq01(vo);
    }


/*
	@ElService(key = "SvcCtrbtEvalReqU03")
	@RequestMapping(value = "SvcCtrbtEvalReqU03")
	@ElDescription(sub = "조직기여도 신청서 결재 후 담당자 저장", desc = "결재 후 담당자가 조직기여도 신청 정보를 갱신한다.")
	@ElValidator(errUrl = "")
	public void saveCtrbtEvalReqPostApr(ResOutCtrbtEvalVo vo) throws Exception{
		service.updateCtrbtEvalReq01(vo);
	}
*/	
}
  