package kr.re.kitech.biz.apr.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.apr.vo.AprAppNameListVo;

public interface AprAppNameListService {
  // List Select Param
  public List<AprAppNameListVo> selectAppListItem(AprAppNameListVo Vo) throws ElException;
}
