package kr.re.kitech.biz.xom.core.service.impl;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

import javax.annotation.Resource;

import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Service;


import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.xom.core.ext.ExposedMessageSource;
import kr.re.kitech.biz.xom.core.service.MsgResolveService;

@Service("msgResolveServiceImpl")
public class MsgResolveServiceImpl implements MsgResolveService {
	
	@Resource(name="messageSource")
	private ExposedMessageSource messageSource;

	@Override
	public String getMessage(String key, Object[] arguments, Locale locale) {
		String message = "";
		try {
			message = messageSource.getMessage(key, arguments, locale);
		} catch (NoSuchMessageException e) {
			message = key;
			AppLog.warn("No message found: " + key);
		}
		return message;
	}

	@Override
	public Map<String, Map<String,String>> getMessages(Locale locale) {
		Properties properties = this.messageSource.getMessages(locale);		
		Map<String, String> mssgeMap = new TreeMap<>();
		Map<String, String> labelMap = new TreeMap<>();
		for (Map.Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey() != null && entry.getValue() != null) {
				String key = entry.getKey().toString();
				String value = entry.getValue().toString();
				if (key.startsWith("label.")) {
					labelMap.put( key, value);
				} else {
					mssgeMap.put( key, value);				
				}
			}
		}
		
		Map<String, Map<String,String>> resultMap = new HashMap<>();
		resultMap.put("message", mssgeMap);
		resultMap.put("label", labelMap);
		return resultMap;
	}
}

