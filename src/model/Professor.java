package model;
//isa

public class Professor extends Lecturer {
	private String title;

	public Professor(String name, String firstName, String address, String phonenumber,
			String employeeNumber, String title) {
		super(name, firstName, address, phonenumber, employeeNumber);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString()
	{
		return this.concat(" ",this.getTitle(),this.getFirstName(),this.getName(),this.getEmployeeNumber(),this.getPhoneNumber());
	}
}
