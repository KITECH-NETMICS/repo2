package kr.re.kitech.biz.xom.core.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.core.vo.AttachListVo;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**  
 * @ClassSubJect 공통첨부파일테이블 관련 처리를 담당하는 인터페이스
 * @Class Name : AttachService.java
 * @Description : 공통첨부파일테이블 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/18   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/18
 * @version 1.0
 * @see
 * 
 */
public interface AttachService {
	
	/**
	 * 공통첨부파일테이블 페이징 처리하여 목록을 조회한다.
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return  공통첨부파일테이블 목록 List<AttachVo>
	 * @throws Exception
	 */
	public List<AttachVo> selectListAttach(String attachFileNo);
	
	/**
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return 조회한 공통첨부파일테이블 전체 카운트
	 * @throws Exception
	 */
	public long selectListCountAttach(AttachVo attachVo);
	
	/**
	 * 공통첨부파일테이블 상세조회를 한다.
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return 사원상세정보 AttachVo
	 * @throws Exception
	 */
	public AttachVo selectAttach(AttachVo attachVo);
		
	/**
	 * 공통첨부파일테이블를 등록한다.
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return 사번
	 * @throws Exception
	 */
	public int insertAttach(AttachVo attachVo);
	
	/**
	 * 공통첨부파일테이블를 갱신한다.
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @throws Exception
	 */
	public int updateAttach(AttachVo attachVo);
	
	
	/**
	 * 공통첨부파일테이블 유효성 컬럼(comm_yn)을 갱신한다.
	 * @param attachNos 공통첨부파일테이블 attachNo 리스트
	 * @throws Exception
	 */	
	public int updateAttachForValid(List<String> attachNos);
	
	
	/**
	 * 공통첨부파일테이블를 삭제한다.
	 * @param attachVo 공통첨부파일테이블 AttachListVo
	 * @throws Exception
	 */
	public boolean deleteAttaches(AttachListVo attachListVo);
	
	
	/**
	 * 첨부파일 번호에 해당하는 MAX SEQ 를 조회한다.
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return MAX SEQ
	 * @throws Exception
	 */
	public String selectMaxSeq(AttachVo attachVo);
	
	/**
	 * 
	 * @param attachVo 공통첨부파일테이블 AttachVo
	 * @return 조회한 공통첨부파일테이블 AttachVo
	 */
	public AttachVo getRealAttach(String fileName, String orgName, Business business, HttpServletRequest request) ;
	
	/** 
	 *
	 *
	 *	모바일 용 첨부파일 저장
	 * @throws Exception 
	 *
	 *
	 */
	public void saveMobileAttachFile(AttachVo vo) throws Exception;
}
