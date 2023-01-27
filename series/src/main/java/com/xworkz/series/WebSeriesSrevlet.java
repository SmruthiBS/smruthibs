package com.xworkz.series;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/web")
public class WebSeriesSrevlet extends HttpServlet {
	public WebSeriesSrevlet() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init in webseries servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in web series servlet");
		String name = req.getParameter("series name");
		String language = req.getParameter("series language");
		String episodes = req.getParameter("series episodes");
		String ott = req.getParameter("series ott");
		String budget = req.getParameter("series budget");
		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1 >");
		writer.print("<span style='color:blue;'>");
		writer.print("series name " + name + " is sent sucessfully");
		writer.print("<br>");
		writer.print("series language " + language + " is sent sucessfully");
		writer.print("<br>");
		writer.print("series episodes " + episodes + " is sent sucessfully");
		writer.print("<br>");
		writer.print("series ott " + ott + " is sent sucessfully");
		writer.print("<br>");
		writer.print("series budget " + budget + " is sent sucessfully");
		writer.print("<br>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}
}
