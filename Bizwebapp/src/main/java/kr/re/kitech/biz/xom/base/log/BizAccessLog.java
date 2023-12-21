/**
 * 
 */
package kr.re.kitech.biz.xom.base.log;

import java.nio.charset.Charset;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.RollingFileAppender;
import org.apache.logging.log4j.core.appender.rolling.DefaultRolloverStrategy;
import org.apache.logging.log4j.core.appender.rolling.TimeBasedTriggeringPolicy;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.layout.PatternLayout;

import com.inswave.elfw.ElConfig;
import com.inswave.elfw.util.PropUtil;

/**
 * 
 * @author James
 * @since 2022. 9. 21.
 */
public class BizAccessLog {
	private static final String LOG_FILENAME = "access";
	private static Logger logger = null; 

	static {
		// Application 업무 DB 설정을 이용하여 경로 지정
		String logDir = PropUtil.getDBPropValue("EL_CORE_PROP", "ACCESS_LOG_DIR");

		if ((logDir == null) || (logDir.equals(""))) {
			logDir = ElConfig.getApplicationLogDir();
		}

		String elServerId = System.getProperty("inswave.server.id");
		if (elServerId == null) {
			String elBatchJobId = System.getProperty("inswave.batch.job.id");
			if ((elBatchJobId == null) || ("".equals(elBatchJobId)))
				elServerId = "";
			else {
				elServerId = elBatchJobId;
			}
		}

		String logDirectory = logDir + "/" + (0 < elServerId.length() ? elServerId + "/" : "");
		String logFileName = LOG_FILENAME;

		logger = (Logger) LogManager.getLogger(LOG_FILENAME + "Logger");

		LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		Configuration config = ctx.getConfiguration();

		PatternLayout layout = PatternLayout.newBuilder()
			.withPattern("%d{yyyy-MM-dd HH:mm:ss}%m%n")
			.withCharset(Charset.forName("UTF-8"))
			.build();

		TimeBasedTriggeringPolicy policy = TimeBasedTriggeringPolicy.newBuilder()
			.withInterval(1)
			.withModulate(true)
			.build(); 

		DefaultRolloverStrategy strategy = DefaultRolloverStrategy.newBuilder()
			.withMax("30")
			.withMin("1")
			.withStopCustomActionsOnError(true)
			.withConfig(config)
			.build();

		RollingFileAppender appender = RollingFileAppender.newBuilder().setName("dailyFile").setLayout(layout)
			.withFileName(logDirectory + logFileName + ".log")
			.withFilePattern(logDirectory + logFileName + ".%d{yyyy-MM-dd}.log")
			.withAppend(true)
			.withBufferedIo(true)
			.withBufferSize(512)
			.withPolicy(policy)
			.withStrategy(strategy)
			.build();


		logger.addAppender(appender);
		logger.setLevel(Level.INFO);
		appender.start();
	}

	public static Level getLevel() {
		return logger.getLevel();
	}

	public static void write(String message) {
		logger.error(message);
	}
}