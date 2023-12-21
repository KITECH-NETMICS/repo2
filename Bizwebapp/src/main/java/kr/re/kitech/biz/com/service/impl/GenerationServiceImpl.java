package kr.re.kitech.biz.com.service.impl;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.dao.GenerationDAO;
import kr.re.kitech.biz.com.enums.Numberings;

//import com.inswave.elfw.util.StringUtil;

import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.GenerationParamVo;
import kr.re.kitech.biz.com.vo.GenerationVo;
import kr.re.kitech.biz.com.vo.SptGenroVo;
import kr.re.kitech.biz.fin.std.vo.FbaGenNoVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**  
 * @ClassSubJect 공통채번 관련 처리를 담당하는 MyBatis Impl
 * @Class Name GenerationServiceImpl.java
 * @Description 공통코드  처리를 담당하는 구현체 서비스
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
 @Service("generationServiceImpl")
public class GenerationServiceImpl  extends EgovAbstractServiceImpl implements GenerationService {

    @Resource(name="generationDAO")
    private GenerationDAO generationDAO;

	@Override
	@Transactional
	public GenerationVo getGenVoNumber(GenerationParamVo paramVo) {
		try {
			return this.updateGenerationClsfNumber(this.paramVoToGenerationVo(paramVo));
		} catch ( Exception ex){
			AppLog.error("채번 조회 에러", ex);
			throw new KitechException(Exceptions.ERROR, Business.COM, "일시적인 오류입니다. 잠시 후 다시 시도해주세요.", ex);
		}
	}
	
	
	@Override
	@Transactional
	public String getGenNumber(GenerationParamVo paramVo) {
		try {	
			GenerationVo generationVo  = this.updateGenerationClsfNumber(this.paramVoToGenerationVo(paramVo));
			return generationVo.getGen_no_seq();
		} catch ( Exception ex){
			AppLog.error("채번 생성 에러", ex);
			throw new KitechException(Exceptions.ERROR, Business.COM, "일시적인 오류입니다. 잠시 후 다시 시도해주세요.", ex);
		}
	}	


    private GenerationVo paramVoToGenerationVo( GenerationParamVo paramVo){
    	GenerationVo generationVo = new GenerationVo();
		String prefix = paramVo.getPrefix();
		
		if (Numberings.CTRNO == Numberings.valueOf(paramVo.getNumbering())) {	// 통제번호는 prefix가 필요 없음
			prefix = "CTR";
			// 생성년월일 생성(Sytax: yymmdd)
			Calendar cal = Calendar.getInstance();
			Date now = cal.getTime();
			Timestamp edDateTime = new Timestamp(now.getTime());
			generationVo.setCreat_ymd(edDateTime.toString().substring(2, 10).replace("-", ""));
		}
		
		if (!(3 ==  prefix.length() || 4 == prefix.length())) {
			// 에러처리
			AppLog.error("채번 파라미터 에러:" + prefix);
			throw new KitechException(Exceptions.ERROR, Business.COM, "일시적인 오류입니다. 잠시 후 다시 시도해주세요.");
		}
		
		generationVo.setCd_clsf(paramVo.getNumbering());
		generationVo.setYr(paramVo.getYr());
		generationVo.setMonth(paramVo.getMon());
		generationVo.setSys_clsf(prefix.substring(0, 1));
		generationVo.setRegst_syspayno(paramVo.getRegst_syspayno());
		
		if (3 == prefix.length()) {
			generationVo.setDocu_clsf(prefix.substring(1, 3));
			generationVo.setSlip_typ_cd(prefix.substring(0, 3));
			generationVo.setNo_clsf("C");
		} else if (4 == prefix.length()) {
			generationVo.setDocu_clsf(prefix.substring(1, 4));
		}
		
		return generationVo; 
    }
	
	
	/**
	 * @param generationVo
	 * @return
	 */
	private GenerationVo getGenerationClsfNumber(GenerationVo generationVo) {
		switch (Numberings.valueOf(generationVo.getCd_clsf())) {
		case DOCUMENT:
			generationVo = generationDAO.selectGenerationNumber(generationVo);
			break;
		case SLIP:
			generationVo = generationDAO.selectGenerationSlipNumber(generationVo);
			break;
		case RCMS:
			generationVo = generationDAO.selectGenerationFinNumber(generationVo);
			break;
		case ATTACH:
			generationVo = generationDAO.selectGenerationFileNumber(generationVo);
			break;
		case CTRNO:
			generationVo = generationDAO.selectGenerationCtrNoNumber(generationVo);
			if (null == generationVo.getCreat_odr()) {
				generationVo = null;
			}
			break;
		}

		return generationVo;
	}	
	
