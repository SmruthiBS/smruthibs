
package com.xworkz.servletdemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5,urlPatterns = "/bestie")
public class bestFriendServlet extends HttpServlet {
	public bestFriendServlet() {
		System.out.println("created bestfriend servlet");
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("calling doget from bestfriendsevlet");
}

}
