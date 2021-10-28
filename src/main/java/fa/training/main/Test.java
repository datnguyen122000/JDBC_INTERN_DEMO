package fa.training.main;

import java.sql.SQLException;

import fa.training.dao.StudentDAO;
import fa.training.dao.impl.StudentDAOImpl;
import fa.training.entities.Student;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		StudentDAO studentDAO = new StudentDAOImpl();
		
		studentDAO.getAll().forEach(System.out::println);
		
		Student student = new Student("KhoeHD1", "1-6-1997", 9, "PT", "0388446430");
		
		System.out.println(studentDAO.insertStudent(student));
	}

}
