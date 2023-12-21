package kr.re.kitech.biz.sup.tec.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.tec.vo.SptZeusResvDtlVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원 제우스 연계 DAO
 * @Class Name SptZeusResvDAO.java
 * @Description 기술지원 제우스 연계 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/21   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/21
 * @version 1
 * @see
 * 
 */

@Repository("sptZeusResvDAO")
public class SptZeusResvDAO extends BizDefaultAbstractDAO{
	/**
     * 제우스 장비예약 상세 정보 확인
     * @param String resvNo
     * @return SptZeusResvDtlVo
     * @throws Exception
     */
	public SptZeusResvDtlVo selectSptZeusResvDtl(String resvNo) throws KitechException{
		return (SptZeusResvDtlVo)selectByPk("kr.re.kitech.biz.sup.tec.selectSptZeusResvDtl", resvNo);
	}
}
