package com.servletProject_Y2S1_Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminEnterStudent
 */
@WebServlet("/AdminEnterStudent")
public class AdminEnterStudent extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = (String) request.getParameter("id");
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		String sclass = (String) request.getParameter("class");
		String nid = (String) request.getParameter("nid");

		String dob = (String) request.getParameter("dob");
		String mno = (String)(request.getParameter("mno"));
		String gender = (String) request.getParameter("gender");
		String address = (String) request.getParameter("address");
		String pname = (String) request.getParameter("pname");
		String pmno = (String)(request.getParameter("pmno"));

		String save = (String) request.getParameter("save");
		String password = (String) request.getParameter("password");
		
		String delete = (String) request.getParameter("delete");
		
		String id1 = (String) request.getParameter("id1");

		AdminEnterStudentLogic student = new AdminEnterStudentLogic();

		String result = student.adminEnterStudent(id, nid, fname, lname, sclass, dob, mno, gender, address, pname, pmno,
				save, password,delete,id1);

		PrintWriter out = response.getWriter();

		out.println(result);

		if (result.equals("saved")) {

			response.sendRedirect("adminEnterStudentsDataSaveSuccesful.jsp");

		} else if (result.equals("notSave")){
			
			response.sendRedirect("adminEnterStudentsDataSavedUnsuccesful.jsp");

		} else if (result.equals("Check above columns again")){
			
			response.sendRedirect("adminDeleteStudentsDataSavedSuccesful.jsp");

		} else if (result.equals("notdelete")){
			
			response.sendRedirect("adminDeleteStudentsDataSavedUnsuccesful.jsp");

		}

	}

}
