package kr.re.kitech.biz.pat.ptd.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.com.service.PatComService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.ptd.dao.PatPtdLstDAO;
import kr.re.kitech.biz.pat.ptd.service.PatPtdLstService;
import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstListVo;
import kr.re.kitech.biz.pat.ptd.vo.PatPtdLstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect : 클래스 제목
 * @ClassName : PatPtdLstServiceImpl.java
 * @Description : 클래스 설명
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      작업자    최초생성
 * 
 * @author 작업자
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
@Service("patPtdLstServiceImpl")
public class PatPtdLstServiceImpl  extends EgovAbstractServiceImpl implements PatPtdLstService {
  @Resource(name="patPtdLstDAO")
  private PatPtdLstDAO ptdDAO;

  @Resource(name="generationServiceImpl")
	private GenerationService genService;

  @Resource(name="patComService")
	private PatComService patComService;
  
  /**
   * 출원업무대기함 업무공통탭 조회
   * 
   * @author user
   * @param PatPtdLstVo
   * @return List<PatPtdLstVo>
   * @throws KitechException
   * @since 2023.08.31.   
   */
  @Override
  public List<PatPtdLstVo> selectList01(PatPtdLstVo vo) throws KitechException {
    List<PatPtdLstVo> list = ptdDAO.selectList01(vo);	
    return list;
  }

