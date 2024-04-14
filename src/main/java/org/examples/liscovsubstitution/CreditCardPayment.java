package org.examples.liscovsubstitution;

public class CreditCardPayment extends Payment {

	@Override
	public void processPayment(double amount) {
		if (validatePayment()) {
			throw new IllegalStateException("Nieprawidłowe dane karty kredytowej.");
		}
		System.out.println("Przetwarzanie płatności kartą kredytową na kwotę: " + amount);
	}


	@Override
	public boolean validatePayment() {
		return false;
	}
}
