package hashara;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminEnterTimeTable")



public class  AdminEnterTimeTable extends HttpServlet  {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

		String nperiod = (String) request.getParameter("nperiod");
		String nsubject = (String) request.getParameter("nsubject");
		String nclass = (String) request.getParameter("nclass");
		String ntid = (String) request.getParameter("ntid");
		

		String save = (String) request.getParameter("save");
		

		AdminEnterTimeTableLogic student = new AdminEnterTimeTableLogic();

		String result = student.adminEnterTimeTable(nperiod, nsubject, nclass, ntid, save);



		if (result.equals("saved")) {

			response.sendRedirect("AdminEnterTimeTableSavedSuccesful.jsp");

		} else {
			
			response.sendRedirect("AdminEnterTimeTableSavedUnsuccessful.jsp");

		}

	}

}

	
	