  /**
   * 출원업무 BPM 처리
   * 
   * @author user
   * @param PatPtdLstListVo
   * @return int
   * @throws Exception 
   * @since 2023.08.31.   
   */
  @Override
	public int bpmProcess(PatPtdLstListVo vo) throws Exception {
    int result = 0;
    // 로직 작성
    PatPtdLstVo doc = vo.getPatPtdLstVo();

    String refKey = "";
    String type = doc.getType();
    String nextStateCd = ""; // 다음 상태

    PatPtdLstVo mstInfo = ptdDAO.selectPatPsrMstInfoSS01(doc); // kitech.pat.psr.xda.PatPsrMstInfoSS01

    // 선행기술조사 사무소 접수 단계 생성
    if (type.equals("A") || type.equals("P0211")) {
        nextStateCd = "P0211";
        refKey = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I11");

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, 1);

        // 특정 형태의 날짜로 값을 뽑기
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        String dueDate = df.format(cal.getTime());

        PatPtdLstVo srhDoc = new PatPtdLstVo();

        srhDoc.setSrh_id(refKey);
        srhDoc.setReq_no(doc.getReq_no());
        srhDoc.setMngmt_no(doc.getMngmt_no());
        srhDoc.setJob_state_cd(nextStateCd);  // 선행기술 조사 의뢰
        srhDoc.setReq_psn_syspayno(mstInfo.getInvnt_syspayno());
        srhDoc.setReq_patofic_cd(mstInfo.getPatofic_cd());
        srhDoc.setHope_patofic_charg_id(mstInfo.getPatofic_charg_id());
        srhDoc.setReq_due_date(dueDate);
        srhDoc.setReq_comment("자동의뢰");
        srhDoc.setRegst_syspayno(mstInfo.getInvnt_syspayno());

        result = ptdDAO.insertPatComMstSrhReqSI01(srhDoc); // kitech.pat.com.xda.PatComMstSrhReqSI01

    } else if (type.equals("B") || type.equals("P0210")) { // 선행기술조사의뢰
        nextStateCd = "P0210";
        refKey = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I11");

        PatPtdLstVo srhDoc = new PatPtdLstVo();

        srhDoc.setSrh_id(refKey);
        srhDoc.setReq_no(doc.getReq_no());
        srhDoc.setMngmt_no(doc.getMngmt_no());
        srhDoc.setJob_state_cd(nextStateCd);  // 선행기술 조사 의뢰
        srhDoc.setReq_psn_syspayno(mstInfo.getInvnt_syspayno());
        srhDoc.setReq_patofic_cd(mstInfo.getPatofic_cd());
        srhDoc.setHope_patofic_charg_id(mstInfo.getPatofic_charg_id());
        srhDoc.setReq_due_date("");
        srhDoc.setReq_comment("");
        srhDoc.setRegst_syspayno(mstInfo.getInvnt_syspayno());

        result = ptdDAO.insertPatComMstSrhReqSI01(srhDoc); // kitech.pat.com.xda.PatComMstSrhReqSI01

    } else if (type.equals("C") || type.equals("P0410")) { // 명세서작성의뢰
        nextStateCd = "P0410";
        refKey = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I13");

        PatPtdLstVo specDoc = new PatPtdLstVo();

        specDoc.setSpec_id(refKey);
        specDoc.setReq_no(doc.getReq_no());
        specDoc.setMngmt_no(doc.getMngmt_no());
        specDoc.setJob_state_cd(nextStateCd);
        specDoc.setReq_psn_syspayno(mstInfo.getInvnt_syspayno());
        specDoc.setRegst_syspayno(mstInfo.getInvnt_syspayno());

        result = ptdDAO.insertPatPseRstSI01(specDoc); // kitech.pat.pse.rst.xda.PatPseRstSI01

    } else if (type.equals("D") || type.equals("P0500")) { // 출원지시의뢰
        nextStateCd = "P0500";
        refKey = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I14");

        PatPtdLstVo appDoc = new PatPtdLstVo();

        appDoc.setApp_id(refKey);
        appDoc.setReq_no(doc.getReq_no());
        appDoc.setMngmt_no(doc.getMngmt_no());
        appDoc.setRegst_syspayno(mstInfo.getInvnt_syspayno());

        result = ptdDAO.insertPatPtsRecSI01(appDoc); // kitech.pat.pts.rec.xda.PatPtsRecSI01

    } else if (type.equals("E") || type.equals("P1210")) { // 우선심사청구 의뢰대기
        nextStateCd = "P1210";
        refKey = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I15");

        PatPtdLstVo demndDoc = new PatPtdLstVo();

        demndDoc.setPrity_demnd_id(refKey);
        demndDoc.setReq_no(doc.getReq_no());
        demndDoc.setMngmt_no(doc.getMngmt_no());
        demndDoc.setJob_state_cd("P1210"); // 우선심사 의뢰대기
        demndDoc.setRegst_syspayno(mstInfo.getInvnt_syspayno());

        result = ptdDAO.insertPatComMstPEInfoSI01(demndDoc); // kitech.pat.com.xda.PatComMstPEInfoSI01

    } else if (type.equals("F") || type.equals("P1111")) { // 심사청구의뢰
        nextStateCd = "P1111";
        refKey = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I15");

        PatPtdLstVo demndDoc = new PatPtdLstVo();
        demndDoc.setPrity_demnd_id(refKey);
        demndDoc.setJob_state_cd("P1111");
        demndDoc.setState("P1111");
        demndDoc.setReq_no(doc.getReq_no());
        demndDoc.setMngmt_no(doc.getMngmt_no());
        demndDoc.setAsk_psn_syspayno(mstInfo.getInvnt_syspayno());
        demndDoc.setReq_patofic_cd(mstInfo.getPatofic_cd());
        demndDoc.setHope_patofic_charg_id(mstInfo.getPatofic_charg_id());
        demndDoc.setRegst_syspayno(mstInfo.getInvnt_syspayno());
        demndDoc.setEval_demnd_ex("Y");
        
        result = ptdDAO.insertPatPapReeSI01(demndDoc); // kitech.pat.pap.ree.xda.PatPapReeSI01
    }

    PatPtdLstVo stateDoc = new PatPtdLstVo();

    stateDoc.setReq_no(doc.getReq_no());
    stateDoc.setMngmt_no(doc.getMngmt_no());
    stateDoc.setState(nextStateCd);

    result = ptdDAO.updatePatComMstStateSU01(stateDoc); // kitech.pat.com.xda.PatComMstStateSU01


    // 선행기술조사 의뢰 단계 프로세스 처리
  
    PatToDoVo todoVo = new PatToDoVo();

    todoVo.setReq_no(doc.getReq_no());
    todoVo.setMngmt_no(doc.getMngmt_no());
    todoVo.setCurr_state_cd("");
    todoVo.setNext_state_cd(nextStateCd);
    todoVo.setSyspayno(mstInfo.getInvnt_syspayno());
    todoVo.setRef_key(refKey);
    todoVo.setInit("Y");

    patComService.executePatComWFBiz(todoVo);

    return result;
	}

}
