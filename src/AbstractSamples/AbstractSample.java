package AbstractSamples;

public abstract class AbstractSample {
	
	int id ;
	public String Name;
	
	public abstract void displayName();
	
	public void addTwoNumber(int a, int b) {

		System.out.print("Sum is : " + (a+b) );
	}

}


