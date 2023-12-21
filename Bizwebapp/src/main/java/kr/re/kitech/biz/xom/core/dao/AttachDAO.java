package kr.re.kitech.biz.xom.core.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.xom.core.vo.AttachVo;

/**  
 * @ClassSubJect 공통첨부파일테이블 관련 처리를 담당하는 DAO
 * @Class Name AttachDAO.java
 * @Description 공통첨부파일테이블 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/18   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/18
 * @version 1.0
 * @see
 * 
 */
@Repository("attachDAO")
public class AttachDAO extends kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO {

    /**
     * 공통첨부파일테이블 상세를 조횐한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @return 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    public AttachVo selectAttach(AttachVo vo) throws ElException {
        return (AttachVo) selectByPk("kr.re.kitech.biz.xom.core.selectAttach", vo);
    }

    /**
     * 페이징을 처리하여 공통첨부파일테이블 목록조회를 한다.
     * @param String attachFileNo
     * @return 사원목록  List<AttachVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AttachVo> selectListAttach(String attachFileNo) throws ElException {      	
        return list("kr.re.kitech.biz.xom.core.selectListAttach", attachFileNo);
    }

    /**
     * 공통첨부파일테이블 목록 조회의 전체 카운트를 조회한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountAttach(AttachVo vo)  throws ElException{               
        return (Long)selectByPk("kr.re.kitech.biz.xom.core.selectListCountAttach", vo);
    }
        
    /**
     * 공통첨부파일테이블를 등록한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @return 사번
     * @throws Exception
     */
    public int insertAttach(AttachVo vo) throws ElException {    	
        return insert("kr.re.kitech.biz.xom.core.insertAttach", vo);
    }

    /**
     * 공통첨부파일테이블를 갱신한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    public int updateAttach(AttachVo vo) throws ElException {
        return update("kr.re.kitech.biz.xom.core.updateAttach", vo);
    }
    
    /**
     * 공통첨부파일테이블 유효성 컬럼을 갱신한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @throws Exception
     */    
    public int updateAttachForValid(List<String> attachNos) throws ElException {
        return update("kr.re.kitech.biz.xom.core.updateAttachForValid", attachNos);
    }    
    

    /**
     * 공통첨부파일테이블를 삭제한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    public int deleteAttach(AttachVo vo) throws ElException {
        return delete("kr.re.kitech.biz.xom.core.deleteAttach", vo);
    }


    /**
     * 공통첨부파일테이블 MAX SEQ 조회
     * @param vo 공통첨부파일테이블 AttachVo
     * @return 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    public AttachVo selectMaxSeq(AttachVo vo) throws ElException {
        return (AttachVo) selectByPk("kr.re.kitech.biz.xom.core.selectMaxSeq", vo);
    }
    
    /**
     * 공통첨부파일테이블 상세를 조횐한다.
     * @param vo 공통첨부파일테이블 AttachVo
     * @return 공통첨부파일테이블 AttachVo
     * @throws Exception
     */
    public AttachVo selectEpuAttach(AttachVo vo) throws ElException {
        return (AttachVo) selectByPk("kr.re.kitech.biz.xom.core.selectEpuAttach", vo);
    }
    
}
