package learndesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
	
	//This serves as key for getting flyweight instance
	public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}
	
	private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

	public static ErrorMessageFactory getInstance() {
		return FACTORY;
	}

	private Map<ErrorType, SystemErrorMessage> errorMap = new HashMap<>();

	private ErrorMessageFactory() {
		errorMap.put(ErrorType.GenericSystemError,
				new SystemErrorMessage("A generic error of type $errorCode occurred. Please refer to:\n",
						"http://helpforprogrammers.com/error="));
		errorMap.put(ErrorType.PageNotFoundError,
				new SystemErrorMessage("A page not found error of type $errorCode occurred. Please refer to:\n",
						"http://helpforprogrammers.com/error="));
		errorMap.put(ErrorType.ServerError,
				new SystemErrorMessage("A server error of type $errorCode occurred. Please refer to:\n",
						"http://helpforprogrammers.com/error="));
	}

	public SystemErrorMessage getError(ErrorType type) {
		return errorMap.get(type);
	}
	
	public UserBannedErrorMessage getUserBannedMessage(String caseId) {
		return new UserBannedErrorMessage(caseId);
	}
}
