package kr.re.kitech.biz.uss.bas.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.re.kitech.biz.uss.bas.dao.ComBasIPReqDAO;
import kr.re.kitech.biz.uss.bas.service.ComBasIPReqService;
import kr.re.kitech.biz.uss.bas.vo.ComBasIPReqVo;
import kr.re.kitech.biz.uss.bas.vo.ComBasIpReqFormVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("comBasIPReqServiceImpl")
public class ComBasIPReqServiceImpl implements ComBasIPReqService {

	@Resource(name="comBasIPReqDAO")
	ComBasIPReqDAO comBasIPReqDAO;

	@Override
	public ComBasIpReqFormVo selectIpReqForm(ComBasIPReqVo vo) throws KitechException {
		ComBasIpReqFormVo retVo = new ComBasIpReqFormVo();
		
		retVo.setComBasIPReqVo(comBasIPReqDAO.selectItemXomBasIPAply(vo));
		retVo.setComBasIPReqAssVoList(comBasIPReqDAO.selectListItemXomBasAssInfo(vo));
		
		return retVo;
	}
	

}
