package generic_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/hellw")
public class ValidationCheck extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Servlet is run");
		String email = req.getParameter("gmail");
		String password = req.getParameter("pwd");
		if(email.equals("raj65@gmail.com") && password.equals("1234")) {
		RequestDispatcher rd = req.getRequestDispatcher("Welcome.html");
		rd.forward(req, res);	
	}
		else {
			PrintWriter p = res.getWriter();
			p.print("<h1> invalid credancials </h1>");
			
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req, res);	
		}
	}
	
}
