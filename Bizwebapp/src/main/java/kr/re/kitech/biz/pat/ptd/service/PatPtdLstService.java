package kr.re.kitech.biz.pat.ptd.service;

import java.util.List;

import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstListVo;
import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 
 * @ClassName : PatPtdLstService.java
 * @Description : 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      이대훈    최초생성
 * 
 * @author 이대훈
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
public interface PatPtdLstService {
  
  /**
   * 출원업무대기함 업무공통탭 조회
   * 
   * @author 이대훈
   * @param PatPtdLstVo
   * @return List<PatPtdLstVo>
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<PatPtdLstVo> selectList01(PatPtdLstVo vo) throws KitechException;

 
  /**
   * 출원업무 BPM 처리
   * 
   * @author user
   * @param PatPtdLstListVo
   * @return int
   * @throws Exception
   * @since 2023.08.31.   
   */
  public int bpmProcess(PatPtdLstListVo vo) throws Exception;

}
