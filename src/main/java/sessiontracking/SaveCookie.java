package sessiontracking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class SaveCookie extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie c1 = new Cookie("id","1");
		Cookie c2 = new Cookie("name","Rajesh");
		
		c1.setMaxAge(10);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		resp.getWriter().print("<h1> save successfully </h1>");
	}
}
