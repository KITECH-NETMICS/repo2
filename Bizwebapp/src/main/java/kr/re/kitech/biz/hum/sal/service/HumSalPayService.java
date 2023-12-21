/**
 * 
 */
package kr.re.kitech.biz.hum.sal.service;

import java.util.List;

import kr.re.kitech.biz.hum.sal.vo.HumSalPayListVo;
import kr.re.kitech.biz.hum.sal.vo.HumSalPayVo;

/**
 * @author mklee
 *
 */
public interface HumSalPayService {
		
	/*
	 * 급여내역 기본정보조회
	 */
	public HumSalPayListVo selectHumslallow(HumSalPayVo vo); 
	

	/*
	 * 급여지급내역
	 */
	public List<HumSalPayVo> selectHumSlmmPayMonList(HumSalPayVo vo);
	
	/*
	 * 급여총괄표
	 */
	public HumSalPayListVo selectHumSlmmPayTotList(HumSalPayVo vo);
	
}
