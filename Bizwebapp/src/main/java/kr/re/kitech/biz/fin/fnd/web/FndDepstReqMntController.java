package kr.re.kitech.biz.fin.fnd.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.com.vo.FibkAccntHisVo;
import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.fin.fnd.service.FndDepstReqMntService;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.res.exc.vo.FcpDepstReqListVo;

/**  
 * @ClassSubJect 예금입금의뢰를 처리하는 컨트롤러
 * @Class Name FndDepstReqMntController.java
 * @Description 예금입금의뢰를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/18     이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/18
 * @version 1.0
 * @see
 * 
 */
@Controller
public class FndDepstReqMntController {
	@Resource(name="fndDepstReqMntService")
	private FndDepstReqMntService service;
	
	@ElService(key = "SvcFINFNDDEPR01")
	@RequestMapping(value = "SvcFINFNDDEPR01")
	@ElDescription(sub = "연구비 및 기술지원 입금의뢰 팝업 조회", desc = "연구비 및 기술지원 입금의뢰 팝업에서 입금정보와 입금처리내역을 조회한다.")
	@ElValidator(errUrl = "")
	public FcpDepstReqListVo selectFcpDepstReqInfo(FndDepstSrcVo vo) throws Exception{
		FcpDepstReqListVo retVo = new FcpDepstReqListVo();
		retVo.setDepstList(service.selectFcpDepstReqInfo(vo));
    	return retVo;
    }
    
    @ElService(key = "SvcFINFNDDEPR03")
	@RequestMapping(value = "SvcFINFNDDEPR03")
	@ElDescription(sub = "예금입금의뢰 Ⅱ 목록 조회", desc = "")
	@ElValidator(errUrl = "")
	public List<FibkAccntHisVo> selectFibkAcctHisList(FndDepstSrcVo vo) throws Exception{
    	return service.selectFibkAcctHisList(vo);
    }
    
    @ElService(key = "SvcFINFNDDEPM01")
	@RequestMapping(value = "SvcFINFNDDEPM01")
	@ElDescription(sub = "예금입금의뢰 저장", desc = "")
	@ElValidator(errUrl = "")
	public Map<String, String> saveFcpDepstReq(FcpDepstReqVo vo) throws Exception{
    	Map<String, String> retMap = new HashMap<>();
    	retMap.put("req_no", service.saveFcpDepstReq(vo));
    	return retMap;
    }
    
    @ElService(key = "SvcFINFNDDEPD01")
	@RequestMapping(value = "SvcFINFNDDEPD01")
	@ElDescription(sub = "예금입금의뢰 2 삭제", desc = "")
	@ElValidator(errUrl = "")
	public void deleteFinDepstReq(FcpDepstReqVo vo) throws Exception{
    	service.deleteFinDepstReq(vo);
    }
}
