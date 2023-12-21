package kr.re.kitech.biz.apr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.ElecappinfoVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * 결재신청 공통 레파지토리
 * @author 박병목
 * @since 2022. 6. 24.
 */
@Repository("apprFuncDAO")
public class ApprFuncDAO extends BizDefaultAbstractDAO {

    /**
     * 담당자 완료함 alias 값을 반환 한다.
	 * @param userId
	 * @return alias
     */
    public String searchAliasList(String userId) {
    	return (String)super.selectByPk("kr.re.kitech.biz.apr.searchAliasList", userId);
    }
    
    /**
     * 결재 반려, 작성중 리스트
     * @param String
     * @throws Exception
     */
    public List<IntfatabVo> searchWorkList(AprScVo sc) {
    	return list("kr.re.kitech.biz.apr.searchWorkList", sc);
    }
    
    /**
     * 결재 반려, 작성중 리스트(count)
     * @param String
     * @throws Exception
     */
    public int searchWorkTotCnt(AprScVo sc) {
    	return (int)super.selectByPk("kr.re.kitech.biz.apr.searchWorkTotCnt", sc);
    }
    
    /**
     * 결재정보 Elecappinfo 저장
     * @param ElecappinfoVo
     * @throws Exception
     */
    public int insertElecappinfo(ElecappinfoVo vo) {
    	return insert("kr.re.kitech.biz.apr.insertElecappinfo", vo);
    }
    
    /**
     * 결재정보 Elecappinfo 삭제
     * @param ElecappinfoVo
     * @throws Exception
     */
    public int deleteElecappinfo(String reqNo) {
    	return delete("kr.re.kitech.biz.apr.deleteElecappinfo", reqNo);
    }
    
    /**
     * 모바일 작성중 리스트(count)
     * @param String
     * @throws Exception
     */
    public int searchMbiWorkTotCnt(AprScVo sc) { 
    	return (int)super.selectByPk("kr.re.kitech.biz.apr.searchMbiWorkTotCnt", sc);
    }
    
    /**
     * 모바일 작성중 리스트
     * @param String 
     * @throws Exception
     */
    public List<IntfatabVo> searchMbiWorkList(AprScVo sc) {
    	return list("kr.re.kitech.biz.apr.searchMbiWorkList", sc);
    }
    
    /**
     * 예산통제 집행가능 카운트(count)
     * @param String
     * @throws Exception
     */
    public int searcBudgetRakCnt(AprScVo sc) {
    	return (int)super.selectByPk("kr.re.kitech.biz.apr.searcBudgetRakCnt", sc);
    }
    
    public int getBpmInstComplateCount(AprScVo sc) {
    	return (int)super.selectByPk("kr.re.kitech.biz.apr.getBpmInstComplateCount", sc);
    }
}
