package servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Player;

@WebServlet("/game")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Integer com = (Integer) session.getAttribute("com");
		if (com == null) {
			com = new Random().nextInt(99) + 1;
			session.setAttribute("com", com);
		}
		
		int user = Integer.parseInt(request.getParameter("user"));
//		int com = new Random().nextInt(9) + 1;
		Player p = new Player();
		p.setNumber(user);
		String msg = gameCheck(user, com);
		if (msg == "正解") {
			com = new Random().nextInt(99) + 1;
			session.setAttribute("com", com);
		}
		p.setMsg(msg);
//		request.setAttribute("msg", msg);
		request.setAttribute("player", p);
//		String url = "WEB-INF/jsp/gameResult.jsp";
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	public String gameCheck(int user, int com) {
		if (user == com) {
			return "正解";
		} else if (user < com) {
			return "小さい";
		} else {
			return "大きい";
		}
	}
}
