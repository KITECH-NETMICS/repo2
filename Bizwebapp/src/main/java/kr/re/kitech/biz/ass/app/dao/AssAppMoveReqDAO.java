package kr.re.kitech.biz.ass.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자산 이동신청
 * @Class Name : AssAppMoveReqDAO.java
 * @Description : 자산 이동신청 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/08   이정호                  최초생성
 * 
 * @author LeeYh
 * @since 2023/07/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("assAppMoveReqDAO")
public class AssAppMoveReqDAO extends BizDefaultAbstractDAO {

	@SuppressWarnings("unchecked")
	public List<AssAppMoveReqVo> selectAssAppMoveReqList(AssAppMoveReqSrchVo vo) throws KitechException {    	
        return list("kr.re.kitech.biz.ass.app.selectAssAppMoveReqList", vo);
    }

	@SuppressWarnings("unchecked")
	public List<AssAppMoveReqDetailVo> selectAssAppMoveReqDetail(AssAppMoveReqVo vo) {
		return list("kr.re.kitech.biz.ass.app.selectAssAppMoveReqDetail", vo);
	}

	/**
	 * 자산 이동신청을 등록한다.
	 * @param vo 자산 이동신청 AssAppMoveReqDetailVo
	 * @return 
	 * @throws Exception
	 */
    public int insertAssMove01(AssAppMoveReqDetailVo vo) throws KitechException {    	
        return insert("kr.re.kitech.biz.ass.app.insertAssMoveReq", vo);
    }

    /**
	 * 자산 이동신청을 수정한다.
	 * @param vo 자산 이동신청 AssAppMoveReqDetailVo
	 * @return 
	 * @throws Exception
	 */
    public int updateAssMove01(AssAppMoveReqDetailVo vo) {
		return update("kr.re.kitech.biz.ass.app.updateAssMoveReq", vo);
	}

    /**
	 * 자산 이동신청을 삭제한다.
	 * @param vo 자산 이동신청 AssAppMoveReqDetailVo
	 * @return 
	 * @throws Exception
	 */
	public int deleteAssMove01(AssAppMoveReqDetailVo vo) throws KitechException {
		return delete("kr.re.kitech.biz.ass.app.deleteAssMoveReq", vo);
	}
}
