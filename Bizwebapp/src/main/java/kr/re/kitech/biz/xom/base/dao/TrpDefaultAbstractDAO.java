package kr.re.kitech.biz.xom.base.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;

import com.inswave.elfw.db.ElAbstractMybatisDAO;


/**
 * 프로젝트 Default DAO 상위 클래스 - 각 업무 DAO 에서 상속받아 사용됨(TRP 데이터 소스 사용시)
 *
 * @author James
 * @since 2022. 8. 5.
 */
public class TrpDefaultAbstractDAO extends ElAbstractMybatisDAO{

	@Resource(name = "trpSqlSessionFactory")
	 public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	 }
}
