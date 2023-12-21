package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 학력사항변경신청 관련 DAO
 * @Class Name : HumApyEduDAO.java
 * @Description : 학력사항변경신청 관련 DAO
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
@Repository("humApyEduDAO")
public class HumApyEduDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 학력사항변경신청. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyEduInfoVo> selectHumApyEduList(HumApyEduSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyEduList", vo);
	}

    /**
     * 학력사항변경신청. 상세 조회
     */
	public HumApyEduInfoVo selectHumApyEduInfo(HumApyEduSrchVo vo) throws KitechException {
		return (HumApyEduInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyEduInfo", vo);
	}

    /**
     * 학력사항변경신청. 변경전 학력사항 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyEduInfoVo> selectHumApyEduInfoBefore(HumApyEduSrchVo vo) {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyEduInfoBefore", vo);
	}

    /**
     * 학력사항변경신청. 변경전 학력사항 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyEduInfoVo> selectHumApyEduInfoAfter(HumApyEduSrchVo vo) {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyEduInfoAfter", vo);
	}

    /**
     * 학력사항변경신청. 신청서 정보 삭제
     */
	public void deleteHumApyEdu(HumApyEduSrchVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyEdu", vo);
	}

    /**
     * 학력사항변경신청. 신청서 정보 내 학력사항 정보 삭제
     */
	public void deleteHumApyEduAfter(HumApyEduSrchVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyEduAfter", vo);
	}

    /**
     * 학력사항변경신청. 신청서 기본 정보 저장 
     */
	public void insertHumApyEduInfo(HumApyEduInfoVo vo) {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyEduInfo", vo);
	}
	
	/**
	 * 학력사항변경신청. 신청서 기본 정보 수정
	 */
	public void updateHumApyEduInfo(HumApyEduInfoVo vo) {
		update("kr.re.kitech.biz.hum.apy.updateHumApyEduInfo", vo);
	}

    /**
     * 학력사항변경신청. 변경 후 학력사항 저장 
     */
	public void insertHumApyEduAfter(HumApyEduInfoVo vo) {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyEduAfter", vo);
	}

    /**
     * 학력사항변경신청. 변경전 학력사항 삭제
     */
	public void deleteHumApyEduInfoBefore(HumApyEduInfoVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyEduInfoBefore", vo);
	}		

    /**
     * 학력사항변경신청. 변경전 학력사항 저장
     */
	public void insertHumApyEduInfoBefore(HumApyEduInfoVo vo) {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyEduInfoBefore", vo);
	}

}
