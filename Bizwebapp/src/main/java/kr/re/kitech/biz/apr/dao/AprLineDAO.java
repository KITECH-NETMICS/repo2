package kr.re.kitech.biz.apr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.apr.vo.AprDeptVo;
import kr.re.kitech.biz.apr.vo.AprLineDescVo;
import kr.re.kitech.biz.apr.vo.AprLineVo;
import kr.re.kitech.biz.apr.vo.AprRuleVo;
import kr.re.kitech.biz.apr.vo.AprUserVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * 결재신청 공통 레파지토리
 * @author 박병목
 * @since 2022. 6. 24.
 */
@Repository("aprLineDAO")
public class AprLineDAO extends BizDefaultAbstractDAO {

	    /**
     * 개인별 결재선 리스트 저장
     * @param AprLineVo
     * @throws Exception
     */
    public String selectAprLineMaxNum() {
    	return (String)super.selectByPk("kr.re.kitech.biz.apr.selectAprLineMaxNum");
    }
   
    /**
     * 개인별 결재선 리스트 저장
     * @param AprLineVo
     * @throws Exception
     */
    public int insertAprLine(AprLineVo vo) {
    	return insert("kr.re.kitech.biz.apr.insertAprLine", vo);
    }
    
    /**
     * 개인별 결재선 리스트 수정
     * @param AprLineVo
     * @throws Exception
     */
    public int updateAprLine(AprLineVo vo) {
    	return update("kr.re.kitech.biz.apr.updateAprLine", vo);
    }
    
    /**
     * 개인별 결재선 리스트 삭제
     * @param AprLineVo
     * @throws Exception
     */
    public int deleteAprLine(AprLineVo vo) {
    	return delete("kr.re.kitech.biz.apr.deleteAprLine", vo);
    }
    
    /**
     * 개인별 결재선 리스트 삭제
     * @param AprLineVo
     * @throws Exception
     */
    public int deleteAprLineData(AprLineVo vo) {
    	return update("kr.re.kitech.biz.apr.deleteAprLineData", vo);
    }
    
    /**
     * 개인별 결재선 리스트 상세내용 저장
     * @param AprLineVo
     * @throws Exception
     */
    public int insertAprLineData(AprLineDescVo vo) {
    	return update("kr.re.kitech.biz.apr.insertAprLineData", vo);
    }
        
    /**
     * 개인별 결재선 리스트 조회
	 * @param UserVo
	 * @return AprLineVo
     */
    public List<AprLineVo> selectAprLineList(AprUserVo vo) {
    	return list("kr.re.kitech.biz.apr.selectAprLineList", vo);
    }
    
    /**
     * 개인별 결재선 선택 리스트 조회
	 * @param AprLineVo
	 * @return AprLineDescVo
     */
    public List<AprLineDescVo> selectAprLineDescList(AprLineVo vo) {
    	return list("kr.re.kitech.biz.apr.selectAprLineDescList", vo);
    }
    
    /**
     * 결재 사용자 조회
	 * @param AprUserVo
	 * @return AprUserVo
     */
    public List<AprUserVo> selectAprUserList(AprUserVo vo) {
    	return list("kr.re.kitech.biz.apr.selectAprUserList", vo);
    }
    
    /**
     * 개인별 초기 결재라인 세팅
	 * @param AprUserVo
	 * @return AprUserVo
     */
    public List<AprUserVo> selectBaseAprLine(AprUserVo vo) {
    	return list("kr.re.kitech.biz.apr.selectBaseAprLine", vo);
    }
    
    /**
     * 부서 라인 세팅(APR)
	 * @param AprDeptVo
	 * @return AprDeptVo
     */
    public List<AprDeptVo> selectBaseDeptLine(AprDeptVo vo) {
    	return list("kr.re.kitech.biz.apr.selectBaseDeptLine", vo);
    }
    
    /**
     * 부서별 사용자 세팅(APR)
	 * @param AprDeptVo
	 * @return AprUserVo
     */
    public List<AprUserVo> selectDeptToUserLine(AprDeptVo vo) {
    	return list("kr.re.kitech.biz.apr.selectDeptToUserLine", vo);
    }
    
    /**
     * 전결 상태값 조회
	 * @param AprVo
	 * @return AprRuleVo
     */
    public AprRuleVo selectArbitrarilyRule(AprVo vo) {
    	return (AprRuleVo)super.selectByPk("kr.re.kitech.biz.apr.selectArbitrarilyRule", vo);
    }
}
