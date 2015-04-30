package controller;
import java.util.Collections;

//isa
import java.util.ArrayList;

import model.Lecturer;
import model.Person;
import model.Professor;
import model.Student;

public class Main {

	public static void main(String[] argv) {

		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Lecturer("Smedinga", "Rein", "Broadway 32", "0612345678", "2345"));
		persons.add(new Student("Styles", "Oliver", "George St 5", "0612345678", "1231231"));
		persons.add(new Student("Horan", "Harry", "Regent St 11", "0612345678", "4564564"));
		persons.add(new Lecturer("Doe", "John", "Main St 153", "0612345678", "6789"));
		persons.add(new Student("Payne", "Jack", "Seven Bridges Way 3", "0612345678", "7897897"));
		persons.add(new Lecturer("White", "Sow", "Fairy Ln 1", "0612345678", "0123"));
		persons.add(new Student("Malik", "Charlie", "York Rd 27", "0612345678", "1011121"));
		persons.add(new Professor("Spaniol", "Fernando", "Moesstraat", "0612345678", "0123", "Dr."));
		persons.add(new Professor("Possebon", "Isadora", "Winshortediep", "0612345678", "1011121", "Dr."));
		
		for (Person person : persons) {
			System.out.println(person.toString());
		}
		
		/*System.out.println("\nafter sorting:\n");

		Collections.sort(persons);

		for (Person person : persons) {
			System.out.println(person);
		}*/
	}

}
