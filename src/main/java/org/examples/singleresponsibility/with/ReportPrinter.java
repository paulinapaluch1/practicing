package org.examples.singleresponsibility.with;

public class ReportPrinter {
	public void printReport(Report report) {
		System.out.println("Printing report: " + report.getContent());
	}
}