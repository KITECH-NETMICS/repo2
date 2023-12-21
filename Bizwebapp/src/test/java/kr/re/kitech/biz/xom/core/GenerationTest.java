package kr.re.kitech.biz.xom.core;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.re.kitech.biz.com.dao.GenerationDAO;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.com.vo.GenerationVo;

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
public class GenerationTest {
	/** GenerationService */
    @Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
    @Resource(name="generationDAO")
    private GenerationDAO generationDAO;    
    
	@Test
	public void test(){

        GenerationVo param = new GenerationVo();
        
        param.setRegst_syspayno("20130565"); // 등록자는 공통
        
        //문서번호채번 테스트
        //param.setNumbering(Numberings.DOCUMENT.getName());
        //param.setPrefix("C7A");
        
        //RCMS 테스트
        //param.setNumbering(Numberings.RCMS.getName());
        //param.setPrefix("F48");
        
        //결의번호 테스트
        //param.setNumbering(Numberings.SLIP.getName());
        param.setYr("22");
        param.setMonth("B");
        param.setSlip_typ_cd("110");
        
        
        
        //첨부파일용 테스트
        //param.setNumbering(Numberings.ATTACH.getName());
        //param.setPrefix("C21A");
        
        // 통제번호용 테스트
        // param.setNumbering(Numberings.S.getName());
        
        GenerationVo returnVo = generationDAO.selectGenerationSlipNumber(param);

        
        //String testGen = gen.getGen_no_seq();
        System.out.println("Task Done..." + returnVo);
	}
}
