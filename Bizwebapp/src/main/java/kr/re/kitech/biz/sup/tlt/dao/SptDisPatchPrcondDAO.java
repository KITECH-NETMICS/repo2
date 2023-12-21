package kr.re.kitech.biz.sup.tlt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.tlt.vo.SptDisPatchPrcondVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기업 목록 DAO
 * @Class Name SptDisPatchPrcondDAO.java
 * @Description 기업 목록 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/14   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/14
 * @version 1
 * @see
 * 
 */
@Repository("sptDisPatchPrcondDAO")
public class SptDisPatchPrcondDAO extends BizDefaultAbstractDAO {
  
  /**
   * 기업 목록
   * @author 손태화
   * @param SptDisPatchPrcondVo 검색 : 사용자(작성자)
   * @return List<SptDisPatchPrcondVo 기업 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptDisPatchPrcondVo> selectSptDisPatchPrcondList(SptDisPatchPrcondVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.tlt.selectSptDisPatchPrcondList", vo);
  }

  /**
   * 기업 대상인원
   * @author 손태화
   * @param SptDisPatchPrcondVo 기업 목록
   * @return SptDisPatchPrcondVo 기업 대상인원 목록
   * @throws KitechException 공통예외
   */
  public SptDisPatchPrcondVo selectSptDisPatchPrcond(SptDisPatchPrcondVo vo) throws KitechException {
    return (SptDisPatchPrcondVo)selectByPk("kr.re.kitech.biz.sup.tlt.selectSptDisPatchPrcond", vo);
  }

}
