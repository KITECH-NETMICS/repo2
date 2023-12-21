package kr.re.kitech.biz.pat.ppo.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.ppo.service.PatPpoMailDtlService;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailDtlVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoMailSaveVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstListVo;
import kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect 
 * @ClassName : PatPpoMailDtlController.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.25.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.25.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPpoMailDtlController {

  @Resource(name = "patPpoMailDtlServiceImpl")
  private PatPpoMailDtlService ppoService;

  @ElService(key="SvcPATPPOMAIR01")
  @RequestMapping(value="SvcPATPPOMAIR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_mail_info','key':'mailInfo'}, {'id':'dlt_receive_list','key':'receiveList'}, {'id':'dlt_reference_list','key':'referenceList'}]")
  @ElDescription(sub="지식재산권 메일 상세 조회",desc="지식재산권 메일 상세 조회")
  public PatPpoMailDtlListVo retrieve(PatPpoMailDtlVo vo) throws KitechException {
      return ppoService.retrieve(vo);
  }

  @ElService(key="SvcPATPPOATTR01")
  @RequestMapping(value="SvcPATPPOATTR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_bibliography','key':'bibliography'}, {'id':'dlt_ref_list','key':'refList'}, {'id':'dlt_kr_ref_list','key':'krRefList'}]")
  @ElDescription(sub="지식재산권 관련첨부파일 조회",desc="지식재산권 관련첨부파일 조회")
  public PatPpoRefFileLstListVo retrieveFileLst(PatPpoRefFileLstVo vo) throws KitechException {
      return ppoService.retrieveFileLst(vo);
  }

  @ElService(key="SvcPATPPOMAIR02")
  @RequestMapping(value="SvcPATPPOMAIR02")
  @DataCollection(ref="data:json,dma_search", target="data:json,[{'id':'dma_mst_info','key':'mstInfo'}, {'id':'dlt_user_list','key':'userList'}]")
  @ElDescription(sub="지식재산권 메일 발송대상 조회",desc="지식재산권 메일 발송대상 조회")
  public PatPpoMailSaveListVo retrieveMailTargetUserLst(PatPpoMailSaveVo vo) throws KitechException {
      return ppoService.retrieveMailTargetUserLst(vo);
  }
  
  @ElService(key="SvcPATPPOMAIM01")
  @RequestMapping(value="SvcPATPPOMAIM01")
  @DataCollection(ref="data:json,[{'id':'dma_mail_info','key':'mailInfo'}, {'id':'dlt_receive_list','key':'receiveList'}, {'id':'dlt_reference_list','key':'referenceList'}]", target="")
  @ElDescription(sub="지식재산권 메일 내용 저장",desc="지식재산권 메일 내용 저장")
  public PatPpoMailSaveVo mailSave(PatPpoMailSaveListVo vo) throws KitechException {
      return ppoService.mailSave(vo);
  }
  
}
  