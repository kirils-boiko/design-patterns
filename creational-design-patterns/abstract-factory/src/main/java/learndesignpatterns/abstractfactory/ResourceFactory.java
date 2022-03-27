package learndesignpatterns.abstractfactory;


//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

    public Instance createInstance(Instance.Capacity capacity);

    public Storage createStorage(int inMib);

}
