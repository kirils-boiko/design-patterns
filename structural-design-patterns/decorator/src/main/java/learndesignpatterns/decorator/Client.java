package learndesignpatterns.decorator;

public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message htmlDecorator = new HtmlEncodedMessage(m);
		System.out.println(htmlDecorator.getContent());

		Message base64Decorator = new Base64EncodedMessage(htmlDecorator); // recursive composition
		System.out.println(base64Decorator.getContent());

	}
}
