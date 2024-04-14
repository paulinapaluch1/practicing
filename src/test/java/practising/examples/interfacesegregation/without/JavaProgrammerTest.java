package practising.examples.interfacesegregation.without;


import org.examples.interfacesegregation.without.CompanyITWorker;
import org.examples.interfacesegregation.without.JavaProgrammer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class JavaProgrammerTest {
	@Test
	void testWriteCode() {
		CompanyITWorker javaProgrammer = mock(JavaProgrammer.class);
		javaProgrammer.writeCode();
		verify(javaProgrammer).writeCode();
	}

	@Test
	void testEat() {
		CompanyITWorker javaProgrammer = mock(JavaProgrammer.class);
		javaProgrammer.eat();
		verify(javaProgrammer).eat();
	}

	@Test
	void testDrinkCoffee() {
		CompanyITWorker javaProgrammer = mock(JavaProgrammer.class);
		javaProgrammer.drinkCoffee();
		verify(javaProgrammer).drinkCoffee();
	}

	@Test
	void testGoToMeeting() {
		CompanyITWorker javaProgrammer = mock(JavaProgrammer.class);
		javaProgrammer.goToMeeting();
		verify(javaProgrammer).goToMeeting();
	}
}