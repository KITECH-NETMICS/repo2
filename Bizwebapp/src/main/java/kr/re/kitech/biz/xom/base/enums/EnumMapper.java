package kr.re.kitech.biz.xom.base.enums;

import java.util.LinkedHashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.re.kitech.biz.com.enums.Numberings;

/**
 * 
 */
@Configuration
public class EnumMapper {
	@Bean
	public EnumMapperFactory createEnumMapperFactory() {
		EnumMapperFactory enumMapperFactory = new EnumMapperFactory(new LinkedHashMap<>());
		enumMapperFactory.put("Exceptions", Exceptions.class);
		enumMapperFactory.put("Business", Business.class);
		enumMapperFactory.put("Numberings", Numberings.class);
		enumMapperFactory.put("Attaches", Attaches.class);
		
		return enumMapperFactory;
	}
}
