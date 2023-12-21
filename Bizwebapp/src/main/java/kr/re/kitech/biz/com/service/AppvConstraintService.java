package kr.re.kitech.biz.com.service;

import java.util.List;

import kr.re.kitech.biz.com.vo.AppvConstraintListVo;
import kr.re.kitech.biz.com.vo.AppvConstraintVo;
import kr.re.kitech.biz.com.vo.BetaTesterListVo;
import kr.re.kitech.biz.com.vo.BetaTesterVo;

/**
 * 업무의 양식함/제약/이중화 관리 서비스
 *
 * @author 홍성민
 * @since 2023. 5. 10.
 */
public interface AppvConstraintService {

	/**
	 * 결재문서 정보 조회
	 * 
	 * @param vo
	 * @return
	 */
	public BetaTesterVo selectAppvApplicationMap(BetaTesterVo vo) throws Exception;
	
	/**
	 * 검색 구분에 따른 리스트 조회
	 * 
	 * @param vo
	 * @return
	 */
	public List<AppvConstraintVo> selectAppvConstList(AppvConstraintVo vo) throws Exception;
	
	/**
	 * 결재문서 제약쿼리 저장
	 * 
	 * @param vo
	 * @return
	 */
	public void saveAppvConstList(AppvConstraintListVo vo) throws Exception;
	
	/**
	 * 결재문서 스냅샷 경로 수정
	 * 
	 * @param vo
	 * @return
	 */
	public void saveAppvApplicationMap(BetaTesterVo vo) throws Exception;
	
		/**
	 * 결재문서 스냅샷 경로 수정
	 * 
	 * @param vo
	 * @return
	 */
	public void saveAppvApplicationMap(BetaTesterListVo vo) throws Exception;
	
		/**
	 *  applicationmap 테이블에서 xslurl을 서로 바꾼다.
	 * 
	 * @param vo
	 * @return
	 */
	public void swapAppvApplicationMap(BetaTesterVo vo) throws Exception;
	
}
