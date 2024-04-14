package practising.examples.openclosed;


import org.examples.openclosed.with.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
	@Test
	void shouldCalculateRectangleArea() {
		double width = 5;
		double height = 10;
		Rectangle rectangle = new Rectangle(width, height);
		double expectedArea = width * height;
		assertEquals(expectedArea, rectangle.calculateArea());
	}
}