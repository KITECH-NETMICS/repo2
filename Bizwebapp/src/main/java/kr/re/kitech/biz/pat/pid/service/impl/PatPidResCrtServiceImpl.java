package kr.re.kitech.biz.pat.pid.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.com.service.PatComWFService;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.pid.dao.PatPidResCrtDAO;
import kr.re.kitech.biz.pat.pid.service.PatPidResCrtService;
import kr.re.kitech.biz.pat.pid.vo.PatPidResCrtVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("patPidResCrtServiceImpl")
public class PatPidResCrtServiceImpl  extends EgovAbstractServiceImpl implements PatPidResCrtService {
  @Resource(name="patPidResCrtDAO")
  private PatPidResCrtDAO pidDAO;

  @Resource(name="patComWFService")
  private PatComWFService patComService;

  /**
    * IDS제출 단건 조회
    * @author Chris
    * @since 2023.08.02.
    */
  @Override
  public PatPidResCrtVo selectSingle(PatPidResCrtVo vo) throws ElException {
      PatPidResCrtVo resultVO = pidDAO.selectSingle(vo);
      return resultVO;
  }

  /**
   * IDS 제출보고 조회
   * 
   * @author Chris
   * @param PatPidResCrtVo
   * @return PatPidResDtlVo
   * @throws KitechException
   * @since 2023.09.14.   
   */
  @Override
  public PatPidResCrtVo selectItem01(PatPidResCrtVo vo) throws KitechException {
    PatPidResCrtVo resultVO = pidDAO.selectItem01(vo);			
      return resultVO;
  }

  /**
    * IDS 제출보고 검토 등록 (주발명자)
    * @author Chris
    * @since 2023.08.02.
    */
  @Override
	public int updateItem(PatPidResCrtVo vo) throws Exception {
    	int result = 0;
		if(vo.getTodo_auth().equals("0")){
			result = pidDAO.updateItem(vo);
		}  // 주발명자

		PatToDoVo param = new PatToDoVo();
		param.setReq_no(vo.getReq_no());
		param.setMngmt_no(vo.getMngmt_no());
		param.setCurr_state_cd("P3111");
		param.setNext_state_cd(vo.getNext_state_cd());  // 결재완료
		param.setTodo_auth(vo.getTodo_auth());  // 결재완료
		param.setSyspayno(vo.getSyspayno());
		param.setRef_key(vo.getRef_key());

		patComService.executePatComWFBiz(param);

		return result;
	}

}
