package com.onava006.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onava006.models.Dog;

/**
 * Servlet implementation class Dogs
 */
@WebServlet("/Dogs")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Dogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String name;
	String breed;
	String weight;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");		
		checkParameters(request);
		
		Dog perro = new Dog(name,breed, Integer.parseInt(weight));
		
		request.setAttribute("name",perro.getName());		
		request.setAttribute("breed", perro.getBreed());
		request.setAttribute("action", perro.showAffection());


		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dog.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	void checkParameters(HttpServletRequest request) {
		name = request.getParameter("nombreperro");
		breed = request.getParameter("razaperro");
		weight = request.getParameter("pesoperro");
		
		
		if(name == null || name.isBlank() || name.isEmpty()) {
			name = "Pellito sin nombre";
		}
		if (breed == null || breed.isBlank() || breed.isEmpty()) {
			breed = "Kiltro";
		}
		if (weight == null || weight.isBlank() || weight.isEmpty()) {
			weight = "1";
		}		
		
	}
}

