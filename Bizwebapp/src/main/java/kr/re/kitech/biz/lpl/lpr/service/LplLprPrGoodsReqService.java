package kr.re.kitech.biz.lpl.lpr.service;

import java.util.List;

import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqAprVo;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;


/**
 * @ClassSubJect 
 * @ClassName : LplLprPrGoodsReqService.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      author    최초생성
 * 
 * @author 김상미
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
public interface LplLprPrGoodsReqService {
  
	/**
	 * 기념홍보물신청 리스트 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectList(LplLprPrGoodsReqInfoVo vo) throws KitechException;

	/**
	 * 기념홍보물신청 물품정보 리스트 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectMasterList(LplLprPrGoodsReqInfoVo vo) throws KitechException;

	/**
	 * 기념홍보물신청 물품 재고정보 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectGoodsInv(LplLprPrGoodsReqInfoVo vo) throws KitechException;
						
	/**
	 * 기념홍보물 파일 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqInfoVo selectLplLprPrGoodsFile(LplLprPrGoodsReqInfoVo vo) throws KitechException;
				
						
	/**
	 * 기념홍보물신청  조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqAprVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqAprVo select(LplLprPrGoodsReqInfoVo vo) throws KitechException;
	
	/**
	 * 기념홍보물신청  등록
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqAprVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqInfoVo save(LplLprPrGoodsReqAprVo vo) throws KitechException;

	/**
	 * 기념홍보물신청 내역 삭제
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqInfoVo delete(LplLprPrGoodsReqInfoVo vo) throws KitechException;
	
	/**
	 * 기념홍보물신청 물품 출고 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public List<LplLprPrGoodsReqInfoVo> selectLplLprPrGoddsDeliv(LplLprPrGoodsReqInfoVo vo) throws KitechException;

	/**
	 * 기념홍보물신청 수신자 정보 저장
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	public LplLprPrGoodsReqInfoVo updateLplLprPrGoodsReqDetail(LplLprPrGoodsReqInfoVo vo) throws KitechException;
	
}
  