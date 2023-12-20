package p83;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello2Serblet")
public class Hello2Serblet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request,
    		HttpServletResponse response)
    				throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("hello HTTP2");
		out.println("</html>");
	}

}
