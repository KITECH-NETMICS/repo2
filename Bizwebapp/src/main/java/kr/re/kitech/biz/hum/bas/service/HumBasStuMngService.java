package kr.re.kitech.biz.hum.bas.service;

import java.util.List;

import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngListVo;
import kr.re.kitech.biz.hum.bas.vo.HumBasStuMngVo;

public interface HumBasStuMngService {

	List<HumBasStuMngListVo> selectHumEducInfo(HumBasStuMngVo vo);

}
