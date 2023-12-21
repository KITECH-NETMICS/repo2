package kr.re.kitech.biz.api.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.SfcChmclVo;
import kr.re.kitech.biz.fin.fnd.vo.FcpDepstUpdVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 재무관리 결재 사후작업 DAO
 * @Class Name FinProcessDAO.java
 * @Description 재무관리 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/02      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/02
 * @version 1.0
 * @see
 * 
 */
@Repository("finProcessDAO")
public class FinProcessDAO extends BizDefaultAbstractDAO{
	/**
     * 신청번호로 결의번호 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectUnslipNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.api.bpm.selectUnslipNo", reqNo);
	}
	
	/**
     * 입금구분 조회
     * @param String unslipNo
     * @return String depst_clsf
     * @throws Exception
     */
	public String selectDepstClsf(String unslipNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.apr.bpm.selectDepstClsf", unslipNo);
	}
	
	/**
     * 결재신청 또는 반려시 입금요청확정 수정
     * @param FcpDepstUpdVo
     * @return int
     * @throws Exception
     */
	public int updateFcpDepstReqDecsn(FcpDepstUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.fnd.updateFcpDepstReqDecsn", vo);
	}
	
	/**
     * 결재완료시 입회검수일자 업데이트
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updateFspSmlItmCheckupHApr(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.apr.bpm.updateFspSmlItmCheckupHApr", vo);
	}
	
	/**
     * 소액물품 결재완료시 화학물질 조회
     * @param String reqNo
     * @return List<SfcChmclVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SfcChmclVo> selectSfcChmClssafEdcdfpInfoList(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.apr.bpm.selectSfcChmClssafEdcdfpInfoList", reqNo);
	}
	
	/**
     * 소액물품 결재완료시 화학물질 등록
     * @param SfcChmclVo
     * @return int
     * @throws Exception
     */
	public int insertSfcPrductQyInfo(SfcChmclVo vo) throws ElException{
		return insert("kr.re.kitech.biz.apr.bpm.insertSfcPrductQyInfo", vo);
	}
	
	/**
     * 소액물품 결재완료시 화학물질 등록
     * @param SfcChmclVo
     * @return int
     * @throws Exception
     */
	public String selectSfcChmSafeReqNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.apr.bpm.selectSfcChmSafeReqNo", reqNo);
	}
	
	/**
     * 소액물품 결재완료시 화학물질 등록
     * @param SfcChmclVo
     * @return int
     * @throws Exception
     */
	public int deleteSfcPrductQyInfo(String reqNo) throws ElException{
		return delete("kr.re.kitech.biz.apr.bpm.deleteSfcPrductQyInfo", reqNo);
	}
}
