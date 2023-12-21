package kr.re.kitech.biz.epu.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.epu.ord.vo.EpuOrnomVendVo;
import kr.re.kitech.biz.epu.pop.vo.PurReqItemVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**
 * @ClassSubJect 발주계획 팝업
 * @Class Name EpuOrdPopDAO
 * @Description 발주계획 팝업 DAO
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
@Repository("epuOrdPopDAO")
public class EpuOrdPopDAO extends BizDefaultAbstractDAO {
	/**
     * 발주계획구매요구 품목내역팝업 구매요구리스트 조회
     * @param EpuOrdSrcVo
     * @return List<EpuOrdLstVo>
     * @throws Exception
     */  
	@SuppressWarnings("unchecked")
	public List<PurReqItemVo> selectPurReqForOrd(PurReqItemVo vo) throws ElException {
		return list("kr.re.kitech.biz.epu.pop.selectPurReqForOrd", vo);
	}
	
	/**
     * 발주계획 - 구매요구내역 첨부파일 조회
     * @param String purReqNo
     * @return List<AttachVo>
     * @throws Exception
     */  
	@SuppressWarnings("unchecked")
	public List<AttachVo> selectXomxComAttachPur(String purReqNo) throws KitechException{
		return list("kr.re.kitech.biz.epu.pop.selectXomxComAttachPur", purReqNo);
	}
	
	/**
     * 발주계획 및 입찰설명회 - 지명업체추가팝업 조회(조달청)
     * @param EpuOrnomVendVo
     * @return List<EpuOrnomVendVo>
     * @throws Exception
     */  
	@SuppressWarnings("unchecked")
	public List<EpuOrnomVendVo> selectEpuVendInfoG2b(EpuOrnomVendVo vo) throws KitechException{
		return list("kr.re.kitech.biz.epu.pop.selectEpuVendInfoG2b", vo);
	}
	
	/**
     * 발주계획 및 입찰설명회 - 지명업체추가팝업 조회(Eip)
     * @param EpuOrnomVendVo
     * @return List<EpuOrnomVendVo>
     * @throws Exception
     */  
	@SuppressWarnings("unchecked")
	public List<EpuOrnomVendVo> selectEpuXodfVend(EpuOrnomVendVo vo) throws KitechException{
		return list("kr.re.kitech.biz.epu.pop.selectEpuXodfVend", vo);
	}
	
	/**
     * 조달청 거래처 등록 팝업 업체조회
     * @param EpuOrnomVendVo
     * @return List<EpuOrnomVendVo>
     * @throws Exception
     */  
	public EpuOrnomVendVo selectEpuVendRegPop(EpuOrnomVendVo vo) throws KitechException{
		return (EpuOrnomVendVo)selectByPk("kr.re.kitech.biz.epu.pop.selectEpuVendInfoG2b", vo);
	}
	
	/**
     * 조달청 거래처 등록 팝업 업체조회
     * @param EpuOrnomVendVo
     * @return List<EpuOrnomVendVo>
     * @throws Exception
     */  
	public EpuOrnomVendVo selectEpuRegXodfVend(EpuOrnomVendVo vo) throws KitechException{
		return (EpuOrnomVendVo)selectByPk("kr.re.kitech.biz.epu.pop.selectEpuXodfVend", vo);
	}
	
	/**
     * 조달청 거래처 등록 팝업 거래처저장
     * @param EpuOrnomVendVo
     * @return int
     * @throws Exception
     */  
	public int insertEpuVendInfoG2b(EpuOrnomVendVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.epu.pop.insertEpuVendInfoG2b", vo);
	}
	
	/**
     * 조달청 거래처 대표자 저장
     * @param EpuOrnomVendVo
     * @return int
     * @throws Exception
     */  
	public int insertEpuCeoInfoG2b(EpuOrnomVendVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.epu.pop.insertEpuCeoInfoG2b", vo);
	}
}
