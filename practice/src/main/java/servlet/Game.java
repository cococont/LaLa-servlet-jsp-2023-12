package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GameLogic;
import model.Hands;

@WebServlet("/Game")
public class Game extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		Hands hands = new Hands();
		GameLogic gameLogic = new GameLogic();
//		System.out.println(request.getParameter("user"));
		int user = Integer.parseInt(request.getParameter("user"));
		hands.setUser(user);
		gameLogic.createComHand(hands);
		gameLogic.gameResult(hands);
		application.setAttribute("hands", hands);
		
		String url = "WEB-INF/jsp/game.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
