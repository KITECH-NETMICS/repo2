package kr.re.kitech.biz.epu.mail.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.epu.mail.vo.BidMailSendVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;

/**
 * @ClassSubJect 구매조달 메일발송 DAO
 * @Class Name EpuMailSendDAO.java
 * @Description 구매조달 메일발송 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/19      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/07/19
 * @version 1.0
 * @see
 * 
 */
@Repository("epuMailSendDAO")
public class EpuMailSendDAO extends BizDefaultAbstractDAO {
	/**
     * 발주계획 결재완료 후 메일발송을 위한 조회
     * @param BidMailSendVo
     * @return BidMailSendVo
     * @throws Exception
     */
	public BidMailSendVo selectEpuOrdMastrForMail(BidMailSendVo vo) throws ElException{
		return (BidMailSendVo)selectByPk("kr.re.kitech.biz.epu.mail.selectEpuOrdMastrForMail", vo);
	}
	
	/**
     * 발주계획 결재완료(P82) 후 메일발송을 위한 수신자 조회
     * @param BidMailSendVo
     * @return List<BidMailSendVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<BidMailSendVo> selectEpuOrdMastrForMail2(BidMailSendVo vo) throws ElException{
		return (List<BidMailSendVo>)list("kr.re.kitech.biz.epu.mail.selectEpuOrdMastrForMail2", vo);
	}
	
	/**
     * 발주계획 결재완료 후 메일발송을 위한 수신자 조회(P82)
     * @param BidMailSendVo
     * @return BidMailSendVo
     * @throws Exception
     */
	public BidMailSendVo selectEpuOrdMastrForMailCont(BidMailSendVo vo) throws ElException{
		return (BidMailSendVo)selectByPk("kr.re.kitech.biz.epu.mail.selectEpuOrdMastrForMailCont", vo);
	}
	
	/**
     * 입찰공고 메일발송 후 메일발송여부 Y 업데이트
     * @param BidMailSendVo
     * @return int
     * @throws Exception
     */
	public int updateEpuNotiMastrMailSendYn(BidMailSendVo vo) throws ElException{
		return update("kr.re.kitech.biz.epu.mail.updateEpuNotiMastrMailSendYn", vo);
	}
	
	/**
     * 발주계획 메일발송 후 메일발송여부 Y 업데이트
     * @param BidMailSendVo
     * @return int
     * @throws Exception
     */
	public int updateEpuOrdMastrAprMailSendYn(BidMailSendVo vo) throws ElException{
		return update("kr.re.kitech.biz.epu.mail.updateEpuOrdMastrAprMailSendYn", vo);
	}
}
