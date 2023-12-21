package kr.re.kitech.biz.xom.core.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 메시지 템플릿 테이블 관련 처리를 담당하는 DAO
 * @Class Name MessageTemplate.java
 * @Description 메시지 템플릿 테이블 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/04/05
 * @version 1.0
 * @see
 * 
 */
@Repository("msgTemplateDAO")
public class MsgTemplateDAO extends BizDefaultAbstractDAO {


    /**
     * MessageTemplate 테이블를 단건 조회
	 *
     * @param map 
     * @return 사번
     * @throws Exception
     */
	public Map<String,String> getContentByTemplateCode(String templateCode) throws Exception {
	    @SuppressWarnings("unchecked")
		Map<String,String> result = (Map<String,String>)super.selectByPk("kr.re.kitech.biz.xom.core.getContentByTemplateCode", templateCode);
		return result;
    }
    
	public String getContentStrByTemplateCode(String templateCode) throws Exception {
	    return (String)super.selectByPk("kr.re.kitech.biz.xom.core.getContentStrByTemplateCode", templateCode);
    }    
}
