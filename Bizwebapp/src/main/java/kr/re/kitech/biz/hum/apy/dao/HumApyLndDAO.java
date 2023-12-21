package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyLndAccptVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 휴복직신청 관련 DAO
 * @Class Name : HumApyLndDAO.java
 * @Description : 휴복직신청 관련 DAO
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/15   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/15
 * @version 1.0
 * @see
 * 
 */
@Repository("humApyLndDAO")
public class HumApyLndDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 휴복직신청. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyLndInfoVo> selectHumApyLndList(HumApyLndSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyLndList", vo);
	}

	/**
	 * 휴복직신청. 상세조회
	 */
	public HumApyLndInfoVo selectHumApyLndInfo(HumApyLndSrchVo vo) throws KitechException {
		return (HumApyLndInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyLndInfo", vo);
	}

	/**
	 * 휴복직신청. 신청서 삭제
	 */
	public void deleteHumApyLnd(HumApyLndSrchVo vo) throws KitechException {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyLnd", vo);
	}
	
	/**
	 * 휴복직신청. 신청서 저장
	 */
	public void insertHumApyLnd(HumApyLndInfoVo vo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyLnd", vo);
	}
	
	/**
	 * 휴복직신청. 신청서 수정
	 */
	public void updateHumApyLnd(HumApyLndInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyLnd", vo);
	}
	
	/**
	 * 휴복직신청. 신청서 승인처리 후 insert정보(발령정보관리 입력)
	 */
	public void insertHumApyLndSuccessAccept(HumApyLndAccptVo insertVo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyLndSuccessAccept", insertVo);
	}




}
