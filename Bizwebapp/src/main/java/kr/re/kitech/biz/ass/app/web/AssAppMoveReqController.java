package kr.re.kitech.biz.ass.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ass.app.service.AssAppMoveReqService;
import kr.re.kitech.biz.ass.app.service.AssAppUnUseService;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqListVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo;
import kr.re.kitech.biz.ass.app.vo.AssMastrBVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseListVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
 * @ClassSubJect 자산 이동신청 
 * @Class Name : AssAppMoveReqController.java
 * @Description : 자산 이동신청 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/08   이정호                  최초생성
 * 
 * @author LeeJh
 * @since 2023/08/30
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@SuppressWarnings("unused")
@Controller
public class AssAppMoveReqController{
	@Resource(name="assAppMoveReqService")
	AssAppMoveReqService moveReqService;

	@Resource(name="assAppUnUseService")
	AssAppUnUseService unUseService;

	@ElService(key = "SvcASSAPPMOVEREQR01")
	@RequestMapping(value = "SvcASSAPPMOVEREQR01")
	@ElDescription(sub = "자산 이동신청 목록 조회", desc = "자산 이동신청 목록을 조회한다")
	@ElValidator(errUrl = "")
	public List<AssAppMoveReqVo> selectAssAppMoveReqList(AssAppMoveReqSrchVo vo) throws Exception {
		return moveReqService.selectAssAppMoveReqList(vo);
	}

	@ElService(key = "SvcASSAPPMOVEREQR02")
	@RequestMapping(value = "SvcASSAPPMOVEREQR02")
	@ElDescription(sub = "자산 이동신청 상세 조회", desc = "자산 이동신청 상세정보를 조회한다")
	@ElValidator(errUrl = "")
	public List<AssAppMoveReqDetailVo> selectAssAppMoveReqDetail(AssAppMoveReqVo vo) throws Exception {
		return moveReqService.selectAssAppMoveReqDetail(vo);
	}

	/**
	 * 자산 이동신청 저장
	 * @param vo 이동신청 vo
	 * @return 상세보기
	 * @throws Exception
	 */

	@ElService(key = "SvcASSAPPMOVEREQI01")
	@RequestMapping(value = "SvcASSAPPMOVEREQI01")
	@ElDescription(sub = "자산 이동신청 저장", desc = "자산 이동신청을 저장한다.")
	@ElValidator(errUrl = "")
	public AssAppMoveReqVo saveAssetMove(AssAppMoveReqListVo vo) throws Exception {

		AssAppMoveReqVo retVo = new AssAppMoveReqVo();
		retVo.setReq_no(moveReqService.saveAssetMove(vo));

		return retVo;
	}

	/**
	 * 결재 신청서 삭제
	 * @param vo 이동신청 vo
	 * @throws Exception
	 */
	@ElService(key = "SvcASSAPPMOVEREQD01")
	@RequestMapping(value = "SvcASSAPPMOVEREQD01")
	@ElDescription(sub = "결재 신청서 삭제", desc = "결재 신청서를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteAssAprInfo(AssAppMoveReqDetailVo vo) throws Exception {
		String reqNo = vo.getReq_no();
		String aprClsf = reqNo.substring(0, 3);

		switch(aprClsf) {
			case "A12" :
				AssUnUseVo unUseVo = new AssUnUseVo();
				unUseVo.setReq_no(reqNo);

				unUseService.deleteAsetUnUse(unUseVo);
				break;

			case "A13" :
			case "A14" :				
				moveReqService.deleteAssMove(vo);
				break;

			default :
				moveReqService.deleteAssAprInfo(vo);
				break;
		}
	}
}
