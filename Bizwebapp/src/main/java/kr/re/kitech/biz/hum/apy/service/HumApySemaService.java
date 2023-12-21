package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApySemaInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApySemaAprVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 적립형공제신청 관련 처리를 담당하는 인터페이스
 * @Class Name : HumApySemaService.java
 * @Description : 적립형공제신청 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023.09.25.   김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.09.25.
 * @version 1.0
 * @see
 * 
 */ 
 
public interface HumApySemaService {

    /**
     * 적립형공제신청 목록 조회 
	 * @param HumApySemaInfoVo
	 * @return List<HumApySemaInfoVo>
	 * @throws KitechException
     * @since 2023.09.25.
	 */
	public List<HumApySemaInfoVo> selectList(HumApySemaInfoVo vo) throws KitechException;
	
    /**
     * 적립형공제신청 정보 조회 
	 * @param HumApySemaInfoVo
	 * @return HumApySemaVo
	 * @throws KitechException
     * @since 2023.09.25.
	 */
	public HumApySemaAprVo select(HumApySemaInfoVo vo) throws KitechException;

	/**
	 * 신규 신청으로 진입시 결재진행 중인 적립형공제신청건 유무 조회
	 * @param  HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
	 * @since 2023.09.25. 
	 */
	public HumApySemaInfoVo selectHumApySemaDupCheck(HumApySemaInfoVo vo) throws KitechException;
		
	/**
     * 적립형공제신청 사용자 정보 조회 
	 * @param HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
	 */
	public HumApySemaInfoVo selectEmpInfo(HumApySemaInfoVo vo) throws KitechException;
	
    /**
     * 적립형공제신청 등록
	 * @param HumApySemaInfoVo
	 * @return HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
	 */
	public HumApySemaInfoVo save(HumApySemaInfoVo vo) throws KitechException;
	
    /**
     * 적립형공제신청 삭제
	 * @param HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
	 */
	public void delete(HumApySemaInfoVo vo) throws KitechException;

    /**
	 * 적립형공제신청 전자결제 처리(화면)
	 * @param HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
     */
	public void formConfirm(HumApySemaInfoVo vo) throws KitechException;
	
	/**
	 * 적립형공제신청 전자결제 반려(화면)
	 * @param HumApySemaInfoVo
	 * @throws KitechException
     * @since 2023.09.25.
     */
	public void formReject(HumApySemaInfoVo vo) throws KitechException; 	

}
