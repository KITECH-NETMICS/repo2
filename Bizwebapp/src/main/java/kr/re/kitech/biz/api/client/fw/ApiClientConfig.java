/**
 * 
 */
package kr.re.kitech.biz.api.client.fw;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.inswave.elfw.ElConfig;

import okhttp3.ConnectionPool;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * 연계 클라이언 공통 모듈의 유일한 인스턴스 생성 및 그에 따른 관련 설정 관리 클래스
 * @author James
 * @since 2022. 10. 20.
 */
@Configuration
public class ApiClientConfig {
	public static final long KEEP_ALIVE_DURATIONS = 5L;	// Timeout 5 분
	public static final int MAX_IDLE_CONNECTIONS = 150;	// WebSphere 쓰래드 수: 150
	public static final int HANDSHAKE_TIMEOUT = 8000;
	public static final int REQUEST_TIMEOUT = 30000;
	public static final int RESPONSE_TIMEOUT = 150000;		
	public static final int HTTP_TIMEOUT = 180000;
	
	public static final MediaType JSON = MediaType.Companion.parse("application/json;charset=utf-8");
	public static final MediaType FORM = MediaType.Companion.parse("application/x-www-form-urlencoded");
	public static final MediaType MULTIPART = MediaType.Companion.parse("multipart/form-data");
	
    /**
	 * 연계 클라이언트 객체
     * @return OkHttpClient
     */
    @Bean("okHttpClient")
    public OkHttpClient okHttpClient() {
        return new OkHttpClient().newBuilder()
	        .retryOnConnectionFailure(false)
        	.addInterceptor(this.loggingInterceptor())
	        .connectionPool(this.connectionPool())
	        .connectTimeout(HANDSHAKE_TIMEOUT, TimeUnit.MILLISECONDS)	// time period in which our client should establish a connection with a target host.(handshake)
	        .writeTimeout(REQUEST_TIMEOUT, TimeUnit.MILLISECONDS)		// when sending the request to the server.
	        .readTimeout(RESPONSE_TIMEOUT, TimeUnit.MILLISECONDS)		// when waiting for the server's response.
	        .callTimeout(HTTP_TIMEOUT, TimeUnit.MILLISECONDS)			// It defines a time limit for a complete HTTP call
        .build();
    }


    /**
	 *  로그 객체
     * @return CsrLoggingInterceptor
     */
    @Bean
    public Interceptor loggingInterceptor() {
    	HttpLoggingInterceptor logger = new HttpLoggingInterceptor();
	    logger.setLevel(HttpLoggingInterceptor.Level.BASIC);
    	// logger.setLevel(HttpLoggingInterceptor.Level.HEADERS);
    	// logger.setLevel(HttpLoggingInterceptor.Level.BODY);
    	String level = ElConfig.getValue("APPLICATION_LOG_LEVEL", "INFO");
	    return StringUtils.equalsIgnoreCase(level, "DEBUG") ? new ApiLoggingInterceptor() : logger;    	
    }


    /**
     * Create a new connection pool with tuning parameters appropriate for a single-user application.
     * The tuning parameters in this pool are subject to change in future OkHttp releases. Currently
	 *
     * @return ConnectionPool
     */
    @Bean
    public ConnectionPool connectionPool() {
        return new ConnectionPool(MAX_IDLE_CONNECTIONS, KEEP_ALIVE_DURATIONS, TimeUnit.MINUTES);
    }    
}
