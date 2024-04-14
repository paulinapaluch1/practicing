package org.examples.liscovsubstitution;

public class PaymentProcessor {
	//podmienię Payment i zawsze będzie walidacja oraz przetworzenie płatności
	public void process(Payment payment, double amount) {
		payment.processPayment(amount);
	}
}
