package kr.re.kitech.biz.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.com.service.CommonPopService;
import kr.re.kitech.biz.com.vo.AccntCdPopupListVo;
import kr.re.kitech.biz.com.vo.AccntCdPopupVo;
import kr.re.kitech.biz.com.vo.AccntNoPopupListVo;
import kr.re.kitech.biz.com.vo.AccntNoPopupVo;
import kr.re.kitech.biz.com.vo.AccntNoSrcVo;
import kr.re.kitech.biz.com.vo.BankAccntVo;
import kr.re.kitech.biz.com.vo.BblBugtActRsltListVo;
import kr.re.kitech.biz.com.vo.BblBugtActRsltVo;
import kr.re.kitech.biz.com.vo.ComPopSearchVo;
import kr.re.kitech.biz.com.vo.DeptInfoListVo;
import kr.re.kitech.biz.com.vo.DeptInfoVo;
import kr.re.kitech.biz.com.vo.FbaItmBaseVo;
import kr.re.kitech.biz.com.vo.FbaItmExpnsListVo;
import kr.re.kitech.biz.com.vo.FbaItmExpnsVo;
import kr.re.kitech.biz.com.vo.FibkAccntHisListVo;
import kr.re.kitech.biz.com.vo.HumBasicInfoListVo;
import kr.re.kitech.biz.com.vo.HumBasicInfoVo;
import kr.re.kitech.biz.com.vo.HumComUserSelListVo;
import kr.re.kitech.biz.com.vo.HumComUserSelVo;
import kr.re.kitech.biz.com.vo.OzrInFoVo;
import kr.re.kitech.biz.com.vo.OzrInfoListVo;
import kr.re.kitech.biz.com.vo.PrjNoPopupListVo;
import kr.re.kitech.biz.com.vo.PrjNoSrcVo;
import kr.re.kitech.biz.com.vo.ResConfPoolReqListVo;
import kr.re.kitech.biz.com.vo.ResInpMatePopVo;
import kr.re.kitech.biz.com.vo.ResInpPareVo;
import kr.re.kitech.biz.com.vo.SfcChmclsSafeVo;
import kr.re.kitech.biz.com.vo.SptCtiCunslListVo;
import kr.re.kitech.biz.com.vo.SptCtiCunslVo;
import kr.re.kitech.biz.com.vo.XodfVendListVo;
import kr.re.kitech.biz.com.vo.XodfVendVo;
import kr.re.kitech.biz.com.vo.XomxMenuListVo;
import kr.re.kitech.biz.com.vo.XomxMenuVo;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.fin.std.vo.FcpDepstVo;
import kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

