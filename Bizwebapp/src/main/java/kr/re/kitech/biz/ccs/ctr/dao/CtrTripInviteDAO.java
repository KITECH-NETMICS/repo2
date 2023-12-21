package kr.re.kitech.biz.ccs.ctr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ccs.ctr.vo.CtrCvnTripSrcVo;
import kr.re.kitech.biz.ccs.ctr.vo.CtrTripInviteVo;
import kr.re.kitech.biz.ccs.ctr.vo.CvnTripReqMonthVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 외부강의신고 관련 처리를 담당하는 DAO
 * @Class Name CtrTripInviteDAO.java
 * @Description 외부강의신고 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/04   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/05/04
 * @version 1.0
 * @see
 * 
 */
@Repository("ctrTripInviteDAO")
public class CtrTripInviteDAO extends BizDefaultAbstractDAO {

	/**
     * 외부강의신고 상세를 조횐한다.(신청번호가 있거나 작성중인 문서가 있는 경우)
     * @param CtrCvnTripSrcVo
     * @return 외부강의신고 CtrTripInviteVo
     * @throws Exception
     */
    public CtrTripInviteVo selectCvnTripReq(CtrCvnTripSrcVo vo) throws KitechException {
        return (CtrTripInviteVo) selectByPk("kr.re.kitech.biz.ccs.ctr.selectCvnTripReq", vo);
    }
    
    /**
     *  작성중 문서가 없을 경우 외부강의신고 최초조회
     * @param CtrCvnTripSrcVo
     * @return 외부강의신고 CtrTripInviteVo
     * @throws Exception
     */
    public CtrTripInviteVo selectCvnTripNoReq(CtrCvnTripSrcVo vo) throws KitechException {
        return (CtrTripInviteVo) selectByPk("kr.re.kitech.biz.ccs.ctr.selectCvnTripNoReq", vo);
    }

    /**
     * 페이징을 처리하여 외부강의신고 수정/변경이력 목록조회를 한다.
     * @param vo 외부강의신고 CtrTripInviteVo
     * @return 사원목록  List<CtrTripInviteVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CtrTripInviteVo> selectCtrUpdateList(CtrCvnTripSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.ccs.ctr.selectCtrUpdateList", vo);
    }
    
    
    /**
     * 외부강의신고 목록조회
     * @param CtrCvnTripSrcVo
     * @return List<CtrTripInviteVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CtrTripInviteVo> selectCtrCvnTripReqList(CtrCvnTripSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.ccs.ctr.selectCtrCvnTripReqList", vo);
    }
    

    /**
     * 외부강의신고 목록 조회의 전체 카운트를 조회한다.
     * @param vo 외부강의신고 CtrTripInviteVo
     * @return 사원목록 조회의 전체 카운트
     * @throws Exception
     */
    public long selectListCountCtrTripInvite(CtrTripInviteVo vo)  throws KitechException{               
        return (Long)selectByPk("kr.re.kitech.biz.ccs.ctr.selectListCountCtrTripInvite", vo);
    }

    /**
     * 외부강의신고 저장
     * @param vo 외부강의신고 CtrTripInviteVo
     * @return int
     * @throws Exception
     */
    public int updateCtrCvn(CtrTripInviteVo vo) throws KitechException {
        return update("kr.re.kitech.biz.ccs.ctr.updateCtrCvn", vo);
    }

    /**
     * 외부강의신고를 삭제한다.
     * @param vo 외부강의신고 CtrTripInviteVo
     * @throws Exception
     */
    public int deleteCtrCvn(CtrCvnTripSrcVo vo) throws KitechException {
        return delete("kr.re.kitech.biz.ccs.ctr.deleteCtrCvn", vo);
    }

     /**
     * 외부강의신고 월간현황(팝업) 조회
     * @param CtrCvnTripSrcVo
     * @return List<CtrTripInviteVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CvnTripReqMonthVo> selectCtrMonthList(CtrCvnTripSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.ccs.ctr.selectCtrMonthList", vo);
    }
    
    /**
     * 외부강의 반려시 변경항목 로그 저장
     * @param CtrTripInviteVo
     * @return int
     * @throws Exception
     */
    public int insertCtrCvnModLog(CtrTripInviteVo vo) throws KitechException {
    	return insert("kr.re.kitech.biz.ccs.ctr.insertCtrCvnModLog", vo);
    }
    
    /**
     * 외부강의,타업종사 월간 누적횟수
     * @param CtrTripInviteVo
     * @return CtrTripInviteVo
     * @throws Exception
     */
    public CtrTripInviteVo selectOutlecAccMonCnt(CtrCvnTripSrcVo vo) throws KitechException{
    	return (CtrTripInviteVo)selectByPk("kr.re.kitech.biz.ccs.ctr.selectOutlecAccMonCnt", vo);
    }
    
    /**
     * 기타활동 년 누적금액
     * @param CtrTripInviteVo
     * @return long
     * @throws Exception
     */
    public long selectOutActAccYrAmt(CtrCvnTripSrcVo vo) throws KitechException{
    	return (long)selectByPk("kr.re.kitech.biz.ccs.ctr.selectOutActAccYrAmt", vo);
    }
}
