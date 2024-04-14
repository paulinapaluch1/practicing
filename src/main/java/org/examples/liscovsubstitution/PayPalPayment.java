package org.examples.liscovsubstitution;

public class PayPalPayment extends  Payment{
	@Override
	public void processPayment(double amount) {
		if (validatePayment()) {
			throw new IllegalStateException("Nieprawidłowe dane konta PayPal.");
		}
		System.out.println("Przetwarzanie płatności PayPal na kwotę: " + amount);
	}

	@Override
	public boolean validatePayment() {
		return false;
	}
}
