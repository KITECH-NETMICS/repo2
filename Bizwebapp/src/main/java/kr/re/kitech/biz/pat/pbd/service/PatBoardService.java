package kr.re.kitech.biz.pat.pbd.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.pbd.vo.PatFaqVo;
import kr.re.kitech.biz.pat.pbd.vo.PatFrmVo;
import kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo;
import kr.re.kitech.biz.pat.pbd.vo.PatQnaVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatNoticeService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.11.      작업자    최초생성
 * 
 * @author
 * @since 2023.09.11.
 * @version 1.0
 * @see
 * 
 */
public interface PatBoardService {
  
  /**
   * 모든 컬럼 조회
   * 
   * @author 
   * @param 
   * @return List<PatNoticeVo>
   * @throws KitechException
   * @since 2023.09.11.   
   */
  public List<PatNoticeVo> selectNoticeList(PatNoticeVo vo) throws KitechException;
  
  public List<PatFaqVo> selectFaqList(PatFaqVo vo) throws KitechException;
  
  public List<PatFrmVo> selectFrmList(PatFrmVo vo) throws KitechException;
  
  public List<PatQnaVo> selectQnaList(PatQnaVo vo) throws KitechException;
  
  public PatNoticeVo selectNoticeSingleItem(PatNoticeVo FndVo) throws ElException;
  
  public PatFaqVo selectFaqSingleItem(PatFaqVo FndVo) throws ElException;
  
  public PatFrmVo selectFrmSingleItem(PatFrmVo FndVo) throws ElException;
  
  public PatQnaVo selectQnaSingleItem(PatQnaVo FndVo) throws ElException;
  
  public PatQnaVo selectreqUserInfo(PatQnaVo FndVo) throws ElException;  
  // Insert
  public String saveNoticeItem(PatNoticeVo FndVo) throws ElException;
  // Insert
  public String saveFaqItem(PatFaqVo FndVo) throws ElException;
  // Insert
  public String saveFrmItem(PatFrmVo FndVo) throws ElException;
  // Insert
  public String saveQnaItem(PatQnaVo FndVo) throws ElException;
  // Insert
  public String saveSystemReq(PatQnaVo FndVo) throws ElException;  
  // Update
  public int updateNoticeItem(PatNoticeVo FndVo) throws ElException;
  // Update
  public int updateFaqItem(PatFaqVo FndVo) throws ElException;
  // Update
  public int updateFrmItem(PatFrmVo FndVo) throws ElException;
  // Update
  public int updateQnaItem(PatQnaVo FndVo) throws ElException;
  // Delete
  public int deleteNoticeItem(PatNoticeVo FndVo) throws ElException;
  // Delete
  public int deleteFaqItem(PatFaqVo FndVo) throws ElException;
  // Delete
  public int deleteFrmItem(PatFrmVo FndVo) throws ElException;
  // Delete
  public int deleteQnaItem(PatQnaVo FndVo) throws ElException;


}
  