package com.onava006.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onava006.model.NumberGenerator;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Main() {
		super();

	}
	Integer min = 1;
	Integer max = 100;
	Integer guess = 0;
	String attribute = "guesser";

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		NumberGenerator ng = new NumberGenerator(min, max);
		request.setAttribute(attribute, ng);
		HttpSession session = request.getSession();
		session.setAttribute(attribute, ng);
		RequestDispatcher rp = request.getRequestDispatcher("/WEB-INF/view/indice.jsp");
		rp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			HttpSession session = request.getSession();
			NumberGenerator ng;		
			try {
				guess = Integer.parseInt(request.getParameter("guess"));
			}catch (Exception e){
				guess = (int)((Integer)session.getAttribute("min") + (Integer)session.getAttribute("max"))/ 2;				
			}		
			if(session.getAttribute(attribute) == null ) {		
				ng = new NumberGenerator((Integer)session.getAttribute("min"), (Integer)session.getAttribute("max"));
				session.setAttribute(attribute, ng);				
			} else {
				ng = (NumberGenerator)session.getAttribute(attribute);					
			}
			
			ng.checkGuessedNumber(guess);	
			session.setAttribute("min",ng.getmin());
			session.setAttribute("max", ng.getmax());
			request.setAttribute(attribute, ng);
			RequestDispatcher rp = request.getRequestDispatcher("/WEB-INF/view/indice.jsp");
			rp.forward(request, response);			
			
		}	
	}





