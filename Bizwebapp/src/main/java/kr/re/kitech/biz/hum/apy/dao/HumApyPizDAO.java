package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyPizInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPizSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 포상경력신청 관련 DAO
 * @Class Name : HumApyPizService.java
 * @Description : 포상경력신청 관련 DAO
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
@Repository("humApyPizDAO")
public class HumApyPizDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 포상경력신청. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyPizInfoVo> selectHumApyPizList(HumApyPizSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyPizList", vo);
	}

    /**
     * 포상경력신청. 상세 조회
     */
	public HumApyPizInfoVo selectHumApyPizInfo(HumApyPizSrchVo vo) throws KitechException {
		return (HumApyPizInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyPizInfo", vo);
	}

    /**
     * 포상경력신청. 저장
     */
	public void insertHumApyPiz(HumApyPizInfoVo vo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyPiz", vo);
	}

    /**
     * 포상경력신청. 수정
     */
	public void updateHumApyPiz(HumApyPizInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyPiz", vo);
	}

    /**
     * 포상경력신청. 삭제
     */
	public void deleteHumApyPiz(HumApyPizInfoVo vo) {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyPiz", vo);
	}






}
