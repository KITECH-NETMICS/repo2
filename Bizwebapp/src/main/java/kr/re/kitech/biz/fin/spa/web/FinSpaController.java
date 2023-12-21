package kr.re.kitech.biz.fin.spa.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.spa.service.FinSpaChkupCtntService;
import kr.re.kitech.biz.fin.spa.vo.FinCheckUpSrcVo;
import kr.re.kitech.biz.fin.spa.vo.FinCheckupSlipInfoVo;
import kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmChkUpInfoVo;
import kr.re.kitech.biz.fin.spa.vo.FspSmlItmInstlRegionVo;

/**
 * @ClassSubJect 소액물품검수신청 
 * @Class Name FinSpaController.java
 * @Description 소액물품검수신청 Controller
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/02/24      이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/02/24
 * @version 1.0
 * @see
 * 
 */
 
@Controller
public class FinSpaController {

	@Resource(name="finSpaChkupCtntServiceImpl")
	FinSpaChkupCtntService chkService;

    @ElService(key="SvcFINSPACHKR01")
    @RequestMapping(value="SvcFINSPACHKR01")    
    @ElDescription(sub="소액물품검수 목록 조회", desc="소액물품검수 신청 목록을 조회한다.")
    public List<FinSpaChkupCtntVo> selectChkupCtntList(FinCheckUpSrcVo vo) throws Exception {  
        return chkService.selectChkupCtntList(vo);
    }

    @ElService(key="SvcFINSPACHKR02")
    @RequestMapping(value="SvcFINSPACHKR02")    
    @ElDescription(sub="소액물품검수 단건 조회", desc="검색 조건에 대한 소액물품검수 결의서를 조회한다.")
    public FspSmlItmChkUpInfoVo selectSmlItemCheckupReq(FinCheckUpSrcVo vo) throws Exception {  
    	return chkService.selectSmlItemCheckupReq(vo);
    }

    @ElService(key="SvcFINSPACHKU01")
    @RequestMapping(value="SvcFINSPACHKU01")    
    @ElDescription(sub="소액물품검수 모바일용 첨부파일 업데이트", desc="소액물품검수 모바일용 첨부파일만 업데이트한다.")
    public String updateChkupCtnt(FinSpaChkupCtntVo vo) throws Exception {  
    	String check_no = chkService.saveChkupCtntMob(vo);    	
    	return check_no;
    }
    
    @ElService(key = "SvcFINSPAPOPR01")
	@RequestMapping(value = "SvcFINSPAPOPR01")
	@ElDescription(sub = "최근 소액물품 설치지역조회", desc = "최근 소액물품 설치지역을 조회한다.")
	@ElValidator(errUrl = "")
	public List<FspSmlItmInstlRegionVo> selectRecntInstlRegion(FspSmlItmInstlRegionVo vo) throws Exception{
    	return chkService.selectRecntInstlRegion(vo);
    }
    
    @ElService(key = "SvcFINSPACHKM01")
	@RequestMapping(value = "SvcFINSPACHKM01")
	@ElDescription(sub = "소액물품검수신청 저장", desc = "소액물품검수신청(헤더,디테일,사전안전선검토,전자증빙)을 저장한다.")
	@ElValidator(errUrl = "")
	public FinCheckUpSrcVo saveFinSmlItemCheckup(FspSmlItmChkUpInfoVo vo) throws Exception{
    	return chkService.saveFinSmlItemCheckup(vo);
    }

    @ElService(key = "SvcFINSPACHKR03")
	@RequestMapping(value = "SvcFINSPACHKR03")
	@ElDescription(sub = "소액물품검수결의 조회", desc = "소액물품검수결의 화면에서 결의서헤더와 검수지급내역을 조회한다.")
	@ElValidator(errUrl = "")
	public FinCheckupSlipInfoVo selectFinSmlItmCheckupSlip(FinCheckUpSrcVo vo) throws Exception{
    	return chkService.selectFinSmlItmCheckupSlip(vo);
    }
    
    @ElService(key = "SvcFINSPACHKM02")
	@RequestMapping(value = "SvcFINSPACHKM02")
	@ElDescription(sub = "소액물품검수결의생성", desc = "소액물품검수결의를 생성한다.")
	@ElValidator(errUrl = "")
	public FinCheckUpSrcVo saveFinSmlItmCheckupSlip(FinCheckupSlipInfoVo vo) throws Exception{
    	FinCheckUpSrcVo retVo = new FinCheckUpSrcVo();
    	retVo.setUnslip_no(chkService.saveFinSmlItmCheckupSlip(vo));
    	
    	return retVo;
    }
    
    @ElService(key = "SvcFINSPACHKD01")
	@RequestMapping(value = "SvcFINSPACHKD01")
	@ElDescription(sub = "소액물품검수신청 삭제", desc = "소액물품검수신청서 및 결재정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteFspSmlItmCheckup(FinCheckUpSrcVo vo) throws Exception{
    	chkService.deleteFspSmlItmCheckup(vo);
    }
    
    @ElService(key = "SvcFINSPACHKD02")
	@RequestMapping(value = "SvcFINSPACHKD02")
	@ElDescription(sub = "소액물품검수결의 삭제", desc = "소액물품검수결의서 및 결재정보를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteSmpItemCheckupSlip(FspSmlItmCheckupSlipVo vo) throws Exception{
    	chkService.deleteSmpItemCheckupSlip(vo);
    }
    
    @ElService(key = "SvcFINSPACHKU02")
	@RequestMapping(value = "SvcFINSPACHKU02")
	@ElDescription(sub = "결재 후 소액물품검수신청 담당자 저장", desc = "결재 후 소액물품검수신청에 대한 일부항목을 저장한다.")
	@ElValidator(errUrl = "")
	public void postSaveFinSmlItemCheckup(FinSpaChkupCtntVo vo) throws Exception{
    	chkService.postSaveFinSmlItemCheckup(vo);
    }
}
