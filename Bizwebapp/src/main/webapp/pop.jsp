<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" import="
  java.util.Enumeration
, java.util.Base64
, org.apache.commons.lang3.StringUtils
, com.inswave.elfw.log.AppLog
, com.inswave.elfw.util.ElBeanUtils
, com.inswave.elfw.view.ElMappingJacksonObjectMapper
, kr.re.kitech.biz.xom.base.model.BizUserHeader
, kr.re.kitech.biz.xom.base.model.SessionUserHeader
, kr.re.kitech.biz.xom.core.ext.BaseUrlProperty
, kr.re.kitech.biz.xom.core.service.AccntService
, kr.re.kitech.biz.xom.core.vo.RoleCheckVo
, kr.re.kitech.biz.xom.core.vo.ServiceVo"%><%!

	public String getQueryString(HttpServletRequest req) throws Exception {
		Enumeration<String> em = req.getParameterNames();
		StringBuilder params = new StringBuilder();
		while (em.hasMoreElements()){
			String key = em.nextElement();
			String value = req.getParameter(key);
			if ("w2xPath".equals(key) || "isNew".equals(key)) {
				continue;
			}
			params.append("&" + key + "=" + java.net.URLEncoder.encode(value, "UTF-8"));
		}
		return params.toString();
	}

%><%

	/**
	 * 팝업페이지의 파라미터 인코딩 처리 및 Redirection 처리
	 */
	String baseUrls = BaseUrlProperty.getUrls();
	String w2xPath = request.getParameter("w2xPath");
	String param = this.getQueryString(request);
	AppLog.debug("====================================================================");
	AppLog.debug("w2xPath=[" + w2xPath + "]");
	AppLog.debug("baseUrls=[" + baseUrls + "]");
	AppLog.debug("param=[" + param + "]");
	AppLog.debug("====================================================================");
	
	try {
		// w2xPath 를 우선한다.
		if (StringUtils.isEmpty(w2xPath)) {
			
			// w2xPath 가 없는 경우 serviceid 를 확인한다.
			String serviceid = request.getParameter("serviceid");
			if (StringUtils.isNotEmpty(serviceid)) {
	
				AccntService accntService = (AccntService)ElBeanUtils.getBean("accntServiceImpl");
	
				// 세션 사번을 기반으로 접근할 수 있는 페이지 인지 체크
				/*
				SessionUserHeader sec = userHeader.getSession();
				RoleCheckVo check = accntService.checkRole(serviceid, sec.getRoleCode());
				AppLog.debug("====================================================================");
				AppLog.debug("roles", sec.getRoleCode());
				AppLog.debug("check", check);
				AppLog.debug("====================================================================");
				
				if (!check.isIsRoleYn()) {
					response.sendRedirect("/cm/html/permission.html");
				}*/
				
				ServiceVo service = accntService.findServiceByServiceId(serviceid);
				// ServiceNewURL 우선 -> ServiceURL
				String isNew = request.getParameter("isNew");
				
				if (null != isNew && "Y".equals(isNew)) {
					w2xPath = "/cm/layout/index_pop.xml";
				} else {
					w2xPath = service.getServiceNewUrl();
					String betaYN = service.getBetaServiceYN();
					
					if (StringUtils.equals(betaYN, "Y")) {
						BizUserHeader userHeader = (BizUserHeader) session.getAttribute("userHeader");
						if (userHeader != null && userHeader.getSession() != null) {
							SessionUserHeader userSession = (SessionUserHeader)userHeader.getSession();
							
							String betaServices = userSession.getBetaService();
							if (!StringUtils.containsIgnoreCase(betaServices, serviceid)) {
								w2xPath = "";
							}
						} else {
							w2xPath = "";
						}
					}
					
					if (StringUtils.isEmpty(w2xPath)) {
						// ServiceNewURL 이 없는 경우는 레거시 페이지이므로 2.0 연계 페이지로 리다이렉트
						response.sendRedirect( BaseUrlProperty.oldBizUrl + "/filter/index.jsp?serviceid=" + serviceid + param);
						return;
					}
				}
			}
		}

		// Base64 인코딩 필요: 파라미터 조작의 난이도를 높이기 위해
		String encString = Base64.getEncoder().encodeToString(param.getBytes());
		response.sendRedirect("/popup.jsp?w2xPath="+ w2xPath +"&param=" + encString); 
	} catch (Exception ex) {
		AppLog.error("popup error:", ex);
		response.sendRedirect("/cm/html/error.html");
	}
%>