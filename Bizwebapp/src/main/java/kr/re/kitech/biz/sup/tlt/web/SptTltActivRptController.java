package kr.re.kitech.biz.sup.tlt.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.sup.tlt.service.SptTltActivRptService;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptDetailVo;
import kr.re.kitech.biz.sup.tlt.vo.SptTltActivRptVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**  
 * @ClassSubJect 활동보고서 Controller
 * @Class Name SptTltActivRptController.java
 * @Description 활동보고서 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/14   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/14
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTltActivRptController {

  @Resource(name = "sptTltActivRptServiceImpl")
  private SptTltActivRptService tltService;

  /**
   * 활동보고서 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자 , 검색년월 , 작성여부
   * @return List<SptTltActivRptVo> 활동보고서 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTRPTMR01")
  @RequestMapping(value="SvcSUPTLTRPTMR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="활동보고서 목록 조회",desc="활동보고서 목록을 조회한다.")
  public List<SptTltActivRptVo> selectSptTltActivRptList(SptTltActivRptVo vo) throws KitechException {
      return tltService.selectSptTltActivRptList(vo);
  }
  
  /**
   * 기업 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 사용자(작성자)
   * @return SptTltActivRptDetailVo 기업 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTRPTMS01")
  @RequestMapping(value="SvcSUPTLTRPTMS01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="기업목록 조회",desc="기업목록을 조회한다.")
  public SptTltActivRptDetailVo selectSptDisPatchPrcondList(SptTltActivRptVo vo) throws KitechException {
      return tltService.selectSptDisPatchPrcondList(vo);
  }

  /**
   * 기술지원직정보 목록
   * @author 손태화
   * @param SptTltActivRptVo 검색 : 참여기업
   * @return SptTltActivRptVo 기술지원직정보 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTHUMSR01")
  @RequestMapping(value="SvcSUPTLTHUMSR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="기술지원직정보 조회",desc="기술지원직정보 조회한다.")
  public SptTltActivRptVo selectSkilHumBasIcInfo(SptTltActivRptVo vo) throws KitechException {
	  return tltService.selectSkilHumBasIcInfo(vo);
  }

  /**
   * 활동보고서 상세 조회
   * @author 손태화
   * @param SptTltActivRptVo 상세조회 : 보고서번호
   * @return SptTltActivRptDetailVo 활동보고서정보 , 당월실적 , 익월목표
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTRPTSR01")
  @RequestMapping(value="SvcSUPTLTRPTSR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="활동보고서 상세 조회",desc="활동보고서 상세를 조회한다.")
  public SptTltActivRptDetailVo selectSptTltActivRptDetail(SptTltActivRptVo vo) throws KitechException {
      return tltService.selectSptTltActivRptDetail(vo);
  }
  
  /**
   * 활동보고서 등록(수정)
   * @author 손태화
   * @param SptTltActivRptDetailVo 활동보고서정보 , 당월실적 , 익월목표
   * @return SptTltActivRptVo 신청번호
   * @throws Exception 예외
   */
  @ElService(key="SvcSUPTLTRPTSI01")
  @RequestMapping(value="SvcSUPTLTRPTSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="활동보고서 상세 등록",desc="활동보고서 상세를 등록한다.")
  public SptTltActivRptVo mergeSptTltActivRpt(SptTltActivRptDetailVo vo) throws Exception {
      return tltService.mergeSptTltActivRpt(vo);
  }

  /**
   * 활동보고서 삭제
   * @author 손태화
   * @param SptTltActivRptVo 관리번호
   * @return  
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTRPTSD01")
  @RequestMapping(value="SvcSUPTLTRPTSD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="활동보고서 상세 삭제",desc="활동보고서 상세를 삭제한다.")
  public void deleteSptTltActivRpt(SptTltActivRptVo vo) throws KitechException {
      tltService.deleteSptTltActivRpt(vo);
  }

  /**
   * 부서 목록
   * @author 손태화
   * @param 
   * @return SptTltActivRptDetailVo 부서 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTXODMS01")
  @RequestMapping(value="SvcSUPTLTXODMS01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="부서목록 조회",desc="부서목록을 조회한다.")
  public SptTltActivRptDetailVo selectSptTltXodhDeptList(SptTltActivRptVo vo) throws KitechException {
      return tltService.selectSptTltXodhDeptList(vo);
  }
  
  /**
   * 대상인원
   * @author 손태화
   * @param SptTltActivRptDetailVo 기업 목록
   * @return SptTltActivRptDetailVo 기업 대상인원 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPTLTSENDSR01")
  @RequestMapping(value="SvcSUPTLTSENDSR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="대상인원 조회",desc="대상인원을 조회한다.")
  public SptTltActivRptDetailVo selectSptTltSendList(SptTltActivRptDetailVo vo) throws KitechException {
      return tltService.selectSptTltSendList(vo);
  }
  
}

