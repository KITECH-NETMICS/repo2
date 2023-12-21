package kr.re.kitech.biz.uss.bas.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.uss.bas.service.ComBasIPReqService;
import kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo;
import kr.re.kitech.biz.uss.bas.vo.ComBasIpReqFormVo;

/**  
 * @ClassSubJect 정보시스템운영 컨트롤러
 * @Class Name ComBasController.java
 * @Description 정보시스템운영 업무를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/23     홍성민             최초생성
 * 
 * @author 홍성민
 * @since 2023/06/23
 * @version 1.0
 * @see
 * 
 */
@Controller
public class ComBasController {
	
	@Resource(name="comBasIPReqServiceImpl")
	ComBasIPReqService comBasIPReqServiceImpl;
	
	@ElService(key = "SvcCOMBASIPRR01")    
    @RequestMapping(value = "SvcCOMBASIPRR01")
    @ElDescription(sub = "IP신규/변경 신청서 조회", desc = "IP신규/변경 신청서를 단건 조회한다.")
    @ElValidator(errUrl = "")    
    public ComBasIpReqFormVo selectIpReqList(ComBasIPReqVo vo) throws Exception {
    	return comBasIPReqServiceImpl.selectIpReqForm(vo);
    }
}
