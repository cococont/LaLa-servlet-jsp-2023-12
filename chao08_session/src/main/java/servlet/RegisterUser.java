package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = null;
		
		String action = request.getParameter("action");
		
		if (action == null) {
			forwardPath = "WEB-INF/jsp/registerForm.jsp";
		} else if (action.equals("done")) {
			HttpSession session = request.getSession();
			User registerUser = (User) session.getAttribute("registerUser");
			
			RegisterUserLogic logic = new RegisterUserLogic();
			String msg = null;
			if (logic.execut(registerUser)) {
				msg = "登録成功";
			} else {
				msg = "登録失敗";
			}
			request.setAttribute("msg", msg);
			session.removeAttribute("registerUser");
			forwardPath = "WEB-INF/jsp/registerDone.jsp";
		}
		
		request.getRequestDispatcher(forwardPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String path = request.getParameter("path");
		
		User registerUser = new User(id, name, path);
		
		HttpSession session = request.getSession();
		session.setAttribute("registerUser", registerUser);
		
		String url = "WEB-INF/jsp/registerConfirm.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
