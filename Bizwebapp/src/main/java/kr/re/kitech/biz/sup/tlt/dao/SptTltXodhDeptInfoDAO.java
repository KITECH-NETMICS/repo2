package kr.re.kitech.biz.sup.tlt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.tlt.vo.SptTltXodhDeptInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 부서 DAO
 * @Class Name SptTltXodhDeptInfoDAO.java
 * @Description 부서 관련 처리를 담당하는 DAO
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
@Repository("sptTltXodhDeptInfoDAO")
public class SptTltXodhDeptInfoDAO extends BizDefaultAbstractDAO {
  
	/**
	 * 부서 목록
	 * @author 손태화
	 * @param 
	 * @return List<SptTltXodhDeptInfoVo> 부서 목록
	 * @throws KitechException 공통예외
	 */
  @SuppressWarnings("unchecked")
  public List<SptTltXodhDeptInfoVo> selectSptTltXodhDeptList(SptTltXodhDeptInfoVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.tlt.selectSptTltXodhDeptList", vo);
  }

}
