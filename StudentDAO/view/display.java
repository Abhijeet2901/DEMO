package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import model.StudentDaoImpl;

/**
 * Servlet implementation class display
 */
@WebServlet({ "/display", "/Display" })
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		StudentDaoImpl edao=new StudentDaoImpl();
//		here i write code to display all employees in browser
		try {
			List<Student> student = edao.read();
		out.print("<table border=\"1\">\r\n" + 
				"		<thead>\r\n" + 
				"			<th>ID</th>\r\n" + 
				"			<th>First Name</th>\r\n" + 
				"			<th>Last Name</th>\r\n" + 

				"		</thead>\r\n");
		
		for(Student s:student)
			out.print("<form action=editEmployee>		<tr>\r\n" + 
					"			<td><input type=hidden name=id value="+s.getId()+" />"+s.getId()+"</td>\r\n" + 
					"			<td>"+s.getFirstName()+"</td>\r\n" + 
					"			<td>"+s.getLastName()+"</td>\r\n" +
					"			<td><input type=submit value=Select /></td>"+
					"		</tr></form>\r\n");
					
		out.print("	</table>");			
	} catch (SQLException s) {
		// TODO Auto-generated catch block
		s.printStackTrace();
	}
	}
	
			
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
