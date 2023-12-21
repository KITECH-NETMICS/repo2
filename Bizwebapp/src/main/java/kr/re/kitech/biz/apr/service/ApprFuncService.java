package kr.re.kitech.biz.apr.service;

import java.util.List;

import kr.re.kitech.biz.api.client.enums.BpmServiceType;
import kr.re.kitech.biz.api.client.vo.BpmRequest;
import kr.re.kitech.biz.api.client.vo.BpmResult;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprTaskListVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.AprWorkVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.xom.base.exception.BpmException;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 결재신청 공통 서비스
 * @author 박병목
 * @since 2022. 6. 24.
 */
public interface ApprFuncService {


	/**
	 * 전자결재에 정보를 BPM에 넘겨준다.
	 * @param reqStr
	 * @throws Exception
	 */
	public void approvalRequest(AprVo aprVo) throws KitechException, BpmException;
	
	/**
	 * 전자결재에 정보를 BPM에 넘겨준다.
	 * @param reqStr
	 * @return
	 * @throws Exception
	 */
	public void approvalRequest(AprVo aprVo, Object model) throws KitechException, BpmException;
	
	/**
     * 결재를 상신(Type2)
     * @return String
     * @author parkbm
     * @since 2022.09.01.
     */
	public void approvalScreen(AprVo aprVo) throws KitechException, BpmException;
	
	
	/**
	 * 결재를 상신(Type2)
	 * @param aprVo
	 * @param model
	 * @throws KitechException, BpmException
	 */
	public void approvalScreen(AprVo aprVo, Object model) throws KitechException, BpmException;	
		
    /**
     * 결재를 상신한다.
     * @param AprSnapReqVo
     * @throws Exception
     */
    public void formSubmit(AprScVo aprVo, List<AprUserVo> users) throws KitechException, BpmException;
    
    /**
     * 결재(라인편집)를 진행한다.
     * @param AprSnapReqVo
     * @throws Exception
     */
    public void formAcceptLineSet(AprScVo aprVo, List<AprUserVo> users) throws KitechException, BpmException;
    
    /**
     * 결재를 승인한다.
     * @param AprVo
     * @throws Exception
     */
    public void formAccept(AprVo aprVo) throws KitechException, BpmException;
    
    
    /**
     * 다건 결재를 승인한다.
     * @param AprVo
     * @throws Exception
     */
    public void formAccepts(AprTaskListVo aprTaskListVo) throws KitechException, BpmException;
        
    
    /**
     * 결재를 반려한다.
     * @param AprVo
     * @throws Exception
     */
    public void formReject(AprScVo aprVo) throws KitechException, BpmException;
    
    /**
     * 결재 담당자반려한다.
     * @param AprVo
     * @throws Exception
     */
    public void formAuthReject(AprScVo aprVo) throws KitechException, BpmException;
    
    /**
     * ASIS 결재 담당자반려한다.
     * @param AprVo
     * @throws Exception
     */
    public void formAuthAsisReject(AprScVo aprVo) throws KitechException, BpmException;
    
    /**
     * 결재를 회수한다.
     * @param AprVo
     * @throws Exception
     */
    public void formCompensate(AprScVo aprVo) throws KitechException, BpmException;
    
    /**
     * 결재를 전달한다.
     * @param AprVo
     * @throws Exception
     */
    public void formDelegate(AprTaskListVo aprScListVo) throws KitechException, BpmException;
   
    /**
     * 결재를 삭제한다.
     * @param AprVo
     * @throws Exception
     */
    public int formRemove(String reqNo) throws KitechException, BpmException;
    
    public int formRemove(String reqNo, boolean isEln) throws KitechException, BpmException;
    
    public int formRemove(String reqNo, boolean isEln, boolean isBpm) throws KitechException, BpmException;
    
    public void formInit(String reqNo) throws KitechException, BpmException;
    /**
	 * 결재를 초기화한다. 인터페이스 테이블을 저장한다.
     * @param reqNo
     * @param serviceId
     * @param userid
     * @throws KitechException, BpmException
     */
    public void formInit(String reqNo, String serviceId, String userid) throws KitechException, BpmException;
    
    public void formInit(String reqNo, String serviceId, String userid, String infoCd) throws KitechException, BpmException;        
    
