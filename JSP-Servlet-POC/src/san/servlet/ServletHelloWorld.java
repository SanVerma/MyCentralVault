package san.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletHelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome to DevOps World</title>");
        String str=null;
        for (int i=0;i<100;i++){
        	 str =str+i;
        }
         
        
        out.println("</head>");   
        out.println("<body>");
        out.println("<h1>Hello World!"+str+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}