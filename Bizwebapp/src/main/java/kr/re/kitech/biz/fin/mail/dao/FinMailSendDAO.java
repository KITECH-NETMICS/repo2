package kr.re.kitech.biz.fin.mail.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.fin.mail.vo.FinBillEmailSendVo;
import kr.re.kitech.biz.fin.mail.vo.SmlItmCheckMailVo;
import kr.re.kitech.biz.fin.tax.vo.FinPurTaxSrcVo;
import kr.re.kitech.biz.fin.tax.vo.FinTaxSearchVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @ClassSubJect 재무관리 메일발송 DAO
 * @Class Name FinMailSendDAO.java
 * @Description 재무관리 메일발송 DAO
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/04      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/04
 * @version 1.0
 * @see
 * 
 */
@Repository("finMailSendDAO")
public class FinMailSendDAO extends BizDefaultAbstractDAO {
	/**
     * 소액물품 검수결의 결재완료 후 메일발송을 위한 조회 
     * @param String unslipNo
     * @return FspSmlItmCheckupHVo
     * @throws Exception
     */
	public SmlItmCheckMailVo selectFspSmlItmCheckupHMail(String unslipNo) throws ElException{
		return (SmlItmCheckMailVo)selectByPk("kr.re.kitech.biz.fin.mail.selectFspSmlItmCheckupHMail", unslipNo);
	}
	
	/**
     * 매출계산서(관) 미처리이메일전송을 위한 조회
     * @param FinTaxSearchVo
     * @return List<FinBillEmailSendVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FinBillEmailSendVo> selectFtxBillForEmail(FinTaxSearchVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.mail.selectFtxBillForEmail", vo);
    }
    
    /**
     * 매입계산서(관) 미처리이메일전송을 위한 조회
     * @param FinPurTaxSrcVo
     * @return List<FinBillEmailSendVo>
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	public List<FinBillEmailSendVo> selectKtxBillForEmail(FinPurTaxSrcVo vo) throws KitechException{
    	return list("kr.re.kitech.biz.fin.mail.selectKtxBillForEmail", vo);
    }
}
