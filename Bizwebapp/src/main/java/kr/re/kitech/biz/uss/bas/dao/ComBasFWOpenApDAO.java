package kr.re.kitech.biz.uss.bas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : ComBasFWOpenApDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
@Repository("comBasFWOpenApDAO")
public class ComBasFWOpenApDAO extends BizDefaultAbstractDAO {

	/**
	 * 방화벽오픈신청 리스트 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return List<ComBasFWOpenInfoVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
	 */
	public List<ComBasFWOpenInfoVo> selectList(ComBasFWOpenInfoVo vo) throws KitechException {
		return (List<ComBasFWOpenInfoVo>)list("kr.re.kitech.biz.com.bas.selectComBasAplyDocList", vo);
	}

	/**
	 * 방화벽오픈신청 정보 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	 public ComBasFWOpenInfoVo select(ComBasFWOpenInfoVo vo) throws KitechException {
	   return (ComBasFWOpenInfoVo) selectByPk("kr.re.kitech.biz.com.bas.selectComBasFWOpen", vo);
	 }  

	 /**
	 * 방화벽오픈신청 등록
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int insert(ComBasFWOpenInfoVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.com.bas.insertComBasFWOpen", vo);
	 }	 

	 /**
	 * 방화벽오픈신청 수정
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int update(ComBasFWOpenInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.com.bas.updateComBasFWOpen", vo);
	 }
	
	 /**
	 * 방화벽오픈신청 삭제
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int delete(ComBasFWOpenInfoVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.com.bas.deleteComBasFWOpen", vo);
	 }	
	 
	 
	/**
	 * 정보자원신청서 등록 정보 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	 public ComBasFWOpenInfoVo selectComBasAplyDoc(ComBasFWOpenInfoVo vo) throws KitechException {
	   return (ComBasFWOpenInfoVo) selectByPk("kr.re.kitech.biz.com.bas.selectComBasAplyDoc", vo);
	 }  	 
	 
	 /**
	 * 정보자원신청서 등록
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int insertComBasAplyDoc(ComBasFWOpenInfoVo vo) throws KitechException {
	   return insert("kr.re.kitech.biz.com.bas.insertComBasAplyDoc", vo);
	 }	
	 
	 /**
	 * 정보자원신청서 수정
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int updateComBasAplyDoc(ComBasFWOpenInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.com.bas.updateComBasAplyDoc", vo);
	 }
	
	 /**
	 * 정보자원신청서 삭제
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int deleteComBasAplyDoc(ComBasFWOpenInfoVo vo) throws KitechException {
	   return delete("kr.re.kitech.biz.com.bas.deleteComBasAplyDoc", vo);
	 }	
	 
	 /**
	 * 정보자원신청서 시스템담당자 수정
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.19.   
      */
	 public int updateComBasAplyDocCharg(ComBasFWOpenInfoVo vo) throws KitechException {
	   return update("kr.re.kitech.biz.com.bas.updateComBasAplyDocCharg", vo);
	 }	  	 	 
}
