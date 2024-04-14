package org.examples.dependencyinversion.with;

import org.examples.dependencyinversion.with.books.PaperBook;
import org.examples.dependencyinversion.with.readingpersons.Book;
import org.examples.dependencyinversion.with.readingpersons.ReadingPerson;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		Book cleanCode = new PaperBook();
		ReadingPerson paulina = new ReadingPerson(cleanCode);
		paulina.readBook();
		System.out.println("----------------------------------------");
			/* reading person polega na abstrakcji, zamiast na konkretnej implementacji książki

			 */
	}
}