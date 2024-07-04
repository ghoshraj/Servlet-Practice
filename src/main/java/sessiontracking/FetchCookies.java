package sessiontracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchCookies extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method 
		Cookie []c1 = req.getCookies();
		
		for(int i = 0;i <c1.length; i++) {
			Cookie c2 = c1[i];
			System.out.println(c2.getName());
			System.out.println(c2.getValue());
		}
	}
}
