package com.servletProject_Y2S1_Teacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/teacherUpdatePassServlet")
public class teacherUpdatePassServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = (String) request.getParameter("tid");
		String prePass = (String) request.getParameter("prePass");
		String newPass = (String) request.getParameter("newPass");
		
		TeacherUpdatePassLogic update = new TeacherUpdatePassLogic();
		
		String result = update.checkPass(id, prePass, newPass);
		
		if(result.equals("invalidID")) {
			response.sendRedirect("updateTeaPassInvalidID.jsp");
		}
		else if(result.equals("Updated")) {
			response.sendRedirect("updateTeaPassSuccess.jsp");
		}
		else if(result.equals("prePassInvalid")) {
			response.sendRedirect("updateTeaPassUnSuccess.jsp");
		}
		else if(result.equals("error")) {
			response.sendRedirect("updateTeaPassError.jsp");
		}
		

	}

}
