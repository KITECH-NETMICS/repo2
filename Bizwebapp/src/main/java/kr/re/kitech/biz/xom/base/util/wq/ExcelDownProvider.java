package kr.re.kitech.biz.xom.base.util.wq;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.w3c.dom.Document;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import websquare.http.WebSquareContext;
import websquare.http.controller.grid.excel.write.IExternalGridDataProvider;
import websquare.util.XMLUtil;

public class ExcelDownProvider implements IExternalGridDataProvider {
	
	// Excel 파일로 다운로드 받을 최대 Row 수 설정 
	// MAX_ROW_COUNT은 100000까지 설정이 가능합니다.
	// 100,000 만건 이상을 다운로드 받으시려면 websquare.xml에서 maxRowCount 값을 설정해야 합니다.
	// maxRowCount 값이 너무 큰 경우 Excel 파일 생성 과정에서 OutOfMemory가 발생할 수 있으니 
	// WAS의 Heap Memory 크기를 고려해서 적절하게 설정해야 합니다.
	// <!-- websquare.xml (websquare_home/config) -->
	//	<excel>
	//    <download>
	//   		<!-- 엑셀 파일 다운로드 시 최대 Row 수 -->
	//        <maxRowCount value="1000000" />
	//    </download>
	private final int MAX_ROW_COUNT = 100000;

	public String[] getData(Document requestObj) throws Exception {

		// Get WebApplicationContext
		WebSquareContext context = WebSquareContext.getContext();
		HttpServletRequest request = context.getRequest();
		HttpSession httpSession = request.getSession();
		ServletContext sc = httpSession.getServletContext();
		WebApplicationContext wContext = WebApplicationContextUtils.getWebApplicationContext(sc);
		
		List resultList = null;
		String keyMap = null;
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			// Loading Parameter
			// System.out.println(XMLUtil.indent(requestObj));
			String serviceId = XMLUtil.getText(requestObj, "service");
			String methodId = XMLUtil.getText(requestObj, "method");
			String voId = XMLUtil.getText(requestObj, "vo");
			String paramKey = XMLUtil.getText(requestObj, "paramKey");
			String paramMap = XMLUtil.getText(requestObj, "paramMap");
			keyMap = XMLUtil.getText(requestObj, "keyMap");
			
//			paramData.put("isExcel", true);
			
			System.out.println(paramMap);
			Object paramVo = objectMapper
					.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
					.readValue(paramMap, Class.forName("kr.re.kitech.biz." + voId));
			
			// Call the method of the service
			Object service = wContext.getBean(serviceId);
			Method method = service.getClass().getMethod(methodId, Class.forName("kr.re.kitech.biz." + voId));
			resultList = (List) method.invoke(service, paramVo);

			if ((resultList != null) && (resultList.size() > 0)) {
				String[] keyArr = keyMap.split(",");
				String strArr[] = new String[resultList.size() * keyArr.length];
				
				int idx = 0;
				for (Object vo : resultList) {
					for (int i=0; i < keyArr.length; i++) {
//						Map<String, Object> map = objectMapper.convertValue(obj, Map.class);
						Field[] fields = vo.getClass().getDeclaredFields();
						int fieldSize = fields.length;
						int fieldIndex = 0;
						for (Field field : fields) {
							fieldIndex++;
							if (field.getName().equals(keyArr[i])) {
								field.setAccessible(true);
								Object value = field.get(vo);
								if (value != null) {
									strArr[idx] = String.valueOf(value);
								} else {
									strArr[idx] = "";
								}
								idx++;
								break;
							}
							
							if (fieldSize <= fieldIndex) {
								strArr[idx] = "";
								idx++;
							}
						}
					}
				}
				
				return strArr;
			} else {
				return null;
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

}
