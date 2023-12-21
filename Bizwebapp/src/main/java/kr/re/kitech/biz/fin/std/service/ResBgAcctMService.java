package kr.re.kitech.biz.fin.std.service;

import java.util.List;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.std.vo.ResBgAcctMVo;

public interface ResBgAcctMService {

	/**
	 * 계정번호관리 - 계정번호(그리드) 다건 조회
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	public List<ResBgAcctMVo> selectResBgAcctMList(ResBgAcctMVo vo) throws ElException;

	/**
	 * 계정번호관리 - 계정번호 단건 등록/수정
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	public ResBgAcctMVo saveResBgAcctM(ResBgAcctMVo vo) throws Exception;

	/**
	 * 계정번호관리 - 단건 삭제
	 * 
	 * @author timothee
	 * @since 2023.09.20.
	 */
	public void deleteResBgAcctM(ResBgAcctMVo vo) throws Exception;
	
	// Mail
	public void stdMailSend(ResBgAcctMVo vo) throws ElException;
}
