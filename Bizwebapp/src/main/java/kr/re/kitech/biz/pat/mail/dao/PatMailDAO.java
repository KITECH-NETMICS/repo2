package kr.re.kitech.biz.pat.mail.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.mail.vo.MessageTemplateVo;
import kr.re.kitech.biz.pat.mail.vo.PatMailRecvVo;
import kr.re.kitech.biz.pat.mail.vo.PatMailVo;
import kr.re.kitech.biz.pat.mail.vo.PatSMSMainVo;
import kr.re.kitech.biz.pat.mail.vo.PatSMSRecvVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 지식재산권 메일 DAO
 * @Class Name PatMailDao.java
 * @Description 지식재산권 메일 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/01      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/01
 * @version 1.0
 * @see
 * 
 */
@Repository("patMailDAO")
public class PatMailDAO extends BizDefaultAbstractDAO {
	/**
     * mailMain 저장(스케줄러실행위해 DB저장)
     * @param PatMailVo
     * @return int
     * @throws Exception
     */
	public int insertPatMailMain(PatMailVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.mail.insertPatMailMain", vo);
	}
	
	/**
     * mail 수신자 저장(스케줄러실행위해 DB저장)
     * @param PatMailRecvVo
     * @return int
     * @throws Exception
     */
	public int insertPatMailRecv(PatMailRecvVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.mail.insertPatMailRecv", vo);
	}
	
	/**
     * mail_id 조회
     * @param PatToDoVo
     * @return String
     * @throws Exception
     */
	public String selectMailId(PatToDoVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.pat.mail.selectMailId", vo);
	}
	
	/**
     * 메세지 템플릿정보 조회
     * @param String templateCode
     * @return MessageTemplateVo
     * @throws Exception
     */
	public MessageTemplateVo selectMessageTemplate(String templateCode) throws ElException{
		return (MessageTemplateVo)selectByPk("kr.re.kitech.biz.pat.mail.selectMessageTemplate", templateCode);
	}
	
	/**
     * smsMain 저장(스케줄러실행위해 DB저장)
     * @param PatSMSMainVo
     * @return int
     * @throws Exception
     */
	public int insertPatSmsMain(PatSMSMainVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.mail.insertPatSmsMain", vo);
	}
	
	/**
     * mail 수신자 저장(스케줄러실행위해 DB저장)
     * @param PatSMSRecvVo
     * @return int
     * @throws Exception
     */
	public int insertPatSmsRecv(PatSMSRecvVo vo) throws ElException{
		return insert("kr.re.kitech.biz.pat.mail.insertPatSmsRecv", vo);
	}
}
