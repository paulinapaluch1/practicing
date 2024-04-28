package org.examples.inversionofcontrol;

public interface Database {

	default void doSomeDbOperation() {
		System.out.println("Reading...");
	}
}
