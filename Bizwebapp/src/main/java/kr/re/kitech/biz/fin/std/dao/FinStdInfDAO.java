package kr.re.kitech.biz.fin.std.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.std.vo.XodfVendJobVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 재무관리 기준정보
 * @Class Name : FinStdInfDAO.java
 * @Description : 재무관리 기준정보 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/26   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2023/05/26
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("finStdInfDAO")
public class FinStdInfDAO extends BizDefaultAbstractDAO{
	/**
     * 거래처 담당자 정보 저장
     * @param XodfVendJobVo
     * @return int
     * @throws Exception
     */
	public int updateXodfVendJob(XodfVendJobVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.std.updateXodfVendJob", vo);
	}
	
	/**
     * 거래처 정보 저장
     * @param XodfVendVo
     * @return int
     * @throws Exception
     */
	public int insertXodfVend(XodfVendVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.fin.std.insertXodfVend", vo);
	}
}
