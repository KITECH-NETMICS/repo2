package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo;

/**
 * @ClassSubJect : 인장사용관리 service interface
 * @Class Name : CgsSignUseService.java
 * @Description : 직인/인감 날인 신청 서비스
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
public interface CgsSignUseService {
  
  /**
   * 날인신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return List<CgsSignUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSignUseVo> selectList(CgsSignUseVo vo) throws ElException;

  /**
   * 날인신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsSignUseVo selectSingle(CgsSignUseVo vo) throws ElException;
  
  /**
   * 날인신청 등록
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws Exception
   * @since 2023.08.30.   
   */
  public CgsSignUseVo insertItem(CgsSignUseVo vo) throws Exception;

  /**
   * 날인신청 수정
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  public int updateItem(CgsSignUseVo vo) throws Exception;

  /**
   * 날인신청 삭제
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  public int deleteItem(CgsSignUseVo vo) throws Exception;

  /**
   * 날인신청 주소 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return CgsSignUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsSignUseVo selectAddr(CgsSignUseVo vo) throws ElException;
  
  /**
   * 날인신청관리 목록 조회
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return List<CgsSignUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSignUseVo> selectListMnt(CgsSignUseVo vo) throws ElException;

  /**
   * 날인신청관리 수정
	 * 
	 * @author lsh
   * @param CgsSignUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  public int updateItemMnt(List<CgsSignUseVo> listVo) throws Exception;
}
