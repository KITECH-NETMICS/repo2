package kr.re.kitech.biz.sup.par.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.sup.par.service.SptParInfoEvalService;
import kr.re.kitech.biz.sup.par.vo.SptParInfoEvalDetailVo;
import kr.re.kitech.biz.sup.par.vo.SptParInfoEvalVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**  
 * @ClassSubJect 파트너기업유지심사서 Controller
 * @Class Name SptParInfoEvalController.java
 * @Description 파트너기업유지심사서 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/28   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/28
 * @version 1
 * @see
 * 
 */
@Controller
public class SptParInfoEvalController {

  @Resource(name = "sptParInfoEvalServiceImpl")
  private SptParInfoEvalService evalService;

  /**
   * 파트너기업유지심사서 목록
   * @author 손태화
   * @param SptParInfoEvalVo 검색 : 유지심사번호 , 파트너기업지정번호 , 회사명 , 사업자등록번호 , 유지심사시작일 , 유지심사종료일 , 파트너기업지정시작일 , 파트너기업지정정료일 , 작성자 
   * @return List<SptParInfoEvalVo> 파트너기업유지심사서 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPPAREVALMR01")
  @RequestMapping(value="SvcSUPPAREVALMR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="파트너기업유지심사서 목록 조회",desc="파트너기업유지심사서 목록을 조회한다.")
  public List<SptParInfoEvalVo> selectSptParInfoEvalList(SptParInfoEvalVo vo) throws KitechException {
      return evalService.selectSptParInfoEvalList(vo);
  }

  /**
   * 파트너기업유지심사서 상세 조회
   * @author 손태화
   * @param SptParInfoEvalVo 상세조회 : 유지심사서번호
   * @return SptParInfoEvalVo 파트너기업유지심사서 상세
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPPAREVALSV01")
  @RequestMapping(value="SvcSUPPAREVALSV01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="파트너기업유지심사서 상세 조회",desc="파트너기업유지심사서 상세를 조회한다.")
  public SptParInfoEvalVo selectSptParInfoEvalDetail(SptParInfoEvalVo vo) throws KitechException {
      return evalService.selectSptParInfoEvalDetail(vo);
  }

  /**
   * 파트너기업유지심사서 상세 조회2
   * @author 손태화
   * @param SptParInfoEvalVo 상세조회 : 파트너기업지정번호
   * @return SptParInfoEvalDetailVo 파트너기업 정보 , 담당자 목록 , 기업지원프로그램 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPPAREVALSS01")
  @RequestMapping(value="SvcSUPPAREVALSS01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="파트너기업유지심사서 상세2 조회",desc="파트너기업유지심사서 상세2를 조회한다.")
  public SptParInfoEvalDetailVo selectSptParCustProList(SptParInfoEvalVo vo) throws KitechException {
      return evalService.selectSptParCustProList(vo);
  }

  /**
   * 파트너기업유지심사서 등록(수정)
   * @author 손태화
   * @param SptParInfoEvalDetailVo 파트너기업유지심사서 상세 , 담당자 목록
   * @return SptParInfoEvalVo 유지심사서번호
   * @throws Exception 예외
   */
  @ElService(key="SvcSUPPAREVALSI01")
  @RequestMapping(value="SvcSUPPAREVALSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="파트너기업유지심사서 상세 등록",desc="파트너기업유지심사서 상세를 등록한다.")
  public SptParInfoEvalVo saveSptParInfoEvalDetail(SptParInfoEvalDetailVo vo) throws Exception {
      return evalService.saveSptParInfoEvalDetail(vo);
  }

  /**
   * 파트너기업유지심사서 삭제
   * @author 손태화
   * @param SptParInfoEvalVo 유지심사서번호
   * @return  
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPPAREVALSD01")
  @RequestMapping(value="SvcSUPPAREVALSD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="파트너기업유지심사서 상세 삭제",desc="파트너기업유지심사서 상세를 삭제한다.")
  public void deleteSptParInfoEvalDetail(SptParInfoEvalVo vo) throws KitechException {
      evalService.deleteSptParInfoEvalDetail(vo);
  }
  
}


