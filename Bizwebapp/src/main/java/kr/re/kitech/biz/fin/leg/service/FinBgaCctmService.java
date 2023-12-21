package kr.re.kitech.biz.fin.leg.service;

import java.util.List;

import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmDetlVo;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmVo;
import kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

public interface FinBgaCctmService {
	/* 각계정정보조회 목록조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList(FinBgaCctmVo vo);
	
	/* 계정번호 세목코드 조회 */
	FinBgaCctmDetlVo selectFinBgaCctmInfo(FinBgaCctmVo vo);

	/* 계정별 보조장 조회 */
	List<FinBgaCctmDetlVo> selectFinRamtMngmtInfo(FinBgaCctmVo vo);

	/* 계정원장 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList_2(FinBgaCctmVo vo);
	
	/* 계정원장(계정별) 엑셀다운로드 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmInfoExcel(FinBgaCctmVo vo);
	
	/* 계정원장(비용과목) 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsClsfInfoList(FinBgaCctmVo vo);

	/* 계정원장(비용코드) 엑셀다운로드 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsInfoExcel(FinBgaCctmVo vo);

	/* 계정원장(회계코드) 엑셀다운로드 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfoExcel(FinBgaCctmVo vo);
	
	/* 계정원장명세 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfo(FinBgaCctmVo vo);
	
	/* 계정원장상세 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfo(FinBgaCctmVo vo);
	
	/* 계정원장상세 엑셀 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfoExcel_1(FinBgaCctmVo vo);
	
	/* 계정원장상세(부가세신고용) 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfoExcel_2(FinBgaCctmVo vo);
	
	/* 비목별사용명세 조회 */
	List<FinBgaCctmDetlVo> selectFinUseDetlsInfoList(FinBgaCctmVo vo);
	
	/* 비목별집행현황 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmEnfrcInfo(FinBgaCctmVo vo);
	
	/* 잔액정산현황 조회 */
	List<FinBgaCctmDetlVo> selectFinBgaCctmRamtInfo(FinBgaCctmVo vo);

	/* 현금출납장 조회 */
	List<FinBgaCctmDetlVo> selectFinCashRgstrList(FinBgaCctmVo vo);

	/* 일계표 조회 */
	List<FinBgaCctmDetlVo> selectFinDayAccntList(FinBgaCctmVo vo);
	
	/* 채권채무현황 엑셀 그리드 조회 */
	List<FspRamtCrateVo> selectList01(FspRamtCrateVo vo) throws KitechException;
}
