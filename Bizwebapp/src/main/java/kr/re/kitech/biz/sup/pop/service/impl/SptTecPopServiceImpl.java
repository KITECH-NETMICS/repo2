package kr.re.kitech.biz.sup.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.sup.pop.dao.SptTecPopDAO;
import kr.re.kitech.biz.sup.pop.service.SptTecPopService;
import kr.re.kitech.biz.sup.pop.vo.EasyPayInfoVo;
import kr.re.kitech.biz.sup.pop.vo.SptTranTableVo;
import kr.re.kitech.biz.sup.tec.vo.SptTecSrcVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 외부기술지원 팝업
 * @Class Name SptTecPopServiceImpl.java
 * @Description 외부기술지원 팝업 관련 처리를 담당하는 ServiceImpl
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
@Service("sptTecPopService")
public class SptTecPopServiceImpl extends EgovAbstractServiceImpl implements SptTecPopService {
	
	@Resource(name="sptTecPopDAO")
	private SptTecPopDAO dao;
	
	/**
     * 카드처리내역 팝업 조회(외부기술지원(유상))
     * @param SptTranTableVo
     * @return List<SptTranTableVo>
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.03.
     */
	@Override
	public List<SptTranTableVo> selectSptTranTable(SptTranTableVo vo) throws KitechException {
		return dao.selectSptTranTable(vo);
	}
	
	/**
     * SMS결제 팝업 조회
     * @param SptTecSrcVo
     * @return EasyPayInfoVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.06.
     */
	public EasyPayInfoVo selectEasyPayInfoPop(SptTecSrcVo vo) throws KitechException{
		return dao.selectEasyPayInfoPop(vo);
	}
}
