package kr.re.kitech.biz.xom.core;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;


/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
		  "file:src/main/resources/inswave/spring/context-common.xml"
		, "file:src/main/resources/inswave/spring/context-properties.xml"
		, "file:src/main/resources/inswave/spring/context-sqlMap.xml"
		, "file:src/main/resources/inswave/spring/context-transaction.xml"
		, "file:src/main/resources/inswave/spring/context-validator.xml"
		, "file:src/main/resources/inswave/spring/mybatis-config.xml"
		, "file:src/test/resources/inswave/spring/context-datasource.xml"
		, "file:src/test/resources/inswave/spring/context-inswave.xml"
		, "file:src/main/webapp/WEB-INF/config/**/*.xml"
})
public class MsgControllerTest {

	Logger log = (Logger) LoggerFactory.getLogger(MsgControllerTest.class);
	
	@Inject
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {		
		log.debug("*************** JUnit Setup Started ***************");
		System.out.println("*************** JUnit Setup Started ***************");
		MockServletContext sc = new MockServletContext("");
        ServletContextListener listener = new ContextLoaderListener(wac);
        ServletContextEvent event = new ServletContextEvent(sc);
        listener.contextInitialized(event);
		
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		
		log.debug("*************** JUnit Setup Finished ***************");
		System.out.println("*************** JUnit Setup Finished ***************");
	}
	
//	@Test
//	public void testLoginFrm() throws Exception {
//		// 로그인 페이지
//		mockMvc.perform(get("/CmmLoginFrm.do")
//                .param("id", "1111")
//                .param("pw", "22"))
//                .andDo(print())
//                .andExpect(status().isOk());
//        System.out.println("========================");
//	}
	
	/**
     * 	{elData: {id: "eipparkji", pw: ",thinks99"}}
			elData: {id: "eipparkji", pw: ",thinks99"}
			id: "eipparkji"
			pw: ",thinks99"
	 */
	@Test
	public void testLogin() throws Exception {
		// 로그인
		mockMvc.perform(
					 post("/SvcComLogin.pwkjson")
					.contentType(MediaType.APPLICATION_JSON)
					.content("{'id': 'eipparkji', 'pw': ',thinks99'}")
				)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{'id': 'eipparkji', 'pw': ',thinks99'}"))     ;
	}
	
	@Test
	public void testDempMenuList() throws Exception {
		// 사원 목록 조회
		mockMvc.perform(get("/SvcMenuList.pwkjson"))
				.andDo(print())
				.andExpect(status().isOk());
	}
	

	
}
