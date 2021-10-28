package fa.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fa.training.dao.StudentDAO;
import fa.training.entities.Student;
import fa.training.utils.DBConnection;
import fa.training.utils.SQLCommand;

public class StudentDAOImpl implements StudentDAO {

	private Connection con;
	private PreparedStatement pre;
	private ResultSet rs;

	@Override
	public List<Student> getAll() throws SQLException {
		List<Student> students = new ArrayList<Student>();
		Student student = null;
		try {
			con = DBConnection.getInstance().getConnection();
			pre = con.prepareStatement(SQLCommand.GET_ALL_STUDENTS);
			rs = pre.executeQuery();
			while (rs.next()) {
				student = new Student();
				student.setStudentID(rs.getInt("StudentID"));
				student.setStudentName(rs.getString("Name"));
				student.setDateOfBirth(rs.getString("dateOfBirth"));
				student.setScore(rs.getDouble("Score"));
				student.setAddress(rs.getString("Address"));
				student.setPhone(rs.getString("Phone"));
				students.add(student);
			}

		} finally {
			if (rs != null) {
				rs.close();
			}

			if (pre != null) {
				pre.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return students;
	}

	@Override
	public Student getById(int studentID) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertStudent(Student student) throws SQLException {
		int row = 0;
		try {
			con = DBConnection.getInstance().getConnection();
			pre = con.prepareStatement(SQLCommand.INSERT_STUDENT);
			pre.setString(1, student.getStudentName());
			pre.setString(2, student.getDateOfBirth());
			pre.setDouble(3, student.getScore());
			pre.setString(4, student.getAddress());
			pre.setString(5, student.getPhone());
			row = pre.executeUpdate();
		} finally {
			if (rs != null) {
				rs.close();
			}

			if (pre != null) {
				pre.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return row > 0;
	}

	@Override
	public boolean updateStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int studentID) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
