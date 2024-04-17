package com.viewnext.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginConServlet")
public class LoginConServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String usuario = request.getParameter("usuario");
		String contra = request.getParameter("pass");
		if ((usuario == null) || usuario.trim().equals("") || (contra == null) || (contra.trim().equals(""))) {

			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");

			out.println("No has rellenado los campos ");
			out.println("<br>");
			out.println("<br>");
			out.println("<a href=\"LoginConServlet.jsp\"> Inicio de Sesion</a>");

			out.println("</body>");
			out.println("</html>");

		} else if (usuario.equalsIgnoreCase("nico") && (contra.equals("12345"))) {

			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");

			out.println("Usuario:");
			out.println(usuario);
			out.println("<br>");
			out.println("Password:");
			out.println(contra);
			out.println("<br>");
			out.println("<br>");
			out.println("<a href=\"LoginConServlet.jsp\"> Inicio de Sesion</a>");

			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<head></head>");
			out.println("<body>");

			out.println("No eres un usuario registrado");
			out.println("<br>");
			out.println("<a href=\"LoginConServlet.jsp\"> Inicio de Sesion</a>");

			out.println("</body>");
			out.println("</html>");
		}

	}
}
