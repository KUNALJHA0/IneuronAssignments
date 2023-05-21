import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet(urlPatterns="/test")
public class TestServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		doProcess(request,response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		doProcess(request,response);
	}

	public void doProcess(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String name = request.getParameter("username");
        
        // Set the content type of the response
        response.setContentType("text/html");
        
        // Get the PrintWriter object to write the response
        PrintWriter out = response.getWriter();
        
        // Generate the welcome message
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome, " + name + "!</h1>");
        out.println("</body>");
        out.println("</html>");	}
	
}
