package kr.re.kitech.biz.apr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.apr.service.FormBasicService;
import kr.re.kitech.biz.apr.vo.AppFormListVo;
import kr.re.kitech.biz.apr.vo.AppFormVo;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

/**
 * 신청서양식함
 * 
 * @author James
 * @since 2022. 6. 3.
 */
@Controller
public class FormBasicController {
	/** FormBasicService */
    @Resource(name = "formBasicServiceImpl")
    private FormBasicService formBasicService;
    
    @Resource(name="accntServiceImpl")
    private AccntService accntServiceImpl;
    
	/**
     * 신청서양식함 목록을 조회합니다.
     * @param applicationFormVo 신청서양식함마스터 applicationFormVo
     * @return 신청서양식함 조회 결과
     * @throws Exception
     */
    @ElService(key="SvcAPRDOCFRMR01")
    @RequestMapping(value="SvcAPRDOCFRMR01")    
    @ElDescription(sub="신청서양식함 목록조회",desc="신청서양식함 목록 조회를 한다.")               
    public AppFormListVo selectAppForm(AppFormVo vo) throws Exception {    	   	

        List<AppFormVo> AppFormList = formBasicService.selectAppForm(vo);
	
		AppFormListVo retVo = new AppFormListVo();
		retVo.setAppFormVoList(AppFormList);
		retVo.setTotalCount(Long.valueOf(AppFormList.size()));
        return retVo;            
    }
    
    	/**
     * 신청서양식함에서 메뉴Obj가 없을 경우 서비스를 조회합니다.
     * @param applicationFormVo 신청서양식함마스터 applicationFormVo
     * @return 신청서양식함 조회 결과
     * @throws Exception
     */
    @ElService(key="SvcAPRDOCFRMR02")
    @RequestMapping(value="SvcAPRDOCFRMR02")       
    @ElDescription(sub="신청서양식함 목록조회",desc="신청서양식함 목록 조회를 한다.")               
    public ServiceVo selectService(AppFormVo vo) throws Exception {    	   	

        return accntServiceImpl.findServiceByServiceId(vo.getScapp_cd());         
    }
}
