package kr.re.kitech.biz.uss.bas.service;

import java.util.List;

import kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.UserVo;

/**
 * @ClassSubJect 
 * @ClassName : ComBasFWOpenApService.java
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
public interface ComBasFWOpenApService {

	/**
	 * 방화벽오픈신청 리스트 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return List<ComBasFWOpenInfoVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
	 */
	public List<ComBasFWOpenInfoVo> selectList(ComBasFWOpenInfoVo vo) throws KitechException;

    /**
	 * 방화벽오픈신청 정보 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
    public ComBasFWOpenInfoVo select(ComBasFWOpenInfoVo vo) throws KitechException;

    /**
	 * LDAP담당자 정보조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenAprVo
	 * @return List<UserVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
    public List<UserVo> selectManagerList(ComBasFWOpenInfoVo vo) throws KitechException;
    
    /**
	 * 방화벽오픈신청  정보 등록/결재요청
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
    public ComBasFWOpenInfoVo save(ComBasFWOpenInfoVo vo) throws KitechException;
    
    /**
	 * 방화벽오픈신청 정보 삭제
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
    public void delete(ComBasFWOpenInfoVo vo) throws KitechException;
  
	/**
	 * 방화벽오픈신청 전자결제 처리(화면)
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	public void formConfirm(ComBasFWOpenInfoVo vo) throws KitechException;

	/**
	 * 방화벽오픈신청 전자결제 반려(화면)
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	public void formReject(ComBasFWOpenInfoVo vo) throws KitechException;    
	
	
}
