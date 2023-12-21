/**
 * 
 */
package kr.re.kitech.biz.xom.core.util;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.inswave.elfw.util.ElBeanUtils;
import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.xom.base.model.BizUserHeader;

/**
 * ProWorks5 Jackson filter mapper를 사용하여 UserHeader pojo/json 간 변환하는 util converter
 * @author James
 * @since 2022. 8. 12.
 */
public class HeaderJsonConverter {

	/**
	 * UserHeader pojo를 json으로 변환한다.
	 * 
	 * @param userHeader
	 * @return
	 * @throws Exception
	 */
	public static String headerToJson(BizUserHeader userHeader) throws Exception {
		ElMappingJacksonObjectMapper elJacksonOm = (ElMappingJacksonObjectMapper) ElBeanUtils.getBean("jsonMapper");
		return elJacksonOm.writeValueAsString(userHeader);
	}

	/**
	 * UserHeader json을 pojo로 변환한다.
	 * 
	 * @param json
	 * @param cls
	 * @return
	 * @throws Exception
	 */
	public static BizUserHeader jsonToHeader(String json, Class<?> cls) throws Exception {
		ElMappingJacksonObjectMapper elJacksonOm = (ElMappingJacksonObjectMapper) ElBeanUtils.getBean("jsonMapper");
		elJacksonOm.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		JSONObject jsonObj = new JSONObject(json);
		return (BizUserHeader)elJacksonOm.readValue(jsonObj.getJSONObject("elHeader").toString(), cls);
	}
	
	
}
