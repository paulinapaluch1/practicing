package org.examples.interfacesegregation2.with;

public class AnimalsStaticFactory {
	public static Animal bornDog() {
		return new Dog();
	}

	private final static class Dog implements Animal {
		@Override
		public String bark() {
			return"Hou hou";
		}

		public void init() {

		}


	}

}