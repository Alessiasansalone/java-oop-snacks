package org.lessons.java.snacks;

public class Studente {
	
	String name;
	String surname;
	int age;
	
	Studente(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	private String setCompleteName() {
		String completeName = name + " " + surname + ", " + age + " anni";
		return completeName;
	}
	
	public String getCompleteName() {
		return setCompleteName();
	}
}
