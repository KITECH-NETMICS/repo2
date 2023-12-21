/**
 * 
 */
package kr.re.kitech.biz.apr.service;

import java.util.List;

import kr.re.kitech.biz.apr.vo.AppFormVo;

/**  
 * @ClassSubJect 신청서양식함 관련 처리를 담당하는 인터페이스
 * @Class Name : AppFormService.java
 * @Description : 신청서양식함 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/06/09   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/06/09
 * @version 1.0
 * @see
 * 
 */
public interface FormBasicService {
	/**
    * 신청서양식함 목록 조회
    */
	public List<AppFormVo> selectAppForm(AppFormVo vo);
	
	/**
    * 신청서양식명 단건 조회
    */
	public AppFormVo getAppForm(AppFormVo vo);
}
