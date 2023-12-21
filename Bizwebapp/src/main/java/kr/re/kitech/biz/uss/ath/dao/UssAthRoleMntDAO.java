package kr.re.kitech.biz.uss.ath.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.uss.ath.vo.XomxUserScrnAuthVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**  
 * @ClassSubJect 권한관리(롤관리,사용자관리)
 * @Class Name UssAthRoleMntDAO.java
 * @Description 권한관리(롤관리,사용자관리) 관련 처리를 담당하는DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/11/22   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/11/22
 * @version 1
 * @see
 * 
 */
@Repository("ussAthRoleMntDAO")
public class UssAthRoleMntDAO extends BizDefaultAbstractDAO {
	/**
	* 사용자권한 서비스정보 삭제 
	* @param String sysPayNo
	* @return int
	* @throws Exception
	*/
	public int deleteXomxUserScrnAuth(String sysPayNo) throws KitechException{
		return delete("kr.re.kitech.biz.uss.ath.deleteXomxUserScrnAuth", sysPayNo);
	}
	
	/**
	* 사용자권한 서비스정보 저장
	* @param XomxUserScrnAuthVo
	* @return int
	* @throws Exception
	*/
	public int mergeXomxUserScrnAuth(XomxUserScrnAuthVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.uss.ath.mergeXomxUserScrnAuth", vo);
	}
}
