package interfaceSamples;

public class CoreClass implements SampleInterface,secondInterface {

	public static void main(String args[]) {
		//SampleInterface obj = new SampleInterface();
		CoreClass obj = new CoreClass();
		obj.doSothing(7);
		obj.doSomeOtherThing();
	}

	public void doSothing(int a) {
	
		System.out.println("doSomething");
	}


	public void doSomeOtherThing() {
		
		System.out.println("Do some other thing ");
	}
}
