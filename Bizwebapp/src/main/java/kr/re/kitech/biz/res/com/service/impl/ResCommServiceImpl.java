package kr.re.kitech.biz.res.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.res.com.dao.ResCommDAO;
import kr.re.kitech.biz.res.com.service.ResCommService;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeDepthListVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeSearchVo;
import kr.re.kitech.biz.res.com.vo.ResBsnsCodeVo;
import kr.re.kitech.biz.res.com.vo.ResIndTeccVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;
import kr.re.kitech.biz.res.std.vo.XodrResManVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 연구공통
 * @Class Name : ResCommServiceImpl.java
 * @Description : 연구공통 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
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
@Service("resCommServiceImpl")
public class ResCommServiceImpl implements ResCommService {
	
	@Resource(name="resCommDAO")
	private ResCommDAO resCommDAO;
	
	@Override
	public ResBsnsCodeDepthListVo selectBsnsCodeDepthList(ResBsnsCodeSearchVo vo) throws KitechException{
		ResBsnsCodeDepthListVo retVo = new ResBsnsCodeDepthListVo();
					
		vo.setDepth("1");
		retVo.setDepth1Vo(resCommDAO.selectBsnsCodeDepthList(vo)); // 관계부처
		vo.setDepth("2");
		retVo.setDepth2Vo(resCommDAO.selectBsnsCodeDepthList(vo));
		vo.setDepth("3");
		retVo.setDepth3Vo(resCommDAO.selectBsnsCodeDepthList(vo));
		String grp_cd = retVo.getDepth2Vo().get(0).getBsns_grp_cd().toString();
		AppLog.debug(grp_cd);
		return retVo;
	}
	
	/**
	 * 사업분류 조회(사업신청-사업공고방에서 호출시)
	 * @param ResBsnsCodeSearchVo
     * @return List<ResBsnsCodeVo>
	 * @throws Exception
	 */
	@Override
	public List<ResBsnsCodeVo> selectRbaCodeListNoDepth(ResBsnsCodeSearchVo vo) throws KitechException {
		return resCommDAO.selectRbaCodeListNoDepth(vo);
	}
	
	/**
	 * 사업분류선택 팝업 조회
	 * @param ResBsnsCodeSearchVo
     * @return List<ResBsnsCodeVo>
	 * @throws Exception
	 */
	@Override
	public List<ResBsnsCodeVo> selectXodrBaCodePop(ResBsnsCodeSearchVo vo) throws KitechException {		
		return resCommDAO.selectXodrBaCodePop(vo);
	}
	
	/**
	 * 연구관리담당자 조회
	 * @param XodrResManVo
     * @return XodrResManVo
	 * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.10.
	 */
	public XodrResManVo selectXodrResMan(XodrResManVo vo) throws KitechException{
		return resCommDAO.selectXodrResMan(vo);
	}
	
	/**
     * 산업기술 대분류 콤보박스 조회
     * @param vo 산업기술 대분류 ResIndTeccVo
     * @return 산업기술 대분류  List
     * @throws Exception
     */   
	public List<ResIndTeccVo> selectResIndTeccBigClsf(ResIndTeccVo vo) throws KitechException{
		return resCommDAO.selectResIndTeccBigClsf(vo.getClsf());
	}
	
	/**
     * 산업기술 중분류
     * @param  ResIndTeccVo
     * @return List<ResIndTeccVo>
     * @throws Exception
     */   
	public List<ResIndTeccVo> selectResIndTeccMidClsf(ResIndTeccVo vo) throws KitechException{
		return resCommDAO.selectResIndTeccMidClsf(vo);
	}
	
	/**
     * 산업기술 소분류
     * @param  ResIndTeccVo
     * @return List<ResIndTeccVo>
     * @throws Exception
     */ 
	public List<ResIndTeccVo> selectResIndTeccSmlClsf(ResIndTeccVo vo) throws KitechException{
		return resCommDAO.selectResIndTeccList(vo);
	}
	
	/**
     * 중분류검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)
     * @param XodxCommstVo
     * @return List<XodxCommstVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.25.
     */
	public List<XodxCommstVo> selectXodxCommstMidClsf(XodxCommstVo vo) throws KitechException{
		return resCommDAO.selectXodxCommstMidClsf(vo.getCd_clsf());
	}
	
	/**
     * 코드검색(TRL단계분류,과학기술표준분류,미래유망 신기술(6T) 분류,국가기술지도(NTRM)분류)
     * @param XodxCommstVo
     * @return List<XodxCommstVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.25.
     */
	public List<XodxCommstVo> selectXodxCommstMngmt(XodxCommstVo vo) throws KitechException{
		return resCommDAO.selectXodxCommstMngmt(vo);
	}
}
