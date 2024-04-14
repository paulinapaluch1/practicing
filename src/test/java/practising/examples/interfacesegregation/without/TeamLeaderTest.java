package practising.examples.interfacesegregation.without;

import org.examples.interfacesegregation.without.CompanyITWorker;
import org.examples.interfacesegregation.without.TeamLeader;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TeamLeaderTest {
	@Test
	void testWriteCode() {
		CompanyITWorker teamLeader = mock(TeamLeader.class);
		teamLeader.writeCode();
		verify(teamLeader).writeCode();
	}

	@Test
	void testEat() {
		CompanyITWorker teamLeader = mock(TeamLeader.class);
		teamLeader.eat();
		verify(teamLeader).eat();
	}

	@Test
	void testDrinkCoffee() {
		CompanyITWorker teamLeader = mock(TeamLeader.class);
		teamLeader.drinkCoffee();
		verify(teamLeader).drinkCoffee();
	}

	@Test
	void testGoToMeeting() {
		CompanyITWorker teamLeader = mock(TeamLeader.class);
		teamLeader.goToMeeting();
		verify(teamLeader).goToMeeting();
	}
}