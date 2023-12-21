package kr.re.kitech.biz.epu.bid.service;

import java.util.List;

import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalListVo;
import kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술평가요청 관련 인터페이스
 * @Class Name : HumApyLndService.java
 * @Description : 기술평가요청 관련 인터페이스
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
public interface EpuBidTechEvalService {

	 /**
	 * 기술평가요청. 목록 조회
	 */
	public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalList(EpuBidTechEvalSrchVo vo) throws KitechException;

	 /**
	 * 기술평가요청(규격심사). 상세조회(입찰개요)
	 */
	public EpuBidTechEvalInfoVo selectEpuBidTechEvalMasInfo(EpuBidTechEvalSrchVo vo) throws KitechException;

	 /**
	 * 기술평가요청(규격심사). 상세조회(업체조회)
	 */
	public List<EpuBidTechEvalInfoVo> selectEpuBidTechEvalComInfo(EpuBidTechEvalSrchVo vo) throws KitechException;

	 /**
	 * 기술평가요청(규격심사). 저장
	 */
	public String insertEpuBidTechEvalInfo(EpuBidTechEvalListVo vo) throws KitechException;

	 /**
	 * 기술평가요청(규격심사). 수정
	 */
	public String updateEpuBidTechEvalInfo(EpuBidTechEvalListVo vo) throws KitechException;
	
	/**
	 * 기술평가요청(규격심사). 결재신청
	 */
	public void aprEpuBidTechEvalInfo(EpuBidTechEvalInfoVo vo) throws KitechException;
	
	/**
	 * 기술평가요청(규격심사). 결재승인
	 */
	public void formAccept(EpuBidTechEvalInfoVo vo) throws KitechException;
	
	/**
	 * 기술평가요청(규격심사). 결재반려
	 */
	public void formReject(EpuBidTechEvalInfoVo vo) throws KitechException;
	
	/**
	 * 기술평가요청(규격심사). 결재신청(스냅샷)
	 */
	public void aprEpuBidTechEvalInfoSnap(EpuBidTechEvalListVo vo) throws KitechException;
	
	/**
	 * 기술평가요청(규격심사). 결재신청 시 manager 조회
	 */
	public EpuBidTechEvalInfoVo selectDeptToManager(EpuBidTechEvalSrchVo vo) throws KitechException;
	
	/**
	 * 기술평가요청(규격심사). 결재 최종담당자 정보 조회
	 */
	public EpuBidTechEvalInfoVo selectEpuBidTechEvalEndPoint(EpuBidTechEvalSrchVo vo) throws KitechException;
	
}
