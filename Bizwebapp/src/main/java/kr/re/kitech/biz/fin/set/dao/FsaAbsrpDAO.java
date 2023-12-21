package kr.re.kitech.biz.fin.set.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 연구비집행내역 테이블 조회 DAO
 * @Class Name : FsaAbsrpDAO.java
 * @Description : 연구비집행(내부인건비, 간접비, 학생이건비 등) 관련
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
@Repository("fsaAbsrpDAO")
public class FsaAbsrpDAO extends BizDefaultAbstractDAO {
  
 
  /**
   * 학생인건비 추가흡수 및 흡수취소 결의 조회
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<FsaAbsrpVo> selectResStuCostAbsrpSlip(FsaAbsrpVo vo) throws KitechException {
    return list("kr.re.kitech.biz.fin.set.selectResStuCostAbsrpSlipSS01", vo);
  }
   
   /**
   * 학생인건비 추가흡수 및 흡수취소 결의 조회
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public FsaAbsrpVo selectFsaAbsrpMaxOdr(FsaAbsrpVo vo) throws KitechException {
    return (FsaAbsrpVo) selectByPk("kr.re.kitech.biz.fin.set.selectFsaAbsrpMaxOdrSS01", vo);
  }
  
  /**
   * 학생인건비 흡수취소를 위한 기흡수 내역 조회
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public List<FsaAbsrpVo> selectFsaAbsrpBfSlip(FsaAbsrpVo vo) throws KitechException {
    return list("kr.re.kitech.biz.fin.set.selectResStuCostAbsrpSlipSS02", vo);
  }
  
  /**
   * 연구비집행 테이블 데이터 삭제
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public int deleteFsaAbsrpByUnslipNo(FsaAbsrpVo vo) throws KitechException {
    return delete("kr.re.kitech.biz.fin.set.deleteFsaAbsrpByUnslipNo", vo);
  }
  
  /**
   * 연구비 집행 테이블 데이터 수정
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.30.   
   */
  public int updateFsaAbsrpByUnslipNo(FsaAbsrpVo vo) throws KitechException {
    return update("kr.re.kitech.biz.fin.set.updateFsaAbsrpByUnslipNo", vo);
  }
  
  /**
   * 연구비 집행 테이블 데이터 입력
   * 
   * @author 이민기
   * @param ResStuCostTrnsVo
   * @return FsaAbsrpVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public int insertFsaAbsrpByUnslipNo(FsaAbsrpVo vo) throws KitechException {
    return insert("kr.re.kitech.biz.fin.set.insertFsaAbsrp", vo);
  }
 
}
