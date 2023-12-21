package kr.re.kitech.biz.ccs.ctr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ccs.ctr.dao.CtrTripListDAO;
import kr.re.kitech.biz.ccs.ctr.service.CtrTripListService;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripAdSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripListVO;
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
@Service("ctrTripListService")
public class CtrTripListServiceImpl extends EgovAbstractServiceImpl implements CtrTripListService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name="ctrTripListDAO")
    private CtrTripListDAO dao;
	
	
	/**
     * 출장현황을 조회 한다
     * @param Object
     * @throws Exception
     */
	@Override
	public List<CtrTripListVO> selectCtrTripList(Object param) throws KitechException {
		return dao.selectTripList(param);
	}
	
	/**
     * 출장정산현황(국내출장) 조회
     * @param CtrTripAdSrcVo
     * @return List<CtrTripListVO>
     * @throws Exception
     * @author LeeYH
     * @since 2022.11.02.
     */
	public List<CtrTripListVO> selectCtrTripAdList(CtrTripAdSrcVo vo) throws KitechException {
		if("Dom".equals(vo.getTrip_knd())){
			return dao.selectCtrDomAdList(vo);
		}else if("Over".equals(vo.getTrip_knd())){
			return dao.selectCtrOverAdList(vo);
		}else{
			return dao.selectCtrTripAdList(vo);
		}
	}
}