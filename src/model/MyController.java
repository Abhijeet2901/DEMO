package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class MyController {
//	@GET
//	public String hello()
//	{
//		return "HELLO WORLD!!";
//	}
	UserRegDAOImpl sdao=new UserRegDAOImpl();
	
	@GET
	@Path("/")
	@Produces("text/json")
	public List<UserReg> getStudents() throws SQLException
	{
		
		List<UserReg> userList=new ArrayList<UserReg>();
		userList=sdao.read();
		return userList;
	}
	
	@DELETE
	@Path("/Delete")
	@Consumes("text/plain")
	public void Delete(String id) throws SQLException
	{
		sdao.delete(id);
	}
	
	
	@POST
	@Path("/Add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(UserReg user) throws SQLException
	{
		sdao.create(user);
	}
	
	@PUT
	@Path("/Update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateStudent(UserReg user) throws SQLException
	{
		sdao.update(user);
	}
	
	@GET
	@Path("/{id}")
	@Produces("text/json")
	public UserReg findByid(@PathParam("id") String id) throws SQLException
	{
		return sdao.read(id);
	}
	
	
	
	

	
	

}
