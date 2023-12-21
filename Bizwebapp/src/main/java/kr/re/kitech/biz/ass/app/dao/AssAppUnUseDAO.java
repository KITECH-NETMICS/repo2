package kr.re.kitech.biz.ass.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.ass.app.vo.AssMastrBVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseChkVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseSrcVo;
import kr.re.kitech.biz.ass.app.vo.AssUnUseVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 자산 불용신청 
 * @Class Name : AssAppUnUseDAO.java
 * @Description : 자산 불용신청 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/25   이영희                  최초생성
 * 
 * @author LeeYh
 * @since 2023/07/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("assAppUnUseDAO")
public class AssAppUnUseDAO extends BizDefaultAbstractDAO{
	 /**
     * 자산불용신청 조회를 한다.
     * @param vo 자산불용 AssUnUseVo
     * @return 자산불용  List<AssUnUseVo>
     * @throws Exception
     */
	
	@SuppressWarnings("unchecked")
	public List<AssUnUseVo> selectAssUnUseList(String reqNo) throws KitechException{
		return list("kr.re.kitech.biz.ass.app.selectAssUnUseList", reqNo);
	}
	
	 /**
     * 자산불용신청 목록조회를 한다.
     * @param vo 자산불용 AssUnUseVo
     * @return 자산불용  List<AssUnUseVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AssUnUseVo> selectListAssUnUseList(AssUnUseSrcVo vo) throws KitechException {      	
        return list("kr.re.kitech.biz.ass.app.selectListAssUnUseList", vo);
    }
    
    @SuppressWarnings("unchecked")
	public List<AssMastrBVo> selectAssUnUseCList(AssMastrBVo vo) throws KitechException{
		return list("kr.re.kitech.biz.ass.app.selectAssUnUseCList", vo);
	}
	
	/**
     * 불용자산 신청을 등록한다.
     * @param vo 불용자산 CgslappVo
     * @return 
     * @throws Exception
     */
    public int insertAssUnUse(AssUnUseVo vo) throws KitechException {    	
        return insert("kr.re.kitech.biz.ass.app.insertAssUnUse", vo);
    }
    
     /**
     * 불용신청중인 자료가 있는지 확인.
     * @param asetNo 자산불용 AssUnUseVo
     * @return 불용자산
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public AssUnUseChkVo selectAssUnuseChk(String asetNo) throws KitechException {      	
        return (AssUnUseChkVo) selectByPk("kr.re.kitech.biz.ass.app.selectAssUnuseChk", asetNo);
    }
    
     /**
     * 불용신청 수정을 위해 기존 데이터 삭제.
     * @param reqNo 
     * @return 
     * @return 자산불용  List<AssUnUseVo>
     * @throws Exception
     */

	public int deleteAssUnUse(String reqNo) throws KitechException {
		return delete("kr.re.kitech.biz.ass.app.deleteAssUnUse", reqNo);
	}
	
	
	 /**
     * 자산불용신청 상세보기 조회를 한다.
     * @param vo 자산불용 상세보기 AssUnUseDetailVo
     * @return 자산불용 상세보기  AssUnUseDetailVo
     * @throws Exception
     */
	public AssUnUseDetailVo selectAssUnUseDtl(AssUnUseDetailVo vo)  throws KitechException {
		return (AssUnUseDetailVo) selectByPk("kr.re.kitech.biz.ass.app.selectAssUnUseDtl", vo);
	}

	public int updateAsetUnUseDtl(AssUnUseDetailVo vo) throws KitechException {
		
		return update("kr.re.kitech.biz.ass.app.updateAssUnUseDetail", vo);
	}
	
	/**
	 * 신청구분 수정 (불용 -> 환원)
	 * @param vo AssUnUseVo
	 * @return int
	 * @throws Exception
	 */
	public int updateRstrt(AssUnUseVo vo) throws KitechException {
		
		return update("kr.re.kitech.biz.ass.app.updateRstrt", vo);
	}

}
