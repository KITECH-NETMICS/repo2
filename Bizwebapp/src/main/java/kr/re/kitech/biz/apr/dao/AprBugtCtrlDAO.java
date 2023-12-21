package kr.re.kitech.biz.apr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.apr.vo.BugtCtrlInfoVo;
import kr.re.kitech.biz.apr.vo.BugtCtrlSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 예산통제 
 * @Class Name AprBugtCtrlDAO.java
 * @Description 예산통제 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/25      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/25
 * @version 1.0
 * @see
 * 
 */
@Repository("aprBugtCtrlDAO")
public class AprBugtCtrlDAO extends BizDefaultAbstractDAO {
	/**
     * 예산통제자 결재 목록 조회
     * @param BugtCtrlSrcVo
     * @return List<BugtCtrlInfoVo>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	 public List<BugtCtrlInfoVo> selectBblEnfrcCtrlList(BugtCtrlSrcVo vo) throws KitechException{
    	 return list("kr.re.kitech.biz.apr.selectBblEnfrcCtrlList", vo);
     }
     
     /**
     * 예산통제자 결재 로그 입력
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int insertLogBugtCtrlPsn(BugtCtrlInfoVo vo) throws KitechException{
    	 return insert("kr.re.kitech.biz.apr.insertLogBugtCtrlPsn", vo);
     }
     
     /**
     * 해외출장 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateCtrOverAccntCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateCtrOverAccntCtrlNo", vo);
     }
     
     /**
     * 근거리출장 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateCtrLocalCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateCtrLocalCtrlNo", vo);
     }
     
     /**
     * 구매요구 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updatePurReqAccntCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updatePurReqAccntCtrlNo", vo);
     }
     
     /**
     * 구매계정변경 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updatePurAccntChngdCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updatePurAccntChngdCtrlNo", vo);
     }
     
     /**
     * 가지급신청 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateFspPayAdvcReqAccntCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateFspPayAdvcReqAccntCtrlNo", vo);
     }
     
     /**
     * 내부기술지원의뢰 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateFspTechSuphCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateFspTechSuphCtrlNo", vo);
     }
     
     /**
     * 가지급금전도금정산 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateFapPayAdvcAdjstAddAccnt(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateFapPayAdvcAdjstAddAccnt", vo);
     }
     
     /**
     * 전화요금신청 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateCgsTelFeeReqDetlsCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateCgsTelFeeReqDetlsCtrlNo", vo);
     }
     
     /**
     * 연구비송금 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateResBgRemtlCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateResBgRemtlCtrlNo", vo);
     }
     
     /**
     * 연구수당 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateResBgAllowCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateResBgAllowCtrlNo", vo);
     }
     
     /**
     * 결의서 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateFspSlipdCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateFspSlipdCtrlNo", vo);
     }
     
     /**
     * 해외출장정산 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateCtrOverAdAccntCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateCtrOverAdAccntCtrlNo", vo);
     }
     
     /**
     * 국내출장정산 통제번호 업데이트
     * @param BugtCtrlInfoVo
     * @return int
     * @throws Exception
     */
     public int updateCtrDomAdAccntCtrlNo(BugtCtrlInfoVo vo) throws KitechException{
    	 return update("kr.re.kitech.biz.apr.updateCtrDomAdAccntCtrlNo", vo);
     }
}
