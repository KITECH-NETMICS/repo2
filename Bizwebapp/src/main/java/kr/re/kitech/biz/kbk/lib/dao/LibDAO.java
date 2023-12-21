package kr.re.kitech.biz.kbk.lib.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.kbk.lib.vo.LibCopyVo;
import kr.re.kitech.biz.kbk.lib.vo.LibLoanVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

@Repository("libDAO")
public class LibDAO extends BizDefaultAbstractDAO {
	
	public List<LibCopyVo> selectCopyList(LibCopyVo vo) throws KitechException {
        return list("kr.re.kitech.biz.kbk.lib.selectCopyList", vo);
    }
    
	public List<LibLoanVo> selectLoanList(LibLoanVo vo) throws KitechException {
        return list("kr.re.kitech.biz.kbk.lib.selectLoanList", vo);
    }
    
	public List<LibLoanVo> selectReservList(LibLoanVo vo) throws KitechException {
        return list("kr.re.kitech.biz.kbk.lib.selectReservList", vo);
    }
    
	public void updateReserv(LibLoanVo vo) throws KitechException {
        update("kr.re.kitech.biz.kbk.lib.updateReserv", vo);
    }
    
}