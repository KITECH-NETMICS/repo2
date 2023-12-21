package kr.re.kitech.biz.fin.std.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.fin.std.service.FbaApartAccntReqService;
import kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqListVo;
import kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo;
import kr.re.kitech.biz.fin.std.vo.FinPartAccntListVo;
import kr.re.kitech.biz.fin.std.vo.FinPartAccntVo;


/**  
 * @ClassSubJect 별도계좌 신청 서비스
 * @Class Name FbaApartAccntReqController.java
 * @Description 별도계좌 신청 관련 처리를 담당하는 Controller
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/28   김준하             최초생성
 * 
 * @author 김준하
 * @since 2023/07/24
 * @version 1
 * @see
 * 
 */
@Controller
public class FbaApartAccntReqController {

  @Resource(name = "fbaApartAccntReqServiceImpl")
  private FbaApartAccntReqService stdService;
  
  
  @ElService(key="SvcFINSTDFBAMR01")
  @RequestMapping(value="SvcFINSTDFBAMR01")
  @ElDescription(sub="selectListItem",desc="별도 계좌 신청 목록 조회")
  public FbaApartAccntReqListVo selectListItem(FbaApartAccntReqVo stdVo) throws Exception {
      List<FbaApartAccntReqVo> list = stdService.selectListItem(stdVo);  	 
      FbaApartAccntReqListVo List = new FbaApartAccntReqListVo();
      List.setFbaApartAccntReqVoList(list);
      return List;
  }

  @ElService(key="SvcFINSTDFBASR01")
  @RequestMapping(value="SvcFINSTDFBASR01")
  @ElDescription(sub="selectSingleItem",desc="별도 계좌 신청계좌 정보 단건 조회")
  public FbaApartAccntReqListVo selectSingleItem(FbaApartAccntReqVo stdVo) throws Exception {
      FbaApartAccntReqVo vo = stdService.selectSingleItem(stdVo); 
      FbaApartAccntReqListVo List = new FbaApartAccntReqListVo();
      List.setFbaApartAccntReqVo(vo);
      return List;
  }
  
  @ElService(key="SvcFINSTDFBASC01")
  @RequestMapping(value="SvcFINSTDFBASC01")
  @ElDescription(sub="rejectItem",desc="별도 계좌 반려")
  public FbaApartAccntReqVo rejectItem(FbaApartAccntReqVo stdVo) throws Exception {
      FbaApartAccntReqVo result = stdService.rejectItem(stdVo);
      return result;
  }
  @ElService(key="SvcFINSTDFBASA01")
  @RequestMapping(value="SvcFINSTDFBASA01")
  @ElDescription(sub="approvalItem",desc="별도 계좌 승인")
  public FbaApartAccntReqVo approvalItem(FbaApartAccntReqVo stdVo) throws Exception {
      FbaApartAccntReqVo result = stdService.approvalItem(stdVo);
      return result;
  }  


  @ElService(key="SvcFINSTDFBASI01")
  @RequestMapping(value="SvcFINSTDFBASI01")
  @ElDescription(sub="mergeItem",desc="별도 계좌 신청")
  public FbaApartAccntReqVo mergeItem(FbaApartAccntReqVo stdVo) throws Exception {
      FbaApartAccntReqVo result = stdService.mergeItem(stdVo);
      return result;
  }

  @ElService(key="SvcFINSTDFBASD01")
  @RequestMapping(value="SvcFINSTDFBASD01")
  @ElDescription(sub="deleteItem",desc="별도 계좌 삭제")
  public void deleteItem(FbaApartAccntReqVo stdVo) throws Exception {
      stdService.deleteItem(stdVo);
  }

  @ElService(key="SvcFINSTDFBAR02")
  @RequestMapping(value="SvcFINSTDFBAR02")
  @ElDescription(sub="selectListItem",desc="별도 계좌 목록 조회")
  public FbaApartAccntReqListVo selectListItem2(FbaApartAccntReqVo stdVo) throws Exception {
      List<FbaApartAccntReqVo> list = stdService.selectListItem2(stdVo);  	 
      FbaApartAccntReqListVo List = new FbaApartAccntReqListVo();
      List.setFbaApartAccntReqVoList(list);
      return List;
  }

  @ElService(key="SvcFINSTDFBAR03")
  @RequestMapping(value="SvcFINSTDFBAR03")
  @ElDescription(sub="selectSingleItem",desc="별도 계좌 폼 조회")
  public FbaApartAccntReqVo selectSingleItem2(FbaApartAccntReqVo stdVo) throws Exception {
      return stdService.selectSingleItem2(stdVo);
  }

  @ElService(key="SvcFINSTDFBAR04")
  @RequestMapping(value="SvcFINSTDFBAR04")
  @ElDescription(sub="selectSingleItem",desc="별도 계좌 Cnt 조회")
  public FbaApartAccntReqListVo selectSingleItem3(FbaApartAccntReqVo stdVo) throws Exception {
      FbaApartAccntReqVo vo = stdService.selectSingleItem3(stdVo); 
      FbaApartAccntReqListVo List = new FbaApartAccntReqListVo();
      List.setFbaApartAccntReqVo(vo);
      return List;
  }

  @ElService(key="SvcFINSTDFBAI02")
  @RequestMapping(value="SvcFINSTDFBAI02")
  @ElDescription(sub="mergeItem",desc="별도계좌 등록,수정,삭제")
  public FbaApartAccntReqListVo mergeItem2(FbaApartAccntReqVo stdVo) throws Exception {
      FbaApartAccntReqVo vo = stdService.mergeItem2(stdVo); 
      FbaApartAccntReqListVo List = new FbaApartAccntReqListVo();
      List.setFbaApartAccntReqVo(vo);
      return List;
  }

  @ElService(key="SvcFINSTDFINR01")
  @RequestMapping(value="SvcFINSTDFINR01")
  @ElDescription(sub="selectListItem",desc="별도계좌집행 조회")
  public FinPartAccntListVo selectList01(FinPartAccntVo stdVo) throws Exception {
      List<FinPartAccntVo> list = stdService.selectList01(stdVo);    	 
      FinPartAccntListVo List = new FinPartAccntListVo();
      List.setFinPartAccntVoList(list);
      return List;
  }           
  
}
