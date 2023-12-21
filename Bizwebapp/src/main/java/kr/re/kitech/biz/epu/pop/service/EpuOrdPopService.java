package kr.re.kitech.biz.epu.pop.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqItemVo;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

public interface EpuOrdPopService {
	/*
	* 발주계획구매요구 품목내역팝업 구매요구리스트 조회
	*/
	public List<PurReqItemVo> selectPurReqForOrd(PurReqItemVo OrdVo) throws ElException;
	/*
	* 발주계획 - 구매요구내역 첨부파일 조회
	*/
	public List<AttachVo> selectXomxComAttachPur(EpuOrdSrcVo vo);
	/*
	* 발주계획 및 입찰설명회 - 지명업체 조회
	*/
	public List<EpuOrnomVendVo> selectEpuVendInfo(EpuOrnomVendVo vo);
	/*
	* 조달청 거래처등록 팝업 조회
	*/
	public EpuOrnomVendVo selectEpuVendInfoG2b(EpuOrnomVendVo vo);
	/*
	* 조달청 거래처등록 팝업 저장
	*/
	public void saveEpuVendInfoG2b(EpuOrnomVendVo vo);
}
