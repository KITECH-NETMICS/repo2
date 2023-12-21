package kr.re.kitech.biz.lpl.lpr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 
 * @ClassName : LplLprPrGoodsReqDAO.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.     김상미    		최초생성
 * 
 * @author 김상미
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Repository("lplLprPrGoodsReqDAO")
public class LplLprPrGoodsReqDAO extends BizDefaultAbstractDAO {
  
	/**
	 * 기념홍보물신청 리스트 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectList(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (List<LplLprPrGoodsReqInfoVo>)list("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoddsReqList", vo);
	}
  
	/**
	 * 기념홍보물신청 물품마스터 리스트 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectMasterList(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (List<LplLprPrGoodsReqInfoVo>)list("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoods", vo);
	}
			

	/**
	 * 기념홍보물신청 물품 재고정보 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectGoodsInv(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (List<LplLprPrGoodsReqInfoVo>)list("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoodsInv", vo);
	}			

	/**
	 * 기념홍보물 리스트 파일정보 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqInfoVo selectLplLprPrGoodsFile(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (LplLprPrGoodsReqInfoVo) selectByPk("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoodsFile", vo);
	}


	/**
	 * 기념홍보물신청 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqInfoVo select(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (LplLprPrGoodsReqInfoVo) selectByPk("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoddsReqInfo", vo);
	}

	/**
	 * 기념홍보물신청 물품신청내역 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectPrGoodsReqList(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (List<LplLprPrGoodsReqInfoVo>)list("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoddsProductList", vo);
	}

	/**
	 * 기념홍보물 출고 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectLplLprPrGoddsDeliv(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return (List<LplLprPrGoodsReqInfoVo>)list("kr.re.kitech.biz.lpl.lpr.selectLplLprPrGoddsDeliv", vo);
	}
						
	/**
	 * 기념홍보물신청 기본정보 등록
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public int insertLplLprPrGoodsReq(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.lpl.lpr.insertLplLprPrGoodsReq", vo);
	}	
	
	/**
	 * 기념홍보물신청 기본정보 수정
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13. 
     */
	public int updateLplLprPrGoodsReq(LplLprPrGoodsReqInfoVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.lpl.lpr.updateLplLprPrGoodsReq", vo);
	}
	
	/**
	 * 기념홍보물신청 요청상태 수정
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13. 
     */
	public int updateLplLprPrGoodsReqState(LplLprPrGoodsReqInfoVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.lpl.lpr.updateLplLprPrGoodsReqState", vo);
	}
		
	/**
	 * 기념홍보물신청 기본정보 삭제
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13. 
     */
	public int deleteLplLprPrGoodsReq(LplLprPrGoodsReqInfoVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.lpl.lpr.deleteLplLprPrGoodsReq", vo);
	}	


	/**
	 * 기념홍보물신청 물품정보 등록
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public int insertLplLprPrGoodsReqDetail(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.lpl.lpr.insertLplLprPrGoodsReqDetail", vo);
	}

	/**
	 * 기념홍보물신청 물품정보 수정
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13. 
     */
	public int updateLplLprPrGoodsReqDetail(LplLprPrGoodsReqInfoVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.lpl.lpr.updateLplLprPrGoodsReqDetail", vo);
	}
		
	/**
	 * 기념홍보물신청 물품정보 삭제
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13. 
     */
	public int deleteLplLprPrGoodsReqDetail(LplLprPrGoodsReqInfoVo vo) throws KitechException {
	  return delete("kr.re.kitech.biz.lpl.lpr.deleteLplLprPrGoodsReqDetail", vo);
	}	
	
	/**
	 * 기념홍보물 미배부량, 재고량 수정
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13. 
     */
	public int updateLplLprPrGodds(LplLprPrGoodsReqInfoVo vo) throws KitechException {
	  return update("kr.re.kitech.biz.lpl.lpr.updateLplLprPrGodds", vo);
	}	

	/**
	 * 기념홍보물신청 물품정보 등록
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsWrhsHisVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public int insertLplLprPrGdWrhsHis(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.lpl.lpr.insertLplLprPrGdWrhsHis", vo);
	}
}
