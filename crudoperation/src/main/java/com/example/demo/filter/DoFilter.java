package com.example.demo.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		List<String> list = Arrays.asList("ta","ml","kn","te");
		HttpServletRequest req = (HttpServletRequest) request;
		String key = req.getHeader("x-api-key");
		String langunage = req.getHeader("Accept-Language");
		if(key == null) {
			((HttpServletResponse)response).setStatus(403);
			  response.getOutputStream().write("API Key is missing!".getBytes());
	            return;
		}
		
		if(!list.contains(langunage)) {
			((HttpServletResponse)response).setStatus(406);
			  response.getOutputStream().write("Invalid headers!".getBytes());
	            return;
		}else {
			log.error("request will be accepted----------->");
		}
		
		String keyValidator = "abcd";
		if(!keyValidator.equals(key)) {
            ((HttpServletResponse) response).setStatus(403);
            response.getOutputStream().write("API Key is invalid".getBytes());
            return;
        }
		
		
		// TODO Auto-generated method stub
		
	}

}
