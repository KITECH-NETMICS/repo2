package kr.re.kitech.biz.xom.core.web;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.meta.ElCustomNotifyUtil;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.model.BizCommVO;
import kr.re.kitech.biz.xom.core.service.CodeService;
import kr.re.kitech.biz.xom.core.vo.CodeMapVo;
import kr.re.kitech.biz.xom.core.vo.CodeScVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

@Controller
public class CodeController {
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name = "codeServiceImpl")
	private CodeService codeServiceImpl;
	
	
	/**
     * 그룹 코드 별 코드 리스트 조회
	 */
	@ElService(key = "SvcCodeList")
    @RequestMapping(value = "SvcCodeList")    
    @ElDescription(sub = "그룹코드별 코드조회", desc = "코드를 계층형으로 정렬하여 조회한다.(cache)")
	@ElValidator(errUrl = "")               
    public CodeMapVo findCodesByGrpCode(CodeScVo codeSc) throws Exception {
    
		// ElCustomNotifyUtil.reloadCustomCacheManager(CodeCacheManager.class);
		AppLog.debug("코드 조회 로그 테스트 SC: " + codeSc);
		AppLog.debug("BizCommVO: " + ((BizCommVO)codeSc).toString());
		
		String grpCode = codeSc.getGrpCd();
		String dbGrpCode = codeSc.getDbGrpCd();
		
		if (null == grpCode || ("").equals(grpCode) || 3 > grpCode.length()){
			new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.code.0001");
		}
		
		List<String> grpCodes = null == grpCode ? null : Arrays.asList(grpCode.split("[,]"));
		List<String> dbGrpCodes = (null == dbGrpCode || "".equals(dbGrpCode)) ? null : Arrays.asList(dbGrpCode.split("[,]"));
		
		CodeMapVo retCodes = CodeCacheManager.getInstance().getGrpCodes( grpCodes, codeSc.getDataPrefix());
		Map<String, List<CodeVo>> cacheMap = retCodes.getCodeMap();
		Map<String, List<CodeVo>> dbMap = codeServiceImpl.selectCodesByCdClsfList(dbGrpCodes, codeSc.getDataPrefix());
		
		if (dbMap != null && dbMap.size() > 0) {
        	cacheMap.putAll(dbMap);
        }
        
        return retCodes;
    }
    

	/**
     * 그룹 코드 별 코드 리스트 조회
	 */
	@ElService(key = "SvcReloadCodes")
    @RequestMapping(value = "SvcReloadCodes")    
    @ElDescription(sub = "그룹코드별 코드를 리로딩", desc = "코드를 계층형으로 정렬하여 리로딩한다.")
	@ElValidator(errUrl = "")               
    public CodeMapVo reloadCodes(CodeScVo codeSc) throws Exception {
		AppLog.debug("코드 리로딩 시작 SC: " + codeSc);    
		ElCustomNotifyUtil.reloadCustomCacheManager(CodeCacheManager.class);
		AppLog.debug("코드 리로딩 시작 종료");		
        CodeMapVo retCodes = new CodeMapVo();
        return retCodes;
    }    
}
