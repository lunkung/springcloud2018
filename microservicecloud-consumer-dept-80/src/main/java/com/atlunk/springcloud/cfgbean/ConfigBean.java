package com.atlunk.springcloud.cfgbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration//boot->@Configuration configBean = applicationContext.xml
public class ConfigBean {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
/*
 * @Bean
 * public UserService getUserService(){
 * }
 */
//applicationContext.xml
//<bean id="userService" class="com.atlunk.springcloud.cfgbean.ConfigBean"></bean>