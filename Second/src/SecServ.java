

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecServ
 */
@WebServlet("/SecServ")
public class SecServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public  void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String name=req.getParameter("user");
		out.print("<html><body>");
		out.print("WELCOME :"+name);
		out.print("</body></html>");
		out.close();
		
		
	}

}
