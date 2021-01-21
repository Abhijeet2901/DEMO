package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentDaoImpl implements StudentDAO {

	private String autoGenerateId() throws SQLException
	{
		//finding the max number portion from the existing ids
		//select max(substr(id,2,4)) from employee;
		Connection con=MyConnection.getConnection();
		ResultSet rs = con.createStatement().executeQuery("select max(substr(id,2,4)) from student");
		String id="";
		if(rs.next())
		{
			int max = rs.getInt(1);
			max++;
			if(max<10)
						
				id="E00"+max;			//single digit
			else if(max<100)
				id="E0"+max;			//2 digit number
			else
				id="E"+max;				//3 digit number
		}
		return id;
	}
	@Override
	public int create(Student student) throws SQLException
	
	{
		Connection con = MyConnection.getConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		st.setString(1,autoGenerateId());
		st.setString(2, student.getFirstName());
		st.setString(3, student.getLastName());
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	
	@Override
	public List<Student> read() throws SQLException
	{
		Connection con=MyConnection.getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM student");
		ResultSet rs = st.executeQuery();
		
		List<Student> studentList=new ArrayList<Student>();
		while(rs.next())
		{
			Student student=new Student(rs.getString(1), rs.getString(2), rs.getString(3));
			studentList.add(student);
		}
		con.close();
		return studentList;
	}
	
	@Override
	public Student read(String id) throws SQLException
	{
		Connection con=MyConnection.getConnection();
		PreparedStatement st = con.prepareStatement("SELECT * FROM student WHERE id=?");
		st.setString(1, id);
		ResultSet rs = st.executeQuery();
		Student student=null;
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		if(rs.next())
			student=new Student(rs.getString(1), rs.getString(2), rs.getString(3));
		con.close();
		return student;
	}
	public int update(Student student) throws SQLException
	{
		Connection con = MyConnection.getConnection();
		PreparedStatement st = con.prepareStatement("UPDATE Student SET firstname=?, lastname=? WHERE id=?");
		
		st.setString(1, student.getFirstName());
		st.setString(2, student.getLastName());
		//date should be in oracle format
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
//		String dob=sdf.format(employee.getDateOfBirth());
//		st.setString(3, dob);	//for date, convert date into string in db specific format
		st.setString(3, student.getId());
		int no=st.executeUpdate();
		con.close();
		return no;
	}
	
	public int delete(String id) throws SQLException
	{
		Connection con = MyConnection.getConnection();
		PreparedStatement st = con.prepareStatement("DELETE FROM Student WHERE id=?");
		
		st.setString(1, id);
		int no=st.executeUpdate();
		con.close();
		return no;
	}
}
