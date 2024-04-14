package org.examples.interfacesegregation.with;


public class TeamLeader implements MeetingAttendee, CoffeeLover, Eater {
	@Override
	public void goToMeeting() {
		System.out.println("Leader is taking part in a meeting");
	}

	@Override
	public void drinkCoffee() {
		System.out.println("Leader is drinking some coffee");
	}

	@Override
	public void eat() {
		System.out.println("Leader is eating lunch");
	}
}