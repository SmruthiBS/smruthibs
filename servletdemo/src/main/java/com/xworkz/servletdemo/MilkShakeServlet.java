package com.xworkz.servletdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 6,urlPatterns = "/milkshake")
public class MilkShakeServlet extends HttpServlet {
	public MilkShakeServlet() {
	System.out.println("created milkshake servlet");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("calling doget from milkshake servlet");
	}

}
