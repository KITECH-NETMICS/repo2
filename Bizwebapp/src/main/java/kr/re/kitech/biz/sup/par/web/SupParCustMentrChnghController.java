package kr.re.kitech.biz.sup.par.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;
import com.inswave.elfw.annotation.ElValidator;

import kr.re.kitech.biz.sup.par.service.SupParCustMentrChnghService;
import kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghListVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect :  파트너기업 정보변경 신청
 * @ClassName : SupParCustMentrchnghController.java
 * @Description : 파트너기업 정보변경 Controller
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      송선화    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class SupParCustMentrChnghController {

  @Resource(name = "supParCustMentrChnghServiceImpl")
  private SupParCustMentrChnghService supParCustMentrChnghService;
  
  /**
     * 파트너기업 정보변경 신청 목록을 조회합니다.
     * @author 송선화
     * @param 파트너기업 정보변경 신청정보 SupParCustMentrChnghVo
     * @return List<SupParCustMentrChnghVo>
     * @throws Exception
  */     
  @ElService(key="SvcSUPPARSPTMR01")
  @RequestMapping(value="SvcSUPPARSPTMR01")
  @ElDescription(sub="파트너기업 정보변경 신청 목록 조회",desc="파트너기업 정보변경 신청 목록을 조회한다.")
  @ElValidator(errUrl = "")
  public List<SupParCustMentrChnghVo> selectList(SupParCustMentrChnghVo mentVo) throws Exception {
      return supParCustMentrChnghService.selectList(mentVo);   
  }

  /**
   * 파트너기업 정보변경 신청 목록의 소연심의를 저장합니다.
   * @author 송선화
   * @param 파트너기업 정보변경 신청정보 SupParCustMentrChnghVo
   * @return List<sptCustMentrchnghVoList>
   * @throws Exception
*/  
  @ElService(key="SvcSUPPARSPTSI01")
  @RequestMapping(value="SvcSUPPARSPTSI01")
  @ElDescription(sub="파트너기업 정보변경 신청 목록 저장",desc="파트너기업 정보변경 신청 목록 소연심의를 등록한다.")
  public void insertItem(SupParCustMentrChnghListVo mentVo) throws KitechException {
	  supParCustMentrChnghService.insertItem(mentVo);
  }
  
  /**
   * 파트너기업 정보변경 신청 목록 상세 조회
   * @author 송선화
   * @param 파트너기업 정보변경 신청 목록 상세 조회 SupParCustMentrChnghVo
   * @return List<sptCustMentrchnghVoList>
   * @throws Exception
*/  
  @ElService(key="SvcSUPPARSUPR01")
  @RequestMapping(value="SvcSUPPARSUPR01")
  @ElDescription(sub="파트너기업 정보변경 신청 목록 상세조회",desc="파트너기업 정보변경 신청 목록 상세 조회한다.")
  public SupParCustChargChngdVo select(SupParCustMentrChnghVo mentVo) throws KitechException {
	  return supParCustMentrChnghService.select(mentVo);
  }

  /**
   * 파트너기업 정보변경 신청 상세 삭제
   * @author 송선화
   * @param 파트너기업 정보변경 신청 상세 삭제 
   * @throws Exception
*/  
  @ElService(key = "SvcSUPPARSUPD01")
	@RequestMapping(value = "SvcSUPPARSUPD01")
	@ElDescription(sub = "파트너기업 정보변경 신청 상세 삭제", desc = "파트너기업 정보변경 신청 상세 삭제를 삭제한다.")
	@ElValidator(errUrl = "")
	public void deleteSupParPart(SupParCustMentrChnghVo mentVo) throws Exception {
	  supParCustMentrChnghService.deleteSupParPart(mentVo);
	}
  
  /**
   * 파트너기업 정보변경 신청 저장
   * @author 송선화
   * @param 파트너기업 정보변경 신청정보 SupParCustMentrChnghVo
   * @return List<sptCustMentrchnghVoList>
   * @throws Exception
*/  
  @ElService(key="SvcSUPPARSPTSI02")
  @RequestMapping(value="SvcSUPPARSPTSI02")
  @ElDescription(sub="파트너기업 정보변경 신청저장",desc="파트너기업 정보변경 신청을 저장한다.")
  public SupParCustMentrChnghVo saveParInfoAll(SupParCustChargChngdVo mentVo) throws KitechException {
	  return supParCustMentrChnghService.saveParInfoAll(mentVo);
  }
  
   /**
   * 파트너기업 정보변경 신청 - 사업지원 실장 구해오기
   * @author 송선화
   * @param 파트너기업 정보변경 신청 - 사업지원 실장 조회  SupParCustMentrChnghVo
   * @return List<sptCustMentrchnghVoList>
   * @throws Exception
*/  
  @ElService(key="SvcSUPPARSUPR02")
  @RequestMapping(value="SvcSUPPARSUPR02")
  @ElDescription(sub="파트너기업 정보변경 신청 - 사업지원 실장 조회",desc="파트너기업 정보변경 신청 - 사업지원 실장 조회 조회한다.")
  public SupParCustMentrChnghVo selectSupportPsn(SupParCustMentrChnghVo vo) throws KitechException {
	  return supParCustMentrChnghService.selectSupportPsn(vo);
  }
  
}
  