	private GenerationVo updateGenerationClsfNumber(GenerationVo generationVo) throws Exception {
		// 조회
		GenerationVo resultVO = new GenerationVo();
		resultVO = getGenerationClsfNumber(generationVo);
		String CtrNoEnd = "";
		
		if (resultVO == null) {	// 채번이 존재 하지 않을 경우
			GenerationVo noVo = (GenerationVo)generationVo.clone();
			int beforeYr = Integer.parseInt(DateUtil.getCurrentDate("yyyy")) -1;
			noVo.setYr(Integer.toString(beforeYr));
			// 전년도 조회
			resultVO = getGenerationClsfNumber(noVo);
			if(resultVO != null) {
				generationVo.setEtc(resultVO.getEtc());
			}
			generationVo.setGenrt_no("00001");
			generationVo.setCreat_odr("00001");
			CtrNoEnd = "001";
			generationVo.setYr(DateUtil.getCurrentDate("yyyy"));
			
			resultVO = generationVo;
		} else {	// 채번이 존재 할 경우
			String sMaxSeq = "";
			if (Numberings.CTRNO == Numberings.valueOf(generationVo.getCd_clsf())){
				sMaxSeq = resultVO.getCreat_odr();
			}else{		
				sMaxSeq = StringUtil.getHexToDec(resultVO.getGenrt_no());
				if("C55".equals(resultVO.getSys_clsf() + resultVO.getDocu_clsf())){
					AppLog.info("--------------- Genrt_no : " + resultVO.getGenrt_no() + ", syspayno =" + KitechContextUtil.getSyspayno());
				}
			}
			
			int nMaxSeq = Integer.parseInt(sMaxSeq);
			char c = '0';
			nMaxSeq++;
			int scope = 5;
			if (Numberings.SLIP == Numberings.valueOf(generationVo.getCd_clsf())) {
				scope = 4;
			}
			
			if (Numberings.CTRNO == Numberings.valueOf(generationVo.getCd_clsf())) {
				resultVO.setNo_clsf("C");
				CtrNoEnd = StringUtil.lPad(StringUtil.getDecToHex(nMaxSeq + ""), 3, c);
			}
			
			resultVO.setCreat_odr(StringUtil.lPad(Integer.toString(nMaxSeq), scope, c));
			resultVO.setGenrt_no(StringUtil.lPad(StringUtil.getDecToHex(nMaxSeq + ""), scope, c));
		}
		
		System.out.println("generationVo:" + generationVo);
		switch (Numberings.valueOf(generationVo.getCd_clsf())) {
		case DOCUMENT:
			// 채번 번호를 생성한다.(시스템 코드(1자리) + 분류코드(2자리:16진수) + 연도(4자리) + 생성번호(5자리)) 12자리 
			if("C55".equals(resultVO.getSys_clsf() + resultVO.getDocu_clsf())){
				AppLog.info("--------------- resultVO : " + resultVO);
			}
			
			generationVo.setGen_no_seq(resultVO.getSys_clsf() + resultVO.getDocu_clsf() + resultVO.getYr() + resultVO.getGenrt_no());
			generationDAO.mergeGenerationNumber(resultVO);
			break;
		case SLIP:
			// 채번 번호를 생성한다.(결의구분(3자리) + + 연도(2자리) + 월(1자리) + 생성번호(4자리)) 10자리
			generationVo.setGen_no_seq(resultVO.getSlip_typ_cd() + resultVO.getYr() + resultVO.getMonth() + resultVO.getGenrt_no());
			generationDAO.mergeGenerationSlipNumber(resultVO);
			break;
		case RCMS:
			resultVO.setReq_no(resultVO.getSys_clsf() + resultVO.getDocu_clsf() + resultVO.getYr() + resultVO.getGenrt_no());
			resultVO.setEtc(resultVO.getSys_clsf() + resultVO.getDocu_clsf());
			// 채번 번호를 생성한다.(시스템 코드(1자리) + 분류코드(2자리:16진수) + 연도(4자리) + 생성번호(5자리)) 12자리
			generationVo.setGen_no_seq(resultVO.getSys_clsf() + resultVO.getDocu_clsf() + resultVO.getYr() + resultVO.getGenrt_no());
			generationDAO.mergeGenerationFinNumber(resultVO);
			break;
		case ATTACH: //file
			// 채번 번호를 생성한다.(시스템 코드(1자리) + 분류코드(3자리:16진수) + 연도(4자리) + 생성번호(5자리)) 13자리
			generationVo.setGen_no_seq(resultVO.getSys_clsf() + resultVO.getDocu_clsf() + resultVO.getYr() + resultVO.getGenrt_no());
			generationVo.setIs_evid(resultVO.isIs_evid());
			generationDAO.mergeGenerationFileNumber(resultVO);
			break;
		case CTRNO: //ctrNO
			// 채번 번호를 생성한다.(시스템 코드(1자리) + 연월일(6자리:yymmdd) + 생성번호(3자리:16진수)) 10자리
			resultVO.setRegst_syspayno(generationVo.getRegst_syspayno());
			resultVO.setCreat_no(resultVO.getNo_clsf() + resultVO.getCreat_ymd() + CtrNoEnd);
			generationVo.setCreat_no(resultVO.getNo_clsf() + resultVO.getCreat_ymd() + CtrNoEnd);
			generationVo.setGen_no_seq(resultVO.getNo_clsf() + resultVO.getCreat_ymd() + CtrNoEnd);
			System.out.println("resultVO:" + resultVO);
			generationDAO.insertGenerationCtrNoNumber(resultVO);
			break;
		}

		return generationVo;
	}
	
