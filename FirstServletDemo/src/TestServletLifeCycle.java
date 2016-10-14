import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestServlet")
public class TestServletLifeCycle extends HttpServlet {

	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init()");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		System.out.println("init(config)");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("service(HttpServletReq,HttpServletRes)");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
		System.out.println("service(ServletRequest)");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		System.out.println("doGet()");
		ServletContext servletContext = getServletContext();
		String mydata = (String) servletContext.getInitParameter("data");
		servletContext.setAttribute("data", mydata);
		System.out.println(servletContext.getAttribute("data"));
		
		
		HttpSession session = req.getSession(true);
		
		session.setAttribute("firstname", "Ravindra");
		session.setAttribute("lastname", "Chavan");
		
		PrintWriter pw = resp.getWriter();
		
		pw.print(session.getId());
		pw.print(session.isNew());
		pw.print(session.getAttribute("name"));
		
		RequestDispatcher rd = req.getRequestDispatcher("/SecondServlet");
    	rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		System.out.println("doPost");
		doGet(req,resp);
	}
	
}
