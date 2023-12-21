package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.ctr.dao.CtrBiztripFareDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrBiztripFareService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrBiztripFareVo;
import kr.re.kitech.biz.xom.core.util.MailSender;

@Service("CtrBiztripFareServiceImpl")
public class CtrBiztripFareServiceImpl  extends EgovAbstractServiceImpl implements CtrBiztripFareService {
  @Resource(name="CtrBiztripFareDAO")
  private CtrBiztripFareDAO ctrBiztripFareDAO;
    
	@Resource(name="mailSender")
	private MailSender mailSender;

//  @Override
//  public List<CtrBiztripFareVo> selectList() throws ElException {
//    List<CtrBiztripFareVo> list = ctrBiztripFareDAO.selectList();
//    return list;
//  }

  @Override
  public List<CtrBiztripFareVo> selectListCtrBiztripFare(CtrBiztripFareVo ctrBiztripFareVo) throws ElException {
    return ctrBiztripFareDAO.selectListCtrBiztripFare(ctrBiztripFareVo);
  }

  @Override
  public int insertItem01(CtrBiztripFareVo vo) throws ElException {
	  int result = ctrBiztripFareDAO.insertItem01(vo);
	  return result;
  }

  @Override
	public int updateItem(CtrBiztripFareVo vo) throws Exception {
    int result = ctrBiztripFareDAO.updateItem(vo);
		return result;
	}

  @Override
	public int deleteItem(CtrBiztripFareVo CtrVo) throws Exception {
		return ctrBiztripFareDAO.deleteItem(CtrVo);
	}

@Override
public int insertItem(CtrBiztripFareVo CtrVo) throws Exception {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void ctrMailSend(CtrBiztripFareVo CtrVo) throws ElException {
	// TODO Auto-generated method stub
	
}


}
