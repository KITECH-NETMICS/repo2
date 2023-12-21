package kr.re.kitech.biz.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.dao.CommonPopDAO;
import kr.re.kitech.biz.com.service.CommonPopService;
import kr.re.kitech.biz.com.vo.AccntCdPopupVo;
import kr.re.kitech.biz.com.vo.AccntNoPopupVo;
import kr.re.kitech.biz.com.vo.AccntNoSrcVo;
import kr.re.kitech.biz.com.vo.BankAccntVo;
import kr.re.kitech.biz.com.vo.BblBugtActRsltVo;
import kr.re.kitech.biz.com.vo.ComPopSearchVo;
import kr.re.kitech.biz.com.vo.DeptInfoVo;
import kr.re.kitech.biz.com.vo.FbaItmBaseVo;
import kr.re.kitech.biz.com.vo.FbaItmExpnsVo;
import kr.re.kitech.biz.com.vo.FibkAccntHisVo;
import kr.re.kitech.biz.com.vo.FormAliasVo;
import kr.re.kitech.biz.com.vo.HumBasicInfoVo;
import kr.re.kitech.biz.com.vo.HumComUserSelVo;
import kr.re.kitech.biz.com.vo.OzrInFoVo;
import kr.re.kitech.biz.com.vo.PrjNoInpYearVo;
import kr.re.kitech.biz.com.vo.PrjNoSrcVo;
import kr.re.kitech.biz.com.vo.ResInpMatePopVo;
import kr.re.kitech.biz.com.vo.ResInpPacoVo;
import kr.re.kitech.biz.com.vo.ResInpPareVo;
import kr.re.kitech.biz.com.vo.ResMainAccntVo;
import kr.re.kitech.biz.com.vo.ResinpmateVo;
import kr.re.kitech.biz.com.vo.SfcChmclsSafeVo;
import kr.re.kitech.biz.com.vo.SptCtiCunslVo;
import kr.re.kitech.biz.com.vo.XodfVendVo;
import kr.re.kitech.biz.com.vo.XomxMenuVo;
import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.fin.std.vo.FcpDepstVo;
import kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;
import kr.re.kitech.biz.xom.core.vo.UserVo;

@Service("commonPopService")
public class CommonPopServiceImpl extends EgovAbstractServiceImpl implements CommonPopService {
	@Resource(name="commonPopDAO")
	private CommonPopDAO popDao;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntServiceImpl;

	/**
    * 회계코드조회
    * @param AccntCdPopupVo
    * @return List<AccntCdPopupVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	@Override
	public List<AccntCdPopupVo> selectAccntCdList(AccntCdPopupVo vo) throws ElException {
		return popDao.selectAccntCdList(vo);
	}
	
	/**
    *  계정번호 조회
    * @param AccntNoSrcVo
    * @return List<AccntNoPopupVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<AccntNoPopupVo> selectListAccntNoPopup(AccntNoSrcVo vo) throws ElException {	
		List<AccntNoPopupVo> accntList = null;
		// 2022.12.08. 이영희  구매요구 계정내역에서 계정번호 검색 추가
		if("pur".equals(vo.getClsf())){
			accntList = popDao.selectPurAccntNoList(vo);
		}else if(StringUtils.isNotBlank(vo.getClsf()) && vo.getClsf().contains("Res")){
			accntList = popDao.selectResAccntInfoList(vo);
		}else{
			accntList = popDao.selectListAccntNoPopup(vo);
		}
		return accntList;
	}
	
	/**
    * 예실조회시 계정정보조회
    * @param BblBugtActRsltVo
    * @return BblBugtActRsltVo
    * @author 박병목
    * @since 2022.03.21.
    */
	public BblBugtActRsltVo selectAccntNo(BblBugtActRsltVo vo) throws ElException {        
        return popDao.selectAccntNo(vo);
	}
	
