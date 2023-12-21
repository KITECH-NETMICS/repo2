package kr.re.kitech.biz.saf.che.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.saf.che.service.SafCheProdDsuseService;
import kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseVo;
import kr.re.kitech.biz.saf.che.vo.SafCheProdDsuseSpaceVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSpaceInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**
 * @ClassSubJect 화학제품폐기처리
 * @ClassName : SafCheProdDeuseController.java
 * @Description 화학제품폐기처리 Controller
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.06.     김상미    		최초생성
 * 
 * @author 김상미
 * @since 2023.09.06.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class SafCheProdDsuseController {

	@Resource(name = "safCheProdDsuseServiceImpl")
	private SafCheProdDsuseService safService;
	
	/**
	 * 화학제품폐기리스트 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUMR01")
	@RequestMapping(value = "SvcSAFCHEPRDUMR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "화학제품폐기관리 리스트 조회", desc = "화학제품폐기관리 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectList(safVo);
	} 	

	/**
	 * 부서타입 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUMR02")
	@RequestMapping(value = "SvcSAFCHEPRDUMR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "부서타입 조회", desc = "부서타입을 조회한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseInfoVo selectDeptType(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectDeptType(safVo);
	} 

	/**
	 * 바코드 입력시 사용번호 상태 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06. 
	 */
	@ElService(key = "SvcSAFCHEPRDUMR03")
	@RequestMapping(value = "SvcSAFCHEPRDUMR03")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "바코드 입력시 사용번호 상태", desc = "바코드 입력시 사용번호 상태를 조회한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseInfoVo selectSafCheDsuseInfo(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheDsuseInfo(safVo);
	} 

	/**
	 * 화학제품폐기신청 완료
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUMI01")
	@RequestMapping(value = "SvcSAFCHEPRDUMI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "화학제품폐기신청 완료", desc = "화학제품폐기 신청을 완료처리한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseInfoVo saveCompleteDeuse(SafChePrdDsuseInfoVo safVo) throws KitechException {
	    return safService.saveCompleteDeuse(safVo);
	} 
	
	/**
	 * 화학제품폐기신청 반려
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUMI02")
	@RequestMapping(value = "SvcSAFCHEPRDUMI02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "화학제품폐기신청 반려", desc = "화학제품폐기신청 반려처리를 한다.")
	@ElValidator(errUrl = "")
	public void saveProdDeuseDisposal(SafChePrdDsuseVo safVo) throws KitechException {
	    safService.saveProdDeuseDisposal(safVo);
	} 

	/**
	 * 폐기 내역 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR01")
	@RequestMapping(value = "SvcSAFCHEPRDUSR01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "폐기 내역 조회", desc = "폐기 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseVo selectSafCheProdDsuseReqstInfo(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheProdDsuseInfo(safVo);
	} 

	/**
	 * 폐기 상세 내역 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR02")
	@RequestMapping(value = "SvcSAFCHEPRDUSR02")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "폐기 상세 내역 조회", desc = "폐기 상세 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectSafCheProdDsuseReqstDetail(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheProdDsuseReqstDetail(safVo);
	} 

	/**
	 * 폐기신청 제품 상세 내역 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR03")
	@RequestMapping(value = "SvcSAFCHEPRDUSR03")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "폐기신청 제품 상세 내역 조회", desc = "폐기신청 제품 상세 내역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectSafCheDsusePrductDetailList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheDsusePrductDetailList(safVo);
	} 

	/**
	 * 화학제품폐기신청 등록/수정/결재요청
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSI01")
	@RequestMapping(value = "SvcSAFCHEPRDUSI01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "화학제품폐기신청 등록/수정/결재요청", desc = "화학제품폐기신청 등록/수정/결재요청처리를 한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseInfoVo saveProdDeuse(SafChePrdDsuseVo safVo) throws KitechException {
	    return safService.saveProdDeuse(safVo);
	}
	
	/**
	 * 폐기신청 삭제
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSD01")
	@RequestMapping(value = "SvcSAFCHEPRDUSD01")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "폐기신청 삭제", desc = "폐기신청 삭제를 한다.")
	@ElValidator(errUrl = "")
	public void deleteProdDeuse(SafChePrdDsuseVo safVo) throws KitechException {
	    safService.deleteProdDeuse(safVo);
	}

	/**
	 * 연구실 상세보기
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafCheProdDeuseSpaceVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR04")
	@RequestMapping(value = "SvcSAFCHEPRDUSR04")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "연구실 상세보기", desc = "연구실 상세를 조회한다.")
	@ElValidator(errUrl = "")
	public SafCheProdDsuseSpaceVo selectSafCheSpace(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheSpace(safVo);
	} 				

	/**
	 * 사용번호 기준 제품 정보 리스트 
	 * 
	 * @author 김상미
	 * @param SafCheSearchVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR06")
	@RequestMapping(value = "SvcSAFCHEPRDUSR06")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "사용번호 기준 폐기 시 제품 정보 리스트 조회", desc = "사용번호 기준 폐기 시 제품 정보 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectSafCheUsePrductQyList(SafCheSearchVo safVo) throws KitechException {
	    return safService.selectSafCheUsePrductQyList(safVo);
	} 	

	/**
	 * 제품코드 기준 화학 제품 별 화학물질 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheChmstryInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR07")
	@RequestMapping(value = "SvcSAFCHEPRDUSR07")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "제품코드 기준 화학 제품 별 화학물질 조회", desc = "제품코드 기준 화학 제품 별 화학물질을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafCheChmstryInfoVo> selectSafCheProductChmstryList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheProductChmstryList(safVo);
	}							

	/**
	 * 사용번호 기준 화학 제품 별 화학물질 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR08")
	@RequestMapping(value = "SvcSAFCHEPRDUSR08")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "사용번호 기준 화학 제품 별 화학물질 조회", desc = "사용번호 기준 화학 제품 별 화학물질을 조회한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseInfoVo selectSafCheUseProdChmstryList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheUseProdChmstryList(safVo);
	} 	

	/**
	 * 폐기 기간 설정 조회 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR09")
	@RequestMapping(value = "SvcSAFCHEPRDUSR09")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "폐기 기간 설정 조회", desc = "폐기 기간 설정을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDateManage(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheDsuseDateManage(safVo);
	} 	

	/**
	 * 안전보건담당자 확인  
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDeuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR10")
	@RequestMapping(value = "SvcSAFCHEPRDUSR10")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "안전보건담당자 확인", desc = "안전보건담당자를  확인하기 위해 조회한다.")
	@ElValidator(errUrl = "")
	public SafChePrdDsuseInfoVo selectDeptToManager(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectDeptToManager(safVo);
	} 	

	/**
	 * 물질명칭, 관리법,보건법, 안전관리법조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafCheChmstryInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR11")
	@RequestMapping(value = "SvcSAFCHEPRDUSR11")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "화학물질 조회", desc = "화학물질을 조회한다.")
	@ElValidator(errUrl = "")
	public SafCheChmstryInfoVo selectSafCheLawData(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheLawData(safVo);
	} 

	/**
	 * 스냅샷용 화학물질 정보 리스트 조회 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheChmstryInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR12")
	@RequestMapping(value = "SvcSAFCHEPRDUSR12")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "스냅샷용 화학물질 정보 리스트 조회", desc = "스냅샷용 화학물질 정보 리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafCheChmstryInfoVo> selectSafCheDeusePrductSnapList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheDeusePrductSnapList(safVo);
	}

	/**
	 * 폐기일자 정보 조회  
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR13")
	@RequestMapping(value = "SvcSAFCHEPRDUSR13")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "폐기일자 정보 조회 ", desc = "폐기일자 정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDeManageInfoList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheDsuseDeManageInfoList(safVo);
	} 

	/**
	 * 바코드 인식으로 세팅하는 경우 연구실 정보 조회  
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheProdDeuseSpaceVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR14")
	@RequestMapping(value = "SvcSAFCHEPRDUSR14")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "바코드정보로 연구실조회", desc = "바코드정보로 연구실을 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafCheProdDsuseSpaceVo> selectSafCheSpaceUseReqNoList(SafCheSearchInfoVo safVo) throws KitechException {
	    return safService.selectSafCheSpaceUseReqNoList(safVo);
	} 
							
	/**
	 * 연구실 제품 사용 목록
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDeuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR15")
	@RequestMapping(value = "SvcSAFCHEPRDUSR15")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "화학제품리스트 조회", desc = "화학제품리스트를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafChePrdDsuseInfoVo> selectListChmstryProduct(SafCheSearchInfoVo safProdVo) throws KitechException {
	    return safService.selectListChmstryProduct(safProdVo);
	} 
	 
	
	/**
	 * 연구실검색 팝업 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheSpaceInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	@ElService(key = "SvcSAFCHEPRDUSR17")
	@RequestMapping(value = "SvcSAFCHEPRDUSR17")
	@DataCollection(ref="", target="")
	@ElDescription(sub = "연구실검색 팝업 조회", desc = "연구실검색팝업에서 연구실정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<SafCheSpaceInfoVo> selectSafCheSpacePopupList(SafCheSearchInfoVo safProdVo) throws KitechException {
	    return safService.selectSafCheSpacePopupList(safProdVo);
	}  
}
