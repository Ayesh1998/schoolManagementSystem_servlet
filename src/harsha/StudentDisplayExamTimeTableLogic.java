package harsha;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class StudentDisplayExamTimeTableLogic {
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public ArrayList<ExamTimeTable> giveExamTimeTables(String id) {

		
		ArrayList<ExamTimeTable> table = new ArrayList<ExamTimeTable>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			PreparedStatement st = con.prepareStatement("select class from student where schoolID = ? ");

			st.setString(1, id);

			ResultSet rs1 = st.executeQuery();
			
			rs1.next();
			
			String class1 = rs1.getString(1);
			
			System.out.println(class1);
			
			st = con.prepareStatement("select subject,time,location,tID from examtimetable where sclass = ? order by subject");
			
			st.setString(1, class1);
			
			ResultSet rs2 = st.executeQuery();
			
			
			while(rs2.next()) {
				
				ExamTimeTable t1 = new ExamTimeTable();
				t1.setSubject(rs2.getString(1));
				t1.setTime(rs2.getString(2));
				t1.setLocation(rs2.getString(3));
				t1.setTeaID(rs2.getString(4));
				
				table.add(t1);
				
				
			}
			
			return table;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return table;
	}
}


