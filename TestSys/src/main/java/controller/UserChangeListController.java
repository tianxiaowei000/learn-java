package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;

/**
 * Servlet implementation class UserChangeListController
 */
@WebServlet("/userchange")
public class UserChangeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserChangeListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email = request.getParameter("email");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String nameKana =  request.getParameter("nameKana");
		
		
	   request.setAttribute("email", email);
	   request.setAttribute("userId", userId);
	   request.setAttribute("password", password);
	   request.setAttribute("name", name);
	   request.setAttribute("nameKana", nameKana);
		
	
	
		
	     UserService userService = new UserService();
		
		userService.changeUserInfo(email,userId,password,name,nameKana);
	
		
		System.out.print(email);
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/userList.jsp");

		rd.forward(request, response);
	

	}

	}


