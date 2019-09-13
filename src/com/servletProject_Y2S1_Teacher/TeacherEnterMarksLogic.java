package com.servletProject_Y2S1_Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TeacherEnterMarksLogic {
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String teacherEnterMarks(String id, String subject, String grade, int marks) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			PreparedStatement st = con.prepareStatement("insert into student_marks values ( ?, ?, ?, ?) ");

			st.setString(1, id);
			st.setString(2, subject);
			st.setString(3, grade);
			st.setInt(4, marks);

			int i = st.executeUpdate();

			if (i == 1) {
				return "saved";
			} else {
				return "notSave";
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return "theres a error";

	}
}