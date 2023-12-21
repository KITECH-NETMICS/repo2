package kr.re.kitech.biz.sup.tec.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.sup.tec.dao.SupTecRstBookDAO;
import kr.re.kitech.biz.sup.tec.service.SupTecRstBookService;
import kr.re.kitech.biz.sup.tec.vo.SptRstBookVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 기술지원 시험성적서
 * @Class Name SupTecRstBookServiceImpl.java
 * @Description 기술지원 시험성적서 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/05/30   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/05/30
 * @version 1
 * @see
 * 
 */
@Service("supTecRstBookService")
public class SupTecRstBookServiceImpl extends EgovAbstractServiceImpl implements SupTecRstBookService {
	@Resource(name="supTecRstBookDAO")
	private SupTecRstBookDAO dao;
	
	/**
     * 성적서 계산서 발행정보 저장
     * @param SptRstBookVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.05.30.
     */
	@Override
	public void saveBillIssuInfo(SptRstBookVo vo) throws KitechException{
		// 01. 시험성적서 계산서 정보 업데이트
		dao.updateSptRstBook(vo);
		
		// 02. 성적서 계산서 발행시 발행업체와 기술지원요청 업체가 다를 경우 계산서 발행업체 저장
		dao.updateSptTecBillIssuInfo(vo);
	}

}
