package model;

import java.util.Comparator;

//isa
public abstract class Person implements Comparable<Person>{

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
		
	public String concat(String... strings)
	{
		String aux = strings[1];
		
		for (int i = 2; i < strings.length; i++)
		{
			aux += strings[0] + strings[i];
		}
		
		return aux;
	}
	
	// Returns 1 if the person should go after the other, -1 if before, and 0 if they should be at the same spot.
	public int compareTo (Person other)
	{
		if (this.name.compareTo(other.getName()) > 0)
		{
			return 1;
		}
		else if (this.name.compareTo(other.getName()) < 0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}	
	
	public static class FirstNameComparator implements Comparator<Person>
	{
		public int compare (Person person1, Person person2)
		{
			if (person1.getFirstName().compareTo(person2.getFirstName()) > 0)
			{
				return 1;
			}
			else if (person1.getFirstName().compareTo(person2.getFirstName()) < 0)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}
}
