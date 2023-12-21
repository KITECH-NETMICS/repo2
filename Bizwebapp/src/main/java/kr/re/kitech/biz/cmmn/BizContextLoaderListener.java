package kr.re.kitech.biz.cmmn;

import javax.servlet.ServletContextEvent;

import com.inswave.elfw.core.ElContextLoaderListener;
import com.inswave.elfw.log.AppLog;

public class BizContextLoaderListener extends ElContextLoaderListener {
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
	    super.contextInitialized(event);
	    
	    AppLog.debug("BizContextLoaderListener - contextInitialized ...");    	   
		
	}
	 
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		super.contextDestroyed(event);
		
		AppLog.debug("BizContextLoaderListener - contextDestroyed ...");    	   
				
	}	
}
