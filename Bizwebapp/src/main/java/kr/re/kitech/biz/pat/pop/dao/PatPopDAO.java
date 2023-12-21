package kr.re.kitech.biz.pat.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.pat.pop.vo.PatCodeMastrVo;
import kr.re.kitech.biz.pat.pop.vo.PatOfficeVo;
import kr.re.kitech.biz.pat.pop.vo.PatPopSrcVo;
import kr.re.kitech.biz.pat.pop.vo.PatSmitAppNoVo;
import kr.re.kitech.biz.pat.pop.vo.RelatedSmitAppNoVo;
import kr.re.kitech.biz.pat.pop.vo.PatMasterFileSearchPopVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 지식재산권 팝업 DAO
 * @Class Name PatPopDAO.java
 * @Description 지식재산권 팝업관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/26   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/01/26
 * @version 1
 * @see
 * 
 */
@Repository("patPopDAO")
public class PatPopDAO extends BizDefaultAbstractDAO {
	/**
     * 발명신고서 출원번호 조회(검색팝업)
     * @param PatSmitAppNoVo
     * @return List<PatSmitAppNoVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatSmitAppNoVo> selectSmitAppNo(PatSmitAppNoVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.pop.selectSmitAppNo", vo);
	}
	
	/**
     * 발명신고서 특허사무소 조회(검색팝업)
     * @param PatOfficeVo
     * @return List<PatOfficeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatOfficeVo> selectPatOfficeList(PatOfficeVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.pop.selectPatOfficeList", vo);
	}
	
	/**
     * 특허사무소 검색팝업(랭킹조회 탭) 조회 (출원건수, 등록건수별)
     * @param PatOfficeVo
     * @return List<PatOfficeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatOfficeVo> selectPatOfficeScoreList(PatOfficeVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.pop.selectPatOfficeScoreList", vo);
	}
	
	/**
     * 특허사무소 검색팝업(랭킹조회 탭) 조회 (서비스 만족도 평균)
     * @param PatOfficeVo
     * @return List<PatOfficeVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatOfficeVo> selectPatOfficeScoreList2(PatOfficeVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.pop.selectPatOfficeScoreList2", vo);
	}
	
	/**
     * 프로그램 종류 코드 조회
     * @param XodxCommstVo
     * @return List<XodxCommstVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<XodxCommstVo> selectXodxCommstPPC(XodxCommstVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.pop.selectXodxCommstPPC", vo);
	}
	
	/**
     * 출원희망 국가코드 조회 
     * @param 
     * @return List<PatCodeMastrVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<PatCodeMastrVo> selectPatCodeMastr(PatPopSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.pat.pop.selectPatCodeMastr", vo);
	}

     /**
     * 관련 출원번호검색(팝업)
     * @param RelatedSmitAppNoVo
     * @return List<RelatedSmitAppNoVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<RelatedSmitAppNoVo> selectRelatedSmitAppNo(RelatedSmitAppNoVo vo) throws KitechException{
		String flag = vo.getFlag();
		String sqlId = "selectRelatedSmitAppNo";
		if("prdChng".equals(flag)) sqlId = "selectRelatedSmitAppNoPrdChng";
		return list("kr.re.kitech.biz.pat.pop." + sqlId, vo);
	}
	
    /**
     * 첨부파일 팝업 조회
     * 
     * @author lsh
     * @param PatMasterFileSearchPopVo
     * @return PatMasterFileSearchPopVo
     * @throws KitechException
     * @since 2023.10.18.   
     */
    public PatMasterFileSearchPopVo selectPatMasterFileSearch(PatMasterFileSearchPopVo vo) throws KitechException {
      return (PatMasterFileSearchPopVo) selectByPk("kr.re.kitech.biz.pat.pop.selectPatMasterFileSearch", vo);
    }
    	
    /**
     * 소연심의_자유발명신고서 파일 조회
     * 
     * @author lsh
     * @param PatMasterFileSearchPopVo
     * @return PatMasterFileSearchPopVo
     * @throws KitechException
     * @since 2023.10.18.   
     */
    public PatMasterFileSearchPopVo selectPatAttachFileSearch(PatMasterFileSearchPopVo vo) throws KitechException {
  	  return (PatMasterFileSearchPopVo) selectByPk("kr.re.kitech.biz.pat.pop.selectPatAttachFileSearch", vo);
    }
}
