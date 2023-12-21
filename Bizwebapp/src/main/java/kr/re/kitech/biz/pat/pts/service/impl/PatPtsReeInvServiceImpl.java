package kr.re.kitech.biz.pat.pts.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.pts.dao.PatPtsReeInvDAO;
import kr.re.kitech.biz.pat.pts.service.PatPtsReeInvService;
import kr.re.kitech.biz.pat.pts.vo.PatPtsReeInvVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : PatPtsReeInvServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.20.      Chris    최초생성
 * 
 * @author Chris
 * @since 2023.09.20.
 * @version 1.0
 * @see
 * 
 */
@Service("patPtsReeInvServiceImpl")
public class PatPtsReeInvServiceImpl  extends EgovAbstractServiceImpl implements PatPtsReeInvService {
  @Resource(name="patPtsReeInvDAO")
  private PatPtsReeInvDAO ptsDAO;

  @Resource(name = "generationServiceImpl")
	private GenerationService genService;

  @Resource(name = "patComWFService")
  private PatComWFService patComService;
    
  /**
   * 선행기술조사 보완요청 횟수 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return List<PatPtsReeInvVo>
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public List<PatPtsReeInvVo> selectList01(PatPtsReeInvVo vo) throws KitechException {
    List<PatPtsReeInvVo> list = ptsDAO.selectList01(vo);	
    return list;
  }

  /**
   * 명세서 의뢰 결과 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public PatPtsReeInvVo selectItem01(PatPtsReeInvVo vo) throws KitechException {
    PatPtsReeInvVo resultVO = ptsDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
   * 명세서 상세 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public PatPtsReeInvVo selectItem02(PatPtsReeInvVo vo) throws KitechException {
    PatPtsReeInvVo resultVO = ptsDAO.selectItem02(vo);			
      return resultVO;
  }

  /**
   * 선행기술조사 검색
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public PatPtsReeInvVo selectItem03(PatPtsReeInvVo vo) throws KitechException {
    PatPtsReeInvVo resultVO = ptsDAO.selectItem03(vo);			
      return resultVO;
  }

  /**
   * 명세서 보완요청 결과 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public PatPtsReeInvVo selectItem04(PatPtsReeInvVo vo) throws KitechException {
    PatPtsReeInvVo resultVO = ptsDAO.selectItem04(vo);			
      return resultVO;
  }

  /**
   * 명세서 의뢰 조회
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return PatPtsReeInvVo
   * @throws KitechException
   * @since 2023.09.20.   
   */
  @Override
  public PatPtsReeInvVo selectItem05(PatPtsReeInvVo vo) throws KitechException {
    PatPtsReeInvVo resultVO = ptsDAO.selectItem05(vo);			
      return resultVO;
  }

  /**
   * 명세서 평가 보완요청 등록
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.20.   
   */
  @Override
	public int insertPtsReeInv(PatPtsReeInvVo vo) throws Exception {
    int result = 0;
    String app_id = "";
    String update01Id = "updatePatPtsReeInvSU01"; // 명세서 평가 완료
    String update02Id = "updatePatPtsReeInvSU02"; // 명세서 보완 요청
    String update03Id = "updatePatPtsMasterSU01"; // 특허마스터 상태변경
    String update04Id = "updatePatPtsSpcSU01"; // 명세서 마스터 변경
    String update05Id = "updatePatPtsSpcSU02"; // 명세서 마스터 변경(평가)
    String insert02Id = "insertPatPtsRecSI01"; // 명세서 보완요청 결과 등록후 출원지시 데이터 작성
    
    if ("0".equals(vo.getEval_clsf())) {
        result = ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update01Id, vo);
        // 명세서 마스터 상태 변경        
        result = ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update05Id, vo);
    } else {
        result = ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update02Id, vo);
        // 명세서 마스터 상태 변경        
        result = ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update04Id, vo);
    }
    
    // 특허 마스터 상태변경
    result = ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update03Id, vo);
    
    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getCurr_state_cd());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    param.setRef_key(vo.getRef_key());
    
    patComService.executePatComWFBiz(param);
    
    if ("0".equals(vo.getEval_clsf())) {
        app_id = genService.getGenNumber(Numberings.DOCUMENT.getName(), "I14");
        vo.setApp_id(app_id);
    
        ptsDAO.executeDynamicInsert("kr.re.kitech.biz.pat.pts." + insert02Id, vo);
    
        // 출원지시 의뢰 단계 프로세스 처리
        PatToDoVo param2 = new PatToDoVo();
        param2.setReq_no(vo.getReq_no());
        param2.setMngmt_no(vo.getMngmt_no());
        param2.setCurr_state_cd("");
        param2.setNext_state_cd("P0500");
        param2.setSyspayno(vo.getSyspayno());
        param2.setRef_key(app_id);
        param2.setInit("Y");
    
        patComService.executePatComWFBiz(param2);
    }

    return result;
	}

  /**
   * 명세서작성 의뢰 등록
   * 
   * @author Chris
   * @param PatPtsReeInvVo
   * @return int
   * @throws Exception
   * @since 2023.09.20.   
   */
  @Override
	public int insertPtsReqInv(PatPtsReeInvVo vo) throws Exception {
    int result = 0;

    String spec_id = "";
    String insert011d = "insertPatPtsReqSI01"; // 명세서 의뢰 등록
    String update01Id = "updatePatPtsMasterSU02"; // 명세서 의뢰 완료 마스터 상태변경
    String update02Id = "updatePatPtsReqSU01"; // 명세서 의뢰 등록
    
    
    // 결재완료 단계 프로세스 처리
    PatToDoVo param = new PatToDoVo();
    param.setMain_key(vo.getMain_key());
    param.setReq_no(vo.getReq_no());
    param.setMngmt_no(vo.getMngmt_no());
    param.setCurr_state_cd(vo.getBf_state());
    param.setNext_state_cd(vo.getNext_state_cd());
    param.setSyspayno(vo.getSyspayno());
    
    if (!"".equals(vo.getSpec_id()) && vo.getSpec_id() != null) {
        spec_id = vo.getSpec_id();
        ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update02Id, vo);
        param.setRef_key(vo.getRef_key());
    } else {
        spec_id = genService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDocu_clsf());
        vo.setSpec_id(spec_id);
        
        //명세서 의뢰 등록
        ptsDAO.executeDynamicInsert("kr.re.kitech.biz.pat.pts." + insert011d, vo);
    
        param.setInit("Y");
        param.setRef_key(spec_id);
    }
    //명세서 의뢰 완료 특허마스터 상태변경
    result = ptsDAO.executeDynamicUpdate("kr.re.kitech.biz.pat.pts." + update01Id, vo);
    
    patComService.executePatComWFBiz(param);

    return result;
	}
}
