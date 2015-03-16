package UebWeb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<center>");
		pw.println("<h1>Guten Tag</h1>");
		pw.println("<h2>Heute ist Montag der 03. M&auml;rz 2015.</h2>");
		pw.println("<h3>Sie haben soeben die ersten Schritte in der Web-Programmierung getan!</h3>");
		pw.println("</center>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
