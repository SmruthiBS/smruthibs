package com.xworkz.signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
System.out.println("location servlet created");
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running do post");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String source=req.getParameter("start");
	String destination=req.getParameter("destination");
	String gender=req.getParameter("gender");
	System.out.println(name);
	System.out.println(email);
	System.out.println(source);
	System.out.println(destination);
	System.out.println(gender);
	PrintWriter writer=resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	
	writer.print("<span style='color:pink;'>");
	if(name.length()>3&&email.length()>3&&source.length()>3&&destination.length()>3&&gender.length()>3) {
	writer.print(" data saved sucessfully ");}
	else {
		writer.print("invalid data input again");
	}
	

	writer.print("<br>");

	writer.print("</span>");
	writer.print("<a href=\"index.html\">home </a>");
	writer.print("<br>");
	writer.print("<a href=\"locationhtml.html\">give another response</a>");

	writer.print("</body>");
	writer.print("</html>");

	resp.setContentType("text/html");

	
}
}
