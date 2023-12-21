package kr.re.kitech.biz.saf.che.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.saf.che.vo.SafCheChmstryInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafChePrdDsuseInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafCheProdDsuseSpaceVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchInfoVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSearchVo;
import kr.re.kitech.biz.saf.che.vo.SafCheSpaceInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect : 화학제품폐기처리
 * @ClassName : SafCheProdDeuseDAO.java
 * @Description 화학제품폐기처리 DAO
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
 
@Repository("safCheProdDsuseDAO")
public class SafCheProdDsuseDAO extends BizDefaultAbstractDAO{

	/**
	 * 화학제품폐기관리 리스트 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafChePrdDsuseInfoVo> selectList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSfaCheProdDsuseReqstList", vo);
	}
	
	/**
	 * 부서타입 조회
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public SafChePrdDsuseInfoVo selectDeptType(SafCheSearchInfoVo vo) throws KitechException {
		return (SafChePrdDsuseInfoVo) selectByPk("kr.re.kitech.biz.saf.che.selectSfcUserDeptTyp", vo);
	}
	
	/**
	 * 바코드 입력시 사용번호 상태 조회
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafCheUserDeptTypVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public SafChePrdDsuseInfoVo selectSafCheDsuseInfo(SafCheSearchInfoVo vo) throws KitechException {
		return (SafChePrdDsuseInfoVo) selectByPk("kr.re.kitech.biz.saf.che.selectSafCheDsuseInfo", vo);
	}
	 
	/**
	 * 폐기시 상태값 변경 
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int updateDsuseProdtQyDynamic(SafChePrdDsuseInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.saf.che.updateSfaCheDsuseProdQyStateDynamic", vo);	 
	}	 
	 
	/**
	 * 폐기신청 이력관리 저장
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int insertDisposalAppHistory(SafChePrdDsuseInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.saf.che.insertSafCheDisposalAppHistory", vo);
	}
	
	/**
	 * 폐기등록/변경
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int saveSfaCheDsuseReqstInfo(SafChePrdDsuseInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.saf.che.insertSfaCheDsuseRequestInfo", vo);	 
	}	 
	 
	/**
	 * 폐기신청 상세등록 detail
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int insertSafCheDsuseReqstDetail(SafChePrdDsuseInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.saf.che.insertSafCheDsuseReqstDetail", vo);
	}
	
	/**
	 * 폐기제품 detail
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int insertSafCheDsusePrductDetail(SafChePrdDsuseInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.saf.che.insertSafCheDsusePrductDetail", vo);
	}	 	 
	/**
	 * 폐기신청 이력관리 INSERT
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int insertDsusePrductDetail(SafChePrdDsuseInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.saf.che.insertSfaCheDisposalAppHistory", vo);
	}
	 
	/**
	 * 폐기 상태값 변경 
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int updateDsuseProdtQySate(SafChePrdDsuseInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.saf.che.updateSafChePrductQyState", vo);	 
	}	 
	
	/**
	 * 폐기완료시 상태값 변경
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int updateDsuseProdtQyComplete(SafChePrdDsuseInfoVo vo) throws KitechException {
		return update("kr.re.kitech.biz.saf.che.updateSafChePrductQyComplete", vo);	 
	}	 
	 	 
	/**
	 * 폐기신청 메인 정보 삭제
	 * 
	 * @author 김상미
	 * @param  deleteSafCheDsuseReqstInfo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int deleteDsuseReqstInfo(SafChePrdDsuseInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.saf.che.deleteSafCheDsuseReqstInfo", vo);
	}   
	 
	/**
	 * 폐기신청 상세 정보 삭제
	 * 
	 * @author 김상미
	 * @param  deleteSafCheDsuseReqstInfo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int deleteDsuseReqstDetail(SafChePrdDsuseInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.saf.che.deleteSafCheDsuseReqstDetail", vo);
	}   
	   	 
	 /**
	 * 폐기신청 상세 정보 삭제
	 * 
	 * @author 김상미
	 * @param  deleteSafCheDsuseReqstInfo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public int deleteDsusePrductDetail(SafChePrdDsuseInfoVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.saf.che.deleteSafCheDsusePrductDetail", vo);
	}   
	
	/**
	 * 연구실 상세보기
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafCheProdDeuseSpaceVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public SafCheProdDsuseSpaceVo selectSafCheSpace(SafCheSearchInfoVo vo) throws KitechException {
		return (SafCheProdDsuseSpaceVo) selectByPk("kr.re.kitech.biz.saf.che.selectSafCheSpace", vo);
	}
	 
	/**
	 * 사용번호 폐기 시 제품 정보 리스트
	 * 
	 * @author 김상미
	 * @param SafCheSearchVo
	 * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafChePrdDsuseInfoVo> selectSafCheUsePrductQyList(SafCheSearchVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheUsePrductQyList", vo);
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
	public List<SafCheChmstryInfoVo> selectSafCheProductChmstryList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafCheChmstryInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheProductChmstryList", vo);
	}
	
	/**
	 * 사용제품 기준 화학 제품 별 화학물질
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public SafChePrdDsuseInfoVo selectSafCheUseProdChmstryList(SafCheSearchInfoVo vo) throws KitechException {
		return (SafChePrdDsuseInfoVo) selectByPk("kr.re.kitech.biz.saf.che.selectSafCheUseProdChmstryList", vo);
	}	  	   
	
	/**
	 * 폐기 내역 
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public SafChePrdDsuseInfoVo selectSafCheProdDsuseReqstInfo(SafCheSearchInfoVo vo) throws KitechException {
		return (SafChePrdDsuseInfoVo) selectByPk("kr.re.kitech.biz.saf.che.selectSafCheProdDsuseReqstInfo", vo);
	}
	
	/**
	 * 폐기 상세 내역
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafChePrdDsuseInfoVo> selectSafCheProdDsuseReqstDetail(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheProdDsuseReqstDetail", vo);
	}
	
	/**
	 * 폐기신청 제품 상세 내역
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafChePrdDsuseInfoVo> selectSafCheDsusePrductDetailList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheDsusePrductDetailList", vo);
	}
	
	/**
	 * 폐기 기간 설정 조회
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDateManage(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheDsuseDateManage", vo);
	}	
	
	/**
	 * 안전보건담당자 확인
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafChePrdDsuseInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public SafChePrdDsuseInfoVo selectDeptToManager(SafCheSearchInfoVo vo) throws KitechException {
		return (SafChePrdDsuseInfoVo) selectByPk("kr.re.kitech.biz.saf.che.selectDeptToManager", vo);
	}
	 
	/**
	 * 물질명칭, 관리법,보건법, 안전관리법조회
	 * 
	 * @author 김상미
	 * @param  SafChePrdDsuseInfoVo
	 * @return SafCheChmstryInfoVo
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	 public SafCheChmstryInfoVo selectSafCheLawData(SafCheSearchInfoVo vo) throws KitechException {
		 return (SafCheChmstryInfoVo) selectByPk("kr.re.kitech.biz.saf.che.selectSafCheLawData", vo);
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
	public List<SafCheChmstryInfoVo> selectSafCheDeusePrductSnapList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafCheChmstryInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheDeusePrductSnapList", vo);
	}	
	
	/**
	 * 폐기일자 정보 조회 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafChePrdDsuseInfoVo> selectSafCheDsuseDeManageInfoList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheDsuseDeManageInfoList", vo);
	}		
	
	
	/**
	 * 바코드 인식으로 세팅하는 경우 연구실 정보 조회 
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheProdDsuseSpaceVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafCheProdDsuseSpaceVo> selectSafCheSpaceUseReqNoList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafCheProdDsuseSpaceVo>)list("kr.re.kitech.biz.saf.che.selectSafCheSpaceUseReqNoList", vo);
	}			 	    	
			 	    	 	 	
	/**
	 * 연구실 제품 사용 목록
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafChePrdDsuseInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06. 
	 */
	public List<SafChePrdDsuseInfoVo> selectListChmstryProduct(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafChePrdDsuseInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafChePrductQyInfoPopup", vo);
	}
		
	/**
	 * 연구실검색
	 * 
	 * @author 김상미
	 * @param SafChePrdDsuseInfoVo
	 * @return List<SafCheSpaceInfoVo>
	 * @throws KitechException
	 * @since 2023.09.06.  
	 */
	public List<SafCheSpaceInfoVo> selectSafCheSpacePopupList(SafCheSearchInfoVo vo) throws KitechException {
		return (List<SafCheSpaceInfoVo>)list("kr.re.kitech.biz.saf.che.selectSafCheSpacePopupList", vo);
	}
	  
}
