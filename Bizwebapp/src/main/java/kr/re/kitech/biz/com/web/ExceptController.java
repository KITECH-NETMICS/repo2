package kr.re.kitech.biz.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.com.service.ExceptService;
import kr.re.kitech.biz.com.vo.ExceptItemListVo;
import kr.re.kitech.biz.com.vo.ExceptItemVo;

/**
 * 
 * @author James
 * @since 2023. 4. 5.
 */
@Controller
public class ExceptController {
	
	@Resource(name="exceptService")
	private ExceptService exceptService;
	
    @ElService(key = "SvcExceptProcess")    
    @RequestMapping(value = "SvcExceptProcess")
    @ElDescription(sub = "예외 처리 검증 로직", desc = "예외처리 검증 테이블을 조회하여 예외 여부를 반환한다.")
    @ElValidator(errUrl = "")    
    public ExceptItemVo exceptProcess(ExceptItemVo exceptVo) throws Exception {
    	
    	// 패스 여부 결과 값을 설정하여 반환. 
    	exceptVo.setPass(exceptService.isExcept(exceptVo));
        return exceptVo;
    }
    
    @ElService(key = "SvcExceptValues")    
    @RequestMapping(value = "SvcExceptValues")
    @ElDescription(sub = "예외 처리 검증 데이터 조회", desc = "예외처리 검증 테이블을 조회하여 데이터를 반환한다.")
    @ElValidator(errUrl = "")    
    public ExceptItemVo exceptValues(ExceptItemVo exceptVo) throws Exception {
    	List<String> values = exceptService.getExceptValues(exceptVo);
    	// 패스 데이터 결과 값을 설정하여 반환. 
    	exceptVo.setValues(String.join(",", values));
        return exceptVo;
    }
    
    @ElService(key = "SvcSelectExceptItemList")    
    @RequestMapping(value = "SvcSelectExceptItemList")
    @ElDescription(sub = "예외 처리 검증 리스트 조회", desc = "예외처리 검증 테이블을 조회하여 리스트를 반환한다.")
    @ElValidator(errUrl = "")    
    public ExceptItemListVo selectExceptItemList(ExceptItemVo exceptVo) throws Exception {
    	return exceptService.selectExceptItemList(exceptVo);
    }
    
    @ElService(key = "SvcSaveExceptItemList")    
    @RequestMapping(value = "SvcSaveExceptItemList")
    @ElDescription(sub = "예외 처리 검증 리스트 저장", desc = "수정된 예외처리 검증 정보를 저장한다.")
    @ElValidator(errUrl = "")    
    public void saveExceptItemList(ExceptItemListVo exceptVo) throws Exception {
        exceptService.saveExceptItemList(exceptVo);
    }  
}
