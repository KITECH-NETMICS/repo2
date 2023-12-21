package kr.re.kitech.biz.pat.mnt.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("patRightMngDAO")
  public class PatRightMngDAO extends BizDefaultAbstractDAO {
  
  /**
    * 권리 유지 관리자 조회
    * @author 
    * @since 2023.08.07.
    */
  public List<PatRightMngVo> selectList(PatRightMngVo vo) throws ElException {
    return (List<PatRightMngVo>)list("kr.re.kitech.biz.pat.mnt.selectPatRightMng", vo);
  }

  /**
    * 관리번호 검색
    * @author 
    * @since 2023.08.07.
    */
  public PatRightMngVo selectPatMastrMS05(PatRightMngVo vo) throws ElException {
    return (PatRightMngVo) selectByPk("kr.re.kitech.biz.pat.mnt.selectPatMastrMS05", vo);
  }

  /**
    * 지식재산권 포기 등록
    * @author 
    * @since 2023.08.07.
    */
  public int insertPatGiveUpSI01(PatRightMngVo vo) throws ElException {
    return insert("kr.re.kitech.biz.pat.mnt.insertPatGiveUpSI01", vo);
  }

  /**
    * todo 검색
    * @author 
    * @since 2023.08.07.
    */
  public PatRightMngVo selectPatTodoSS01(PatRightMngVo vo) throws ElException {
    return (PatRightMngVo) selectByPk("kr.re.kitech.biz.pat.mnt.selectPatTodoSS01", vo);
  }

  /**
    * 포기 시 todo 데이터 삭제
    * @author 
    * @since 2023.08.07.
    */
  public int updatePatPtsTodoSU01(PatRightMngVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.mnt.updatePatPtsTodoSU01", vo);
  }

  /**
    * 지식재산권 포기 수정
    * @author 
    * @since 2023.08.07.
    */
  public int updatePatGiveUpSU01(PatRightMngVo vo) throws ElException {
    return update("kr.re.kitech.biz.pat.mnt.updatePatGiveUpSU01", vo);
  }

}
