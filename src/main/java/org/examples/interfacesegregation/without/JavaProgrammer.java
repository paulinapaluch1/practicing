package org.examples.interfacesegregation.without;

public class JavaProgrammer implements CompanyITWorker{
	@Override
	public void writeCode() {
		System.out.println("Programmer is bugfixing");

	}

	@Override
	public void eat() {
		System.out.println("Programmer is eating lunch.");

	}

	@Override
	public void drinkCoffee() {
		System.out.println("Programmer is drinking a lot of coffee");

	}

	@Override
	public void goToMeeting() {
		System.out.println("Programmer is wasting time.");

	}
}
