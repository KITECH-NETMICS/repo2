/**
 * 
 */
package kr.re.kitech.biz.epu.pop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.epu.pop.service.EpuPopService;
import kr.re.kitech.biz.epu.pop.vo.EpuContrctChngVo;
import kr.re.kitech.biz.epu.pop.vo.ProdItemListVo;
import kr.re.kitech.biz.epu.pop.vo.ProdItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurAccntRemainDayVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlInfoVo;
import kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo;
import kr.re.kitech.biz.epu.pop.vo.PurItemVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqAccntListVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqCostVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqDelyVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqEvalListVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqEvalVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqNotiStatusVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqSpecVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqUsgVo;
import kr.re.kitech.biz.epu.pop.vo.ResInpPacoVo;
import kr.re.kitech.biz.epu.pop.vo.XodpExchVo;
import kr.re.kitech.biz.epu.req.vo.PurReqAccntVo;
import kr.re.kitech.biz.epu.req.vo.PurReqMastrMngVo;
import kr.re.kitech.biz.epu.req.vo.PurSrcVo;

/**  
 * @ClassSubJect 구매 팝업 Controller
 * @Class Name : EpuPopController.java
 * @Description : 구매 팝업을 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/27   이영희          최초생성
 * 
 * @author 이영희
 * @since 2022/05/27
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class EpuPopController {
	@Resource(name="epuPopService")
	private EpuPopService popService;
	/**
     * 품목코드 목록을 조회합니다.
     * @param prodItemVo 품목코드마스터 ProdItemVo
     * @return 품목코드조회 결과
     * @throws Exception
     */
    @ElService(key="SvcProdItemList")
    @RequestMapping(value="SvcProdItemList")    
    @ElDescription(sub="품목코드마스터 목록조회",desc="품목코드마스터 목록 조회를 한다.")               
    public ProdItemListVo selectListProdItem(ProdItemVo vo) throws Exception {   
        List<ProdItemVo> prodItemList = popService.selectListProdItem(vo);
        
		ProdItemListVo retVo = new ProdItemListVo();
		retVo.setDataListVo(prodItemList);
		retVo.setTotalCount(Long.valueOf(prodItemList.size()));

        return retVo;             
    }
    
    /**
     * 하위 품목코드 목록을 조회합니다.
     * @param prodItemVo 품목코드마스터 ProdItemVo
     * @return 하위 품목코드조회 결과
     * @throws Exception
     */
    @ElService(key="SvcProdItemCellList")
    @RequestMapping(value="SvcProdItemCellList")    
    @ElDescription(sub="하위 품목코드마스터 목록조회",desc="하위 품목코드마스터 목록 조회를 한다.")               
    public ProdItemListVo selectListProdItemCell(ProdItemVo vo) throws Exception {   
        List<ProdItemVo> prodItemList = popService.selectListProdItemCell(vo);
        
		ProdItemListVo retVo = new ProdItemListVo();
		retVo.setDataListVo(prodItemList);
		retVo.setTotalCount(Long.valueOf(prodItemList.size()));

        return retVo;             
    }
    
    /**
     * 검색된 품목코드 목록을 조회합니다.
     * @param prodItemVo 품목코드마스터 ProdItemVo
     * @return 검색된 품목코드조회 결과
     * @throws Exception
     */
    @ElService(key="SvcProdItemSchData")
    @RequestMapping(value="SvcProdItemSchData")    
    @ElDescription(sub="검색된 품목코드마스터 목록조회",desc="검색된 품목코드마스터 목록 조회를 한다.")               
    public ProdItemListVo selectListSchProdItem(ProdItemVo vo) throws Exception {   
        List<ProdItemVo> prodItemSchList = popService.selectListSchProdItem(vo);
        
		ProdItemListVo retVo = new ProdItemListVo();
		retVo.setDataListVo(prodItemSchList);
		retVo.setTotalCount(Long.valueOf(prodItemSchList.size()));

        return retVo;             
    }
    
    /**
     * 구매요구번호 물품 단건 조회 처리 한다.
     * @param purItemVo 예실조회마스터 PurItemVo
     * @return 구매요구번호 물품 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcPurItemData")    
    @RequestMapping(value="SvcPurItemData") 
    @ElDescription(sub = "구매요구번호 물품 단건을 위한 조회", desc = "구매요구번호 물품 단건을 위한 조회를 한다.")    
    public PurItemVo selectPurItem(PurItemVo vo) throws Exception {		
        return popService.selectPurItem(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR01")
	@RequestMapping(value = "SvcEPUREQPOPR01")
	@ElDescription(sub = "구매요구 사양서 조회", desc = "구매요구작성에서 사양서를 조회한다.")
	@ElValidator(errUrl = "")
	public PurReqSpecVo selectPurReqSpec(PurReqSpecVo vo) throws Exception{
    	return popService.selectPurReqSpec(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPM01")
	@RequestMapping(value = "SvcEPUREQPOPM01")
	@ElDescription(sub = "구매요구서 사양서 저장", desc = "구매요구서에서 사양서를 저장한다.")
	@ElValidator(errUrl = "")
	public void savePurReqSpec(PurReqSpecVo vo) throws Exception{
    	popService.savePurReqSpec(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR02")
	@RequestMapping(value = "SvcEPUREQPOPR02")
	@ElDescription(sub = "구매요구서 견적서 조회", desc = "구매요구서 견적서를 조회한다.")
	@ElValidator(errUrl = "")
	public List<PurReqEvalVo> selectPurReqEval(PurSrcVo vo) throws Exception{
    	return popService.selectPurReqEval(vo);
    }

	@ElService(key = "SvcEPUREQPOPM02")
	@RequestMapping(value = "SvcEPUREQPOPM02")
	@ElDescription(sub = "구매요구서 견적서 저장", desc = "구매요구서 견적서를 저장한다.")
	@ElValidator(errUrl = "")
	public void savePurReqEval(PurReqEvalListVo vo) throws Exception{
    	popService.savePurReqEval(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR03")
	@RequestMapping(value = "SvcEPUREQPOPR03")
	@ElDescription(sub = "구매요구서 용도설명서 조회", desc = "구매요구서 용도설명서를 조회한다.")
	@ElValidator(errUrl = "")
	public PurReqUsgVo selectPurReqUsg(PurReqUsgVo vo) throws Exception{
    	return popService.selectPurReqUsg(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPM03")
	@RequestMapping(value = "SvcEPUREQPOPM03")
	@ElDescription(sub = "구매요구서 용도설명서 저장", desc = "구매요구서 용도설명서를 저장한다.")
	@ElValidator(errUrl = "")
	public void savePurReqUsg(PurReqUsgVo vo) throws Exception{
    	popService.savePurReqUsg(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR04")
	@RequestMapping(value = "SvcEPUREQPOPR04")
	@ElDescription(sub = "특정구매요구서 조회", desc = "특정구매요구서를 조회한다.")
	@ElValidator(errUrl = "")
	public PurReqSpcficVo selectPurReqSpcfic(PurReqSpcficVo vo) throws Exception{
    	return popService.selectPurReqSpcfic(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR05")
	@RequestMapping(value = "SvcEPUREQPOPR05")
	@ElDescription(sub = "구매요구번호 조회", desc = "구매요구번호 검색팝업에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<PurReqMastrMngVo> selectPurReqPopList(PurSrcVo vo) throws Exception{
    	return popService.selectPurReqPopList(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR06")
	@RequestMapping(value = "SvcEPUREQPOPR06")
	@ElDescription(sub = "긴급구매사유서/시방서/사업계획서, 내부결재품의/과업지시서 조회", desc = "긴급구매사유서/시방서/사업계획서, 내부결재품의/과업지시서를 조회한다.")
	@ElValidator(errUrl = "")
	public PurReqDelyVo selectPurReqDely(PurReqDelyVo vo) throws Exception{
    	return popService.selectPurReqDely(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPM04")
	@RequestMapping(value = "SvcEPUREQPOPM04")
	@ElDescription(sub = "긴급구매사유서/시방서/사업계획서,내부결재품의/과업지시서 저장", desc = "긴급구매사유서/시방서/사업계획서,내부결재품의/과업지시서를 저장한다.")
	@ElValidator(errUrl = "")
	public void savePurReqDely(PurReqDelyVo vo) throws Exception{
    	popService.savePurReqDely(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR07")
	@RequestMapping(value = "SvcEPUREQPOPR07")
	@ElDescription(sub = "원가계산서 조회", desc = "구매요구서 원가계산서를 조회한다.")
	@ElValidator(errUrl = "")
	public PurReqCostVo selectPurReqCost(PurReqCostVo vo) throws Exception{
    	return popService.selectPurReqCost(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPM05")
	@RequestMapping(value = "SvcEPUREQPOPM05")
	@ElDescription(sub = "구매요구서 원가계산서 저장", desc = "구매요구서 원가계산서를 저장한다.")
	@ElValidator(errUrl = "")
	public void savePurReqCost(PurReqCostVo vo) throws Exception{
    	popService.savePurReqCost(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR08")
	@RequestMapping(value = "SvcEPUREQPOPR08")
	@ElDescription(sub = "계속연차확인신청 조회", desc = "계속연차확인신청 및 과제정보를 조회한다.")
	@ElValidator(errUrl = "")
	public PurContAnnlInfoVo selectPurContAnnlInfo(PurContAnnlReqVo vo) throws Exception{
    	return popService.selectPurContAnnlInfo(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR09")
	@RequestMapping(value = "SvcEPUREQPOPR09")
	@ElDescription(sub = "구매 계정번호 잔여일수 조회", desc = "구매 계정번호 잔여일수 조회")
	@ElValidator(errUrl = "")
	public PurAccntRemainDayVo selectPurAccntRemainDay(PurAccntRemainDayVo vo) throws Exception{
    	return popService.selectPurAccntRemainDay(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR10")
	@RequestMapping(value = "SvcEPUREQPOPR10")
	@ElDescription(sub = "구매공고 상태 리스트 조회", desc = "구매요구조달진행상태팝업에서 구매공고리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<PurReqNotiStatusVo> selectPurReqNotiList(PurSrcVo vo) throws Exception{
    	return popService.selectPurReqNotiList(vo.getPur_req_no());
    }
    
    @ElService(key = "SvcEPUREQPOPR11")
	@RequestMapping(value = "SvcEPUREQPOPR11")
	@ElDescription(sub = "연구장비심의 등록 팝업 조회", desc = "구매요구 계정번호추가 팝업에서 연구장비심의내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<PurReqAccntVo> selectPurReqAccntMate(PurSrcVo vo) throws Exception{
    	return popService.selectPurReqAccntMate(vo);
    }

	@ElService(key = "SvcEPUREQPOPR12")
	@RequestMapping(value = "SvcEPUREQPOPR12")
	@ElDescription(sub = "구매요구관리 최근 환율정보 조회", desc = "구매요구관리 최근 환율정보 조회")
	@ElValidator(errUrl = "")
	public XodpExchVo selectCurncyUnit(XodpExchVo vo) throws Exception{
    	return popService.selectCurncyUnit(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPU01")
	@RequestMapping(value = "SvcEPUREQPOPU01")
	@ElDescription(sub = "연구장비심의저장", desc = "연구장비등록팝업에서 연구장비심의내역을 저장한다.")
	@ElValidator(errUrl = "")
	public void saveResEquipConsttn(PurReqAccntListVo vo) throws Exception{    	
    	popService.saveResEquipConsttn(vo.getAccntList());
    }
    
    @ElService(key = "SvcEPUREQPOPR13")
    @RequestMapping(value = "SvcEPUREQPOPR13")
    @ElDescription(sub = "참여업체현황 팝업 조회", desc = "참여업체현황 팝업에서 참여업체현황 내역을 조회한다.")
    @ElValidator(errUrl = "")
    public List<ResInpPacoVo> selectResInpPacoPop(ResInpPacoVo vo) throws Exception{
    	return popService.selectResInpPacoPop(vo);
    }
    
    @ElService(key = "SvcEPUREQPOPR14")
    @RequestMapping(value = "SvcEPUREQPOPR14")
    @ElDescription(sub = "계약변경신청 내역 조회(팝업)", desc = "계약번호 찾기 팝업에서 계약변경신청 내역을 조회한다.")
    @ElValidator(errUrl = "")
    public List<EpuContrctChngVo> selectEpuContrctChngPop(EpuContrctChngVo vo) throws Exception{
    	return popService.selectEpuContrctChngPop(vo);
    }
    @ElService(key = "SvcEPUREQPOPR15")
    @RequestMapping(value = "SvcEPUREQPOPR15")
    @ElDescription(sub = "부서정보에서 편성구분(fomat_unit) 조회", desc = "계약번호 찾기 팝업에서 부서정보에서 편성구분(fomat_unit)을 조회한다.")
    @ElValidator(errUrl = "")
    public EpuContrctChngVo selectDeptFomatUn(EpuContrctChngVo vo) throws Exception{
    	return popService.selectDeptFomatUn(vo);
    }
    
}
