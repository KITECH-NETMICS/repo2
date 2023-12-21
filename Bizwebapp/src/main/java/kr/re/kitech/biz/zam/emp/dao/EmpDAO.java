package kr.re.kitech.biz.zam.emp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.zam.emp.vo.DeptVo;
import kr.re.kitech.biz.zam.emp.vo.EmpVo;

/**  
 * @ClassSubJect 데모용 사원정보 관련 처리를 담당하는 DAO
 * @Class Name : EmpDAO.java
 * @Description : 데모용 사원정보 관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/01/06   샘플작성자                최초생성
 * 
 * @author 개발팀
 * @since 2022/01/06
 * @version 1.6
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Repository("empDAO")
public class EmpDAO extends BizDefaultAbstractDAO {

    public int insertEmp(EmpVo vo) throws ElException {
        return insert("kr.re.kitech.biz.zam.emp.insertEmp", vo);
    }

    public int updateEmp(EmpVo vo) throws ElException {
        return update("kr.re.kitech.biz.zam.emp.updateEmp", vo);
    }

    public int deleteEmp(EmpVo vo) throws ElException {
    	return delete("kr.re.kitech.biz.zam.emp.deleteEmp", vo);
    }

    public EmpVo selectEmp(EmpVo vo) throws ElException {
 
        return (EmpVo) selectByPk("kr.re.kitech.biz.zam.emp.selectEmp", vo);
    }

    public List<EmpVo> selectListEmp(EmpVo vo) throws ElException {
    	AppLog.debug("DAO 에서 로그 테스트");

        return list("kr.re.kitech.biz.zam.emp.selectListEmp", vo);
    }

    public long selectListCountEmp(EmpVo vo)  throws ElException{
        return (Long)selectByPk("kr.re.kitech.biz.zam.emp.selectListCountEmp", vo);
    }

    public ArrayList<DeptVo> selectListDept(HashMap searchKeyHm) throws ElException {
    	return (ArrayList<DeptVo>)list("kr.re.kitech.biz.zam.emp.selectListDept", searchKeyHm);
    }

}
