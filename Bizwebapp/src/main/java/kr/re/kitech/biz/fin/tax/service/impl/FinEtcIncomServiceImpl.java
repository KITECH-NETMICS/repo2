package kr.re.kitech.biz.fin.tax.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.tax.dao.FinEtcIncomDAO;
import kr.re.kitech.biz.fin.tax.service.FinEtcIncomService;
import kr.re.kitech.biz.fin.tax.vo.FtxEtcIncomVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기타소득관리 
 * @Class Name : FinEtcIncomServiceImpl.java
 * @Description : 기타소득관리 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                 수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/10/24   이민기          최초생성
 * 
 * @author 이민기
 * @since 2023/10/24
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved.
 */
@Service("finEtcIncomService")
public class FinEtcIncomServiceImpl extends EgovAbstractServiceImpl implements FinEtcIncomService {
		
	@Resource(name="finEtcIncomDAO")
	private FinEtcIncomDAO dao;
		

	/**
    * 기타소득조회
    * @param selectEtcIncomList
    * @return List<FtxEtcIncomVo>
    * @author MKlee
    * @since 2023.10.25.
    */
	@Override
	public List<FtxEtcIncomVo> selectEtcIncomList(FtxEtcIncomVo vo) throws KitechException{
		return dao.selectEtcIncomList(vo);
	}

	/**
    * 기타소득 상세
    * @param selectEtcIncomList
    * @return FtxEtcIncomVo
    * @author MKlee
    * @since 2023.10.25.
    */
	@Override
	public FtxEtcIncomVo selectEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		return dao.selectEtcIncomData(vo);
	}
	
	/**
    * 기타소득 삭제
    * @param deleteEtcIncomData
    * @return FtxEtcIncomVo
    * @author MKlee
    * @since 2023.10.25.
    */

	@Override
	public void deleteEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		dao.deleteEtcIncomData(vo);
	}
	
	/**
    * 기타소득 수정
    * @param updateEtcIncomData
    * @return FtxEtcIncomVo
    * @author MKlee
    * @since 2023.10.25.
    */

	@Override
	public void updateEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		dao.updateEtcIncomData(vo);
	}
	
	/**
    * 기타소득 등록
    * @param insertEtcIncomData
    * @return FtxEtcIncomVo
    * @author MKlee
    * @since 2023.10.25.
    */

	@Override
	public int insertEtcIncomData(FtxEtcIncomVo vo) throws KitechException {
		
		FtxEtcIncomVo resultVo = dao.selectEtcIncomMnmtNo(vo);
		String mngmtNo = resultVo.getMngmt_no();
		vo.setMngmt_no(mngmtNo);
		return dao.insertEtcIncomData(vo);
	}

}
