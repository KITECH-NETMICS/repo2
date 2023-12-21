/**
 * 
 */
package kr.re.kitech.biz.api.client.model;

import kr.re.kitech.biz.api.client.vo.ApiResult;


/**
 * 
 * @author James
 * @since 2022. 5. 20.
 */
public class ApiCountResult implements ApiResult {

	private Integer count;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}