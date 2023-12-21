package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 법인증명서발급신청 interface 
 * @Class Name : CgsCertfUseService.java
 * @Description : 법인증명서발급신청 interface
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
public interface CgsCertfUseService {
  
  /**
   * 법인증명서발급신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return List<CgsCertfUseVo>
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public List<CgsCertfUseVo> selectList(CgsCertfUseVo vo) throws KitechException;

  /**
   * 법인증명서발급신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return CgsCertfUseVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public CgsCertfUseVo selectItem(CgsCertfUseVo vo) throws KitechException;

  
  /**
   * 법인증명서발급신청 등록
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public CgsCertfUseVo insertItem(CgsCertfUseVo vo) throws KitechException;
  
  /**
   * 법인증명서발급신청 삭제
   * 
   * @author lsh
   * @param CgsCertfUseVo
   * @return void
   * @throws KitechException
   * @since 2023.08.31.   
   */
  public void deleteItem(CgsCertfUseVo vo) throws KitechException;
  
 /**
  * 주소 조회
  * 
  * @author lsh
  * @param CgsCertfUseVo
  * @return List<CgsCertfUseVo>
  * @throws KitechException
  * @since 2023.08.31.   
  */
  public CgsCertfUseVo selectAddr(CgsCertfUseVo vo) throws KitechException;
}
