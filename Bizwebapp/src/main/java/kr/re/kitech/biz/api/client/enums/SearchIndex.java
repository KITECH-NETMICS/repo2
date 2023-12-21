/**
 * 
 */
package kr.re.kitech.biz.api.client.enums;

import kr.re.kitech.biz.xom.base.enums.EnumMapperType;

/**
 * 
 * @author James
 * @since 2023. 3. 29.
 */
public enum SearchIndex implements EnumMapperType {
	FIN_SLIP_TASK("task_fin_res", "결의"),
	PUR_REQ_TASK("task_purchase", "구매요구"),
	CTR_DOME_TASK("task_biztrip_kor", "국내출장"),
	CTR_OVER_TASK("task_biztrip_ext", "해외출장");
	
	private final String code;
	private final String title;
		
	private SearchIndex(String code, String title) {
		this.code = code;
		this.title = title;
	}
	
	@Override
	public String getCode() {
		return this.code;
	}

	@Override
	public String getName() {
		return this.name();
	}

	@Override
	public String getTitle() {
		return this.title;
	}
}
