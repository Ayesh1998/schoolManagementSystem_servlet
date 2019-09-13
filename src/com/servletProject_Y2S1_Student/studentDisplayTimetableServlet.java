package com.servletProject_Y2S1_Student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/studentDisplayTimetableServlet")
public class studentDisplayTimetableServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentDisplayTimetbleLogic timetables = new StudentDisplayTimetbleLogic();
		
		HttpSession session = request.getSession();
		
		String id1 = session.getAttribute("userID").toString();
		
				
		request.setAttribute("table", timetables.giveTimeTables(id1));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentDisplayTimetable.jsp");
		dispatcher.forward(request, response);
		
	}

}
