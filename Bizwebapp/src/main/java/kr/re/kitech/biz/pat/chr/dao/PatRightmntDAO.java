package kr.re.kitech.biz.pat.chr.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.pat.chr.vo.PatRightmntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("patRightmntDAO")
  public class PatRightmntDAO extends BizDefaultAbstractDAO {
  
  /**
    * 권리유지내역 다건 조회
    * @author 
    * @since 2023.08.02.
    */
  public List<PatRightmntVo> selectList(PatRightmntVo vo) throws ElException {
    return (List<PatRightmntVo>)list("kr.re.kitech.biz.pat.chr.selectPatRightmnt", vo);
  }

}
