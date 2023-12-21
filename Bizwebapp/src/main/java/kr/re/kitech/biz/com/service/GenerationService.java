package kr.re.kitech.biz.com.service;

import kr.re.kitech.biz.com.vo.GenerationParamVo;
import kr.re.kitech.biz.com.vo.GenerationVo;

/**  
 * @ClassSubJect 공통코드 관련 처리를 담당하는 인터페이스
 * @Class Name : GenerationService.java
 * @Description : 공통코드 관련 처리를 담당하는 인터페이스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/02/15   박병목             최초생성
 * 
 * @author 박병목
 * @since 2022/02/15
 * @version 1.0
 * @see
 * 
 */
public interface GenerationService {
	
	/**
	 * 채번조회
	 * @param GenerationVo 공통채번 generationParamVo
	 * @param String 채번구분값
	 * @throws Exception
	 */
	public GenerationVo getGenVoNumber(GenerationParamVo generationParamVo);
	
	/**
	 * 채번증가
	 * @param GenerationVo 공통채번 generationParamVo
	 * @param String 채번구분값
	 * @throws Exception
	 */
	public String getGenNumber(GenerationParamVo generationParamVo);
	
	/**
	 * 채번증가
	 * @param String Numbering, String Prefix, String Yr, String Mon
	 * @param String 채번구분값
	 * @throws Exception
	 */
	public String getGenNumber(String Numbering, String Prefix, String Yr, String Mon);
		
	public String getGenNumber(String Numbering, String Prefix);
	public String getGenNumber(String Numbering);
	/*
	* 거래처 코드 채번
	*/
	public String getVendCode();
	/*
	* 기업지원 접수번호 채번
	*/
	public String getSuptKolasNo(String suptTeam, String suptClsf, String rstBookIssu);
	/*
	* 계정번호 생성
	*/
	public String getResBgAcctMGenNo(String startYmd, String accntGrp);
}
