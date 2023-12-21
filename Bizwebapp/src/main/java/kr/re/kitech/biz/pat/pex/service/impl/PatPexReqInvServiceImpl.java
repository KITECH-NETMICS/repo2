package kr.re.kitech.biz.pat.pex.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.pex.dao.PatPexReqInvDAO;
import kr.re.kitech.biz.pat.pex.service.PatPexReqInvService;
import kr.re.kitech.biz.pat.pex.vo.PatPexReqInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPexReqInvServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
@Service("patPexReqInvServiceImpl")
public class PatPexReqInvServiceImpl  extends EgovAbstractServiceImpl implements PatPexReqInvService {
  @Resource(name="patPexReqInvDAO")
  private PatPexReqInvDAO pexDAO;

  @Resource(name = "patComWFService")
  private PatComWFService patComService;
    
  /**
   * 심사청구 요청 조회
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return PatPexReqInvVo
   * @throws KitechException
   * @since 2023.09.19.   
   */
  @Override
  public PatPexReqInvVo selectItem01(PatPexReqInvVo vo) throws KitechException {
    PatPexReqInvVo resultVO = pexDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * 심사청구 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return PatPexReqInvVo
   * @throws KitechException
   * @since 2023.09.19.   
   */
  @Override
  public PatPexReqInvVo selectItem02(PatPexReqInvVo vo) throws KitechException {
    PatPexReqInvVo resultVO = pexDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * 심사청구 의뢰 등록
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.19.   
   */
  @Override
	public int insertPexReqInv(PatPexReqInvVo vo) throws Exception {
    int result = 0;

    String insert011d = "updatePatPexReqInvSU01"; // 심사청구 의뢰 등록
    String update01Id = "updatePatMastrSU01"; // 특허마스터 상태변경

    //선행기술조사 의뢰 등록
    result = pexDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pex." + insert011d, vo);

    //특허 마스터 상태변경
    result = pexDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pex." + update01Id, vo);

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
   * 심사청구 평가 등록
   * 
   * @author Chris
   * @param PatPexReqInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.19.   
   */
  @Override
	public int updatePexReeInv(PatPexReqInvVo vo) throws Exception {
    int result = 0;

    String update011d = "updatePatPexReeInvSU01"; // 심사청구 의뢰 등록
    String update02Id = "updatePatMastrSU01"; // 특허마스터 상태변경

    // 심사청구 평가 등록
    result = pexDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pex." + update011d, vo);

    // 특허 마스터 상태변경
    result = pexDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pex." + update02Id, vo);

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
