package kr.re.kitech.biz.xom.base;

import javax.servlet.ServletContextEvent;

import com.inswave.elfw.core.ElContextLoaderListener;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.base.manager.MenuCacheManager;

/**
 *
 */
public class BizContextLoaderListener extends ElContextLoaderListener {
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
	    super.contextInitialized(event);
	    // 프로젝트 공통 코드 로딩시 적재
	    CodeCacheManager.getInstance().load();
	    AppLog.info("ContextInitialized -code cached complate !!");
	    MenuCacheManager.getInstance().load();
	    AppLog.info("ContextInitialized -menu cached complate !!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		super.contextDestroyed(event);
		
		AppLog.info("ContextDestroyed !!");    	   
				
	}	
}