	public String getGenNumber(String Numbering) {
		return this.getGenNumber(Numbering, null, null, null);
	}
	
		
	public String getGenNumber(String Numbering, String Prefix) {
		return this.getGenNumber(Numbering, Prefix, null, null);
	}
	


	@Override
	public String getGenNumber(String Numbering, String Prefix, String Yr, String Mon) {
		try {
			GenerationVo generationVo = new GenerationVo();
			String prefix = Prefix;
			if (Numberings.CTRNO == Numberings.valueOf(Numbering)) {	// 통제번호는 prefix가 필요 없음
				prefix = "CTR";
				// 생성년월일 생성(Sytax: yymmdd)
				Calendar cal = Calendar.getInstance();
				Date now = cal.getTime();
				Timestamp edDateTime = new Timestamp(now.getTime());
				generationVo.setCreat_ymd(edDateTime.toString().substring(2, 10).replace("-", ""));
			}
			
			if (!(3 ==  prefix.length() || 4 == prefix.length())) {
				// 에러처리
				AppLog.error("채번 파라미터 에러:" + prefix);
				throw new KitechException(Exceptions.ERROR, Business.COM, "일시적인 오류입니다. 잠시 후 다시 시도해주세요.");
			}
			
			generationVo.setCd_clsf(Numbering);
			generationVo.setYr(Yr);
			generationVo.setMonth(Mon);
			generationVo.setSys_clsf(prefix.substring(0, 1));
			
			if (3 == prefix.length()) {
				generationVo.setDocu_clsf(prefix.substring(1, 3));
				generationVo.setSlip_typ_cd(prefix.substring(0, 3));
				generationVo.setNo_clsf("C");
			} else if (4 == prefix.length()) {
				generationVo.setDocu_clsf(prefix.substring(1, 4));
			}
			generationVo = this.updateGenerationClsfNumber(generationVo);
			return generationVo.getGen_no_seq();
		} catch ( Exception ex){
			AppLog.error("채번 생성 에러", ex);
			throw new KitechException(Exceptions.ERROR, Business.COM, "일시적인 오류입니다. 잠시 후 다시 시도해주세요.", ex);
		}
	}
	
