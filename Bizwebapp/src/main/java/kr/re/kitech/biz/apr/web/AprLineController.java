package kr.re.kitech.biz.apr.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.AprLineService;
import kr.re.kitech.biz.apr.service.FormBasicService;
import kr.re.kitech.biz.apr.vo.AppFormVo;
import kr.re.kitech.biz.apr.vo.AprDeptListVo;
import kr.re.kitech.biz.apr.vo.AprDeptVo;
import kr.re.kitech.biz.apr.vo.AprLineDescListVo;
import kr.re.kitech.biz.apr.vo.AprLineDescVo;
import kr.re.kitech.biz.apr.vo.AprLineListVo;
import kr.re.kitech.biz.apr.vo.AprLineVo;
import kr.re.kitech.biz.apr.vo.AprUserListVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.AprWorkVo;

/**
 * 
 * @author 박병목
 * @since 2022. 6. 24.
 */
@Controller
public class AprLineController {
	
	@Resource(name = "aprLineServiceImpl")
    private AprLineService aprLineService;
    
	@Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;    
    
    @Resource(name = "formBasicServiceImpl")
    private FormBasicService FormBasicService;
    
    /**
     * 개인별 결재선 등록 처리 한다.
     *
     * @param AprLineVo
     * @throws Exception
     */
    @ElService(key="SvcAPRCOMLINC01")    
    @RequestMapping(value = { "SvcAPRCOMLINC01" })
    @ElDescription(sub="개인별 결재선 등록",desc="개인별 결재선 등록")
    @ElValidator(errUrl="")    
    public void insertAprLine(AprLineDescListVo vo) throws Exception {
    	
        AprLineVo aprVo = vo.getAprLineVo();
    	List<AprLineDescVo> listVo = vo.getAprLineDescList();    		      	
    	aprLineService.insertAprLine(aprVo, listVo);
    }
    
    /**
     * 개인별 결재선 수정 처리 한다.
     *
     * @param AprLineVo
     * @throws Exception
     */
    @ElService(key="SvcAPRCOMLINU01")    
    @RequestMapping(value = { "SvcAPRCOMLINU01" })
    @ElDescription(sub="개인별 결재선 수정",desc="개인별 결재선 수정")
    @ElValidator(errUrl="")    
    public void updateAprLine(AprLineDescListVo vo) throws Exception {
    	AprLineVo aprVo = vo.getAprLineVo();
    	List<AprLineDescVo> listVo = vo.getAprLineDescList();
    	aprLineService.updateAprLine(aprVo, listVo);
    }
    
