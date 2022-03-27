package learndesignpatterns.abstractfactory;

import learndesignpatterns.abstractfactory.aws.AwsResourceFactory;
import learndesignpatterns.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);

        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance awsInstance = aws.createServer(Instance.Capacity.large, 1000);
        awsInstance.start();
        awsInstance.stop();

        System.out.println();

        Client google = new Client(new GoogleResourceFactory());
        Instance googleInstance = google.createServer(Instance.Capacity.small, 500);
        googleInstance.start();
        googleInstance.stop();
    }

}
