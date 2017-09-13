package san.servlet;

import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletRequestInfo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        
        ArrayList fileNames = new ArrayList();
        PrintWriter out = response.getWriter();

        String S1 ="ABCDEF";       
        

        for (int i=1; i<1000;i++)
        {
        	String S2 = S1+i;
        }
        out.println("<html>");  
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Servlet Request  Information Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information Example</h3>");
        out.println("Method: "      + request.getMethod());
        out.println("Request URI: " + request.getRequestURI());
        out.println("Protocol: "    + request.getProtocol());
        out.println("PathInfo: "    + request.getPathInfo());
        out.println("Remote Address: " + request.getRemoteAddr());
  
        
        out.println("</body>");
        out.println("</html>");
        
        
        
    }

    /**
     * We are going to perform the same operations for POST requests
     * as for GET methods, so this method just sends the request to
     * the doGet method.
     */

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        doGet(request, response);
    }
}