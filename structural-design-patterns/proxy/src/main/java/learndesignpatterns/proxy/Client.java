package learndesignpatterns.proxy;

import learndesignpatterns.proxy.customfx.Point2D;

public class Client {

	public static void main(String[] args) {

		Image img = ImageFactory.getImage("my-favorite-file.java");

		img.setLocation(new Point2D(10,10));
		System.out.println("Image location: " + img.getLocation());

		System.out.println("Rendering image now");
		img.render();

	}

}
