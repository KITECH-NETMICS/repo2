package kr.re.kitech.biz.pat.req.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.req.vo.PatAppRightVo;
import kr.re.kitech.biz.pat.req.vo.PatResLstVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("patAppRightDAO")
  public class PatAppRightDAO extends BizDefaultAbstractDAO {
  
  /**
    * 지재권 권리유지신청 주발명자 상세조회
    * @author 
    * @since 2023.08.11.
    */
  public PatAppRightVo selectItem01(PatAppRightVo vo) throws ElException {
    return (PatAppRightVo) selectByPk("kr.re.kitech.biz.pat.req.selectPatRightMntSS02", vo);
  }

    /**
    * 과제 검색
    * @author 
    * @since 2023.08.11.
    */
    public List<PatResLstVo> selectList01(PatResLstVo vo) throws ElException {
      return (List<PatResLstVo>)list("kr.re.kitech.biz.pat.req.selectPatResLstMS01", vo);
    }
    
}
