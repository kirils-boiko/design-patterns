package learndesignpatterns.abstractfactory.aws;


import learndesignpatterns.abstractfactory.Instance;
import learndesignpatterns.abstractfactory.ResourceFactory;
import learndesignpatterns.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int inMib) {
        return new S3Storage(inMib);
    }
}
