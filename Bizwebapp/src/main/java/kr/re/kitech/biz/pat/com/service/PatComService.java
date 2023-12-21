package kr.re.kitech.biz.pat.com.service;

import java.util.List;

import kr.re.kitech.biz.pat.com.vo.PatMastrVo;
import kr.re.kitech.biz.pat.com.vo.PatRightMntVo;
import kr.re.kitech.biz.pat.com.vo.PatToDoVo;
import kr.re.kitech.biz.pat.com.vo.PatTotAcdtHisVo;
import kr.re.kitech.biz.pat.pop.vo.PatCrtMngmtNoVo;

/**
* 지재권 공통작업 Service
* @author LeeYH
* @since 2022.07.20.
*/
public interface PatComService {
	/*
	 * 신규 관리번호 구하기
     */
	public String getMngmtNo(String reqNo, String natCd);
	/*
	 * 발명신고서 결재완료 후 지재권 데이터 생성
     */
	public void createPatMastrPreWrk(String reqNo);
	
	/*
	 * 결재 후 처리 (PatComWFBiz.execute)
     */
	public void executePatComWFBiz(PatToDoVo todoVo) throws Exception;
	
	/*
	 * 결재 후 처리 (PatComWFBiz.execute)
     */
	public void executePatComWFBiz(PatMastrVo rstVo, PatToDoVo todoVo) throws Exception;
	
	/*
	 * 결재 후 처리 (PatComWFBiz.execute)
     */
	public void executePatComWFBiz(List<PatToDoVo> voList) throws Exception;
	
	/*
	 * I07 발명자 변경신청, I08 출원인 변경신청, I09 연구과제변경신청 결재완료시 또는 소연심의 결과 결재완료시 변경정보 지재권등록
     */
	public void saveResSmlRvewDPatReq(String reqNo, String resNo);
	
	/*
	 * I07 발명자 변경신청, I08 출원인 변경신청, I09 연구과제변경신청, I01 발명신고서 결재완료시 소연심의 저장
     */
	public void saveResSmlRvewD(String key1, String key2, String bizClsf, String itemClsf, String rvewObjct, String chrgPsn, String syspayno, String accntNo);
	
	/*
	 * 해외출원등일 경우 관리번호 생성
     */
	public void createPatMstrMngmtNo(PatCrtMngmtNoVo vo);
	
	
   /*
   	* 특허마스터 저장
 	*/
    public void savePatPatMastr(PatMastrVo vo) throws Exception;
	
   /*
    * 권리유지 저장
    */
    public String savePatRightMnt(PatRightMntVo vo) throws Exception;
     
   /*
    * 전체사건내역 저장
    */
    public void savePatTotAcdtHis(PatTotAcdtHisVo vo) throws Exception;
}
