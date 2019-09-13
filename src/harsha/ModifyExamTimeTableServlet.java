package harsha;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ModifyExamTimeTableServlet")
public class ModifyExamTimeTableServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sclass1 = (String)request.getParameter("class1");
		String subject1 = (String) request.getParameter("sub1");
		
		String sclass2 = (String)request.getParameter("class2");
		String subject2 = (String) request.getParameter("sub2");
		String time = (String) request.getParameter("time");
		
		String sclass3 = (String)request.getParameter("class3");
		String subject3 = (String) request.getParameter("sub3");
		String location = (String) request.getParameter("loc");
		
		
		String button = (String) request.getParameter("button");
		
		
        ModifyExamTimeTableLogic mtimetable = new ModifyExamTimeTableLogic();
		
		String result = "";
		if(button.equals("Delete_Record")){
			try {
				result = mtimetable.deleteRecord(sclass1,subject1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("error is:"+e);
			}
			
			PrintWriter out = response.getWriter();

			out.println(result);

			if (result.equals("deleted")) {

				response.sendRedirect("deleteRecordSuccessful.jsp");

			} 
			else if (result.equals("notDeleted")){
			
				response.sendRedirect("deleteRecordUnsuccessful.jsp");

			}
		
		}
		if(button.equals("Update_Time")){
			try {
				result = mtimetable.timeUpdate(sclass2,subject2,time);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("error is:"+e);
			}
			
			PrintWriter out = response.getWriter();

			out.println(result);

			if (result.equals("tUpdated")) {

			response.sendRedirect("timeUpdateSuccessful.jsp");

			} 
			else if(result.equals("tNotUpdated")) {
			
			response.sendRedirect("timeUpdateUnsuccessful.jsp");

			}
		}
		if(button.equals("Update_Location")){
			try {
				result = mtimetable.locationUpdate(sclass3,subject3,location);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("error is:"+e);
			}
			
			PrintWriter out = response.getWriter();

			out.println(result);

			if (result.equals("lUpdated")) {

				response.sendRedirect("locationUpdateSuccessful.jsp");

			} 
			else if (result.equals("lNotUpdated")) {
			
				response.sendRedirect("locationUpdateUnsuccessful.jsp");

			}
		}

		

	}

}
