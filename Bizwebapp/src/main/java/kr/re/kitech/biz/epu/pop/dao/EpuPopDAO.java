package kr.re.kitech.biz.epu.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.epu.pop.vo.EpuContrctChngVo;
import kr.re.kitech.biz.epu.pop.vo.ProdItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurAccntRemainDayVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqCostVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqDelyVo;
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
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 구매 팝업 
 * @Class Name : EpuPopDAO.java
 * @Description : 구매 팝업  DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/27   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("epuPopDAO")
public class EpuPopDAO extends BizDefaultAbstractDAO {
	/**
     * 품목내역 목록조회를 한다.
     * @param vo 품목내역마스터 ProdItemVo
     * @return 품목내역  List<ProdItemVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ProdItemVo> selectListProdItem(ProdItemVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.epu.pop.selectListProdItem", vo);
    }
    
    /**
     * 하위 품목내역 목록조회를 한다.
     * @param vo 품목내역마스터 ProdItemVo
     * @return 하위 품목내역  List<ProdItemVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ProdItemVo> selectListProdItemCell(ProdItemVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.epu.pop.selectListProdItemCell", vo);
    }
    
    /**
     * 검색된 품목내역 목록를 조회 한다.
     * @param vo 품목내역마스터 ProdItemVo
     * @return 하위 품목내역  List<ProdItemVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ProdItemVo> selectListSchProdItem(ProdItemVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.epu.pop.selectListSchProdItem", vo);
    }
    
    /**
     * 구매요구번호 물품 단건 조회 한다.
     * @param vo 물품정보 PurItemVo
     * @return 물품정보 PurItemVo
     * @throws Exception
     */
    public PurItemVo selectPurItem(PurItemVo vo) throws KitechException {
        return (PurItemVo) selectByPk("kr.re.kitech.biz.epu.pop.selectPurItem", vo);
    }
    
