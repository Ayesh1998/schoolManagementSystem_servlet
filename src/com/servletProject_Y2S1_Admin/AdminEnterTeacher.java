package com.servletProject_Y2S1_Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminEnterTeacher
 */
@WebServlet("/AdminEnterTeacher")
public class AdminEnterTeacher extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = (String) request.getParameter("id");
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		String nid = (String) request.getParameter("nid");
		String position = (String) request.getParameter("position");

		String dob = (String) request.getParameter("dob");
		int mno = Integer.valueOf(request.getParameter("mno"));
		String gender = (String) request.getParameter("gender");
		String address = (String) request.getParameter("address");

		String save = (String) request.getParameter("save");
		String password = (String) request.getParameter("password");

		AdminEnterTeacherLogic student = new AdminEnterTeacherLogic();

		String result = student.adminEnterTeacher(id, nid, fname, lname,position, dob, mno, gender, address, save, password);
		
		PrintWriter out = response.getWriter();

		out.println(result);

		if (result.equals("saved")) {

			response.sendRedirect("adminEnterTeachersDataSaveSuccesful.jsp");

		} else {
			
			response.sendRedirect("adminEnterTeachersDataSavedUnsuccesful.jsp");

		}

	}

}
