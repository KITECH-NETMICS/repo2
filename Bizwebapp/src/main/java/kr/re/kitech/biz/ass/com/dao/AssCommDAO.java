package kr.re.kitech.biz.ass.com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;
import kr.re.kitech.biz.ass.com.vo.AssCommVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자산 공통
 * @Class Name : AssCommDAO.java
 * @Description : 자산 공통 DAO
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
@Repository("assCommDAO")
public class AssCommDAO extends BizDefaultAbstractDAO{
	@SuppressWarnings("unchecked")
	public List<AssCommVo> selectBuilding(String mngmtItem1) throws KitechException{
		return list("kr.re.kitech.biz.ass.com.selectBuilding", mngmtItem1);
	}
}
