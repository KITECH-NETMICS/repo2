package kr.re.kitech.biz.sup.tlt.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.fin.fnd.vo.FndDepstSrcVo;
import kr.re.kitech.biz.res.exc.vo.FcpDepstReqListVo;
import kr.re.kitech.biz.sup.tlt.service.SptTltDepstInfoService;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSaveVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltDepstSrcVo;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**  
 * @ClassSubJect 기업부담금입금의뢰 Controller
 * @Class Name SptTltDepstInfoController.java
 * @Description 기업부담금입금의뢰 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/22   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/22
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTltDepstInfoController {

	@Resource(name = "sptTltDepstInfoServiceImpl")
	private SptTltDepstInfoService tltService;

@ElService(key="SvcSUPTLTDEPSTMR01")
  @RequestMapping(value="SvcSUPTLTDEPSTMR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="기업부담금입금의뢰 목록 조회",desc="기업부담금입금의뢰목 록을 조회한다.")
  public List<SptTltDepstInfoVo> selectSptTltDepstInfoList(SptTltDepstSrcVo vo) throws Exception {
      return tltService.selectSptTltDepstInfoList(vo);
  }

  @ElService(key = "SvcSUPTLTDEPSTSR01")
  @RequestMapping(value = "SvcSUPTLTDEPSTSR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub = "기업부담금 입금예정관리 조회", desc = "")
@ElValidator(errUrl = "")
  public SptTltDepstSaveVo selectSptTltDepstInfoDetail(SptTltDepstSrcVo vo) throws Exception {
      return tltService.selectSptTltDepstInfoDetail(vo);
  }
  
  @ElService(key = "SvcSPTTLTDEPR01")
@RequestMapping(value = "SvcSPTTLTDEPR01")
@ElDescription(sub = "기업부담금 입금예정관리  - 업체조회", desc = "입금예정관리 신규입력시 업체정보를 조회한다.")
@ElValidator(errUrl = "")
public SptTltDepstInfoVo selectSptCustBaseInfo(SptTltDepstSrcVo vo) throws Exception{
	  return tltService.selectSptCustBaseInfo(vo.getCust_no());
  }  

  @ElService(key = "SvcSPTTLTDEPR02")
@RequestMapping(value = "SvcSPTTLTDEPR02")
@ElDescription(sub = "기술지원연구직 콤보조회", desc = "")
@ElValidator(errUrl = "")
  public List<SptTltDepstItemVo> selectSptDisPatchPrCond(SptTltDepstSrcVo vo) throws Exception{
	  return tltService.selectSptDisPatchPrCond(vo.getMngmt_no());
  }

  @ElService(key = "SvcSPTTLTDEPM01")
@RequestMapping(value = "SvcSPTTLTDEPM01")
@ElDescription(sub = "기업부담금 입금예정관리 저장", desc = "")
@ElValidator(errUrl = "")
public SptTltDepstSrcVo saveSptTltDepstInfo(SptTltDepstSaveVo vo) throws Exception{
	  SptTltDepstSrcVo retVo = new SptTltDepstSrcVo();
	  retVo.setDepst_mngmt_no(tltService.saveSptTltDepstInfo(vo));
	  
	  return retVo;
  }
  
  @ElService(key = "SvcSPTTLTDEPD01")
@RequestMapping(value = "SvcSPTTLTDEPD01")
@ElDescription(sub = "기업부담금 입금예정관리 삭제", desc = "")
@ElValidator(errUrl = "")
public void deleteSptTltDepstInfo(SptTltDepstSrcVo vo) throws Exception{
	  tltService.deleteSptTltDepstInfo(vo);
  }
  
  @ElService(key = "SvcSPTTLTDEPM02")
@RequestMapping(value = "SvcSPTTLTDEPM02")
@ElDescription(sub = "기업부담금 입금의뢰 저장", desc = "")
@ElValidator(errUrl = "")
public FndDepstSrcVo saveSptTltDepstReq(FcpDepstReqListVo vo) throws Exception{
	  FndDepstSrcVo retVo = new FndDepstSrcVo();
	  retVo.setReq_no(tltService.saveSptTltDepstReq(vo.getDepstList()));
	  
	  return retVo;
  } 
  
  @ElService(key = "SvcSPTTLTDEPD02")
@RequestMapping(value = "SvcSPTTLTDEPD02")
@ElDescription(sub = "기업부담금 입금의뢰 삭제", desc = "")
@ElValidator(errUrl = "")
public void deleteSptTltDepstReq(FcpDepstReqListVo vo) throws Exception{
	  tltService.deleteSptTltDepstReq(vo.getDepstList());
  }
  
  @ElService(key = "SvcSPTTLTDEPM03")
@RequestMapping(value = "SvcSPTTLTDEPM03")
@ElDescription(sub = "기업부담금 입금의뢰 결재신청", desc = "")
@ElValidator(errUrl = "")
public void approvalSptTltDepstReq(SptTltDepstInfoVo vo) throws Exception{
	  tltService.approvalSptTltDepstReq(vo);
  }
}