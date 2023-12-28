package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testenq")
public class TestEnq extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");
		
//		System.out.println(name+qtype+body);
		
		String errorMsg = "";
		if (name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if (qtype == null || qtype.length() == 0) {
			errorMsg += "種類が入力されていません<br>";
		}
		if (body == null || body.length() == 0) {
			errorMsg += "内容が入力されていません<br>";
		}
		
		String msg = "名前:" + name + "<br>種類:" + qtype + "<br>内容:" + body;
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head><body>");
		if (errorMsg.length() > 0) {
			out.println("<p style='color:red'" + errorMsg + "</p>");
		} else {
			out.println("<p>" + msg + "</p>");
		}
		out.println("</body></html>");
		
	}

}
