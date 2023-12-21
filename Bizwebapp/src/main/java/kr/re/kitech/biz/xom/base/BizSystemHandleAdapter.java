package kr.re.kitech.biz.xom.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.ui.Model;

import com.fasterxml.jackson.databind.JsonNode;
import com.inswave.elfw.ElConstants;
import com.inswave.elfw.core.ElHeader;
import com.inswave.elfw.core.UserHeader;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.exception.UserException;
import com.inswave.elfw.intercept.service.ElSystemHandleAdapter;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElBeanUtils;
import com.inswave.elfw.view.ElMappingJacksonObjectMapper;

import kr.re.kitech.biz.xom.base.exception.BpmException;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.BizUserHeader;

/**
 *
 */
public class BizSystemHandleAdapter extends ElSystemHandleAdapter {

 
	public BizSystemHandleAdapter(Map<String, Object> adapterInfoMap) {
		super(adapterInfoMap);
	}

	@Override
	public void preHandle(HttpServletRequest request, String inputData) throws UserException {
		AppLog.debug("[ADAPTER] ==================] preHandle [===================");
		String contextPath = request.getContextPath();
		String reqUri =  request.getRequestURI();
		try{
			String svcId = reqUri.replaceFirst(contextPath, "");
			
			if( svcId.startsWith("/")) {
				svcId = svcId.substring(1);
			}
			
			int iSearch = svcId.lastIndexOf(".");
			String ext = "";
			if( iSearch > 0 ) {
				ext = svcId.substring(iSearch + 1);
				svcId = svcId.substring(0, iSearch);
			}
			
			AppLog.debug(" - svcId:[" + svcId + "]");         // 서비스 ID
			AppLog.debug(" - ext:[" + ext + "]");             // 요청 확장자 : pwkjson, fld
			AppLog.debug(" - inputData:[" + inputData + "]"); // 요청 전문 
			
			/////////////// 업무 요건 처리 (권한 처리 등 ... )  ////////////////////// 
			/// ElBeanUtils.getBean 으로 획득한 서비스를 통해 처리
			/// 세션 Key 등은 Http 헤더를 활용한다.
			
			// 업무 공통쪽에 권한 체크 로직 전달 -> 해당 구현체에 throw 를 통한 권한 체크 
			BizAuthProcess accntService = (BizAuthProcess)ElBeanUtils.getBean("bizAuthProcess");
			accntService.checkAuth(request, svcId, inputData);			
		} catch (BpmException e) {
			AppLog.error("preHandle : BpmException", e);
			throw e;

		} catch (KitechException e) {
			AppLog.error("preHandle : KitechException", e);
			throw e;

		} catch (ElException e) {
			AppLog.error("preHandle : ElException", e);
			throw e;
			
		} catch(Exception e) {
			AppLog.error("preHandle error", e);
			throw new UserException("ERROR.SYS.002");
		}
		
	}

	@Override
	public void postHandle(ElHeader elHeader, UserHeader userHeader, Object[] serviceParams, Model resultModel) {
		AppLog.debug("[ADAPTER] ==================] postHandle [===================");
		
		// 시스템 후처리 메소드 파라미터 설명 
		// 1. ElHeader elHeader : 프레임워크 헤더 
		// 2. UserHeadeer userHeader : 로그인 세션 정보 userHeader => 프로젝트 UserHeader 로 Casting 하여 사용
		// 3. Object[] serviceParams : 요청 서비스 컨트롤러의 메소드 파라미터 순서대로 
		// 4. Model resultModel : 서비스 성공시에 Model 에 담겨진 값 
		
		AppLog.debug("- elHeader:" + elHeader.toString()); // 프레임워크 헤더 출력 		
		boolean bSuc = elHeader.isResSuc(); // 업무 처리의 에러 발생여부 
		String svcId = elHeader.getServiceKey();
		
		AppLog.debug("- svcId postHandle:" + svcId);
		long loStartTime = elHeader.getStartTime();
		long loRunTime = System.currentTimeMillis() - loStartTime;
		
		AppLog.debug("- loRunTime (ms): " + loRunTime);
		AppLog.debug("- serviceParams[]: " + Arrays.toString(serviceParams));
		
		try{
			if (bSuc && null != serviceParams && 0 < serviceParams.length) {
//				BizCommVO superVo = (BizCommVO)serviceParams[0];
//				SessionUserHeader session = ((BizUserHeader)userHeader).getSession();
//				superVo.setRegst_syspayno( session.getSn());
				
			} else if( bSuc == false ) { // 실패이면 - 이하 블럭은 참고용 코드임 
				Object obj = elHeader.getObjArgParsingData(); // 요청 서비스의 최초 요청  데이터 
				AppLog.debug("- serviceParams[]: " + Arrays.toString(serviceParams));
				if( obj != null) {	
					if( obj instanceof JsonNode ) {
						JsonNode jObj = (JsonNode)obj;
						AppLog.debug("- JSON Object: " + jObj); // 요청 서비스의 최초 요청 데이터 Json 객체 
					
						ElMappingJacksonObjectMapper elJacksonObjMapper = (ElMappingJacksonObjectMapper)ElBeanUtils.getBean("jsonMapper");
						String jsonString = elJacksonObjMapper.writeValueAsString(jObj);
						
						AppLog.debug("- JSON String: " + jsonString); // 요청 서비스의 최초 요청 데이터 Json 문자열 
						
						//############## JSON Object 또는 JSON 문자열을 가지고 서비스 입력 데이터로 활용 ##################
						 
					}
				}
			}
		} catch(Exception e){
			AppLog.error("postHandle Error", e);
		}
		
		/////////////////  ElHeader 에서 빼고 싶은 항목 설정  가능  //////////////////////
		elHeader.setObjArgParsingData(null);
		elHeader.setjSessionID(null);
		elHeader.setCookieStr(null);

		// SSO 세션 연계 서비스 인증 후 Welcome 페이지 redirect 시 모델에 헤더를 주입할 수 없으므로 예외처리 한다.
		// 헤더 데이터는 Welcome 페이지에서 세션값을 직접 꺼내서 설정한다.
		if (null != resultModel && null != svcId && !svcId.equals("SvcSsoLoginPost")) {

			resultModel.addAttribute(ElConstants.EL_HEADER_STRING, elHeader );
			
			/////////////////  CfwUserHeader 에서 빼고 싶은 항목 설정  가능  //////////////////////
			if (userHeader != null && userHeader instanceof BizUserHeader) {
				BizUserHeader siteUserHeader = (BizUserHeader)userHeader;
				siteUserHeader.setUserGroupNm(null);
				resultModel.addAttribute(ElConstants.USER_HEADER_STRING, siteUserHeader);		
			}
	
			//##### elHeader , userHeader, elData 만 Output 에 포함 	
			ArrayList<String> alDelKey = new ArrayList<String>();	
			Map<String,Object> mpModel = resultModel.asMap();
	        for (String key : mpModel.keySet()) {
	        	if (!StringUtils.isEmpty(svcId) && svcId.startsWith("Api")) {
	        		if (!(ElConstants.EL_HEADER_STRING.equals(key) || ElConstants.EL_DATA_STRING.equals(key))) {
		            	alDelKey.add(key);
		            }
	        	} else {
		            if (!(ElConstants.EL_HEADER_STRING.equals(key) || ElConstants.USER_HEADER_STRING.equals(key) || ElConstants.EL_DATA_STRING.equals(key))) {
		            	alDelKey.add(key);
		            }
	            }
	        }     
	        for (String delKey : alDelKey) {
	        	mpModel.remove(delKey);
	        }
        }
	}
}
