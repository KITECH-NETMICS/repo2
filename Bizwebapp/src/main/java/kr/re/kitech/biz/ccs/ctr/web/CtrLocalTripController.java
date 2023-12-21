package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.ctr.service.CtrLocalTripService;
import kr.re.kitech.biz.ccs.ctr.vo.BizTripFareVo;
import kr.re.kitech.biz.ccs.ctr.vo.CheckSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripVO;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripCurStnVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrTripSrcVo;

/**
 * @ClassSubJect 근거리출장 관련 처리 컨트롤러
 * @Class Name CtrTripInviteController.java
 * @Description 근거리출장 관련 처리 컨트롤러
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/05/13      김태균             최초생성
 * 
 * @author 김태균
 * @since 2022/05/13
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CtrLocalTripController {
	
	@Resource(name = "ctrLocalTripService")
	private CtrLocalTripService ctrLocalTripService;	
	
	/**
     * 여비금을 조회 한다
     * @param Object
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRLTFR01")
    @RequestMapping(value="SvcCCSCTRLTFR01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="여비금 조회",desc="여비금을 조회 한다")
    public List<BizTripFareVo> selectCtrTrafcFee(CtrTripSrcVo param) throws Exception {
    	return ctrLocalTripService.selectCtrTrafcFee(param);
    }
    
    /**
     * 근거리출장을 생성 한다
     * @param CtrLocalTripVO
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRLTBC01")
    @RequestMapping(value="SvcCCSCTRLTBC01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="근거리출장 생성",desc="근거리출장을 생성 한다")
    public CtrTripSrcVo saveCtrLocalTrip(CtrLocalTripVO vo) throws Exception {
    	return ctrLocalTripService.saveCtrLocalTrip(vo);
    }
    
    /**
     * 근거리출장을 삭제 한다
     * @param CtrLocalTripInfoVO
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRLTBD01")
    @RequestMapping(value="SvcCCSCTRLTBD01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="근거리출장 삭제",desc="근거리출장을 삭제 한다")
    public void deleteCtrLocalTrip(CtrTripSrcVo param) throws Exception {
    	ctrLocalTripService.deleteCtrLocalTrip(param);
    }
    
    /**
     * 근거리출장정보를 조회 한다
     * @param CtrLocalTripInfoVO 
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRLTBR01")
    @RequestMapping(value="SvcCCSCTRLTBR01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="근거리출장정보 조회",desc="근거리출장정보를 조회 한다")
    public CtrLocalTripVO selectCtrLocalTrip(CtrTripSrcVo param) throws Exception {
    	return ctrLocalTripService.selectCtrLocalTrip(param);
    }
    
    /**
     * 최근계정을 조회 한다
     * @param Object
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRLPRR01")
    @RequestMapping(value="SvcCCSCTRLPRR01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="최근계정 조회",desc="최근계정 조회")
    public List<Object> selectRecntAccnt(Object param) throws Exception {
    	return ctrLocalTripService.selectRecntAccnt(param);
    }
    
    /**
     * 출장일수를 조회 한다
     * @param Object
     * @throws Exception
     */
    @ElService(key="SvcCCSCTRLPTR01")
    @RequestMapping(value="SvcCCSCTRLPTR01")
    @ElValidator(errUrl="", errContinue=true)
    @ElDescription(sub="출장일수 조회",desc="출장일수 조회")
    public List<CtrTripCurStnVo> selectTripPsnCount(CtrTripCurStnVo param) throws Exception {
    	return ctrLocalTripService.selectTripPsnCount(param);
    }
    
    @ElService(key = "SvcCCSCTRLCTR01")
	@RequestMapping(value = "SvcCCSCTRLCTR01")
	@ElDescription(sub = "근거리출장 회계코드 조회", desc = "근거리출장 회계코드를 조회한다.")
	@ElValidator(errUrl = "")
	public CheckSrcVo selectLocalTripAccntCd(CheckSrcVo vo) throws Exception{
    	return ctrLocalTripService.getLocalTripAccntCd(vo);
    }
}