package kr.re.kitech.biz.api.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.SptCustVo;
import kr.re.kitech.biz.api.server.vo.biz.SptRstBookVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustChargVo;
import kr.re.kitech.biz.sup.cus.vo.SptCustMentrInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 기업지원 결재 사후작업 DAO
 * @Class Name SptProcessDAO.java
 * @Description 기업지원 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Repository("sptProcessDAO")
public class SptProcessDAO extends BizDefaultAbstractDAO {
	/**
     * 내부기술지원 신청서 결재완료 또는 반려시 신청상태 업데이트
     * @param ApiBpmVo
     * @return ApiBpmVo
     * @throws Exception
     */
	public int updateFspTechSuphApr(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateFspTechSuphApr", vo);
	}
	
	/**
     * 결재완료 후 파트너 기업 정보 변경신청서 조회
     * @param String reqNoVo
     * @return SptCustVo
     * @throws Exception
     */
	public SptCustVo selectSptParBaseInfo(String reqNo) throws ElException{
		return (SptCustVo)selectByPk("kr.re.kitech.biz.api.bpm.selectSptParBaseInfo", reqNo);
	}
	
	/**
     * 고객맨토 정보 및 고객업무담당자 삭제
     * @param SptCustVo
     * @return int
     * @throws Exception
     */
	public int deleteSptCustMentrInfoApr(SptCustVo vo) throws ElException{
		return delete("kr.re.kitech.biz.api.bpm.deleteSptCustMentrInfoApr", vo);
	}
	
	/**
     * 파트너 기업 정보 변경신청서멘토 조회
     * @param SptCustVo
     * @return List<SptCustMentrInfoVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptCustMentrInfoVo> selectSptCustMentrChngDList(SptCustVo vo) throws ElException{
		return list("kr.re.kitech.biz.api.bpm.selectSptCustMentrChngDList", vo);
	}
	
	/**
     * 고객멘토정보 입력
     * @param SptCustMentrInfoVo
     * @return int
     * @throws Exception
     */
	public int insertSptCustMentrInfo(SptCustMentrInfoVo vo) throws ElException{
		return insert("kr.re.kitech.biz.sup.cus.insertSptCustMentrInfo", vo);
	}
	
	/**
     * 내부기술지원 신청서 결재완료 또는 반려시 신청상태 업데이트
     * @param SptCustMentrInfoVo
     * @return int
     * @throws Exception
     */
	public int updateSptParBaseInfoRegion(SptCustMentrInfoVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateSptParBaseInfoRegion", vo);
	}
	
	/**
     * 파트너 기업 정보 변경신청서담당자 조회
     * @param SptCustVo
     * @return List<SptCustChargVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptCustChargVo> selectSptCustChargEngDList(SptCustVo vo) throws ElException{
		return list("kr.re.kitech.biz.api.bpm.selectSptCustChargEngDList", vo);
	}
	
	/**
     * 고객 업무 담당자 저장
     * @param SptCustChargVo
     * @return int
     * @throws Exception
     */
	public int insertSptCustCharg(SptCustChargVo vo) throws ElException{
		return insert("kr.re.kitech.biz.sup.cus.insertSptCustCharg", vo);
	}
	
	/**
     * 성적서 테이블에서 총 페이지 수 구하기
     * @param String reqNo
     * @return SptRstBookVo
     * @throws Exception
     */
	public SptRstBookVo selectSptRstBook(String reqNo) throws KitechException{
		return (SptRstBookVo)selectByPk("kr.re.kitech.biz.api.bpm.selectSptRstBook", reqNo);
	}
	
	/**
     * 성적서 수정/재발행일 경우 이전 문서번호 조회
     * @param SptRstBookVo
     * @return String
     * @throws Exception
     */
	public String selectSptRstBookMaxReq(SptRstBookVo vo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.api.bpm.selectSptRstBookMaxReq", vo);
	}
	
	/**
     * 삭제로직(삭제대상 테이블에 데이터 전송)
     * @param String
     * @return int
     * @throws Exception
     */
	public int insertJovConvDelList(String rqstNo) throws ElException{
		return insert("kr.re.kitech.biz.api.bpm.insertJovConvDelList", rqstNo);
	}
	
	/**
     * 삭제로직(job_conv 테이블)
     * @param String
     * @return int
     * @throws Exception
     */
	public int deleteJobConv(String rqstNo) throws ElException{
		return delete("kr.re.kitech.biz.api.bpm.deleteJobConv", rqstNo);
	}
	
	/**
     * 성적서 갑지 및 첨부파일 pdf 변환 호출
     * @param SptRstBookVo
     * @throws Exception
     */
	public void selectSpSumRstBookPdfFile(SptRstBookVo vo) throws KitechException{
		selectByPk("kr.re.kitech.biz.api.bpm.selectSpSumRstBookPdfFile", vo);
	}
	
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
     * 기업부담금 입금상태 수정
     * @param ApiBpmVo
     * @return int
     * @throws Exception
     */
	public int updateSptTltDepstDetlsApr(ApiBpmVo vo) throws ElException{
		return update("kr.re.kitech.biz.api.bpm.updateSptTltDepstDetlsApr", vo);
	}
}
