package org.examples.interfacesegregation2.with;

public class InterfaceSegregationExampleMain {

	public static void main(String[] args) {
		Animal animal = AnimalsStaticFactory.bornDog();
	//	animal.init(); //compilation error - lack of access
		//((Dog)animal).init(); //compilation error - dog is a private class not visible in this context
		System.out.println(animal.bark());
	}


}
