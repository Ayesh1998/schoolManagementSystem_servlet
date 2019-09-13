package com.servletProject_Y2S1_Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentUpdatePassServlet")
public class studentUpdatePassServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = (String) request.getParameter("sid");
		String prePass = (String) request.getParameter("prePass");
		String newPass = (String) request.getParameter("newPass");
		
		StudentUpdatePassLogic update = new StudentUpdatePassLogic();
		
		String result = update.checkPass(id, prePass, newPass);
		
		if(result.equals("invalidID")) {
			response.sendRedirect("updateStuPassInvalidID.jsp");
		}
		else if(result.equals("Updated")) {
			response.sendRedirect("updateStuPassSuccess.jsp");
		}
		else if(result.equals("prePassInvalid")) {
			response.sendRedirect("updateStuPassUnSuccess.jsp");
		}
		else if(result.equals("error")) {
			response.sendRedirect("updateStuPassError.jsp");
		}
		
		PrintWriter out = response.getWriter();
		out.println(result);
		
	}

}
