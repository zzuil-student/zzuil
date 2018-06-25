package com.briup.apps.poll.config;

/*
 * 解决跨域问题
 * 
 * 让所有人都能访问我们的接口
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","POST","PUT","OPTIONS","DELETE","PATCH").allowCredentials(true).maxAge(3600);
	}
	
}
