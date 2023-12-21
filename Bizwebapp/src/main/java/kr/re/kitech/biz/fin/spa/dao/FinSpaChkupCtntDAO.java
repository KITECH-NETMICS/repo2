package kr.re.kitech.biz.fin.spa.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.com.vo.SfcChmclsSafeVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipDVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipHVo;
import kr.re.kitech.biz.fin.spa.vo.FinCheckUpSrcVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmInstlRegionVo;
import kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**
 * @ClassSubJect 소액물품검수
 * @Class Name FinSpaChkupCtntDAO.java
 * @Description 소액물품검수 관련 처리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/09/01      홍성민             최초생성
 * 
 * @author 홍성민
 * @since 2022/09/01
 * @version 1.0
 * @see
 * 
 */
@Repository("finSpaChkupCtntDAO")
public class FinSpaChkupCtntDAO extends BizDefaultAbstractDAO {
	
	/**
     * 소액물품검수관리 조회
     * @param FinCheckUpSrcVo
     * @return List<FinSpaChkupCtntVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<FinSpaChkupCtntVo> selectChkupCtntList(FinCheckUpSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.fin.spa.selectChkupCtntList", vo);
	}
	
	/**
     * 소액물품검수신청 폼 조회
     * @param FinCheckUpSrcVo
     * @return FinSpaChkupCtntVo
     * @throws Exception
     */	
	public FinSpaChkupCtntVo selectChkupCtnt(FinCheckUpSrcVo vo) throws KitechException {
		return (FinSpaChkupCtntVo)selectByPk("kr.re.kitech.biz.fin.spa.selectChkupCtnt", vo);
	}
	
	/**
     * 소액물품검수신청 품목내역 조회
     * @param FinCheckUpSrcVo
     * @return List<FspSmlItemCheckupDVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<FspSmlItemCheckupDVo> selectFspSmlItmCheckUpD(FinCheckUpSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spa.selectFspSmlItmCheckUpD", vo);
	}
	
	/**
     * 소액물품검수신청 모바일 업데이트
     * @param FinSpaChkupCtntVo
     * @throws Exception
     */	
	public void updateChkupCtnt(FinSpaChkupCtntVo vo) throws KitechException {
		update("kr.re.kitech.biz.fin.spa.updateChkupCtntMob", vo);
	}
	
	/**
     * 소액물품검수신청헤더 저장
     * @param FinSpaChkupCtntVo
     * @return int
     * @throws Exception
     */	
	public int insertFspSmlItmCheckupH(FinSpaChkupCtntVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.fin.spa.insertFspSmlItmCheckupH", vo);
	}
	
	/**
     * 최근 소액물품 설치지역 조회
     * @param String
	 * @return List<FspSmlItmInstlRegionVo>
     * @throws Exception
     */	
	@SuppressWarnings("unchecked")
	public List<FspSmlItmInstlRegionVo> selectRecntInstlRegion(String checkPsnNm) throws KitechException{
		return list("kr.re.kitech.biz.fin.spa.selectRecntInstlRegion", checkPsnNm);
	}
	
	/**
     * 소액물품검수신청헤더 수정
     * @param FinSpaChkupCtntVo
     * @return int
     * @throws Exception
     */	
	public int updateFspSmlItmCheckupH(FinSpaChkupCtntVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spa.updateFspSmlItmCheckupH", vo);
	}
	
	/**
     * 소액물품검수신청디테일 삭제
     * @param String
     * @return int
     * @throws Exception
     */	
	public int deleteFspSmlItmCheckupD(String checkNo) throws KitechException{
		return delete("kr.re.kitech.biz.fin.spa.deleteFspSmlItmCheckupD", checkNo);
	}
	
	/**
     * 소액물품검수신청디테일 삭제
     * @param String
     * @return int
     * @throws Exception
     */	
	public int insertFspSmlItmCheckupD(FspSmlItemCheckupDVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.fin.spa.insertFspSmlItmCheckupD", vo);
	}
    
    /**
     * 사전 안전성 검토 조회(소액물품검수신청 결재신청)
     * @param SfcChmclsSafeVo
     * @return List<SfcChmDetailVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<SfcChmDetailVo> selectSfcChmclsSafeDcdfprDetail(SfcChmclsSafeVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.spa.selectSfcChmclsSafeDcdfprDetail", vo);
    }
    
    /**
    * 경비결의 이지바로 증빙내역 조회,소액물품전자증빙(결재)
    * @param String checkNo
    * @return List<AttachVo>
    * @author LeeYH
    */
	@SuppressWarnings("unchecked")
	public List<AttachVo> selectFspEvidAttachApr(String checkNo) throws KitechException{
		return list("kr.re.kitech.biz.fin.spm.selectFspEvidAttachApr", checkNo);
	}
	
	/**
    * 소액물품결의생성화면 내역조회
    * @param FinCheckUpSrcVo
    * @return FspSmlItmCheckupSlipVo
    * @author LeeYH
    */
	public FspSmlItmCheckupSlipVo selectFspSmlItmCheckSlip(FinCheckUpSrcVo vo) throws KitechException{
		return (FspSmlItmCheckupSlipVo)selectByPk("kr.re.kitech.biz.fin.spa.selectFspSmlItmCheckSlip", vo);
	}
	
	/**
     * 결의서 헤더 조회
     * @param String
     * @return FspSlipHVo
     * @throws Exception
     */
	public FspSlipHVo selectFspSlipH(String unslipNo) throws KitechException{
    	return (FspSlipHVo)selectByPk("kr.re.kitech.biz.fin.spm.selectFspSlipH", unslipNo);
    }
    
    /**
     * 소액뭂품 결의생성 헤더 적요 조회
     * @param String
     * @return String
     * @throws Exception
     */
    public String selectCheckupSlipRmk(String checkNo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.fin.spa.selectCheckupSlipRmk", checkNo);
    }
    
    /**
     * 소액물품헤더 결의번호 업데이트
     * @param FspSmlItmCheckupSlipVo
     * @return int
     * @throws Exception
     */
    public int updateFspSmlItmCheckupHSlipNo(FspSmlItmCheckupSlipVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.fin.spa.updateFspSmlItmCheckupHSlipNo", vo);
    }
    
    /**
     * 소액물품검수신청 삭제(헤더 및 검수_기술장비등록)
     * @param String
     * @return int
     * @throws Exception
     */	
    public int deleteFspSmlItmCheckup(String checkNo) throws KitechException{
    	return delete("kr.re.kitech.biz.fin.spa.deleteFspSmlItmCheckup", checkNo);
    }
    
    /**
     * 연구관리 부서 담당자 검색
     * @param String
     * @return String
     * @throws Exception
     */
    public String selectXodrDeptResMan(String sysPayNo) throws KitechException{
    	return (String)selectByPk("kr.re.kitech.biz.res.com.selectXodrDeptResMan", sysPayNo);
    }
    
    /**
     * 결의생성시(통제내역으로 계정번호 가지고온경우) 집행내역 업데이트
     * @param FspSlipDVo
     * @return int
     * @throws Exception
     */
	public int updateBblenfrcAutoSlip(FspSlipDVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spa.updateBblenfrcAutoSlip", vo);
	}
	
	/**
     * 소액물품 검수신청 결재후 담당자저장
     * @param FinSpaChkupCtntVo
     * @return int
     * @throws Exception
     */
	public int updateFspSmlItmChkPostSave(FinSpaChkupCtntVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.spa.updateFspSmlItmChkPostSave", vo);
	}
}
