package kr.re.kitech.biz.fin.leg.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.leg.service.FinBgaCctmService;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmDetlVo;
import kr.re.kitech.biz.fin.leg.vo.FinBgaCctmVo;
import kr.re.kitech.biz.fin.leg.vo.FspRamtCrateListVo;
import kr.re.kitech.biz.fin.leg.vo.FspRamtCrateVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Controller
public class FinBgaCctmController {
	@Resource(name="finBgaCctmService")
	private FinBgaCctmService service;
	
	
	@ElService(key = "SvcFINFINRESMR01")
	@RequestMapping(value = "SvcFINFINRESMR01")
	@ElDescription(sub = "각 계정정보 조회", desc = "각 계정정보를 조회한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmInfoList(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR02")
	@RequestMapping(value = "SvcFINFINRESMR02")
	@ElDescription(sub = "계정번호 세목코드 조회", desc = "계정번호의 세목코드를 조회한다.")
	@ElValidator(errUrl = "")
	public FinBgaCctmDetlVo selectFinBgaCctmInfo(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmInfo(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR03")
	@RequestMapping(value = "SvcFINFINRESMR03")
	@ElDescription(sub = "계정별 보조장 조회", desc = "계정별 보조장을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinRamtMngmtInfo(FinBgaCctmVo vo) throws Exception{
		return service.selectFinRamtMngmtInfo(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR04")
	@RequestMapping(value = "SvcFINFINRESMR04")
	@ElDescription(sub = "계정원장 조회", desc = "계정원장을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoList_2(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmInfoList_2(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR05")
	@RequestMapping(value = "SvcFINFINRESMR05")
	@ElDescription(sub = "계정원장(비용과목) 조회", desc = "계정원장(비용과목) 조회한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsClsfInfoList(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmExpnsClsfInfoList(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR06")
	@RequestMapping(value = "SvcFINFINRESMR06")
	@ElDescription(sub = "계정원장(계정별) 엑셀다운로드", desc = "계정원장(계정별) 엑셀다운로드 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmInfoExcel(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmInfoExcel(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR07")
	@RequestMapping(value = "SvcFINFINRESMR07")
	@ElDescription(sub = "계정원장(비용코드) 엑셀다운로드", desc = "계정원장(비용코드) 엑셀다운로드 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmExpnsInfoExcel(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmExpnsInfoExcel(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR08")
	@RequestMapping(value = "SvcFINFINRESMR08")
	@ElDescription(sub = "계정원장(회계코드) 엑셀다운로드", desc = "계정원장(회계코드) 엑셀다운로드 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfoExcel(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmAccntCdInfoExcel(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR09")
	@RequestMapping(value = "SvcFINFINRESMR09")
	@ElDescription(sub = "계정원장명세 조회", desc = "계정원장명세 조회 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntCdInfo(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmAccntCdInfo(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR10")
	@RequestMapping(value = "SvcFINFINRESMR10")
	@ElDescription(sub = "계정원장상세 조회", desc = "계정원장상세 조회 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmAccntInfo(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmAccntInfo(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR11")
	@RequestMapping(value = "SvcFINFINRESMR11")
	@ElDescription(sub = "비목별사용명세 조회", desc = "비목별사용명세 조회 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinUseDetlsInfoList(FinBgaCctmVo vo) throws Exception{
		return service.selectFinUseDetlsInfoList(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR12")
	@RequestMapping(value = "SvcFINFINRESMR12")
	@ElDescription(sub = "잔액정산현황 조회", desc = "잔액정산현황 조회 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmRamtInfo(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmRamtInfo(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR13")
	@RequestMapping(value = "SvcFINFINRESMR13")
	@ElDescription(sub = "비목별집행현황 조회", desc = "비목별집행현황 조회 한다.")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinBgaCctmEnfrcInfo(FinBgaCctmVo vo) throws Exception{
		return service.selectFinBgaCctmEnfrcInfo(vo);
	}
	
	@ElService(key = "SvcFINFINRESMR14")
	@RequestMapping(value = "SvcFINFINRESMR14")
	@ElDescription(sub = "현금출납장조회", desc = "현금출납장조회")
	@ElValidator(errUrl = "")
	public List<FinBgaCctmDetlVo> selectFinCashRgstrList(FinBgaCctmVo vo) throws Exception{
		return service.selectFinCashRgstrList(vo);
	}

	@ElService(key = "SvcFINFINLEGR01")
	@RequestMapping(value = "SvcFINFINLEGR01")
	@ElDescription(sub = "채권채무현황 엑셀용 그리드 조회", desc = "채권채무현황 엑셀용 그리드 조회")
	@ElValidator(errUrl = "")
	public FspRamtCrateListVo selectList01(FspRamtCrateVo finVo) throws KitechException {
      List<FspRamtCrateVo> list = service.selectList01(finVo);    	 
      FspRamtCrateListVo List = new FspRamtCrateListVo();
      List.setFspRamtCrateVoList(list);
      return List;
	}
}
