/**
 * 
 */
package kr.re.kitech.biz.xom.core.ext;

import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

/**
 * Informix + WebSphere 환경에서 VO 컬럼내의 String javaType 과 db LVARCHAR 타입 바인딩 안되는 문제 처리.
 * Caused by: java.sql.SQLException: Can't convert to: binary stream
 *
 * @author James
 * @since 2022. 4. 22.
 */
@MappedTypes(String.class)
@MappedJdbcTypes(value={JdbcType.CLOB,JdbcType.LONGVARCHAR})
public class CustomTypeHandler extends BaseTypeHandler<String> {

	@Override
	public String getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
		String value = "";
		Object object = resultSet.getObject(columnLabel);
		if (null != object) {
			if (object instanceof String) {
				value = object.toString();
			} else {
				Clob clob = resultSet.getClob(columnLabel);
				if (null != clob) {
					int size = (int) clob.length();
					value = clob.getSubString(1, size);
				}
			}
		}
		return value;
	}

	@Override
	public String getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
		String value = "";
		Object object = resultSet.getObject(columnIndex);
		if (null != object) {
			if (object instanceof String) {
				value = object.toString();
			} else {
				Clob clob = resultSet.getClob(columnIndex);
				if (null != clob) {
					int size = (int) clob.length();
					value = clob.getSubString(1, size);
				}
			}
		}
		return value;
	}

	@Override
	public String getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
		String value = "";
		Object object = callableStatement.getObject(columnIndex);
		if (null != object) {
			if (object instanceof String) {
				value = object.toString();
			} else {
				Clob clob = callableStatement.getClob(columnIndex);
				if (null != clob) {
					int size = (int) clob.length();
					value = clob.getSubString(1, size);
				}
			}
		}
		return value;
	}

	@Override
	public void setNonNullParameter(PreparedStatement preparedStatement, int i, String parameter, JdbcType jdbcType) throws SQLException {
		StringReader reader = new StringReader(parameter);
		preparedStatement.setCharacterStream(i, reader, parameter.length());
	}
}