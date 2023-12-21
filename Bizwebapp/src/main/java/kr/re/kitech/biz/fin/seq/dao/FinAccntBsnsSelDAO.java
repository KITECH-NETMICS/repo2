package kr.re.kitech.biz.fin.seq.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.fin.seq.vo.FinAccntBsnsSelVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 계정별사업수행현황
 * @ClassName : FinAccntBsnsSelDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.04.     이지훈     최초생성
 * 
 * @author 이지훈
 * @since 2023.10.04.
 * @version 1.0
 * @see
 * 
 */
@Repository("finAccntBsnsSelDAO")
public class FinAccntBsnsSelDAO extends BizDefaultAbstractDAO {
  
  /**
   * 다건 조회
   * 
   * @author 
   * @param FinAccntBsnsSelVo
   * @return List<FinAccntBsnsSelVo>
   * @throws KitechException
   * @since 2023.10.04.   
   */
  public List<FinAccntBsnsSelVo> selectList01(FinAccntBsnsSelVo vo) throws KitechException {
    return (List<FinAccntBsnsSelVo>)list("kr.re.kitech.biz.fin.seq.selectFinAccntBsnsSel", vo);
  }


}
