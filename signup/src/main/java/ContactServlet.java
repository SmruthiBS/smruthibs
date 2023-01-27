import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		System.out.println("created " + getClass().getSimpleName());
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created dopost");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String number = req.getParameter("mobile");
		String commet = req.getParameter("comments");
		//Long mobile = Long.parseLong(number);

		System.out.println(name);
		System.out.println(email);
		System.out.println(number);
		System.out.println(commet);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body align=\"center\">");
		writer.print("<h1>");
		if (name.length() > 3 && email.length() > 3 && number.length() == 10 && commet.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign up sucessfully");
			writer.print("</span>");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("Plese provide valid information");
			writer.print("</span>");
		}

		writer.print("</h1>");
		writer.print("<a href=\"index.html\">home </a>");
		writer.print("<br>");
		writer.print("<a href=\"contact.html\">give another response</a>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
	}
}
	

		
		
		
		
	
	
				
				
	