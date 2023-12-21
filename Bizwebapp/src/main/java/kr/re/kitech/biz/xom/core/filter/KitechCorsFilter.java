/**
 * 
 */
package kr.re.kitech.biz.xom.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mortbay.jetty.HttpStatus;

/**
 * 
 * @author James
 * @since 2022. 7. 20.
 */
public class KitechCorsFilter implements Filter {


	@Override
	public void destroy() {
		// Do nothing
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
    	// 허용할 Method 목록
		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
		httpResponse.setHeader("Access-Control-Max-Age", "3600");
    	// 허용할 Header 목록
		httpResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with, Origin, content-type, Accept, X-XSRF-TOKEN, Authorization, submissionid, mbiSvc");
    	// 허용할 다른 출처 도메인 목록
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");
		HttpServletRequest req = (HttpServletRequest) request;
		if ("OPTIONS".equals(req.getMethod())){
			httpResponse.setStatus(HttpStatus.ORDINAL_200_OK);
		} else {
			chain.doFilter(request, response);
		}
	}
}