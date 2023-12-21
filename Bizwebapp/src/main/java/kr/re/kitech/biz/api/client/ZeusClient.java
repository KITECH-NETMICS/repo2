package kr.re.kitech.biz.api.client;

import java.util.Map;

public interface ZeusClient {
	public String sendRequestMnt(String path, Map<String,Object> params) throws Exception;
}
