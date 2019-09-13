package com.servletProject_Y2S1_Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentUpdatePassLogic {

	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String checkPass(String id, String prePass, String newPass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			PreparedStatement st = con.prepareStatement("select password from student where schoolID = ? ");

			st.setString(1, id);

			ResultSet rs = st.executeQuery();

			if (false == (rs.next())) {
				return "invalidID";
			}

			String prePassCheck = rs.getString("password");

			if (prePassCheck.equals(prePass) == true) {

				PreparedStatement st1 = con.prepareStatement("update student set password = ? where schoolID = ? ");

				st1.setString(1, newPass);
				st1.setString(2, id);

				int rs1 = st1.executeUpdate();

				return "Updated";

			}

			 else {
				return "prePassInvalid";
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return "error";
	}
}
