package kr.re.kitech.biz.xom.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.vo.CodeMapVo;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

@RunWith(SpringJUnit4ClassRunner.class)
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
public class CodeTest {

	@Test
	public void test(){
		
		List<String> grpCodes = null; // Arrays.asList("HWT.XAD.HAG.XAA".split("[.]"));
		System.out.println(grpCodes);
	
		CodeCacheManager manager = CodeCacheManager.getInstance();
		manager.load();
		CodeMapVo retCodes = manager.getGrpCodes(grpCodes, "CommonCode");
		Map<String, List<CodeVo>> codeMap = retCodes.getCodeMap();
		
		int[] index ={0};
		codeMap.forEach((key, value) -> {
//			System.out.println( key + ", value = " + value);
			System.out.print("["+ (++index[0]) + "]" + key + " ==> [");
			value.forEach(element -> {
				System.out.print(element.getComCd()+",");
			});
			System.out.println("]");
		});
		
		
		System.out.println("Task Done...");
	}
}
