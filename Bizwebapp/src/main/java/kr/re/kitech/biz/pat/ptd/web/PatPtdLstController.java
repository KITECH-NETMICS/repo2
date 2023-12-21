package kr.re.kitech.biz.pat.ptd.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inswave.elfw.annotation.ElDescription;
import com.inswave.elfw.annotation.ElService;

import kr.re.kitech.biz.pat.ptd.service.PatPtdLstService;
import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstListVo;
import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.annotation.DataCollection;


/**
 * @ClassSubJect : 출원업무대기함
 * @ClassName : PatPtdLstController.java
 * @Description : 출원업무대기함 클래스
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      이대훈    최초생성
 * 
 * @author 이대훈
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
@Controller
public class PatPtdLstController {

  @Resource(name = "patPtdLstServiceImpl")
  private PatPtdLstService ptdService;

  @ElService(key="SvcPATPTDPATMR01")
  @RequestMapping(value="SvcPATPTDPATMR01")
  @DataCollection(ref="data:json,dma_search", target="data:json,{'id':'dlt_list','key':'patPtdLstVoList'}")
  @ElDescription(sub="출원업무대기함 업무공통탭 조회",desc="출원업무대기함 업무공통탭 조회")
  public PatPtdLstListVo selectList01(PatPtdLstVo ptdVo) throws KitechException {
      List<PatPtdLstVo> list = ptdService.selectList01(ptdVo);    	 
      PatPtdLstListVo List = new PatPtdLstListVo();
      List.setPatPtdLstVoList(list);
      return List;
  }

  @ElService(key="SvcPATPTDPATSI01")
  @RequestMapping(value="SvcPATPTDPATSI01")
  @DataCollection(ref="data:json,[{'id':'dma_send_bpm','key':'patPtdLstVo'}", target="")
  @ElDescription(sub="출원업무 BPM 처리",desc="출원업무 BPM 처리")
  public void bpmProcess(PatPtdLstListVo vo) throws Exception {
      ptdService.bpmProcess(vo);
  }
 
}
