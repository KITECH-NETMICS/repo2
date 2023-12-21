package kr.re.kitech.biz.sup.par.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.par.vo.SptParCustChargVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 담당자 목록 정보 DAO
 * @Class Name SptParCustChargDAO.java
 * @Description 담당자 목록 정보 관련 처리를 담당하는 DAO
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
@Repository("sptParCustChargDAO")
public class SptParCustChargDAO extends BizDefaultAbstractDAO {
  
  /**
   * 파트너기업유지심사서 상세 조회2
   * @author 손태화
   * @param SptParCustChargVo 상세조회 : 파트너기업지정번호
   * @return List<SptParCustChargVo> 담당자 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptParCustChargVo> selectSptParCustChargList(SptParCustChargVo vo) throws KitechException {
	  return list("kr.re.kitech.biz.sup.par.selectSptParCustChargList",vo);
  }
  
  /**
   * 담당자 목록 삭제
   * @author 손태화
   * @param SptParCustChargVo 파트너기업지정번호
   * @return 
   * @throws KitechException 공통예외
   */
  public int deletePartSptParCustCharg(SptParCustChargVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.sup.par.deletePartSptParCustCharg",vo);
  }
  
  /**
   * 담당자 목록 등록(수정)
   * @author 손태화
   * @param SptParCustChargVo 담당자 목록
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeSptParCustCharg(SptParCustChargVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.sup.par.mergeSptParCustCharg",vo);
  }

}
