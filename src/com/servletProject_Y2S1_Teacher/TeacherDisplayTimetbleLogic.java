package com.servletProject_Y2S1_Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.servletProject_Y2S1_Student.TimeTables;

public class TeacherDisplayTimetbleLogic {
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public ArrayList<TimeTables> giveTimeTables(String id) {

		
		ArrayList<TimeTables> table = new ArrayList<TimeTables>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);
			
			
			PreparedStatement st = con.prepareStatement("select period,subject,class from timetable where tid = ? order by period");
			
			st.setString(1, id);
			
			ResultSet rs = st.executeQuery();
			int i=0;
			
			while(rs.next()) {
				
				TimeTables tt = new TimeTables();
				tt.setPeriod(rs.getString(1));
				tt.setSubject(rs.getString(2));
				tt.setTid(rs.getString(3));
				
				table.add(tt);
				
				
			}
			
			
			
			return table;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return table;
	}
}
