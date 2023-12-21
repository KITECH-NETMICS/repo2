package kr.re.kitech.biz.res.apc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.res.apc.service.ResAcpCmtService;
import kr.re.kitech.biz.res.apc.vo.ResApcCmtListVo;
import kr.re.kitech.biz.res.apc.vo.ResApcCmtVo;

@Controller
public class ResApcController {

	@Resource(name="resAcpCmtServiceImpl")
	ResAcpCmtService resAcpCmtService;

	@ElService(key = "SvcRESAPCCMTR01")
	@RequestMapping(value = "SvcRESAPCCMTR01")
	@ElDescription(sub = "사업신청 선정평가 위원회 목록 조회", desc = "사업신청 선정평가 위원회 목록을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResApcCmtVo> selectApcCmtList(ResApcCmtVo vo) throws Exception {
		return resAcpCmtService.selectApcCmtList(vo);
	}
	
	@ElService(key = "SvcRESAPCCMTR02")
	@RequestMapping(value = "SvcRESAPCCMTR02")
	@ElDescription(sub = "사업신청 위원회참여위원 조회", desc = "위원회그리드 클릭시 위원회참여인원을 조회한다.")
	@ElValidator(errUrl = "")
	public List<ResApcCmtVo> selectResApExtmmDtlList(ResApcCmtVo vo) throws Exception {
		return resAcpCmtService.selectResApExtmmDtlList(vo);
	}
	
	@ElService(key = "SvcRESAPCCMTM01")
	@RequestMapping(value = "SvcRESAPCCMTM01")
	@ElDescription(sub = "사업신청 선정평가 위원회 상세 목록 저장", desc = "사업신청 선정평가 위원회 상세 목록을 저장한다.")
	@ElValidator(errUrl = "")
	public void registApcCmtDetail(ResApcCmtListVo vo) throws Exception {
		resAcpCmtService.registApcCmtDetail(vo);
	}
	
}
