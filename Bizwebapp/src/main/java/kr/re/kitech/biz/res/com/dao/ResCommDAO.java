package kr.re.kitech.biz.res.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeSearchVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeVo;
import kr.re.kitech.biz.res.com.vo.ResDepstAccntVo;
import kr.re.kitech.biz.res.com.vo.ResIndTeccVo;
import kr.re.kitech.biz.res.com.vo.ResPrjInfoVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;
import kr.re.kitech.biz.res.std.vo.XodrResManVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 연구공통
 * @Class Name : ResCommDAO.java
 * @Description : 연구공통 DAO
 * @Modification Information  
 * @
 * @  수정일              수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/6/10   홍성민                최초생성
 * 
 * @author 홍성민
 * @since 2022/6/10
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("resCommDAO")
public class ResCommDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {
	/**
	 * 사업분류코드 조회
	 * @param ResBsnsCodeSearchVo
     * @return List<ResBsnsCodeDepthVo>
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<ResBsnsCodeDepthVo> selectBsnsCodeDepthList(ResBsnsCodeSearchVo vo) throws KitechException{
		return list("kr.re.kitech.biz.res.com.selectXodrBaCode",vo);
	}
	
	/**
	 * 사업신청 -사업공고방에서 호출시 사업분류 조회
	 * @param ResBsnsCodeSearchVo
     * @return ResBsnsCodeListVo
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<ResBsnsCodeVo> selectRbaCodeListNoDepth(ResBsnsCodeSearchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.com.selectRbaCodeListNoDepth", vo);
	}
	
	/**
	 * 사업신청 -사업분류선택 팝업 조회
	 * @param ResBsnsCodeSearchVo
     * @return List<ResBsnsCodeVo>
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<ResBsnsCodeVo> selectXodrBaCodePop(ResBsnsCodeSearchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.com.selectXodrBaCodePop", vo);
	}
	
	/**
	 * 연구관리담당자 조회
	 * @param XodrResManVo
     * @return XodrResManVo
	 * @throws Exception
	 */
	public XodrResManVo selectXodrResMan(XodrResManVo vo) throws KitechException{
		return (XodrResManVo)selectByPk("kr.re.kitech.biz.res.com.selectXodrResMan", vo);
	}
	
	
     /**
     * 산업기술 대분류 콤보박스 조회
     * @param vo 산업기술 대분류 ResIndTeccVo
     * @return 산업기술 대분류  List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResIndTeccVo> selectResIndTeccBigClsf(String clsf) throws KitechException {          
        return list("kr.re.kitech.biz.res.com.selectResIndTeccBigClsf", clsf);
    }
    
    /**
     * 산업기술 중분류 콤보박스 조회
     * @param ResIndTeccVo
     * @return List<ResIndTeccVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResIndTeccVo> selectResIndTeccMidClsf(ResIndTeccVo vo) throws KitechException {          
        return list("kr.re.kitech.biz.res.com.selectResIndTeccMidClsf", vo);
    }
    
     /**
     * 산업기술분류 조회
     * @param ResIndTeccVo
     * @return List<ResIndTeccVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResIndTeccVo> selectResIndTeccList(ResIndTeccVo vo) throws KitechException {          
        return list("kr.re.kitech.biz.res.com.selectResIndTeccList", vo);
    }	
    
    /**
     * 중분류검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)
     * @param String
     * @return List<XodxCommstVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<XodxCommstVo> selectXodxCommstMidClsf(String cdClsf) throws KitechException{
    	return list("kr.re.kitech.biz.res.com.selectXodxCommstMidClsf", cdClsf);
    }
    
    /**
     * 코드검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)
     * @param XodxCommstVo
     * @return List<XodxCommstVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<XodxCommstVo> selectXodxCommstMngmt(XodxCommstVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.res.com.selectXodxCommstMngmt", vo);
    }
    
    /**
     * 연구관리 부서 담당자 검색
     * @param String
     * @return String
     * @throws Exception
     */
    public String selectXodrDeptResMan(String sysPayNo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.res.com.selectXodrDeptResMan", sysPayNo);
    }
    
    /**
     * 연구관리 과제정보(공통사용)
     * @param String
     * @return ResPrjInfoVo
     * @throws Exception
     */
    public ResPrjInfoVo selectResComPrjInfo(String accntNo) throws KitechException{
    	return (ResPrjInfoVo)selectByPk("kr.re.kitech.biz.res.com.selectResComPrjInfo", accntNo);
    }
    
    /**
     * 연구비 입금관리 대변 회계코드 조회
     * @param ResDepstAccntVo
     * @return String
     * @throws Exception
     */
    public String selectDepstMntAccntCd(ResDepstAccntVo vo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.res.com.selectDepstMntAccntCd", vo);
    }
}
