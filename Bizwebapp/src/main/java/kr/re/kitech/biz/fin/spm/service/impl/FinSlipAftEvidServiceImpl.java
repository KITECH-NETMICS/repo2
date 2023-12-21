package kr.re.kitech.biz.fin.spm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.fin.spm.dao.FinSlipAftEvidDAO;
import kr.re.kitech.biz.fin.spm.service.FinSlipAftEvidService;
import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidListVo;
import kr.re.kitech.biz.fin.spm.vo.FinSlipAftEvidVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;



/**
 * @ClassSubJect 
 * @ClassName : FinSlipAftEvidServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.07.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.07.
 * @version 1.0
 * @see
 * 
 */
@Service("finSlipAftEvidServiceImpl")
public class FinSlipAftEvidServiceImpl  extends EgovAbstractServiceImpl implements FinSlipAftEvidService {
  @Resource(name="finSlipAftEvidDAO")
  private FinSlipAftEvidDAO finDAO;
  
   /**
    * 모든 컬럼 조회
    * 
    * @author 
    * @param 
    * @return List<FspSlipDecsnHVo>
    * @throws KitechException
    * @since 2023.09.07.   
    */
	@Override
	public List<FinSlipAftEvidListVo> selectSlipAftEvidInfoList(FinSlipAftEvidVo finVo) {
		return finDAO.selectSlipAftEvidInfoList(finVo);
	}
	
	/**
     * 모든 컬럼 조회
     * 
     * @author 
     * @param 
     * @return List<FspSlipDecsnHVo>
     * @throws KitechException
     * @since 2023.09.12.   
     */
	@Override
	public FinSlipAftEvidListVo updateSlipAftEvidInfo(FinSlipAftEvidVo finVo) {
		FinSlipAftEvidListVo retVo = new FinSlipAftEvidListVo();
		
		// 확정 결의 헤더테이블 첨부파일 번호 저장
		finDAO.updateSlipAftEvidInfo(finVo);
		
		// 사후증빙 생성
		String slip_no = finVo.getSlip_no();
		finVo.setRqst_no(slip_no);
		finDAO.insertDelSlipAftEvid(finVo);
		finDAO.createSlipAftEvid(finVo);
		
		return retVo;
	}
}
