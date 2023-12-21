package kr.re.kitech.biz.res.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsReqVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsThreeFiveVo;
import kr.re.kitech.biz.res.app.vo.ResAppBugtVo;
import kr.re.kitech.biz.res.app.vo.ResAppMastVo;
import kr.re.kitech.biz.res.app.vo.ResAppPareVo;
import kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo;
import kr.re.kitech.biz.res.app.vo.ResAppSrcVo;
import kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo;
import kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;
/**  
 * @ClassSubJect 사업신청 
 * @Class Name : ResAppBsnsAppDAO.java
 * @Description : 사업신청 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/12/10   홍성민                최초생성
 * 
 * @author 홍성민
 * @since 2022/12/10
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("resBsnsAplyReqDAO")
public class ResBsnsAplyReqDAO extends BizDefaultAbstractDAO {
	/**
     * 사업신청목록(사용자화면)을 조회한다.
     * @param ResAppSrcVo
     * @return List<ResAppBsnsReqVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResAppBsnsReqVo> selectBsnsAppUserList(ResAppSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectBsnsAppUserList", vo);
	}
	
	/**
     * 사업신청 디테일 조회
     * @param String
     * @return ResAppBsnsAppDetailVo
     * @throws KitechException
     */
	public ResAppMastVo selectResAppMast(String bsnsReqNo) throws KitechException {
		return (ResAppMastVo)selectByPk("kr.re.kitech.biz.res.app.selectResAppMast", bsnsReqNo);
	}
	
	/**
     * 사업신청 연구비 조회
     * @param ResAppSrcVo
     * @return List<ResAppBugtVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResAppBugtVo> selectResAppBugt(ResAppSrcVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectResAppBugt", vo);
	}
	
	/**
     * 연구원구분 조회
     * @param ResAppSrcVo
     * @return List<ResAppBsnsReqVo>
     * @throws KitechException
     */
	public String selectUserAuthorInfo(ResAppSrcVo vo) throws KitechException {
		return (String)selectByPk("kr.re.kitech.biz.res.app.selectUserAuthorInfo", vo);
	}
	
	/**
     * 사업신청 간접비 비율 조회
     * @param ResBsnsReqEtcVo
     * @return ResAppIndrcRtVo
     * @throws KitechException
     */
	public ResBsnsReqEtcVo selectAppIndrc(ResBsnsReqEtcVo vo) throws KitechException {
		return (ResBsnsReqEtcVo)selectByPk("kr.re.kitech.biz.res.app.selectAppIndrc", vo);
	}
	
	/**
	 * 사전 사업 내역 조회
	 * @param ResAppSrcVo
     * @return ResAppPrePrjDetailListVo
	 * @throws Exception 모든 예외를 던진다.
	 */
	@SuppressWarnings("unchecked")
	public List<ResAppPrePrjVo> selectResAppPrePrjList(ResAppPrePrjVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectResAppPrePrjList", vo);
	}
	
	/**
	 * 참여연구원 사전등록 목록 및 마스터 조회
	 * @param ResAppSrcVo
     * @return ResAppPrePrjDetailListVo
	 * @throws Exception 모든 예외를 던진다.
	 */
	@SuppressWarnings("unchecked")
	public List<ResPareMngmtMstrVo> selectResPareMngmtMstrList(ResPareMngmtMstrVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectResPareMngmtMstrList", vo);
	}
	
	/**
	 * 참여연구원 사전등록 조회
	 * @param ResAppSrcVo
     * @return ResAppPrePrjDetailListVo
	 * @throws Exception 모든 예외를 던진다.
	 */
	@SuppressWarnings("unchecked")
	public List<ResAppPareVo> selectResPareMngmtList(ResPareMngmtMstrVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectResPareMngmtList", vo);
	}	
	
	/**
	 * 사업신청 참여연구원 조회
	 * @param ResPareMngmtMstrVo
     * @return List<ResAppAttncePsnVo>
	 * @throws Exception 모든 예외를 던진다.
	 */
	@SuppressWarnings("unchecked")
	public List<ResAppPareVo> selectResAppPareList(ResPareMngmtMstrVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectResAppPareList", vo);
	}
	
	@SuppressWarnings("unchecked")
	public List<ResAppBsnsThreeFiveVo> selectBsnsAplyThreeFive(ResAppBsnsThreeFiveVo vo) throws KitechException {
		return list("kr.re.kitech.biz.res.app.selectBsnsAplyThreeFive", vo);
	}
	
	/**
     * 사업신청목록(관리자화면)을 조회한다.
     * @param ResAppSrcVo
     * @return List<ResAppBsnsReqVo>
     * @throws KitechException
     */
	@SuppressWarnings("unchecked")
	public List<ResAppBsnsReqVo> selectBsnsAppList(ResAppSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.res.app.selectBsnsAppList", vo);
	}
	
	/**
     * 사업신청 마스터 저장
     * @param ResAppMastVo
     * @return int
     * @throws KitechException
     */
	public int insertResAppMast(ResAppMastVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.res.app.insertResAppMast", vo);
	}
	
	/**
     * 사업조정회의  사업신청번호 업데이트
     * @param ResAppBsnsAdjstVo
     * @return int
     * @throws KitechException
     */
	public int updateResAppBsnsAdjst(ResAppBsnsAdjstVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResAppBsnsAdjst", vo);
	}
	
	/**
     * 수행과제 보안등급 분류 및 심사기준 입력
     * @param ResAppMastVo
     * @return int
     * @throws KitechException
     */
	public int insertResAppSecurity(ResAppMastVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.res.app.insertResAppSecurity", vo);
	}
	
	/**
     * 참여연구원 사전등록 수정
     * @param ResPareMngmtMstrVo
     * @return int
     * @throws KitechException
     */
	public int updateResPareMngmtMstr(ResPareMngmtMstrVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResPareMngmtMstr", vo);
	}
	
	/**
     * 사업신청 마스터 수정
     * @param ResAppMastVo
     * @return int
     * @throws KitechException
     */
	public int updateResAppMast(ResAppMastVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResAppMast", vo);
	}
	
	/**
     * 수행과제 보안등급 분류 및 심사기준 수정
     * @param ResAppMastVo
     * @return int
     * @throws KitechException
     */
	public int updateResAppSecurity(ResAppMastVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResAppSecurity", vo);
	}
	
	/**
     * 선행연구과제 삭제
     * @param String
     * @return int
     * @throws KitechException
     */
	public int deleteResAppPrePrj(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.res.app.deleteResAppPrePrj", reqNo);
	}
	
	/**
     * 선행연구과제 입력
     * @param ResAppPrePrjVo
     * @return int
     * @throws KitechException
     */
	public int insertResAppPrePrj(ResAppPrePrjVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.res.app.insertResAppPrePrj", vo);
	}
	
	/**
     * 참여연구원 삭제
     * @param String
     * @return int
     * @throws KitechException
     */
	public int deleteResAppPare(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.res.app.deleteResAppPare", reqNo);
	}
	
	/**
     * 참여연구원 저장
     * @param ResAppPareVo
     * @return int
     * @throws KitechException
     */
	public int insertResAppPare(ResAppPareVo vo) throws KitechException{
		return insert("kr.re.kitech.biz.res.app.insertResAppPare", vo);
	}
	
	/**
     * 사업신청 연구비 저장
     * @param ResAppBugtVo
     * @return int
     * @throws KitechException
     */
	public int mergeResAppBugt(ResAppBugtVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.mergeResAppBugt", vo);
	}
	
	/**
     * 연구장비통합관리 삭제
     * @param String
     * @return int
     * @throws KitechException
     */
	public int deleteResEquipFeeMgt(String reqNo) throws KitechException{
		return delete("kr.re.kitech.biz.ass.eqip.deleteResEquipFeeMgt", reqNo);
	}
	
	/**
     * 연구장비통합관리 저장
     * @param ResEquipLimitAmtVo
     * @return int
     * @throws KitechException
     */
	public int mergeResEquipFeeMgt(ResEquipLimitAmtVo vo) throws KitechException{
		return update("kr.re.kitech.biz.ass.eqip.mergeResEquipFeeMgt", vo);
	}
	
	/**
     * 사업선정결과 저장
     * @param ResAppMastVo
     * @return int
     * @throws KitechException
     */
	public int updateResAppMastSeltRst(ResAppMastVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResAppMastSeltRst", vo);
	}
	
	/**
     * 선정과제 이메일 발송 후 메일발송여부(선정시) 수정
     * @param String
     * @return int
     * @throws KitechException
     */
	public int updateResAppMastMailSend(String reqNo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResAppMastMailSend", reqNo);
	}
	
	/**
     * 사업신청 마스터,연구비,수행과제 보안등급 분류 및 심사기준 삭제
     * @param String
     * @return int
     * @throws KitechException
     */
	public int deleteResBsnsReq(String bsnsReqNo) throws KitechException{
		return delete("kr.re.kitech.biz.res.app.deleteResBsnsReq", bsnsReqNo);
	}
	
	/**
     * 참여연구원사전등록테이블 수정(사업신청번호 빈값처리)
     * @param ResAppSrcVo
     * @return int
     * @throws KitechException
     */
	public int updateResPareMngmtMstrDel(ResAppSrcVo vo) throws KitechException{
		return update("kr.re.kitech.biz.res.app.updateResPareMngmtMstrDel", vo);
	}
}
