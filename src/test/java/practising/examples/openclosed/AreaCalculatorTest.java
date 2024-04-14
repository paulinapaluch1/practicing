package practising.examples.openclosed;


import org.examples.openclosed.with.AreaCalculator;
import org.examples.openclosed.with.Circle;
import org.examples.openclosed.with.GeometricFigure;
import org.examples.openclosed.with.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaCalculatorTest {
	@Test
	void testCalculateAreaForRectangle() {
		GeometricFigure rectangle = new Rectangle(5, 10);
		AreaCalculator calculator = new AreaCalculator();
		double expectedArea = 5 * 10;
		assertEquals(expectedArea, calculator.calculateArea(rectangle));
	}

	@Test
	void testCalculateAreaForCircle() {
		GeometricFigure circle = new Circle(7);
		AreaCalculator calculator = new AreaCalculator();
		double expectedArea = Math.PI * Math.pow(7, 2);
		assertEquals(expectedArea, calculator.calculateArea(circle));
	}
}