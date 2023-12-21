package kr.re.kitech.biz.com.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.com.vo.GenerationVo;
import kr.re.kitech.biz.com.vo.SptGenroVo;
import kr.re.kitech.biz.fin.std.vo.FbaGenNoVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**  
 * @ClassSubJect 채번 관련 처리를 담당하는 DAO
 * @Class Name GenerationDAO.java
 * @Description 채번 관련 처리를 담당하는 DAO
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
@Repository("generationDAO")
public class GenerationDAO extends BizDefaultAbstractDAO {
    
    /**
     * 채번을 등록한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public int mergeGenerationNumber(GenerationVo vo) throws ElException {
        return update("kr.re.kitech.biz.com.mergeGenerationNumber", vo);
    }
    
    /**
     * 채번을 조회한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public GenerationVo selectGenerationNumber(GenerationVo vo) throws ElException {
        return (GenerationVo) selectByPk("kr.re.kitech.biz.com.selectGenerationNumber", vo);
    }
    
    /**
     * 첨부파일 채번을 등록한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public int mergeGenerationFileNumber(GenerationVo vo) throws ElException {
        return update("kr.re.kitech.biz.com.mergeGenerationFileNumber", vo);
    }
    
    /**
     * 첨부파일 채번을 조회한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public GenerationVo selectGenerationFileNumber(GenerationVo vo) throws ElException {
        return (GenerationVo) selectByPk("kr.re.kitech.biz.com.selectGenerationFileNumber", vo);
    }
    
    /**
     * 재무 채번을 등록한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public int mergeGenerationFinNumber(GenerationVo vo) throws ElException {
        return update("kr.re.kitech.biz.com.mergeGenerationFinNumber", vo);
    }
    
    /**
     * 재무 채번을 조회한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public GenerationVo selectGenerationFinNumber(GenerationVo vo) throws ElException {
        return (GenerationVo) selectByPk("kr.re.kitech.biz.com.selectGenerationFinNumber", vo);
    }
    
    /**
     * 결의번호 채번을 등록한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public int mergeGenerationSlipNumber(GenerationVo vo) throws ElException {
        return update("kr.re.kitech.biz.com.mergeGenerationSlipNumber", vo);
    }
    
    /**
     * 결의번호 채번을 조회한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public GenerationVo selectGenerationSlipNumber(GenerationVo vo) throws ElException {
//    	GenerationVo retVo = null;
//    	if(vo.getSlip_typ_cd().matches("110|113|117")){
//    		retVo = (GenerationVo)selectByPk("kr.re.kitech.biz.com.selectGenerationSlipNumber", vo);
//    	}else{
//    		retVo = (GenerationVo)selectByPk("kr.re.kitech.biz.com.selectGenerationSlipNumber2", vo);
//    	}
        return (GenerationVo)selectByPk("kr.re.kitech.biz.com.selectGenerationSlipNumber", vo);
    }
    
    /**
     * 통제번호 채번을 등록한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public int insertGenerationCtrNoNumber(GenerationVo vo) throws ElException {
        return insert("kr.re.kitech.biz.com.insertGenerationCtrNoNumber", vo);
    }
    
    /**
     * 통제번호 채번을 조회한다.
     * @param vo 공통채번 GenerationVo
     * @throws Exception
     */
    public GenerationVo selectGenerationCtrNoNumber(GenerationVo vo) throws ElException {
        return (GenerationVo) selectByPk("kr.re.kitech.biz.com.selectGenerationCtrNoNumber", vo);
    }
    
    /**
     * 거래처 코드 채번
     * @param FbaGenNoVo
     * @return String
     * @throws Exception
     */
	public String selectFbaGenNo(FbaGenNoVo vo) throws ElException{
		return (String)selectByPk("kr.re.kitech.biz.com.selectFbaGenNo", vo);
	}
	
	/**
     * 거래처 신규채번 저장
     * @param FbaGenNoVo
     * @return int
     * @throws Exception
     */
	public int updateFbaGenNo(FbaGenNoVo vo) throws ElException{
		return update("kr.re.kitech.biz.com.updateFbaGenNo", vo);
	}
	
	/**
     * 기술지원 접수 번호 생성 조회
     * @param String suptTeam
     * @return SptGenroVo
     * @throws Exception
     */
	public SptGenroVo selectSptGenro(String suptTeam) throws ElException{
		return (SptGenroVo)selectByPk("kr.re.kitech.biz.com.selectSptGenro", suptTeam);
	}
	
	/**
     * 기술지원 접수 번호 채번 저장
     * @param SptGenroVo
     * @return int
     * @throws Exception
     */
	public int updateSptGenro(SptGenroVo vo) throws ElException{
		return update("kr.re.kitech.biz.com.updateSptGenro", vo);
	}
	
	/**
	 * 계정번호 채번을 위한 조회
	 * @author timothee
	 * @since 2023.09.20.
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> selectResBgAcctMGenNo(Map<String, String> map) throws ElException {
		return (Map<String, String>) selectByPk("kr.re.kitech.biz.com.selectResBgAcctMGenNo", map);
	}
}
