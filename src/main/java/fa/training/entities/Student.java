package fa.training.entities;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int studentID;
	private String studentName;
	private String dateOfBirth;
	private double score;
	private String address;
	private String phone;

	public Student() {
		super();
	}

	public Student(int studentID, String studentName, String dateOfBirth, double score, String address, String phone) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.score = score;
		this.address = address;
		this.phone = phone;
	}

	public Student(String studentName, String dateOfBirth, double score, String address, String phone) {
		super();
		this.studentName = studentName;
		this.dateOfBirth = dateOfBirth;
		this.score = score;
		this.address = address;
		this.phone = phone;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth
				+ ", score=" + score + ", address=" + address + ", phone=" + phone + "]";
	}

}
