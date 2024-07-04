package sessiontracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class SaveDataInSDession extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession h1 = req.getSession();
		HttpSession h2 = req.getSession();
		
//		System.out.println(h1);
//		System.out.println(h2);
		
		h1.setAttribute("id", 1);
		h1.setAttribute("name", "Rajesh");
		h1.setAttribute("status", true);
		
		System.out.println(h1.getAttribute("id"));
		System.out.println(h1.getAttribute("name"));
		
		System.out.println(h1.getAttribute("dob"));
	}
	
}
