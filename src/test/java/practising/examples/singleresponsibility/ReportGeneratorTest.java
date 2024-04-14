package practising.examples.singleresponsibility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.examples.singleresponsibility.with.Report;
import org.examples.singleresponsibility.with.ReportGenerator;
import org.junit.jupiter.api.Test;

class ReportGeneratorTest {
	@Test
	void shouldGenerateReport() {
		String content = "This is a report";
		Report report = new Report(content);
		ReportGenerator generator = new ReportGenerator();

		String expectedOutput = "Report generated: " + content;
		String actualOutput = generator.generateReport(report);

		assertEquals(expectedOutput, actualOutput);
	}
}