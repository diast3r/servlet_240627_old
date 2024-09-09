package com.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*") // => 모든 주소에 대해 필터링할 것임.
public class CharacterEncodingFilter implements Filter { // javax.servlet.Filter로 선택.
	// 클래스명에 뜨는 에러
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 필터를 통과할 때 인코딩
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		chain.doFilter(request, response); // 이거 빼먹으면 적용 안 됨.
		
		
	} 
	
}
