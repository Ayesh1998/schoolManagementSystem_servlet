package hashara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TeacherShowProfileLogic{
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public ArrayList<Teacher> giveTeacherProfile(String id) {

		
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			PreparedStatement st = con.prepareStatement("select  id,nid,fname,lname,position,dob,mno,gender,address from teachers where id = ? ");

			st.setString(1, id);

			ResultSet rs = st.executeQuery();
		
			
			while(rs.next()) {
				
				Teacher t1 = new Teacher();
				t1.setID(rs.getString(1));
				t1.setNid(rs.getString(2));
				t1.setFname(rs.getString(3));
				t1.setLname(rs.getString(4));
				t1.setPosition(rs.getString(5));
				t1.setDob(rs.getString(6));
				t1.setMno(rs.getInt(7));
				t1.setGender(rs.getString(8));
				t1.setAddress(rs.getString(9));
				//t1.setPassword(rs.getString(10));
				
				teacher.add(t1);
				
				
			}
			
			
			
			return teacher;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return teacher;
	}
}
