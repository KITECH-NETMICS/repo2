package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsSubHoliVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappCreComVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappDedctVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappHoliVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappHumVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappInfoVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 휴가원 관련 처리를 담당하는 DAO
 * @Class Name CgslappDAO.java
 * @Description 휴가원 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/05/03   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/05/03
 * @version 1.0
 * @see
 * 
 */
@Repository("cgslappDAO")
public class CgslappDAO extends BizDefaultAbstractDAO {

    /**
     * 휴가원 상세를 조회한다.
     * @param vo 휴가원 CgslappVo
     * @return 휴가원 CgslappVo
     * @throws Exception
     */
    public CgslappVo selectCgslapp(CgslappSchVo vo) throws ElException {
        return (CgslappVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgslapp", vo);
    }
    
    /**
     * 신청중연차일 조회한다.
     * @param vo 시스템사번 CgslappSchVo
     * @return CgslappAnalVo
     * @throws Exception
     */
    public String selectCgsLappNoAprCnt(CgslappSchVo vo) throws ElException {
        return (String) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsLappNoAprCnt", vo);
    }
    
    /**
     * 개인 잔여연차일수, 보상휴가일수 조회한다.
     * @param vo 시스템사번 CgslappSchVo
     * @return CgslappAnalVo
     * @throws Exception
     */
    public CgslappAnalVo selectRemidrAnalQty(CgslappSchVo vo) throws ElException {
        return (CgslappAnalVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectRemidrAnalQty", vo);
    }
    
    /**
     * 개인 잔여연차일수 조회한다.
     * @param vo 시스템사번 CgslappSchVo
     * @return CgslappAnalVo
     * @throws Exception
     */
    public int selectWorkDays(CgslappSchVo vo) throws ElException {
        return (int) selectByPk("kr.re.kitech.biz.ccs.cgs.selectWorkDays", vo);
    }
    
    /**
     * 결재 상태 조회한다.
     * @param vo 시스템사번 CgslappSchVo
     * @return CgslappAnalVo
     * @throws Exception
     */
    public CgslappAnalVo searchCommuteCdByCgslapp(CgslappSchVo vo) throws ElException {
        return (CgslappAnalVo) selectByPk("kr.re.kitech.biz.ccs.cgs.searchCommuteCdByCgslapp", vo);
    }
    
    /**
     * 가족돌봄휴가, 병가 사용카운트 조회한다.
     * @param vo 시스템사번 CgslappSchVo
     * @return CgslappAnalVo
     * @throws Exception
     */
	public CgslappInfoVo selectCgsUsedQty(String sysPayNo) throws ElException {
        return (CgslappInfoVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsUsedQty", sysPayNo);
    }
    
    /**
     * 휴가원 목록조회를 한다.
     * @param vo 휴가원 CgslappVo
     * @return 사원목록  List<CgslappVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CgslappVo> selectListCgslapp(CgslappSchVo vo) throws ElException {      	
        return list("kr.re.kitech.biz.ccs.cgs.selectListCgslapp", vo);
    }
    
    /**
     * 기작성중 문서여부 체크
     * @param vo 휴가원 CgslappVo
     * @return 사원목록  List<CgslappVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public Map<String, String> selectCgsLappExistChk(CgslappVo vo) throws ElException {      	
        return (Map<String, String>)selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsLappExistChk", vo);
    }
    
    /**
     * 연차현황조회(팝업)
     * @param vo 시스템사번 CgslappSchVo
     * @return CgslappInfoVo
     * @throws Exception
     */
    public CgslappInfoVo selectPsnLappInfo(CgslappSchVo vo) throws ElException {
        return (CgslappInfoVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectPsnLappInfo", vo);
    }
    
    /**
     * 개인정보조회한다.(팝업)
     * @param String syspayno
     * @return CgslappHumVo
     * @throws Exception
     */
    public CgslappHumVo selectHumInfo(String syspayno) throws ElException {
        return (CgslappHumVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectHumInfo", syspayno);
    }
    
    /**
     * 휴가사용내역(팝업)
     * @param CgslappSchVo
     * @return CgslappHoliVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CgslappHoliVo> selectLappInfo(CgslappSchVo vo) throws ElException {      	
        return list("kr.re.kitech.biz.ccs.cgs.selectLappInfo", vo);
    }
    
    /**
     * 휴가공제내역 목록을 조회를 한다.(팝업)
     * @param vo 휴가원 CgslappVo
     * @return CgslappDedctVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CgslappDedctVo> selectDedctList(CgslappSchVo vo) throws ElException {      	
        return list("kr.re.kitech.biz.ccs.cgs.selectDedctList", vo);
    }
    
    /**
     * 보상휴가 적립내역 목록을 조회를 한다.(팝업)
     * @param vo 휴가원 CgslappVo
     * @return CgslappCreComVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<CgslappCreComVo> selectCreComList(CgslappSchVo vo) throws ElException {      	
        return list("kr.re.kitech.biz.ccs.cgs.selectCreComList", vo);
    }
    
    /**
     * 병가 휴가원신청중 증빙 미등록건수 조회
     * @param CgslappSchVo
     * @return int
     * @throws Exception
     */
    public int selectLappNoFileCnt(CgslappSchVo vo) throws ElException {
        return (int) selectByPk("kr.re.kitech.biz.ccs.cgs.selectLappNoFileCnt", vo);
    }
    
    /**
     * 휴가원 현황 등록한다.
     * @param vo 휴가원 CgslappVo
     * @return 사번
     * @throws Exception
     */
    public int insertCgslapp(CgslappVo vo) throws ElException {    	
        return insert("kr.re.kitech.biz.ccs.cgs.insertCgslapp", vo);
    }

    /**
     * 휴가원를 갱신한다.
     * @param vo 휴가원 CgslappVo
     * @throws Exception
     */
    public int updateCgslapp(CgslappVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cgs.updateCgslapp", vo);
    }

    /**
     * 휴가원를 삭제한다.
     * @param vo 휴가원 CgslappVo
     * @throws Exception
     */
    public int deleteCgslapp(CgslappSchVo vo) throws ElException {
        return delete("kr.re.kitech.biz.ccs.cgs.deleteCgslapp", vo);
    }

    /**
     * 기존 대체휴가원 삭제
     * @param CgsSubHoliVo
     * @return int
     * @throws Exception
     */
    public int deleteCgsLapp(String ctrlReqNo) throws ElException {
        return delete("kr.re.kitech.biz.ccs.cgs.deleteCgsLapp", ctrlReqNo);
    }
    
    /**
     * 휴가원 중복 체크
     * @param CgsSubHoliVo
     * @return List<Map<String,String>>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<Map<String,String>> selectLappDuplChk(CgsSubHoliVo vo) throws ElException{
    	return list("kr.re.kitech.biz.ccs.cgs.selectLappDuplChk", vo);
    }
    
    /**
     * 대체휴일 휴가원 신청 저장
     * @param CgsSubHoliVo
     * @return int
     * @throws Exception
     */
    public int insertCgsLappSub(CgsSubHoliVo vo) throws ElException{
    	return insert("kr.re.kitech.biz.ccs.cgs.insertCgsLappSub", vo);
    }
    
     /**
     * 휴가원 증빙자료 팝업 조회
     * @param String reqNo
     * @return CgslappVo
     * @throws Exception
     */
    public CgslappVo selectCgsLappEvid(String reqNo) throws ElException{
    	return (CgslappVo)selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgsLappEvid", reqNo);
    }

     /**
     * 휴가원 증빙자료 저장
     * @param CgslappVo
     * @return int
     * @throws Exception
     */
    public int updateCgsLappEvid(CgslappVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cgs.updateCgsLappEvid", vo);
    }
    
    /**
     * 개인연차조회 팝업에서 저장연차 저장
     * @param CgslappVo
     * @return int
     * @throws Exception
     */
    public int updateCgslappSaveAnal(CgslappVo vo) throws ElException{
    	return update("kr.re.kitech.biz.ccs.cgs.updateCgslappSaveAnal", vo);
    }
}
