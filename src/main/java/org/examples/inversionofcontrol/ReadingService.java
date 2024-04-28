package org.examples.inversionofcontrol;

public class ReadingService {
	
	private DatabaseSQL bazaDanych;

	public ReadingService(DatabaseSQL bazaDanych) {
		this.bazaDanych = bazaDanych;
	}

	public ReadingService(Object[] properties) {
		this.bazaDanych = new DatabaseSQL(properties);
	}

	public void read() {
		bazaDanych.doSomeDbOperation();
	}


}
