package kr.re.kitech.biz.pat.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.pop.dao.PatPopDAO;
import kr.re.kitech.biz.pat.pop.service.PatPopService;
import kr.re.kitech.biz.pat.pop.vo.PatCodeMastrVo;
import kr.re.kitech.biz.pat.pop.vo.RelatedSmitAppNoVo;
import kr.re.kitech.biz.pat.pop.vo.PatMasterFileSearchPopVo;
import kr.re.kitech.biz.pat.pop.vo.PatOfficeVo;
import kr.re.kitech.biz.pat.pop.vo.PatPopSrcVo;
import kr.re.kitech.biz.pat.pop.vo.PatSmitAppNoVo;
import kr.re.kitech.biz.res.com.vo.XodxCommstVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 지식재산권 팝업 ServiceImpl
 * @Class Name PatPopServiceImpl.java
 * @Description 지식재산권 팝업관련 처리를 담당하는  ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/01/27   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/01/27
 * @version 1
 * @see
 * 
 */
@Service("patPopService")
public class PatPopServiceImpl extends EgovAbstractServiceImpl implements PatPopService {
	@Resource(name="patPopDAO")
	private PatPopDAO dao;
	
	/**
     * 발명신고서 출원번호 조회(검색팝업)
     * @param PatSmitAppNoVo
     * @return List<PatSmitAppNoVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.27.
     */
	public List<PatSmitAppNoVo> selectSmitAppNo(PatSmitAppNoVo vo) throws KitechException{
		return dao.selectSmitAppNo(vo);
	}
	
	/**
     * 발명신고서 특허사무소 조회(검색팝업)
     * @param PatOfficeVo
     * @return List<PatOfficeVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.01.31.
     */
	public List<PatOfficeVo> selectPatOfficeList(PatOfficeVo vo) throws KitechException{
		// 사무소검색, 인원검색
		if(vo.getSrc_clsf().matches("tab1|tab2")){
			return dao.selectPatOfficeList(vo);
		// 랭킹조회 - 출원건수, 등록건수별 조회
		}else if(vo.getSrc_clsf().matches("0|1")){
			return dao.selectPatOfficeScoreList(vo);
			
		}else{ // 서비스 만족도 평균
			return dao.selectPatOfficeScoreList2(vo);
		}		
	}
	
	/**
     * 프로그램 종류 코드 조회
     * @param XodxCommstVo
     * @return List<XodxCommstVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.02.06.
     */
	public List<XodxCommstVo> selectXodxCommstPPC(XodxCommstVo vo) throws KitechException{
		return dao.selectXodxCommstPPC(vo);
	}
	
	/**
     * 출원희망 국가코드 조회 
     * @param 
     * @return List<PatCodeMastrVo>
     * @throws Exception
     * @author LeeYoungHee
     * @since 2023.03.16.
     */
	public List<PatCodeMastrVo> selectPatCodeMastr(PatPopSrcVo vo) throws KitechException{
		return dao.selectPatCodeMastr(vo);
	}
	
     /**
     * 관련 출원번호검색(팝업)
     * @param RelatedSmitAppNoVo
     * @return List<RelatedSmitAppNoVo>
     * @throws KitechException
     * @author Chris
     * @since 2023.10.19.
     */
	public List<RelatedSmitAppNoVo> selectRelatedSmitAppNo(RelatedSmitAppNoVo vo) throws KitechException{
		return dao.selectRelatedSmitAppNo(vo);
	}
	
	/**
	 * 첨부파일 팝업 조회
	 * @param 
	 * @return PatMasterFileSearchPopVo
	 * @throws Exception
	 * @author lsh
	 * @since 2023.10.18.
	 */
	public PatMasterFileSearchPopVo selectPatMasterFileSearch(PatMasterFileSearchPopVo vo) throws KitechException{
		return dao.selectPatMasterFileSearch(vo);
	}
	
	/**
	 * 소연심의_자유발명신고서 파일 조회
	 * @param 
	 * @return PatMasterFileSearchPopVo
	 * @throws Exception
	 * @author lsh
	 * @since 2023.10.18.
	 */
	public PatMasterFileSearchPopVo selectPatAttachFileSearch(PatMasterFileSearchPopVo vo) throws KitechException{
		return dao.selectPatAttachFileSearch(vo);
	}
}
