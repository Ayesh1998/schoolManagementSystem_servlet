package harsha;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/StudentDisplayExamTimeTableServlet")
public class StudentDisplayExamTimeTableServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		StudentDisplayExamTimeTableLogic timetables = new StudentDisplayExamTimeTableLogic();
		
		HttpSession session = request.getSession();
		
		String id1 = session.getAttribute("userID").toString();
				
		request.setAttribute("table", timetables.giveExamTimeTables(id1));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentDisplayExamTimetable.jsp");
		dispatcher.forward(request, response);
		
	}

}
