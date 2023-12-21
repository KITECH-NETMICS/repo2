package kr.re.kitech.biz.pat.poa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.poa.dao.PatPoaPrdChngReqDAO;
import kr.re.kitech.biz.pat.poa.service.PatPoaPrdChngReqService;
import kr.re.kitech.biz.pat.poa.vo.PatPoaPrdChngReqVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : PatPoaPrdChngReqServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.10.23.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.10.23.
 * @version 1.0
 * @see
 * 
 */
@Service("patPoaPrdChngReqServiceImpl")
public class PatPoaPrdChngReqServiceImpl  extends EgovAbstractServiceImpl implements PatPoaPrdChngReqService {
  @Resource(name="patPoaPrdChngReqDAO")
  private PatPoaPrdChngReqDAO poaDAO;
  
  @Resource(name="attachDAO")
  private AttachDAO attachDAO;
  
  @Resource(name = "apprFuncServiceImpl")
  private ApprFuncService apprFuncService;
  
  @Resource(name = "generationServiceImpl")
  private GenerationService genService;
    
  /**
   * OA기간연장변경신청 조회
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return List<PatPoaPrdChngReqVo>
   * @throws KitechException
   * @since 2023.10.23.   
   */
  @Override
  public List<PatPoaPrdChngReqVo> selectList01(PatPoaPrdChngReqVo vo) throws KitechException {
    List<PatPoaPrdChngReqVo> list = poaDAO.selectList01(vo);	
    return list;
  }

  /**
   * OA기간연장신청 상세 조회
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  @Override
  public PatPoaPrdChngReqVo selectItem01(PatPoaPrdChngReqVo vo) throws KitechException {
    PatPoaPrdChngReqVo resultVO = poaDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * OA기간연장신청서 저장
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo savePatOaPrdMnt(PatPoaPrdChngReqVo vo) throws KitechException {
    PatPoaPrdChngReqVo retVo = new PatPoaPrdChngReqVo();

    String reqNo = vo.getReq_no();

    if ("".equals(reqNo)) {
        reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I19");
        vo.setReq_no(reqNo);
        poaDAO.insertPatOaPrdChngReqSI(vo); // kitech.pat.poa.xda.PatOaPrdChngReqSI

        // xomxintfatab 저장
        poaDAO.insertXomxIntfaTabSI01(vo); // kitech.pat.poa.xda.PatOaPrdChngReqSI
    } else {
        poaDAO.updatePatOaPrdChngReqSU(vo); // kitech.pat.poa.xda.PatOaPrdChngReqSU
    }

    retVo.setReq_no(reqNo);
	return retVo;
  }

  /**
   * OA기간연장신청서 결재
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  public PatPoaPrdChngReqVo sendApproval(PatPoaPrdChngReqVo aprData) throws KitechException {

    PatPoaPrdChngReqVo retVo = new PatPoaPrdChngReqVo();

    AprVo aprVo = new AprVo();
    aprVo.setReqNo(aprData.getReq_no());
    aprVo.setLoginUserId(aprData.getLogin_user_id());
    aprVo.setReporterId(aprData.getReporter_id());
    aprVo.setUiId(aprData.getUi_id());
    aprVo.setAprState(aprData.getApr_state());
    aprVo.setManager(aprData.getManager_id());
    aprVo.setResult(aprData.getResult());
    aprVo.setInfoCd(aprData.getInfo_cd());
    aprVo.setExt2Cd(aprData.getExt2_cd());
    aprVo.setExt1Cd(aprData.getExt1_cd());
    aprVo.setResearcher(aprData.getResearcher_id());
    aprVo.setEndpoint(KitechContextUtil.getUserId());

    aprData.setAttachVo1(attachDAO.selectListAttach(aprData.getAttach_file_no()));
    
    AppLog.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ aprData : " + aprData);    
    AppLog.debug("↓ ↓ ↓ ↓ ↓ ↓ ↓ aprVo : " + aprVo);

    apprFuncService.approvalRequest(aprVo, aprData);

    retVo.setReq_no(aprVo.getReqNo());
    return retVo;

  }


  /**
   * OA기간연장신청서 삭제
   * 
   * @author Chris
   * @param PatPoaPrdChngReqVo
   * @return PatPoaPrdChngReqVo
   * @throws KitechException
   * @since 2023.10.23.   
   */
  @Override
	public PatPoaPrdChngReqVo deletePatOaPrdChngReqSD(PatPoaPrdChngReqVo vo) throws KitechException {
    PatPoaPrdChngReqVo retVo = new PatPoaPrdChngReqVo();
    String reqNo = vo.getReq_no();
    poaDAO.deletePatOaPrdChngReqSD(vo);
    apprFuncService.formRemove(reqNo);

    retVo.setReq_no(reqNo);
    return retVo;
	}

}
