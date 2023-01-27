package com.xworkz.city;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/place")
public class CityServlet extends HttpServlet {
	public CityServlet() {
		System.out.println("created cityservlet");
	}
	@Override
	public void init() throws ServletException {
	System.out.println("running init in city servlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running toget in city servlet");
	String name=req.getParameter("city name");
	String state=req.getParameter("state");
	String country=req.getParameter("country");
	String OtherName=req.getParameter("othername");
	String famousPlace=req.getParameter("famous place");
	String population=req.getParameter("population");
	String metro=req.getParameter("metro");
	String oldName=req.getParameter("old name");
	String area=req.getParameter("area");
	String famousmall=req.getParameter("mall");
	String noOfAreas=req.getParameter("areas");
	String famousStreet=req.getParameter("street");
	String airport=req.getParameter("airport");
	String capital=req.getParameter("capital");
	String safe=req.getParameter("safe");
	String famousTemple=req.getParameter("temple");
	String elevation =req.getParameter("elevation");
	String code=req.getParameter("code");
	String founder=req.getParameter("founder");
	String mayor=req.getParameter("mayor");
	System.out.println(name);
	System.out.println(state);
	System.out.println(country);
	System.out.println(OtherName);
	System.out.println(famousPlace);
	System.out.println(population);
	System.out.println(metro);
	System.out.println(oldName);
	System.out.println(area);
	System.out.println(famousmall);
	System.out.println(noOfAreas);
	System.out.println(famousStreet);
	System.out.println(airport);
	System.out.println(capital);
	System.out.println(safe);
	System.out.println(famousTemple);
	System.out.println(elevation);
	System.out.println(code);
	System.out.println(founder);
	System.out.println(mayor);
	PrintWriter writer = resp.getWriter();
	writer.print("<html>");
	writer.print("<body>");
	writer.print("<h1 >");
	writer.print("<span style='color:pink;'>");
	writer.print("city data sent sucessfully");
	writer.print("<br>");
	
	writer.print("</span>");
	writer.print("</h1>");
	writer.print("</body>");
	writer.print("</html>");

	resp.setContentType("text/html");
	
	}

}
