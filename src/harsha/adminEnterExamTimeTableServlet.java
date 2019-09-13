package harsha;



	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	@WebServlet("/AdminEnterExamTimeTableServlet")
	public class adminEnterExamTimeTableServlet extends HttpServlet {

		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String sclass = (String) request.getParameter("class1");
			String subject = (String) request.getParameter("sub");
			String time = (String) request.getParameter("time");
			String location = (String) request.getParameter("loc");
			String teaId = (String) request.getParameter("tid");
			
			String enter = (String) request.getParameter("enter");
		

			AdminEnterExamTimeTableLogic etimetable = new AdminEnterExamTimeTableLogic ();

			String result = etimetable.adminEnterExamTimeTable(sclass,subject,time,location,teaId,enter);

			PrintWriter out = response.getWriter();

			out.println(result);

			if (result.equals("enterd")) {

				response.sendRedirect("adminEnterExamTimeTableSuccessful.jsp");

			} else if (result.equals("notEntered")) {
				
				response.sendRedirect("adminEnterExamTimeTableUnsuccessful.jsp");

			}

		}

	

}
