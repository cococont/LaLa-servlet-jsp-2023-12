package servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Human;

@WebServlet("/HumanServlet")
public class HumanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Human human = new Human("湊 雄輔", 23);
		
		ServletContext application = this.getServletContext();
		
		application.setAttribute("human", human);
		System.out.println("ApplicationScorpeに保存しました");
		
		Human h = (Human) application.getAttribute("human");
		
//		application.removeAttribute("human");
	}

}
