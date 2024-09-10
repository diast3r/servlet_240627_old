package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 응답 헤더 세팅
		// 주석 추가
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title></title></head><body>");

		// request params
		String keyword = request.getParameter("keyword").trim();
		if (keyword == "") {
			out.println("<script>alert(\"공백을 입력하지 마세요.\");</script>");
			return;
		}
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
//		for (int i = 0; i < list.size(); i++) {
//			String text = list.get(i);
//			if (text.contains(keyword)) {
//				out.println(text + "<br>");
//			}
//			
//		}
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i);
			if (text.contains(keyword)) {
				// 맛집 -> <b>맛집</b>
				// 1) replace()로 출력
//				out.println(text.replace(keyword, "<b>" + keyword + "</b>") + "<br>");
				
				// 2) split()으로 출력
//				String[] words = text.split(keyword); // index: 0, 1
//				out.println(words[0] + "<b>" + keyword + "</b>" + words[1] + "<br>");
				
				// 3) substring()으로 출력
//				int index = list.get(i).indexOf(keyword);
//				out.println(list.get(i).substring(0, index));
//				out.println("<b>" + list.get(i).substring(index, index + keyword.length()) + "</b>");
//				out.println(list.get(i).substring(index + keyword.length(), list.get(i).length()) + "<br>");
				
				
			}
		}
		
		out.println("</body></html>");
		
		
	}
}
