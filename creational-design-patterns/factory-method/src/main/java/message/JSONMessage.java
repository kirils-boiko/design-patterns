package message;

/*
A concrete implementation of the product class
 */
public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
