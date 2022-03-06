package com.company.liskov_1;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());

		useRectangle(rectangle);
		
		// useRectangle(square); // cannot be called, otherwise the Liskov principle is violated



	}

	private static void useRectangle(Rectangle rectangle) {
		// If Square extends Rectangle, the Liskov principle is violated since setWidth(30)
		//	would set both height and width of the square to 30 and assert will throw.
		// In order for Liskov principle to be valid, break the extension and use Shape interface instead
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}
}
