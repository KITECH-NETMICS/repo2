package kr.re.kitech.biz.hum.apy.service;

import java.util.List;

import kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 학생연구원활용예정확인서 관련 인터페이스
 * @Class Name : HumApyStuServiceImpl.java
 * @Description : 학생연구원활용예정확인서 관련 인터페이스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/07   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/07
 * @version 1.0
 * @see
 * 
 */
public interface HumApyStuService {
	
	 /**
	 * 학생연구원활용예정확인서. 목록 조회
	 */
	public List<HumApyStuInfoVo> selectHumApyStuList(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 추천서 발급번호 생성
	 */
	public void updateHumApyStuRcmd(HumApyStuListVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 메일발송 여부 수정
	 */
	public void updateEmailYn(HumApyStuListVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 연수책임자 과제 현황 목록 조회
	 */
	public List<HumApyStuInfoVo> selectHumApyStuPrjList(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 연수책임자 지도 학생 연구원 현황 목록 조회
	 */
	public List<HumApyStuInfoVo> selectHumApyStuStuList(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 연수책임자 학생인건비 현황 조회
	 */
	public List<HumApyStuInfoVo> selectHumApyStuExpns(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 상세조회
	 */
	public HumApyStuInfoVo selectHumApyStuInfo(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 학생연구원 정보 목록 조회
	 */
	public List<HumApyStuInfoVo> selectHumApyStuInfoList(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 보험율 산정 방식 조회
	 */
	public HumApyStuInfoVo selectHumApyStuSalInsur(HumApyStuSrchVo vo) throws KitechException;

	 /**
	 * 학생연구원활용예정확인서. 학생연구원 급여기준표 급여 조회
	 */
	public HumApyStuInfoVo selectHumApyStuSalAnuPay(HumApyStuSrchVo vo) throws KitechException;
	
	/**
	 * 학생연구원활용예정확인서. 저장, 수정, 결재신청
	 */
	public String saveHumApyStu(HumApyStuListVo vo) throws KitechException;
	
	/**
	 * 학생연구원활용예정확인서. 신청서 삭제
	 */
	public void deleteHumApyStu(HumApyStuSrchVo vo) throws KitechException;

}
