package learndesignpatterns.composite;

//Leaf node in composite pattern
public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        // not applicable to leaf node
        throw new UnsupportedOperationException("Leaf node does not support addFile() operation");
    }

    @Override
    public File[] getFiles() {
        // not applicable to leaf node
        throw new UnsupportedOperationException("Leaf node does not support getFiles() operation");
    }

    @Override
    public boolean removeFile(File file) {
        // not applicable to leaf node
        throw new UnsupportedOperationException("Leaf node does not support removeFile() operation");
    }
}
