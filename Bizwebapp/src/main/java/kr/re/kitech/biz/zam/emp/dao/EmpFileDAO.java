package kr.re.kitech.biz.zam.emp.dao;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.zam.emp.vo.EmpVo;

import com.inswave.elfw.exception.ElException;

/**  
 * @ClassSubJect 데모용 사원정보의 파일 관련 처리를 담당하는 DAO
 * @Class Name : EmpFileDAO.java
 * @Description : 데모용 사원정보의 파일 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/01/06   샘플작성자                최초생성
 * 
 * @author 개발팀
 * @since 2022/01/06
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("empFileDAO")
public class EmpFileDAO extends BizDefaultAbstractDAO {

    public int insertEmpFile(EmpVo vo) throws ElException {    	
        return insert("kr.re.kitech.biz.zam.emp.insertEmpFile", vo);
    }

    public int updateEmpFile(EmpVo vo) throws ElException {
        return update("kr.re.kitech.biz.zam.emp.updateEmpFile", vo);
    }

    public int deleteEmpFile(EmpVo vo) throws ElException {
        return delete("kr.re.kitech.biz.zam.emp.deleteEmpFile", vo);
    }

    public EmpVo selectEmpFile(EmpVo vo) throws ElException {
        return (EmpVo) selectByPk("kr.re.kitech.biz.zam.emp.selectEmpFile", vo);
    }

}
