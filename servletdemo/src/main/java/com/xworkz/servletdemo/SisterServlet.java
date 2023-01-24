package com.xworkz.servletdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.HttpHeaderSecurityFilter;
@WebServlet(loadOnStartup = 7,urlPatterns = "/sister")
public class SisterServlet extends HttpServlet {
	public SisterServlet() {
	System.out.println("created sister servlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("calling doget from sister servlet");
	}

}
