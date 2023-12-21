package kr.re.kitech.biz.ccs.cgs.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsSubHoliVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappPsnViewVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappReqInfoVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappSchVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgslappVo;

/**  
 * @ClassSubJect 휴가원 관련 처리를 담당하는 인터페이스
 * @Class Name : CgslappService.java
 * @Description : 휴가원 관련 처리를 담당하는 인터페이스
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
public interface CgslappService {
	
	/**
	 * 휴가원 목록을 조회한다.
	 * @param cgslappVo 휴가원 CgslappVo
	 * @return  휴가원 목록 List<CgslappVo>
	 * @throws Exception
	 */
	public List<CgslappVo> selectListCgslapp(CgslappSchVo cgslappSchVo);
	
	/**
	 * 휴가원 상세조회를 한다.
	 * @param cgslappVo 휴가원 CgslappVo
	 * @return 사원상세정보 CgslappVo
	 * @throws Exception
	 */
	public CgslappReqInfoVo selectCgslapp(CgslappSchVo cgslappVo);	
	
	/**
	 * 인 잔여연차일수 조회, 휴가원신청-미승인연차일수
	 * @param CgslappSchVo 
	 * @return CgslappVo
	 * @throws Exception
	 */
	public CgslappAnalVo selectRemidrAnalQty(CgslappSchVo cgslappSchVo);
	
	/**
	 * 개인 잔여연차일수 조회(팝업)
	 * @param CgslappSchVo 시스템사번 CgslappSchVo
	 * @return CgslappVo
	 * @throws Exception
	 */
	public CgslappAnalVo selectRemidrAnalQtyPop(CgslappSchVo cgslappSchVo);
	
	/**
	 * 워크데이 조회
	 * @param CgslappSchVo 시스템사번 CgslappSchVo
	 * @return CgslappVo
	 * @throws Exception
	 */
	public int selectWorkDays(CgslappSchVo cgslappSchVo);
	
	/**
	 * 연차 사용내역 조회(팝업)
	 * @param CgslappSchVo 
	 * @return CgslappPsnViewVo
	 * @throws Exception
	 */
	public CgslappPsnViewVo selectPsnHoliInfo(CgslappSchVo cgslappSchVo);
	
	/**
	 * 병가 휴가원신청중 증빙 미등록건 조회
	 * @param CgslappSchVo
	 * @return int
	 * @throws Exception
	 */
	public int selectLappNoFileCnt(CgslappSchVo cgslappSchVo);
	
	/**
	 * 휴가원를 등록한다.
	 * @param cgslappVo 휴가원 CgslappVo
	 * @return 사번
	 * @throws Exception
	 */
	public CgslappSchVo saveCgsLapp(CgslappReqInfoVo vo) throws Exception;
	
	/**
	 * 휴가원를 갱신한다.
	 * @param cgslappVo 휴가원 CgslappVo
	 * @throws Exception
	 */
	public void updateCgsLappEvid(CgslappVo cgslappVo);
	
	/**
    * 저장연차 업데이트(개인연차조회 팝업)
    */ 
	public void updateCgsLappSaveAnal(CgslappVo vo);
	
	/**
	 * 휴가원를 삭제한다.
	 * @param cgslappVo 휴가원 CgslappVo
	 * @throws Exception
	 */
	public void deleteCgslapp(CgslappSchVo vo) throws Exception;
	
	/**
    * 기존 대체휴가원 삭제(출장신청등에서 호출)
    */ 
	public int deleteCgsLapp(String ctrlReqNo) throws ElException;
	
	/**
    * 대체휴일 등록(국내출장에서 사용)
    */ 
	public void registerSubsHoliday(List<CgsSubHoliVo> holiList);	
	
	/**
    *  휴가원 증빙자료 팝업 조회
    */
	public CgslappReqInfoVo selectCgsLappEvid(CgslappSchVo vo);	
}
