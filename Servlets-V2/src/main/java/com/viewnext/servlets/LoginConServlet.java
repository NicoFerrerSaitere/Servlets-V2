package com.viewnext.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginConServlet")
public class LoginConServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginConServlet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("usuario");
		String contra = request.getParameter("pass");
		if ((usuario == null) || usuario.trim().equals("") || (contra == null) || (contra.trim().equals(""))) {

			out.println("No has rellenado los campos ");

		} else if (usuario.toLowerCase().equals("nico") && (contra.toString().equals("12345"))) {

			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");

			out.println("Usuario:");
			out.println(usuario);
			out.println("<br>");
			out.println("Password:");
			out.println(contra);

			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");

			out.println("No eres un usuario registrado");

			out.println("</body>");
			out.println("</html>");
		}

	}
}
