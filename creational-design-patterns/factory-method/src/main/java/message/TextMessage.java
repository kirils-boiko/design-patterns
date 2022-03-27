package message;

/*
A concrete implementation of the product class
 */
public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}
	
}
