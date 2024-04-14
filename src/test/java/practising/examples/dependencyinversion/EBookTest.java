package practising.examples.dependencyinversion;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.examples.dependencyinversion.with.books.EBook;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EBookTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeEach
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	void shouldPrintOpeningKidleWhenEbookOpening() {
		EBook eBook = new EBook();
		eBook.open();
		assertTrue(outContent.toString().contains("Opening kindle... screen lighting..."));
	}

	@Test
	void shouldPrintReadingWhenEbookIsRead() {
		EBook eBook = new EBook();
		eBook.read();
		assertTrue(outContent.toString().contains("Reading electronic book..."));
	}

	@Test
	void shouldPrintClosingWhenEbookClosing() {
		EBook eBook = new EBook();
		eBook.close();
		assertTrue(outContent.toString().contains("Closing kindle...screen shutdown"));
	}
}