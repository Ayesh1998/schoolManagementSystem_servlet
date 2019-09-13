package com.servletProject_Y2S1.Login_Out;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.cj.Session;

@WebServlet("/LoginAll")
public class logStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = (String) request.getParameter("name");
		String password = (String) request.getParameter("psw");

		loginCheckStudent log = new loginCheckStudent();

		if (log.check(id, password)) {

			HttpSession session = request.getSession();
			session.setAttribute("userID", id);

			response.sendRedirect("studentHome.jsp");
		}

		else {

			response.sendRedirect("studentLoginFail.jsp");

		}

	}

}
