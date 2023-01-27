package com.xworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/kingdom")
public class KingSrevlet extends HttpServlet {
public KingSrevlet() {
	System.out.println("created "+getClass().getSimpleName());
}
@Override
	public void init() throws ServletException {
		System.out.println("running init in king servlet");
	}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in king servlet");
		String name = req.getParameter("king name");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("queens");
		String DOB = req.getParameter("dob");
		String DOD = req.getParameter("dod");
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOB);
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 >");
		writer.print("<span style='color:red;'>");
		writer.print("king name " + name + " is sent sucessfully");
		writer.print("<br>");
		writer.print("king's region " + region + " is sent sucessfully");
		writer.print("<br>");
		writer.print("king's no of queens " + noOfQueens + " is sent sucessfully");
		writer.print("<br>");
		writer.print("king,'s DOB " + DOB + " is sent sucessfully");
		writer.print("<br>");
		writer.print("king's DOD " + DOD + " is sent sucessfully");
		writer.print("<br>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}
	}

