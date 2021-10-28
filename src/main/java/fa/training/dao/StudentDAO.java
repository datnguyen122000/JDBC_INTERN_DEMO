package fa.training.dao;

import java.sql.SQLException;
import java.util.List;

import fa.training.entities.Student;

public interface StudentDAO {
	List<Student> getAll() throws SQLException; 
	
	Student getById(int studentID) throws SQLException;
	
	boolean insertStudent(Student student) throws SQLException;
	
	boolean updateStudent(Student student) throws SQLException;
	
	boolean deleteStudent(int studentID) throws SQLException;
}
