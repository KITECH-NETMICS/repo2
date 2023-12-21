package kr.re.kitech.biz.api.client;

import java.util.Map;

public interface AssZeusClient {
	public String sendRequestMnt(String path, Map<String,Object> params) throws Exception;
	
	public String sendRequestMnt(String asetNo) throws Exception;
}
