package kr.re.kitech.biz.ccs.cws.web;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import kr.re.kitech.biz.ccs.cws.service.CwsCmtAreaService;
import kr.re.kitech.biz.ccs.cws.vo.CwsCmtAreaTagVo;

/**  
 * @ClassSubJect 근태관리 관련 처리른 하는 컨트롤러
 * @Class Name CwsController.java
 * @Description 근태관리 관련 처리른 하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/09/18   김소연                 최초생성
 * 
 * @author 모바일
 * @since 2022/09/18
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class CwsCmtController {

	@Resource(name = "cwsCmtAreaServiceImpl")
	private CwsCmtAreaService cwsCmtAreaService;
	
	/**
     * 출퇴근인증 등록 처리 한다.
     * @param cwsCmtAreaTagVo 출퇴근인증 CwsCmtAreaTagVo
     * @throws Exception
     */
	@ElService(key = "SvcCCSCWSCMTAT01")    
    @RequestMapping(value = "SvcCCSCWSCMTAT01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "출퇴근정보 조회 및 저장", desc = "출퇴근정보를 조회 및 테이블에 저장 한다.")  
	public CwsCmtAreaTagVo selectCwsCmtAreaCheck(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws Exception{
		return cwsCmtAreaService.selectCwsCmtAreaCheck(cwsCmtAreaTagVo);
	}
	
	/**
     * 출퇴근인증 조회 처리 한다.
     * @param cwsCmtAreaTagVo 출퇴근인증 CwsCmtAreaTagVo
     * @throws Exception
     */
    @ElService(key = "SvcCCSCWSCMTS01")    
    @RequestMapping(value = "SvcCCSCWSCMTS01")    
    @ElValidator(errUrl = "")
    @ElDescription(sub = "출퇴근정보 조회", desc = "출퇴근정보를 조회한다.")  
	public List<CwsCmtAreaTagVo> selectCwsCmtAreaList(CwsCmtAreaTagVo cwsCmtAreaTagVo) throws Exception{
		return cwsCmtAreaService.selectCwsCmtAreaList(cwsCmtAreaTagVo);
	}
}