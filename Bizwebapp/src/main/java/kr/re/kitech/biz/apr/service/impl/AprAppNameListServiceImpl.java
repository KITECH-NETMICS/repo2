package kr.re.kitech.biz.apr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.dao.AprAppNameListDAO;
import kr.re.kitech.biz.apr.service.AprAppNameListService;
import kr.re.kitech.biz.apr.vo.AprAppNameListVo;

@Service("AprAppNameListServiceImpl")
public class AprAppNameListServiceImpl  extends EgovAbstractServiceImpl implements AprAppNameListService {
  @Resource(name="AprAppNameListDAO")
  private AprAppNameListDAO DAO;

  @Override
  public List<AprAppNameListVo> selectAppListItem(AprAppNameListVo vo) throws ElException {
    List<AprAppNameListVo> list = DAO.selectAppListItem(vo);
    return list;
  }

}