	/**
    * 예실정보 목록조회
    * @param BblBugtActRsltVo
    * @return List<BblBugtActRsltVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<BblBugtActRsltVo> selectBblBugtList(BblBugtActRsltVo vo) throws ElException {	
		return  popDao.selectBblBugtList(vo);
	}
	
	/**
    *  비용코드검색 목록조회
    * @param FbaItmExpnsVo
    * @return List<FbaItmExpnsVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<FbaItmExpnsVo> selectExpnsList(FbaItmExpnsVo vo) throws ElException {  
		return popDao.selectExpnsList(vo);
	}
	
	/**
    * 사용자계좌 목록조회
    * @param BankAccntVo
    * @return List<FbaApartAccntVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<BankAccntVo> selectBankAccntList(BankAccntVo vo) throws ElException {	
		return popDao.selectBankAccntList(vo);
	}    
	
	/**
    * 입금현황조회(팝업)
    * @param FndDepstSrcVo
    * @return List<FibkAccntHisVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<FibkAccntHisVo> selectFibkAccntHisList(FndDepstSrcVo vo) throws ElException {	
		return popDao.selectFibkAccntHisList(vo);
	}

	/**
    * 기업지원 입금현황 팝업에서 예금구분별 계좌번호 조회
    * @param FcpDepstVo
    * @return List<FcpDepstVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<FcpDepstVo> selectBankAccntList(FcpDepstVo vo) throws ElException {
		return popDao.selectBankAccntList(vo);
	}
	
	/**
    * 고객정보 목록조회
    * @param SptCtiCunslVo
    * @return List<SptCtiCunslVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<SptCtiCunslVo> selectSptCtiCunslList(SptCtiCunslVo vo) throws ElException {        
        return popDao.selectSptCusCunslList(vo);
	}
	
	/**
    * 업체 목록조회
    * @param XodfVendVo
    * @return List<SptCustBaseVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<XodfVendVo> selectXodfVendList(ComPopSearchVo vo) throws ElException {
		if("S".equals(vo.getBiz_clsf())){ // 기업지원
			if("Y".equals(vo.getRecnt_cust_yn())){ // 최근업체일 경우
				return popDao.selectSptTecRcptInfoVend(vo.getRegst_syspayno());
			}else{
				List<XodfVendVo> vendList = popDao.selectSptCustBaseInfo(vo);
				// 기업지원 고객정보에 없을 경우 재무 거래처정보 조회
				if(vendList == null || vendList.size() == 0){
					vendList = popDao.selectXodfVendList(vo);
					for(XodfVendVo vendVo : vendList){
						vendVo.setSupt_clsf("00000000000000000000");
					}
				}
				return vendList;
			}
		}else if("SE".equals(vo.getBiz_clsf())){ // 기업지원 기술세미나 실적등록
			return popDao.selectSptCustBaseInfo(vo);
		}else{
			return popDao.selectXodfVendList(vo);	
		}
	}
	
	/**
    * 사용자검색 목록조회
    * @param HumComUserSelVo
    * @return List<HumComUserSelVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<HumComUserSelVo> selectListHumComUserSel(HumComUserSelVo vo) throws ElException {
		if (StringUtils.equals("uid", vo.getAuth_type())) {
			UserVo schVo = accntServiceImpl.findSyspaynoByUid(vo.getUid());
			AppLog.debug(schVo.toString());
			vo.setEmpno(schVo.getSn().substring(2));
		}
		List<HumComUserSelVo> list = popDao.selectListHumComUserSel(vo);	
	
		return list;
	}

	/**
    * 부서검색 목록조회
    * @param DeptInfoVo
    * @return List<DeptInfoVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<DeptInfoVo> selectCodhDeptInfo(DeptInfoVo vo) throws ElException {
		List<DeptInfoVo> list = popDao.selectCodhDeptInfo(vo);	
	
		return list;
	}
	
	/**
    * 사용자 근태현황을 조회
    * @param HumBasicInfoVo
    * @return List<HumBasicInfoVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<HumBasicInfoVo> selectHumBasicInfoListDetail(HumBasicInfoVo vo) throws ElException {
        List<HumBasicInfoVo> list = popDao.selectHumBasicInfoListDetail(vo);	
	
		return list;
	}
	
	/**
    * 과제 참여연구원 조회
    * @param PrjNoSrcVo
    * @return List<ResInpPareVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<ResInpPareVo> selectResInpPare(PrjNoSrcVo vo) throws ElException {	
		return popDao.selectResInpPare(vo);
	}
	
	/**
    * 과제정보 참여업체 탭 조회 및 참여업체현황 팝업 조회
    * @param PrjNoSrcVo
    * @return List<ResInpPacoVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<ResInpPacoVo> selectResInpPaco(PrjNoSrcVo vo) throws ElException {        
        return popDao.selectResInpPaco(vo);
	}
	
	/**
    * 메인과제마스터 목록조회
    * @param PrjNoSrcVo
    * @return ResMainAccntVo
    * @author 박병목
    * @since 2022.05.11.
    */
	public ResMainAccntVo selectMainAccntInfo(PrjNoSrcVo vo) throws ElException {
		 return popDao.selectMainAccntInfo(vo);
	}
	
