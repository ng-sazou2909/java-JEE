package controlle.servlets;

import java.io.IOException;
import java.util.List;
import controlle.dto.UtilisateurDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.impl.UtilisateurServiceImpl;

@WebServlet("/users")
public class UsersControler extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String add = req.getParameter("add");
		String id = req.getParameter("id");
		String deleteId = req.getParameter("deleteId");
		if (add!=null&&!add.equals("")) {
			req.setAttribute("client", new UtilisateurDTO());
			req.getRequestDispatcher("/WEB-INF/views/user/add.jsp").forward(req, resp);
		}else {
			if (id!=null&&!id.equals("")) {
				UtilisateurDTO user = UtilisateurServiceImpl.getById(id);
				req.setAttribute("client", user);
				req.getRequestDispatcher("/WEB-INF/views/user/update.jsp").forward(req, resp);
			}else {
				if (deleteId!=null&&!deleteId.equals("")) {
					UtilisateurServiceImpl.delete(deleteId);
					req.setAttribute("clients", UtilisateurServiceImpl.all());
					req.getRequestDispatcher("/WEB-INF/views/user/list.jsp").forward(req, resp);
				}else{
					req.setAttribute("clients", UtilisateurServiceImpl.all());
					req.getRequestDispatcher("/WEB-INF/views/user/list.jsp").forward(req, resp);	
				}
			}
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("adresse");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		UtilisateurDTO user = new UtilisateurDTO(null, nom, prenom, adresse, mail, phone);
		UtilisateurServiceImpl.save(user);
		resp.sendRedirect(req.getContextPath() +"/users");
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("adresse");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		UtilisateurDTO user = new UtilisateurDTO(id, nom, prenom, adresse, mail, phone);
		UtilisateurServiceImpl.update(user);
		resp.sendRedirect(req.getContextPath() +"/users");
	}
}