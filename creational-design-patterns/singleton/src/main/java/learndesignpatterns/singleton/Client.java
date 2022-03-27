package learndesignpatterns.singleton;

public class Client {

	public static void main(String[] args) {

		EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
		System.out.println(eagerRegistry1 == eagerRegistry2);

		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazySingleton1 == lazySingleton2);

		LazyRegistryIODH lazyRegistryIODH1 = LazyRegistryIODH.getInstance();
		LazyRegistryIODH lazyRegistryIODH2 = LazyRegistryIODH.getInstance();
		System.out.println(lazyRegistryIODH1 == lazyRegistryIODH2);




	}

}
