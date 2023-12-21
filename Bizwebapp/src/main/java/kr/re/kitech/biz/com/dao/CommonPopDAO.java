package kr.re.kitech.biz.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

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
import kr.re.kitech.biz.fin.std.vo.XodfVendComVo;
import kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 공통 
 * @Class Name : CommonPopDAO.java
 * @Description : 공통팝업 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13   박병목                최초생성
 * 
 * @author ParkBM
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("commonPopDAO")
public class CommonPopDAO extends BizDefaultAbstractDAO {
	/**
     * 회계코드 목록조회를 한다.
     * @param vo 회계코드를검색 AccntCdPopupVo
     * @return 회계코드목록  List<AccntCdPopupVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AccntCdPopupVo> selectAccntCdList(AccntCdPopupVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectAccntCdList", vo);
    }
    
    /**
     * 계정번호마스터 목록조회
     * @param AccntNoSrcVo
     * @return List<AccntNoPopupVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AccntNoPopupVo> selectListAccntNoPopup(AccntNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectListAccntNoPopup", vo);
    }
    
    /**
	* 연구(연구노트) 계정번호 검색팝업 조회
	* @param AccntNoSrcVo
	* @return List<AccntNoPopupVo>
	* @throws Exception
	*/
    @SuppressWarnings("unchecked")
	public List<AccntNoPopupVo> selectResAccntInfoList(AccntNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectResAccntInfoList", vo);
    }
    
    /**
     * 예실조회시 필요정보를 상세 조회(엔터) 한다.
     * @param vo 계정정보검색 BblBugtActRsltVo
     * @return 계정정보검색 BblBugtActRsltVo
     * @throws Exception
     */
    public BblBugtActRsltVo selectAccntNo(BblBugtActRsltVo vo) throws KitechException {
        return (BblBugtActRsltVo) selectByPk("kr.re.kitech.biz.com.selectAccntNo", vo);
    }

    /**
     * 예실정보 목록조회를 한다.
     * @param vo 예실정보를검색 BblBugtActRsltVo
     * @return 예실정보목록  List<BblBugtActRsltVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<BblBugtActRsltVo> selectBblBugtList(BblBugtActRsltVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectBblBugtList", vo);
    }
    
    /**
     * 계좌정보조회(별도계좌포함)
     * @param BankAccntVo
     * @return List<BankAccntVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<BankAccntVo> selectBankAccntList(BankAccntVo vo) throws KitechException {
    	if("apart".equals(vo.getClsf())){
    		return list("kr.re.kitech.biz.com.selectListFbaApartAccnt", vo);
    	}else{
    		return list("kr.re.kitech.biz.com.selectFcpDepstForAccntCd", vo);
    	}        
    }
    
    /**
     * 비용코드검색 목록조회를 한다.
     * @param vo 비용코드검색 FbaItmExpnsVo
     * @return 비용코드목록  List<FbaItmExpnsVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FbaItmExpnsVo> selectExpnsList(FbaItmExpnsVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectExpnsList", vo);
    }
    
    /**
     * 입금현황조회(팝업)
     * @param FndDepstSrcVo
     * @return List<FibkAccntHisVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FibkAccntHisVo> selectFibkAccntHisList(FndDepstSrcVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectFibkAccntHisList", vo);
    }
    
    /**
     * 기업지원 입금현황 팝업에서 예금구분별 계좌번호 조회
     * @param FcpDepstVo
     * @return 계좌목록  List<FcpDepstVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FcpDepstVo> selectBankAccntList(FcpDepstVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectBankAccntList", vo);
    }
    
    /**
     * 고객정보 목록조회를 한다.
     * @param vo 고객정보를검색 SptCtiCunslVo
     * @return 고객정보목록  List<SptCtiCunslVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<SptCtiCunslVo> selectSptCusCunslList(SptCtiCunslVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectSptCusCunslList", vo);
    }
    
    /**
     * 업체 목록조회를 한다.
     * @param vo 업체를검색 XodfVendVo
     * @return 업체목록  List<XodfVendVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<XodfVendVo> selectXodfVendList(ComPopSearchVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectXodfVendList", vo);
    }
    
    /**
     * 기업지원 외부기술지원(유상)내역등록 - 업체조회팝업(최근업체)
     * @param String sysPayNo
     * @return 업체목록  List<XodfVendVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<XodfVendVo> selectSptTecRcptInfoVend(String sysPayNo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectSptTecRcptInfoVend", sysPayNo);
    }
    
    /**
     * 기업지원 외부기술지원(유상)내역등록 - 업체조회팝업
     * @param ComPopSearchVo
     * @return 업체목록  List<XodfVendVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<XodfVendVo> selectSptCustBaseInfo(ComPopSearchVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectSptCustBaseInfo", vo);
    }
    
    /**
     * 사용자검색 목록조회를 한다.
     * @param vo 사용자검색 HumComUserSelVo
     * @return 사원목록  List<HumComUserSelVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<HumComUserSelVo> selectListHumComUserSel(HumComUserSelVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectListHumComUserSel", vo);
    }

    /**
     * 부서검색 목록조회를 한다.
     * @param vo 부서검색 DeptInfoVo
     * @return 부서목록  List<DeptInfoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<DeptInfoVo> selectCodhDeptInfo(DeptInfoVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectCodhDeptInfo", vo);
    }   

    /**
     * 사용자 근태현황을 조횐한다.
     * @param vo 사용자검색 HumComUserSelVo
     * @return 사용자검색 HumComUserSelVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<HumBasicInfoVo> selectHumBasicInfoListDetail(HumBasicInfoVo vo) throws KitechException {
        return list("kr.re.kitech.biz.com.selectHumBasicInfoListDetail", vo);
    }
    
    /**
     * 과제정보 팝업 참여연구원 조회
     * @param PrjNoSrcVo
     * @return 참여연구원  List<ResInpPareVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResInpPareVo> selectResInpPare(PrjNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectResInpPare", vo);
    }
    
    /**
     * 과제정보 참여업체 탭 조회 및 참여업체현황 팝업 조회
     * @param PrjNoSrcVo
     * @return 참여기관  List<ResInpPacoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResInpPacoVo> selectResInpPaco(PrjNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectResInpPaco", vo);
    }
    
    /** 과제정보 팝업 연구기자재 조회
     * @param PrjNoSrcVo
     * @return List<ResinpmateVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResinpmateVo> selectListResInpMate(PrjNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectListResInpMate", vo);
    }
    
    /**
     * 메인과제정보 조회
     * @param PrjNoSrcVo
     * @return ResMainAccntVo
     * @throws Exception
     */
	public ResMainAccntVo selectMainAccntInfo(PrjNoSrcVo vo) throws KitechException {      	
        return (ResMainAccntVo) selectByPk("kr.re.kitech.biz.com.selectMainAccntInfo", vo);
    }
    
