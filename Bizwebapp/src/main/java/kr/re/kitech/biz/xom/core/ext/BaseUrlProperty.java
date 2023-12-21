/**
 * 
 */
package kr.re.kitech.biz.xom.core.ext;

/**
 * URL 프로퍼티 
 * @author James
 * @since 2022. 9. 6.
 */
public class BaseUrlProperty {
	public static String ssoSrvUrl;
	public static String ssoPxyUrl;
		
	public static String newBpmUrl;
	public static String newEipUrl;
	public static String newBizUrl;
	public static String newNoteUrl;
	public static String newRuleUrl;

	public static String doorayUrl;	
	public static String ozUrl;
	public static String kdocUrl;
	
	public static String oldEipUrl;
	public static String oldBizUrl;
	public static String oldAprUrl;
	
	public static String easyPayUrl;

	public static String getUrls() {
		return String.format(
			"{ 'ssoSrvUrl' : '%s', 'ssoPxyUrl' : '%s', 'newBpmUrl' : '%s', 'newEipUrl' : '%s', 'newBizUrl' : '%s', 'newNoteUrl' : '%s', 'newRuleUrl' : '%s', 'doorayUrl' : '%s', 'ozUrl' : '%s', 'kdocUrl' : '%s', 'oldEipUrl' : '%s', 'oldBizUrl' : '%s', 'oldAprUrl' : '%s'}"
			, BaseUrlProperty.ssoSrvUrl
			, BaseUrlProperty.ssoPxyUrl
			, BaseUrlProperty.newBpmUrl
			, BaseUrlProperty.newEipUrl
			, BaseUrlProperty.newBizUrl
			, BaseUrlProperty.newNoteUrl
			, BaseUrlProperty.newRuleUrl
			, BaseUrlProperty.doorayUrl
			, BaseUrlProperty.ozUrl
			, BaseUrlProperty.kdocUrl
			, BaseUrlProperty.oldEipUrl
			, BaseUrlProperty.oldBizUrl
			, BaseUrlProperty.oldAprUrl
		);
	}

	public static String getSsoSrvUrl() {
		return ssoSrvUrl;
	}

	public static String getSsoPxyUrl() {
		return ssoPxyUrl;
	}
		
	public static String getNewBpmUrl() {
		return newBpmUrl;
	}

	public static String getNewEipUrl() {
		return newEipUrl;
	}

	public static String getNewBizUrl() {
		return newBizUrl;
	}
	
	public static String getNewNoteUrl() {
		return newNoteUrl;
	}

	public static String getNewRuleUrl() {
		return newRuleUrl;
	}

	public static String getDoorayUrl() {
		return doorayUrl;
	}
	
	public static String getOzUrl() {
		return ozUrl;
	}

	public static String getKdocUrl() {
		return kdocUrl;
	}

	public static String getOldEipUrl() {
		return oldEipUrl;
	}

	public static String getOldBizUrl() {
		return oldBizUrl;
	}

	public static String getOldAprUrl() {
		return oldAprUrl;
	}
	public static String getEasyPayUrl() {
		return easyPayUrl;
	}

	public void setSsoSrvUrl(String ssoSrvUrl) {
		BaseUrlProperty.ssoSrvUrl = ssoSrvUrl;
	}
	

	public void setSsoPxyUrl(String ssoPxyUrl) {
		BaseUrlProperty.ssoPxyUrl = ssoPxyUrl;
	}		
	

	public void setNewBpmUrl(String newBpmUrl) {
		BaseUrlProperty.newBpmUrl = newBpmUrl;
	}

	public void setNewEipUrl(String newEipUrl) {
		BaseUrlProperty.newEipUrl = newEipUrl;
	}

	public void setNewBizUrl(String newBizUrl) {
		BaseUrlProperty.newBizUrl = newBizUrl;
	}

	public static void setNewNoteUrl(String newNoteUrl) {
		BaseUrlProperty.newNoteUrl = newNoteUrl;
	}
	
	public static void setNewRuleUrl(String newRuleUrl) {
		BaseUrlProperty.newRuleUrl = newRuleUrl;
	}
	
	public static void setDoorayUrl(String doorayUrl) {
		BaseUrlProperty.doorayUrl = doorayUrl;
	}

	public void setOzUrl(String ozUrl) {
		BaseUrlProperty.ozUrl = ozUrl;
	}

	public void setKdocUrl(String kdocUrl) {
		BaseUrlProperty.kdocUrl = kdocUrl;
	}

	public void setOldEipUrl(String oldEipUrl) {
		BaseUrlProperty.oldEipUrl = oldEipUrl;
	}

	public void setOldBizUrl(String oldBizUrl) {
		BaseUrlProperty.oldBizUrl = oldBizUrl;
	}

	public void setOldAprUrl(String oldAprUrl) {
		BaseUrlProperty.oldAprUrl = oldAprUrl;
	}
	
	public void setEasyPayUrl(String easyPayUrl) {
		BaseUrlProperty.easyPayUrl = easyPayUrl;
	}

}