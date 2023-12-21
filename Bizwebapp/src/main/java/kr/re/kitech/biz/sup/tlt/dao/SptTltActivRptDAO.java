package kr.re.kitech.biz.sup.tlt.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 활동보고서 DAO
 * @Class Name SptTltActivRptDAO.java
 * @Description 활동보고서 관련 처리를 담당하는 DAO
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
@Repository("sptTltActivRptDAO")
public class SptTltActivRptDAO extends BizDefaultAbstractDAO {
  
  /**
   * 활동보고서 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자 , 검색년월 , 작성여부
   * @return List<SptTltActivRptVo> 활동보고서 목록
   * @throws KitechException 공통예외
   */
  @SuppressWarnings("unchecked")
  public List<SptTltActivRptVo> selectSptTltActivRptList(SptTltActivRptVo vo) throws KitechException {
    return list("kr.re.kitech.biz.sup.tlt.selectSptTltActivRptList", vo);
  }
  
  /**
   * 기술지원직정보 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 참여기업
   * @return SptTltActivRptVo 기술지원직정보 목록
   * @throws KitechException 공통예외
   */
  public SptTltActivRptVo selectSkilHumBasIcInfo(SptTltActivRptVo vo) throws KitechException {
	  return (SptTltActivRptVo)selectByPk("kr.re.kitech.biz.sup.tlt.selectSkilHumBasIcInfo", vo);
  }

  /**
   * 활동보고서 상세 조회
   * @author 손태화
   * @param SptTltActivRptVo 상세조회 : 보고서번호
   * @return SptTltActivRptVo 활동보고서정보
   * @throws KitechException 공통예외
   */
  public SptTltActivRptVo selectSptTltActivRptDetail(SptTltActivRptVo vo) throws KitechException {
    return (SptTltActivRptVo)selectByPk("kr.re.kitech.biz.sup.tlt.selectSptTltActivRptDetail", vo);
  }

  /**
   * 중복건수 확인
   * @author 손태화
   * @param SptTltActivRptVo 상세조회 : 작성자 , 보고년월
   * @return int 중복건수
   * @throws KitechException 공통예외
   */
  public int selectSptTltActivRptCnt(SptTltActivRptVo sc) {
    return (int)super.selectByPk("kr.re.kitech.biz.sup.tlt.selectSptTltActivRptCnt", sc);
  }

  /**
   * 동일보고서 확인
   * @author 손태화
   * @param SptTltActivRptVo 상세조회 : 보고서번호
   * @return int 동일보고서수
   * @throws KitechException 공통예외
   */
  public int selectSptTltBasicRegCnt(SptTltActivRptVo sc) {
	  return (int)super.selectByPk("kr.re.kitech.biz.sup.tlt.selectSptTltBasicRegCnt", sc);
  }
    
  /**
   * 활동보고서 등록(수정)
   * @author 손태화
   * @param SptTltActivRptVo 활동보고서정보
   * @return 
   * @throws KitechException 공통예외
   */
  public int mergeSptTltActivRpt(SptTltActivRptVo vo) throws KitechException{
	  return update("kr.re.kitech.biz.sup.tlt.mergeSptTltActivRpt", vo);
  } 
  
  /**
   * 활동보고서 삭제
   * @author 손태화
   * @param SptTltActivRptVo 관리번호
   * @return  
   * @throws KitechException 공통예외
   */
  public int deleteSptTltActivRpt(SptTltActivRptVo vo) throws KitechException{
	  return delete("kr.re.kitech.biz.sup.tlt.deleteSptTltActivRpt", vo);
  } 

}
