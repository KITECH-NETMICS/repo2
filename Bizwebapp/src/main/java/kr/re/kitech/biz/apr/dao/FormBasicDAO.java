package kr.re.kitech.biz.apr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.apr.vo.AppFormVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;


/**  
 * @ClassSubJect 결재 
 * @Class Name : FormBasicDAO.java
 * @Description : 신청서양식함 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/06/09   박병목                최초생성
 * 
 * @author ParkBM
 * @since 2022/06/09
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("formBasicDAO")
public class FormBasicDAO extends BizDefaultAbstractDAO {
	/**
     * 신청서양식함 목록조회를 한다.
     * @param vo 신청서양식함을검색 AppFormVo
     * @return 신청서양식함목록  List<AppFormVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<AppFormVo> selectAppForm(AppFormVo vo) throws ElException {
        return list("kr.re.kitech.biz.apr.selectAppForm", vo);
    }
    
    /**
     * 신청서양식명 단건을 조회 한다.
     * @param vo 신청서양식함을검색 AppFormVo
     * @return 신청서양식명 AppFormVo
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public AppFormVo getAppForm(AppFormVo vo) throws ElException {
        return (AppFormVo) selectByPk("kr.re.kitech.biz.apr.getAppForm", vo);
    }
}
