package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import model.StudentDaoImpl;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet({ "/AddStudent", "/add" })
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//String id=request.getParameter("id");
		String firstname=request.getParameter("firstName");
		String lastname=request.getParameter("lastName");
		
	  Student student=new Student();
	  if(request.getParameter("id")!=null)
			student.setId(request.getParameter("id"));
	  student.setFirstName(firstname);
	  student.setLastName(lastname);
	  
	  StudentDaoImpl sdao=new StudentDaoImpl();
	  try {
			if(student.getId()==null)
			{
				sdao.create(student);
				System.out.println("Adding new employee");
			}
			else
			{
				sdao.update(student);
				System.out.println("Updating employee id "+student.getId());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  response.getWriter().print("Added student to db");
	  response.sendRedirect("displayStudents.jsp");
	}

}
