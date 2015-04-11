package UebWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 663374057418656229L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String passw = req.getParameter("password");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<center>");
		pw.println("<h1>Sie haben versucht sich einzuloggen mit name = "+name +" und Passwort ="+ passw+". Dies ist Ihnen geglückt. Herzlich willkommen!</h1>");
		pw.println("</center>");
		pw.println("</body>");
		pw.println("</html>");
	}

	/**
	 * 
	 */

}
