

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type=request.getParameter("Position");
		String user=request.getParameter("user");
		String passwd=request.getParameter("passwd");
		
		System.out.println("Username"+user);
		System.out.println("Password"+passwd);
		String htmlRespone = "<html>";
		htmlRespone +="<title>"+type+"</title><br/>";
        htmlRespone += "<h2>Welcome " + user + "<br/>";      
        htmlRespone +="<a href='http://localhost:8080/LoginServlet/resume.html' class='btn btn-info'>Download resume</a>";
        htmlRespone += "</html>";
		PrintWriter out=response.getWriter();
		out.println(htmlRespone);
	}

}
