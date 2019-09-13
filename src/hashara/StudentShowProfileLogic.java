package hashara;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentShowProfileLogic {
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public ArrayList<Student> giveStudentProfile(String id) {

		
		ArrayList<Student> student = new ArrayList<Student>();
		
			System.out.println(id);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			PreparedStatement st = con.prepareStatement("select schoolID,nationalID,fname,lname,class,dob,mobileNO,gender,address,parentName,parentMobileNO from student where schoolID = ? ");

			st.setString(1, id);

			ResultSet rs = st.executeQuery();
		
			
			while(rs.next()) {
				
				Student s1 = new Student();
				s1.setSchoolID(rs.getString(1));
				s1.setNationalID(rs.getString(2));
				s1.setFname(rs.getString(3));
				s1.setLname(rs.getString(4));
				s1.setClass(rs.getString(5));
				s1.setDob(rs.getString(6));
				s1.setMobileNO(rs.getInt(7));
				s1.setGender(rs.getString(8));
				s1.setAddress(rs.getString(9));
				s1.setParentName(rs.getString(10));
				s1.setParentMobileNO(rs.getInt(11));
				//s1.setPassword(rs.getString(12));
				
				student.add(s1);
				
				
			}
			
			
			
			return student;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return student;
	}
}

