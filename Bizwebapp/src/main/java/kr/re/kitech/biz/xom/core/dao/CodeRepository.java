package kr.re.kitech.biz.xom.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.DBUtil;
import com.inswave.elfw.util.PropUtil;

import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.vo.CodeVo;
import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarBuilder;
import me.tongfei.progressbar.ProgressBarStyle;


@Repository("codeRepository")
public class CodeRepository {
 
	public CodeRepository(){
	
	}

	/**
	 * 사용여부에 조건에 따라 모든 코드 데이터를 조회한다. 
	 */
	public List<CodeVo> findCodesByUse() throws ElException{
		List<CodeVo> codeList = new ArrayList<>();
		try (
			Connection con = DBUtil.getConnection( this.getWorkSourceName()); // 업무쪽 해당 DataSource명 문자열 
			PreparedStatement ps = con.prepareStatement( this.query(null));
			ResultSet rs = ps.executeQuery();
			ProgressBar bar = new ProgressBarBuilder()
				.setStyle(ProgressBarStyle.ASCII)
				.setTaskName("공통 코드 적재:")
				.setMaxRenderedLength(150)
				.setUpdateIntervalMillis(100).setInitialMax(12000).build()){
			
			while (rs.next()) {
				CodeVo code = this.mapper(rs);
				codeList.add(code);
				bar.setExtraMessage("<-" + code.getGrpCd());
				bar.step();
			}
		} catch(Exception e) {
			AppLog.error("LOAD getMsg ERROR !",e);
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.code.0001", e);
		} 
		return codeList;
	}
	
	/**
	 * 사용여부에 조건에 따라 모든 코드 데이터를 조회한다. 
	 */
	public List<CodeVo> findCodesByUse(String grpCode) throws ElException{
		List<CodeVo> codeList = new ArrayList<>();
		try (
			Connection con = DBUtil.getConnection( this.getWorkSourceName()); // 업무쪽 해당 DataSource명 문자열 
			PreparedStatement ps = con.prepareStatement( this.query(grpCode));
			ResultSet rs = ps.executeQuery()) {
			
			while (rs.next()) {
				CodeVo code = this.mapper(rs);
				codeList.add(code);
			}
		} catch(Exception e) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "message.xom.co.code.0001", e);
		} 
		return codeList;
	}
	
	/**
     * ResultSet 의 데이터를 모델에 매핑한다.
	 */
	private CodeVo mapper(ResultSet rs) throws SQLException {
		CodeVo code = new CodeVo();
		code.setGrpCd( rs.getString("grp_cd"));
		code.setGrpNm( rs.getString("grp_nm"));		
		code.setComCd( rs.getString("com_cd"));
		code.setComNm( rs.getString("com_nm"));
		code.setCdDesc( rs.getString("cd_desc"));
		code.setCdClsf( rs.getString("cd_clsf"));
		code.setSysClsf( rs.getString("sys_clsf"));
		code.setSeq( rs.getString("seq"));
		code.setUseEx( rs.getString("use_ex"));
		code.setMngmtItem1( rs.getString("mngmt_item_1"));
		code.setMngmtItem2( rs.getString("mngmt_item_2"));
		code.setMngmtItem3( rs.getString("mngmt_item_3"));
		code.setMngmtItem4( rs.getString("mngmt_item_4"));
		code.setMngmtItem5( rs.getString("mngmt_item_5"));
		code.setMngmtItem6( rs.getString("mngmt_item_6"));
		code.setMngmtItem7( rs.getString("mngmt_item_7"));
		code.setMngmtItem8( rs.getString("mngmt_item_8"));	
		code.setMngmtNo1(rs.getInt("mngmt_no_1"));
		code.setMngmtNo2(rs.getInt("mngmt_no_2"));
		code.setMngmtNo3(rs.getInt("mngmt_no_3"));
		code.setMngmtNo4(rs.getInt("mngmt_no_4"));
		code.setMngmtNo5(rs.getInt("mngmt_no_5"));
		code.setMngmtNo6(rs.getInt("mngmt_no_6"));
		code.setMngmtNo7(rs.getInt("mngmt_no_7"));		
		code.setRmk( rs.getString("rmk"));
		code.setRegst_syspayno( rs.getString("regst_syspayno"));
		code.setRegst_daytm( rs.getString("regst_daytm"));
		code.setUpdt_syspayno( rs.getString("updt_syspayno"));
		code.setUpdt_daytm( rs.getString("updt_daytm"));
		return code;
	}
	
	/**
     * 업무 데이터 소스 명을 프로퍼티에서 가져온다.
	 */
	private String getWorkSourceName() {
		String value = PropUtil.getMessage("EL_IMIS_WORK_DATASOURCE_NAME");
		if ((value == null) || ("".equals(value))) {
			value = "DS_EL_WORK";
		}
		return value;
	}
	
	/**
     * 마스터 그룹 코드별로 그룹화한 코드 데이터 조회 쿼리
	 */	
	private String query(String grpCode){
		StringBuilder builder = new StringBuilder();
		builder.append( " SELECT LEFT(x0.cd,3) AS grp_cd");
		builder.append( "     , x0.cd_nm AS grp_nm");
		builder.append( "     , x1.cd AS com_cd");
		builder.append( "     , x1.cd_nm AS com_nm");
		builder.append( "     , x1.cd_desc");
		builder.append( "     , x1.cd_clsf");
		builder.append( "     , x1.sys_clsf");
		builder.append( "     , x1.seq");
		builder.append( "     , x1.use_ex");
		builder.append( "     , x1.mngmt_item_1");
		builder.append( "     , x1.mngmt_item_2");
		builder.append( "     , x1.mngmt_item_3");
		builder.append( "     , x1.mngmt_item_4");
		builder.append( "     , x1.mngmt_item_5");
		builder.append( "     , x1.mngmt_item_6");
		builder.append( "     , x1.mngmt_item_7");
		builder.append( "     , x1.mngmt_item_8");
		builder.append( "     , x1.mngmt_no_1");
		builder.append( "     , x1.mngmt_no_2");
		builder.append( "     , x1.mngmt_no_3");
		builder.append( "     , x1.mngmt_no_4");
		builder.append( "     , x1.mngmt_no_5");
		builder.append( "     , x1.mngmt_no_6");
		builder.append( "     , x1.mngmt_no_7");
		builder.append( "     , x1.rmk");
		builder.append( "     , x1.regst_psn_syspayno AS regst_syspayno");
		builder.append( "     , x1.regst_daytm");
		builder.append( "     , x1.updt_psn_syspayno AS updt_syspayno");
		builder.append( "     , x1.updt_daytm");
		builder.append( " FROM xodxcommst AS x0 JOIN xodxcommst AS x1 ON x1.cd_clsf = x0.cd_clsf");
		builder.append( " WHERE x0.seq = '000'");
		builder.append( "   AND x1.seq != '000'");
		if (StringUtils.isNotBlank(grpCode)) {
			builder.append( "   AND x1.cd_clsf = '${grpCd}'".replace("${grpCd}", grpCode));
		}
		builder.append( " ORDER BY x0.cd, x1.seq");
		return builder.toString();
	}
}