	/**
     * 거래처 코드 생성
     * @param String sysPayNo
     * @return int
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.07.
     */
	public String getVendCode() throws KitechException{
		FbaGenNoVo vo = new FbaGenNoVo();
		// 신규채번
		String creatNo = generationDAO.selectFbaGenNo(vo);		
		vo.setCreat_no(String.valueOf(Integer.parseInt(creatNo) + 1));
		vo.setOld_creat_no(creatNo);
		
		// 신규채번 저장
		generationDAO.updateFbaGenNo(vo);
		
		return vo.getCreat_no();
	}
	
	/**
     * 기업지원 접수번호 생성
     * @param String suptTeam, String suptClsf
     * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.19.
     */
	public String getSuptKolasNo(String suptTeam, String suptClsf, String rstBookIssu) throws KitechException{
		String kolasNo = "";
		switch(suptTeam){
			case "SLC046" : // 호남 KOLAS(교정) 및 측정/분석 공용실험실 , 이상훈씨 요청사항 (교정을 선택시 042로 그외는 041로) - 20140826 최창규
				suptTeam = ("STD030".equals(suptClsf))? "SLC042" : "SLC041";
				break;
			case "SLC040" : 
				if("STD030".equals(suptClsf)) suptTeam = "SLC042"; // 광주 KOLAS길이/역학인증실험실
				break;
			case "SLC020" : 
				if("STC010".equals(rstBookIssu)) suptTeam = "SLC026"; // KOLAS 발급 - 유해물질.화학분석공용실험실
				break;
			case "SLC021" : 
				if(!"STC010".equals(rstBookIssu)) suptTeam = "SLC025"; // 섬유시제품공정실험실
				break;
			case "SLC052" : 
				if(!"STC010".equals(rstBookIssu)) suptTeam = "SLC054"; // 음향진동공용실험실
				break;
			default : break;
		}
		
		SptGenroVo genVo = generationDAO.selectSptGenro(suptTeam);
		
		String curYear = DateUtil.getCurrentDate().substring(2, 4);
		if(!curYear.equals(genVo.getSupt_year())){
			genVo.setSupt_year(StringUtil.lPad(curYear, 2, '0'));
			genVo.setGenrt_no("0001");
		}else{
			genVo.setGenrt_no(StringUtil.lPad(genVo.getGenrt_no(), 4, '0'));
		}
		
		// 접수번호
		kolasNo = genVo.getSupt_clsf() + genVo.getSupt_year() + genVo.getSupt_team_code() + genVo.getGenrt_no();
		if("".equals(kolasNo)){
			throw new KitechException(Exceptions.ERROR, Business.COM, "일시적인 오류입니다. 잠시 후 다시 시도해주세요.");
		}
		
		// 기술지원 접수 번호 채번 저장
		generationDAO.updateSptGenro(genVo);
		
		return kolasNo;
	}
	
	/**
     * 계정번호 생성
     * @param String startYear String accntGrp
     * @return String
     * @throws Exception
	 * @author timothee
	 * @since 2023.09.20.
     */
	public String getResBgAcctMGenNo(String startYear, String accntGrp) throws KitechException{
		Map<String,String> map = new HashMap<>();
		map.put("start_year", startYear);
		map.put("accnt_grp", accntGrp);
		
		map = generationDAO.selectResBgAcctMGenNo(map);
		
		String maxNo = map.get("max_no");
		String mngmtItem1 = map.get("mngmt_item_1");
		// 예) "DM"+"12"(연도)+ "0115"(순번)
		String accntNo = mngmtItem1 + startYear + maxNo;
		
		return accntNo;
	}
}