	/**
    * 연차과제 목록조회
    * @param PrjNoSrcVo
    * @return PrjNoMAccntVo
    * @author 박병목
    * @since 2022.05.11.
    */
	public List<PrjNoInpYearVo> selectResInpYear(PrjNoSrcVo vo) throws ElException {		
		if (popDao.selectChkAccnt(vo) > 0) {
			return popDao.selectInpYearAccntCnt(vo);
		} else {
			return popDao.selectResInpYear(vo);
		}
	}
	
	/**
    * 과제정보 팝업 연구기자재 조회
    * @param PrjNoSrcVo
    * @return List<PrjNoPopupVo>
    * @author 박병목
    * @since 2022.03.21.
    */
	public List<ResinpmateVo> selectListResInpMate(PrjNoSrcVo vo) throws ElException {        
        return popDao.selectListResInpMate(vo);	
	}	
	
	/**
    * 화면ID 조회
    * @param XomxMenuVo
    * @return List<XomxMenuVo>
    * @author 박병목
    * @since 2022.05.04.
    */
	public List<XomxMenuVo> selectListXomxMenu(XomxMenuVo vo) throws ElException {        
        return popDao.selectListXomxMenu(vo);	
	}
	
	/**
    * 학술대회 Pool 이력팝업 그리드 조회
    * @param ComPopSearchVo
    * @return List<ResConfPoolReqVo>
    * @author 이영희
    * @since 2022.05.27.
    */
	public List<ResConfPoolReqVo> selectResConfPoolReqList(ComPopSearchVo vo) throws ElException{
		return popDao.selectResConfPoolReqList(vo);
	}
	
	/**
     * 학술대회 Pool 이력 팝업 저장
     * @param ResConfPoolReqVo
     * @return int
     * @throws Exception
     * @author 이영희
     * @since 2022.05.30.
     */
    public int updateResConfPoolReq(ResConfPoolReqVo vo) throws ElException{
    	return popDao.updateResConfPoolReq(vo);
    }
    
    /**
     * 학술대회 Pool 이력 팝업 삭제
     * @param ResConfPoolReqVo
     * @return int
     * @throws Exception
     */
    public int deleteResConfPoolReq(ResConfPoolReqVo vo) throws ElException{
    	return popDao.deleteResConfPoolReq(vo);
    }
    
    /**
     * Oz Report 정보 조회
     * @param OzrInFoVo
     * @return OzrInFoVo
     * @throws Exception
     */
    public OzrInFoVo selectOzrInfo(OzrInFoVo vo) throws ElException{
    	// 결재 완료함에서 프린터를 클    	
    	return popDao.selectOzrInfo(vo);
    }
    
