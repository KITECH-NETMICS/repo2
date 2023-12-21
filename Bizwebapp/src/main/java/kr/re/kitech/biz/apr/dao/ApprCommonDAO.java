package kr.re.kitech.biz.apr.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.apr.vo.DocCommentsVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.apr.vo.PostAprVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;



/**
 * 전자결재 공통 레파지토리
 * @author James
 * @since 2022. 6. 21.
 */
@Repository("apprCommonDAO")
public class ApprCommonDAO extends BizDefaultAbstractDAO {

	/**
	 * 스냅샷 저장 위치 조회
	 *
	 * @param reqNo
	 * @return
	 */
	public String getSnapshotLinkurl(String reqNo) {
	    return (String)super.selectByPk("kr.re.kitech.biz.apr.getSnapshotLinkurl", reqNo);
    }     

	/**
	 * 인터페이스 테이블 단건 조회
	 *
	 * @param reqNo
	 * @return
	 */
	public IntfatabVo getXomxintfatab(String reqNo) {
	    return (IntfatabVo)super.selectByPk("kr.re.kitech.biz.apr.getXomxintfatab", reqNo);
    }    
    
	/**
	 * 인터페이스 테이블 삽업
	 *
	 * @param vo
	 * @return
	 */
	public int putXomxintfatab(IntfatabVo vo) {
	     return insert("kr.re.kitech.biz.apr.putXomxintfatab", vo);
    }    
    
	/**
	 * 인터페이스 테이블 수정
	 *
	 * @param vo
	 * @return
	 */
	public int modXomxintfatab(IntfatabVo vo) {
	    return super.update("kr.re.kitech.biz.apr.modXomxintfatab", vo);
    }     

	/**
	 * 인터페이스 테이블 삭제
	 *
	 * @param reqNo
	 * @return
	 */
	public int delXomxintfatab(String reqNo) {
	    return super.delete("kr.re.kitech.biz.apr.delXomxintfatab", reqNo);
    }     
    
    /**
     * 사후결재 테이블 조회
     * @param PostAprVo
     * @return PostAprVo
     * @throws Exception
     */
    public PostAprVo selectXomxAprMgr(PostAprVo vo) throws ElException{
    	return (PostAprVo)selectByPk("kr.re.kitech.biz.apr.selectXomxAprMgr", vo);
    } 
    
    /**
     * 사후결재 사유 조회
     * @param String
     * @return PostAprVo
     * @throws Exception
     */
    public PostAprVo selectAprAfterReason(String reqNo) throws ElException{
    	return (PostAprVo)selectByPk("kr.re.kitech.biz.apr.selectAprAfterReason", reqNo);
    }
    
    /**
     * 사후결재 사유 저장
     * @param PostAprVo
     * @return int
     * @throws Exception
     */
    public int mergeAprAfterReason(PostAprVo vo) throws ElException{
    	return update("kr.re.kitech.biz.apr.mergeAprAfterReason", vo);
    }
    
    /**
     * 결재의견 저장
     * @param DocCommentsVo
     * @return DocCommentsVo
     * @throws Exception
     */
    public int insertDocComments(DocCommentsVo vo) throws ElException{
    	return insert("kr.re.kitech.biz.apr.insertDocComments", vo);
    }
    
    /**
     * 결재의견 조회
     * @param DocCommentsVo
     * @return DocCommentsVo
     * @throws Exception
     */
    public List<DocCommentsVo> selectDocComments(DocCommentsVo vo) throws ElException{
    	return list("kr.re.kitech.biz.apr.selectDocComments", vo);
    }
    
    /**
     * 생성되는 스냅샷 파일 위치를 머지 한다
     * @param String
     * @throws Exception
     */
    public int mergeSnapShotFileUrl(HashMap map) {
    	return update("kr.re.kitech.biz.apr.mergeSnapShotFileUrl", map);
    }
    
    /**
     * 통합프로세스 여부 조회
     * @param String
     * @throws Exception
     */
    public String selectGetMainKey(String reqNo) {
    	return (String) super.selectByPk("kr.re.kitech.biz.apr.selectGetMainKey", reqNo);
    }
    
    /**
	 * 템플릿 URL 위치 조회
	 *
	 * @param reqNum
	 * @return xslUrl
	 */
	public Map<String,String> searchXslUrl(String procDefAlias) {
	    return (Map<String,String>)super.selectByPk("kr.re.kitech.biz.apr.searchXslUrl", procDefAlias);
    }
    
    /**
     * 양식별 위임전결규정 URL 가지고오기
     * @param String
     * @throws Exception
     */
    public String selectRegulationUrl(String procDefAlias) {
    	return (String) super.selectByPk("kr.re.kitech.biz.apr.selectRegulationUrl", procDefAlias);
    }
    
    /**
	 * 결재의견 삭제(회수시)
	 *
	 * @param String
	 * @return req_no
	 */
    public int deleteDocComments(String reqNo) {
		return super.delete("kr.re.kitech.biz.apr.delDocComments", reqNo);
	}
}
