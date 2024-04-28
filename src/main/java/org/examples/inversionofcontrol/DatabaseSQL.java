package org.examples.inversionofcontrol;

public class DatabaseSQL implements Database{
	
	private final Object[] properties;

	public DatabaseSQL(Object[] properties) {
		this.properties = properties;
	}

	public void doSomeDbOperation() {
		System.out.println("Reading sql... select * from.....");
	}
}
