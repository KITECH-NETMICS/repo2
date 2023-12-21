package kr.re.kitech.biz.pat.ptr.service;

import java.util.List;

import kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPtrRevInvService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      이대훈    최초생성
 * 
 * @author
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
public interface PatPtrRevInvService {
  
  /**
   * 발명신고서 서지사항 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public PatPtrRevInvVo selectItem01(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 선행기술조사서 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  public PatPtrRevInvVo selectItem02(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 선행기술조사 보완요청 보완요청결과 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem03(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 선행기술조사 의뢰 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem04(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 선행기술조사서 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem05(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 선행기술조사서 의뢰내용 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  public PatPtrRevInvVo selectItem06(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 보완요청 select box 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return List<PatPtrRevInvVo>
   * @throws KitechException
   * @since 2023.09.11.   
   */
  public List<PatPtrRevInvVo> selectList01(PatPtrRevInvVo vo) throws KitechException;


  /**
   * 지식재산권 첨부파일 수정
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.11.   
   */
  public int updateAttachmentFilesBySrhId(PatPtrRevInvVo vo) throws KitechException;

  
  /**
   * 선행기술조사서 검토 결과 등록
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @throws Exception 
   * @since 2023.09.07.   
   */
  public int insertPtrRevInv(PatPtrRevInvVo vo) throws KitechException, Exception;

  
  /**
   * 선행기술조사서 의뢰
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @throws Exception 
   * @since 2023.09.07.   
   */
  public int insertPtrReqInv(PatPtrRevInvVo vo) throws KitechException, Exception;

}
  