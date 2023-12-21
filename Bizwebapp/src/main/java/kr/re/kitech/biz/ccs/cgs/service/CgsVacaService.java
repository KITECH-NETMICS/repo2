package kr.re.kitech.biz.ccs.cgs.service;

import kr.re.kitech.biz.api.server.vo.biz.CgsAnnlHoliVo;

/**  
 * @ClassSubJect 연차 일괄 생성 서비스 로직
 * @Class Name : CgsVacaService.java
 * @Description : 연차 일괄 생성 : 연수생(근로), 연구별정(단), 행정별정(단) 월차개념으로 부여 (전자결재 웹서비스에 의해 실행)
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/08/05		전재우			최초생성
 * 
 * @author 전재우
 * @since 2022/08/05
 * @version 1.0
 * @see
 * 
 */
public interface CgsVacaService {
	/**
	 * 연차를 일괄 생성한다.
	 * @param cgslappVo 휴가원 CgslappVo
	 * @return  휴가원 목록 List<CgslappVo>
	 * @throws Exception
	 */
	public void createYmHol(CgsAnnlHoliVo vo);
}
