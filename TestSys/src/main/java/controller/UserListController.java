package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.UserDto;
import service.UserService;

/**
 * Servlet implementation class UserListController
 */
@WebServlet("/userList")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("Shift_JIS");

		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		String userId = (String) session.getAttribute("userId");
		String password = (String) session.getAttribute("password");
		String name = (String) session.getAttribute("name");
		String nameKana = (String) session.getAttribute("nameKana");

	
		
		UserService userservice = new UserService();
		List<UserDto> list =userservice.userList();
     
		
		
		request.setAttribute("users", list);
		
		
		//getServletContext().getRequestDispatcher("/list.jsp").forward(request, response);
		
	
		String view = "/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
