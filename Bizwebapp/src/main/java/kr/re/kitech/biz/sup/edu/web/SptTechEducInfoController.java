package kr.re.kitech.biz.sup.edu.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.sup.edu.service.SptTechEducInfoService;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoDetailVo;
import kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;

/**  
 * @ClassSubJect 기술세미나실적등록/교육실적등록 Controller
 * @Class Name SptTechEducInfoController.java
 * @Description 기술세미나실적등록/교육실적등록 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/04   손태화             최초생성
 * 
 * @author 손태화
 * @since 2023/08/04
 * @version 1
 * @see
 * 
 */
@Controller
public class SptTechEducInfoController {

  @Resource(name = "sptTechEducInfoServiceImpl")
  private SptTechEducInfoService eduService;

  /**
   * 기술세미나실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 개최시작일자 , 개최종료일자 , 실적부서 , 세미나명 , 등록자 , 참여기업 , 신청상태 , 교육/세미나 구분 , find_clsf 
   * @return List<SptTechEducInfoVo> 기술세미나실적 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPEDUSPTMR01")
  @RequestMapping(value="SvcSUPEDUSPTMR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="세미나목록 조회",desc="세미나목록을 조회한다.")
  public List<SptTechEducInfoVo> selectSmnrList(SptTechEducInfoVo vo) throws KitechException {
	  return eduService.selectSmnrList(vo);
  }

  /**
   * 기술세미나실적/교육실적 상세 조회
   * @author 손태화
   * @param SptTechEducInfoVo 상세조회 : 신청번호 , 관리번호 , 교육/세미나 구분
   * @return SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPEDUSPTSR01")
  @RequestMapping(value="SvcSUPEDUSPTSR01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="세미나상세 조회",desc="세미나상세를 조회한다.")
  public SptTechEducInfoDetailVo selectDetail(SptTechEducInfoVo vo) throws KitechException {
      return eduService.selectDetail(vo);
  }

  /**
   * 기술세미나실적/교육실적 등록(수정)
   * @author 손태화
   * @param SptTechEducInfoDetailVo 세미나/교육 상세 , 참여자 목록 , 주요프로그램 목록 , 소요예산 목록 , 기여자 목록
   * @return SptTechEducInfoVo 신청번호 , 관리번호
   * @throws Exception 예외
   */
  @ElService(key="SvcSUPEDUSPTSI01")
  @RequestMapping(value="SvcSUPEDUSPTSI01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="세미나상세 등록",desc="세미나상세 아이템을 등록한다.")
  public SptTechEducInfoVo saveDetail(SptTechEducInfoDetailVo vo) throws Exception {
      return eduService.saveDetail(vo);
  }

  /**
   * 기술세미나실적/교육실적 삭제
   * @author 손태화
   * @param SptTechEducInfoDetailVo 관리번호 , 교육/세미나 구분
   * @return  
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPEDUSPTSD01")
  @RequestMapping(value="SvcSUPEDUSPTSD01")
  @DataCollection(ref="", target="")
  @ElDescription(sub="세미나상세 삭제",desc="세미나상세 아이템을 삭제한다.")
  public void deleteDetail(SptTechEducInfoDetailVo vo) throws KitechException {
      eduService.deleteDetail(vo);
  }

  /**
   * 교육실적 목록
   * @author 손태화
   * @param SptTechEducInfoVo 검색 : 지역본부 , 책임자 , 교육시작일자 , 교육종료일자 , 교육과정 , 등록자 , 실적부서 , 신청상태 , 교육/세미나 구분  
   * @return List<SptTechEducInfoVo> 교육실적 목록
   * @throws KitechException 공통예외
   */
  @ElService(key="SvcSUPEDUSPTMR02")
  @RequestMapping(value="SvcSUPEDUSPTMR02")
  @DataCollection(ref="", target="")
  @ElDescription(sub="교육실적목록 조회",desc="교육실적목록을 조회한다.")
  public List<SptTechEducInfoVo> selectEducList(SptTechEducInfoVo vo) throws KitechException {
	  return eduService.selectEducList(vo);
  }

}
