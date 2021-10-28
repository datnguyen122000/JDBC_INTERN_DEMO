package fa.training.utils;


public class SQLCommand {
	public final static String GET_ALL_STUDENTS = "SELECT * FROM Student";
	
	public final static String INSERT_STUDENT = "INSERT INTO Student(Name, DateOfBirth, Score, Address, Phone) VALUES (?, ?, ? ,?, ?)";
	
	

}
