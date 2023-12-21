/**
 * 
 */
package kr.re.kitech.biz.hum.sal.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.re.kitech.biz.hum.sal.vo.HumSalPayVo;
import kr.re.kitech.biz.xom.base.dao.BizDefaultAbstractDAO;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * @author LeeYH-PC
 *
 */
 @Repository("humSalPayDAO")
public class HumSalPayDAO extends BizDefaultAbstractDAO {
	
	
	/**
    * 급여내역 마감 정보조회
    * @param HumSalPayVo"
    * @return HumSalPayVo
    * @author mklee
    */	
	public HumSalPayVo selectHumSalYrMonClose(HumSalPayVo vo) throws KitechException{
		return (HumSalPayVo)selectByPk("kr.re.kitech.biz.hum.sal.selectHumSalYrMonClose", vo);
	}
	
	/**
    * 급여내역 기본정보조회
    * @param HumSalPayVo"
    * @return HumSalPayVo
    * @author mklee
    */	
	public HumSalPayVo selectHumslallow(HumSalPayVo vo) throws KitechException{
		return (HumSalPayVo)selectByPk("kr.re.kitech.biz.hum.sal.selectHumslallow", vo);
	}
	
	/**
    * 급여 수당내역 조회
    * @param HumSalPayVo"
    * @return List<HumSalPayVo">
    * @author mklee
    */
	@SuppressWarnings("unchecked")
	public List<HumSalPayVo> selectHumSlmmPayCd(HumSalPayVo vo) throws KitechException{
		return list("kr.re.kitech.biz.hum.sal.selectHumSlmmPayCd", vo);
	}
	
	/**
    * 급여 수당 공제내역 조회
    * @param HumSalPayVo
    * @return List<HumSalPayVo
    * @author mklee
    */
	@SuppressWarnings("unchecked")
	public List<HumSalPayVo> selectHumSlmmDeductPayCd(HumSalPayVo vo) throws KitechException{
		return list("kr.re.kitech.biz.hum.sal.selectHumSlmmDeductPayCd", vo);
	}  
	
	/**
    * 급여정산 상세내역 조회
    * @param HumSalPayVo
    * @return HumSalPayVo
    * @author mklee
    */	
	public HumSalPayVo selectHumSlmmPayAmt(HumSalPayVo vo) throws KitechException{
		return (HumSalPayVo)selectByPk("kr.re.kitech.biz.hum.sal.selectHumSlmmPayAmt", vo);
	}
	
	/**
    * 급여 지급내역
    * @param HumSalPayVo
    * @return List<HumSalPayVo
    * @author mklee
    */
	@SuppressWarnings("unchecked")
	public List<HumSalPayVo> selectHumSlmmPayMonList(HumSalPayVo vo) throws KitechException{
		return list("kr.re.kitech.biz.hum.sal.selectHumSlmmPayMonList", vo);
	}
	
	/**
    * 급여 총괄표 수당정보
    * @param HumSalPayVo
    * @return List<HumSalPayVo
    * @author mklee
    */
	@SuppressWarnings("unchecked")
	public List<HumSalPayVo> selectHumSlMmPayTotListCd(HumSalPayVo vo) throws KitechException{
		return list("kr.re.kitech.biz.hum.sal.selectHumSlMmPayTotListCd", vo);
	}
	
	/**
    * 급여 총괄표 공제정보
    * @param HumSalPayVo
    * @return List<HumSalPayVo
    * @author mklee
    */
	@SuppressWarnings("unchecked")
	public List<HumSalPayVo> selectHumSlmmDeductPayTotLilstCd(HumSalPayVo vo) throws KitechException{
		return list("kr.re.kitech.biz.hum.sal.selectHumSlmmDeductPayTotLilstCd", vo);
	}  
	
	/**
    * 급여총괄표 급여합계 조회
    * @param HumSalPayVo
    * @return HumSalPayVo
    * @author mklee
    */	
	public HumSalPayVo selectHumSlMmPayTotAmt(HumSalPayVo vo) throws KitechException{
		return (HumSalPayVo)selectByPk("kr.re.kitech.biz.hum.sal.selectHumSlMmPayTotAmt", vo);
	}
}
