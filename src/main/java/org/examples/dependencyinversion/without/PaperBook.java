package org.examples.dependencyinversion.without;

public class PaperBook{
	public void read() {
		System.out.println("Reading paper book...");
	}

	public void open() {
		System.out.println("Opening paper book... Smells good...");
	}

	public void close() {
		System.out.println("Closing paper book...");
	}
}
