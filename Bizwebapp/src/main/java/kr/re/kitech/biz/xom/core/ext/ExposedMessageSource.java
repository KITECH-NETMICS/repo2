package kr.re.kitech.biz.xom.core.ext;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.inswave.elfw.log.AppLog;

/**
 * 리로드어블 메시지 번들 확장 클래스
 *  - 다건 메시지 조회 기능 추가
 *  
 * @author James
 */
@Component("messageSource")
public class ExposedMessageSource extends ReloadableResourceBundleMessageSource {

	@Override
	protected Properties loadProperties(Resource resource, String filename) throws IOException {
		AppLog.info("__James Debug Load filename: " + filename);
		return super.loadProperties(resource, filename);
	}

	/**
	 * Gets all messages for presented Locale.
 	 *
	 * @param locale user request's locale 
	 * @return all messages
	 */
	public Properties getMessages(Locale locale) {
		return super.getMergedProperties(locale).getProperties();
	}
}