    /**
	 * 결재대기함 검색조건 리스트
	 * @param sc
	 * @return AprWorkListVo
	 * @throws Exception
	 */
	public List<AprWorkVo> searchAprList(AprScVo sc) throws KitechException, BpmException;
	
	/**
	 * 결재대기함 리스트
	 * @param sc
	 * @return AprWorkListVo
	 * @throws Exception
	 */
	public List<AprWorkVo> searchClsfAprList(AprScVo sc) throws Exception;
	
	/**
	 * 결재대기함 총건수(페이징 이용)
	 * @param sc
	 * @return AprWorkListVo
	 * @throws Exception
	 */
	public int searchTotCnt(AprScVo sc) throws KitechException, BpmException;
	
	
	/**
	 * 예산통제 집행가능 카운트
	 * @param sc
	 * @return AprWorkListVo
	 * @throws Exception
	 */
	public int searchRakCnt(AprScVo sc) throws KitechException, BpmException;
	
	
	/**
	 * 결재대기함 검색조건 총건수(페이징 이용)
	 * @param sc
	 * @return AprWorkListVo
	 * @throws Exception
	 */
	public int searchClsfTotCnt(AprScVo sc) throws KitechException, BpmException;
	
	/**
	 * 결재 반려, 작성중 리스트함 총건수(페이징 이용)
	 * @param sc
	 * @return int
	 * @throws Exception
	 */
	public int searchWorkTotCnt(AprScVo sc) throws KitechException, BpmException;
	
	/**
	 * 결재 반려, 작성중 리스트함
	 * @param sc
	 * @return IntfatabVo
	 * @throws Exception
	 */
	public List<IntfatabVo> searchWorkList(AprScVo sc) throws KitechException, BpmException;
	
	/**
	 * 결재 반려, 작성중 검색조건 리스트함 총건수(페이징 이용)
	 * @param sc
	 * @return int
	 * @throws Exception
	 */
	public int searchClsfWorkTotCnt(AprScVo sc) throws KitechException, BpmException;
	
	/**
	 * 결재 반려, 작성중 검색조건 리스트함
	 * @param sc
	 * @return IntfatabVo
	 * @throws Exception
	 */
	public List<IntfatabVo> searchClsfWorkList(AprScVo sc) throws KitechException, BpmException;

	
	/**
     * 결재 라인수 확인
     * @return String
     * @author parkbm
     * @since 2022.07.13.
     */
	public int getApprovalLineConunt(AprWorkVo aprWorkVo) throws KitechException, BpmException;
	
	/**
     * XSL 유무 확인
     * @return String
     * @author parkbm
     * @since 2022.07.13.
     */
	public String isSnapYn(AprWorkVo aprWorkVo) throws KitechException, BpmException;
	
	/**
	 * 모바일 작성중 리스트함 총건수(페이징 이용)
	 * @param sc
	 * @return int
	 * @throws Exception
	 */
	public int searchMbiWorkTotCnt(AprScVo sc) throws KitechException, BpmException;
	
	/**
	 * 모바일 작성중 리스트함 
	 * @param sc
	 * @return IntfatabVo
	 * @throws Exception
	 */
	public List<IntfatabVo> searchMbiWorkList(AprScVo sc) throws KitechException, BpmException;
	
	 /**
	 * BPM 상세데이터(GET API) 호출전 데이터 세팅
     * @param AprScVo
     * @param InstId
     * @param TaskId
     * @param Trctag
     * @return BpmRequest
     * @throws KitechException, BpmException
     */
	public BpmRequest getDetailData(AprScVo aprScVo, String instId, String taskId, String trctag) throws KitechException, BpmException;
	
	/**
	 * aprVo 조회값 추출
     * @param AprVo
     * @return BpmResult(JSON DATA)
     * @throws KitechException, BpmException
     */
	public BpmResult getBaseBpmReqToResult(AprScVo aprScVo) throws KitechException, BpmException;

	/**
	 * approvalStart 시작
     * @param AprVo
     * @return BpmResult(JSON DATA)
     * @throws KitechException, BpmException
     */
	public BpmRequest approvalForward(AprVo aprVo, BpmServiceType bpmType) throws KitechException, BpmException;
	 
	}
