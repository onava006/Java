package com.onava006.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String attribute = "guesser";
		HttpSession session = request.getSession();
		RequestDispatcher rp;
		Integer defaultmin = 1;
		Integer defaultmax = 100;

		if(session.getAttribute(attribute) == null) {	
			session.setAttribute("min", defaultmin);
			session.setAttribute("max", defaultmax);
			rp = request.getRequestDispatcher("/WEB-INF/view/indice.jsp");
			rp.forward(request, response);

		} else {
			rp = request.getRequestDispatcher("/Main");
			rp.forward(request, response);
		}	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
