/**
 * 
 */
package kr.re.kitech.biz.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.com.dao.ExceptDAO;
import kr.re.kitech.biz.com.enums.ExceptKind;
import kr.re.kitech.biz.com.service.ExceptService;
import kr.re.kitech.biz.com.vo.ExceptItemListVo;
import kr.re.kitech.biz.com.vo.ExceptItemVo;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * 사람 예외 처리 구현 클래스
 * @author James
 * @since 2023. 4. 6.
 */
@Service("exceptService") 
public class ExceptServiceImpl extends EgovAbstractServiceImpl implements ExceptService {

	@Resource(name="exceptDAO")
	private ExceptDAO exceptDao;
	
	
	private final String ROWSTATUS_INSERT = "C";
	private final String ROWSTATUS_UPDATE = "U";
	private final String ROWSTATUS_DELETE = "D";

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.com.service.ExceptService#isExcept(kr.re.kitech.biz.com.vo.ExceptItemVo)
	 */
	@Override
	public boolean isExcept(ExceptItemVo exceptItemVo) {
		boolean isExcept = false;
		try {
			isExcept = (0 < exceptDao.getExceptTargetCount(exceptItemVo));
		} catch (Exception ex) {
			AppLog.error("예외처리카운트 조회시 오류 발생!", ex);
		}
		
		return isExcept;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.com.service.ExceptService#isExcept(kr.re.kitech.biz.com.enums.ExceptKind, java.lang.String, java.lang.Boolean)
	 */
	@Override
	public boolean isExcept(ExceptKind kind, String serviceid, String value, Boolean isAllow){

		ExceptItemVo exceptItemVo = new ExceptItemVo();
		
		// 코드 파라미터 설정
		exceptItemVo.setKind_cd(kind.getCode());
		// exceptItemVo.setValue_cd(ExceptValue.HUMAN.getCode());
		
		// 매핑 파라미터 설정
		exceptItemVo.setService_id(serviceid);
		exceptItemVo.setValue(value);
		
		// 예외 허용 | 금지 파라미터 설정 
		exceptItemVo.setAllow_yn(isAllow ? "Y" : "N");
		
		return this.isExcept(exceptItemVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.com.service.ExceptService#isExcept(kr.re.kitech.biz.com.enums.ExceptKind, java.lang.String)
	 */
	@Override
	public boolean isExcept(ExceptKind kind, String serviceid, String value) {
		// 예외 처리 허용 요청이 금지보다 많다(?)
		return this.isExcept(kind, serviceid, value, true);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.com.service.ExceptService#getExceptValues(kr.re.kitech.biz.com.vo.ExceptItemVo)
	 */
	@Override
	public List<String> getExceptValues(ExceptItemVo exceptItemVo) {
		try {
			return exceptDao.getExceptValues(exceptItemVo);
		} catch (Exception ex) {
			AppLog.error("ExceptServiceImpl.getExceptValues() 조회 오류", ex);
			return new ArrayList<String>();
		}
	}
	/*
	@Override
	public List<String> getExceptValues(ExceptKind kind, String serviceid) {
		ExceptItemVo exceptItemVo = new ExceptItemVo();
		
		// 코드 파라미터 설정
		exceptItemVo.setKind_cd(kind.getCode());
		
		// 매핑 파라미터 설정
		exceptItemVo.setService_id(serviceid);
		
		// 예외 허용 | 금지 파라미터 설정 
		exceptItemVo.setAllow_yn("Y");		
		return exceptDao.getExceptValues(exceptItemVo);

	}*/
	
	@Override
	public ExceptItemListVo selectExceptItemList(ExceptItemVo exceptVo) {
		ExceptItemListVo retVo = new ExceptItemListVo();
		try {
			retVo.setExceptItemVoList(exceptDao.selectExceptItemList(exceptVo));
		} catch (Exception e) {
			AppLog.error("ExceptServiceImpl.selectExceptItemList() 조회 오류", e);
			return new ExceptItemListVo();
		}
		return retVo;
	}
	
	@Override
	public int saveExceptItemList(ExceptItemListVo exceptVo) throws Exception {
		int transRows = 0;
		try {
			for (ExceptItemVo vo : exceptVo.getExceptItemVoList()) {
				vo.setRegst_syspayno(KitechContextUtil.getSyspayno());
				
				transRows += this.saveExceptItem(vo);
			}
		} catch (Exception e) {
			throw e;		
		}
		
		
		return transRows;
	}
	
	private int saveExceptItem(ExceptItemVo vo) throws Exception {
		int transRows = 0;
		String rowStatus = vo.getRowStatus();
		try {
			AppLog.debug(rowStatus);
			if (StringUtils.equals(rowStatus, ROWSTATUS_INSERT)) {
				exceptDao.insertExceptItem(vo);
			} else if (StringUtils.equals(rowStatus, ROWSTATUS_UPDATE)) {
				exceptDao.updateExceptItem(vo);
			} else if (StringUtils.equals(rowStatus, ROWSTATUS_DELETE)) {
				exceptDao.deleteExceptItem(vo);
			}
		} catch (Exception e) {
			AppLog.error("ExceptServiceImpl.saveExceptItem() 저장 오류", e);
			throw e;
		}
		
		return transRows;
	}
}
