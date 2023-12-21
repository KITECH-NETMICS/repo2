package kr.re.kitech.biz.pat.pop.service;

import java.util.List;

import kr.re.kitech.biz.pat.pop.vo.PatCodeMastrVo;
import kr.re.kitech.biz.pat.pop.vo.RelatedSmitAppNoVo;
import kr.re.kitech.biz.pat.pop.vo.PatMasterFileSearchPopVo;
import kr.re.kitech.biz.pat.pop.vo.PatOfficeVo;
import kr.re.kitech.biz.pat.pop.vo.PatPopSrcVo;
import kr.re.kitech.biz.pat.pop.vo.PatSmitAppNoVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;

public interface PatPopService {
	/*
     * 발명신고서 출원번호 조회(검색팝업)
     */
	public List<PatSmitAppNoVo> selectSmitAppNo(PatSmitAppNoVo vo);
	
	/*
     * 발명신고서 특허사무소 조회(검색팝업)
     */
	public List<PatOfficeVo> selectPatOfficeList(PatOfficeVo vo);
	/*
     * 프로그램 종류 코드 조회
     */
	public List<XodxCommstVo> selectXodxCommstPPC(XodxCommstVo vo);
	/*
     * 출원희망 국가코드 조회 
     */
	public List<PatCodeMastrVo> selectPatCodeMastr(PatPopSrcVo vo);
	
     /*
     * 관련 출원번호검색(팝업)
     */
	public List<RelatedSmitAppNoVo> selectRelatedSmitAppNo(RelatedSmitAppNoVo vo);
	
	/*
	 * 첨부파일 팝업 조회
	 */
	public PatMasterFileSearchPopVo selectPatMasterFileSearch(PatMasterFileSearchPopVo vo);
	
	/*
	 * 소연심의_자유발명신고서 파일 조회
	 */
	public PatMasterFileSearchPopVo selectPatAttachFileSearch(PatMasterFileSearchPopVo vo);
}
