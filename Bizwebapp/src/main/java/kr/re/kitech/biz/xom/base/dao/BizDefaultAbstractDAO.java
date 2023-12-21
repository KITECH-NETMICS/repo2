package kr.re.kitech.biz.xom.base.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.SqlSessionFactory;

import com.inswave.elfw.ElConfig;
import com.inswave.elfw.db.ElAbstractMybatisDAO;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizCommVO;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @Class Name  : BizDefaultAbstractDAO.java
 * @Description : 프로젝트 Default DAO 상위 클래스 - 각 업무 DAO 에서 상속받아 사용됨(기본 데이터 소스 사용시) 
 * @Modification Information  
 * @
 * @  수정일           수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/01/06   개발팀                  최초생성
 * 
 * @author 개발팀
 * @since 2022/01/06
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
public class BizDefaultAbstractDAO extends ElAbstractMybatisDAO{

	@Resource(name = "imisSqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	protected int insert(final String statementName, final Object parameterObject) throws KitechException {
		return super.insert(statementName, this.fillLogColumn(parameterObject, true));
	}
	
	@Override
	protected int update(final String statementName, final Object parameterObject) throws KitechException {
		return super.update(statementName, this.fillLogColumn(parameterObject, false));
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected List list(final String statementName) throws KitechException {
		return this.list(statementName, null);
	}

	@Override
	@SuppressWarnings("rawtypes")
	protected List list(final String statementName, final Object parameterObject) throws KitechException {
		try {
			ControllerContextUtil.getElHeader().setDbDataEnc(true); //필수 코드

			// cursor 의 close 는 mybatis 엔진에서 자동 처리됨 
			@SuppressWarnings("resource")
			Cursor<Object> cursor = (
				null == parameterObject ? getSqlSession().selectCursor(statementName) : getSqlSession().selectCursor(statementName, parameterObject)
			);
			  
			List<Object> list = new ArrayList<>();
			boolean isNotExcel = false;
			boolean isImplExcel = false;
			try {
				isNotExcel = KitechContextUtil.isNotExcel();
				isImplExcel = KitechContextUtil.isImplExcel();
			} catch (Exception ex) {}
			for (Object curObj : cursor) {
				list.add(curObj);
				// 엑셀 프로바이더를 이용한 서비스 호출시에는 카운팅하지 않음
				if (isNotExcel){
					this.checkMaxRowCount(list.size(), isImplExcel);  //Max Count 체크
				}
			}
			return list;
		} catch (KitechException e) {
			AppLog.error("BizDefaultAbstractDAO.KitechException ==>", e);
			throw e;
		} catch (Exception e) {
			AppLog.error("BizDefaultAbstractDAO.Exception ==>", e);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.fw.error.base.sys.003", e);  // 프레임워크의 에러 코드 -> 데이터를 처리하는 중에 오류가 발생하였습니다.
		} finally {
			ControllerContextUtil.getElHeader().setDbDataEnc(false); //필수 코드
		}
	}	
	
	/**
	 * 최대 로우 수 체크
	 * @param iCurRowCount
	 * @param isImplExcel
	 * @throws KitechException
	 */
	private void checkMaxRowCount(int iCurRowCount, boolean isImplExcel) throws KitechException{
		int iMaxCount = BizDefaultAbstractDAO.getMybatisListMaxCount();

		if (iMaxCount < iCurRowCount) {
			// 최대쿼리를 카운트{0}을 초과하였습니다.
			AppLog.debug( "=====================] BizDefaultAbstractDAO [=========================");
			AppLog.debug( "checkMaxRowCount.isImplExcel: " + KitechContextUtil.isImplExcel());
			AppLog.debug( "=======================================================================");
			String messageKey = isImplExcel ? "message.xom.fw.error.base.limit.row.count.confirm" : "message.xom.fw.error.base.limit.row.count.alert";
			throw new KitechException(Exceptions.ALERT, Business.XOM, messageKey, new String[]{ String.valueOf(iMaxCount) });
		}
	}

	/**
	 * F/W에 설정된 최대 조회 Row 수를 조회한다.
	 *
	 * @return 초회 결과 최대 Row 수
	 */
	private static int getMybatisListMaxCount() {
		final int BIZ_MYBATIS_LIST_MAX_COUNT = 6000;
	    try {
	    	// ElAdmin 의 대상 프로젝트 아래 프로퍼티 등록 -> 그룹ID: 	EL_CORE_PROP , 프로퍼티키 : SITE_MYBATIS_LIST_MAX_COUNT 
	    	String size = ElConfig.getValue("BIZ_MYBATIS_LIST_MAX_COUNT", String.valueOf(BIZ_MYBATIS_LIST_MAX_COUNT));
	    	return Integer.parseInt(size);
	    } catch(Exception e) {
	    	return BIZ_MYBATIS_LIST_MAX_COUNT;
	    }
	}
	
	/**
     * 세션 컨텍스트의 사번 및 현재시각으로 VO 슈퍼 클래스의 테이블 로깅 컬럼을 채운다.
     *  - 생성자/생성일시/수정자/수정일시 값 설정: 값은 설정하되 쿼리 구성시 insert | update 구분하여 작성 권고  
	 *
	 * @param param CommVo
	 * @param isInsert insert or update
	 * @return CommVo
	 */
	private Object fillLogColumn(Object param, boolean isInsert) {
		if (param instanceof BizCommVO) {
			BizCommVO commVO = (BizCommVO)param;
			
			if(commVO.getRegst_syspayno() == null || "".equals(commVO.getRegst_syspayno())){
				commVO.setRegst_syspayno(KitechContextUtil.getSyspayno());	// Insert | Update 공용
			}
			if (isInsert){
				commVO.setRegst_daytm(DateUtil.getCurrentDate("yyyy-MM-dd hh:mm:ss"));
			} else {
				if(commVO.getUpdt_syspayno() == null || "".equals(commVO.getUpdt_syspayno())){
					commVO.setUpdt_syspayno(KitechContextUtil.getSyspayno());
				}
				commVO.setUpdt_daytm(DateUtil.getCurrentDate("yyyy-MM-dd hh:mm:ss"));
			}
			param = commVO;
		}
		return param;
	}
}