package org.examples.dip.without;

public class ReadingPerson {

	private PaperBook book;
	private EBook eBook;

	public ReadingPerson(PaperBook book) {
		this.book = book;
	}

	public ReadingPerson(EBook book) {
		this.eBook = book;
	}

	public void readBook(){
		book.open();
		book.read();
		book.close();
	}

	public void readEBook(){
		book.open();
		book.read();
		book.close();
	}
}
