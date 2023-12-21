package kr.re.kitech.biz.saf.che.service;

import java.util.List;

import kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseVo;
import kr.re.kitech.biz.saf.che.vo.SafCheProdDsuseSpaceVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSpaceInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 화학제품폐기처리를 담당하는 인터페이스
 * @ClassName : SafCheProdDeuseService.java
 * @Description 화학제품폐기처리를 담당하는 인터페이스
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.06.     김상미           최초생성
 * 
 * @author 김상미
 * @since 2023.09.06.
 * @version 1.0
 * @see
 * 
 */
 
public interface SafCheProdDsuseService {

	 /**
	  * 화학제품폐기리스트 조회
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectList(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 부서타입 조회
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return SafChePrdDsuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo selectDeptType(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 바코드 입력시 사용번호 상태 조회
	  * 
	  * @author 김상미
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.
	  */
	 public SafChePrdDsuseInfoVo selectSafCheDsuseInfo(SafCheSearchInfoVo vo) throws KitechException;
	 
	 /**
	  * 폐기확정
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo saveCompleteDeuse(SafChePrdDsuseInfoVo vo) throws KitechException;

	 /**
	  * 폐기신청결재신청/반려
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public void saveProdDeuseDisposal(SafChePrdDsuseVo safVo) throws KitechException;      

	 /**
	  * 화학물질 폐기신청 조회
	  * 
	  * @author 김상미
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafChePrdDsuseVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseVo selectSafCheProdDsuseInfo(SafCheSearchInfoVo vo) throws KitechException;
	
	 /**
	  * 폐기 내역
	  * 
	  * @author 김상미 
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo selectSafCheProdDsuseReqstInfo(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 폐기 상세 내역
	  * 
	  * @author 김상미
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectSafCheProdDsuseReqstDetail(SafCheSearchInfoVo vo) throws KitechException;
	 
	 /**
	  * 폐기신청 제품 상세 내역
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectSafCheDsusePrductDetailList(SafCheSearchInfoVo vo) throws KitechException;	
	  
	 /**
	  * 폐기신청등록/수정
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo saveProdDeuse(SafChePrdDsuseVo safVo) throws KitechException;    
    
	 /**
	  * 폐기신청 삭제
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo deleteProdDeuse(SafChePrdDsuseVo safVo) throws KitechException;      

	 /**
	  * 연구실 상세보기
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafCheProdDeuseSpaceVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafCheProdDsuseSpaceVo selectSafCheSpace(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 사용번호 폐기 시 제품 정보 리스트
	  * 
	  * @author 김상미
	  * @param SafCheSearchVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectSafCheUsePrductQyList(SafCheSearchVo vo) throws KitechException;
	
	 /**
	  * 제품코드 기준 화학 제품 별 화학물질
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafCheChmstryInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafCheChmstryInfoVo> selectSafCheProductChmstryList(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 사용제품 기준 화학 제품 별 화학물질
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return SafChePrdDsuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo selectSafCheUseProdChmstryList(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 폐기 기간 설정 조회
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDateManage(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 안전보건담당자 확인
	  * 
	  * @author 김상미
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafChePrdDeuseInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafChePrdDsuseInfoVo selectDeptToManager(SafCheSearchInfoVo vo) throws KitechException;
	 
	 /**
	  * 물질명칭, 관리법,보건법, 안전관리법조회 
	  * 
	  * @author 김상미
	  * @param  SafChePrdDsuseInfoVo
	  * @return SafCheChmstryInfoVo
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public SafCheChmstryInfoVo selectSafCheLawData(SafCheSearchInfoVo vo) throws KitechException;
	
	 /**
	  * 스냅샷용 화학물질 정보 리스트 조회
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafCheChmstryInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafCheChmstryInfoVo> selectSafCheDeusePrductSnapList(SafCheSearchInfoVo vo) throws KitechException;

	 /**
	  * 폐기일자 정보 조회 
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDeManageInfoList(SafCheSearchInfoVo vo) throws KitechException;
	
	 /**
	  * 바코드 인식으로 세팅하는 경우 연구실 정보 조회 
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafCheProdDsuseSpaceVo> selectSafCheSpaceUseReqNoList(SafCheSearchInfoVo vo) throws KitechException;
					 
	 /**
	  *  연구실 제품 사용 목록
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafChePrdDeuseInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafChePrdDsuseInfoVo> selectListChmstryProduct(SafCheSearchInfoVo vo) throws KitechException;
	 
	 /**
	  * 연구실조회 팝업 검색
	  * 
	  * @author 김상미
	  * @param SafChePrdDsuseInfoVo
	  * @return List<SafCheSpaceInfoVo>
	  * @throws KitechException
	  * @since 2023.09.06.  
	  */
	 public List<SafCheSpaceInfoVo> selectSafCheSpacePopupList(SafCheSearchInfoVo vo) throws KitechException; 
}