/**  
 * @ClassSubJect 공통팝업 검색을 처리하는 컨트롤러
 * @Class Name CommonPopController.java
 * @Description 공통팝업 검색을 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13     박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CommonPopController {
	@Resource(name="commonPopService")
	private CommonPopService popService;
	
	/**
     * 회계코드마스터 목록을 조회합니다.
     * @param accntCdPopupVo 회계코드마스터 AccntCdPopupVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcAccntCdListView")
    @RequestMapping(value="SvcAccntCdListView")    
    @ElDescription(sub="회계코드마스터 목록조회",desc="회계코드마스터 목록 조회를 한다.")               
    public AccntCdPopupListVo selectAccntCdList(AccntCdPopupVo vo) throws Exception {    	   	

        List<AccntCdPopupVo> accntCdPopupList = popService.selectAccntCdList(vo);
	
		AccntCdPopupListVo retVo = new AccntCdPopupListVo();
		retVo.setAccntCdPopupVoList(accntCdPopupList);
		retVo.setTotalCount(Long.valueOf(accntCdPopupList.size()));
        return retVo;            
    }
    
    /**
     * 계정번호마스터 목록을 조회합니다.
     * @param accntNoPopupVo 계정번호마스터 AccntNoPopupVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcAccntNoPopupList")
    @RequestMapping(value = "SvcAccntNoPopupList")    
    @ElDescription(sub = "계정번호마스터 목록조회", desc = "계정번호마스터 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public AccntNoPopupListVo selectListAccntNoPopup(AccntNoSrcVo vo) throws Exception { 
        List<AccntNoPopupVo> accntNoPopupList = popService.selectListAccntNoPopup(vo);                  
	
		AccntNoPopupListVo retVo = new AccntNoPopupListVo();
		retVo.setAccntNoPopupVoList(accntNoPopupList); 
		retVo.setTotalCount(accntNoPopupList.size());

        return retVo;            
    }
    
    /**
     * 예실조회마스터을 단건 조회 처리 한다.
     * @param bblBugtActRsltVo 예실조회마스터 BblBugtActRsltVo
     * @return 단건 조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcBblBugtInfoView")    
    @RequestMapping(value="SvcBblBugtInfoView") 
    @ElDescription(sub = "예실조회마스터 갱신 폼을 위한 조회", desc = "예실조회마스터 갱신 폼을 위한 조회를 한다.")    
    public BblBugtActRsltVo selectAccntNo(BblBugtActRsltVo vo) throws Exception {		
        return popService.selectAccntNo(vo);
    } 
    
    /**
     * 예실조회마스터 목록을 조회합니다.
     * @param bblBugtActRsltVo 예실조회마스터 BblBugtActRsltVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcBblBugtListView")
    @RequestMapping(value = "SvcBblBugtListView")    
    @ElDescription(sub = "예실조회마스터 목록조회", desc = "예실조회마스터 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public BblBugtActRsltListVo selectBblBugtList(BblBugtActRsltVo vo) throws Exception {   
        List<BblBugtActRsltVo> bblBugtPopupList = popService.selectBblBugtList(vo);
	
		BblBugtActRsltListVo retVo = new BblBugtActRsltListVo();
		retVo.setBblBugtActRsltVoList(bblBugtPopupList);
		retVo.setTotalCount(Long.valueOf(bblBugtPopupList.size()));
        return retVo;            
    }

    @ElService(key = "SvcCOMPOPR01")
    @RequestMapping(value = "SvcCOMPOPR01")    
    @ElDescription(sub = "계좌정보조회", desc = "계좌 및 별도계좌를 조회한다.")
	@ElValidator(errUrl = "")               
    public List<BankAccntVo> selectBankAccntList(BankAccntVo vo) throws Exception {  
        return popService.selectBankAccntList(vo);            
    }
    
    /**
     * 비용코드 목록을 조회합니다.
     * @param FbaItmExpnsVo 비용코드검색 FbaItmExpnsVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcFinComExpnsList")
    @RequestMapping(value = "SvcFinComExpnsList")    
    @ElDescription(sub = "비용코드검색 목록조회", desc = "비용코드 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public FbaItmExpnsListVo selectExpnsList(FbaItmExpnsVo vo) throws Exception {    	   	

        List<FbaItmExpnsVo> fbaItmExpnsList = popService.selectExpnsList(vo);
	
		FbaItmExpnsListVo retVo = new FbaItmExpnsListVo();
		retVo.setFbaItmExpnsVoList(fbaItmExpnsList);
		retVo.setTotalCount(Long.valueOf(fbaItmExpnsList.size()));

        return retVo;            
    }
    
    /**
     * 입금조회마스터 목록을 조회합니다.
     * @param fibkAccntHisVo 입금조회마스터 FibkAccntHisVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcFibkAccntHisListView")
    @RequestMapping(value="SvcFibkAccntHisListView")    
    @ElDescription(sub="입금조회마스터 목록조회",desc="입금조회마스터 목록 조회를 한다.")               
    public FibkAccntHisListVo selectFibkAccntHisList(FndDepstSrcVo vo) throws Exception {  
		FibkAccntHisListVo retVo = new FibkAccntHisListVo();
		retVo.setDataListVo(popService.selectFibkAccntHisList(vo));

        return retVo;            
    }
   
   /**
     * 계좌구분별 계좌목록을 조회합니다.
     * @param fibkAccntHisVo 입금조회마스터 FibkAccntHisVo
     * @return 목록조회 결과
     * @throws Exception
     */
	@ElService(key="SvcAccntNoList")
    @RequestMapping(value="SvcAccntNoList")    
    @ElDescription(sub="계좌목록조회",desc="계좌목록조회")               
    public List<FcpDepstVo> selectBankAccntList(FcpDepstVo vo) throws Exception {  
        return popService.selectBankAccntList(vo);
    }
    
    /**
     * 고객정보 목록을 조회합니다.
     * @param sptCtiCunslVo 고객정보조회 마스터 SptCtiCunslVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcSptCtiCunslListView")
    @RequestMapping(value="SvcSptCtiCunslListView")    
    @ElDescription(sub="고객정보마스터 목록조회",desc="고객정보마스터 목록 조회를 한다.")               
    public SptCtiCunslListVo selectSptCtiCunslList(SptCtiCunslVo vo) throws Exception {    	   	

        List<SptCtiCunslVo> sptCtiCunslList = popService.selectSptCtiCunslList(vo);
	
		SptCtiCunslListVo retVo = new SptCtiCunslListVo();
		retVo.setDataListVo(sptCtiCunslList);
		retVo.setTotalCount(Long.valueOf(sptCtiCunslList.size()));

        return retVo;            
    }
    
    /**
     * 업체 목록을 조회합니다.
     * @param sptCustBaseVo 업체조회 마스터 SptCustBaseVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key="SvcXodfVendListView")
    @RequestMapping(value="SvcXodfVendListView")    
    @ElDescription(sub="업체마스터 목록조회",desc="업체마스터 목록 조회를 한다.")               
    public XodfVendListVo selectXodfVendList(ComPopSearchVo vo) throws Exception {   
        List<XodfVendVo> xodfVendList = popService.selectXodfVendList(vo);
	
		XodfVendListVo retVo = new XodfVendListVo();
		retVo.setDataListVo(xodfVendList);
		retVo.setTotalCount(Long.valueOf(xodfVendList.size()));

        return retVo;            
    }
    
    /**
     * 사용자검색 목록을 조회합니다.
     * @param humComUserSelVo 사용자검색 HumComUserSelVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHumComUserSelList")
    @RequestMapping(value = "SvcHumComUserSelList")    
    @ElDescription(sub = "사용자검색 목록조회", desc = "사용자검색 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public HumComUserSelListVo selectListHumComUserSel(HumComUserSelVo vo) throws Exception {    	   	

        List<HumComUserSelVo> humComUserSelList = popService.selectListHumComUserSel(vo);
	
		HumComUserSelListVo retVo = new HumComUserSelListVo();
		retVo.setHumComUserSelVoList(humComUserSelList);
		retVo.setTotalCount(Long.valueOf(humComUserSelList.size()));

        return retVo;            
    }
    
    /**
     * 부서검색 목록을 조회합니다.
     * @param deptInfoVo 부서검색 DeptInfoVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCodhDeptInfoList")
    @RequestMapping(value = "SvcCodhDeptInfoList")    
    @ElDescription(sub = "부서검색 목록조회", desc = "부서검색 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public DeptInfoListVo selectCodhDeptInfo(DeptInfoVo vo) throws Exception {   
        List<DeptInfoVo> deptInfoList = popService.selectCodhDeptInfo(vo);                  
	
		DeptInfoListVo retVo = new DeptInfoListVo();
		retVo.setDeptInfoVoList(deptInfoList);
		retVo.setTotalCount(Long.valueOf(deptInfoList.size()));

        return retVo;            
    }
    
    /**
     * 사용자 근태현황을 조회합니다.
     * @param HumBasicInfoVo 사용자근태 HumBasicInfoVo
     * @return 사용자 근태조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcHumComInfoListDetail")
    @RequestMapping(value = "SvcHumComInfoListDetail")    
    @ElDescription(sub = "사용자 근태현황 조회", desc = "사용자 근태현황을 조회를 한다.")
	@ElValidator(errUrl = "")               
    public HumBasicInfoListVo selectHumBasicInfoListDetail(HumBasicInfoVo vo) throws Exception {   
        List<HumBasicInfoVo> humComInfoList = popService.selectHumBasicInfoListDetail(vo);
	
		HumBasicInfoListVo retVo = new HumBasicInfoListVo();
		retVo.setHumBasicInfoVoList(humComInfoList);
		retVo.setTotalCount(Long.valueOf(humComInfoList.size()));

        return retVo;            
    }

    @ElService(key = "SvcPrjNoPopupList")
    @RequestMapping(value = "SvcPrjNoPopupList")    
    @ElDescription(sub = "과제정보 팝업 조회", desc = "과제정보 팝업에서 과제정보,연차정보, 참여연구원, 참여기관,연구기자재를 조회한다.")
	@ElValidator(errUrl = "")               
    public PrjNoPopupListVo selectPrjNoPopupInfo(PrjNoSrcVo vo) throws Exception {  
		PrjNoPopupListVo retVo = new PrjNoPopupListVo();
		
		// 참여연구원 조회
		retVo.setPareList(popService.selectResInpPare(vo));
		// 참여업체 조회
		retVo.setPacoList(popService.selectResInpPaco(vo));
		// 연구기자재 조회
		retVo.setMateList( popService.selectListResInpMate(vo));
		
		retVo.setMainVo(popService.selectMainAccntInfo(vo));
		//연차과제정보
		vo.setPrj_no(retVo.getMainVo().getPrj_no());
		retVo.setInpYearList(popService.selectResInpYear(vo));

        return retVo;            
    }
    
    /**
     * 검색된 화면ID 목록을 조회합니다.
     * @param xomxMenuVo 화면ID마스터 XomxMenuVo
     * @return 검색된 화면ID조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcXomxMenuList")
    @RequestMapping(value = "SvcXomxMenuList")    
    @ElDescription(sub = "매뉴리스트 목록조회", desc = "검색된 화면ID마스터 목록 조회를 한다.")
	@ElValidator(errUrl = "")               
    public XomxMenuListVo selectListXomxMenu(XomxMenuVo vo) throws Exception {   
        List<XomxMenuVo> xomxMenuList = popService.selectListXomxMenu(vo);
        
		XomxMenuListVo retVo = new XomxMenuListVo();
		retVo.setDataListVo(xomxMenuList);
		retVo.setTotalCount(Long.valueOf(xomxMenuList.size()));

        return retVo;             
    }
    
    @ElService(key = "SvcCOMPOPR02")
	@RequestMapping(value = "SvcCOMPOPR02")
	@ElDescription(sub = "학술대회 이력 팝업 조회", desc = "학술대회 Pool 이력 팝업에서 신청정보를 조회한다.")
	@ElValidator(errUrl = "")
	public ResConfPoolReqListVo selectResConfPoolReqList(ComPopSearchVo vo) throws Exception{
    	ResConfPoolReqListVo retVo = new ResConfPoolReqListVo();
    	retVo.setPoolList(popService.selectResConfPoolReqList(vo));
    	return retVo;
    }
    
    @ElService(key = "SvcCOMPOPM01")
	@RequestMapping(value = "SvcCOMPOPM01")
	@ElDescription(sub = "학술대회 Pool이력 팝업 저장", desc = "학술대회 Pool이력 팝업에서 신청정보를 저장한다.")
	@ElValidator(errUrl = "")
	public void updateResConfPoolReq(ResConfPoolReqVo vo) throws Exception{
    	popService.updateResConfPoolReq(vo);
    } 
    
    @ElService(key = "SvcCOMPOPD01")
	@RequestMapping(value = "SvcCOMPOPD01")
	@ElDescription(sub = "학술대회이력 Pool신청 삭제", desc = "학술대회이력 Pool신청을 삭제한다.(팝업화면)")
	@ElValidator(errUrl = "")
	public void deleteResConfPoolReq(ResConfPoolReqVo vo) throws Exception{
    	popService.deleteResConfPoolReq(vo);
    }
    
    @ElService(key = "SvcCOMPOPR03")
	@RequestMapping(value = "SvcCOMPOPR03")
	@ElDescription(sub = "oz report 정보 조회", desc = "항목코드로 ozr, odi경로 및 이름을 조회한다.")
	@ElValidator(errUrl = "")
	public OzrInFoVo selectOzrInfo(OzrInFoVo vo) throws Exception{
    	return popService.selectOzrInfo(vo);
    }
    
    @ElService(key = "SvcCOMPOPR04")
	@RequestMapping(value = "SvcCOMPOPR04")
	@ElDescription(sub = "oz report 정보 리스트 조회", desc = "oz report에 대한 path 및 odi 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public OzrInfoListVo selectOzrInfoList(OzrInfoListVo vo) throws Exception{
    	OzrInfoListVo retVo = new OzrInfoListVo();
    	retVo.setOzrInfoList(popService.selectOzrInfoList(vo.getOzrInfoList()));
    	return retVo;
    }
    
    @ElService(key = "SvcCOMPOPR05")
	@RequestMapping(value = "SvcCOMPOPR05")
	@ElDescription(sub = "참여연구원 조회", desc = "참여연구원 조회을 조회한다(과제정보 팝업)")
	@ElValidator(errUrl = "")
	public List<ResInpPareVo> selectPrjPartPsnList(PrjNoSrcVo vo) throws Exception {   
    	return popService.selectResInpPare(vo);
    }
    
    @ElService(key = "SvcCOMPOPR06")
	@RequestMapping(value = "SvcCOMPOPR06")
	@ElDescription(sub = "연구기자재 검색(팝업)", desc = "연구기자재검색팝업에서 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResInpMatePopVo> selectResInpMatePop(ResInpMatePopVo vo) throws Exception{
    	return popService.selectResInpMatePop(vo);
    }
    
    @ElService(key = "SvcCOMPOPR07")
	@RequestMapping(value = "SvcCOMPOPR07")
	@ElDescription(sub = "사전안전성검토 조회(팝업)", desc = "구매요구 및 소액물품검수신청에서 사전안정선검토를 검색한다.")
	@ElValidator(errUrl = "")
	public List<SfcChmclsSafeVo> selectSfcChmclsSafe(SfcChmclsSafeVo vo) throws Exception{
    	return popService.selectSfcChmclsSafe(vo);
    }
    
    @ElService(key = "SvcCOMPOPR08")    
    @RequestMapping(value = "SvcCOMPOPR08")
    @ElDescription(sub = "예외 처리 검증 리스트 저장", desc = "수정된 예외처리 검증 정보를 저장한다.")
    @ElValidator(errUrl = "")    
    public ServiceListVo selectMenuMatchKeyword(ServiceVo service) throws Exception {
    	ServiceListVo retVo = popService.selectMenuMatchKeyword(service);
    	List<ServiceVo> retList = retVo.getServiceVoList();
    	retVo.setTotalCount(retList != null ? retList.size() : 0);
    	
        return retVo;
    }
    
    /**
     * 비용코드 목록을 조회합니다.
     * @param FbaItmBaseVo
     * @return 목록조회 결과
     * @throws Exception
     */
    @ElService(key = "SvcCOMPOPR09")
    @RequestMapping(value = "SvcCOMPOPR09")    
    @ElDescription(sub = "비목해소기준 조회(팝업)", desc = "비목해소기준 조회를 한다.")
	@ElValidator(errUrl = "")               
    public List<FbaItmBaseVo> selectItmBaseList(FbaItmBaseVo vo) throws Exception {
        return popService.selectItmBaseList(vo);            
    }
}
