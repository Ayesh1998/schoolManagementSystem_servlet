package hashara;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TeacherShowProfileServlet")
public class TeacherShowProfileServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		TeacherShowProfileLogic timetables = new TeacherShowProfileLogic();
		
		HttpSession session = request.getSession();
		
		String id1 =session.getAttribute("userID").toString();
				
		request.setAttribute("table", timetables.giveTeacherProfile(id1));
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("teacherShowProfile.jsp");
		dispatcher.forward(request, response);
		
	}

}
