package kr.re.kitech.biz.xom.core;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.tongfei.progressbar.ProgressBar;
import me.tongfei.progressbar.ProgressBarBuilder;


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
public class SpeedDisplayTest {
    @Test
    public void test() {
       try (ProgressBar bar = new ProgressBarBuilder().showSpeed().setInitialMax(12000).build()) {
	        int x = 0;
	        while (x < 10000) {
	            bar.step();
	            Thread.sleep(1);
	            x++;
	        }
        } catch (InterruptedException ex) {
        	ex.printStackTrace();
    	}
    }

    @Test
    public void testSpeedFormat() throws InterruptedException {
        ProgressBar bar = new ProgressBarBuilder()
                .showSpeed(new DecimalFormat("#.##"))
                .setUnit("k", 1000)
                .setInitialMax(10000)
                .build();
        int x = 0;
        while (x < 10000) {
            bar.step();
            Thread.sleep(1);
            x++;
        }

        bar.close();
    }
}