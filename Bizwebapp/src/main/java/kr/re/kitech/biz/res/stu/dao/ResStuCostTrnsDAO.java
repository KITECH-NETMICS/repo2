package kr.re.kitech.biz.res.stu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo;
import kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 학생인건비 흡수/취소 메뉴 관련 DAO
 * @Class Name : FsaAbsrpDAO.java
 * @Description :  학생인건비 흡수/취소 메뉴 관련 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.29.      이민기    최초생성
 * 
 * @author 작업자
 * @since 2023.08.29.
 * @version 1.0
 * @see
 * 
 */
@Repository("resStuCostTrnsDAO")
public class ResStuCostTrnsDAO extends BizDefaultAbstractDAO {
  
 
  /**
   * 학생인건비 추가흡수 및 흡수취소 결의 조회
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<ResStuCostTrnsVo> selectResStuCostAbsrpSlipList(ResStuCostTrnsVo vo) throws KitechException {
    return list("kr.re.kitech.biz.res.stu.selectResStuCostTrnsMS01", vo);
  }
      
 /**
   * 학생인건비 추가흡수 계정상세 조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.09.6.   
   */
  public List<FsaAbsrpVo> selectResStuCostAbsrpSlipList(FsaAbsrpVo vo) throws KitechException {
    return list("kr.re.kitech.biz.res.stu.selectResStuCostTrnsMS02", vo);
  }
  
   /**
   * 학생인건비  이관대상 상세조회
   * 
   * @author 이민기
   * @param FsaAbsrpVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.09.6.   
   */
  public List<ResStuCostTrnsVo> selectResStuCostTrnsSlipList(ResStuCostTrnsVo vo) throws KitechException {
    return list("kr.re.kitech.biz.res.stu.selectResStuCostTrnsMS03", vo);
  }
}
