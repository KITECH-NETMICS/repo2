package kr.re.kitech.biz.fin.tax.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.tax.service.FinEtcIncomService;
import kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo;

/**  
 * @ClassSubJect 세무관리 Controller
 * @Class Name : FinEtcIncomController.java
 * @Description : 긱타소득관리를 처리하는 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/10/24   이민기            최초생성
 * 
 * @author 이민기
 * @since 2022/10/24
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Controller
public class FinEtcIncomController {
	@Resource(name="finEtcIncomService")
	private FinEtcIncomService etcIncomService;
	
	@ElService(key = "SvcFINETCINCOMR01")
	@RequestMapping(value = "SvcFINETCINCOMR01")
	@ElDescription(sub = "기타소득 목록 조회", desc = "기타소득 메뉴에서 목록 조회를 한다.")
	@ElValidator(errUrl = "")
	public List<FtxEtcIncomVo> selectEtcIncomList(FtxEtcIncomVo vo) throws Exception{
		return etcIncomService.selectEtcIncomList(vo);
	}
	
	@ElService(key = "SvcFINETCINCOMR02")
	@RequestMapping(value = "SvcFINETCINCOMR02")
	@ElDescription(sub = "기타소득 상세조회", desc = "기타소득 메뉴에서 상세팝업 조회")
	@ElValidator(errUrl = "")
	public FtxEtcIncomVo selectEtcIncomData(FtxEtcIncomVo vo) throws Exception{
		return etcIncomService.selectEtcIncomData(vo);
	}
	
	@ElService(key = "SvcFINETCINCOMD01")
	@RequestMapping(value = "SvcFINETCINCOMD01")
	@ElDescription(sub = "기타소득 단건 삭제", desc = "기타소득 메뉴에서 상세 팝업 삭제 기능")
	@ElValidator(errUrl = "")
	public void deleteEtcIncomData(FtxEtcIncomVo vo) throws Exception{
		etcIncomService.deleteEtcIncomData(vo);
	}
	
	@ElService(key = "SvcFINETCINCOMU01")
	@RequestMapping(value = "SvcFINETCINCOMU01")
	@ElDescription(sub = "기타소득 단건 수정", desc = "기타소득 메뉴에서 상세 팝업 수정 기능")
	@ElValidator(errUrl = "")
	public void updateEtcIncomData(FtxEtcIncomVo vo) throws Exception{
		etcIncomService.updateEtcIncomData(vo);
	}
	
	@ElService(key = "SvcFINETCINCOMI01")
	@RequestMapping(value = "SvcFINETCINCOMI01")
	@ElDescription(sub = "기타소득 단건 등록", desc = "기타소득 메뉴에서 상세 팝업 등록 기능")
	@ElValidator(errUrl = "")
	public void insertEtcIncomData(FtxEtcIncomVo vo) throws Exception{
		etcIncomService.insertEtcIncomData(vo);		
	}
}
