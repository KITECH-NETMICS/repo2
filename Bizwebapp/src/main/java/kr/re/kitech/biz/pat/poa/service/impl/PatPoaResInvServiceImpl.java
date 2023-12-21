package kr.re.kitech.biz.pat.poa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.poa.dao.PatPoaResInvDAO;
import kr.re.kitech.biz.pat.poa.service.PatPoaResInvService;
import kr.re.kitech.biz.pat.poa.vo.PatPoaResInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPoaResInvServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.22.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.22.
 * @version 1.0
 * @see
 * 
 */
@Service("patPoaResInvServiceImpl")
public class PatPoaResInvServiceImpl  extends EgovAbstractServiceImpl implements PatPoaResInvService {
  @Resource(name="patPoaResInvDAO")
  private PatPoaResInvDAO poaDAO;

  @Resource(name = "patComWFService")
  private PatComWFService patComService;
    
  /**
   * 대응안 보안요청 결과 횟수 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return List<PatPoaResInvVo>
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
  public List<PatPoaResInvVo> selectList01(PatPoaResInvVo vo) throws KitechException {
    List<PatPoaResInvVo> list = poaDAO.selectList01(vo);	
    return list;
  }

  /**
   * OA 대응안 보안요청 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
  public PatPoaResInvVo selectItem01(PatPoaResInvVo vo) throws KitechException {
    PatPoaResInvVo resultVO = poaDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * OA 상세조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
  public PatPoaResInvVo selectItem02(PatPoaResInvVo vo) throws KitechException {
    PatPoaResInvVo resultVO = poaDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * OA대응안 보완요청 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
  public PatPoaResInvVo selectItem03(PatPoaResInvVo vo) throws KitechException {
    PatPoaResInvVo resultVO = poaDAO.selectItem03(vo);			
      return resultVO;
  }

  /**
   * 심사청구 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return PatPoaResInvVo
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
  public PatPoaResInvVo selectItem04(PatPoaResInvVo vo) throws KitechException {
    PatPoaResInvVo resultVO = poaDAO.selectItem04(vo);			
      return resultVO;
  }

  /**
   * OA 대응안 검토 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
 * @throws Exception 
   * @since 2023.09.22.   
   */
  @Override
	public int updatePoaResInv(PatPoaResInvVo vo) throws Exception {
    int result = 0;

    String update011d = "updatePatPoaResInvSU01"; // OA 대응 검토 결과 등록
    String update02Id = "updatePatMastrSU01"; // 특허마스터 상태변경

    //심사청구 평가 등록
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update011d, vo);

    //특허 마스터 상태변경
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update02Id, vo);

    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());

    patComService.executePatComWFBiz(param);

    return result;
	}

  /**
   * OA 첨부파일 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
	public int insertPoaAttach(PatPoaResInvVo vo) throws KitechException {
    int result = 0;

    String update011d = "updatePatPoaAttachSU01"; // OA 대응 검토 결과 등록
    String update02Id = "updatePatPoaAttachSU02"; // 특허마스터 상태변경
    
    // oa 첨부파일 1
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update011d, vo);
    
    // oa 첨부파일 2
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update02Id, vo);

    return result;
  }

  /**
   * OA 대응안 보완요청 결과 검토 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
	public int updatePoaRecInv(PatPoaResInvVo vo) throws Exception {
    int result = 0;

    String update01Id = "updatePatPoaRecInvSU01"; // OA 대응안 보완요청 결과 등록
    String update02Id = "updatePatMastrSU01"; // 특허마스터 상태변경
    String update03Id = "updatePatPoaReeInvSU02"; // OA 마스터 상태변경
    
    //심사청구 평가 등록
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update01Id, vo);
    
    //OA 마스터 상태변경
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update03Id, vo);
    
    //특허 마스터 상태변경
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update02Id, vo);
    
    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());
    
    patComService.executePatComWFBiz(param);

    return result;
  }

  /**
   * OA 대응안 검토 등록
   * 
   * @author Chris
   * @param PatPoaResInvVo
   * @return int
   * @throws KitechException
   * @since 2023.09.22.   
   */
  @Override
	public int updatePoaReeInv(PatPoaResInvVo vo) throws Exception {
    int result = 0;

    String update011d = "updatePatPoaReeInvSU01"; // OA 대응안 검토 결과 등록
    String update02Id = "updatePatMastrSU01"; // 특허마스터 상태변경
    String update03Id = "updatePatPoaReeInvSU02"; // OA 마스터 상태변경
    String insert021d = "insertPatPoaHistorySI01"; // OA 대응 이력 등록
    
    String state = vo.getState();
    
    //심사청구 평가 등록
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update011d, vo);
    
    //OA 마스터 상태변경
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update03Id, vo);
    
    //특허 마스터 상태변경
    result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + update02Id, vo);
    
    result = poaDAO.executeDynamicInsert("kr.re.kitech.biz.pat.poa." + insert021d, vo);
    
    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());
    
    if ("P9000".equals(state)) {
    
        vo.setReq_no(vo.getRef_key());
        // interface delete
        String deleteInt = "deleteXomxIntfatabSD01";
        result = poaDAO.executeDynamicDelete("kr.re.kitech.biz.pat.poa." + deleteInt, vo);
        
        // bpm isdeleted 1
        String bpmIsdeleted = "updatePatBpmSU01";
        result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + bpmIsdeleted, vo);
    
        // todo all Y
        String todoAll = "updatePatPtsTodoSU01";
        result = poaDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.poa." + todoAll, vo);
    
    } else {
    
        patComService.executePatComWFBiz(param);
    
    }

    return result;
  }

}
