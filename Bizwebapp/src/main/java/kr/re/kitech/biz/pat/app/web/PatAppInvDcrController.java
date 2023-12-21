package kr.re.kitech.biz.pat.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.pat.app.service.PatAppInvDcrService;
import kr.re.kitech.biz.pat.app.vo.PatAppInvDcrInfoVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatDftInvDcrListVo;
import kr.re.kitech.biz.pat.app.vo.PatSrcVo;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.pop.vo.PatCrtMngmtNoVo;

/**  
 * @ClassSubJect 발명신고서 관련 처리른 하는 컨트롤러
 * @Class Name PatAppInvDcrController.java
 * @Description 발명신고서 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/17     이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/01/17
 * @version 1
 * @see
 * 
 */
@Controller
public class PatAppInvDcrController {
	@Resource(name="patAppInvDcrService")
	private PatAppInvDcrService invDcrService;
	
	@Resource(name="patComService")
	private PatComService comService;
	
	@ElService(key = "SvcPATINVDCRR01")
	@RequestMapping(value = "SvcPATINVDCRR01")
	@ElDescription(sub = "발명신고서 목록 조회", desc = "발명신고서 또는 발명신고서(관)에서 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<PatDftInvDcrListVo> selectPatAppMastrList(PatDftInvDcrListVo vo) throws Exception{
		return invDcrService.selectPatAppMastrList(vo);
	}
	
	@ElService(key = "SvcPATINVDCRR02")
	@RequestMapping(value = "SvcPATINVDCRR02")
	@ElDescription(sub = "발명신고서 상세 조회", desc = "발명신고서 상세화면에서 각 탭의 내용을 조회한다.")
	@ElValidator(errUrl = "")
	public PatAppInvDcrInfoVo selectPatAppInvDcr(PatSrcVo vo) throws Exception{
		return invDcrService.selectPatAppInvDcr(vo);
	}
	
	@ElService(key = "SvcPATINVDCRM01")
	@RequestMapping(value = "SvcPATINVDCRM01")
	@ElDescription(sub = "발명신고서 저장", desc = "발명신고서 마스터, 출원인, 직무발명자, 관련연구과제, 프로그램,상표,디자인내역을 저장한다.")
	@ElValidator(errUrl = "")
	public PatSrcVo savePatAppInvDcr(PatAppInvDcrInfoVo vo) throws Exception{
		PatSrcVo retVo = new PatSrcVo();
		retVo.setReq_no(invDcrService.savePatAppInvDcr(vo));
		
		return retVo;
	}
	
	@ElService(key = "SvcPATINVDCRM02")
	@RequestMapping(value = "SvcPATINVDCRM02")
	@ElDescription(sub = "양도인 승인 또는 반려", desc = "발명신고서 양도인의 승인 또는 반려 처리를 한다.")
	@ElValidator(errUrl = "")
	public void updatePatAppCoInvntPsnApr(PatCoinvntPsnVo vo) throws Exception{
		invDcrService.updatePatAppCoInvntPsnApr(vo);
	}
	
	@ElService(key = "SvcPATINVDCRD01")
	@RequestMapping(value = "SvcPATINVDCRD01")
	@ElDescription(sub = "발명신고서 삭제", desc = "발명신고서를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deletePatAppInvDcr(PatSrcVo vo) throws Exception{
		invDcrService.deletePatAppInvDcr(vo);
	}
	
	@ElService(key = "SvcPATINVDCRM03")
	@RequestMapping(value = "SvcPATINVDCRM03")
	@ElDescription(sub = "해외출원인 경우 관리번호 생성", desc = "해외출원인 경우 관리번호를 생성한다.(발명신고서 관리번호생성 버튼 클릭)")
	@ElValidator(errUrl = "")
	public void createPatMstrMngmtNo(PatCrtMngmtNoVo vo) throws Exception{
		comService.createPatMstrMngmtNo(vo);
	}
}
