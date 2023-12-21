package kr.re.kitech.biz.ass.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ass.com.dao.AssCommDAO;
import kr.re.kitech.biz.ass.com.service.AssCommService;
import kr.re.kitech.biz.ass.com.vo.AssCommSrchVo;
import kr.re.kitech.biz.ass.com.vo.AssCommVo;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Service("assCommService")
public class AssCommServiceImpl implements AssCommService {
	@Resource(name="assCommDAO")
	private AssCommDAO dao;	

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	/**
     * 자산 지역위치에 따른 건물, 층수 검색
     * @param 
     * @return List<AssCommVo>
     * @throws Exception
     */
	@Override
	public List<AssCommVo> selectBuilding(AssCommSrchVo vo) throws KitechException {
		return dao.selectBuilding(vo.getMngmt_item_1());
	}

}
