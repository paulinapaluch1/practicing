package org.examples.openclosed.without;


public class AreaCalculator {
	public double calculateArea(Object shape) {
		if (shape instanceof Rectangle rectangle) {
			return rectangle.getWidth() * rectangle.getHeight();
		} else if (shape instanceof Circle circle) {
			return Math.PI * Math.pow(circle.getRadius(), 2);
		}
		throw new RuntimeException("Shape not supported");
	}
}
