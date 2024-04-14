package org.examples.dependencyinversion.without;

public class EBook {
	public void read() {
		System.out.println("Reading electronic book...");
	}

	public void open() {
		System.out.println("Opening kindle... screen lighting...");
	}

	public void close() {
		System.out.println("Closing kindle...screen shutdown ");
	}
}
