package kr.re.kitech.biz.fin.leg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmDetlVo;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmVo;
import kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("finBgaCctmDAO")
public class FinBgaCctmDAO extends BizDefaultAbstractDAO {
	/**
     * 각계정정보조회 목록조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmInfoList", vo);
	}
	
	/**
     * 계정번호 세목코드 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	public FinBgaCctmDetlVo selectFinBgaCctmInfo(FinBgaCctmVo vo) {
		return (FinBgaCctmDetlVo) selectByPk("kr.re.kitech.biz.fin.leg.selectFinBgaCctmInfo", vo);
	}
	
	/**
     * 계정별 보조장 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinRamtMngmtInfo(FinBgaCctmVo vo) {
		if(vo.getService_id().trim().equals("F316")){
			return list("kr.re.kitech.biz.fin.leg.selectFinRamtMngmtDetlsInfo", vo);
		} else {
			return list("kr.re.kitech.biz.fin.leg.selectFinRamtMngmtInfo", vo);
		}
	}
	
	/**
     * 계정원장 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList_2(FinBgaCctmVo vo) {
		if(vo.getService_id().trim().equals("F301")){
			return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmInfoList_3", vo);
		} else {
			return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmInfoList_2", vo);
		}
	}
	
	/**
     * 계정원장(계정별) 엑셀다운로드
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoExcel(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmInfoExcel", vo);
	}
	
	/**
     * 계정원장(비용과목) 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsClsfInfoList(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmExpnsClsfInfoList", vo);
	}
	
	/**
     * 계정원장(비용코드) 엑셀다운로드
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsInfoExcel(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmExpnsInfoExcel", vo);
	}
	
	/**
     * 계정원장(회계코드) 엑셀다운로드
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfoExcel(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmAccntCdInfoExcel", vo);
	}
	
	/**
     * 계정원장명세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfo(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmAccntCdInfo", vo);
	}
	
	/**
     * 계정원장상세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfo(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmAccntInfo", vo);
	}
	
	/**
     * 계정원장상세 엑셀 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfoExcel_1(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmAccntInfoExcel_1", vo);
	}
	
	/**
     * 계정원장상세(부가세신고용) 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfoExcel_2(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmAccntInfoExcel_2", vo);
	}
	
	/**
     * 비목별사용명세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinUseDetlsInfoList(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinUseDetlsInfoList", vo);
	}
	
	/**
     * 비목별집행현황 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmEnfrcInfo(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmEnfrcInfo", vo);
	}
	
	/**
     * 잔액정산현황 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.09.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmRamtInfo(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinBgaCctmRamtInfo", vo);
	}

	/**
     * 현금출납장 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author mklee
	 * @since 2023.09.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinCashRgstrList(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinCashRgstrList", vo);
	}

	/**
     * 일계표 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author mklee
	 * @since 2023.09.
     */
	@SuppressWarnings("unchecked")
	public List<FinBgaCctmDetlVo> selectFinDayAccntList(FinBgaCctmVo vo) {
		return list("kr.re.kitech.biz.fin.leg.selectFinDayAccntList", vo);
	}

	/**
    * 채권채무현황 조회
    * 
    * @author 
    * @param FspRamtCrateVo
    * @return List<FspRamtCrateVo>
    * @throws KitechException
    * @since 2023.09.06.   
    */
	@SuppressWarnings("unchecked")
  	public List<FspRamtCrateVo> selectList01(FspRamtCrateVo vo) throws KitechException {
    	return (List<FspRamtCrateVo>)list("kr.re.kitech.biz.fin.leg.selectFspRamtCrate", vo);
	}
}