package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 학력사항변경신청 관련 인터페이스
 * @Class Name : HumApyEduService.java
 * @Description : 학력사항변경신청 관련 인터페이스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/31   석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/31
 * @version 1.0
 * @see
 * 
 */
public interface HumApyEduService {
	
	 /**
	 * 학력사항변경신청. 목록 조회
	 */
	public List<HumApyEduInfoVo> selectHumApyEduList(HumApyEduSrchVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 상세 조회
	 */
	public HumApyEduInfoVo selectHumApyEduInfo(HumApyEduSrchVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 변경전 학력사항 조회
	 */
	public List<HumApyEduInfoVo> selectHumApyEduInfoBefore(HumApyEduSrchVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 변경후 학력사항 조회
	 */
	public List<HumApyEduInfoVo> selectHumApyEduInfoAfter(HumApyEduSrchVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 신청서 삭제
	 */
	public void deleteHumApyEdu(HumApyEduSrchVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 저장, 결재신청
	 */
	public String saveHumApyEdu(HumApyEduListVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 반려
	 */
	public void formReject(HumApyEduInfoVo vo) throws KitechException;

	 /**
	 * 학력사항변경신청. 처리
	 */
	public void formAccept(HumApyEduListVo vo) throws KitechException;

}
