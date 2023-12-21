package kr.re.kitech.biz.fin.leg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.leg.dao.FinBgaCctmDAO;
import kr.re.kitech.biz.fin.leg.service.FinBgaCctmService;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmDetlVo;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmVo;
import kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("finBgaCctmService")
public class FinBgaCctmServiceImpl  extends EgovAbstractServiceImpl implements FinBgaCctmService {
	@Resource(name="finBgaCctmDAO")
  	private FinBgaCctmDAO finDAO;
	
	/**
     * 각계정정보조회 목록조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmInfoList(vo);
	}
	
	/**
     * 계정번호 세목코드 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public FinBgaCctmDetlVo selectFinBgaCctmInfo(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmInfo(vo);
	}
	
	/**
     * 계정별 보조장 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinRamtMngmtInfo(FinBgaCctmVo vo) {
		return finDAO.selectFinRamtMngmtInfo(vo);
	}
	
	/**
     * 계정원장 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList_2(FinBgaCctmVo vo) {
		if(vo.getService_id().trim().equals("F301")){
			return finDAO.selectFinBgaCctmInfoList_2(vo);
		} else {
			List<FinBgaCctmDetlVo> finBgaCctmDetlVoList = finDAO.selectFinBgaCctmInfoList_2(vo);
			
			for(FinBgaCctmDetlVo finBgaCctmDetlVo : finBgaCctmDetlVoList){
				String accnt_ymd = finBgaCctmDetlVo.getAccnt_ymd().substring(6).trim();
				if(accnt_ymd.equals("99")) {
					finBgaCctmDetlVo.setAccnt_ymd("당월계");
				} else if(accnt_ymd.equals("98")) {
					finBgaCctmDetlVo.setAccnt_ymd("이월");
				} else if(accnt_ymd.equals("97")) {
					finBgaCctmDetlVo.setAccnt_ymd("누계");
				}
			}
			return finBgaCctmDetlVoList;
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
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoExcel(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmInfoExcel(vo);
	}
	
	/**
     * 계정원장(비용과목) 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsClsfInfoList(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmExpnsClsfInfoList(vo);
	}
	
	/**
     * 계정원장(비용코드) 엑셀다운로드
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsInfoExcel(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmExpnsInfoExcel(vo);
	}
	
	/**
     * 계정원장(회계코드) 엑셀다운로드
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfoExcel(FinBgaCctmVo vo) {
		List<FinBgaCctmDetlVo> finBgaCctmDetlVoList = finDAO.selectFinBgaCctmAccntCdInfoExcel(vo);
		
		for(FinBgaCctmDetlVo finBgaCctmDetlVo : finBgaCctmDetlVoList){
			String accnt_ymd = finBgaCctmDetlVo.getAccnt_ymd().substring(6).trim();
			if(accnt_ymd.equals("99")) {
				finBgaCctmDetlVo.setAccnt_ymd("당월계");
			} else if(accnt_ymd.equals("97")) {
				finBgaCctmDetlVo.setAccnt_ymd("누계");
			}
		}
		
		return finBgaCctmDetlVoList;
	}
	
	/**
     * 계정원장명세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfo(FinBgaCctmVo vo) {
		List<FinBgaCctmDetlVo> finBgaCctmDetlVoList = finDAO.selectFinBgaCctmAccntCdInfo(vo);
		
		for(FinBgaCctmDetlVo finBgaCctmDetlVo : finBgaCctmDetlVoList){
			String accnt_ymd = finBgaCctmDetlVo.getAccnt_ymd().substring(6).trim();
			if(accnt_ymd.equals("99")) {
				finBgaCctmDetlVo.setAccnt_ymd("당월계");
			} else if(accnt_ymd.equals("98")) {
				finBgaCctmDetlVo.setAccnt_ymd("이월");
			} else if(accnt_ymd.equals("97")) {
				finBgaCctmDetlVo.setAccnt_ymd("누계");
			}
		}
		
		return finBgaCctmDetlVoList;
	}
	
	/**
     * 계정원장상세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfo(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmAccntInfo(vo);
	}
	
	/**
     * 계정원장상세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfoExcel_1(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmAccntInfoExcel_1(vo);
	}
	
	/**
     * 계정원장상세(부가세신고용) 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfoExcel_2(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmAccntInfoExcel_2(vo);
	}
	
	/**
     * 비목별사용명세 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinUseDetlsInfoList(FinBgaCctmVo vo) {
		return finDAO.selectFinUseDetlsInfoList(vo);
	}
	
	/**
     * 비목별집행현황 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.08.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmEnfrcInfo(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmEnfrcInfo(vo);
	}
	
	
	/**
     * 잔액정산현황 조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author JJW
	 * @since 2023.09.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinBgaCctmRamtInfo(FinBgaCctmVo vo) {
		return finDAO.selectFinBgaCctmRamtInfo(vo);
	}

	/**
     * 현금출납장조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author mklee
	 * @since 2023.09.18.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinCashRgstrList(FinBgaCctmVo vo) {		
		//FinBgaCctmDetlVo finVo = new FinBgaCctmDetlVo();
		List<FinBgaCctmDetlVo> finVo = finDAO.selectFinCashRgstrList(vo);
		
		long nDrAmt  = 0;
		long nCrAmt  = 0;
		long nJanAmt = 0;
		
		long bDr_amt = 0;
		long bCr_amt = 0;
		long bJan_amt = 0;
				
		for(int i=0; finVo.size() > i; i++){
		
			FinBgaCctmDetlVo rowVo = new FinBgaCctmDetlVo();
			rowVo = finVo.get(i);
			String SlipYmd = rowVo.getSlip_ymd().substring(6);
			if("97".equals(SlipYmd)){
				rowVo.setSlip_ymd("누계");
			}
			else if("98".equals(SlipYmd)){
				rowVo.setSlip_ymd("이월");
				
				bDr_amt = Long.valueOf(rowVo.getDr_amt());
			    bCr_amt = Long.valueOf(rowVo.getCr_amt());
			    bJan_amt = Long.valueOf(rowVo.getJan_amt());
			   
			    nDrAmt = bDr_amt;
			    nCrAmt = bCr_amt;
			    nJanAmt= bJan_amt;
			}
			else if("99".equals(SlipYmd)){
				rowVo.setSlip_ymd("당월계");
				
				FinBgaCctmDetlVo rowAddVo = new FinBgaCctmDetlVo();
				
				rowAddVo.setSlip_ymd("당월누계");
				
				long dr_amt = Long.valueOf(rowVo.getDr_amt());
			    long cr_amt = Long.valueOf(rowVo.getCr_amt());
			    long jan_amt = Long.valueOf(rowVo.getJan_amt());
			   
			    nDrAmt  = nDrAmt  +  dr_amt;
				nCrAmt  = nCrAmt  +  cr_amt;
				nJanAmt = nJanAmt +  jan_amt;
				
				rowAddVo.setDr_amt(String.valueOf(nDrAmt));
				rowAddVo.setCr_amt(String.valueOf(nCrAmt));
				rowAddVo.setJan_amt(String.valueOf(nJanAmt));
				
				finVo.add(++i, rowAddVo);				
			}
			
		}
		
		return finVo;
		
	}

	/**
     * 현금출납장조회
     * @param FinBgaCctmVo
     * @return List<FinBgaCctmDetlVo>
     * @throws Exception
	 * @author mklee
	 * @since 2023.09.18.
     */
	@Override
	public List<FinBgaCctmDetlVo> selectFinDayAccntList(FinBgaCctmVo vo) {
		return finDAO.selectFinDayAccntList(vo);
	}

	/**
     * 채권채무현황 조회
     * @param FspRamtCrateVo
     * @return List<FspRamtCrateVo>
     * @throws KitechException
	 * @author 이지훈
	 * @since 2023.09.
     */
	@Override
	public List<FspRamtCrateVo> selectList01(FspRamtCrateVo vo) throws KitechException {
    List<FspRamtCrateVo> list = finDAO.selectList01(vo);	
		return list;
	}
}
