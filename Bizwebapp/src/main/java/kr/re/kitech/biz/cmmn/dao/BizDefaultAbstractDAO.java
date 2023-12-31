package kr.re.kitech.biz.cmmn.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;

import com.inswave.elfw.db.ElAbstractMybatisDAO;

/**  
 * @Class Name : BizDefaultAbstractDAO.java
 * @Description : 프로젝트 Default DAO 상위 클래스 - 각 업무 DAO 에서 상속받아 사용됨(기본 데이터 소스 사용시) 
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
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

	@Resource(name = "db1SqlSessionFactory")
	 public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	 }
	
}
