package harsha;


import java.sql.*;

public class AdminEnterExamTimeTableLogic {

	String url = "jdbc:mysql://localhost:3306/schoolmanagement?autoReconnect=true&useSSL=false";
	String name = "root";
	String pass = "ayesh1998";

	public String adminEnterExamTimeTable(String sclass,String subject,String time,String location,String teaId,String enter) {

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, name, pass);

			if (enter.equals("Enter")) {

				PreparedStatement st = con.prepareStatement("insert into examtimetable values ( ?, ?, ?, ?, ?) ");

				st.setString(1, sclass);
				st.setString(2, subject);
				st.setString(3, time);
				st.setString(4, location);
				st.setString(5, teaId);

				int i = st.executeUpdate();

				if (i == 1) {
					return "enterd";
				} else {
					return "notEntered";
				}

			}


		} catch (Exception e) {

			System.out.println("error is:"+ e );
		}

		return "Try again";

	}

}

