package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class ExIncludeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException{

		req.setAttribute("name","java");

		PrintWriter out = res.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");

		ServletContext sc = getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/ExInclude2Servlet");

		rd.include(req,  res);

		out.println("</BODY>");
		out.println("</HTML>");

	}

}
