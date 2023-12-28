package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex62")
public class ex62 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = (int)(Math.random() * 10);
		int num2 = new Random().nextInt(10);
		if (i % 2 == 1) {
			String redirect = "redirected.jsp";
			response.sendRedirect(redirect);
		} else {
			String forward = "forwarded.jsp";
			request.getRequestDispatcher(forward).forward(request, response);
		}
	}

}
