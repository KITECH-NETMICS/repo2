package kr.re.kitech.biz.hum.apy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 학생연구원활용예정확인서 관련 DAO
 * @Class Name : HumApyStuDAO.java
 * @Description : 학생연구원활용예정확인서 관련 DAO
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
@Repository("humApyStuDAO")
public class HumApyStuDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 학생연구원활용예정확인서. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyStuInfoVo> selectHumApyStuList(HumApyStuSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyStuList", vo);
	}

    /**
     * 학생연구원활용예정확인서. 추천서 발급번호 생성
     */
	public void updateHumApyStuRcmd(HumApyStuInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyStuRcmd", vo);
	}

    /**
     * 학생연구원활용예정확인서. 메일발송 여부 수정
     */
	public void updateEmailYn(HumApyStuInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateEmailYn", vo);
	}

    /**
     * 학생연구원활용예정확인서. 연수책임자 과제 현황 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyStuInfoVo> selectHumApyStuPrjList(HumApyStuSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyStuPrjList", vo);
	}

    /**
     * 학생연구원활용예정확인서. 연수책임자 지도 학생 연구원 현황 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyStuInfoVo> selectHumApyStuStuList(HumApyStuSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyStuStuList", vo);
	}

    /**
     * 학생연구원활용예정확인서. 연수책임자 학생인건비 현황 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyStuInfoVo> selectHumApyStuExpns(HumApyStuSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyStuExpns", vo);
	}

    /**
     * 학생연구원활용예정확인서. 상세조회
     */
	public HumApyStuInfoVo selectHumApyStuInfo(HumApyStuSrchVo vo) throws KitechException {
		return (HumApyStuInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyStuInfo", vo);
	}

    /**
     * 학생연구원활용예정확인서. 학생연구원 정보 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<HumApyStuInfoVo> selectHumApyStuInfoList(HumApyStuSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.hum.apy.selectHumApyStuInfoList", vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 보험율 산정 방식 조회
	 */
	public HumApyStuInfoVo selectHumApyStuSalInsur(HumApyStuSrchVo vo) throws KitechException {
		return (HumApyStuInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyStuSalInsur", vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 학생연구원 급여기준표 급여 조회
	 */
	public HumApyStuInfoVo selectHumApyStuSalAnuPay(HumApyStuSrchVo vo) throws KitechException {
		return (HumApyStuInfoVo) selectByPk("kr.re.kitech.biz.hum.apy.selectHumApyStuSalAnuPay", vo);
	}

    /**
     * 학생연구원활용예정확인서. 신청서 기본정보 저장
     */
	public void insertHumApyStuInfo(HumApyStuInfoVo vo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyStuInfo", vo);
	}
	
    /**
     * 학생연구원활용예정확인서. 신청서 기본정보 수정
     */
	public void updateHumApyStuInfo(HumApyStuInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.hum.apy.updateHumApyStuInfo", vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 신청서 학생연구원 목록 저장
	 */
	public void insertHumApyStuList(HumApyStuInfoVo vo) throws KitechException {
		insert("kr.re.kitech.biz.hum.apy.insertHumApyStuList", vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 신청서 학생연구원 목록 삭제
	 */
	public void deleteHumApyStuList(HumApyStuSrchVo vo) throws KitechException {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyStuList", vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 신청서 삭제
	 */
	public void deleteHumApyStuInfo(HumApyStuSrchVo vo) throws KitechException {
		delete("kr.re.kitech.biz.hum.apy.deleteHumApyStuInfo", vo);
	}
	


}
