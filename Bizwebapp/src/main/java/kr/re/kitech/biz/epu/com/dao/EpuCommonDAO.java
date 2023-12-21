package kr.re.kitech.biz.epu.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.api.server.vo.biz.ApiEpuVo;
import kr.re.kitech.biz.epu.cnt.vo.BblenfrcVo;
import kr.re.kitech.biz.epu.com.vo.EpuComCodeG2bVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 구매 공통 
 * @Class Name : EpuCommonDAO.java
 * @Description : 구매 공통  DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/12/08   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/12/08
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("epuCommonDAO")
public class EpuCommonDAO extends BizDefaultAbstractDAO{
	/**
     * 구매, 검수 권한 담당자 조회
     * @param String
     * @return String
     * @throws Exception
     */
	public String selectPurManager(String sysPayNo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.epu.com.selectPurManager", sysPayNo);
	}
	
	/**
     * 구매 통제금액수정을 위한 조회
     * @param String
     * @return List<BblenfrcVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<BblenfrcVo> selectBblenfrcChngAmt(String reqNo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.com.selectBblenfrcChngAmt", reqNo);
    }
    
    /**
     * 구매 집행내역 원인행위금액 정리
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
    public int updateBblenfrcCtrlAmt(BblenfrcVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.com.updateBblenfrcCtrlAmt", vo);
    }
    
    /**
     * 일반예산 원인행위 금액 정리
     * @param BblenfrcVo
     * @return int
     * @throws Exception
     */
    public int updateBblBugtActRsltCauseAmt(BblenfrcVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.com.updateBblBugtActRsltCauseAmt", vo);
    }
    
    /**
     * 구매요구서 purreqmastr에 삭제 플래그 저장
     * @param String
     * @return int
     * @throws Exception
     */
    public int updatePurReqDelFlag(String purReqNo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.com.updatePurReqDelFlag", purReqNo);
    }
    
    /**
     * 재공고 신규발주시 구매요구품목 초기화
     * @param String
     * @return int
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.13.
     */
    public int updatePurReqItemOrderCd(String purReqNo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.com.updatePurReqItemOrderCd", purReqNo);
    }
    
    /**
     * G2b 공통코드 조회
     * @param EpuComCodeG2bVo
     * @return List<EpuComCodeG2bVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<EpuComCodeG2bVo> selectEpuComCodeG2b(EpuComCodeG2bVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.com.selectEpuComCodeG2b", vo);
    }
    
    /**
     * 구매담당자 부서정보 조회
     * @param String sysPayNo
     * @return ApiEpuVo
     * @throws Exception
     */
	public ApiEpuVo selectChrgPsnDeptInfo(String sysPayNo) throws KitechException{
		return (ApiEpuVo)selectByPk("kr.re.kitech.biz.api.bpm.selectChrgPsnDeptInfo", sysPayNo);
	}
}
