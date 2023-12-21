package kr.re.kitech.biz.ccs.ctr.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.ccs.ctr.service.CtrAirMileService;
import kr.re.kitech.biz.ccs.ctr.vo.AirMileSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileInfoVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrAirMileVo;
import kr.re.kitech.biz.ccs.pop.vo.CtrAirMileUseVo;

/**  
 * @ClassSubJect 항공마일리지
 * @Class Name CtrAirMileController.java
 * @Description 항공마일리지 컨트롤러
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/02/14     이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/02/14
 * @version 1.0
 * @see
 * 
 */
@Controller
public class CtrAirMileController {
	@Resource(name="ctrAirMileService")
	private CtrAirMileService airMileService;
	
	@ElService(key = "SvcCCSCTRAIRR01")
	@RequestMapping(value = "SvcCCSCTRAIRR01")
	@ElDescription(sub = "항공마일리지신청서(신고서)조회", desc = "항공마일리지신청서(신고서)작성 팝업에서 사용내역,개인별마일리현황을 조회한다.")
	@ElValidator(errUrl = "")
	public CtrAirMileInfoVo selectCtrAirMileUseList(AirMileSrcVo vo) throws Exception{
		return airMileService.selectCtrAirMileUseList(vo);
	}
	
	@ElService(key = "SvcCCSCTRAIRR02")
	@RequestMapping(value = "SvcCCSCTRAIRR02")
	@ElDescription(sub = "개인별 사용가능마일리지 조회", desc = "개인별 사용가능마일리지를 조회한다.(항공마일리지 신청(신고)서 팝업)")
	@ElValidator(errUrl = "")
	public List<CtrAirMileVo> selectCtrAirMileList(AirMileSrcVo vo) throws Exception{
		return airMileService.selectCtrAirMileList(vo);
	}
	
	@ElService(key = "SvcCCSCTRAIRM01")
	@RequestMapping(value = "SvcCCSCTRAIRM01")
	@ElDescription(sub = "항공마일리지 신청(고)서 저장", desc = "항공마일리지 신청(고)서 내역을 저장한다.(국내출장에서 팝업호출)")
	@ElValidator(errUrl = "")
	public AirMileSrcVo saveCtrAirMileReqAndRep(CtrAirMileUseVo vo) throws Exception{
		AirMileSrcVo srcVo = new AirMileSrcVo();
		srcVo.setReq_no(airMileService.saveCtrAirMileReqAndRep(vo));
		return srcVo;
	}
}
