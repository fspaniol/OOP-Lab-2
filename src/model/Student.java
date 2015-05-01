package model;
//isa
public class Student extends Person {

	private String studentNumber;

	public Student(String name, String firstName, String address, String phonenumber,
			String studentNumber) {
		super(name, firstName, address, phonenumber);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentnummer(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String toString()
	{
		return this.concat(" ",this.getFirstName(),this.getName(), this.studentNumber,this.getPhoneNumber());
	}
}
