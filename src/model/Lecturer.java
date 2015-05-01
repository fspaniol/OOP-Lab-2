package model;

//isa
public class Lecturer extends Person{

	private String employeeNumber;

	public Lecturer(String name, String firstName, String address, String phonenumber, String employeeNumber) {
		super(name, firstName, address, phonenumber);
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String number) {
		employeeNumber = number;
	}
	
	public String toString()
	{
		return this.concat(" ",this.getFirstName(),this.getName(),this.employeeNumber,this.getPhoneNumber());
		
	}
}
