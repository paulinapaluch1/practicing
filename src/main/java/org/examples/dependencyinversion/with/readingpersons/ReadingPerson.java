package org.examples.dependencyinversion.with.readingpersons;

public class ReadingPerson {

	private Book book;

	public ReadingPerson(Book book) {
		this.book = book;
	}

	public void readBook(){
		book.open();
		book.read();
		book.close();
	}
}
