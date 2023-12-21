package kr.re.kitech.biz.epu.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.epu.pop.dao.EpuPopDAO;
import kr.re.kitech.biz.epu.pop.service.EpuPopService;
import kr.re.kitech.biz.epu.pop.vo.EpuContrctChngVo;
import kr.re.kitech.biz.epu.pop.vo.ProdItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurAccntRemainDayVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlInfoVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqCostVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqDelyVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqEvalListVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqNotiStatusVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqProgrsVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpecVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqUsgVo;
import kr.re.kitech.biz.epu.pop.vo.ResInpPacoVo;
import kr.re.kitech.biz.epu.pop.vo.XodpExchVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAccntVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 공통팝업 조회를 담당하는 인터페이스
 * @Class Name : CommonPopService.java
 * @Description : 공통팝업 조회를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 */
@Service("epuPopService")
public class EpuPopServiceImpl extends EgovAbstractServiceImpl implements EpuPopService {
	@Resource(name="epuPopDAO")
	private EpuPopDAO popDao;
	/**
    * 품목내역 목록조회
    * @param ProdItemVo
    * @return List<ProdItemVo>
    * @author 박병목
    * @since 2022.04.27.
    */
	public List<ProdItemVo> selectListProdItem(ProdItemVo vo) throws KitechException {        
        return popDao.selectListProdItem(vo);	
	}
	
	/**
    * 하위 품목내역 목록조회
    * @param ProdItemVo
    * @return List<ProdItemVo>
    * @author 박병목
    * @since 2022.04.27.
    */
	public List<ProdItemVo> selectListProdItemCell(ProdItemVo vo) throws KitechException {        
        return popDao.selectListProdItemCell(vo);	
	}
	
	/**
    * 검색된 품목내역 목록조회
    * @param ProdItemVo
    * @return List<ProdItemVo>
    * @author 박병목
    * @since 2022.05.02.
    */
	public List<ProdItemVo> selectListSchProdItem(ProdItemVo vo) throws KitechException {        
        return popDao.selectListSchProdItem(vo);	
	}
	
	/**
    * 구매요구번호 물품 단건조회
    * @param PurItemVo
    * @return PurItemVo
    * @author 박병목
    * @since 2022.05.02.
    */
	public PurItemVo selectPurItem(PurItemVo vo) throws KitechException {        
        return popDao.selectPurItem(vo);
	}
	
	/**
     * 구매요구 사양서 조회
     * @param PurReqSpecVo
     * @return PurReqSpecVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.02.
     */
    public PurReqSpecVo selectPurReqSpec(PurReqSpecVo vo) throws KitechException{
    	return popDao.selectPurReqSpec(vo);
    }
    
    /**
     * 구매요구 사양서 저장
     * @param PurReqSpecVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.02.
     */
    public void savePurReqSpec(PurReqSpecVo vo) throws KitechException{
    	if("C".equals(vo.getCud_type())){
    		popDao.insertPurReqSpec(vo);
    	}else{
    		popDao.updatePurReqSpec(vo);
    	}
    }
    
    /**
     * 구매요구 견적서 조회
     * @param PurSrcVo
     * @return List<PurReqEvalVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.02.
     */
    public List<PurReqEvalVo> selectPurReqEval(PurSrcVo vo) throws KitechException{
    	return popDao.selectPurReqEval(vo);
    }
    
     /**
     * 구매요구 견적서 저장
     * @param List<PurReqEvalVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.05.
     */
    public void savePurReqEval(PurReqEvalListVo evalVo) throws KitechException{
    	List<PurReqEvalVo> evalList = evalVo.getEvalList();
    	for(PurReqEvalVo vo : evalList){    		
    		if("C".equals(vo.getCud_type())){
    			popDao.insertPurReqEval(vo);
    		}else if("U".equals(vo.getCud_type())){
    			popDao.updatePurReqEval(vo);
    		}else if("D".equals(vo.getCud_type())){
    			popDao.deletePurReqEval(vo);
    		}
    	}
    }
    
    /**
     * 구매요구 용도설명서 조회
     * @param PurReqUsgVo
     * @return PurReqUsgVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.05.
     */
    public PurReqUsgVo selectPurReqUsg(PurReqUsgVo vo) throws KitechException{
    	return popDao.selectPurReqUsg(vo.getPur_req_no());
    }
    
    /**
     * 구매요구 용도설명서 저장
     * @param PurReqUsgVo
     * @return PurReqUsgVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.05.
     */
    public void savePurReqUsg(PurReqUsgVo vo) throws KitechException{
    	popDao.mergePurReqUsg(vo);
    }
    
    /**
     * 특정구매요구서 조회
     * @param PurReqSpcficVo
     * @return PurReqSpcficVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.06.
     */
    public PurReqSpcficVo selectPurReqSpcfic(PurReqSpcficVo vo) throws KitechException{
    	return popDao.selectPurReqSpcfic(vo);
    }
    
    /**
     * 구매요구번호 조회
     * @param PurSrcVo
     * @return List<PurReqMastrMngVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.06.
     */
    public List<PurReqMastrMngVo> selectPurReqPopList(PurSrcVo vo) throws KitechException{
    	return popDao.selectPurReqPopList(vo);
    }
    
