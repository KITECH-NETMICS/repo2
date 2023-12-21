package kr.re.kitech.biz.fin.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FbaExpnsEvidVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspEvidRptKeyVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaSlipUpdVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 전자증빙 관리 
 * @Class Name FinComAttachDAO
 * @Description 전자증빙 관리 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/13      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/13
 * @version 1.0
 * @see
 * 
 */
@Repository("finComAttachDAO")
public class FinComAttachDAO extends BizDefaultAbstractDAO{
	/**
     * 전자증빙 레포트키 삭제
     * @param FbaExpnsEvidVo
     * @return int
     * @throws Exception
     */
	public int deleteFspEvidRptKey(FbaExpnsEvidVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspEvidRptKey", vo);
	}
	
	/**
     * 전자증빙 삭제
     * @param FbaExpnsEvidVo
     * @return int
     * @throws Exception
     */
	public int deleteFspEvidAttach(FbaExpnsEvidVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteFspEvidAttach", vo);
	}
	
	/**
     * doc_id별로 증빙조회
     * @param FbaExpnsEvidVo
     * @return List<FbaExpnsEvidVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FspEvidAttachVo> selectFbaExpnsEvidList(FbaExpnsEvidVo vo) throws ElException{
		return list("kr.re.kitech.biz.fin.com.selectFbaExpnsEvidList", vo);
	}
	
	/**
     * 전자증빙 저장
     * @param FspEvidAttachVo
     * @return int
     * @throws Exception
     */
	public int mergeFspEvidAttach(FspEvidAttachVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.mergeFspEvidAttach", vo);
	}
	
	/**
     * 전자증빙 레포트키 저장
     * @param FspEvidRptKeyVo
     * @return int
     * @throws Exception
     */
	public int updateFspEvidRptKey(FspEvidRptKeyVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspEvidRptKey", vo);
	}	
	
	/**
     * 결의생성 또는 삭제시 결의번호 업데이트
     * @param FinSpaSlipUpdVo
     * @return int
     * @throws Exception
     */
	public int updateFspEvidAttach(FinSpaSlipUpdVo vo) throws ElException{
		return update("kr.re.kitech.biz.fin.com.updateFspEvidAttach", vo);
	}
	
	/**
     * 삭제대상 테이블에 데이터 입력
     * @param EvidAttachVo
     * @return int
     * @throws Exception
     */
	public int insertJobConvDelList(EvidAttachVo vo) throws ElException{
		return insert("kr.re.kitech.biz.fin.com.insertJobConvDelList", vo);
	}
	
	/**
     * job_conv 테이블 삭제
     * @param EvidAttachVo
     * @return int
     * @throws Exception
     */
	public int deleteJobConv(EvidAttachVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteJobConv", vo);
	}
	
	/**
     * ACT_PDF_FILE_ALL 테이블 삭제
     * @param EvidAttachVo
     * @return int
     * @throws Exception
     */
	public int deleteActPdfFileAll(EvidAttachVo vo) throws ElException{
		return delete("kr.re.kitech.biz.fin.com.deleteActPdfFileAll", vo);
	}
	
	
	/**
     * 전자증빙 프로시저 호출
     * @param EvidAttachVo
     * @throws Exception
     */
	public void selectCallSpActPdfFileall(EvidAttachVo vo) throws ElException{
		selectByPk("kr.re.kitech.biz.fin.com.selectCallSpActPdfFileall", vo);
	}
	
	/**
     * 증빙관리번호 조회
     * @param String reqNo
     * @return String
     * @throws Exception
     */
	public String selectEvidMngmtNo(String reqNo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.fin.com.selectEvidMngmtNo", reqNo);
	}
	
	/**
     * 전자증빙 관리순번 조회
     * @param FspEvidAttachVo
     * @return int
     * @throws Exception
     */
	public int selectEvidMngmtSeq(FspEvidAttachVo vo) throws ElException{
		return (int)selectByPk("kr.re.kitech.biz.fin.com.selectEvidMngmtSeq", vo);
	}
}
