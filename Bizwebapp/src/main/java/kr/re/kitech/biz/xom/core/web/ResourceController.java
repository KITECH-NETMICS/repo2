package kr.re.kitech.biz.xom.core.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.xom.core.service.MsgResolveService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.ResourceVo;

/**
 * ResourceBundle message 서비스
 * @author James
 * @since 2022. 3. 29.
 */
@Controller 
public class ResourceController { 

    
    @Resource(name = "msgResolveServiceImpl")
    private MsgResolveService msgResolveService;
        

	/**
	 * 메시지번들 전체를  조회한다.
	 *
	 * @param menuVo 사원정보 ServiceVo
	 * @param model 결과정보를 담을 Model
	 * @return 이동할 URL 정보
	 * @throws Exception
	 */
	@ElService(key = "SvcMessages")
    @RequestMapping(value = "SvcMessages")    
    @ElDescription(sub = "메시지번들조회", desc = "메시지번들 전체를  조회한다.")
	@ElValidator(errUrl = "")               
    public ResourceVo messages(ResourceVo resourceVo) throws Exception { 

    	Map<String,Map<String,String>> messages = this.msgResolveService.getMessages(KitechContextUtil.getLocale());
//    	messages.forEach(( key, value) -> {
//    		AppLog.debug("- messsage -----> key: " + key +  "\t, value: " + value); // 요청 서비스의 최초 요청 데이터 Json 문자열     	
//    	});

		ResourceVo resource = new ResourceVo();
		resource.setData(messages);
        return resource;
    } 
}
