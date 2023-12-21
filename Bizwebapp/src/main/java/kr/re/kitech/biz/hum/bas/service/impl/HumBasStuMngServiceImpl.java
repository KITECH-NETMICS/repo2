package kr.re.kitech.biz.hum.bas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.hum.bas.dao.HumBasStuMngDAO;
import kr.re.kitech.biz.hum.bas.service.HumBasStuMngService;
import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngVo;

@Service("humBasStuMngService")
public class HumBasStuMngServiceImpl  extends EgovAbstractServiceImpl implements HumBasStuMngService {

	@Resource(name="humBasStuMngDAO")
  	private HumBasStuMngDAO humDAO;
  	
	@Override
	public List<HumBasStuMngListVo> selectHumEducInfo(HumBasStuMngVo vo) {
		// TODO Auto-generated method stub
		return humDAO.selectHumEducInfo(vo);
	}


}
