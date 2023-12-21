package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyPizInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPizSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 포상경력신청 관련 인터페이스
 * @Class Name : HumApyPizService.java
 * @Description : 포상경력신청 관련 인터페이스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/25   석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/25
 * @version 1.0
 * @see
 * 
 */
public interface HumApyPizService {
	
	 /**
	 * 포상경력신청. 목록 조회
	 */
	public List<HumApyPizInfoVo> selectHumApyPizList(HumApyPizSrchVo vo) throws KitechException;

	 /**
	 * 포상경력신청. 상세 조회
	 */
	public HumApyPizInfoVo selectHumApyPizInfo(HumApyPizSrchVo vo) throws KitechException;

	 /**
	 * 포상경력신청. 저장, 수정, 결재신청
	 */
	public String saveHumApyPiz(HumApyPizInfoVo vo) throws KitechException;

	 /**
	 * 포상경력신청. 삭제
	 */
	public void deleteHumApyPiz(HumApyPizInfoVo vo) throws KitechException;

	 /**
	 * 포상경력신청. 반려
	 */
	public void formReject(HumApyPizInfoVo vo) throws KitechException;

	 /**
	 * 포상경력신청. 처리
	 */
	public void formAccept(HumApyPizInfoVo vo) throws KitechException;

}
