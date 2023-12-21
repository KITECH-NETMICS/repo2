package kr.re.kitech.biz.pat.ptr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.ptr.dao.PatPtrRevInvDAO;
import kr.re.kitech.biz.pat.ptr.service.PatPtrRevInvService;
import kr.re.kitech.biz.pat.ptr.vo.PatPtrRevInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPtrRevInvServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Service("patPtrRevInvServiceImpl")
public class PatPtrRevInvServiceImpl extends EgovAbstractServiceImpl implements PatPtrRevInvService {
  @Resource(name="patPtrRevInvDAO")
  private PatPtrRevInvDAO ptrDAO;
  
  @Resource(name = "patComWFService")
  private PatComWFService patComService;

  @Resource(name = "generationServiceImpl")
	private GenerationService genService;
    
  /**
   * 발명신고서 서지사항 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  @Override
  public PatPtrRevInvVo selectItem01(PatPtrRevInvVo vo) throws KitechException {
    PatPtrRevInvVo resultVO = ptrDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * 선행기술조사서 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.07.   
   */
  @Override
  public PatPtrRevInvVo selectItem02(PatPtrRevInvVo vo) throws KitechException {
    PatPtrRevInvVo resultVO = ptrDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * 선행기술조사 보완요청 보완요청결과 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public PatPtrRevInvVo selectItem03(PatPtrRevInvVo vo) throws KitechException {
    PatPtrRevInvVo resultVO = ptrDAO.selectItem03(vo);			
      return resultVO;
  }

  /**
   * 선행기술조사 의뢰 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public PatPtrRevInvVo selectItem04(PatPtrRevInvVo vo) throws KitechException {
    PatPtrRevInvVo resultVO = ptrDAO.selectItem04(vo);			
      return resultVO;
  }

  /**
   * 선행기술조사서 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public PatPtrRevInvVo selectItem05(PatPtrRevInvVo vo) throws KitechException {
    PatPtrRevInvVo resultVO = ptrDAO.selectItem05(vo);			
      return resultVO;
  }

  /**
   * 선행기술조사서 의뢰내용 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return PatPtrRevInvVo
   * @throws KitechException
   * @since 2023.09.08.   
   */
  @Override
  public PatPtrRevInvVo selectItem06(PatPtrRevInvVo vo) throws KitechException {
    PatPtrRevInvVo resultVO = ptrDAO.selectItem06(vo);			
      return resultVO;
  }

  /**
   * 보완요청 select box 조회
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return List<PatPtrRevInvVo>
   * @throws KitechException
   * @since 2023.09.11.   
   */
  @Override
  public List<PatPtrRevInvVo> selectList01(PatPtrRevInvVo vo) throws KitechException {
    List<PatPtrRevInvVo> list = ptrDAO.selectList01(vo);	
    return list;
  }

  /**
   * 지식재산권 첨부파일 수정
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.11.   
   */
  @Override
	public int updateAttachmentFilesBySrhId(PatPtrRevInvVo vo) throws KitechException {
    int result = ptrDAO.updateAttachmentFilesBySrhId(vo);
    return result;
	}

  /**
   * 선행기술조사서 의뢰
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws Exception 
   * @since 2023.09.07.   
   */
  @Override
  public int insertPtrReqInv(PatPtrRevInvVo vo) throws Exception {
    int result = 0;
    String srh_id = ""; // 선행기술조사 의뢰번호
    String ref_key = ""; // 업무키
    ref_key = vo.getRef_key();

    if (ref_key == null || ref_key.equals("")) {

        String prefix = vo.getDocu_clsf();
        srh_id = genService.getGenNumber(Numberings.DOCUMENT.getName(), prefix);
        vo.setSrh_id(srh_id);

        // 선행기술조사 의뢰 등록
        result = ptrDAO.insertPatPtrReqSI01(vo);

    } else {
        vo.setSrh_id(ref_key);

        // 선행기술조사 의뢰 등록
        result = ptrDAO.updatePatPtrReqSI02(vo);
    }
    // 특허 마스터 상태변경
    result = ptrDAO.updatePatPtrReqMasterSU01(vo);

    // 선행기술조사 의뢰 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd()); // 결재완료
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getSrh_id());

    patComService.executePatComWFBiz(param);


    return result;
    
  }

  /**
   * 선행기술조사서 검토 결과 등록
   * 
   * @author 
   * @param PatPtrRevInvVo
   * @return int
   * @throws Exception 
   * @since 2023.09.07.   
   */
  @Override
  public int insertPtrRevInv(PatPtrRevInvVo vo) throws Exception {

    /*****************************************
     * 01.설정부 시작
     *****************************************/
    int result = 0;

    String update01Id = "updatePatPtrRevInvSU01"; // 선행기술조사 평가 완료
    String update02Id = "updatePatPtrRevInvSU02"; // 선행기술조사 보완 요청
    String update03Id = "updatePatPtrMasterSU01"; // 특허마스터 상태변경
    String update06Id = "updatePatPtrMasterSU02"; // 특허 마스터 상태변경(결과등록)
    String update07Id = "updatePatPtrMasterSU03"; // 특허 마스터 상태변경(결과등록, PCT건)
    String update04Id = "updatePatPtrSrhSU01"; // 선행기술조사 마스터 변경
    String update05Id = "updatePatPtrSrhFSU01"; // 선행기술조사 마스터 변경
    String select01Id = "selectPatPtrMasterSS01"; // 특허마스터 상태조회(PCT건 유무)

    /*******************************************************************
     * 02. 실행 시작
     ******************************************************************/

    String evalClsf = vo.getEval_clsf();

    if (evalClsf.equals("0")) { // 선행기술조사 평가등록
        
        result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update01Id, vo);
        result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update05Id, vo);

        PatPtrRevInvVo retVo01 = ptrDAO.executeDynamicSelectQuery("kr.re.kitech.biz.pat.ptr." + select01Id, vo);

        if(retVo01 != null){

            String SmitappNatnCd = retVo01.getSmitapp_natn_cd();
            if (SmitappNatnCd != null) SmitappNatnCd = SmitappNatnCd.trim();

            if (SmitappNatnCd.equals("PC")) {
                // 특허 마스터 상태 변경
                result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update07Id, vo);

            } else {
                // 특허 마스터 상태 변경
                result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update06Id, vo);            
            }

        }        
    } else { // 선행기술조사 보완 요청
        result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update02Id, vo);

        result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update04Id, vo);
        // 특허 마스터 상태변경
        result = ptrDAO.executeDynamicUpdateQuery("kr.re.kitech.biz.pat.ptr." + update03Id, vo);
    }

    // 선행기술조사 의뢰 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd()); // 결재완료
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());

    patComService.executePatComWFBiz(param);

    return result;
    
  }

}
