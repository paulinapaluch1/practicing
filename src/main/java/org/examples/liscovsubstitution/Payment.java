package org.examples.liscovsubstitution;

public abstract class Payment {
	public abstract void processPayment(double amount);
	public abstract boolean validatePayment();
}