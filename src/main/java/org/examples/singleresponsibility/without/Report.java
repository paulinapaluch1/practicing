package org.examples.singleresponsibility.without;

public class Report {
	private String content;

	public Report(String content) {
		this.content = content;
	}

	public void generateReport() {
		System.out.println("Report generated: " + content);
	}

	public void printReport() {
		System.out.println("Printing report: " + content);
	}
}