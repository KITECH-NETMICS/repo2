package kr.re.kitech.biz.res.stu.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.set.vo.FsaAbsrpListVo;
import kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo;
import kr.re.kitech.biz.res.stu.service.ResStuCostTrnsService;
import kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo;

/**  
 * @ClassSubJect 학생인건비 흡수/취소 
 * @Class Name : ResStuCostTrnsController.java
 * @Description : 학생인건비 흡수/취소 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/30   이민기                최초생성
 * 
 * @author 이민기
 * @since 2023/08/30
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Controller
public class ResStuCostTrnsController {
	@Resource(name="resStuCostTrnsService")	
	private ResStuCostTrnsService stuCostService;
	
	/** 학생인건비 추가흡수 및 흡수취소 결의 목록 조회 */
	@ElService(key = "SvcRESSTUSLIPR02")
	@RequestMapping(value = "SvcRESSTUSLIPR02")
	@ElDescription(sub = "학생인건비 흡수/취소 목록조회", desc = "학생인건비 흡수/취소 목록조회")
	@ElValidator(errUrl = "")
	public List<ResStuCostTrnsVo> selectResStuCostTrnsSlipList(ResStuCostTrnsVo vo) throws Exception{
		
		return stuCostService.selectResStuCostSlipMS(vo);
	}
	
	/** 학생인건비 추가흡수 및 흡수취소 결의 조회 */
	@ElService(key = "SvcRESSTUSLIPR01")
	@RequestMapping(value = "SvcRESSTUSLIPR01")
	@ElDescription(sub = "학생인건비 흡수/취소 내역조회", desc = "학생인건비 흡수/취소 내역조회")
	@ElValidator(errUrl = "")
	public FsaAbsrpListVo selectResStuCostTrnsSlip(FsaAbsrpVo vo) throws Exception{
		return stuCostService.selectResStuCostSlipSS(vo);
	}
	
	
	/** 학생인건비 흡수취소 이전내역 조회 */
	@ElService(key = "SvcRESSTUSLIPR03")
	@RequestMapping(value = "SvcRESSTUSLIPR03")
	@ElDescription(sub = "학생인건비 이전 흡수내역 조회", desc = "흡수취소를 위한 사전 데이터 조회")
	@ElValidator(errUrl = "")
	public List<FsaAbsrpVo> selectFsaAbsrpBfSlipMS(FsaAbsrpVo vo) throws Exception{
		return stuCostService.selectFsaAbsrpBfSlipMS(vo);
	}
	
	@ElService(key = "SvcRESSTUSLIPR04")
	@RequestMapping(value = "SvcRESSTUSLIPR04")
	@ElDescription(sub = "추가흡수 상세계정내역 조회", desc = "추가흡수 상세계정내역 조회")
	@ElValidator(errUrl = "")
	public List<FsaAbsrpVo> selectFsaAbsrpAccntMS(FsaAbsrpVo vo) throws Exception{
		return stuCostService.selectFsaAbsrpAccntMS(vo);
	}
	
	@ElService(key = "SvcRESSTUSLIPR05")
	@RequestMapping(value = "SvcRESSTUSLIPR05")
	@ElDescription(sub = "학생인건비 이관대상 상세 조회", desc = "학생인건비 이관대상 상세 조회")
	@ElValidator(errUrl = "")
	public List<ResStuCostTrnsVo> selectFsaTrnsAccntMS(ResStuCostTrnsVo vo) throws Exception{
		return stuCostService.selectFsaTrnspAccntMS(vo);
	}
	
	@ElService(key = "SvcRESSTUSLIPM01")
	@RequestMapping(value = "SvcRESSTUSLIPM01")
	@ElDescription(sub = "학생인건비 흡수취소 결의 (A타입) ", desc = "학생인건비 흡수취소 결의 (A타입) ")
	@ElValidator(errUrl = "")
	public FsaAbsrpVo saveResStuCostAbsrpSlip(FsaAbsrpListVo vo) throws Exception{
		FsaAbsrpVo fsaAbsrpVo = new FsaAbsrpVo();
		fsaAbsrpVo.setUnslip_no(stuCostService.saveStuCostSlip(vo));
		return fsaAbsrpVo;
	}
	
	@ElService(key = "SvcRESSTUSLIPM02")
	@RequestMapping(value = "SvcRESSTUSLIPM02")
	@ElDescription(sub = "학생인건비 흡수/취소 결의 삭제", desc = "학생인건비 흡수/취소 결의 삭제")
	@ElValidator(errUrl = "")
	public void saveResStuCostAbsrpSlipCancel(FsaAbsrpListVo vo) throws Exception{			
		stuCostService.saveStuCostSlipCancel(vo);
	}
	
	@ElService(key = "SvcRESSTUSLIPM03")
	@RequestMapping(value = "SvcRESSTUSLIPM03")
	@ElDescription(sub = "학생인건비 흡수/취소 결재신청", desc = "학생인건비 흡수/취소 결재신청")
	@ElValidator(errUrl = "")
	public void saveResStuCostAbsrpAprService(FsaAbsrpListVo vo) throws Exception{			
		stuCostService.saveStuCostApr(vo);
	}
}
