package org.lessons.java.snacks;

public class TestStudente {
	
	public static void main(String[] args) {
	
	Studente stud1 = new Studente("Alessia", "Sansalone", 27);
	Studente stud2 = new Studente("Jessica", "Sansalone", 31);
	Studente stud3 = new Studente("Vincenzo", "Sansalone", 65);
	
	System.out.println(stud1.getCompleteName());
	System.out.println(stud2.getCompleteName());
	System.out.println(stud3.getCompleteName());
	}

}
	
