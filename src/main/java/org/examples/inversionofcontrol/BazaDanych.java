package org.examples.inversionofcontrol;

public class BazaDanych {
	
	private Object[] properties;

	public BazaDanych(Object[] properties) {
		this.properties = properties;
	}

	public void doSomeDbOperation() {
		System.out.println("Reading...");
	}
}
