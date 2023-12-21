/**
 * 
 */
package kr.re.kitech.biz.xom.core.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.inswave.elfw.log.AppLog;

/**
 * 
 * @author James
 * @since 2022. 10. 20.
 */
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpUtil{
	public static final MediaType JSON = MediaType.Companion.parse("application/json;charset=utf-8");
	public static final MediaType XML = MediaType.Companion.parse("application/xml;charset=utf-8");
	
    @Autowired
    private static OkHttpClient  okHttpClient;

    
    /**
     * get
	 *
     * @param url endpoint
     * @param queries queryString  or null
     * @return
     */
    public static  String get(String url, Map<String,String> queries) {
        String responseBody = "";
        StringBuffer sb = new StringBuffer(url);
        if (queries != null && !queries.isEmpty()) {
            boolean firstFlag = true;
            Iterator<Entry<String,String>> iterator = queries.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator.next();
                if (firstFlag) {
                    sb.append("?" + entry.getKey() + "=" + entry.getValue());
                    firstFlag = false;
                } else {
                    sb.append("&" + entry.getKey() + "=" + entry.getValue());
                }
            }
        }
        Request request = new Request.Builder()
                .url(sb.toString())
                .build();
        Response response = null;
        try { 
            response = okHttpClient.newCall(request).execute();
            int status = response.code();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (Exception e) {
            AppLog.error("okhttp3 put error >> ex = {}", ExceptionUtils.getStackTrace(e));
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return responseBody;
    }

    /**
     * post
     *
     * @param url endpoint
     * @param params post form or null     
     * @return
     */
    public static String post(String url, Map<String,String> params) {
        String responseBody = "";
        FormBody.Builder builder = new FormBody.Builder();
        //    
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                builder.add(key, params.get(key));
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        Response response = null;
        try { 
            response = okHttpClient.newCall(request).execute();
            int status = response.code();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (Exception e) {
            AppLog.error("okhttp3 post error >> ex = {}", ExceptionUtils.getStackTrace(e));
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return responseBody;
    }

    /**
     * get
     * @param url url
     * @param queries queryString or null
     * @return
     */
    public static String getForHeader(String url, Map<String,String> queries) {
        String responseBody = "";
        StringBuffer sb = new StringBuffer(url);
        if (queries != null && queries.keySet().size() > 0) {
            boolean firstFlag = true;
            Iterator<Entry<String,String>> iterator = queries.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator.next();
                if (firstFlag) {
                    sb.append("?" + entry.getKey() + "=" + entry.getValue());
                    firstFlag = false;
                } else {
                    sb.append("&" + entry.getKey() + "=" + entry.getValue());
                }
            }
        }
        Request request = new Request.Builder()
                .addHeader("key", "value")
                .url(sb.toString())
                .build();
        Response response = null;
        try { 
            response = okHttpClient.newCall(request).execute();
            int status = response.code();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (Exception e) {
            AppLog.error("okhttp3 put error >> ex = {}", ExceptionUtils.getStackTrace(e));
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return responseBody;
    }

    /**
     * Post    JSON  ....{"name":"zhangsan","pwd":"123456"}
     *    ：  Url
     *    ：   JSON
     *    ：    
     */
    public static String postJsonParams(String url, String jsonParams) {
        String responseBody = "";
        RequestBody requestBody = RequestBody.Companion.create( jsonParams, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Response response = null;
        try { 
            response = okHttpClient.newCall(request).execute();
            int status = response.code();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (Exception e) {
            AppLog.error("okhttp3 post error >> ex = {}", ExceptionUtils.getStackTrace(e));
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return responseBody;
    }

    /**
     * Post    xml  ....
     *    ：  Url
     *    ：   xmlString
     *    ：    
     */
    public static String postXmlParams(String url, String xml) {
        String responseBody = "";
        RequestBody requestBody = RequestBody.Companion.create( xml, XML);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        Response response = null;
        try { 
            response = okHttpClient.newCall(request).execute();
            int status = response.code();
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (Exception e) {
            AppLog.error("okhttp3 post error >> ex = {}", ExceptionUtils.getStackTrace(e));
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return responseBody;
    }
}