package com.viewnext.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
/**
 * @author preetham
 *
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		System.out.println("FirstServlet Constructor called!");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("FirstServlet \"Init\" method called");
	}

	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		System.out.println("FirstServlet \"Destroy\" method called");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("FirstServlet \"Service\" method(inherited) called");
		System.out.println("FirstServlet \"DoGet\" method called");

		storeInSessionAndRespond(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("FirstServlet \"Service\" method(inherited) called");
		System.out.println("FirstServlet \"DoPost\" method called");

		storeInSessionAndRespond(request, response);

	}

	private void storeInSessionAndRespond(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String emailId = request.getParameter("email");
		System.out.println("Username from jsp page is " + uname + " and email id is " + emailId);
		// Create a session
		HttpSession session = request.getSession(true);
		if (session != null) {
			// store the attributes
			session.setAttribute("uname", uname);
			session.setAttribute("emailId", emailId);
			System.out.println("Username and email id is stored in the session");
		}

		out.write("<html><body><h4>Check console to understand the flow</h4></body></html>");
		out.write(
				"<html><body><h2>Username and email id is stored in the session, go back and click on \"TestSession\" to test the session</h2></body></html>");
	}

	protected void inicioSesion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String usuario = request.getParameter("uname");
			String email = request.getParameter("email");
			if (usuario.equals("nico") && email.equals("admin@email.com")) {
				response.sendRedirect("usuarioRegistrado.html");
			} else {
				response.sendRedirect("usuarioNoRegistrado.html");
			}
		} finally {
			out.close();
		}
	}

}
