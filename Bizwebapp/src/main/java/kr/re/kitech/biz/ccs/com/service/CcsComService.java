package kr.re.kitech.biz.ccs.com.service;

import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;

/**  
 * @ClassSubJect 총무보안 공통 관련 처리를 담당하는 인터페이스
 * @Class Name : CcsComService.java
 * @Description : 총무보안 공통 관련 처리를 담당하는 인터페이스
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
public interface CcsComService {
	
	public Object selectAuth(Object cwsCommVo);
	
	/**
    *  휴가원 증빙자료 결재정보 저장
    */
	public void saveApr(AprVo vo);
	
	/**
    *  휴가원 증빙자료 반려
    */
	public void saveAprReject(AprScVo vo);
	/**
    *  담당자 반려
    */
	public void saveAprAuthReject(AprScVo vo);	
}
