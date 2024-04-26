package controlle.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("error", null);
		req.setAttribute("logout", null);
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String logt = req.getParameter("logout");
		  if (logt==null||logt.equals("")) {
			  String login = req.getParameter("username");
				String clef = req.getParameter("password");
				if (login == null || clef == null) {
					req.setAttribute("error", "Erreur d'authentification");
					req.setAttribute("logout", "");
					req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
				} else {
					if (login.equals("admin") && clef.equals("passer")) {
						HttpSession session = req.getSession();
						session.setAttribute("isConnected", true);
						resp.sendRedirect("/usersService/home/");
					}else {
						//resp.getWriter().println("<H1>Erreur de connxion !!!<H1>");
						req.setAttribute("error", "Erreur d'authentification");
						req.setAttribute("logout", null);
						req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
					}
				}
		}
		  else {
			  	HttpSession session = req.getSession();
			  	if (session!=null)session.invalidate();
				req.setAttribute("logoute", "Vous êtes bien déconnecté");
				req.setAttribute("error", "");
				req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
			  }
		}
}
