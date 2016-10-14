import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkLogin")
public class loginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		 
		    PrintWriter out = response.getWriter();  
		          
		    String name = request.getParameter("username");  
		    String pass = request.getParameter("userpass");  
		    
		    if(name.equals("rk") && pass.equals("cg")){
		    	RequestDispatcher rd = request.getRequestDispatcher("MyInfo.html");
		    	rd.forward(request, response);
		    	
		    }else{
		    	out.print("Invalid Login..!!");
		    	 RequestDispatcher rd=request.getRequestDispatcher("ErrorHandler");  
		    }
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		doGet(req, resp);
	}
}
