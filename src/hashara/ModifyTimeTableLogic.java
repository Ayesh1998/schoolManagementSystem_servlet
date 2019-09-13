package hashara;


import java.sql.*;

public class ModifyTimeTableLogic {
	
	
	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String deleteRecord(String sclass,String speriod) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			

			PreparedStatement st = con.prepareStatement("delete from timetable where class=? and period=? ");

				st.setString(1, sclass);
				st.setString(2, speriod);
				

				int i = st.executeUpdate();
				
				if (i == 1) {
					return "deleted";
				} else {
					return "notDeleted";
				}

			
		
	}

	
			
	 
	 public String subjectUpdate(String sclass,String speriod,String subject ) throws Exception {
		
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			
			PreparedStatement st = con.prepareStatement("update timetable set subject=? where period=? and class=? ");

				st.setString(1,subject);
				st.setString(2, speriod);
				st.setString(3, sclass);
				

				int i = st.executeUpdate();
				
				if (i == 1) {
					return "sUpdated";
				} else {
					return "sNotUpdated";
				}

	 }	
			
		
		
				
		public String tidUpdate(String sclass,String speriod,String tid) throws Exception {
		
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			

			PreparedStatement st = con.prepareStatement("update timetable set tid=?  where period=? and class=? ");
                 
				st.setString(1, tid);
				st.setString(2, speriod);
				st.setString(3, sclass);
			

				int i = st.executeUpdate();
				
				if (i == 1) {
					return "TidUpdated";
				} else {
					return "TidNotUpdated";
				}

			
		
		


		

	}

}






