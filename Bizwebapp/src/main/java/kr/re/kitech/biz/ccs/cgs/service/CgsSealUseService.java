package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo;

/**
 * @ClassSubJect : 직인/인감신청 관리 service interface
 * @Class Name : CgsSealUseService.java
 * @Description : 직인/인감신청 서비스
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
public interface CgsSealUseService {
  
  /**
   * 직인/인감신청 목록 조회
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return List<CgsSealUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSealUseVo> selectList(CgsSealUseVo vo) throws ElException;
  
  /**
   * 사용(직인/인감)인수증 목록조회(팝업)
 	 * 
 	 * @author lsh
   * @param  CgsSealUseVo
   * @return List<CgsSealUseVo>
   * @throws ElException
   * @since 2023.08.30.   
   */
  public List<CgsSealUseVo> selectListPop(CgsSealUseVo vo) throws ElException;

  /**
   * 직인/인감신청 상세 조회
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return CgsSealUseVo
   * @throws ElException
   * @since 2023.08.30.   
   */
  public CgsSealUseVo selectItem(CgsSealUseVo vo) throws ElException;

  /**
   * 직인/인감신청 등록
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return CgsSealUseVo
   * @throws Exception
   * @since 2023.08.30.   
   */
  public CgsSealUseVo saveItem(CgsSealUseVo vo) throws Exception;

  /**
   * 사용(직인/인감)인수증 수정(팝업)
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return int
   * @throws Exception
   * @since 2023.08.30.   
   */
  public int updateItemPop(CgsSealUseVo vo) throws Exception;

  /**
   * 직인/인감신청 삭제
	 * 
	 * @author lsh
   * @param  CgsSealUseVo
   * @return void
   * @throws Exception
   * @since 2023.08.30.   
   */
  public void deleteItem(CgsSealUseVo vo) throws Exception;

}
