package kr.re.kitech.biz.xom.core.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.inswave.elfw.ElConstants;
import com.inswave.elfw.log.AppLog;
import com.inswave.elfw.util.ElBeanUtils;

import kr.re.kitech.biz.xom.base.model.BizUserHeader;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.core.service.AccntService;


/**
 * WebSquare Xml 페이지 직접접근을 핸들링 하기 위한 필터
 *
 * @author James
 * @since 2022. 3. 28.
 */
public class XmlAccessFilter implements Filter {
	private List<String> excludes;
	
	
	
	/**
	 * 해당 URL 이 권한 검증이 필요한지 판별한다.
	 * @param url
	 * @return
	 */
	private boolean isRequireUrl(String url) {

		// 유효 파라미터가 아니면 체크 불필요.
		if (StringUtils.isEmpty(url)) return false;
		
		// /ui/로 시작하면서 /ui/apr/, /ui/xom/, /ui/zam/ 폴더를 제외
        final Pattern pattern = Pattern.compile("^\\/ui\\/(?!apr\\/|xom\\/|zam\\/).*");
        final Matcher matcher = pattern.matcher(url);

        // System.out.println("[" + url + "]====> " + (matcher.matches() ? "권한 체크 필요" : "권한 체크 제외"));
		return (!excludes.contains(url) && matcher.matches());
	}
	


	private void sendError(HttpServletRequest request, HttpServletResponse response){
	    try {
		    
		    ServletContext context = request.getSession().getServletContext();
		    String contextRootPath = context.getRealPath("/");
		    System.out.println("contextRootPath >>>> " + contextRootPath);
	
	        // HTML 파일을 읽어서 내용을 가져옵니다.
		    byte[] encoded = Files.readAllBytes(Paths.get(contextRootPath + "/cm/xml/AccessDenied.xml"));
	        String htmlContent = new String(encoded, StandardCharsets.UTF_8);
	
	        // 컨텐츠 타입 및 인코딩을 설정합니다.
	        response.setContentType("text/html");
	        response.setCharacterEncoding("UTF-8");
	
	        // 응답에 HTML 내용을 씁니다.
	        PrintWriter out = response.getWriter();
	        out.println(htmlContent);
	        out.flush();
	    } catch(IOException e) {
	        AppLog.error("Error while sending custom error page.", e);
	    }
	}
	
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		String excludes = config.getInitParameter("excludedUrls");
	    this.excludes = Arrays.asList(excludes.split(","));	
	    AppLog.debug("==============] excluded urls [==============");
	    this.excludes.forEach( url -> AppLog.debug(url));
	}
	
	/**
	 * Note: URL 로 serviceID 를 가져올 수 있다면 좀 더 나은 퍼포먼스가 나올 수 있겠으나  URL 과 ServiceID 가 1:N 관계이므로 처리할 수 없음
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		// 1. 권한 체크가 필요한 URL 아 아니라면 종료.
		String url = req.getServletPath();
		if (!this.isRequireUrl(url)){
			chain.doFilter(request, response); return;
		}

		// 2. 세션이 없다면 종료.
		BizUserHeader userHeader = (BizUserHeader)req.getSession().getAttribute(ElConstants.USER_HEADER_STRING); // ProWorks5 Login Session 	
		if (null == userHeader) { // ProWorks5 Session Check
			chain.doFilter(request, response); return;
		}
		SessionUserHeader session = userHeader.getSession();
		AppLog.debug("- userHeader : " + session);
		
		try {

			AccntService accntService = (AccntService)ElBeanUtils.getBean("accntServiceImpl");

			// 권한 검증 대상 URL 이라면: 제외할 url들이 아니면 동작할 로직
			Boolean isAccessDenied= accntService.isPermissionError(session.getUid(), session.getRoleCode(), url);
			AppLog.debug("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			AppLog.debug("isAccessDenied : ", "[" + url + "]_[" + "[" + session.getUid() + "]_[" + isAccessDenied.toString()+ "]");
			AppLog.debug("+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:+:");
			if (isAccessDenied){
				sendError(req, res);
				return;
			}
		} catch (Exception ex) {
			AppLog.error("Permission Check Error", ex);
			sendError(req, res);
			return;
		}

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}	
}
