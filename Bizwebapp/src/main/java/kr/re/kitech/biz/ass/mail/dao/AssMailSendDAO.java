package kr.re.kitech.biz.ass.mail.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 자산관리 메일발송 DAO
 * @Class Name : MailSendDAO.java
 * @Description : 자산관리 메일발송 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/07/29   	전재우          	      최초생성
 * 
 * @author JeonJW
 * @since 2022/07/29
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("assMailSendDAO")
public class AssMailSendDAO extends BizDefaultAbstractDAO {
	
	/**
     * 자산이동신청(A13), 자산외부설치(A14) 결재완료 후 메일발송
	 * @param syspayNo 
     * @param String techFeeNo
     * @return Map<String, String>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectAssMoveMailRec_1(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.ass.mail.selectAssMoveMailRec_1", reqNo);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectAssMoveMailRec_2(String syspayNo) throws ElException{
		return list("kr.re.kitech.biz.ass.mail.selectAssMoveMailRec_2", syspayNo);
	}
	
	public String selectAssMoveMailSen(String cd) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.ass.mail.selectAssMoveMailSen", cd);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectAssMoveInfo(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.ass.mail.selectAssMoveInfo", reqNo);
	}
}
