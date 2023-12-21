package kr.re.kitech.biz.hum.com.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.com.vo.HumPrtLogVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 인사공통DAO
 * @Class Name : HumComDAO.java
 * @Description : 인사공통DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/11/23   이민기                최초생성
 * 
 * @author MKLee
 * @since 2023/11/23
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("humComDAO")
public class HumComDAO extends BizDefaultAbstractDAO {
	
	/**
     * 인사증명서 인쇄 로그 단건등록
     * @param HumPrtLogVo
     * @return int
     * @throws Exception
     */
	public int insertHumPrtLogData(HumPrtLogVo vo) throws KitechException {
		return insert("kr.re.kitech.biz.hum.com.insertHumPrtLogData", vo);
	}


   
}
