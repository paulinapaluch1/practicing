package org.examples.singleresponsibility.with;

public class ReportGenerator {
	public String generateReport(Report report) {
		return "Report generated: " + report.getContent();
	}
}