package practising.examples.singleresponsibility;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.examples.singleresponsibility.with.Report;
import org.examples.singleresponsibility.with.ReportPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportPrinterTest {
	@Test
	void shouldPrintReportWithExpectedOutput() {
		String content = "This is a report";
		Report report = new Report(content);
		ReportPrinter printer = new ReportPrinter();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		printer.printReport(report);
		System.setOut(System.out);

		String expectedOutput = "Printing report: " + content + System.lineSeparator();
		assertEquals(expectedOutput, outContent.toString());
	}
}