package kr.re.kitech.biz.epu.bid.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**  
 * @ClassSubJect 기술평가요청 관련 DAO
 * @Class Name : EpuBidTechEvalDAO.java
 * @Description : 기술평가요청 관련 DAO
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/10/17   석원탁             최초생성
 * 
 * @author 
 * @since 2023/10/17
 * @version 1.0
 * @see
 * 
 */
@Repository("epuBidTechEvalDAO")
public class EpuBidTechEvalDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 기술평가요청. 목록 조회
     */
	@SuppressWarnings("unchecked")
	public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalList(EpuBidTechEvalSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.epu.bid.selectEpuBidTechEvalList", vo);
	}

    /**
     * 기술평가요청(규격심사). 상세조회(입찰개요)
     */
	public EpuBidTechEvalInfoVo selectEpuBidTechEvalMasInfo(EpuBidTechEvalSrchVo vo) throws KitechException {
		return (EpuBidTechEvalInfoVo) selectByPk("kr.re.kitech.biz.epu.bid.selectEpuBidTechEvalMasInfo", vo);
	}

    /**
     * 기술평가요청(규격심사). 상세조회(업체조회)
     */
	@SuppressWarnings("unchecked")
	public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalComInfo(EpuBidTechEvalSrchVo vo) throws KitechException {
		return list("kr.re.kitech.biz.epu.bid.selectEpuBidTechEvalComInfo", vo);
	}

    /**
     * 기술평가요청(규격심사). 저장 (새로운 정보 update)
     */
	public void updateEpuBidTechEvalInfo(EpuBidTechEvalInfoVo saveVo) throws KitechException {
		//기존에 있던 것에 수정하는 개념이라 query는 update문 사용하는걸로 보임
		update("kr.re.kitech.biz.epu.bid.updateEpuBidTechEvalInfo", saveVo);
	}

    /**
     * 기술평가요청(규격심사). 업체 저장
     */
	public void insertEpuBidTechEvalVendInfo(EpuBidTechEvalInfoVo saveVoList) throws KitechException {
		insert("kr.re.kitech.biz.epu.bid.insertEpuBidTechEvalVendInfo", saveVoList);		
	}
	
	/**
	 * 기술평가요청(규격심사). 업체 삭제(신청글 내 업체 전체 삭제)
	 */
	public void deleteEpuBidTechEvalVendInfoAll(EpuBidTechEvalInfoVo saveVoList) throws KitechException {
		delete("kr.re.kitech.biz.epu.bid.deleteEpuBidTechEvalVendInfoAll", saveVoList);		
	}
	
	/**
	 * 기술평가요청(규격심사). 입찰가격배점 수정
	 */
	public void updateEpuBidTechEvalVendScore(EpuBidTechEvalInfoVo saveVo) throws KitechException {
		update("kr.re.kitech.biz.epu.bid.updateEpuBidTechEvalVendScore", saveVo);		
	}
	
	/**
	 * 기술평가요청(규격심사). 결재신청시 진행상태 수정
	 */
	public void updateEpuBidTechEvalInfoApr(EpuBidTechEvalInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.epu.bid.updateEpuBidTechEvalInfoApr", vo);		
	}

	/**
	 * 기술평가요청(규격심사). 평가 요청일자 등록(수정)
	 */
	public void updateEpuBidTechEvalInfoReqDaytm(EpuBidTechEvalInfoVo vo) throws KitechException {
		update("kr.re.kitech.biz.epu.bid.updateEpuBidTechEvalInfoReqDaytm", vo);		
	}

	/**
	 * 기술평가요청(규격심사). 결재신청 시 manager 조회
	 */
	public EpuBidTechEvalInfoVo selectDeptToManager(EpuBidTechEvalSrchVo vo) throws KitechException {
		return (EpuBidTechEvalInfoVo) selectByPk("kr.re.kitech.biz.epu.bid.selectDeptToManager", vo);
	}

	/**
	 * 기술평가요청(규격심사). 결재 최종담당자 정보 조회
	 */
	public EpuBidTechEvalInfoVo selectEpuBidTechEvalEndPoint(EpuBidTechEvalSrchVo vo) {
		return (EpuBidTechEvalInfoVo) selectByPk("kr.re.kitech.biz.epu.bid.selectEpuBidTechEvalEndPoint", vo);
	}

}
