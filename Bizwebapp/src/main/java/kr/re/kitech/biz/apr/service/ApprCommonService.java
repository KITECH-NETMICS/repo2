/**
 * 
 */
package kr.re.kitech.biz.apr.service;

import java.util.HashMap;
import java.util.List;

import kr.re.kitech.biz.apr.vo.AppFormVo;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.apr.vo.PostAprVo;
import kr.re.kitech.biz.xom.base.exception.BpmException;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 전자결재 공통 서비스
 * @author James
 * @since 2022. 6. 21.
 */
public interface ApprCommonService {

	/**
	 * 스냅샷 경로를 RDB 에서 조회한다.
	 *
	 * @param reqNo
	 * @return
	 * @throws Exception
	 */
	public String getSnapshotLinkurl(String reqNo) throws Exception;
	
	/**
	 * 스토리지에 저장된 스냅샷을 읽어서 반환한다.
	 *
	 * @param sc
	 * @return
	 * @throws Exception
	 */
	public String getSnapshot(AprScVo sc) throws Exception;
	
	/**
	 * 스냅샷을 생성 후 스냅샷을 문자열로 반환한다.
	 * 
	 * @param sc 전자결재 공통 검색 객체
	 * @param data 데이터 오브젝트
	 * @return
	 * @throws Exception
	 */
	public String makeSnapshot(AprScVo sc, Object data) throws Exception;
	
	public String makeSnapshot(String reqNo, Object data) throws Exception;
	
	/**
	 * 스냅샷 초기정보 BPM에서 조회후 반환
	 *
	 * @param AprScVo
	 * @return AppFormVo
	 */
	public AppFormVo getSnapshotBaseInfo(AprScVo aprScVo);
	
	/**
	 * 인터페이스 테이블 단건 조회
	 *
	 * @param reqNo
	 * @return
	 */
	public IntfatabVo getXomxintfatab(String reqNo);
    
	/**
	 * 인터페이스 테이블 삽업
	 *
	 * @param vo
	 * @return
	 */
	public int putXomxintfatab(IntfatabVo vo);
    
	/**
	 * 인터페이스 테이블 수정
	 *
	 * @param vo
	 * @return
	 */
	public int modXomxintfatab(IntfatabVo vo);

	/**
	 * 인터페이스 테이블 삭제
	 *
	 * @param reqNo
	 * @return
	 */
	public int delXomxintfatab(String reqNo);	
	
	public void createAprInterface(String reqNo);
		
	/**
	 * 인터페이스 테이블 저장 설정
	 * @param vo
	 * @return
	 */	
	public void createAprInterface(String reqNo, String serviceId, String userid);
	/**
	 * 인터페이스 테이블 저장 설정
	 * @param vo
	 * @return
	 */	
	public void createAprInterface(String reqNo, String serviceId, String userid, String infoCd);
	
	/**
	 * 인터페이스 테이블 저장 설정
	 *
	 * @param vo
	 * @return
	 */	
	public void modifyAprInterface(String reqNo, String aprState, String userid);
	
	/**
	 * 인터페이스 테이블 수정 설정
	 * @param vo
	 * @return
	 */	
	public void modifyAprInterfaceAddInfo(String reqNo, String aprState, String userid, String infoCd);
	
	/**
	 * 신청화면 삭제
	 *
	 * @param vo
	 * @return
	 */	
	public int deleteApr(String reqNo) throws KitechException, BpmException;
	
	public int deleteApr(String reqNo, boolean isEln, boolean isBpm) throws KitechException, BpmException;
	
	
	/**
    * 사후결재 여부 조회
    */ 
	public PostAprVo confirmPostApr(PostAprVo vo);
	
	/**
    * 사후결재 사유 조회
    */ 
	public PostAprVo selectAprAfterReason(String reqNo);
	
	/**
    * 사후결재 사유 저장
    */ 
	public void saveAprAfterReason(PostAprVo vo);
	
	/**
	 * 결재의견 저장
	 *
	 * @param DocCommentsVo
	 * @return int
	 */
	public int insertDocComments(DocCommentsVo vo);
	
	/**
	 * 결재의견 저장(String)
	 *
	 * @param DocCommentsVo
	 * @return int
	 */
	public void insertDocCommentsStr(String instance_id, String req_no, String contents, String opt_type, String empno, String empname, String emptitle, String created_by, String updated_by);
	
	/**
	 * 결재의견 조회
	 *
	 * @param String
	 * @return DocCommentsVo
	 */
	public List<DocCommentsVo> selectDocComments(DocCommentsVo vo);
	
	/**
     * 생성되는 스냅샷 파일 위치를 머지 한다
     * @param String
     * @throws Exception
     */
    public void mergeSnapShotFileUrl(HashMap<String, String> map) throws KitechException;

    /**
	 * 결재의견 삭제(회수시)
	 *
	 * @param String
	 * @return req_no
	 */
	public int deleteDocComments(String reqNo);
}
