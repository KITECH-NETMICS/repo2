package kr.re.kitech.biz.api.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.vo.biz.SfcChmclVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 안전관리 결재 사후작업 DAO
 * @Class Name CsfProcessDAO.java
 * @Description 안전관리 결재 사후작업 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/11/26                  최초생성
 * 
 * @author 
 * @since 2022/08/01
 * @version 1.0
 * @see
 * 
 */
@Repository("csfProcessDAO")
public class CsfProcessDAO extends BizDefaultAbstractDAO {
	
	/**
     * 결재완료 후 use_req_no 조회
     * @param String reqNo
     * @return List<SfcChmclVo>
     * @throws Exception
     */
     
    @SuppressWarnings("unchecked")
	public List<SfcChmclVo> selectsfcDsuseReqNoInfo(String reqNo) throws ElException{
		return list("kr.re.kitech.biz.api.bpm.selectSfcDsuseReqNoInfo", reqNo);
	}
	
	/**
     * 화학물질 결재 이력 테이블 저장
     * @param SfcChmclVo
     * @return int
     * @throws Exception
     */
	public int insertSfcdisposalapphistory(SfcChmclVo vo) throws ElException{
		return insert("kr.re.kitech.biz.api.bpm.insertSfcdisposalapphistory", vo);
	}
} 
