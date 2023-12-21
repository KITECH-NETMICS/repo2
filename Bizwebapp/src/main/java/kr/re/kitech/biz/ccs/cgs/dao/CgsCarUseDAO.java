
package kr.re.kitech.biz.ccs.cgs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;



@Repository("cgsCarUseDAO")
public class CgsCarUseDAO extends BizDefaultAbstractDAO {
	
	/*지역조회*/
	public List<CgsCarUseVo> selectListArea() throws ElException {
		List<CgsCarUseVo> result = (List<CgsCarUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListArea"); 
        return result;
    }
	/*차량 조회*/
	public List<CgsCarUseVo> selectListCar(CgsCarUseVo vo) throws ElException {
        return (List<CgsCarUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCar", vo);
    }
    
    /*차량상세*/
    public CgsCarUseVo selectCarAdmin(CgsCarUseVo vo) throws ElException {
        return (CgsCarUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCarAdmin", vo);
    }
	/*배차 조회*/ 
    public List<CgsCarUseVo> selectListCgsCarUse(CgsCarUseVo vo) throws ElException {
        return (List<CgsCarUseVo>)list("kr.re.kitech.biz.ccs.cgs.selectListCgs", vo);
    }
    /*배차신청*/
    public int insertCgsCarUse(CgsCarUseVo vo) throws ElException {
        return insert("kr.re.kitech.biz.ccs.cgs.insertCgs", vo);
    }
    /*배차상세*/
    public CgsCarUseVo selectDetailCgsCarUse(CgsCarUseVo vo) throws ElException {
        return (CgsCarUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectCgs", vo);
    }
    
    /*배차수정*/
    public int updateCgsCarUse(CgsCarUseVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cgs.updateCgs", vo);
    }
    
        /*배차수정*/
    public int deleteCgsCarUse(CgsCarUseVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cgs.deleteCgsCarUse", vo);
    }
    
    /*배차수정*/
    public int updatBiz(CgsCarUseVo vo) throws ElException {
        return update("kr.re.kitech.biz.ccs.cgs.updatBiz", vo);
    }    
    
        /*중복확인*/
    public CgsCarUseVo dupCheckCarUse(CgsCarUseVo vo) throws ElException {
        return (CgsCarUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.dupCheckCarUse", vo);
    }
    
        /*중복확인*/
    public CgsCarUseVo dupCheckCarUse2(CgsCarUseVo vo) throws ElException {
        return (CgsCarUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.dupCheckCarUse2", vo);
    }
    
        /*이메일 조회*/
    public CgsCarUseVo selectReqPsnEmail(CgsCarUseVo vo) throws ElException {
        return (CgsCarUseVo) selectByPk("kr.re.kitech.biz.ccs.cgs.selectReqPsnEmail", vo);
    }
    
}