    /**
     * 1차년도 과제 유무 체크
     * @param PrjNoSrcVo
     * @return int
     * @throws Exception
     */
	public int selectChkAccnt(PrjNoSrcVo vo) throws KitechException {      	
        return (int) selectByPk("kr.re.kitech.biz.com.selectChkAccnt", vo);
    }
    
    /**
     * 메인과제마스터 목록조회를 한다.
     * @param PrjNoSrcVo
     * @return List<PrjNoInpYearVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PrjNoInpYearVo> selectInpYearAccntCnt(PrjNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectInpYearAccntCnt", vo);
    }
    
    /**
     * 과제연차정보 조회
     * @param PrjNoSrcVo
     * @return List<PrjNoInpYearVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PrjNoInpYearVo> selectResInpYear(PrjNoSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectResInpYear", vo);
    }    
    
    /**
     * 화면ID 조회 한다.
     * @param vo 화면ID마스터 XomxMenuVo
     * @return 화면ID 목록  List<XomxMenuVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<XomxMenuVo> selectListXomxMenu(XomxMenuVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectListXomxMenu", vo);
    }
    
    /**
     * 학술대회 Pool 이력팝업 그리드 조회
     * @param ComPopSearchVo
     * @return List<ResConfPoolReqVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResConfPoolReqVo> selectResConfPoolReqList(ComPopSearchVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.com.selectResConfPoolReqList", vo);
    }
    
    /**
     * 학술대회 Pool 이력 팝업 저장
     * @param ResConfPoolReqVo
     * @return int
     * @throws Exception
     */
    public int updateResConfPoolReq(ResConfPoolReqVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.com.updateResConfPoolReq", vo);
    }
    
    /**
     * 학술대회 Pool 이력 팝업 삭제
     * @param ResConfPoolReqVo
     * @return int
     * @throws Exception
     */
    public int deleteResConfPoolReq(ResConfPoolReqVo vo) throws KitechException{
    	return delete("kr.re.kitech.biz.com.deleteResConfPoolReq", vo);
    }
    
    /**
     * Oz Report 정보 조회(단건)
     * @param OzrInFoVo
     * @return OzrInFoVo
     * @throws Exception
     */
    public OzrInFoVo selectOzrInfo(OzrInFoVo vo) throws KitechException{
    	return (OzrInFoVo)selectByPk("kr.re.kitech.biz.com.selectOzrInfo", vo);
    }
    
    /**
     * Oz Report 정보 조회(다건)
     * @param OzrInFoVo
     * @return OzrInFoVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<OzrInFoVo> selectOzrInfoList(OzrInFoVo vo) throws KitechException{
    	return (List<OzrInFoVo>)list("kr.re.kitech.biz.com.selectOzrInfoList", vo);
    }
    
    /**
     * 거래처 단건 조회
     * @param String vendCd
     * @return XodfVendComVo
     * @throws Exception
     */
    public XodfVendComVo selectXodfVend(String vendCd) throws KitechException{
    	return (XodfVendComVo)selectByPk("kr.re.kitech.biz.com.selectXodfVend", vendCd);
    }
    
    /**
     * 구매요구 계정내역 - 계정번호 검색
     * @param List<OzrInFoVo>
     * @return List<OzrInFoVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AccntNoPopupVo> selectPurAccntNoList(AccntNoSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.com.selectPurAccntNoList", vo);
    }
    
    /**
     * 연구기자재 검색
     * @param ResInpMatePopVo
     * @return List<ResInpMatePopVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<ResInpMatePopVo> selectResInpMatePop(ResInpMatePopVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.com.selectResInpMatePop", vo);
    }
    
    /**
     * 사전안정성검토 조회(팝업)
     * @param SfcChmclsSafeVo
     * @return List<SfcChmclsSafeVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<SfcChmclsSafeVo> selectSfcChmclsSafe(SfcChmclsSafeVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.com.selectSfcChmclsSafe", vo);
    }
    
    /**
     * 비목해소기준 조회(팝업)
     * @param FbaItmBaseVo
     * @return List<FbaItmBaseVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FbaItmBaseVo> selectItmBaseList(FbaItmBaseVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.com.selectItmBaseList", vo);
    }
}
