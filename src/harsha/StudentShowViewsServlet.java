package harsha;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentShowViewsServlet")
public class StudentShowViewsServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentShowViewsLogic timetables = new StudentShowViewsLogic();
				
		request.setAttribute("table", timetables.giveStudentProfiles());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentShowViews.jsp");
		dispatcher.forward(request, response);
		
	}

}

