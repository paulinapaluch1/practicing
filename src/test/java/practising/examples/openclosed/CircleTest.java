package practising.examples.openclosed;

import org.examples.openclosed.with.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
	@Test
	void shouldCalculateCircleArea() {
		double radius = 7;
		Circle circle = new Circle(radius);
		double expectedArea = Math.PI * Math.pow(radius, 2);
		assertEquals(expectedArea, circle.calculateArea());
	}
}