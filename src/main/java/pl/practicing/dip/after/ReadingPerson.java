package pl.practicing.dip.after;

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
