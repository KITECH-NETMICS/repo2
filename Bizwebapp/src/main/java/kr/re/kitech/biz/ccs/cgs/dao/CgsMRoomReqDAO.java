package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsMRoomReqVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 회의실신청 관련 처리를 담당하는 DAO
 * @Class Name CgsMRoomReqDAO.java
 * @Description 회의실신청 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/13   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/04/13
 * @version 1.0
 * @see
 * 
 */
@Repository("cgsMRoomReqDAO")
public class CgsMRoomReqDAO extends BizDefaultAbstractDAO {

    /**
     * 회의실신청 상세를 조횐한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @return 회의실신청 CgsMRoomReqVo
     * @throws Exception
     */
    public CgsMRoomReqVo selectCgsMRoomReq(CgsMRoomReqVo vo) throws ElException {
        return (CgsMRoomReqVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsMRoomReq", vo);
    }

    /**
     * 페이징을 처리하여 회의실신청 목록조회를 한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @return 사원목록  List<CgsMRoomReqVo>
     * @throws Exception
     */
    public List<CgsMRoomReqVo> selectListCgsMRoomReq(CgsMRoomReqVo vo) throws ElException {      	
         return (List<CgsMRoomReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsMRoomReq", vo);
    }

    /**
     * 회의실신청 목록 조회의 전체 카운트를 조회한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountCgsMRoomReq(CgsMRoomReqVo vo)  throws ElException{               
        return (Long)selectByPk("kr.re.kitech.biz.ccs.cgs.selectListCountCgsMRoomReq", vo);
    }
        
    /**
     * 회의실신청를 등록한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @return 사번
     * @throws Exception
     */
    public int insertCgsMRoomReq(CgsMRoomReqVo vo) throws ElException {    	
        return insert("kr.re.kitech.biz.ccs.cgs.insertCgsMRoomReq", vo);
    }

    /**
     * 회의실신청를 갱신한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @throws Exception
     */
    public int updateCgsMRoomReq(CgsMRoomReqVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cgs.updateCgsMRoomReq", vo);
    }

    /**
     * 회의실신청를 삭제한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @throws Exception
     */
    public int deleteCgsMRoomReq(CgsMRoomReqVo vo) throws ElException {
        return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsMRoomReq", vo);
    }
    
     /**
     * 페이징을 처리하여 회의실 목록조회를 한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @return 사원목록  List<CgsMRoomReqVo>
     * @throws Exception
     */
    public List<CgsMRoomReqVo> selectListCgsMRoom(CgsMRoomReqVo vo) throws ElException {      	
        return (List<CgsMRoomReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsmroom", vo);
    }
    
     /**
     * 페이징을 처리하여 회의실 목록조회를 한다.
     * @param vo 회의실신청 CgsMRoomReqVo
     * @return 사원목록  List<CgsMRoomReqVo>
     * @throws Exception
     */
    public List<CgsMRoomReqVo> selectListCgsMRoomInfo(CgsMRoomReqVo vo) throws ElException {      	
        return (List<CgsMRoomReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsmroomInfo", vo);
    }

    /**
     * 모바일 잔여 회의실을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<Object> selectListCgsMRoomMob(CgsMRoomReqVo param) throws Exception {
		return list("kr.re.kitech.biz.ccs.cgs.selectListCgsMRoomMob", param);
	}
	
	    /**
     * 회의실 중복 신청을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public CgsMRoomReqVo selectCgsMroomDup(CgsMRoomReqVo param) throws ElException {
		return (CgsMRoomReqVo)selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsMRoomDupCheck", param);
	}
	
		    /**
     * 회의실 중복 신청을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public CgsMRoomReqVo selectCgsMroomDup2(CgsMRoomReqVo param) throws ElException {
		return (CgsMRoomReqVo)selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsMRoomDupCheckTwo", param);
	}
	
		    /**
     * 회의실 중복 신청을 조회합니다
     * @param CgsMRoomReqVo
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public CgsMRoomReqVo selectCgsMroomTimeOverlap(CgsMRoomReqVo param) throws ElException {
		return (CgsMRoomReqVo)selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsMRoomTimeOverLap", param);
	}
	
}
