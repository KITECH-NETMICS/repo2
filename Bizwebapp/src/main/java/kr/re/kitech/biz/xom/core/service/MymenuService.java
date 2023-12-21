package kr.re.kitech.biz.xom.core.service;

import java.util.List;

import kr.re.kitech.biz.xom.core.vo.MymenuVo;

/**  
 * @ClassSubJect 마이메뉴 관련 처리를 담당하는 인터페이스
 * @Class Name : MymenuService.java
 * @Description : 마이메뉴 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/08   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/03/08
 * @version 1.0
 * @see
 * 
 */
public interface MymenuService {
	
	/**
	 * 마이메뉴 페이징 처리하여 목록을 조회한다.
	 * @param mymenuVo 마이메뉴 MymenuVo
	 * @return  마이메뉴 목록 List<MymenuVo>
	 * @throws Exception
	 */
	public List<MymenuVo> selectListMymenu(MymenuVo mymenuVo) throws Exception;
	
	/**
	 * @param mymenuVo 마이메뉴 MymenuVo
	 * @return 조회한 마이메뉴 전체 카운트
	 * @throws Exception
	 */
	public long selectListCountMymenu(MymenuVo mymenuVo) throws Exception;
	
	/**
	 * @param mymenuVo 마이메뉴 MymenuVo
	 * @return 계층형 마이메뉴 조회
	 * @throws Exception
	 */
	public List<MymenuVo> selectListClassMymenu(MymenuVo mymenuVo) throws Exception;
	
	/**
	 * 마이메뉴 상세조회를 한다.
	 * @param mymenuVo 마이메뉴 MymenuVo
	 * @return 사원상세정보 MymenuVo
	 * @throws Exception
	 */
	public MymenuVo selectMymenu(MymenuVo mymenuVo) throws Exception;
		
	/**
	 * 마이메뉴를 등록한다.
	 * @param mymenuVo 마이메뉴 MymenuVo
	 * @return 사번
	 * @throws Exception
	 */
	public int insertMymenu(MymenuVo mymenuVo) throws Exception;
	
	/**
	 * 마이메뉴를 삭제한다.
	 * @param mymenuVo 마이메뉴 MymenuVo
	 * @throws Exception
	 */
	public int deleteMymenu(MymenuVo mymenuVo) throws Exception;
	
	/**
	 * 마이메뉴를 저장한다.
	 * @param mymenuVo 사원정보 MymenuVo
	 * @throws Exception
	 */
	public int saveMymenu(MymenuVo mymenuVo) throws Exception;

	/**
	 * 마이메뉴목록을 저장한다.
	 * @param mymenuVoList 마이메뉴 목록 List<MymenuVo>
	 * @throws Exception
	 */
	public int saveMymenuList(List<MymenuVo> mymenuVoList) throws Exception;
	
	/**
	 * 별 아이콘을 클릭해 마이메뉴목록을 저장한다.
	 * @param mymenuVoList 마이메뉴 목록 List<MymenuVo>
	 * @throws Exception
	 */
	public int saveMymenuAstar(List<MymenuVo> mymenuList) throws Exception;
	
}
