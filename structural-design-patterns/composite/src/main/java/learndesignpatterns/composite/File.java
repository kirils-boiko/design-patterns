package learndesignpatterns.composite;

//The component base class for composite pattern
// defines operations applicable both leaf & composite.
// The children management operations are added to the base component class,
//	thus, throw exceptions when implementing operations in leaf
public abstract class File {

	private String name;

	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	public abstract void addFile(File file);

	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}
