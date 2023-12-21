package kr.re.kitech.biz.com.service;

import java.util.List;

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
import kr.re.kitech.biz.res.std.vo.ResConfPoolReqVo;
import kr.re.kitech.biz.xom.core.vo.ServiceListVo;
import kr.re.kitech.biz.xom.core.vo.ServiceVo;

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
public interface CommonPopService {
	/**
	 * 회계코드 목록을 조회한다.
	 * @param accntCdPopupVo 회계코드검색 AccntCdPopupVo
	 * @return  회계코드검색 목록 List<AccntCdPopupVo>
	 * @throws Exception
	 */
	public List<AccntCdPopupVo> selectAccntCdList(AccntCdPopupVo accntCdPopupVo);
	
	/**
    * 계정번호 목록 조회
    */
	public List<AccntNoPopupVo> selectListAccntNoPopup(AccntNoSrcVo vo);
	
	/**
    * 예실조회시 계정정보조회
    */
	public BblBugtActRsltVo selectAccntNo(BblBugtActRsltVo vo);
	
	/**
    * 예실정보 목록조회
    */
	public List<BblBugtActRsltVo> selectBblBugtList(BblBugtActRsltVo vo);
	
	/**
    * 비용코드검색 목록조회
    */
	public List<FbaItmExpnsVo> selectExpnsList(FbaItmExpnsVo vo);
	
	/**
    * 계좌 목록조회
    */
	public List<BankAccntVo> selectBankAccntList(BankAccntVo vo);
	
	/**
    * 입금조회 목록조회
    */
	public List<FibkAccntHisVo> selectFibkAccntHisList(FndDepstSrcVo vo);
	
	/**
    * 계좌구분별 계좌목록을 조회
    */
	public List<FcpDepstVo> selectBankAccntList(FcpDepstVo vo);
	
	/**
    * 고객정보 목록조회
    */
	public List<SptCtiCunslVo> selectSptCtiCunslList(SptCtiCunslVo vo);
	
	/**
    * 업체 목록조회
    */
	public List<XodfVendVo> selectXodfVendList(ComPopSearchVo vo);
	
	/**
    * 사용자검색 목록조회
    */
	public List<HumComUserSelVo> selectListHumComUserSel(HumComUserSelVo vo);
	
	/**
    * 부서검색 목록조회
    */
	public List<DeptInfoVo> selectCodhDeptInfo(DeptInfoVo vo);
	
	/**
    * 사용자 근태현황을 조회
    */
	public List<HumBasicInfoVo> selectHumBasicInfoListDetail(HumBasicInfoVo vo);
	
	/**
    * 과제 참여연구원 조회
    */
	public List<ResInpPareVo> selectResInpPare(PrjNoSrcVo vo);
	
	/**
    * 과제정보 참여업체 탭 조회 및 참여업체현황 팝업 조회
    */
	public List<ResInpPacoVo> selectResInpPaco(PrjNoSrcVo vo);
	
	/**
    * 메인과제조회
    */
	public ResMainAccntVo selectMainAccntInfo(PrjNoSrcVo vo);
	
	/**
    * 연차과제 조회
    */
	public List<PrjNoInpYearVo> selectResInpYear(PrjNoSrcVo vo);
	
	/**
    * 시작품내역 목록조회
    */
	public List<ResinpmateVo> selectListResInpMate(PrjNoSrcVo vo);	
	
	/**
    * 화면ID 조회
    */
	public List<XomxMenuVo> selectListXomxMenu(XomxMenuVo vo);
	
	/**
    * 학술대회 Pool 이력팝업 그리드 조회
    */
	public List<ResConfPoolReqVo> selectResConfPoolReqList(ComPopSearchVo vo);
	
	/**
    * 학술대회 Pool 이력 팝업 저장
    */
	public int updateResConfPoolReq(ResConfPoolReqVo vo);
	
	/**
    * 학술대회 Pool 이력 팝업 삭제
    */
	public int deleteResConfPoolReq(ResConfPoolReqVo vo);
	
	/**
    * Oz Report 정보 조회
    */
	public OzrInFoVo selectOzrInfo(OzrInFoVo vo);
	
	/**
    * Oz Report 정보 리스트 조회
    */
	public List<OzrInFoVo> selectOzrInfoList(List<OzrInFoVo> voList);
	
	/**
    * 연구기자재 검색(팝업)
    */
	public List<ResInpMatePopVo> selectResInpMatePop(ResInpMatePopVo vo);
	
	/**
    * 사전안정성검토 조회(팝업)
    */
	public List<SfcChmclsSafeVo> selectSfcChmclsSafe(SfcChmclsSafeVo vo);
	
	public ServiceListVo selectMenuMatchKeyword(ServiceVo service);
	
	/**
    * 비목해소기준 조회(팝업)
    */
	public List<FbaItmBaseVo> selectItmBaseList(FbaItmBaseVo vo);
}
