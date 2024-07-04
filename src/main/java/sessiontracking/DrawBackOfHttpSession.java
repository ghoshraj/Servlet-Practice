package sessiontracking;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/data")
public class DrawBackOfHttpSession extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		
		HttpSession h1 = req.getSession();
		h1.setAttribute("email",email);
		h1.setAttribute("pwd", pwd);
		
		System.out.println(h1.getAttribute(pwd));
		System.out.println("done");
	}
}
