package org.examples.dip.with.books;

import org.examples.dip.with.readingpersons.Book;

public class PaperBook implements Book {
	@Override
	public void read() {
		System.out.println("Reading paper book...");
	}

	@Override
	public void open() {
		System.out.println("Opening paper book... Smells good...");
	}

	@Override
	public void close() {
		System.out.println("Closing paper book...");
	}
}
