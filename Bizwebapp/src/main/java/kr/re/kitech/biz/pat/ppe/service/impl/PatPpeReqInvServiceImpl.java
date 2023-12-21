package kr.re.kitech.biz.pat.ppe.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.ppe.dao.PatPpeReqInvDAO;
import kr.re.kitech.biz.pat.ppe.service.PatPpeReqInvService;
import kr.re.kitech.biz.pat.ppe.vo.PatPpeReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPpeReqInvServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Service("patPpeReqInvServiceImpl")
public class PatPpeReqInvServiceImpl  extends EgovAbstractServiceImpl implements PatPpeReqInvService {
  @Resource(name="patPpeReqInvDAO")
  private PatPpeReqInvDAO ppeDAO;

  @Resource(name = "patComWFService")
  private PatComWFService patComService;
    
  /**
   * 우선심사청구 의뢰 조회
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return PatPpeReqInvVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  @Override
  public PatPpeReqInvVo selectItem01(PatPpeReqInvVo vo) throws KitechException {
    PatPpeReqInvVo resultVO = ppeDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * 우선심사청구 결과 조회
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return PatPpeReqInvVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  @Override
  public PatPpeReqInvVo selectItem02(PatPpeReqInvVo vo) throws KitechException {
    PatPpeReqInvVo resultVO = ppeDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * 우선심사청구 평가 등록
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.14.   
   */
  @Override
  public int updatePpeReeInv(PatPpeReqInvVo vo) throws Exception {
    int result = 0;

    String update011d = "updatePatPpeReeInvSU01"; // 우선심사청구 결과 등록
    String update02Id = "updatePatMastrSU01"; // 특허마스터 상태변경
    String insert021d = "insertPatPpeHistorySI01"; // 우선심사청구 결과 이력 등록

    //우선심사청구 평가 등록
    result = ppeDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.ppe." + update011d, vo);

    //특허 마스터 상태변경
    result = ppeDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.ppe." + update02Id, vo);

    //우선심사청구 이력 등록
    result = ppeDAO.executeDynamicInsert("kr.re.kitech.biz.pat.ppe." + insert021d, vo);

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
   * 우선심사청구 의뢰 등록
   * 
   * @author Chris
   * @param PatPpeReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.14.   
   */
  @Override
  public int insertPpeReqInv(PatPpeReqInvVo vo) throws Exception {
    int result = 0;

    String update01Id = "updatePatMastrSU01"; // 특허마스터 상태변경
    String update02Id = "updatePatPpeReqInvSU01"; // 우선 심사청구 의뢰 등록
    String insert021d = "insertPatPpeHistorySI01"; // 우선 심사청구 의뢰 이력 등록
    
    
    //선행기술조사 의뢰 등록
    result = ppeDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.ppe." + update02Id, vo);
    
    //특허 마스터 상태변경
    result = ppeDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.ppe." + update01Id, vo);
    
    //선행기술조사 이력 등록
    result = ppeDAO.executeDynamicInsert("kr.re.kitech.biz.pat.ppe." + insert021d, vo);
    
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

}
