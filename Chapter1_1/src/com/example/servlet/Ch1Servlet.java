package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Ch1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException,IOException{
		// ServletRequest has method getWriter() to get PrintWriter object
		PrintWriter out = response.getWriter();
		// simply create current Date object:
		java.util.Date today = new java.util.Date();
		// using PrintWriter earlier created object we use to create html page
		// Its not recommended do this way, but for purpose of this training:
		
		out.println("<html> "
				+ "<body> "
				+ "<h1 align=center>Head First Servlet & JSP Chapter 1_1</h1><br>"
				+ "today is : <b>"+ today + "</b></body>"
				+ "</html>");
	}
}
