package kr.re.kitech.biz.sup.par.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.par.vo.SptParBaseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 파트너기업 정보 DAO
 * @Class Name SptParBaseDAO.java
 * @Description 파트너기업 정보 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/28   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/28
 * @version 1
 * @see
 * 
 */
@Repository("sptParBaseDAO")
public class SptParBaseDAO extends BizDefaultAbstractDAO {
  
  /**
   * 파트너기업유지심사서 상세 조회2
   * @author 손태화
   * @param SptParBaseVo 상세조회 : 파트너기업지정번호
   * @return SptParBaseVo 파트너기업 정보
   * @throws KitechException 공통예외
   */
  public SptParBaseVo selectSptBaseDetail(SptParBaseVo vo) throws KitechException {
	  return (SptParBaseVo)selectByPk("kr.re.kitech.biz.sup.par.selectSptBaseDetail",vo);
  }

}
