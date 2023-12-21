package kr.re.kitech.biz.fin.fnd.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.fin.fnd.vo.FinRcptPaySlipVo;
import kr.re.kitech.biz.fin.fnd.vo.PaySlipSrcVo;
import kr.re.kitech.biz.fin.std.vo.FbaApartAccntVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 출금결의생성 
 * @ClassName  FinRcptPaySlipDAO.java
 * @Description 출금결의생성 DAO
 * @Modification :   
 *     수정일           수정자     수정내용
 *  ----------- ------- ---------
 *  2023.09.14.  이영희       최초생성
 * 
 * @author 
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Repository("finRcptPaySlipDAO")
public class FinRcptPaySlipDAO extends BizDefaultAbstractDAO {
	
	/**
     * 출금결의생성 목록 조회
     * @param PaySlipSrcVo
     * @return List<FinRcptPaySlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinRcptPaySlipVo> selectFinRcptPaySlipList(PaySlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.fnd.selectFinRcptPaySlipList", vo);
	}
	
	/**
     * 출금조회 목록 조회
     * @param PaySlipSrcVo
     * @return List<FinRcptPaySlipVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<FinRcptPaySlipVo> selectFinRcptPaySendList(PaySlipSrcVo vo) throws KitechException{
		return list("kr.re.kitech.biz.fin.fnd.selectFinRcptPaySendList", vo);
	}
	
	/**
     * 개인지급일 경우 계좌번호 조회
     * @param String sysPayNo
     * @return FbaApartAccntVo
     * @throws Exception
     */
	public FbaApartAccntVo selectFbaApartAccnt(String sysPayNo) throws KitechException{
		return (FbaApartAccntVo)selectByPk("kr.re.kitech.biz.fin.fnd.selectFbaApartAccnt", sysPayNo);
	}
	
	/**
     * 송금내역 계좌정보 업데이트
     * @param FinRcptPaySlipVo
     * @return int
     * @throws Exception
     */
	public int updateFspSendReqBank(FinRcptPaySlipVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.fnd.updateFspSendReqBank", vo);
	}
	
	/**
     * 송금내역 지급구분 업데이트
     * @param FinRcptPaySlipVo
     * @return int
     * @throws Exception
     */
	public int updateFspSendReqPayClsf(FinRcptPaySlipVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.fnd.updateFspSendReqPayClsf", vo);
	}
	
	/**
     * 지급결의취소시 송금내역 업데이트
     * @param String payUnslipNo
     * @return int
     * @throws Exception
     */
	public int updateFspSendReqDel(String payUnslipNo) throws KitechException{
		return update("kr.re.kitech.biz.fin.fnd.updateFspSendReqDel", payUnslipNo);
	}
	
	/**
     * 출금결의생성 대변 회계코드 조회
     * @param String bankAccntNo
     * @return String AccntCd
     * @throws Exception
     */
	public String selectPaySlipAccntCd(String bankAccntNo) throws KitechException{
		return (String)selectByPk("kr.re.kitech.biz.fin.fnd.selectPaySlipAccntCd", bankAccntNo);
	}
	
	/**
     * 출금결의생성후 지급결의번호 업데이트
     * @param FinRcptPaySlipVo
     * @return int
     * @throws Exception
     */
	public int updateSendReqPayUnslipNo(FinRcptPaySlipVo vo) throws KitechException{
		return update("kr.re.kitech.biz.fin.fnd.updateSendReqPayUnslipNo", vo);
	}
	
	/**
     * 출금결의생성 중복생성여부 체크
     * @param FinRcptPaySlipVo
     * @return int
     * @throws Exception
     */
	public int selectDupPaySlipCrtCnt(FinRcptPaySlipVo vo) throws KitechException{
		return (int)selectByPk("kr.re.kitech.biz.fin.fnd.selectDupPaySlipCrtCnt", vo);
	}
}
