

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginserv
 */
@WebServlet("/Loginserv")
public class Loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginserv() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("FROM_LOGIN");
		
		RequestDispatcher rd=req.getRequestDispatcher("link.html");
		rd.include(req, res);
		
		String name=req.getParameter("name");
		 String password=req.getParameter("password");
		 
		 if(password.equals("movit")){  
	            out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name);  
	              
	            Cookie ck=new Cookie("name",name);  
	            res.addCookie(ck);  
	        }else{  
	            out.print("sorry, username or password error!");  
	            req.getRequestDispatcher("login.html").include(req, res);  
	        }  
	          
	        out.close();  
	}

}
