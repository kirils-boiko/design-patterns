package learndesignpatterns.abstractfactory.gcp;


import learndesignpatterns.abstractfactory.Instance;
import learndesignpatterns.abstractfactory.ResourceFactory;
import learndesignpatterns.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int inMib) {
        return new GoogleCloudStorage(inMib);
    }
}