    /**
     * 구매요구 사양서 조회
     * @param PurReqSpecVo
     * @return PurReqSpecVo
     * @throws Exception
     */
    public PurReqSpecVo selectPurReqSpec(PurReqSpecVo vo) throws KitechException{
    	return (PurReqSpecVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurReqSpec", vo);
    }
    
    /**
     * 구매요구 사양서 저장
     * @param PurReqSpecVo
     * @return int
     * @throws Exception
     */
    public int insertPurReqSpec(PurReqSpecVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.epu.pop.insertPurReqSpec", vo);
    }
    
    /**
     * 구매요구 사양서 수정
     * @param PurReqSpecVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqSpec(PurReqSpecVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.pop.updatePurReqSpec", vo);
    }
    
    /**
     * 구매요구 견적서 조회
     * @param PurSrcVo
     * @return List<PurReqEvalVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PurReqEvalVo> selectPurReqEval(PurSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectPurReqEval", vo);
    }
    
    /**
     * 구매요구 견적서 저장
     * @param PurReqEvalVo
     * @return int
     * @throws Exception
     */
    public int insertPurReqEval(PurReqEvalVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.epu.pop.insertPurReqEval", vo);
    }
    
    /**
     * 구매요구 견적서 수정
     * @param PurReqEvalVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqEval(PurReqEvalVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.pop.updatePurReqEval", vo);
    }
    
    /**
     * 구매요구 견적서 삭제
     * @param PurReqEvalVo
     * @return int
     * @throws Exception
     */
    public int deletePurReqEval(PurReqEvalVo vo) throws KitechException{
    	return delete("kr.re.kitech.biz.epu.pop.deletePurReqEval", vo);
    }
    
    /**
     * 구매요구 용도설명서 조회
     * @param String
     * @return PurReqUsgVo
     * @throws Exception
     */
    public PurReqUsgVo selectPurReqUsg(String purReqNo) throws KitechException{
    	return (PurReqUsgVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurReqUsg", purReqNo);
    }
    
     /**
     * 구매요구 용도설명서 저장
     * @param PurReqUsgVo
     * @return int
     * @throws Exception
     */
    public int mergePurReqUsg(PurReqUsgVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.pop.mergePurReqUsg", vo);
    }
    
    /**
     * 특정구매요구서 조회
     * @param PurReqSpcficVo
     * @return PurReqSpcficVo
     * @throws Exception
     */
    public PurReqSpcficVo selectPurReqSpcfic(PurReqSpcficVo vo) throws KitechException{
    	return (PurReqSpcficVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurReqSpcfic", vo);
    }
    
    /**
     * 구매요구번호 조회
     * @param PurSrcVo
     * @return List<PurReqMastrMngVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PurReqMastrMngVo> selectPurReqPopList(PurSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectPurReqPopList", vo);
    }
    
    /**
     * 긴급구매사유서/시방서/사업계획서,내부결재품의/과업지시서 조회
     * @param PurReqDelyVo
     * @return PurReqDelyVo
     * @throws Exception
     */
    public PurReqDelyVo selectPurReqDely(PurReqDelyVo vo) throws KitechException{
    	return (PurReqDelyVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurReqDely", vo);
    }
    
    /**
     * 긴급구매사유서/시방서/사업계획서,내부결재품의/과업지시서 저장
     * @param PurReqDelyVo
     * @return int
     * @throws Exception
     */
    public int mergePurReqDely(PurReqDelyVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.pop.mergePurReqDely", vo);
    }
    
    /**
     * 원가계산서 조회
     * @param PurReqCostVo
     * @return PurReqCostVo
     * @throws Exception
     */
    public PurReqCostVo selectPurReqCost(PurReqCostVo vo) throws KitechException{
    	return (PurReqCostVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurReqCost", vo);
    }
    
    /**
     * 원가계산서 저장
     * @param PurReqCostVo
     * @return int
     * @throws Exception
     */
    public int mergePurReqCost(PurReqCostVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.pop.mergePurReqCost", vo);
    }
    
    /**
     * 계속연차확인신청 조회
     * @param PurContAnnlReqVo
     * @return PurContAnnlReqVo
     * @throws Exception
     */
    public PurContAnnlReqVo selectPurContAnnlReq(PurContAnnlReqVo vo) throws KitechException{
    	return (PurContAnnlReqVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurContAnnlReq", vo);
    }
    
    /**
     * 계속연차확인 과제정보 조회
     * @param String
     * @return List<PurContAnnlPrjVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PurContAnnlPrjVo> selectPurContAnnlPrj(String purReqNo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectPurContAnnlPrj", purReqNo);
    }
    
    /**
     * 구매 계정번호 잔여일수 조회
     * @param PurAccntRemainDayVo
     * @return PurAccntRemainDayVo
     * @throws Exception
     */
    public PurAccntRemainDayVo selectPurAccntRemainDay(PurAccntRemainDayVo vo) throws KitechException{
    	return (PurAccntRemainDayVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurAccntRemainDay", vo);
    }
    
    /**
     * 구매공고 상태 리스트 조회
     * @param String
     * @return List<PurReqProgrsStatusVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PurReqNotiStatusVo> selectPurReqNotiList(String purReqNo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectPurReqNotiList", purReqNo);
    }
    
    /**
     * 구매 조달 진행상태 조회
     * @param String
     * @return List<PurReqProgrsStatusVo>
     * @throws Exception
     */
    public PurReqProgrsVo selectPurReqProgrs(PurSrcVo vo) throws KitechException{
    	return (PurReqProgrsVo)selectByPk("kr.re.kitech.biz.epu.pop.selectPurReqProgrs", vo);
    }
    
    /**
     * 구매요구관리 최근 환율정보 조회
     * @param XodpExchVo
     * @return XodpExchVo
     * @throws KitechException
     */
    public XodpExchVo selectCurncyUnit(XodpExchVo vo) throws KitechException{
    	return (XodpExchVo)selectByPk("kr.re.kitech.biz.epu.pop.selectCurncyUnit", vo);
    }
    
    /**
     * 연구장비심의 등록 팝업 조회
     * @param PurAccntResMateVo
     * @return List<PurAccntResMateVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PurReqAccntVo> selectPurReqAccntMate(PurSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectPurReqAccntMate", vo);
    }
    
    /**
     * 연구장비심의 저장
     * @param PurReqAccntVo
     * @return int
     * @throws Exception
     */
    public int updatePurReqAccnt(PurReqAccntVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.epu.req.updatePurReqAccnt", vo);
    }
    
    /**
     * 참여업체현황 팝업 조회
     * @param ResInpPacoVo
     * @return List<ResInpPacoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<ResInpPacoVo> selectResInpPacoPop(ResInpPacoVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectResInpPacoPop", vo);
    }
    
    /**
     * 계약변경신청 내역 조회(팝업)
     * @param EpuContrctChngVo
     * @return List<EpuContrctChngVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public List<EpuContrctChngVo> selectEpuContrctChngPop(EpuContrctChngVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.epu.pop.selectEpuContrctChngPop", vo);
    }
    
    /**
     * 부서정보에서 편성구분(fomat_unit) 및 관리주체(ARB) 조회
     * @param EpuContrctChngVo
     * @return EpuContrctChngVo
     * @throws Exception
     */
    public EpuContrctChngVo selectDeptFomatUn(EpuContrctChngVo vo) throws KitechException{
    	return (EpuContrctChngVo)selectByPk("kr.re.kitech.biz.epu.pop.selectDeptFomatUn", vo);
    }
}
