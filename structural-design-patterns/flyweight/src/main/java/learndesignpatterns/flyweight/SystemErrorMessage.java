package learndesignpatterns.flyweight;

//A concrete Flyweight. Instance is shared
public final class SystemErrorMessage implements ErrorMessage {

    // intrinsic state
    private final String messageTemplate; // some error message $errorCode
    private final String helpUrlBase; // http://somedomain.com/help?error=

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        // code is the extrinsic state
        return messageTemplate.replace("$errorCode",code) + helpUrlBase+code;
    }
}
