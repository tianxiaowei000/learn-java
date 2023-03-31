package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;

/**
 * Servlet implementation class confirmation
 */
@WebServlet("/UserConfirmationController")
public class UserConfirmationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserConfirmationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);


		request.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String userId = (String) session.getAttribute("userId");
		String password = (String) session.getAttribute("password");
		String name = (String) session.getAttribute("name");
		String nameKana = (String) session.getAttribute("nameKana");

		UserService userservice = new UserService();
		userservice.createUser(email, userId, password, name, nameKana);

		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/completion.jsp");

		rd.forward(request, response);
	
	}

}
