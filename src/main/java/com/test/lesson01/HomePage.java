package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("")
public class HomePage extends HttpServlet {	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>실습한 것들</title></head><body>");
		out.println("<h1>lesson01</h1>");
		out.println("<ul>");
		out.println("<li><a href=\"/hello\">/Hello world!</a></li>");
		out.println("<li><a href=\"/lesson01/ex01\">/lesson01/ex01</a></li>");
		out.println("<li><a href=\"/lesson01/ex02\">/lesson01/ex02</a></li>");
		out.println("<li><a href=\"/lesson01/ex03.html\">/lesson01/ex03.html</a></li>");
		out.println("<li><a href=\"/lesson01/quiz01\">/lesson01/quiz01</a></li>");
		out.println("<li><a href=\"/lesson01/quiz02\">/lesson01/quiz02</a></li>");
		out.println("<li><a href=\"/lesson01/quiz03\">/lesson01/quiz03</a></li>");
		out.println("<li><a href=\"/lesson01/quiz04\">/lesson01/quiz04</a></li>");
		out.println("<li><a href=\"/lesson01/quiz05.html\">/lesson01/quiz05.html</a></li>");
		out.println("<li><a href=\"/lesson01/quiz06.html\">/lesson01/quiz06.html</a></li>");
//		out.println("<li><a href=\"/lesson01/quiz09\">/lesson01/quiz09</a></li>");
//		out.println("<li><a href=\"/lesson01/quiz010\">/lesson01/quiz10</a></li>");
		out.println("Day04");
		out.println("<li><a href=\"/lesson01/ex04.html\">/lesson01/ex04.html</a></li>");
		out.println("<li><a href=\"/lesson01/ex05.html\">/lesson01/ex05.html</a></li>");
		out.println("<li><a href=\"/lesson01/quiz07.html\">/lesson01/quiz07.html</a></li>");
		out.println("<li><a href=\"/lesson01/quiz08.html\">/lesson01/quiz08.html</a></li>");
		out.println("<ul>");
		
		out.println("</body></html>");
		
		
	}
}
