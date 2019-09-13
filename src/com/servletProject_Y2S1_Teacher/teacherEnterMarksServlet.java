package com.servletProject_Y2S1_Teacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/teacherEnterMarksServlet")
public class teacherEnterMarksServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String id = (String) request.getParameter("sid");
		int marks = Integer.valueOf( request.getParameter("marks") );
		String subject = (String) request.getParameter("subject");
		String sclass = (String) request.getParameter("class");
		
		TeacherEnterMarksLogic stu_marks = new TeacherEnterMarksLogic();
		
		String result = stu_marks.teacherEnterMarks(id,subject,sclass,marks);
		
		
		 PrintWriter out = response.getWriter();
		 
		 out.println(result);
		
		if (result.equals("saved")) {

			response.sendRedirect("enteringMarksSuccesful.jsp");

		} else {
			
			response.sendRedirect("enteringMarksSavedUnsuccesful.jsp");

		}

	}

}
