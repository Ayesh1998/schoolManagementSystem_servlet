package com.servletProject_Y2S1_Admin;

import java.sql.*;

public class AdminEnterStudentLogic {

	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String adminEnterStudent(String id, String nid, String fname, String lname, String sclass, String dob,
			String mno, String gender, String address, String pname, String pmno, String save, String password, String delete,String id1) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			if (save.equals("save")) {

				PreparedStatement st = con
						.prepareStatement("insert into student values ( ?, ?, ?, ?,  ?,  ?,  ?,  ?,  ?,  ?,  ? , ?) ");

				st.setString(1, id);
				st.setString(2, nid);
				st.setString(3, fname);
				st.setString(4, lname);
				st.setString(5, sclass);
				st.setString(6, dob);
				st.setString(7, mno);
				st.setString(8, gender);
				st.setString(9, address);
				st.setString(10, pname);
				
				int pmno1 = Integer.parseInt(pmno);
				st.setInt(11, pmno1);
				st.setString(12, password);

				int i = st.executeUpdate();

				if (i == 1) {
					return "saved";
				} else {
					return "notSave";
				}

			}
			if (delete.equals("delete")) {
				
				PreparedStatement st1 = con
						.prepareStatement("delete from student where schoolID = ? ");
				
				
				int id11 = Integer.parseInt(id1);

				st1.setInt(1, id11);
				

				int i = st1.executeUpdate();

			
				if (i == 1) {
					return "deleted";
				} else {
					return "notdelete";
				}
				
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return "Check above columns again";

	}

}
