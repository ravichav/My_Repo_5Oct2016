import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		// Set response content type
	      response.setContentType("text/html");
	      
	     
	      // Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
		  String title = "Reading All Form Parameters";
	      String docType =
	      "<!doctype html public \"-//w3c//dtd html 4.0 " +
	      "transitional//en\">\n";
	      out.println(docType +
	        "<html>\n" +
	        "<head><title>" + title + "</title></head>\n" +
	        "<body bgcolor=\"#f0f0f0\">\n" +
	        "<h1 align=\"center\">" + title + "</h1>\n" +
	        "<table width=\"100%\" border=\"1\" align=\"center\">\n" +
	        "<tr bgcolor=\"#949494\">\n" +
	        "<th>Param Name</th><th>Param Value(s)</th>\n"+
	        "</tr>\n");
	  
	      Enumeration paramNames =  request.getParameterNames();
	      while(paramNames.hasMoreElements())
	      {
	    	  String paramName = (String) paramNames.nextElement();
	    	  
	    	  String[] paramValues = request.getParameterValues(paramName);
	    	  
	    	  if (paramValues.length == 1) {
	              String paramValue = paramValues[0];
	              if (paramValue.length() == 0)
	                out.println("<i>No Value</i>");
	              else
	                out.println(paramValue);
	            } else {
	                // Read multiple valued data
	                out.println("<tr><td><ul>");
	                for(int i=0; i < paramValues.length; i++) {
	                   out.println("<li>" + paramValues[i]);
	                }
	                out.println("</td></ul>");
	            }
	      } // End while
	      out.println("</tr>\n</table>\n</body></html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
	
}
