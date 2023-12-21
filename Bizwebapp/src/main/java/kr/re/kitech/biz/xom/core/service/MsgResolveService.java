package kr.re.kitech.biz.xom.core.service;

import java.util.Locale;
import java.util.Map;


public interface MsgResolveService {
	public String getMessage(String key, Object[] arguments, Locale locale);
	public Map<String, Map<String,String>> getMessages(Locale locale);
}
