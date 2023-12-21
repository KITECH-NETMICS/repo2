package kr.re.kitech.biz.api.server.dao;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.com.vo.FspSlipRjctVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * 결의서 사후 처리를 위한 DAO
 * 
 * @author James
 * @since 2023/08/04
 * @version 1.0
 * @see
 * 
 */
@Repository("stdProcessDAO")
public class StdProcessDAO extends BizDefaultAbstractDAO{

	/**
	 *  연구비적정집행모니터링 검색서버 수집을 위해 결재반려시 로그메인테이블 저장
	 * @param fspSlipRjctVo
	 * @return
	 * @throws ElException
	 */
	public boolean insertFspSlipRjct(FspSlipRjctVo fspSlipRjctVo) throws ElException{
		if (0 < insert("kr.re.kitech.biz.apr.bpm.insertFspSlipRjct", fspSlipRjctVo)) {
			return 0 < insert("kr.re.kitech.biz.apr.bpm.insertFspSlipRjctEtc", fspSlipRjctVo);
		}
		return false;
	}
}
