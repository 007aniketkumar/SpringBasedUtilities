/**
 * 
 */
package com.ani.springutility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author aniket
 *
 *This class is the replacement of spring.xml
 *
 *All the dependencies ,beans are passed from here
 *
 *
 */


@Configuration
@PropertySource(value = {"classpath:/employee.properties"})
public class ApplicationConfiguration {

	@Bean
	public EmployeeBean empBeanid() {
		return new EmployeeBean();
	}
	
	 /*
     * PropertySourcesPlaceHolderConfigurer Bean only required for @Value("{}") annotations.
     * Remove this bean if you are not using @Value annotations for injecting properties.
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
