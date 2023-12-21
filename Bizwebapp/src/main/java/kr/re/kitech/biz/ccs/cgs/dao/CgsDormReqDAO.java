
package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo;
import kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;



@Repository("cgsDormReqDAO")
public class CgsDormReqDAO extends BizDefaultAbstractDAO {

	@Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
	/*기숙사신청조회*/
	public List<CgsDormReqVo> selectListCgsDormReq(CgsDormReqVo cgsDormReqVo) throws ElException {
		List<CgsDormReqVo> result = (List<CgsDormReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsDormReq", cgsDormReqVo); 
        return result;
    }

	/*휴무일신청리스트조회*/
	public List<CgsDormReqVo> selectListHoliday(CgsDormReqVo cgsDormReqVo) throws ElException {
		List<CgsDormReqVo> result = (List<CgsDormReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListHoliday", cgsDormReqVo); 
        return result;
    }
	
	/*휴일조회*/
    public CgsDormReqVo selectHoliyday(CgsDormReqVo cgsDormReqVo) throws ElException {
        return (CgsDormReqVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectHoliday", cgsDormReqVo);
    }
    
    /*지역기숙사조회*/
	public List<CgsDormVo> selectListCgsDorm(CgsDormVo cgsDormVo) throws ElException {
		List<CgsDormVo> result = (List<CgsDormVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsDorm", cgsDormVo); 
        return result;
    }
    
    /*기숙사조회*/
	public List<CgsDormVo> selectListCgsDormNo(CgsDormVo cgsDormVo) throws ElException {
		List<CgsDormVo> result = (List<CgsDormVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsDormNo", cgsDormVo); 
        return result;
    }
    
    /*승인날짜목록조회*/
	public List<CgsDormReqVo> selectListCgsDormApprovDate(CgsDormReqVo cgsDormReqVo) throws ElException {
		List<CgsDormReqVo> result = (List<CgsDormReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgsDormApprovDate", cgsDormReqVo); 
        return result;
    }

	/*직급조회*/
	public List<CgsDormReqVo> selectListPosi() throws ElException {
		List<CgsDormReqVo> result = (List<CgsDormReqVo>)list("kr.re.kitech.biz.ccs.cgs.selectListPosi"); 
        return result;
    }
	
	 /*기숙사신청*/
    public int insertCgsDorm(CgsDormReqVo cgsDormReqVo) throws ElException {
   
        return insert("kr.re.kitech.biz.ccs.cgs.insertCgsDorm", cgsDormReqVo);
    }
    
    /*기숙사신청대기*/
    public int insertCgsDormStand(CgsDormReqVo cgsDormReqVo) throws ElException {
    
        return insert("kr.re.kitech.biz.ccs.cgs.insertCgsDormStand", cgsDormReqVo);
    }
    
    /*기숙사신청삭제*/
    public int deleteCgsDorm(CgsDormReqVo cgsDormReqVo) throws ElException {
    
        return update("kr.re.kitech.biz.ccs.cgs.deleteCgsDorm", cgsDormReqVo);
    }
    
    /*기숙사신청조회*/
    public CgsDormReqVo selectDormReq(String req_no) throws ElException {
        return (CgsDormReqVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectDormReq", req_no);
    }
    
}