

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cserv
 */
@WebServlet("/Cserv")
public class Cserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Cserv() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		ServletConfig cfg=getServletConfig();
		String name=cfg.getInitParameter("Name");
		System.out.println(name);
		
		Enumeration<String> e= cfg.getInitParameterNames();
		String s1="";
		while(e.hasMoreElements())
		{
	      s1=e.nextElement();
	      
	      out.println("NAME:"+s1);
	      
	      out.println(" VALUE:"+cfg.getInitParameter(s1));
		}
		out.close();
		
	}

}
