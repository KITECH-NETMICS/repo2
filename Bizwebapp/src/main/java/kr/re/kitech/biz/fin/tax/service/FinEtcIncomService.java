package kr.re.kitech.biz.fin.tax.service;

import java.util.List;

import kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo;

/**
 * 기타소득  인터페이스
 * @author MKLEE
 * @since 2023.10.24
 */
public interface FinEtcIncomService {
	/*
     * 기타소득 목록조회
     */
	public List<FtxEtcIncomVo> selectEtcIncomList(FtxEtcIncomVo vo);

	/*
     * 기타소득 상세조회
     */
	public FtxEtcIncomVo selectEtcIncomData(FtxEtcIncomVo vo);

	/*
     * 기타소득 단건 삭제
     */
	public void deleteEtcIncomData(FtxEtcIncomVo vo);
	
	/*
     * 기타소득 단건 수정
     */
	public void updateEtcIncomData(FtxEtcIncomVo vo);

	/*
     * 기타소득 단건 등록
     */
	public int insertEtcIncomData(FtxEtcIncomVo vo);
	

}
