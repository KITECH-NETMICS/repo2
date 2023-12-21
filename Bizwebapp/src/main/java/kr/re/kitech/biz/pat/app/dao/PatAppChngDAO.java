package kr.re.kitech.biz.pat.app.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 지식재산권 변경신청 DAO
 * @Class Name PatAppChngDao.java
 * @Description 지식재산권 변경신청 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/11      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/11
 * @version 1.0
 * @see
 * 
 */
@Repository("patAppChngDAO")
public class PatAppChngDAO extends BizDefaultAbstractDAO {
	/**
     * 지재권 관련과제 저장
     * @param PatRelatReschPrjVo
     * @return int
     * @throws Exception
     */
	public int insertPatRelatReschPrj(PatRelatReschPrjVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.app.insertPatRelatReschPrj", vo);
	}
}
