package practising.examples.dependencyinversion;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.examples.dependencyinversion.with.books.PaperBook;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PaperBookTest {
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
	void shouldPrintOpeningKidleWhenPaperBookOpening() {
		PaperBook PaperBook = new PaperBook();
		PaperBook.open();
		assertTrue(outContent.toString().contains("Opening paper book... Smells good..."));
	}

	@Test
	void shouldPrintReadingWhenPaperBookIsRead() {
		PaperBook PaperBook = new PaperBook();
		PaperBook.read();
		assertTrue(outContent.toString().contains("Reading paper book..."));
	}

	@Test
	void shouldPrintClosingWhenPaperBookClosing() {
		PaperBook PaperBook = new PaperBook();
		PaperBook.close();
		assertTrue(outContent.toString().contains("Closing paper book..."));
	}
}