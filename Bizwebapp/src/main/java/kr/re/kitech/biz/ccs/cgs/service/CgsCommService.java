package kr.re.kitech.biz.ccs.cgs.service;

/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 인터페이스
 * @Class Name : CwsOutWorkService.java
 * @Description : 재택근무신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
public interface CgsCommService {
	
	public Object selectEmp(Object cwsCommVo);
	
}
