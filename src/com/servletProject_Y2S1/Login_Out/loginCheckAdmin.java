package com.servletProject_Y2S1.Login_Out;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginCheckAdmin {

	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	boolean result;
	
	public boolean check(String userID, String password) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, name, pass);

			PreparedStatement st = con.prepareStatement("select * from admin where id=? and password= ? ");

			st.setString(1, userID);
			st.setString(2, password);

			ResultSet rs = st.executeQuery();

			if (rs.next()) {

				result = true;
			}

			else {

				result = false;

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return result;

	}
}
