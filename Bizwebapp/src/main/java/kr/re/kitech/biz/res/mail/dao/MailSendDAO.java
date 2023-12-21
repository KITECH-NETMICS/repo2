/**
 * 
 */
package kr.re.kitech.biz.res.mail.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.res.tec.vo.ResPstCrtPagrVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**  
 * @ClassSubJect 연구관리 메일발송 DAO
 * @Class Name : MailSendDAO.java
 * @Description : 연구관리 메일발송 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/07/06   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/07/06
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("resMailSendDAO")
public class MailSendDAO extends BizDefaultAbstractDAO {
	
	/**
     * 기술이전 계약완료 후 메일발송(마스터정보조회)
     * @param String techFeeNo
     * @return Map<String, String>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public Map<String, String> selectResPstMast(String techFeeNo) throws ElException{
		return (Map<String, String>)selectByPk("kr.re.kitech.biz.res.mail.selectResPstMast", techFeeNo);
	}
	
	/**
     * 계약완료 후 메일발송(협약업체조회)
     * @param String techFeeNo
     * @return List<ResPstCrtPagrVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<ResPstCrtPagrVo> selectResPstCrtPagr(String techFeeNo) throws ElException{
		return list("kr.re.kitech.biz.res.mail.selectResPstCrtPagr", techFeeNo);
	}
	
	/**
     * 계약완료 후 메일발송(기술료 관련 출원번호)
     * @param String techFeeNo
     * @return Map<String, String>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Map<String,String>> selectResPstAply(String techFeeNo) throws ElException{
		return (List<Map<String,String>>)list("kr.re.kitech.biz.res.mail.selectResPstAply", techFeeNo);
	}
	
	/**
     * 페이징을 처리하여 공통첨부파일테이블 목록조회를 한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @return 사원목록  List<AttachVo>
     * @throws Exception
     */
    public List<AttachVo> selectListAttach(AttachVo vo) throws ElException {      	
        return (List<AttachVo>)list("kr.re.kitech.biz.xom.core.selectListAttach", vo);
    }
}
