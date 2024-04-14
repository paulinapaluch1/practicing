package org.examples.interfacesegregation.with;

public class JavaProgrammer implements Programmer, CoffeeLover, Eater {
	@Override
	public void writeCode() {
		System.out.println("Programmer is bugfixing");
	}

	@Override
	public void drinkCoffee() {
		System.out.println("Programmer is drinking a lot of coffee");
	}

	@Override
	public void eat() {
		System.out.println("Programmer is eating lunch");
	}

}