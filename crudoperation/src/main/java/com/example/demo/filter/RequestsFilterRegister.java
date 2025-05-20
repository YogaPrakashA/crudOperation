package com.example.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RequestsFilterRegister {

	@Bean
	public FilterRegistrationBean<DoFilter> filterRegistrationBean() {

		
		FilterRegistrationBean<DoFilter> reqBean = new FilterRegistrationBean<>();

		reqBean.addUrlPatterns("/employee/*");

		return reqBean;
	}

}
