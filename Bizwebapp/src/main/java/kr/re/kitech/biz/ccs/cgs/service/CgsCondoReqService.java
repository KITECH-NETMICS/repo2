package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo;
/**
 * @ClassSubJect : 콘도신청 service interface
 * @Class Name : CgsCondoReqService.java
 * @Description : 콘도신청 서비스 인터페이스
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
public interface CgsCondoReqService {
  
  /**
   * 콘도신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return List<CgsCondoReqVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsCondoReqVo> selectList(CgsCondoReqVo vo) throws ElException;

  /**
   * 콘도신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return CgsCondoReqVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsCondoReqVo selectItem(CgsCondoReqVo vo) throws ElException;

  /**
   * 콘도신청 등록
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return CgsCondoReqVo
   * @throws Exception
   * @since 2023.08.30.   
   */
  public CgsCondoReqVo insertItem(CgsCondoReqVo vo) throws Exception;

  /**
   * 콘도신청 신청상태 수정(취소, 취소확정, 예약확정, 승인, 반려)
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return void
   * @throws Exception
   * @since 2023.08.30.   
   */
  public void updateReqState(CgsCondoReqVo vo) throws Exception;

  /**
   * 콘도신청 삭제
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return void
   * @throws Exception
   * @since 2023.08.30.   
   */
  public void deleteItem(CgsCondoReqVo vo) throws Exception;
  
  /**
   * 콘도신청 지역명 조회
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return List<CgsCondoReqVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsCondoReqVo> selectCondoRegion(CgsCondoReqVo vo) throws ElException;
  
  /**
   * 콘도신청 콘도명 조회
	 * 
	 * @author lsh
   * @param CgsCondoReqVo
   * @return List<CgsCondoReqVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsCondoReqVo> selectCondoNm(CgsCondoReqVo vo) throws ElException;

  /**
   * 콘도신청관리 목록 조회
   * 
   * @author lsh
   * @param CgsCondoReqVo
   * @return List<CgsCondoReqVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsCondoReqVo> selectListCondoReqMnt(CgsCondoReqVo vo) throws ElException;

  /**
   * 콘도신청관리 수정
   * 
   * @author lsh
   * @param List<CgsCondoReqVo>
   * @return void
   * @throws ElException
   * @since 2023.08.30.   
   */
  public void updateCondoReqMnt(List<CgsCondoReqVo> vo) throws ElException;
}

