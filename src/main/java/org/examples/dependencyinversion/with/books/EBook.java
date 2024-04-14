package org.examples.dependencyinversion.with.books;

import org.examples.dependencyinversion.with.readingpersons.Book;

public class EBook implements Book {
	@Override
	public void read() {
		System.out.println("Reading electronic book...");
	}

	@Override
	public void open() {
		System.out.println("Opening kindle... screen lighting...");
	}

	@Override
	public void close() {
		System.out.println("Closing kindle...screen shutdown ");
	}
}
