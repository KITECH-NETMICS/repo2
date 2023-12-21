package kr.re.kitech.biz.xom.base.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;

import com.inswave.elfw.db.ElAbstractMybatisDAO;


/**
 * 프로젝트 Default DAO 상위 클래스 - 각 업무 DAO 에서 상속받아 사용됨(MMS 데이터 소스 사용시)
 *
 * @author James
 * @since 2022. 4. 5.
 */
public class MmsDefaultAbstractDAO extends ElAbstractMybatisDAO{

	@Resource(name = "mmsSqlSessionFactory")
	 public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	 }
}
