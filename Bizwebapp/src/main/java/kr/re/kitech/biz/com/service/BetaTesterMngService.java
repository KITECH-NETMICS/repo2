package kr.re.kitech.biz.com.service;

import java.util.List;

import kr.re.kitech.biz.com.vo.BetaTesterListVo;
import kr.re.kitech.biz.com.vo.BetaTesterVo;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;

/**
 * 업무의 양식함/제약/이중화 관리 서비스
 *
 * @author 홍성민
 * @since 2023. 5. 10.
 */
public interface BetaTesterMngService {

	/**
	 * 검색 구분에 따른 리스트 조회
	 * 
	 * @param vo
	 * @return
	 */
	public List<BetaTesterVo> selectBusinessServices(BetaTesterVo vo) throws Exception;
	
	/**
	 * 특정 메뉴의 베타테스터 리스트 조회
	 * 
	 * @param vo
	 * @return
	 */
	public List<BetaTesterVo> selectBetaTester(BetaTesterVo vo) throws Exception;
	
	/**
	 * 특정 메뉴의 베타 구분을 저장한다.
	 * 
	 * @param vo
	 */
	public void updateBetaServiceYN(BetaTesterVo vo) throws Exception;

	/**
	 * 특정 메뉴의 베타 테스터를 저장한다.
	 * 
	 * @param vo
	 */
	public void saveBetaTester(BetaTesterVo vo) throws Exception;
	
		/**
	 * 특정 메뉴의 베타 테스터를 삭제한다.
	 * 
	 * @param vo
	 */
	public void deleteBetaTester(BetaTesterListVo vo) throws Exception;
	
			/**
	 * 결재문서 스냅샷 경로 수정
	 * 
	 * @param vo
	 * @return
	 */
	public void saveServiceNewUrl(ServiceListVo listVo) throws Exception;
}
