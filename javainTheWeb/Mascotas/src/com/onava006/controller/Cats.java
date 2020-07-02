package com.onava006.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onava006.models.Cat;

/**
 * Servlet implementation class Cats
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cats() {
        super();
        // TODO Auto-generated constructor stub
    }
    String name;
	String breed;
	String weight;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");		
		checkParameters(request);
		
		Cat gate = new Cat(name,breed, Integer.parseInt(weight));
		
		request.setAttribute("name",gate.getName());		
		request.setAttribute("breed", gate.getBreed());
		request.setAttribute("action", gate.showAffection());


		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/cat.jsp");
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
		name = request.getParameter("nombregato");
		breed = request.getParameter("razagato");
		weight = request.getParameter("pesogato");
		
		if(name == null || breed.isBlank() || breed.isEmpty()) {
			name = "gatito de la calle :( ";
		}
		if (breed == null || breed.isBlank() || breed.isEmpty()) {
			breed = "romano";
		}
		if (weight == null || weight.isBlank() || weight.isEmpty()) {
			weight = "1";
		}		
		
	}
}
