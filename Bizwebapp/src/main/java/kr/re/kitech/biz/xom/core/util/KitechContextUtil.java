/**
 * 
 */
package kr.re.kitech.biz.xom.core.util;

import java.util.Locale;

import com.inswave.elfw.core.ElHeader;
import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.util.ControllerContextUtil;

import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;

/**
 * 프레임워크 기반 기능 사용을 지원하기 위한 유틸리티 
 *
 * @author James
 * @since 2022. 3. 29.
 */
public class KitechContextUtil {

	public static Locale getLocale() {
		ElHeader elHeader = ControllerContextUtil.getElHeader();
		return elHeader.getLocale();
	}
	
	public static void setCancelKey(String bpmCancelKey){
		UserHeader userHeader = ControllerContextUtil.getUserHeader();
		if (null != userHeader && userHeader instanceof BizUserHeader) {
			((BizUserHeader)userHeader).setBpmCancelKey(bpmCancelKey);
			ControllerContextUtil.setUserHeader(userHeader);
		}		
	}
	
	public static void setServiceId(String serviceId){
		UserHeader userHeader = ControllerContextUtil.getUserHeader();
		if (null != userHeader && userHeader instanceof BizUserHeader) {
			BizUserHeader bizUser = (BizUserHeader)userHeader;
			bizUser.setServiceId(serviceId);
			SessionUserHeader sessionUser = bizUser.getSession();
			sessionUser.setServiceId(serviceId);
			
			// ControllerContextUtil.setUserHeader(userHeader);
		}		
	}	
	
	public static BizUserHeader getHeader(){
		UserHeader userHeader = ControllerContextUtil.getUserHeader();
		return null != userHeader && userHeader instanceof BizUserHeader ? (BizUserHeader) userHeader : null;		
	}
	public static SessionUserHeader getSession() {
		BizUserHeader bizUserHeader = KitechContextUtil.getHeader();
		return null != bizUserHeader ? bizUserHeader.getSession() : null;
	}
	
	public static boolean isNotExcel() {
		BizUserHeader bizUserHeader = KitechContextUtil.getHeader();
		return null != bizUserHeader ? !bizUserHeader.isExcel() : false;
	}
	
	public static boolean isImplExcel() {
		BizUserHeader bizUserHeader = KitechContextUtil.getHeader();
		return null != bizUserHeader ? bizUserHeader.isImplExcel() : false;
	}
	public static String getSyspayno() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getSn() : null;
	}
	
	public static String getUserId() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getUid() : null;
	}	
	
	public static String getName() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getCn() : null;
	}
	
	public static String getServiceId() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getServiceId() : null;
	}
	
	public static String getDocId() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getDocId() : null;
	}	

	
	public static String getDeptCd() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getDeptCode() : null;
	}	

	public static String getWorkClsf() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getWorkClsf() : null;
	}	
	
	public static String getBpmToken() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getBpmToken() : null;
	}	
	
	public static String getEipToken() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getEipToken() : null;
	}		
	
	public static String getBetaService() {
		SessionUserHeader session = KitechContextUtil.getSession();
		if (null == session) {
			return "";
		}
		return session.getBetaService();
	}		
	public static String getRoleCode() {
		SessionUserHeader session = KitechContextUtil.getSession();
		return null != session ? session.getRoleCode() : null;
	}		
}
