package practising.examples.singleresponsibility;


import org.examples.singleresponsibility.with.Report;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportTest {
	@Test
	void shouldGetContentFromReport() {
		String content = "This is an important report";
		Report report = new Report(content);
		assertEquals(content, report.getContent());
	}
}