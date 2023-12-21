package kr.re.kitech.biz.epu.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.epu.ord.vo.EpuOrdSrcVo;
import kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo;
import kr.re.kitech.biz.epu.pop.dao.EpuOrdPopDAO;
import kr.re.kitech.biz.epu.pop.service.EpuOrdPopService;
import kr.re.kitech.biz.epu.pop.vo.PurReqItemVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**
 * @ClassSubJect 발주계획 팝업
 * @Class Name EpuOrdPopServiceImpl
 * @Description 발주계획 팝업 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023/08/24      이영희             수정작성
 * 
 * @author 이영희
 * @since 2023/08/24 
 * @version 1.0
 * @see
 * 
 */
@Service("epuOrdPopService")
public class EpuOrdPopServiceImpl  extends EgovAbstractServiceImpl implements EpuOrdPopService {
	@Resource(name="epuOrdPopDAO")
	private EpuOrdPopDAO dao;

	/**
     * 발주계획구매요구 품목내역팝업 구매요구리스트 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLstVo>
     * @throws Exception
     */  
	@Override
	public List<PurReqItemVo> selectPurReqForOrd(PurReqItemVo vo) throws KitechException {
		return dao.selectPurReqForOrd(vo);
	}
	
	/**
     * 발주계획 - 구매요구내역 첨부파일 조회
     * @param EpuOrdSrcVo
     * @return List<AttachVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.25.
     */  
	public List<AttachVo> selectXomxComAttachPur(EpuOrdSrcVo vo) throws KitechException{
		return dao.selectXomxComAttachPur(vo.getPur_req_no());
	}
	
	/**
     * 발주계획 및 입찰설명회 - 지명업체추가 팝업 조회
     * @param XodfVendComVo
     * @return List<XodfVendVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.08.28.
     */  
	public List<EpuOrnomVendVo> selectEpuVendInfo(EpuOrnomVendVo vo) throws KitechException{
		List<EpuOrnomVendVo> vendList = dao.selectEpuVendInfoG2b(vo);
		if(vendList == null || vendList.size() == 0){
			vendList.addAll(dao.selectEpuXodfVend(vo));
		}
		return vendList;
	}
	
	/**
     * 조달청 거래처등록 팝업 조회
     * @param EpuOrnomVendVo
     * @return List<EpuOrnomVendVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.05.
     */  
	public EpuOrnomVendVo selectEpuVendInfoG2b(EpuOrnomVendVo vo) throws KitechException{
		EpuOrnomVendVo vendVo = dao.selectEpuVendRegPop(vo);
		if(vendVo == null){
			vendVo = dao.selectEpuRegXodfVend(vo);
		}
		return vendVo;
	}
	
	/**
     * 조달청 거래처 등록 팝업 거래처저장
     * @param EpuOrnomVendVo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.09.05.
     */  
	public void saveEpuVendInfoG2b(EpuOrnomVendVo vo) throws KitechException{
		// 1) 거래처 저장
		dao.insertEpuVendInfoG2b(vo);
		
		// 2)조달청 거래처 대표자 저장
		dao.insertEpuCeoInfoG2b(vo);
	}
}