    /**
     * 개인별 결재선 삭제 처리 한다.
     *
     * @param AprLineVo
     * @throws Exception
     */
    @ElService(key="SvcAPRCOMLIND01")    
    @RequestMapping(value = { "SvcAPRCOMLIND01" })
    @ElDescription(sub="개인별 결재선 삭제",desc="개인별 결재선 삭제")
    @ElValidator(errUrl="")    
    public void deleteAprLine(AprLineVo vo) throws Exception {    		      	
    	aprLineService.deleteAprLine(vo);
    }
    
	    	
	/**
	 * 개인별 결재선 리스트 조회
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR01")
	@RequestMapping(value = "SvcAPRCOMLINR01")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재선 리스트", desc = "결재선 리스트")
	public AprLineListVo selectAprLineList(AprUserVo vo) throws Exception {
		AprLineListVo retVo = new AprLineListVo();
		retVo.setAprLineList(aprLineService.selectAprLineList(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprLineList().size()));
		return retVo;
	}
	
	/**
	 * 개인별 결재선 선택 리스트 조회
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR02")
	@RequestMapping(value = "SvcAPRCOMLINR02")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "개인별 결재선 선택 리스트", desc = "개인별 결재선 선택 리스트")
	public AprLineDescListVo selectAprLineDescList(AprLineVo vo) throws Exception {
		AprLineDescListVo retVo = new AprLineDescListVo();
		retVo.setAprLineDescList(aprLineService.selectAprLineDescList(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprLineDescList().size()));
		return retVo;
	}
	
	/**
	 * 결재 사용자 검색
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR03")
	@RequestMapping(value = "SvcAPRCOMLINR03")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "결재 사용자 검색", desc = "결재 사용자 검색")
	public AprUserListVo selectAprUserList(AprUserVo vo) throws Exception {
		AprUserListVo retVo = new AprUserListVo();
		retVo.setAprUserListVo(aprLineService.selectAprUserList(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprUserListVo().size()));
		return retVo;
	}
	
	/**
	 * 개인별 초기 결재라인 세팅
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR04")
	@RequestMapping(value = "SvcAPRCOMLINR04")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "개인별 초기 결재라인 검색", desc = "개인별 초기 결재라인 검색")
	public AprUserListVo selectBaseAprLine(AprVo vo) throws Exception {
		AprUserListVo retVo = new AprUserListVo();
		retVo.setAprUserListVo(aprLineService.selectBaseAprLine(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprUserListVo().size()));
		return retVo;
	}
	
	/**
	 * 개인별 초기 결재라인 세팅(전체)
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR08")
	@RequestMapping(value = "SvcAPRCOMLINR08")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "개인별 초기 결재라인 검색(전체)", desc = "개인별 초기 결재라인 검색(전체)")
	public AprUserListVo selectBaseAprLineAll(AprVo vo) throws Exception {
		AprUserListVo retVo = new AprUserListVo();
		retVo.setAprUserListVo(aprLineService.selectBaseAprLineAll(vo, null));
		retVo.setTotalCount(Long.valueOf(retVo.getAprUserListVo().size()));
		return retVo;
	}
	
	/**
	 * 수신결재 차상위자 세팅
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR09")
	@RequestMapping(value = "SvcAPRCOMLINR09")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "수신결재 차상위자 세팅", desc = "수신결재 차상위자 세팅")
	public AprUserListVo selectSuSinAprLine(AprVo vo) throws Exception {
		AprUserListVo retVo = new AprUserListVo();
		retVo.setAprUserListVo(aprLineService.selectSuSinAprLine(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprUserListVo().size()));
		return retVo;
	}

	/**
	 * 부서 라인 세팅(APR)
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR05")
	@RequestMapping(value = "SvcAPRCOMLINR05")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "개인별 결재 부서 세팅", desc = "개인별 결재 부서 세팅")
	public AprDeptListVo selectBaseDeptLine(AprDeptVo vo) throws Exception {
		AprDeptListVo retVo = new AprDeptListVo();
		retVo.setAprDeptListVo(aprLineService.selectBaseDeptLine(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprDeptListVo().size()));
		return retVo;
	}
	
	/**
	 * 부서별 사용자 세팅(APR)
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR06")
	@RequestMapping(value = "SvcAPRCOMLINR06")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "부서별 사용자 세팅(APR)", desc = "부서별 사용자 세팅(APR)")
	public AprUserListVo selectDeptToUserLine(AprDeptVo vo) throws Exception {
		AprUserListVo retVo = new AprUserListVo();
		retVo.setAprUserListVo(aprLineService.selectDeptToUserLine(vo));
		retVo.setTotalCount(Long.valueOf(retVo.getAprUserListVo().size()));
		return retVo;
	}
	

	/**
	 * 부서결재라인수 반환
	 * 
	 * @throws Exception
	 */
	@ElService(key = "SvcAPRCOMLINR07")
	@RequestMapping(value = "SvcAPRCOMLINR07")
	@ElValidator(errUrl = "")
	@ElDescription(sub = "BPM 결재라인 수 조회", desc = "BPM 결재라인 수 조회")
	public AprWorkVo getBpmApprovalLineCount(AprWorkVo aprWorkVo) throws Exception {
		int count = 0 ;
		// As-Is 데이터일경우 Get정보 안함
		if (!StringUtils.equals("1", aprWorkVo.getAsistype())) {
			count = apprFuncService.getApprovalLineConunt(aprWorkVo);
		}		 
		aprWorkVo.setTotalCount(count);
		aprWorkVo.setIsSnapYn(apprFuncService.isSnapYn(aprWorkVo));
		return aprWorkVo;
	}	

	/**
     * 신청서양식 단건 조회
     *
     * @param AppFormVo
     * @throws Exception
     */
    @ElService(key = "SvcAPRCOMLINR10")
	@RequestMapping(value = "SvcAPRCOMLINR10")
	@ElDescription(sub = "신청서양식명 단건 조회", desc = "신청서양식명 단건 조회")
	@ElValidator(errUrl = "")
	public AppFormVo confirmPostApr(AppFormVo vo) throws Exception{
		return FormBasicService.getAppForm(vo);
	}
	
}
