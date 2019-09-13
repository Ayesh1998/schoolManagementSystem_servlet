package hashara;

import java.io.IOException;


import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModifyTimeTableServlet")

public class ModifyTimeTableServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String sclass1 = (String)request.getParameter("class1");
		String speriod1 = (String) request.getParameter("period1");
		
		String sclass2 = (String)request.getParameter("class2");
		String speriod2 = (String) request.getParameter("period2");
		String subject = (String) request.getParameter("subject");
		
		String sclass3 = (String)request.getParameter("class3");
		String speriod3 = (String) request.getParameter("period3");
		String tid = (String) request.getParameter("tid");
		
		
		String button = (String) request.getParameter("button");
		
		
        ModifyTimeTableLogic mtimetable = new ModifyTimeTableLogic();
		
		String result = "";
		if(button.equals("Delete_Record")){
			try {
				result = mtimetable.deleteRecord(sclass1,speriod1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("error is:"+e);
			}
			
			PrintWriter out = response.getWriter();

			out.println(result);

			if (result.equals("deleted")) {

				response.sendRedirect("TdeleteRecordSuccessful.jsp");

			} 
			else if (result.equals("notDeleted")){
			
				response.sendRedirect("TdeleteRecordUnsuccessful.jsp");

			}
			
			
		if(button.equals("Update_Subject")){
				try {
					result = mtimetable.subjectUpdate(sclass2,speriod2,subject);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("error is:"+e);
				}
				
				PrintWriter out1 = response.getWriter();

				out1.println(result);
				

				if (result.equals("sUpdated")) {

				response.sendRedirect("subjectUpdateSuccessful.jsp");

				} 
				else if(result.equals("sNotUpdated")) {
				
				response.sendRedirect("subjectUpdateUnsuccessful.jsp");

				}
			}
			
			
		if(button.equals("Update_Tid")){
				try {
					result = mtimetable.tidUpdate(sclass3,speriod3,tid);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("error is:"+e);
				}
				
				PrintWriter out1 = response.getWriter();

				out1.println(result);

				if (result.equals("TidUpdated")) {

					response.sendRedirect("TeacherIdUpdateSuccessful.jsp");

				} 
				else if (result.equals("TidNotUpdated")) {
				
					response.sendRedirect("TeacherIdUpdateUnsuccessful.jsp");

				}
			}

			

		}

	}
		
	
	
}



