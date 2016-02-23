package demo.spring.base.prop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyPlaceHoderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
}
