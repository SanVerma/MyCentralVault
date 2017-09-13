package san.servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletRequestParamaters extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        
        String firstName = request.getParameter("firstname");
        
        String lastName = request.getParameter("lastname");

      /*  System.out.println("ServletRequestParamaters - doGet");
        
        System.out.println(firstName);
        
        System.out.println(lastName);*/

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request Parameters</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Parameters Example</h3>");
        out.println("Parameters in this request:<br>");
        if (firstName != null || lastName != null) {
            out.println("First Name:");
            out.println(" = " + firstName + "<br>");
            out.println("Last Name:");
            out.println(" = " + lastName);
        } else {  
            out.println("No Parameters, Please enter some");
        }
        out.println("<P>");
        out.print("<form action=ServletRequestParamaters method=POST>");
        out.println("First Name:");
        out.println("<input type=text size=20 name=firstname>"); 
        out.println("<br>");
        out.println("Last Name:");
        out.println("<input type=text size=20 name=lastname>");
        out.println("<br>");
        out.println("<input type=submit>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        doGet(request, response);
    }
    
    
    StringBuilder getHtmlStartBody(String Title){
    	
    	StringBuilder htmlBody = new StringBuilder();
    	htmlBody.append("<html>");
    	htmlBody.append("<head>");
    	htmlBody.append("<title>"+Title+"</title>");
    	htmlBody.append("</head>");
    	htmlBody.append("<body>");
    	
		return htmlBody;
    }
    

    StringBuilder getHtmlEndBody(String Title){
    	
    	StringBuilder htmlBody = new StringBuilder();
    	htmlBody.append("</body>");
    	htmlBody.append("</html>");
     	
		return htmlBody;
    }
}