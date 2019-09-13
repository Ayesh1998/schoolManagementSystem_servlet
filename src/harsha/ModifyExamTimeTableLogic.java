package harsha;

import java.sql.*;

public class ModifyExamTimeTableLogic {

	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String deleteRecord(String sclass,String subject) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			

			PreparedStatement st = con.prepareStatement("delete from examtimetable where sclass=? and subject=? ");

				st.setString(1, sclass);
				st.setString(2, subject);
				

				int i = st.executeUpdate();

				if (i == 1) {
					return "deleted";
				} else {
					return "notDeleted";
				}

			
		
	}

	
			
	 
	 public String timeUpdate(String sclass,String subject,String time ) throws Exception {
		
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			
			PreparedStatement st = con.prepareStatement("update examtimetable set time=? where sclass=? and subject=?");

				st.setString(1,time);
				st.setString(2, sclass);
				st.setString(3, subject);
				

				int i = st.executeUpdate();

				if (i == 1) {
					return "tUpdated";
				} else {
					return "tNotUpdated";
				}

	 }	
			
		
		
				
		public String locationUpdate(String sclass,String subject,String location) throws Exception {
		
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			

			PreparedStatement st = con.prepareStatement("update examtimetable set location=? where sclass=? and subject=? ");
                 
				st.setString(1, location);
				st.setString(2, sclass);
				st.setString(3, subject);
			

				int i = st.executeUpdate();

				if (i == 1) {
					return "lUpdated";
				} else {
					return "lNotUpdated";
				}

			
		
		


		

	}

}

