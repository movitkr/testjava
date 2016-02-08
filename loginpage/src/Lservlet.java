

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lservlet
 */
@WebServlet("/Lservlet")
public class Lservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String un=req.getParameter("user");
		String ps=req.getParameter("pass");
		
		if(ps.equals("movit"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("Wlservlet");
			rd.forward(req, res);
		}
		else
		{
			out.println("invalid password");
			RequestDispatcher rd=req.getRequestDispatcher("/wel.html");
			rd.include(req, res);
			
		}
		
		
	}

}
