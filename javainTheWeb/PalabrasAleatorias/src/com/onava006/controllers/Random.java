package com.onava006.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onava006.models.RandomGenerator;

/**
 * Servlet implementation class Random
 */
@WebServlet("/Random")
public class Random extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public Random() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String attribute = "count";
		HttpSession session = request.getSession();
		RandomGenerator rg;		
		Integer length; //=  Integer.parseInt((request.getParameter("length")));

		try {
			length =  Integer.parseInt((request.getParameter("length")));
		}catch(Exception e){
			length = 10;
		}		

		if(session.getAttribute(attribute) == null) {
			Integer counter = 0; 
			rg = new RandomGenerator(counter, length);
			session.setAttribute(attribute, rg);			
		} else {
			rg = (RandomGenerator)session.getAttribute(attribute);		
			rg.ResetLength(length);
		}			

		request.setAttribute(attribute, rg);

		RequestDispatcher rp = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
		rp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
