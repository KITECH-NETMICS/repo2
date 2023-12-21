package kr.re.kitech.biz.epu.cnt.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import kr.re.kitech.biz.epu.cnt.service.EpuCntService;

/**  
 * @ClassSubJect 구매 계약 Controller
 * @Class Name : EpuCntController.java
 * @Description : 구매 계약을 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/02/10   이영희          최초생성
 * 
 * @author 이영희
 * @since 2023/02/10
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class EpuCntController {
	@Resource(name="epuCntService")
	private EpuCntService cntService;
}
