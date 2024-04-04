package pl.practicing.dip.after;

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
