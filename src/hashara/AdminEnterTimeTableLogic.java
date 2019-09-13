package hashara;

import java.sql.*;



public class AdminEnterTimeTableLogic {
	

	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String adminEnterTimeTable(String nperiod, String nsubject, String nclass, String ntid,  String save) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			if (save.equals("save")) {

				PreparedStatement st = con.prepareStatement("insert into timetable values ( ?, ?, ?, ?) ");

				st.setString(1, nperiod);
				st.setString(2, nsubject);
				st.setString(3, nclass);
				st.setString(4, ntid);
				

				int i = st.executeUpdate();
				
				if (i == 1) {
					return "saved";
				} else {
					return "notSave";
				}
					
			}
//				} else if (delete.equals("delete")) {
//				
//				PreparedStatement st = con
//						.prepareStatement("delete  from student where schoolID = ? ");
//
//				st.setString(1, id);
//				
//
//				int i = st.executeUpdate();
//
//				if (i == 1) {
//					return "deleted";
//				} else {
//					return "notdelete";
//				}
//				
//			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return "Check above columns again";

	}

}



