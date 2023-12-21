package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
/**
 * @ClassSubJect : 콘도신청 DAO
 * @Class Name : CgsCondoReqDAO.java
 * @Description : 콘도신청 DAO
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Repository("cgsCondoReqDAO")
public class CgsCondoReqDAO extends BizDefaultAbstractDAO {
  
   /**
    * 콘도신청 목록 조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return List<CgsCondoReqVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    public List<CgsCondoReqVo> selectListCondoReq(CgsCondoReqVo vo) throws ElException {
      return (List<CgsCondoReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCondoReq", vo);
    }
    
   /**
    * 콘도신청 상세 조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return CgsCondoReqVo
    * @throws ElException
    * @since 2023.08.30.   
    */
    public CgsCondoReqVo selectCondoReq(CgsCondoReqVo vo) throws ElException {
      return (CgsCondoReqVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCondoReq", vo);
    }
    
   /**
    * 콘도신청 등록
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return int
    * @throws ElException
    * @since 2023.08.30.   
    */
    public int insertItem(CgsCondoReqVo vo) throws ElException {
      return insert("kr.re.kitech.biz.ccs.cgs.insertCgsCondoReq", vo);
    }
    
   /**
    * 콘도신청 수정
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return int
    * @throws ElException
    * @since 2023.08.30.   
    */
    public int updateItem(CgsCondoReqVo vo) throws ElException {
      return update("kr.re.kitech.biz.ccs.cgs.updateCondoReq", vo);
    }
    
   /**
    * 콘도신청 승인, 반려 처리시 수정 
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return void
    * @throws ElException
    * @since 2023.08.30.   
    */
    public void updateCondoReqReject(CgsCondoReqVo vo) throws ElException {
  	  update("kr.re.kitech.biz.ccs.cgs.updateCondoReqReject", vo);
    }
    
   /**
    * 콘도신청 예약취소,예약취소확정, 예약확정 수정
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return void
    * @throws ElException
    * @since 2023.08.30.   
    */
    public void updateCondoReqCancel(CgsCondoReqVo vo) throws ElException {
  	  update("kr.re.kitech.biz.ccs.cgs.updateCondoReqCancel", vo);
    }
    
   /**
    * 콘도신청 삭제
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return void
    * @throws ElException
    * @since 2023.08.30.   
    */
    public int deleteItem(CgsCondoReqVo vo) throws ElException {
      return delete("kr.re.kitech.biz.ccs.cgs.deleteCondoReq", vo);
    }
    
   /**
    * 콘도신청 지역명 목록조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return List<CgsCondoReqVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    public List<CgsCondoReqVo> selectCondoRegion(CgsCondoReqVo vo) throws ElException {
      return (List<CgsCondoReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectCondoRegion", vo);
    }
    
   /**
    * 콘도신청 콘도명 목록조회
 	 * 
 	 * @author lsh
    * @param CgsCondoReqVo
    * @return List<CgsCondoReqVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    public List<CgsCondoReqVo> selectCondoNm(CgsCondoReqVo vo) throws ElException {
  	  return (List<CgsCondoReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectCondoNm", vo);
    }
    
    /**
     * 콘도신청관리 목록 조회
     * 
     * @author lsh
     * @param CgsCondoReqVo
     * @return List<CgsCondoReqVo>
     * @throws ElException
     * @since 2023.08.30.   
     */
    public List<CgsCondoReqVo> selectListCondoReqMnt(CgsCondoReqVo vo) throws ElException {
    	return (List<CgsCondoReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCondoReqMnt", vo);
    }    
    
    /**
     * 콘도신청관리 수정
     * 
     * @author lsh
     * @param CgsCondoReqVo
     * @return void
     * @throws ElException
     * @since 2023.08.30.   
     */
    public void updateCondoReqMnt(CgsCondoReqVo vo) throws ElException {
    	update("kr.re.kitech.biz.ccs.cgs.updateCondoReqMnt", vo);
    }

}
