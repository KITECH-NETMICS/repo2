package kr.re.kitech.biz.hum.apy.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.hum.apy.service.HumApyTrainLstReqService;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEducVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect :  교육훈련 신청(목록)
 * @ClassName : HumApyTrainLstReqController.java
 * @Description :  교육훈련 신청 Controller
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.05.      송선화    최초생성
 * 
 * @author 
 * @since 2023.10.05.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class HumApyTrainLstReqController {
	 @Resource(name = "humApyTrainLstReqServiceImpl")
	 private HumApyTrainLstReqService humApyTrainLstReqService;
	 
	 /**
     * 교육훈련 신청(목록)을 조회합니다.
     * @author 송선화
     * @param 교육훈련 신청 정보 HumApyTrainLstReqVo
     * @return List<HumApyTrainLstReqVo>
     * @throws KitechException
	  */     
	  @ElService(key="SvcHUMAPYHUMR01")
	  @RequestMapping(value="SvcHUMAPYHUMR01")
	  @ElDescription(sub="교육훈련 신청 목록 조회",desc="교육훈련 신청 목록을 조회한다.")
	  @ElValidator(errUrl = "")
	  public List<HumApyTrainLstReqVo> selectList(HumApyTrainLstReqVo infoVo) throws KitechException {
	      return humApyTrainLstReqService.selectList(infoVo);   
	  }
	 
	  /**
     * 교육훈련상세 조회 전 신청번호로 시스템사번 조회
     * @author 송선화
     * @param 시스템사번 조회 HumApyEducVo
     * @return HumApyEducVo
     * @throws KitechException
	  */     
	  @ElService(key="SvcHUMAPYHUMR02")
	  @RequestMapping(value="SvcHUMAPYHUMR02")
	  @ElDescription(sub="교육훈련상세 조회 전 신청번호로 시스템사번 조회",desc="교육훈련상세 조회 전 신청번호로 시스템사번 조회")
	  @ElValidator(errUrl = "")
	  public HumApyEducVo selectHumApyEduc(HumApyEducVo apyVo) throws KitechException {
		  return humApyTrainLstReqService.selectHumApyEduc(apyVo); 
	  }
	  
	  /**
     * 교육훈련 신청 기본정보 상세
     * @author 송선화
     * @param 교육훈련 신청 기본정보 상세 HumApyEducVo
     * @return HumApyEducVo
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMR03")
	  @RequestMapping(value="SvcHUMAPYHUMR03")
	  @ElDescription(sub=" 교육훈련 신청 기본정보 상세",desc=" 교육훈련 신청 기본정보 상세를 조회한다.")
	  @ElValidator(errUrl = "")
	  public HumApyTrainLstReqListVo selectApyTrainBasicInfo(HumApyEducVo apyVo) throws KitechException {
		  return humApyTrainLstReqService.selectApyTrainBasicInfo(apyVo);
	  }
	  
	  /**
     * 교육훈련 개별 상한 금액 체크
     * @author 송선화
     * @param 교육훈련 개별 상한 금액 체크 HumApyEducVo
     * @return List<HumApyEducVo>
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMR07")
	  @RequestMapping(value="SvcHUMAPYHUMR07")
	  @ElDescription(sub=" 교육훈련 신청 교육훈련참가 조회",desc=" 교육훈련 신청 교육훈련참가 조회한다.")
	  @ElValidator(errUrl = "")
	  public List<HumApyEducVo> selectEduAmt(HumApyEducVo educVo) throws KitechException {
		  return humApyTrainLstReqService.selectEduAmt(educVo);
	  }
		  
	  /**
     * 교육훈련 신청 저장
     * @author 송선화
     * @param 교육훈련 신청 저장 HumApyEducListVo
     * @return HumApyEducVo
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMM01")
	  @RequestMapping(value="SvcHUMAPYHUMM01")
	  @ElDescription(sub="교육훈련 신청 저장",desc="교육훈련 신청 저장한다.")
	  public HumApyEducVo saveEducAll(HumApyTrainLstReqListVo educVo) throws KitechException {
		  return humApyTrainLstReqService.saveEducAll(educVo);
	  }	 
	  
	  /**
     * 교육훈련 전자결제 승인(화면)
     * @author 송선화
     * @param HumApyTrainLstReqListVo
     * @return KitechKitechException
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMM02")
	  @RequestMapping(value="SvcHUMAPYHUMM02")
	  @ElDescription(sub="교육훈련 전자결제 승인(화면)",desc="교육훈련 전자결제 승인(화면)")
	  public void formAccept(HumApyTrainLstReqListVo vo, Model model) throws KitechException {
		  humApyTrainLstReqService.formAccept(vo);
	  }	 
	  
	  /**
     * 교육훈련 전자결제 반려(화면)
     * @author 송선화
     * @param HumApyTrainLstReqListVo
     * @return KitechKitechException
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMM03")
	  @RequestMapping(value="SvcHUMAPYHUMM03")
	  @ElDescription(sub="교육훈련 전자결제 반려(화면)",desc="교육훈련 전자결제 반려(화면)")
	  public void formReject(HumApyEducVo vo, Model model) throws KitechException {
		  humApyTrainLstReqService.formReject(vo);
	  }	 
		  
	  /**
     * 교육훈련 참석자, 전자결재 삭제
     * @author 송선화
     * @param HumApyEducVo
     * @return 
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMD01")
	  @RequestMapping(value="SvcHUMAPYHUMD01")
	  @ElDescription(sub="교육훈련 참석자, 전자결재 삭제",desc="교육훈련 참석자, 전자결재 삭제")
	  public void deleteApyTrain(HumApyEducVo vo) throws KitechException {
		  humApyTrainLstReqService.deleteApyTrain(vo);
	  }	 
	  
	  /**
     * 교육훈련 참석자 저장
     * @author 송선화
     * @param 교육훈련 참석자 저장 HumApyTrainLstReqListVo
     * @return List<HumApyEduCpacpVo>
     * @throws KitechException
	  */ 
	  @ElService(key="SvcHUMAPYHUMM04")
	  @RequestMapping(value="SvcHUMAPYHUMM04")
	  @ElDescription(sub="교육훈련 참석자 저장",desc="교육훈련 참석자 저장한다.")
	  public HumApyEduCpacpVo saveEducPacp(HumApyTrainLstReqListVo educVo) throws KitechException {
		  return humApyTrainLstReqService.saveEducPacp(educVo);
	  }	 
	  
}
