package org.examples.openclosed.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rectangle implements GeometricFigure {
	private double width;
	private double height;

	@Override
	public double calculateArea() {
		return width * height;
	}
}
