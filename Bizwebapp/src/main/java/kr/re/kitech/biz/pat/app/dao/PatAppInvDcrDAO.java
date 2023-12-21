package kr.re.kitech.biz.pat.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.pat.app.vo.PatAppMastrVo;
import kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo;
import kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo;
import kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo;
import kr.re.kitech.biz.pat.app.vo.PatDftInvDcrListVo;
import kr.re.kitech.biz.pat.app.vo.PatInvntBookVo;
import kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 발명신고서 DAO
 * @Class Name PatAppInvDcrDAO.java
 * @Description 발명신고서 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/11/9   박영훈             최초생성
 * 
 * @author 박영훈
 * @since 2022/11/9
 * @version 1
 * @see
 * 
 */
@Repository("patAppInvDcrDAO")
public class PatAppInvDcrDAO extends BizDefaultAbstractDAO {
	/**
     * 발명신고서 목록 조회
     * @param PatDftInvDcrListVo
     * @return List<PatDftInvDcrListVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PatDftInvDcrListVo> selectPatAppMastrList(PatDftInvDcrListVo vo) throws KitechException {          
        return list("kr.re.kitech.biz.pat.app.selectPatAppMastrList", vo);
    }

    /**
     * 발명신고서 상세 조회
     * @param String
     * @return PatAppMastrVo
     * @throws Exception
     */
    public PatAppMastrVo selectPatAppMastr(String reqNo) throws KitechException {
        return (PatAppMastrVo) selectByPk("kr.re.kitech.biz.pat.app.selectPatAppMastr", reqNo);
    }
    
    /**
     * 공통발명자 조회
     * @param String
     * @return List<PatCoinvntPsnVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PatCoinvntPsnVo> selectPatAppCoInvntPsnList(String reqNo) throws KitechException {          
        return list("kr.re.kitech.biz.pat.app.selectPatAppCoInvntPsnList", reqNo);
    }    
        
     /**
     * 공통출원업체조회
     * @param String
     * @return 공통출원업체  List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PatCoSmitappVendVo> selectPatAppCoSmitAppVend(String reqNo) throws KitechException {          
        return list("kr.re.kitech.biz.pat.app.selectPatAppCoSmitAppVend", reqNo);
    }
    
     /**
     * 발명신고서 관련과제 조회
     * @param vo 관련과제 ComWorkVo
     * @return 관련과제  List
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PatRelatReschPrjVo> selectPatAppRelatReschPrjList(String reqNo) throws KitechException {          
        return list("kr.re.kitech.biz.pat.app.selectPatAppRelatReschPrjList", reqNo);
    }
    
    /**
     * 디자인첨부파일 목록 조회
     * @param PatAttachaMastrVo
     * @return List<PatAttachaMastrVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<PatAttachaMastrVo> selectPatAttachmMastrList(PatAttachaMastrVo vo) throws KitechException {          
        return list("kr.re.kitech.biz.pat.app.selectPatAttachmMastrList", vo);
    }
    
    /**
     * 발명신고서 상표 조회
     * @param String
     * @return PatInvntBookVo
     * @throws Exception
     */
    public PatInvntBookVo selectPatAppTmInvntBook(String reqNo) throws KitechException{
    	return (PatInvntBookVo)selectByPk("kr.re.kitech.biz.pat.app.selectPatAppTmInvntBook", reqNo);
    }
    
    /**
     * 발명신고서 디자인 조회
     * @param String
     * @return PatInvntBookVo
     * @throws Exception
     */
    public PatInvntBookVo selectPatAppDesnInvntBook(String reqNo) throws KitechException{
    	return (PatInvntBookVo)selectByPk("kr.re.kitech.biz.pat.app.selectPatAppDesnInvntBook", reqNo);
    }
    
    /**
     * 발명신고서 프로그램 조회
     * @param String
     * @return PatInvntBookVo
     * @throws Exception
     */
    public PatInvntBookVo selectPatAppPgmInvntBook(String reqNo) throws KitechException{
    	return (PatInvntBookVo)selectByPk("kr.re.kitech.biz.pat.app.selectPatAppPgmInvntBook", reqNo);
    }
        
    /**
     * 발명신고서 마스터 저장
     * @param PatAppMastrVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppMastr(PatAppMastrVo vo) throws KitechException {        
        return insert("kr.re.kitech.biz.pat.app.insertPatAppMastr", vo);
    } 
    
    /**
     * 발명신고서 마스터 수정
     * @param PatAppMastrVo
     * @return int
     * @throws Exception
     */
    public int updatePatAppMastr(PatAppMastrVo vo) throws KitechException{
    	return update("kr.re.kitech.biz.pat.app.updatePatAppMastr", vo);
    }
    
    /**
     * 발명신고서 상표, 디자인, 프로그램 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePatAppInvntBook(String reqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.pat.app.deletePatAppInvntBook", reqNo);
    }
    
     /**
     * 발명신고서 상표 저장
     * @param PatInvntBookVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppTmInvntBook(PatInvntBookVo vo) throws KitechException {        
        return insert("kr.re.kitech.biz.pat.app.insertPatAppTmInvntBook", vo);
    } 
    
    /**
     * 발명신고서 디자인 저장
     * @param PatInvntBookVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppDesnInvntBook(PatInvntBookVo vo) throws KitechException {        
        return insert("kr.re.kitech.biz.pat.app.insertPatAppDesnInvntBook", vo);
    } 
    
    /**
     * 발명신고서 디자인 첨부파일 저장
     * @param PatAttachaMastrVo
     * @return int
     * @throws Exception
     */
    public int insertPatAttachMastr(PatAttachaMastrVo vo) throws KitechException {        
        return insert("kr.re.kitech.biz.pat.app.insertPatAttachMastr", vo);
    } 
    
    /**
     * 발명신고서 프로그램 저장
     * @param PatInvntBookVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppPgmInvntBook(PatInvntBookVo vo) throws KitechException {        
        return insert("kr.re.kitech.biz.pat.app.insertPatAppPgmInvntBook", vo);
    } 
    
    /**
     * 발명신고서 직무발명자, 출원인, 관련연구과제 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePatAppCoInvnt(String reqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.pat.app.deletePatAppCoInvnt", reqNo);
    }
    
    /**
     * 발명신고서 직무발명자 저장
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppCoInvntPsn(PatCoinvntPsnVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.pat.app.insertPatAppCoInvntPsn", vo);
    }
    
    /**
     * 발명신고서 출원인 저장
     * @param PatCoSmitappVendVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppCoSmitAppVend(PatCoSmitappVendVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.pat.app.insertPatAppCoSmitAppVend", vo);
    }
    
    /**
     * 발명신고서 관련연구과제 저장
     * @param PatRelatReschPrjVo
     * @return int
     * @throws Exception
     */
    public int insertPatAppRelatRecchPrj(PatRelatReschPrjVo vo) throws KitechException{
    	return insert("kr.re.kitech.biz.pat.app.insertPatAppRelatRecchPrj", vo);
    }
    
    /**
     * 발명신고서 양도인 승인 또는 반려
     * @param PatCoinvntPsnVo
     * @return int
     * @throws Exception
     */
	public int updatePatAppCoInvntPsnApr(PatCoinvntPsnVo vo) throws KitechException{
		return update("kr.re.kitech.biz.pat.app.updatePatAppCoInvntPsnApr", vo);
	}
	
	/**
     * 발명신고서 마스터 삭제
     * @param String
     * @return int
     * @throws Exception
     */
    public int deletePatAppMastr(String reqNo) throws KitechException{
    	return delete("kr.re.kitech.biz.pat.app.deletePatAppMastr", reqNo);
    }
}