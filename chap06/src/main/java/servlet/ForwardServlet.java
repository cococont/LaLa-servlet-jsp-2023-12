package servlet;

import java.io.IOException;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "WEB-INF/jsp/forward.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
//		RequestDispatcher d =
//				request.getRequestDispatcher(url);
//		d.forward(request, response);
	}

}