    /**
     * 긴급구매사유서/시방서/사업계획서,내부결재품의/과업지시서 조회
     * @param PurReqDelyVo
     * @return PurReqDelyVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.07.
     */
    public PurReqDelyVo selectPurReqDely(PurReqDelyVo vo) throws KitechException{
    	return popDao.selectPurReqDely(vo);
    }
    
    /**
     * 긴급구매사유서/시방서/사업계획서,내부결재품의/과업지시서 저장
     * @param PurReqDelyVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.07.
     */
    public void savePurReqDely(PurReqDelyVo vo) throws KitechException{
    	popDao.mergePurReqDely(vo);
    }
    
    /**
     * 원가계산서 조회
     * @param PurReqCostVo
     * @return PurReqCostVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.08.
     */
    public PurReqCostVo selectPurReqCost(PurReqCostVo vo) throws KitechException{
    	return popDao.selectPurReqCost(vo);
    }
    
    /**
     * 원가계산서 저장
     * @param PurReqCostVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.08.
     */
    public void savePurReqCost(PurReqCostVo vo) throws KitechException{
    	popDao.mergePurReqCost(vo);
    }
    
    /**
     * 계속연차확인서 조회
     * @param PurContAnnlInfoVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.08.
     */
    public PurContAnnlInfoVo selectPurContAnnlInfo(PurContAnnlReqVo vo) throws KitechException{
    	PurContAnnlInfoVo retVo = new PurContAnnlInfoVo();
    	// 계속연차확인
    	retVo.setReqVo(popDao.selectPurContAnnlReq(vo));
    	// 과제정보 조회
    	if(StringUtils.isEmpty(vo.getPur_req_no())){
    		vo.setPur_req_no(retVo.getReqVo().getPur_req_no());
    	}
    	retVo.setPrjList(popDao.selectPurContAnnlPrj(vo.getPur_req_no()));
    	return retVo;
    }
    
    /**
     * 구매 계정번호 잔여일수 조회
     * @param PurAccntRemainDayVo
     * @return PurAccntRemainDayVo
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.08.
     */
	public PurAccntRemainDayVo selectPurAccntRemainDay(PurAccntRemainDayVo vo) throws KitechException{
		return popDao.selectPurAccntRemainDay(vo);
	}
	
	/**
     * 구매공고 상태 리스트 조회
     * @param String
     * @return List<PurReqProgrsStatusVo>
     * @throws Exception
     * @author LeeYH
     * @since 2023.01.09.
     */
	public List<PurReqNotiStatusVo> selectPurReqNotiList(String purReqNo) throws KitechException{
		return popDao.selectPurReqNotiList(purReqNo);
	}
	
	 /**
     * 구매 조달 진행상태 조회
     * @param String
     * @return List<PurReqProgrsStatusVo>
     * @throws Exception
     * @author LeeYH
     * @since 2023.01.09.
     */
    public PurReqProgrsVo selectPurReqProgrs(PurSrcVo vo) throws KitechException{
    	return popDao.selectPurReqProgrs(vo);
    }
    
    /**
     * 연구장비심의 등록 팝업 조회
     * @param PurSrcVo
     * @return List<PurReqAccntVo>
     * @throws Exception
     * @author LeeYH
     * @since 2023.03.09.
     */
	public List<PurReqAccntVo> selectPurReqAccntMate(PurSrcVo vo) throws KitechException{
		return popDao.selectPurReqAccntMate(vo);
	}
	
	/**
     * 구매요구관리 최근 환율정보 조회
     * @param PurSrcVo
     * @return List<PurReqAccntVo>
     * @throws KitechException
     * @author 
     * @since 2023.09.25.
     */
	public XodpExchVo selectCurncyUnit(XodpExchVo vo) throws KitechException{
		return popDao.selectCurncyUnit(vo);
	}
	
	/**
     * 연구장비심의 저장
     * @param PurReqAccntVo
     * @throws Exception
     * @author LeeYH
     * @since 2023.03.21.
     */
	public void saveResEquipConsttn(List<PurReqAccntVo> accntList) throws KitechException{
	    for(PurReqAccntVo accntVo : accntList){
	    	popDao.updatePurReqAccnt(accntVo);
	    }
	}
	
	/**
	 * 참여업체현황 팝업 조회
	 * @param ResInpPacoVo
	 * @return List<ResInpPacoVo>
	 * @throws Exception
	 * @author lsh
	 * @since 2023.10.25.
	 */
	public List<ResInpPacoVo> selectResInpPacoPop(ResInpPacoVo vo) throws KitechException{
		return popDao.selectResInpPacoPop(vo);
	}
	
	/**
	 * 계약변경신청 내역 조회(팝업)
	 * @param EpuContrctChngVo
	 * @return List<EpuContrctChngVo>
	 * @throws Exception
	 * @author lsh
	 * @since 2023.10.26.
	 */
	public List<EpuContrctChngVo> selectEpuContrctChngPop(EpuContrctChngVo vo) throws KitechException{
		return popDao.selectEpuContrctChngPop(vo);
	}
	
	/**
	 * 부서정보에서 편성구분(fomat_unit) 및 관리주체(ARB) 조회
	 * @param EpuContrctChngVo
	 * @return EpuContrctChngVo
	 * @throws Exception
	 * @author lsh
	 * @since 2023.10.26.
	 */
	public EpuContrctChngVo selectDeptFomatUn(EpuContrctChngVo vo) throws KitechException{
		return popDao.selectDeptFomatUn(vo);
	}
}
