package org.examples.interfacesegregation.without;

public class TeamLeader implements CompanyITWorker{
	@Override
	public void writeCode() {
		//???
	}

	@Override
	public void eat() {
		System.out.println("Leader is eating lunch.");

	}

	@Override
	public void drinkCoffee() {
		System.out.println("Programmer is drinking some coffee");

	}

	@Override
	public void goToMeeting() {
		System.out.println("Programmer is taking part in meeting.");

	}
}
