package learndesignpatterns.flyweight;

import java.time.Duration;

//Unshared concrete flyweight.
public class UserBannedErrorMessage implements ErrorMessage {
	//All state is defined here
	private final String caseId;
	
	private final String remarks;
	
	private final Duration banDuration;
	
	private final String msg;
	
	public UserBannedErrorMessage(String caseId) {
		//Load case info from DB.
		this.caseId = caseId;
		remarks = "You violated terms of use.";
		banDuration = Duration.ofDays(2);
		StringBuilder sb = new StringBuilder();
		sb.append("You are BANNED. Sorry. \nMore information:\n")
				.append(caseId +"\n")
				.append(remarks+"\n")
				.append("Banned for: " +banDuration.toHours() + " Hours");
		msg = sb.toString();
	}
	//We ignore the extrinsic state argument
	@Override
	public String getText(String code) {
		return msg;
	}

	public String getCaseNo() {
		return caseId;
	}
	
}
