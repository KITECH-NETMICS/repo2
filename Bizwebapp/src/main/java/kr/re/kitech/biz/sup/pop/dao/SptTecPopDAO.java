package kr.re.kitech.biz.sup.pop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 외부기술지원 팝업 DAO
 * @Class Name SptTecPopDAO.java
 * @Description 외부기술지원 팝업  관련 처리를 담당하는 DAO
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/03   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/07/03
 * @version 1
 * @see
 * 
 */
@Repository("sptTecPopDAO")
public class SptTecPopDAO extends BizDefaultAbstractDAO{
	/**
     * 카드처리내역 팝업 조회(외부기술지원(유상))
     * @param SptTranTableVo
     * @return List<SptTranTableVo>
     * @throws Exception
     */
	@SuppressWarnings("unchecked")
	public List<SptTranTableVo> selectSptTranTable(SptTranTableVo vo) throws KitechException{
		return list("kr.re.kitech.biz.sup.pop.selectSptTranTable", vo);
	}
	
	/**
     * SMS결제 팝업 조회
     * @param SptTecSrcVo
     * @return EasyPayInfoVo
     * @throws Exception
     */
	public EasyPayInfoVo selectEasyPayInfoPop(SptTecSrcVo vo) throws KitechException{
		return (EasyPayInfoVo)selectByPk("kr.re.kitech.biz.sup.pop.selectEasyPayInfoPop", vo);
	}
}
