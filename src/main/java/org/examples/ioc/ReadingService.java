package org.examples.ioc;

public class ReadingService {
	
	private BazaDanych bazaDanych;
	
	//after
	public ReadingService(BazaDanych bazaDanych) {
		this.bazaDanych = bazaDanych;
	}
	
	//before
	public ReadingService(Object[] properties) {
		this.bazaDanych = new BazaDanych(properties);
	}

	public void read() {
		bazaDanych.doSomeDbOperation();
	}


}
