/**
 * 
 */
package kr.re.kitech.biz.hum.sal.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.hum.sal.dao.HumSalPayDAO;
import kr.re.kitech.biz.hum.sal.service.HumSalPayService;
import kr.re.kitech.biz.hum.sal.vo.HumSalPayListVo;
import kr.re.kitech.biz.hum.sal.vo.HumSalPayVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 급여관련 서비스
 * @Class Name : 급여관련 서비스.java
 * @Description : 급여관련 서비스 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/12/09   이민기                최초생성
 * 
 * @author mklee
 * @since 2023/12/09
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Service("humSalPayService")
public class HumSalPayServiceImpl extends EgovAbstractServiceImpl implements HumSalPayService {	
	
	@Resource(name="humSalPayDAO")
	private HumSalPayDAO humSalPayDao;
			
	
	/**
    * 급여내역 기본정보조회
    * @param HumSalPayVo
    * @return HumSalPayVo
    * @author mklee
    */
	public HumSalPayListVo selectHumslallow(HumSalPayVo vo) throws KitechException{
				
		HumSalPayListVo resultVO = new HumSalPayListVo();		
		
		//급여마감정보 조회
		vo.setFr_ymd(vo.getBelng_yrmon());
		vo.setTo_ymd(vo.getBelng_yrmon());
		HumSalPayVo humSalPayVo=  humSalPayDao.selectHumSalYrMonClose(vo);
		
		if(humSalPayVo.getCnt() > 0){
			throw new KitechException(Exceptions.ERROR, Business.HUM, "message.xom.co.com.0007", new String[]{"마감된 해당월 급여"});
		}		
		
		humSalPayVo=  humSalPayDao.selectHumslallow(vo);  		//급여기본정보
		List<HumSalPayVo>  humSalPayVoList =  humSalPayDao.selectHumSlmmPayCd(vo);  		//급여수당정보
		List<HumSalPayVo>  humSalPayDctList =  humSalPayDao.selectHumSlmmDeductPayCd(vo);	//급여공제정보
		HumSalPayVo  humSalPayAmtDtlList =  humSalPayDao.selectHumSlmmPayAmt(vo);	//급여정산정보
		resultVO.setHumSalPayVo(humSalPayVo);	  
		resultVO.setHumSalPayVoList(humSalPayVoList);
		resultVO.setHumSalPayDdtVo(humSalPayDctList);
		resultVO.setHumSalPayAmtDtlVo(humSalPayAmtDtlList);
		return resultVO;
	}	
	
	/**
    * 급여 지급내역
    * @param HumSalPayVo
    * @return List<HumSalPayVo>
    * @author mklee
    */
	public List<HumSalPayVo> selectHumSlmmPayMonList(HumSalPayVo vo) throws KitechException{
		return humSalPayDao.selectHumSlmmPayMonList(vo);
	}
	
	/**
    * 급여 총괄표
    * @param HumSalPayVo
    * @return HumSalPayListVo
    * @author mklee
    */
	public HumSalPayListVo selectHumSlmmPayTotList(HumSalPayVo vo) throws KitechException{
		HumSalPayListVo resultVO = new HumSalPayListVo();		
		
		//급여마감정보 조회
		HumSalPayVo humSalPayVo=  humSalPayDao.selectHumSalYrMonClose(vo);
		
		if(humSalPayVo.getCnt() > 0){
			throw new KitechException(Exceptions.ERROR, Business.HUM, "message.xom.co.com.0007", new String[]{"마감된 해당월 급여"});
		}		
		
		humSalPayVo=  humSalPayDao.selectHumSlMmPayTotAmt(vo);  		//기본정보
		List<HumSalPayVo>  humSalPayVoList =  humSalPayDao.selectHumSlMmPayTotListCd(vo);  		//수당정보
		List<HumSalPayVo>  humSalPayDctList =  humSalPayDao.selectHumSlmmDeductPayTotLilstCd(vo);	//공제정보
		
		resultVO.setHumSalPayVo(humSalPayVo);	  
		resultVO.setHumSalPayVoList(humSalPayVoList);
		resultVO.setHumSalPayDdtVo(humSalPayDctList);
		
		return resultVO;
	}
	
}
