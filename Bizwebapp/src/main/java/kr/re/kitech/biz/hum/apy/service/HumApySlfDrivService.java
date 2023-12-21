package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자가운전보조비신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApySlfDrivService.java
 * @Description : 자가운전보조비신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.04.     김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.04.
 * @version 1.0
 * @see
 * 
 */ 
 
public interface HumApySlfDrivService {
  
    /**
     * 자가운전보조비신청 목록조회 
	 * @param HumApySlfDrivInfoVo
	 * @return List<HumApySlfDrivInfoVo>
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
    public List<HumApySlfDrivInfoVo> selectList(HumApySlfDrivInfoVo vo) throws KitechException;
  
    /**
     * 자가운전보조비 신청 조회
	 * @param HumApySlfDrivInfoVo
	 * @return HumApySlfDrivVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
    public HumApySlfDrivVo select(HumApySlfDrivInfoVo vo) throws KitechException; 

    /**
     * 자가운전보조비 신청 결재신청 조회
	 * @param  HumApySlfDrivInfoVo
	 * @return HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
    public HumApySlfDrivInfoVo selectAprDirvInfo(HumApySlfDrivInfoVo vo) throws KitechException; 
  
    /**
     * 자가운전보조비 신청정보 저장
	 * @param  HumApySlfDrivInfoVo
	 * @return HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
    public HumApySlfDrivInfoVo save(HumApySlfDrivInfoVo vo) throws KitechException;  

    /**
     * 자가운전보조비 신청정보 삭제
	 * @param HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */	
    public void delete(HumApySlfDrivInfoVo vo) throws KitechException;     

  	/**
	 * 자가운전보조비 신청 전자결제 처리(화면)
	 * @param HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	public void formConfirm(HumApySlfDrivInfoVo vo) throws KitechException;
	
	/**
	 * 자가운전보조비 신청 전자결제 반려(화면)
	 * @param HumApySlfDrivInfoVo
	 * @throws KitechException
	 * @since 2023.08.04.
	 */
	public void formReject(HumApySlfDrivInfoVo vo) throws KitechException;


}
