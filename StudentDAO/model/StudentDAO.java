package model;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {

	int create(Student student) throws SQLException;

	List<Student> read() throws SQLException;

	Student read(String id) throws SQLException;

}