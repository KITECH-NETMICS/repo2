package kr.re.kitech.biz.fin.std.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

@Repository("resBgAcctMDAO")
public class ResBgAcctMDAO extends BizDefaultAbstractDAO {

	/**
	 * 계정번호(그리드) 다건 조회
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	@SuppressWarnings("unchecked")
	public List<ResBgAcctMVo> selectResBgAcctMList(ResBgAcctMVo vo) throws ElException {
		return (List<ResBgAcctMVo>) list("kr.re.kitech.biz.fin.std.selectResBgAcctMList", vo);
	}

	/**
	 * 계정번호 단건 등록
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	public int insertResBgAcctM(ResBgAcctMVo vo) throws ElException {
		return insert("kr.re.kitech.biz.fin.std.insertResBgAcctM", vo);
	}

	/**
	 * 계정번호 단건 수정
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	public int updateResBgAcctM(ResBgAcctMVo vo) throws ElException {
		return update("kr.re.kitech.biz.fin.std.updateResBgAcctM", vo);
	}

	/**
	 * 계정번호 단건 삭제
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	public void deleteResBgAcctM(ResBgAcctMVo vo) throws ElException {
		delete("kr.re.kitech.biz.fin.std.deleteResBgAcctM", vo);
	}

	/**
	 * 계정번호 관리항목 조회
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	@SuppressWarnings("unchecked")
	public Map<String, String> selectResBgAcctMCd(ResBgAcctMVo vo) throws ElException{
		return (Map<String, String>)selectByPk("kr.re.kitech.biz.fin.std.selectResBgAcctMCd", vo);
	}
}
