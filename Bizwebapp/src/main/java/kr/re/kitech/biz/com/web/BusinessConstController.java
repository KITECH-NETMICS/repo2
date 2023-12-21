package kr.re.kitech.biz.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.com.service.AppvConstraintService;
import kr.re.kitech.biz.com.service.BetaTesterMngService;
import kr.re.kitech.biz.com.vo.AppvConstraintListVo;
import kr.re.kitech.biz.com.vo.AppvConstraintVo;
import kr.re.kitech.biz.com.vo.BetaTesterListVo;
import kr.re.kitech.biz.com.vo.BetaTesterVo;

/**  
 * @ClassSubJect 업무의 양식함/제약/이중화 관리 컨트롤러
 * @Class Name BusinessConstController.java
 * @Description 업무의 양식함/제약/이중화 관리 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/09     홍성민             최초생성
 * 
 * @author 홍성민
 * @since 2023/05/09
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class BusinessConstController {
    
	/** BetaTesterMngService */
    @Resource(name = "betaTesterMngServiceImpl")
    private BetaTesterMngService betaTesterMngService;
    
	/** AppvConstraintService */
    @Resource(name = "appvConstraintServiceImpl")
    private AppvConstraintService appvConstraintService;
    
    @ElService(key = "SvcCOMCONSVCR01")    
    @RequestMapping(value = "SvcCOMCONSVCR01")
    @ElDescription(sub = "양식화/제약/이중화 관리 메뉴 목록 조회", desc = "양식화/제약/이중화 관리 메뉴 목록를 조회하여 데이터를 반환한다.")
    @ElValidator(errUrl = "")    
    public BetaTesterListVo selectBusinessServices(BetaTesterVo vo) throws Exception {
        List<BetaTesterVo> serviceList = betaTesterMngService.selectBusinessServices(vo);
        
		BetaTesterListVo retVo = new BetaTesterListVo();
		retVo.setBetaTesterVoList(serviceList);
		retVo.setTotalCount(Long.valueOf(serviceList.size()));
        return retVo;       
    }
    
    @ElService(key = "SvcCOMCONSVCR02")    
    @RequestMapping(value = "SvcCOMCONSVCR02")
    @ElDescription(sub = "베타테스터 조회", desc = "특정 메뉴 베타테스터 목록를 조회하여 데이터를 반환한다.")
    @ElValidator(errUrl = "")    
    public BetaTesterListVo selectBetaTester(BetaTesterVo vo) throws Exception {
    	BetaTesterVo appMap = null;
        List<BetaTesterVo> betaTesterList = betaTesterMngService.selectBetaTester(vo);
        
        if (StringUtils.isNotBlank(vo.getAlias())) {
    		appMap = appvConstraintService.selectAppvApplicationMap(vo);
    	}
        
        BetaTesterListVo retVo = new BetaTesterListVo();
        retVo.setBetaTesterVo(appMap);
        retVo.setBetaTesterVoList(betaTesterList);
		retVo.setTotalCount(Long.valueOf(betaTesterList.size()));

        return retVo;       
    }
    
    @ElService(key = "SvcCOMCONSVCR03")    
    @RequestMapping(value = "SvcCOMCONSVCR03")
    @ElDescription(sub = "결재 제약쿼리 조회", desc = "특정 결재 문서의 결재 제약쿼리를 조회한다.")
    @ElValidator(errUrl = "")
    public AppvConstraintListVo selectAppvConstList(AppvConstraintVo vo) throws Exception {
    	List<AppvConstraintVo> constList = appvConstraintService.selectAppvConstList(vo);
    	
    	AppvConstraintListVo retVo = new AppvConstraintListVo();
        retVo.setAppvConstraintVoList(constList);
		retVo.setTotalCount(Long.valueOf(constList.size()));
    	
    	return retVo;
    }
    
    @ElService(key = "SvcCOMCONSVCU01")    
    @RequestMapping(value = "SvcCOMCONSVCU01")
    @ElDescription(sub = "베타구분 저장", desc = "특정 메뉴의 베타 구분을 저장한다. LDAP 영역이므로 DB영역과 분리")
    @ElValidator(errUrl = "")    
    public void updateBetaServiceYN(BetaTesterVo vo) throws Exception {
    	betaTesterMngService.updateBetaServiceYN(vo);
    }
    
    @ElService(key = "SvcCOMCONSVCM01")    
    @RequestMapping(value = "SvcCOMCONSVCM01")
    @ElDescription(sub = "베타테스터 저장", desc = "특정 메뉴의 베타테스터를 저장한다. DB영역이므로 LDAP 영역과 분리")
    @ElValidator(errUrl = "")    
    public void saveBetaTester(BetaTesterVo vo) throws Exception {
    	betaTesterMngService.saveBetaTester(vo);
    }
    
    @ElService(key = "SvcCOMCONSVCM02")    
    @RequestMapping(value = "SvcCOMCONSVCM02")
    @ElDescription(sub = "결재문서 제약쿼리 저장", desc = "특정 메뉴의 결재문서 제약쿼리를 저장한다. ")
    @ElValidator(errUrl = "")    
    public void saveAppvConstList(AppvConstraintListVo vo) throws Exception {
    	appvConstraintService.saveAppvConstList(vo);
    }

    @ElService(key = "SvcCOMCONSVCM03")    
    @RequestMapping(value = "SvcCOMCONSVCM03")
    @ElDescription(sub = "결재문서 스냅샷 수정", desc = "특정 메뉴의 결재문서 스냅샷을 저장한다. ")
    @ElValidator(errUrl = "")    
    public void saveServiceNewUrl(BetaTesterListVo vo) throws Exception {
    	appvConstraintService.saveAppvApplicationMap(vo);
    }
    
    @ElService(key = "SvcCOMCONSVCD01")    
    @RequestMapping(value = "SvcCOMCONSVCD01")
    @ElDescription(sub = "베타테스터 저장", desc = "특정 메뉴의 베타테스터를 삭제한다. DB영역이므로 LDAP 영역과 분리")
    @ElValidator(errUrl = "")    
    public void deleteBetaTester(BetaTesterListVo vo) throws Exception {
        betaTesterMngService.deleteBetaTester(vo);
    }
    
}
