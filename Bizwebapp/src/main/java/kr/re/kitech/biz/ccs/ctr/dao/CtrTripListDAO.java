package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripListVO;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 근거리출장 관련 처리 컨트롤러
 * @Class Name CtrTripInviteController.java
 * @Description 근거리출장 관련 처리 컨트롤러
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/05/13      김태균             최초생성
 * 
 * @author 김태균
 * @since 2022/05/13
 * @version 1.0
 * @see
 * 
 */
@Repository("ctrTripListDAO")
public class CtrTripListDAO extends BizDefaultAbstractDAO {
	
	/**
     * 출장현황을 조회
     * @param Object
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
     public List<CtrTripListVO> selectTripList(Object param) throws KitechException {
    	 return list("kr.re.kitech.biz.ccs.ctr.selectTripList", param);
     }
     
     /**
     * 출장정산현황(국내출장) 조회
     * @param CtrTripAdSrcVo
     * @return List<CtrTripListVO>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	 public List<CtrTripListVO> selectCtrDomAdList(CtrTripAdSrcVo vo) throws KitechException {
    	 return list("kr.re.kitech.biz.ccs.ctr.selectCtrDomAdList", vo);
     }
     
     /**
     * 출장정산현황(해외출장) 조회
     * @param CtrTripAdSrcVo
     * @return List<CtrTripListVO>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	 public List<CtrTripListVO> selectCtrOverAdList(CtrTripAdSrcVo vo) throws KitechException {
    	 return list("kr.re.kitech.biz.ccs.ctr.selectCtrOverAdList", vo);
     }
     
     /**
     * 출장정산현황(국내/해외 출장) 조회
     * @param CtrTripAdSrcVo
     * @return List<CtrTripListVO>
     * @throws Exception
     */
     @SuppressWarnings("unchecked")
	 public List<CtrTripListVO> selectCtrTripAdList(CtrTripAdSrcVo vo) throws KitechException {
    	 return list("kr.re.kitech.biz.ccs.ctr.selectCtrTripAdList", vo);
     }
}