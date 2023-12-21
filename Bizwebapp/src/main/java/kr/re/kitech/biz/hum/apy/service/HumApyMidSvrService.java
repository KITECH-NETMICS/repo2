package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrVo;
import kr.re.kitech.biz.hum.apy.vo.HumslBasInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 퇴직금중간정산신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApyMidSvrService.java
 * @Description : 퇴직금중간정산신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023.08.31.   김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */ 
 
public interface HumApyMidSvrService {

    /**
     * 퇴직금중간정산신청 리스트조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return List<HumApyMidSvrInfoVo>
	 * @throws KitechException
	 * @since 2023.08.31.
	 */	
    public List<HumApyMidSvrInfoVo> selectList(HumApyMidSvrInfoVo vo) throws KitechException;
    
    /**
     * 퇴직금중간정산신청 대상여부 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumslBasInfoVo
	 * @throws KitechException
	 * @since 2023.08.31
	 */	
    public HumslBasInfoVo selectEmpState(HumslBasInfoVo vo) throws KitechException;
    
    /**
     * 퇴직금중간정산신청 상세 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
    public HumApyMidSvrVo select(HumApyMidSvrInfoVo vo) throws KitechException;

    /**
     * 퇴직금중간정산 신청자 기본 정보 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */
    public HumApyMidSvrInfoVo selectEmpInfo(HumApyMidSvrInfoVo vo) throws KitechException;

    /**
     * 퇴직금중간정산신청 건수 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */
    public HumApyMidSvrInfoVo selectReqCount(HumApyMidSvrInfoVo vo) throws KitechException;    

    /**
     * 퇴직충당금조회
	 * 
	 * @author 김상미
	 * @param  HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
    public HumApyMidSvrInfoVo selectSalBasicInfo(HumApyMidSvrInfoVo vo) throws KitechException;
        
    /**
     * 퇴직금중간정산신청 정보 등록
	 * 
	 * @author 김상미
	 * @param  HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
    public HumApyMidSvrInfoVo save(HumApyMidSvrInfoVo vo) throws KitechException;
    
    /**
     * 퇴직금중간정산신청 정보 삭제
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
    public void delete(HumApyMidSvrInfoVo vo) throws KitechException;

	/**
	 * 퇴직금중간정산신청 결재상태 조회
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @return HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	public HumApyMidSvrInfoVo selectApr(HumApyMidSvrInfoVo vo) throws KitechException;
  
	/**
	 * 퇴직금중간정산신청 신청 전자결제 처리(화면)
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	public void formConfirm(HumApyMidSvrInfoVo vo) throws KitechException;

	/**
	 * 퇴직금중간정산신청 신청 전자결제 반려(화면)
	 * 
	 * @author 김상미
	 * @param HumApyMidSvrInfoVo
	 * @throws KitechException
	 * @since 2023.08.31.
     */	
	public void formReject(HumApyMidSvrInfoVo vo) throws KitechException;    

}
