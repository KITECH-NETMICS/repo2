package kr.re.kitech.biz.hum.bas.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

  @Repository("humBasStuMngDAO")
  public class HumBasStuMngDAO extends BizDefaultAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<HumBasStuMngListVo> selectHumEducInfo(HumBasStuMngVo vo) {
		// TODO Auto-generated method stub
		return list("kr.re.kitech.biz.hum.bas.selectHumEducInfo", vo);
	}

}
