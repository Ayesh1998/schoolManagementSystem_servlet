package com.servletProject_Y2S1_Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminEnterTeacherLogic {
	
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String adminEnterTeacher(String id, String nid, String fname, String lname,String position, String dob,
			int mno, String gender, String address,  String save, String password) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			if (save.equals("save")) {

				PreparedStatement st = con
						.prepareStatement("insert into teachers values ( ?, ?, ?, ?,  ?,  ?,  ?,  ?,  ?,  ?  ) ");

				st.setString(1, id);
				st.setString(2, nid);
				st.setString(3, fname);
				st.setString(4, lname);
				st.setString(5, position);
				st.setString(6, dob);
				st.setInt(7, mno);
				st.setString(8, gender);
				st.setString(9, address);
				st.setString(10, password);

				int i = st.executeUpdate();

				if (i == 1) {
					return "saved";
				} else {
					return "notSave";
				}

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return "Check above columns again";

	}

}
