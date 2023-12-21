package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAllowVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 가족수당신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApyAllowService.java
 * @Description : 가족수당신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023.08.11.  김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.11.
 * @version 1.0
 * @see
 * 
 */ 
 
public interface HumApyAllowService {

    /**
     * 가족수당신청 목록조회 
     * 
     * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return List<HumApyAllowInfoVo>
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
    public List<HumApyAllowInfoVo> selectList(HumApyAllowInfoVo vo) throws KitechException;
    
    /**
     * 가족수당신청 정보 조회 
     * 
     * @author 김상미
	 * @param  HumApyAllowInfoVo
	 * @return HumApyAllowVo
	 * @throws KitechException
	 * @since 2023.08.11.
	 */
    public HumApyAllowVo select(HumApyAllowInfoVo vo) throws KitechException;
    
    /**
     * 결재진행중인 가족수당신청서 유무 조회  
     * 
     * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
    public HumApyAllowInfoVo selectDupCheck(HumApyAllowInfoVo vo) throws KitechException;
  
    /**
     * 가족수당신청서 등록
     * 
     * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @return HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
    public HumApyAllowInfoVo saveAllowInfo(HumApyAllowVo vo) throws KitechException;
  
    /**
     * 가족수당신청정보 삭제
     * 
     * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
    public void delete(HumApyAllowInfoVo vo) throws KitechException;
    
    /**
	 * 가족수당신청 전자결제 처리(화면)
     * 
     * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
	public void formConfirm(HumApyAllowVo vo) throws KitechException;
	
	/**
	 * 가족수당신청 전자결제 반려(화면)
     * 
     * @author 김상미
	 * @param HumApyAllowInfoVo
	 * @throws KitechException
	 * @since 2023.08.11.
     */
	public void formReject(HumApyAllowInfoVo vo) throws KitechException; 
}