    /**
     * Oz Report 정보 조회(리스트)
     * @param List<OzrInFoVo>
     * @return List<OzrInFoVo>
     * @throws Exception
     */
    public List<OzrInFoVo> selectOzrInfoList(List<OzrInFoVo> voList) throws ElException{
    	
    	// 결재 완료함에서 프린터를 클
    	List<FormAliasVo> formList = new ArrayList<>();
    	List<FormAliasVo> formList1 = new ArrayList<>();
    	List<FormAliasVo> formList2 = new ArrayList<>();
    	List<FormAliasVo> formList3 = new ArrayList<>();
    	List<FormAliasVo> formList4 = new ArrayList<>();
    	List<FormAliasVo> formList5 = new ArrayList<>();
    	List<FormAliasVo> formList6 = new ArrayList<>();
 
		for(OzrInFoVo vo : voList){
			FormAliasVo formVo = new FormAliasVo();
			formVo.setFormAlias(vo.getFormAlias());
			formVo.setReq_no(vo.getReq_no());
			
			if("P26".equals(vo.getFormAlias())){ // 계정변경신청				
				formList1.add(formVo);
			}else if("P44".equals(vo.getFormAlias())){ // 계약변경신청
				formList2.add(formVo);
			}else if("P51".equals(vo.getFormAlias())){ // 계약기안문서
				formList3.add(formVo);
			}else if("R78".equals(vo.getFormAlias())){ // 기술료입금의뢰 및 청구
				formList4.add(formVo);
			}else if("P81".equals(vo.getFormAlias())){ //발주계획
				String[] reqNoArr = vo.getReq_no().split("-");
				formVo.setReq_no(reqNoArr[0]);
				formVo.setChg_no(reqNoArr[1]);
				formList5.add(formVo);
			}else if("P32".equals(vo.getFormAlias())){ // 구매계약
				String[] reqNoArr = vo.getReq_no().split("-");
				formVo.setReq_no(reqNoArr[0]);
				formVo.setChg_no(reqNoArr[1]);
				formList6.add(formVo);
			}else{
				formList.add(formVo);
			}			
		}
		
		OzrInFoVo srcVo = new OzrInFoVo();    	
    	// 1) formList 로 조회
    	List<OzrInFoVo> retList = new ArrayList<>();
    	if(formList.size() > 0){
	    	srcVo.setFormList(formList);
	    	retList = popDao.selectOzrInfoList(srcVo);
	    }
    	// 2) formList1 로 조회
    	if(formList1.size() > 0){
    		srcVo.setFormAlias("P26");
    		srcVo.setFormList(formList1);
    		retList.addAll(popDao.selectOzrInfoList(srcVo));
    	}
    	
    	// 3) formList2 로 조회
    	if(formList2.size() > 0){
    		srcVo.setFormAlias("P44");
    		srcVo.setFormList(formList2);
    		retList.addAll(popDao.selectOzrInfoList(srcVo));
    	}
    	
    	// 4) formList3 로 조회
    	if(formList3.size() > 0){
    		srcVo.setFormAlias("P51");
    		srcVo.setFormList(formList3);
    		retList.addAll(popDao.selectOzrInfoList(srcVo));
    	}
    	
    	// 5) formList4 로 조회
    	if(formList4.size() > 0){
    		srcVo.setFormAlias("R78");
    		srcVo.setFormList(formList4);
    		retList.addAll(popDao.selectOzrInfoList(srcVo));
    	}
    	
    	// 6) formList5 로 조회
    	if(formList5.size() > 0){
    		srcVo.setFormAlias("P81");
    		srcVo.setFormList(formList5);
    		retList.addAll(popDao.selectOzrInfoList(srcVo));
    	}
    	
    	// 7) formList6 로 조회
    	if(formList6.size() > 0){
    		srcVo.setFormAlias("P32");
    		srcVo.setFormList(formList6);
    		retList.addAll(popDao.selectOzrInfoList(srcVo));
    	}
    	
    	return retList;
    }
    
    /**
     * 연구기자재 검색(팝업)
     * @param ResInpMatePopVo
     * @return List<ResInpMatePopVo>
     * @throws Exception
     * @author LeeYH
     * @since 2022.12.09.
     */
	public List<ResInpMatePopVo> selectResInpMatePop(ResInpMatePopVo vo) throws ElException{
		return popDao.selectResInpMatePop(vo);
	} 
	
	/**
     * 사전안정성검토 조회(팝업)
     * @param SfcChmclsSafeVo
     * @return List<SfcChmclsSafeVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.27.
     */
	public List<SfcChmclsSafeVo> selectSfcChmclsSafe(SfcChmclsSafeVo vo) throws ElException{
		return popDao.selectSfcChmclsSafe(vo);
	}
	
	/**
     * 메뉴검색 조회(팝업)
     * @param ServiceVo
     * @return ServiceListVo
     * @author HongSM
     * @since 2023.04.21.
     */
	@Override
	public ServiceListVo selectMenuMatchKeyword(ServiceVo service) {
		ServiceListVo retList = new ServiceListVo();
		try {
			String uid = KitechContextUtil.getUserId();
			String keyword = service.getCn();
			
			if (StringUtils.isBlank(keyword))
				return retList;
			
			retList.setServiceVoList(accntServiceImpl.getMenuListForTreeByUidSch(uid, keyword));
		} catch (Exception e) {
			AppLog.error("ExceptServiceImpl.saveExceptItem() 저장 오류", e);
		}
		
		return retList;
	}
	
	/**
    *  비목해소기준 조회(팝업)
    * @param FbaItmBaseVo
    * @return List<FbaItmBaseVo>
    * @author timothee
    * @since 2022.09.21.
    */
	public List<FbaItmBaseVo> selectItmBaseList(FbaItmBaseVo vo) throws ElException {  
		return popDao.selectItmBaseList(vo);
	}
}
