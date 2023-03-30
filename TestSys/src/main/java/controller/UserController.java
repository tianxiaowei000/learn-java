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

/**
 * Servlet implementation class Add
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("GBK");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

//		String email = request.getParameter("email");
//		String email2 = request.getParameter("email2");
//		String radio_mail = request.getParameter("radio_mail");
//		String u = request.getParameter("u");
//		String p = request.getParameter("p");
//		String lname = request.getParameter("lname");
//		String fname = request.getParameter("fname");
//		String lname_kana = request.getParameter("lname_kana");
//		String fname_kana = request.getParameter("fname_kana");
//		
		
	
		String view = "/Practise.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	  
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email = request.getParameter("email");
		String email2 = request.getParameter("email2");
		String radiomail = request.getParameter("radio_mail");
		String userid = request.getParameter("u");
		String pwd = request.getParameter("p");
		String surname = request.getParameter("lname");
		String lastname = request.getParameter("fname");
		String surnamekana = request.getParameter("lname_kana");
		String lastnamekana = request.getParameter("fname_kana");
        
		
		

		HttpSession session = request.getSession();
//		session.setAttribute("email", email);
//		session.setAttribute("email2", email2);
//		session.setAttribute("radio_mail", radio_mail);
//		session.setAttribute("u", u);
//		session.setAttribute("p", p);
//		session.setAttribute("lname", lname);
//		session.setAttribute("fname", fname);
//		session.setAttribute("lname_kana", lname_kana);
//		session.setAttribute("fname_kana", fname_kana);
//		
		
		
		String userId = radiomail;
		String password = pwd;
		String name = surname+ lastname;
		String nameKana = surnamekana + lastnamekana;
		session.setAttribute("email", email);
		session.setAttribute("userId", userId);
		session.setAttribute("password", password);
		session.setAttribute("name", name);
		session.setAttribute("nameKana", nameKana);

		//
		session.setAttribute("email", email);
		session.setAttribute("email2", email2);
		session.setAttribute("radio_mail", radiomail);
		session.setAttribute("u", userid);
	    session.setAttribute("p", pwd);
		session.setAttribute("lname", surname);
		session.setAttribute("fname", lastname);
		session.setAttribute("lname_kana", surnamekana);
	    session.setAttribute("fname_kana", lastnamekana);
		
		
		
		
		
		

		ServletContext sc = this.getServletContext();
		
		RequestDispatcher rd = sc.getRequestDispatcher("/confirmation.jsp");

		rd.forward(request, response);
		
		
		
	}

}
