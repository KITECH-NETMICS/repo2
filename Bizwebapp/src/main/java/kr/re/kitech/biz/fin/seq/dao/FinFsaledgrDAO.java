package kr.re.kitech.biz.fin.seq.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.inswave.elfw.exception.ElException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.fin.seq.vo.FinFsaledgrVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 합계잔액시산표
 * @ClassName : FinFsaledgrDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.26.    이지훈    최초생성
 * 
 * @author 이지훈
 * @since 2023.09.26.
 * @version 1.0
 * @see
 * 
 */
@Repository("finFsaledgrDAO")
public class FinFsaledgrDAO extends BizDefaultAbstractDAO {
  
  /**
   * 다건 조회
   * 
   * @author 이지훈
   * @param FinFsaledgrVo
   * @return List<FinFsaledgrVo>
   * @throws KitechException
   * @since 2023.09.26.   
   */
  public List<FinFsaledgrVo> selectList01(FinFsaledgrVo vo) throws KitechException {
    return (List<FinFsaledgrVo>)list("kr.re.kitech.biz.fin.seq.selectFinFsaledgr", vo);
  }




}
