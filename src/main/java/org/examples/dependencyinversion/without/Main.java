package org.examples.dependencyinversion.without;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		PaperBook cleanArchitecture = new PaperBook();
		ReadingPerson paulina = new ReadingPerson(cleanArchitecture);
		paulina.readBook();
		System.out.println("----------------------------------------");


		EBook effectiveJava = new EBook();
		ReadingPerson mentee = new ReadingPerson(effectiveJava);
		mentee.readEBook();


	}
}