

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ctxserv
 */
@WebServlet("/Ctxserv")
public class Ctxserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Ctxserv() {
        // TODO Auto-generated constructor stub
    }

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("-----*-----*-----*-----*------*------*------*-------");
		
		ServletContext ctx=getServletContext();
		String name=ctx.getInitParameter("Name");
		System.out.println(name);
		
		ctx.setAttribute("age","21");
		String age=(String) ctx.getAttribute("age");
		out.print(age);
		
		Enumeration<String> e=ctx.getInitParameterNames();
		String str="";
		while(e.hasMoreElements()){
			str=e.nextElement();
			out.println("<br>"+"NAME:"+str);
			out.print("VALUE:"+ctx.getInitParameter(str));
			
		}
		/*Enumeration<String> headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
		  String headerName = (String)headerNames.nextElement();
		  System.out.println(req.getHeader(headerName));
		}
		Enumeration<String> params = req.getParameterNames(); 
		while(params.hasMoreElements()){
		 String paramName = (String)params.nextElement();
		 System.out.println("Attribute Name - "+paramName+", Value - "+req.getParameter(paramName));
		}*/
		out.println("<br>"+"-----*-----*-----*-----*------*------*------*-------");
		out.close();
	}

}
