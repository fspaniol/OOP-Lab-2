package model;

//isa
public abstract class Person {

	private String name;
	private String firstName;
	private String address;
	private String phonenumber;

	public Person(String name, String firstName, String address, String phonenumber) {
		this.name = name;
		this.firstName = firstName;
		this.address = address;
		this.phonenumber = phonenumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber()
	{
		return phonenumber;
	}
	
	public void setPhoneNumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public int CompareTo(Person other)
	{
		String aux1 = this.getName();
		String aux2 = other.getName();
		int aux3 = aux1.compareTo(aux2);
		
		return aux3;		
	}
	
	public String concat(String... strings)
	{
		String aux = strings[1];
		
		for (int i = 2; i < strings.length; i++)
		{
			aux += strings[0] + strings[i];
		}
		
		return aux;
	}
}
