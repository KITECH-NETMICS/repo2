package kr.re.kitech.biz.res.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.res.app.vo.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.res.pop.vo.ResPopSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 연구관리 팝업
 * @Class Name : ResPopDAO.java
 * @Description : 연구관리 팝업 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/12   이영희                최초생성
 * 
 * @author 이영희
 * @since 2023/01/12
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("resPopDAO")
public class ResPopDAO extends BizDefaultAbstractDAO {
	/**
     * 사업신청 사업조정회의조회 팝업 
     * @param ResPopSrcVo
     * @return List<ResAppBsnsAdjstVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResAppBsnsAdjstVo> selectResAppBsnsAdjst(ResPopSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.pop.selectResAppBsnsAdjst", vo);
	}
}
