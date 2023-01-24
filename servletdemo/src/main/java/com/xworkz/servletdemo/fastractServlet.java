package com.xworkz.servletdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup  = 4,urlPatterns = "/watch")
public class fastractServlet extends HttpServlet {
	public fastractServlet() {
		System.out.println("created fastract servlet");
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("calling doget in fastract servlet");
}
}
