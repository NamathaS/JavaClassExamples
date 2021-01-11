package interfaceSamples;

public interface TestInterface extends secondInterface,SampleInterface {
	
	public void displaySomething();
	
	public default void displayMessage() {
		System.out.println("This is a message from me ");
	}
			

	
}
